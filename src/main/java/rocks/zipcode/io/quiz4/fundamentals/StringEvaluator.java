package rocks.zipcode.io.quiz4.fundamentals;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {

        Set<String> stringSet = new HashSet<>();
        for (int i = 0; i <string.length() ; i++) {
            for (int j = i+1; j <string.length()+1 ; j++) {

                stringSet.add(string.substring(i,j));

            }
        }
            String[] array = stringSet.toArray(new String[stringSet.size()]);
        return array;
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        Set<String> stringSet = new HashSet<>();
        String [] array1 = getAllSubstrings(string1);
        String [] array2 = getAllSubstrings(string2);
        for (int i = 0; i <array1.length ; i++) {
            for (int j = 0; j <array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    stringSet.add(array1[i]);
                }
            }
        }
        String[] array = stringSet.toArray(new String[stringSet.size()]);
        return array;
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
       String[] strings= getCommonSubstrings(string1,string2);
        System.out.println(Arrays.asList(strings));
       int len = strings[0].length();
       int index = 0;
        for (int i = 1; i <strings.length ; i++) {

           if(len < strings[i].length()){
               System.out.println(strings[i].length());
               len = strings[i].length();
               index = i;
           }
       }
        return strings[index];
    }
}
