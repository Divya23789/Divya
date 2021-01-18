package com.nipuna.workspace.workspace.test.student;

public class Test {
    public static void main(String args[]) {
        Pupil s0 = new Pupil();
        Pupil s2 = new Pupil();
        s0.check(s2);

        boolean a = true;
        boolean b  = !!true;
        a = a | !b;
        b = !a & b;
        float c = !a & b ? (float) 1: 2;

    }
}


