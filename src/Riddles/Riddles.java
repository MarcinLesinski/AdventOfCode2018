package Riddles;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

public class Riddles
{
    private HashMap<RiddleId, RiddleBuildData> riddles = new HashMap<>();

    public void put(int day, int part, Class classOfRiddle, String dataFileName)
    {
        RiddleId id = new RiddleId(day, part);
        RiddleBuildData buildData = new RiddleBuildData();
        buildData.classOfRiddle = classOfRiddle;
        buildData.dataFile = Paths.get(dataFileName);
        riddles.put(id, buildData);
    }

    public Riddle get(int day, int part) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException
    {
        RiddleId id = new RiddleId(day, part);
        RiddleBuildData buildData = riddles.get(id);
        List<String> data = Files.readAllLines(buildData.dataFile);

        RiddleBase riddle = buildData.classOfRiddle.getConstructor(List.class).newInstance(data);
        return riddle;
    }
}
