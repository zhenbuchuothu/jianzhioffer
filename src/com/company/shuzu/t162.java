package com.company.shuzu;
//寻找峰值 迭代法
public class t162 {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,1,3,5,6,4} ;

//        System.out.println(a.length);
        System.out.println(findPeakElement(a));
    }
    public static int findPeakElement(int[] nums) {

        int start  = 0; int end = nums.length -1 ;
//        System.out.println(end);
        while (start < end){

            int mid = (end + 1)>>1;
            if(nums[mid]<nums[mid+1])
                start = mid+1;
            else
                end = mid;

        }
        return start;
    }
}
