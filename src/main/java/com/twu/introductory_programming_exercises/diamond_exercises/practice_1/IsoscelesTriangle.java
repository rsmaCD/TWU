package com.twu.introductory_programming_exercises.diamond_exercises.practice_1;

import com.utils.Print;

/**
 * Created by rsma on 09/09/2017.
 */
public class IsoscelesTriangle {


    public void printIsoscelesTriangle(int n) {
        String str = buildStr(n);
        Print.print(str);
    }

    private String buildStr(int n) {
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                if ((i >= -j + n + 1) && (i >= j - n + 1)) {
                    sb.append("*");
                } else{
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
