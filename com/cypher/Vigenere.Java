package com.cypher;

import java.util.Scanner;


class Vigenere extends class Caesar
{

    protected static String Key = "";

    public static void Encrypt()
    {
        if key.length()  < plaintext.length()
        {
            for (int i=0; i<plainText.length(); i++)
            {
                key += key.charAt(i)
            }
        }
        for (int i=0; i<plainText.length(); i++)
        {
            char currentLetter = plainText.charAt(i);
            char currentKey = Key.charAt(i);
            char newLetter = (char)(currentLetter + currentKey);
            cypherText += newLetter;
        }
    }

    public static void Encrypt()
    {
        if key.length()  < plaintext.length()
        {
            for (int i=0; i<plainText.length(); i++)
            {
                key += key.charAt(i)
            }
        }
        for (int i=0; i<plainText.length(); i++)
        {
            char currentLetter = plainText.charAt(i);
            char currentKey = Key.charAt(i);
            char newLetter = (char)(currentLetter - currentKey);
            cypherText += newLetter;
        }
    }











}