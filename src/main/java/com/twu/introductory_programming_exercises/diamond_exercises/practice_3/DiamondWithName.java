package com.twu.introductory_programming_exercises.diamond_exercises.practice_3;

import com.utils.Print;

/**
 * Created by rsma on 09/09/2017.
 */
public class DiamondWithName {

    private static final String NAME = "Bill";

    public void printDiamondWithName(int n) {
        String str = buildStr(n);
        Print.print(str);
    }

    private String buildStr(int n) {
        StringBuffer sb = new StringBuffer();
        int totalRowNum = n * 2 - 1;
        for (int i = 0; i < totalRowNum; i++) {
            if (i < (totalRowNum - 1) / 2) {
                for (int j = i; j < (totalRowNum - 1) / 2; j++) {
                    sb.append(" ");
                }
                for (int k = 0; k < 2 * i + 1; k++) {
                    sb.append("*");
                }
                for (int j = i; j < (totalRowNum - 1) / 2; j++) {
                    sb.append(" ");
                }
            } else if(i == (totalRowNum - 1) / 2){
                sb.append(NAME);
            } else {
                for (int j = 0; j < i - (totalRowNum - 1) / 2; j++) {
                    sb.append(" ");
                }
                for (int k = 0; k < 2 * (totalRowNum - i) - 1; k++) {
                    sb.append("*");
                }
                for (int j = 0; j < i - (totalRowNum - 1) / 2; j++) {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}
