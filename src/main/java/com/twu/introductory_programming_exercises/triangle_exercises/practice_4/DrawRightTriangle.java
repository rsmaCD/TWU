package com.twu.introductory_programming_exercises.triangle_exercises.practice_4;

import com.utils.Print;

/**
 * Created by rsma on 09/09/2017.
 */
public class DrawRightTriangle {

    public void printAsteriskRightTriangle(int n) {
        String str = buildStr(n);
        Print.print(str);
    }

    private String buildStr(int n) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
