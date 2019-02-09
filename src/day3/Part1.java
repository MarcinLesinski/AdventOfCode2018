package day3;

import Riddles.Riddle;
import Riddles.RiddleBase;
import day3.Claims.ClaimsLoader;
import day3.Claims.LoadedClaimsInfo;
import day3.Fabric.FabricLoader;

import java.util.List;

public class Part1 extends RiddleBase implements Riddle
{
    public Part1(List<String> rawData)
    {
        super(rawData);
    }

    @Override
    public void solve()
    {
        LoadedClaimsInfo claimsInfo = ClaimsLoader.load(rawData);
        int[][] fabric = FabricLoader.load(claimsInfo);
        int overlaped = 0;
        for (int x = 0; x < fabric.length; x++)
        {
            for (int y = 0; y < fabric[x].length; y++)
            {
                if (fabric[x][y] >= 2)
                    overlaped++;
            }
        }
        onResult.onResult(Integer.toString(overlaped));
    }
}
