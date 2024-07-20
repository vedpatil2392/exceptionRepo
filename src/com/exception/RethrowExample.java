package com.exception;
public class RethrowExample 
{
    public static void main(String[] args) 
    {
        try 
        {
            method1();
        } 
        catch (Exception e)
        {
            System.out.println("Caught exception: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void method1() throws Exception
    {
        try
        {
            method2();
        } 
        catch (Exception e)
        {
        	
            throw new Exception("An error occurred in method1", e);
        }
    }

    public static void method2() throws Exception
    {
        throw new Exception("Original exception from method2");
    }
}
