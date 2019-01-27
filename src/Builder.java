import Riddles.Riddles;

public class Builder
{

    private Riddles riddles = new Riddles();

    public Riddles registerRiddles()
    {

        riddles.put(1, 1, new day1.Part1());
        riddles.put(2, 1, new day2.Part1());
        return riddles;
    }
}
