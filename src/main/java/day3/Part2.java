package day3;

import Riddles.Riddle;
import Riddles.RiddleBase;
import day3.Claims.Claim;
import day3.Claims.ClaimsLoader;
import day3.Claims.LoadedClaimsInfo;
import day3.Fabric.FabricLoader;

import java.util.List;

public class Part2 extends RiddleBase implements Riddle
{

    public Part2(List<String> rawData)
    {
        super(rawData);
    }

    @Override
    public void solve()
    {
        LoadedClaimsInfo claimsInfo = ClaimsLoader.load(rawData);
        int[][] fabric = FabricLoader.load(claimsInfo);

        for (Claim claim: claimsInfo.claims)
        {
            Boolean overlaped = false;
            for(int x = claim.left; x < claim.left + claim.width; x++)
            {
                for (int y = claim.top; y < claim.top + claim.height; y++)
                {
                    if (fabric[x][y] > 1)
                    {
                        overlaped = true;
                        break;
                    }
                }
                if (overlaped) break;
            }
            if (! overlaped)
            {
                onResult.onResult(claim.id.toString());
                return;
            }
        }
    }
}
