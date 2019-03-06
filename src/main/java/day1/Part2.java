package day1;

import Riddles.Riddle;
import Riddles.RiddleBase;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Part2 extends RiddleBase implements Riddle
{
    public Part2(List<String> rawData)
    {
        super(rawData);
    }

    //TODO: It may take long time, use thread
    @Override
    public void solve()
    {
        Set<Integer> occured = new HashSet<>();
        Integer frequency = 0;
        occured.add(frequency);
        while (true)
        {
            for (int i = 0; i < rawData.size(); i++)
            {
                frequency += Integer.parseInt(rawData.get(i));
                if (occured.contains(frequency))
                {
                    onResult.onResult(frequency.toString());
                    return;
                } else
                {
                    occured.add(frequency);
                }
            }
        }
    }
}
