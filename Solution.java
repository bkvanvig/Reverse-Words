import java.util.*;
import java.io.*;
public class Solution {
    public String reverseWords(String s) {
        StringTokenizer str = new StringTokenizer(s, " ");
        
        String result = "";
        while (str.hasMoreTokens()){
            result = str.nextToken() + " " + result;
        }
        if (result.length() > 0)
            result = result.substring(0, result.length()-1);
        return result;
    }
}