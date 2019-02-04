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
public class Part1Test extends RiddleTestBase
{
    public Part1Test(List<String> input, String excepted)
    {
        super(input, excepted);
    }

    @Parameterized.Parameters
    public static Collection cases()
    {
        return Arrays.asList(new Object[][]{
                {new ArrayList<>(Arrays.asList("aabbb")), "1"},
                {new ArrayList<>(Arrays.asList("aabbb", "aabbb")), "4"},
                {new ArrayList<>(Arrays.asList("abc", "abc", "abc")), "0"},
                {new ArrayList<>(Arrays.asList("abcabca", "acbcbcba")), "4"},
                {new ArrayList<>(Arrays.asList("abcdef", "bababc", "abbcde", "abcccd", "aabcdd", "abcdee", "ababab")), "12"}
        });
    }

    @Test
    public void solveTest()
    {
        this.riddle = new Part1(input);
        this.executeTest();
    }
}