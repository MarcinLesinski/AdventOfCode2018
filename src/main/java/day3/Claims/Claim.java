package day3.Claims;

public class Claim
{
    public Integer id = 0;
    public Integer left = 0;
    public Integer top = 0;
    public Integer width = 0;
    public Integer height = 0;

    public Claim()
    {

    }

    public static Claim fromString(String rawDataLine)
    {
        Claim parsed = ClaimParser.parse(rawDataLine);
        return parsed;
    }
}
