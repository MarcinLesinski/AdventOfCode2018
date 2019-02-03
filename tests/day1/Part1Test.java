package day1;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@RunWith(Parameterized.class)
public class Part1Test
{

    private Part1 riddle;
    private List<String> input;
    private String expected;

    public Part1Test(List<String> input, String expetced)
    {
        this.input = input;
        this.expected = expetced;
    }

    @Parameterized.Parameters
    public static Collection cases()
    {
        return Arrays.asList(new Object[][]{
                {new ArrayList<>(Arrays.asList("+1", "+1", "+1")), "3"},
                {new ArrayList<>(Arrays.asList("+1", "+1", "-2")), "0"},
                {new ArrayList<>(Arrays.asList("-1", "-2", "-3")), "-6"}
        });
    }

    @Test
    public void solve()
    {
        riddle = new Part1(input);
        riddle.setOnLog(text ->
        {
        });
        AtomicReference<String> actual = new AtomicReference<>();
        riddle.setOnResult(actual::set);
        riddle.solve();

        Assert.assertEquals(this.expected, actual.toString());
    }
}