package org.example.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        a=a.toUpperCase();
        b=b.toUpperCase();
        boolean ret = false;
        StringBuilder c= new StringBuilder(b);

        if(a.length()==b.length()){
            for(int i=0; i<a.length();i++){
                for(int j=0; j<c.length();j++){
                    if(a.charAt(i)==c.charAt(j)){
                        c.deleteCharAt(j);
                        if(i==a.length()-1 && c.length()==0){
                            ret=true;
                            break;
                        }
                        break;
                    }
                }
            }
        }return ret;
//        if (a.length() != b.length()) {
//            return false;
//        }
//        char[] a1 = a.toCharArray();
//        char[] a2 = b.toCharArray();
//        Arrays.sort(a1);
//        Arrays.sort(a2);
//        return Arrays.equals(a1, a2);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}