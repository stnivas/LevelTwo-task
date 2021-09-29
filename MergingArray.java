package com.levelTw0;

import java.util.Arrays;
import java.util.Scanner;

public class MergingArray {
    public boolean reverse(String first, String second){
      char[] convert  =second.toCharArray();
        System.out.println(second);
        System.out.println(convert);
        StringBuilder ans=new StringBuilder(second.length());
        for (int i = convert.length-1; i>=0; i--) {
            ans.append(convert[i]);
        }
        String answer=ans.toString();
        System.out.println(answer);
        System.out.println(first);
        System.out.println(second.length());
        System.out.println(answer.equals(first));
        if(answer.equals(first)){
            return  true;
        }
        return  false;
    }
    public static void main(String[] args) {
        String first="ADX";
        String second="XDA";
        MergingArray obj=new MergingArray();
        boolean answer=obj.reverse(first,second);
        System.out.println(answer);

        }
    }

