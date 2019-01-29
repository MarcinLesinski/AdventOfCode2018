import Riddles.Riddles;

public class Builder
{

    private Riddles riddles = new Riddles();

    public Riddles registerRiddles()
    {

        riddles.put(1, 1, new day1.Part1("./res/data_day1.txt"));
        riddles.put(1, 2, new day1.Part2("data_day1.txt"));
        riddles.put(2, 1, new day2.Part1("data_day2.txt"));
        return riddles;
    }
}
