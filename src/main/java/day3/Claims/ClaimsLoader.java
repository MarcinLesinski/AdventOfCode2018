package day3.Claims;

import java.util.List;

public class ClaimsLoader
{
    public static LoadedClaimsInfo load(List<String> rawData)
    {
        LoadedClaimsInfo result = new LoadedClaimsInfo();
        result.claims = new Claims();
        for (String line : rawData)
        {
            Claim claim = Claim.fromString(line);
            result.claims.add(claim);
            result.height = Math.max(result.height, claim.top + claim.height);
            result.widht = Math.max(result.widht, claim.left + claim.width);
        }
        return result;
    }
}
