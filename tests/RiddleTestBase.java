import Riddles.Riddle;
import org.junit.Assert;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class RiddleTestBase
{

    protected Riddle riddle;
    private List<String> input;
    private String expected;

    public RiddleTestBase(List<String> input, String expetced)
    {
        this.input = input;
        this.expected = expetced;
    }

    public void executeTest() throws IOException
    {
        riddle.setOnLog(text ->
        {
        });
        AtomicReference<String> actual = new AtomicReference<>();
        riddle.setOnResult(actual::set);
        riddle.solve();

        Assert.assertEquals(this.expected, actual.toString());
    }
}