package Riddles;

import java.util.HashMap;

public class Riddles
{
    private HashMap<RiddleId, Riddle> riddles = new HashMap<>();

    public void put(int day, int part, Riddle riddle)
    {
        RiddleId id = new RiddleId(day, part);
        riddles.put(id, riddle);
    }

    public Riddle get(int day, int part)
    {
        RiddleId id = new RiddleId(day, part);
        Riddle riddle = riddles.get(id);
        return riddle;
    }
}
