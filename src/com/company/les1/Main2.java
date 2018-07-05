package com.company.les1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<String> s = Arrays.asList("aaa", "b", "cd");
// Should return {b, cd , aaa}
        Collections.sort(s, new LengthComparator());
        System.out.println(s);
    }
}
