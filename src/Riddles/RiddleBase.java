package Riddles;

import java.util.List;
import java.util.ListIterator;

public abstract class RiddleBase implements Riddle
{
    private List<String> data;
    protected OnLog onLog;
    protected OnResult onResult;

    public RiddleBase(List<String> data)
    {
        this.data = data;
    }

    protected ListIterator<String> data()
    {
        return data.listIterator();
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
