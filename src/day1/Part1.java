package day1;

import Riddles.OnLog;
import Riddles.Riddle;
import Riddles.RiddleBase;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Part1 extends RiddleBase implements Riddle
{
    private OnLog onLog;

    public Part1(List<String> data)
    {
        super(data);
    }

    @Override
    public void solve() throws IOException
    {
        AtomicInteger frequency = new AtomicInteger();
        data().forEachRemaining(line -> {
            int delta = Integer.parseInt(line);
            frequency.addAndGet(delta);
        } );
        onLog.call("The answer to the riddle is:" + frequency);
    }
        @Override
        public void setOnLog (OnLog onlog)
        {
            this.onLog = onlog;
        }
    }
