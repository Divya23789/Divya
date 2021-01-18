package com.nipuna.workspace.workspace.codilitypractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindUnpairedNumber {
    public int solution(int[] A) {
        Map<Integer, Integer> noOfOccurances = new HashMap<>();
        Arrays.stream(A).forEach(x->  noOfOccurances.put(x, noOfOccurances.containsKey(x) ? 2:1));

        return Arrays.stream(A).filter(x-> noOfOccurances.get(x) < 2).findFirst().orElse(0);
    }


    public static void main(String args[]) {
        FindUnpairedNumber findUnpairedNumber = new FindUnpairedNumber();
        System.out.println(findUnpairedNumber.solution(new int[]{2,3,4,5,2,3,4}));
    }
}
