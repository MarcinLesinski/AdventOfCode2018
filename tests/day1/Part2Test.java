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
public class Part2Test extends RiddleTestBase
{
    public Part2Test(List<String> input, String expetced)
    {
        super(input, expetced);
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
        this.riddle = new Part2(this.input);
        this.executeTest();
    }
}