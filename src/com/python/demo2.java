package com.python;

import java.util.ArrayList;



import java.util.ArrayList;

/**
 * @author zhenbuchuo
 * @create 2020/10/6 19:25
 */
public class demo2 {
    public static void main(String[] args) {
        int [] a = new int[6];
        int i  =0; int b; int flag = 0;
        do {
            flag =0;
            while (i < 6) {
                a[i] = (((int) ((Math.random() * 5) + 9) * 100 + (int) (Math.random() * 4) + 1));
                i++;
            }
            for (int j = 0; j < 6; j++) {
                for (int k = j + 1; k < 6; k++) {
                    if (a[j] == a[k]) {
                        flag = 1;
                        break;
                    }

                }
            }
        }while (flag == 0);

        for (int x :a )
        System.out.println(x);
    }
}

