package day3.Claims;

class ClaimParser
{
    public static Claim parse(String rawDataLine)
    {
        Claim claim = new Claim();
        String[] parts = rawDataLine.split("#|@|,|:|x");
        claim.id = Integer.parseInt(parts[1].trim());
        claim.left = Integer.parseInt(parts[2].trim());
        claim.top = Integer.parseInt(parts[3].trim());
        claim.width = Integer.parseInt(parts[4].trim());
        claim.height = Integer.parseInt(parts[5].trim());
        return claim;
    }
}
