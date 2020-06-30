import java.util.*;
public class palindrome { 
  static boolean isPalindrome(String str) 
    { 
        int i = 0, j = str.length() - 1; 
        while (i < j)
        { 
            if (str.charAt(i) != str.charAt(j)) 
                return false;
            i++; 
            j--; 
        } 
        return true; 
    } 
    public static void main(String[] args) 
    { 
        int i;
        List<String> listofstrings=new ArrayList<String>();  
        listofstrings.add("level");
        listofstrings.add("apple");
        listofstrings.add("dad");
        listofstrings.add("mom");
        for(i=0;i<4;i++)
        { 
        String str=listofstrings.get(i);
        if (isPalindrome(str)) 
            System.out.println(str); 
        } 
} }