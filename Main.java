package palidrome;


import palidrome.IsPalindrome;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ushantha
 */
public class Main {
    public static void main (String[] args)
    {
    String word;
    IsPalindrome palindrome = new IsPalindrome ();
    Scanner scanner = new Scanner(System.in);
    System.out.println("please enter an word to check if it is palindrome");
    word = scanner.next();
    palindrome.checkIfPalidrome(word);
    
    if (palindrome.checkIfPalidrome(word)== true)
    {
        System.out.println("it is a palindrome");
    }
    else 
    {
      System.out.println("it is not a palindrome");  
    }
    }
    
}
