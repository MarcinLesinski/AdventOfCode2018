package day3;

import java.util.ArrayList;
import java.util.List;

class ClaimsLoader
{
    public static List<Claim> load(List<String> rawData)
    {
        List<Claim> result = new ArrayList<>();
        for (String line : rawData)
        {
            Claim claim = Claim.fromString(line);
            result.add(claim);
        }
        return result;
    }
}
