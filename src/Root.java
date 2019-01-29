import Riddles.*;

import java.util.Scanner;

public class Root implements OnLog
{
    public Root()
    {

    }

    public void run()
    {
        Riddles riddles = (new Builder()).registerRiddles();
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("There are my Advent of Code 2018 solutions");
        System.out.println("The riddle of which day you want solve?");
        int day = inputScanner.nextInt();
        System.out.println("Which part of riddle you want to solve?");
        int part = inputScanner.nextInt();


        Riddle riddle = null;
        try
        {
            riddle = riddles.get(day, part);
            riddle.setOnLog(this);
            riddle.solve();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void call(String text)
    {
        String lines[] = text.split("\\r?\\n");
        for (String line : lines)
            System.out.println(line);
    }
}
