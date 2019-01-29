package Riddles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public abstract class RiddleBase
{
    private final String dataFileName;
    private List<String> data = null;

    public RiddleBase(String dataFileName)
    {
        this.dataFileName = dataFileName;
    }

    protected ListIterator<String> data() throws IOException
    {
        if (data == null)
            this.readData();
        return data.listIterator();
    }

    private void readData() throws IOException
    {
        data = new ArrayList<>();
        Path dataPath = Paths.get(dataFileName);
        data = Files.readAllLines(dataPath);
    }
}
