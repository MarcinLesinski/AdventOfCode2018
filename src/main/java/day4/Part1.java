package day4;

import Riddles.Riddle;
import Riddles.RiddleBase;
import day4.Journal.Entry;
import day4.Journal.JournalBuilder;

import java.util.List;

public class Part1  extends RiddleBase implements Riddle
{
    public Part1(List<String> rawData)
    {
        super(rawData);
    }

    @Override
    public void solve()
    {
        List<Entry> journal = JournalBuilder.construct(this.rawData);
    }
}
