package Riddles;

import java.io.IOException;
import java.util.List;
import java.util.ListIterator;

public abstract class RiddleBase implements Riddle
{
    private List<String> data = null;

    public RiddleBase(List<String> data)
    {
        this.data = data;
    }

    protected ListIterator<String> data() throws IOException
    {
        return data.listIterator();
    }

}
