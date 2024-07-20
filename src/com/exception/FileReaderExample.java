package com.exception;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class FileReaderExample {
    public static void main(String[] args)
    {
        BufferedReader reader = null;
        try 
        {
            reader = new BufferedReader(new FileReader("example.txt"));
            String line;
            while ((line = reader.readLine()) != null)
            {
                System.out.println(line);
            }
        } 
        catch (IOException e) 
        {
            System.out.println("An IOException occurred: " + e.getMessage());
        } finally 
        {
            // Close the resource
            if (reader != null)
            {
                try 
                {
                    reader.close();
                } 
                catch (IOException e) 
                {
                    System.out.println("Failed to close the reader: " + e.getMessage());
                }
            }
        }
    }
}
