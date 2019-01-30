import Riddles.Riddles;

public class Builder
{

    private Riddles riddles = new Riddles();

    public Riddles registerRiddles()
    {

        riddles.put(1, 1, day1.Part1.class, "./res/data_day1.txt");
        riddles.put(1, 2, day1.Part2.class, "data_day1.txt");
        riddles.put(2, 1, day2.Part1.class, "data_day2.txt");
        return riddles;
    }
}
