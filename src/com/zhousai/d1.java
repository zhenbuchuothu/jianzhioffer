package com.zhousai;

import java.util.Scanner;

public class d1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a [] = new int[100];
        int b [] = new int[4];

        sc.nextLine();
        String ss = sc.nextLine();
        String[] s = ss.split(" ");
        for(int i = 0 ;i<s.length;i++){
            a[i] = Integer.parseInt(s[i]);
            if (a[i]>100)
                return;

            if(i<=3){
                if (i==0)
                    b[i]=a[i];
                else
                {
                    for(int l =0;b[i]!=b[i-1] ;){
                        i--;
                        if (i==0)
                            break;
                    }
                }
            }
        }
            for (int j=0;j<n;j++){
                for (int k=1;k<n-j;k++){
                    if(a[k-1]>a[k]){
                        int temp ;
                        temp = a[k-1];
                        a[k-1] = a[k];
                        a[k] = temp;

                    }
                }
            }
        System.out.println(a[n-1]-a[n-2]+" "+(a[n-1]-a[1])+" "+(a[n-2]-a[1])+" "+(a[n-2]-a[0]));

    }
}
