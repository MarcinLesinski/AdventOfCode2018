package day3.Fabric;

import day3.Claims.Claim;
import day3.Claims.LoadedClaimsInfo;

public class FabricLoader
{
    public static int[][] load(LoadedClaimsInfo claimsInfo)
    {
        int[][] result = new int[claimsInfo.widht][claimsInfo.height];
        for(Claim claim: claimsInfo.claims)
        {
            for (int x = claim.left; x < claim.left + claim.width; x++)
            {
                for (int y = claim.top; y < claim.top + claim.height; y++)
                {
                    result[x][y]++;
                }
            }
        }

        return result;
    }

}
