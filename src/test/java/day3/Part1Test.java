package day3;

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
                {new ArrayList<>(Arrays.asList("#1 @ 1,3: 4x4", "#2 @ 3,1: 4x4", "#3 @ 5,5: 2x2")), "4"}});
    }

    @Test
    public void solve()
    {
        this.riddle = new Part1(this.input);
        this.executeTest();
    }
}