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
public class Part2Test
{
    private Part2 riddle;
    private List<String> input;
    private String expected;

    public Part2Test(List<String> input, String expetced)
    {
        this.input = input;
        this.expected = expetced;
    }

    @Parameterized.Parameters
    public static Collection cases()
    {
        return Arrays.asList(new Object[][]{
                {new ArrayList<>(Arrays.asList("+1", "-1")), "0"},
                {new ArrayList<>(Arrays.asList("+3", "+3", "+4", "-2", "-4")), "10"},
                {new ArrayList<>(Arrays.asList("-6", "+3", "+8", "+5", "-6")), "5"},
                {new ArrayList<>(Arrays.asList("+7", "+7", "-2", "-7", "-4")), "14"}
        });
    }


    @Test
    public void solve()
    {
        riddle = new Part2(input);
        riddle.setOnLog(text ->
        {
        });
        AtomicReference<String> actual = new AtomicReference<>();
        riddle.setOnResult(actual::set);
        riddle.solve();

        Assert.assertEquals(this.expected, actual.toString());
    }
}