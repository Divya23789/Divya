package com.nipuna.workspace.workspace.codilitypractice;


import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class PracticeTest {
    public int solution(String[] words) {
        String joinedString = String.join("", words);
        Map<Character, Integer> noOfOccurances = new HashMap<>();
        joinedString.chars().forEach(x -> noOfOccurances.put(Character.valueOf((char) x), noOfOccurances.get(Character.valueOf((char) x))==null?1:noOfOccurances.get(Character.valueOf((char) x))+1));
        return noOfOccurances.get(Collections.max(noOfOccurances.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey()).intValue();
    }

    public static void main(String args[]) {
        PracticeTest practiceTest = new PracticeTest();
        System.out.println(practiceTest.solution(new String[]{"aabb", "aaaa", "bbab"}));
    }
}
