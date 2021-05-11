package palidrome;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ushantha
 */
import java.util.*;

public class IsPalindrome {
    
    String wordReverse;

    //check if the string is a palidrome
    protected boolean checkIfPalidrome(String wordEntered)
    {
    StringBuilder builder = new StringBuilder(wordEntered.length());
   // builder.reverse(wordEntered.length());
    for(int i = wordEntered.length()-1; i >= 0; i--)
    {
    //reverse the letters
    builder.append(wordEntered.charAt(i));
    wordReverse = builder.toString();

    }
    return wordEntered.equalsIgnoreCase(wordReverse);
    
    }
    
    }
    

