package rocks.zipcode.io.quiz4.fundamentals;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        ArrayList<String> strings = new ArrayList<>();
        String [] combs = StringEvaluator.getAllSubstrings(string);
        for (int i = 0; i <combs.length ; i++) {
            if(isPalindrome(combs[i])){
                strings.add(combs[i]);
            }
        }
        return strings.toArray(new String[strings.size()]);
    }

    public static Boolean isPalindrome(String string) {

        return (reverseString(string).equals(string));
    }

    public static String reverseString(String string) {
        String reverse = "";
        for (int i=string.length()-1;i>=0;i--) {
            reverse +=string.charAt(i);

        }
        return reverse;
    }
}
