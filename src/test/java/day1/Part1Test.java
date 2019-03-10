package day1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import riddlesTestUtils.RiddleTestBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class Part1Test extends RiddleTestBase
{
    public Part1Test(List<String> input, String expetced)
    {
        super(input, expetced);
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
        this.executeTest();
    }
}