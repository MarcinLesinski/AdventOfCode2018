package day2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import riddlesTestUtils.RiddleTestBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class Part2Test extends RiddleTestBase
{
    public Part2Test(List<String> input, String expected)
    {
        super(input, expected);
    }

    @Parameterized.Parameters
    public static Collection cases()
    {
        return Arrays.asList(new Object[][]{
                {new ArrayList<>(Arrays.asList("abcde", "fghij", "klmno", "pqrst", "fguij", "axcye", "wvxyz")), "fgij"}});
    }

    @Test
    public void solve()
    {
        this.riddle = new Part2(this.input);
        this.executeTest();
    }
}