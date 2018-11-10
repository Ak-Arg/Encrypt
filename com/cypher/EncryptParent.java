package com.cypher;

import java.util.Scanner;

public class Caesar
{

    private static String plainText = "";
    private static String cypherText = "";
    protected static Int Key = 0;

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter plaintext please: ");
        plainText = s.nextLine();
        getkey()
        Encrypt();
        System.out.println("cyphertext is: ");
        System.out.println(cypherText);
    }
    public static void getkey()
    {
        System.out.println("Enter a number key");
        Key = s.nextline();
    }
    private static void Encrypt()
    {
        for (int i=0; i<plainText.length(); i++)
        {
            char currentLetter = plainText.charAt(i);
            // simple example that does a Caesar shift of 2 with no
            // checking for falling off the alphabet
            char newLetter = (char)(currentLetter + Key);
            cypherText += newLetter;
        }
    }
    private static void Decrypt()
    {
        for (int i=0; i<plainText.length(); i++)
        {
            char currentLetter = plainText.charAt(i);
            // simple example that does a Caesar shift of 2 with no
            // checking for falling off the alphabet
            char newLetter = (char)(currentLetter - Key);
            cypherText += newLetter;
        }
    }


}
