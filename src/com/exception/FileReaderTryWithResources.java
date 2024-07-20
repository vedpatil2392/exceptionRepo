package com.exception;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class FileReaderTryWithResources
{
    public static void main(String[] args)
    {
        try (var reader = Files.newBufferedReader(Paths.get("example.txt")))
        {
            String line;
            while ((line = reader.readLine()) != null) 
            {
                System.out.println(line);
            }
        } 
        catch (IOException e) 
        {
            System.out.println("An IOException occurred: " + e.getMessage());
        }
    }
}

