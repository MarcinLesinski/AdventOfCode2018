package day1;

import Riddles.Riddle;
import Riddles.RiddleBase;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Part1 extends RiddleBase implements Riddle
{

    public Part1(List<String> data)
    {
        super(data);
    }

    @Override
    public void solve()
    {
        AtomicInteger frequency = new AtomicInteger();
        dataIterator().forEachRemaining(line ->
        {
            int delta = Integer.parseInt(line);
            frequency.addAndGet(delta);
        });
        onResult.onResult(frequency.toString());
    }

}
