package day4.Journal;

import org.apache.commons.lang3.StringUtils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class JournalBuilder
{
    public static List<Entry> construct(List<String> lines)
    {
        List<Entry> result = new ArrayList<>();
        for (String line : lines)
        {
            Entry entry;
            Integer minuteID = parseMinuteID(line);
            if (line.contains("wakes up"))
            {
                entry = new AwakeEntry(minuteID);
            } else if (line.contains("falls asleep"))
            {
                entry = new FallASleepEntry(minuteID);
            } else
            {
                entry = buildGuardChange(minuteID, line);
            }

            result.add(entry);
        }

        return result;
    }

    private static Integer parseMinuteID(String line)
    {
        String dateTimeText = StringUtils.substringBetween(line, "[", "]");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(dateTimeText, formatter);

        return dateTime.getMinute() + dateTime.getHour() * 60;
    }

    private static Entry buildGuardChange(Integer minuteID, String line)
    {
        String[] parts = line.split("#| ");
        Integer guardID = Integer.valueOf(parts[4]);
        return new GuardsChangeEntry(guardID, minuteID);
    }

}
