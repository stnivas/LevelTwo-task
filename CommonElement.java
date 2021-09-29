package com.levelTw0;

import java.util.Arrays;
import java.util.Scanner;

public class CommonElement{
    public void  findCommonElement(int[] number1,int[] number2,int[]number3){
      int count=0;
        for (int i = 0; i < number1.length; i++) {

            for (int j = 0; j < number2.length; j++) {
                if (number1[i] == number2[j]) {
                    count++;
                }
            }
                for (int k = 0; k < number3.length; k++) {
                    if(number1[i]==number3[k]){
                        count++;
                  }
                }
                if(count==2){
                    System.out.println(number1[i]);

                }
                count=0;

            }

        }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        CommonElement obj=new CommonElement();
        int[] number1=new int[6];
        for (int i = 0; i < number1.length; i++) {
            System.out.println("enter the number1");
            number1[i]=input.nextInt();

        }
        int[] number2=new int[5];
        for (int i = 0; i <number2.length; i++) {
            System.out.println("enter the number2");
            number2[i]=input.nextInt();

        }
        int[] number3=new int[8];
        for (int i = 0; i < number3.length; i++) {
            System.out.println("enter the number3");
            number3[i]=input.nextInt();
        }

      obj.findCommonElement(number1,number2,number3);

    }
}
