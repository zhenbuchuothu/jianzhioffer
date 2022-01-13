package com.company;

public class 矩形覆盖 {

    public static void main(String[] args) {
        System.out.println(RectCover(5));
    }
    public static int RectCover(int target) {

        int f1 = 1;
        int f2 = 2;
        int t =0;
        if(target==0){
            return 0;
        }
        if(target==1){
            return 1;
        }
        if (target==2){
            return 2;
        }
        for (int i=2;i<target;i++){
            t = f2;
            f2 = t+f1;
            f1 = t;
        }
        return f2;
    }
}
