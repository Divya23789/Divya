package com.nipuna.workspace.workspace.metoffice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MetOfficeWorksheet {
    public int solution(String S, int K) {
        String words [] = S.split(" ");
        List<String> messages = new ArrayList();
        final StringBuffer message = new StringBuffer();
        Arrays.asList(words).stream().forEach(x-> {
            if(x.length() < K && message.length()+x.length() <  K) {
                message.append(" "+x);
            } else {
                messages.add(message.toString());
                message.append(" " +message);
            }
        });
        return messages.size();
    }
    public static void main(String args[]) {
        int N = 0;
        List<Integer> integers = new ArrayList<>();
    }
}
