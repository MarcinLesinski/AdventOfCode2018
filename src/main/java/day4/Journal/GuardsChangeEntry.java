package day4.Journal;

public class GuardsChangeEntry extends Entry
{
    private Integer guardID;
    private Integer minuteID;

    public GuardsChangeEntry(Integer guardId, Integer minuteID)
    {
        this.guardID = guardId;
        this.minuteID = minuteID;
    }
}
