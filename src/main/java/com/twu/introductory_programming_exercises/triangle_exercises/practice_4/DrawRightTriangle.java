package com.twu.introductory_programming_exercises.triangle_exercises.practice_4;

/**
 * Created by rsma on 09/09/2017.
 */
public class DrawRightTriangle {

    public void printAsteriskRightTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
