package com.nipuna.workspace.workspace.test.inheritence;

public interface I {
    default void method() {
        System.out.println("Interface");
    }
}
