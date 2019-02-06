package day3;

import Riddles.Riddle;
import Riddles.RiddleBase;

import java.util.ArrayList;
import java.util.List;

public class Part1 extends RiddleBase implements Riddle
{
    private List<Claim> claims = new ArrayList<>();
    public Part1(List<String> rawData)
    {
        super(rawData);
    }

    @Override
    public void solve()
    {
        claims = ClaimsLoader.load(rawData);


    }
}
