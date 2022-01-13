package com.company;

import java.util.ArrayList;

public class stringss {

    public int calculate(String s) {

                int x = 1;
                int y  = 0;
                char [] c = s.toCharArray();

                for(int i =0;i<c.length;i++){
                    if(c[i] == 'A')
                        x = 2 * x + y;
                    if (c[i]== 'B')
                        y = 2 * y + x;
                }

        return x+y;
    }
}
