package Riddles;

class RiddleId
{
    private int day;
    private int part;

    public RiddleId(int day, int part)
    {
        this.day = day;
        this.part = part;
    }

    public int getDay()
    {
        return day;
    }

    public int getPart()
    {
        return part;
    }

    @Override
    public boolean equals(Object obj)
    {
        RiddleId other = (RiddleId) obj;
        return (other.getDay() == day) && (other.getPart() == part);
    }

    @Override
    public int hashCode()
    {
        int hash = 7;
        hash = 31 * hash * day;
        hash = 31 * hash * part;
        return hash;
    }
}
