package com.company.les1;

import java.util.Comparator;

public class LengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        if (o1 == null)
            return o2 == null ? 0 : -1;
        if (o2 == null) return 1;
        return o1.length() - o2.length();
    }
}
