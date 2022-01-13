package com.company.shuzu;
//任务调度器
public class t621 {

    public int leastInterval(char[] tasks, int n) {
        int[] map = new int[26];
        //确定每种任务的个数
        for(char c : tasks){
            map[c-'A']++;
        }
        //确定最大任务的次数
        int max = 0;
        for(int m :map){
            if(m>max)
                max = m;
        }
        //确定最大任务数的个数
        int maxcount = 0;
        for(int m : map){
            if(m == max) maxcount++;
        }

        return Math.max((max-1)*(n+1)+maxcount,tasks.length);
    }
}
