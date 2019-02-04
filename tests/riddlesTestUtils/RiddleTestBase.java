package riddlesTestUtils;

import Riddles.Riddle;
import org.junit.Assert;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class RiddleTestBase
{
    protected Riddle riddle;
    protected List<String> input;
    private String expected;

    public RiddleTestBase(List<String> input, String expetced)
    {
        this.input = input;
        this.expected = expetced;
    }

    public void executeTest()
    {
        riddle.setOnLog(text ->
        {
        });
        AtomicReference<String> actual = new AtomicReference<>();
        riddle.setOnResult(actual::set);

        try
        {
            riddle.solve();
            Assert.assertEquals(this.expected, actual.toString());
        }
        catch (IOException e)
        {
            Assert.fail();
        }
    }
}