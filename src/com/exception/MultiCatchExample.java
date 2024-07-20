package com.exception;
import java.io.FileReader;
import java.io.IOException;

public class MultiCatchExample
{
    public static void main(String[] args)
    {
        try 
        {
            processFile("example.txt");
        } 
        catch (IOException | IllegalArgumentException e)
        {
            System.out.println("An exception occurred: " + e.getMessage());
        }
    }

    public static void processFile(String fileName) throws IOException, IllegalArgumentException {
        if (fileName == null || fileName.isEmpty()) 
        {
            throw new IllegalArgumentException("Filename cannot be null or empty.");
        }
        FileReader reader = new FileReader(fileName);
        // Process file
        reader.close();
    }
}
