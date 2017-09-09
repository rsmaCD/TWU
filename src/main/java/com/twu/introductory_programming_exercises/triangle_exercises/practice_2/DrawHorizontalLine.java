package com.twu.introductory_programming_exercises.triangle_exercises.practice_2;

import com.utils.Print;

/**
 * Created by rsma on 08/09/2017.
 */
public class DrawHorizontalLine {

    public void printAsteriskLine(int n) {
        String str = buildStr(n);
        Print.print(str);
    }

    private String buildStr(int n) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++){
            sb.append("*");
        }
        sb.append("\n");
        return sb.toString();
    }

}
