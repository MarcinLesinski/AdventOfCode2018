package day2;

import Riddles.Riddle;
import Riddles.RiddleBase;

import java.util.List;

public class Part2 extends RiddleBase implements Riddle
{
    public Part2(List<String> data)
    {
        super(data);
    }

    @Override
    public void solve()
    {
        for (String line1 : data)
        {
            for (String line2 : data)
            {
                if ( line1.equals(line2))
                    break;
                String l1 = line1;
                String l2 = line2;

                int differences = 0;
                for (int i = l1.length() - 1; i >= 0 ; i--)
                {
                    if (l1.charAt(i) != l2.charAt(i))
                    {
                        differences++;
                        StringBuilder sb = new StringBuilder(l1);
                        sb.deleteCharAt(i);
                        l1 = sb.toString();
                        sb = new StringBuilder(l2);
                        sb.deleteCharAt(i);
                        l2 = sb.toString();
                    }
                }

                if (differences == 1)
                {
                    onResult.onResult(l1);
                    return;
                }
            }
        }
    }
}
