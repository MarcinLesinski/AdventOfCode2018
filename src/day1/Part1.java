package day1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Part1
{
    public void Part1()
    {

    }

    public void execute()
    {
        int frequency = 0;
        Path dataPath = Paths.get("data.txt");
        List<String> lines = null;
        try
        {
            lines = Files.readAllLines(dataPath);
        }
        catch (IOException e)
        {
            System.out.println("Can not read file: " + dataPath.toString());
//                System.in.read();

            return;
        }

        for (String line : lines)
        {
            int delta = Integer.parseInt(line);
            frequency += delta;
        }

        System.out.println("Final frequency: " + frequency);
//        System.in.read();
    }

}
