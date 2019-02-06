package Riddles;

import java.util.List;
import java.util.ListIterator;

public abstract class RiddleBase implements Riddle
{
    protected List<String> rawData;
    protected OnLog onLog;
    protected OnResult onResult;

    public RiddleBase(List<String> rawData)
    {
        this.rawData = rawData;
    }

    protected ListIterator<String> dataIterator()
    {
        return rawData.listIterator();
    }

    @Override
    public void setOnLog(OnLog onlog)
    {
        this.onLog = onlog;
    }

    @Override
    public void setOnResult(OnResult onResult)
    {
        this.onResult = onResult;
    }

}
