package com.company;

public class demo1 {

    public static void main(String[] args) {
        String s = "0110000111";

        System.out.println(numSub(s));
    }
    public static  int numSub(String s) {

      int sum = 0;
      final int MODULO = 1000000007;
      String[] sarr =   s.split("0");

      for (int i=0;i<sarr.length;i++){

          if (sarr[i].length() == 1){
              sum +=1;
          }
          if (sarr[i].length() >1){
              sum += sarr[i].length()*(sarr[i].length() + 1)/2;
              sum %=MODULO;
          }
      }
      return sum;
    }
}
