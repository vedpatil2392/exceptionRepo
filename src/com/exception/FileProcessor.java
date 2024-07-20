package com.exception;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class FileProcessingException extends Exception
{
    public FileProcessingException(String message, Throwable cause) 
    {
        super(message, cause);
    }
}

public class FileProcessor 
{
    public static void main(String[] args) 
    {
        try
        {
            processFile("example.txt");
        } 
        catch (FileProcessingException e) 
        {
            System.out.println("FileProcessingException: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void processFile(String fileName) throws FileProcessingException 
    {
        try
        {
            FileReader reader = new FileReader(fileName);
            // Process file
        } 
        catch (FileNotFoundException e) 
        {
            throw new FileProcessingException("File not found: " + fileName, e);
        }
    }
}

