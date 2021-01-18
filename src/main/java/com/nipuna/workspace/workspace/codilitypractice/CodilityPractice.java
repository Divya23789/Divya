package com.nipuna.workspace.workspace.codilitypractice;


import java.util.*;

public class CodilityPractice {

    public int binaryGap(int number) {
        String binaryNumber = Integer.toBinaryString(number);
        ArrayList<String> binarySplit = (ArrayList<String>)Arrays.asList(binaryNumber.split("1"));

        //ArrayList<String> binarySplitCopy = new ArrayList<>();
        //binarySplitCopy.addAll(binarySplit);
        if(binaryNumber.charAt(binaryNumber.length()-1) != '1' && binarySplit.size() > 0) {
            binarySplit.remove(binarySplit.size()-1);
        }
        return Optional.ofNullable(binarySplit).orElse(new ArrayList<>()).stream().max(Comparator.comparingInt(String::length)).orElse("").length();
    }

    public static void main(String args[]) {
        CodilityPractice codilityPractice = new CodilityPractice();
        System.out.println(String.valueOf(codilityPractice.binaryGap(15)));
    }
}
