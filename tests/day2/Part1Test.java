package day2;

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
                {new ArrayList<>(Arrays.asList("aabbb")), "1"},
                {new ArrayList<>(Arrays.asList("aabbb", "aabbb")), "4"},
                {new ArrayList<>(Arrays.asList("abc", "abc", "abc")), "0"},
                {new ArrayList<>(Arrays.asList("abcabca", "acbcbcba")), "4"},
                {new ArrayList<>(Arrays.asList("abcdef", "bababc", "abbcde", "abcccd", "aabcdd", "abcdee","ababab")), "12"}
        });
    }

    @Test
    public void solveTest()
    {
        riddle = new Part1(input);
        riddle.setOnLog(text ->
        {
        });
        AtomicReference<String> actual = new AtomicReference<>();
        riddle.setOnResult(actual::set);
        riddle.solve();

        Assert.assertEquals(expected, actual.toString());
    }
}