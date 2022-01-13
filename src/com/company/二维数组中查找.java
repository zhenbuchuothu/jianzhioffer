package com.company;

public class 二维数组中查找 {

    public static void main(String[] args) {
        int [ ][ ]  b={{1,2,3,4},{2,3,4,5},{3,4,5,6}};
        System.out.println(Find(4,b));
    }

    public static boolean Find(int target, int [][] array) {
        int row = array.length;
//        System.out.println("row:"+row);
        int col = array[0].length;
//        System.out.println("col:"+col);
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                if(array[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}
