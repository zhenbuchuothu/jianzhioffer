package com.company.shuzu;
//摩尔投票算法  
public class t1 {
    public int majorityElement(int[] nums) {
        if(nums == null)
            return -1;

        int count = 1;
        int tp =nums[0];

        for(int i=1;i<nums.length;i++){
            if(tp == nums[i])
                count++;
            else
                count--;
            if(count == 0){
                tp = nums[i];
                count = 1;
            }

        }
        count =0;
        int pan = (nums.length>>1)+1;
        for(int i= 0;i<nums.length;i++){
            if(tp == nums[i]) count++;
        }
        return count >=pan ? tp : -1;
    }

}
