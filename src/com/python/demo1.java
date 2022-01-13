package com.python;

import java.util.Random;



import java.util.ArrayList;

/**
 * @author zhenbuchuo
 * @create 2020/10/6 19:25
 */
public class demo1 {
    public static void main(String[] args) {
        //ArrayList<Integer> a = new ArrayList<>();
        int [] a = new int[]{};
        int i  =0; int b; int flag = 0;
        while (i<6){
            b =((int)((Math.random()*5)+9)*100+(int)(Math.random()*4)+1);

            for (int k = 0;k<a.length;k++){
                if (b == a[k]){
                    flag = 1;
                    break;
                }
            }
            if (flag == 0){
                a[i] = b;
                i++;
            }
            if (flag == 1){
                flag =0;
            }


        }
        System.out.println(a.toString());
    }
}
