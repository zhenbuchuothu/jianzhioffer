package com.company.shuzu;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class t1438 {

    public static void main(String[] args) {
        int [] a = new int[]{1,2,3,1,1,3,1};

        System.out.println(numIdenticalPairs(a));;
    }

    public static  int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer> map  = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            //第一个值 map为空
            if (map == null){
                map.put(nums[i],1);
            }
             int count = 0;
            for (Integer key : map.keySet()){
                if (nums[i] == key) {
                    map.put(key, map.get(key) + 1);
                    count = 1;
                }
            }
            if (count == 0 ){
                map.put(nums[i],1);
            }
        }
        int sum = 0;
//        Collection<Integer> vals = map.values();
//
//        for (Integer val : vals){
//            sum +=val*(val-1)/2;
//        }
        for (Integer key2 : map.keySet()){
            sum += map.get(key2)*(map.get(key2)-1)/2;
        }
        return sum;


    }
}
