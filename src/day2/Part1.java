package day2;

import Riddles.Riddle;
import Riddles.RiddleBase;

import java.util.List;

public class Part1 extends RiddleBase implements Riddle
{

    public Part1(List<String> data)
    {
        super(data);
    }

    @Override
    public void solve()
    {
        int doubleCount = 0;
        int tripleCount = 0;

        for (String line : data)
        {
            boolean doubleDetected = false;
            boolean tripleDetected = false;
            for (char consideredChar = 'a'; consideredChar <= 'z'; consideredChar++)
            {
                final char c = consideredChar;
                int consideredCharCount = (int) line.chars().filter(ch -> ch == c).count();
                switch (consideredCharCount)
                {
                    case 2:
                        doubleDetected = true;
                        break;
                    case 3:
                        tripleDetected = true;
                        break;
                }
            }
            if (doubleDetected)
                doubleCount++;
            if (tripleDetected)
                tripleCount++;
        }
        Integer result = doubleCount * tripleCount;
        onResult.onResult(result.toString());
    }
}
