package com.nipuna.workspace.workspace.test;

import java.util.*;

public class Collection_iterators {
    public static void main(String args[]) {
        List<String> list = new LinkedList<>();
        ListIterator a = list.listIterator();
        if(a.previousIndex() != -1)
            while(a.hasNext())
          System.out.println(a.next() + " ");
        else
          System.out.println("EMPTY");
    }
}
//EMPTY