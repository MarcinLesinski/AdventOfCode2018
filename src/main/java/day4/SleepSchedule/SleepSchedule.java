package day4.SleepSchedule;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class SleepSchedule
{
    private Map<Integer, List<Integer>>sleepTimeByGuard = new HashMap<>();
    private Map<Integer, List<Integer>> sleepingGuardsByMinute = new HashMap<>();

    public void enter(Integer guardId, Integer minuteId)
    {
        enterToMap(sleepTimeByGuard, guardId, minuteId);
        enterToMap(sleepingGuardsByMinute, minuteId, guardId);
    }

    private void enterToMap(Map<Integer, List<Integer>> map, Integer key, Integer value)
    {
        List<Integer> values;
        if (map.containsKey(key))
        {
             values = map.get(key);
             values.add(value);
        }
        else
        {
            values = new ArrayList<>();
            values.add(value);
            map.put(key, values);
        }
    }

    public List<Integer> analyzeGuards(BiConsumer<Integer, List<Integer>> analyzer)
    {
//        sleepTimeByGuard.forEach(analyzer.);
        return null;
    }

    public List<Integer> analyzeMinutes(BiConsumer<Integer, List<Integer>> analyzer)
    {
        return null;
    }
}
