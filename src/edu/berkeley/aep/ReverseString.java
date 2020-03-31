package edu.berkeley.aep;

public class ReverseString {
    public static String reverse(String s){
        String tem = s;
        int length = tem.length();
        if(length < 2){}
        else{
            tem = reverse(tem.substring(length/2, length)).concat(reverse(tem.substring(0, length/2)));
        }
        return tem;
    }
}
