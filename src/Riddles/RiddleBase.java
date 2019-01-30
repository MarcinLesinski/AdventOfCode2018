package Riddles;

import java.util.List;
import java.util.ListIterator;

public abstract class RiddleBase implements Riddle
{
    protected OnLog onLog;
    private List<String> data;

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

}
