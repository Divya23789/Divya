package com.nipuna.workspace.workspace.codilitypractice;

public class TimeCComplexity {

    public void solution1(int x, int y, int d) {
        System.out.println((y-x)/d);
        System.out.println((y-x)%d);
    }

    public int solution(int X, int Y, int D) {
        int noOfJumps = (Y-X)/D;
        return ((Y-X)%D != 0) ? ++noOfJumps: noOfJumps;
    }
    public static void main(String args[]) {
        TimeCComplexity timeCComplexity = new TimeCComplexity();
      System.out.println(timeCComplexity.solution(10,85,30));

    }
}
