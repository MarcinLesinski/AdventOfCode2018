package day1;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Part1Test
{

    Part1 riddle;


    @Test
    public void solve()
    {
        List<String> data = new ArrayList<>();
        data.add("+1");
        data.add("+1");
        data.add("+1");
        riddle = new Part1(data);
        riddle.setOnLog(text -> {});
        AtomicReference<String> actual = new AtomicReference<>();
        riddle.setOnResult(result -> actual.set(result));
        riddle.solve();

        String expected = "3";
        Assert.assertEquals(expected, actual.toString());
    }
}