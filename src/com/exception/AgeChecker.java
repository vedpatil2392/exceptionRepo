package com.exception;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class AgeChecker 
{
    public static void main(String[] args) 
    {
        try 
        {
            checkAge(16);
        }
        catch (InvalidAgeException e)
        {
            System.out.println("InvalidAgeException: " + e.getMessage());
        }
    }

    public static void checkAge(int age) throws InvalidAgeException 
    {
        if (age < 18) 
        {
            throw new InvalidAgeException("Age is less than 18. Access denied.");
        } 
        else 
        {
            System.out.println("Access granted.");
        }
    }
}
