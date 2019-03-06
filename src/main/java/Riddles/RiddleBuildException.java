package Riddles;

public class RiddleBuildException extends Exception
{
    public String reason;

    public RiddleBuildException(String reason)
    {
        this.reason = reason;
    }
}
