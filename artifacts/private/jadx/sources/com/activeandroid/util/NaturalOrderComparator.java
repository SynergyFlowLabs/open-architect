package com.activeandroid.util;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public class NaturalOrderComparator implements Comparator<Object> {
    static char charAt(String str, int i10) {
        if (i10 >= str.length()) {
            return (char) 0;
        }
        return str.charAt(i10);
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        int iCompareRight;
        String string = obj.toString();
        String string2 = obj2.toString();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            char cCharAt = charAt(string, i10);
            char cCharAt2 = charAt(string2, i11);
            int i12 = 0;
            while (true) {
                if (!Character.isSpaceChar(cCharAt) && cCharAt != '0') {
                    break;
                }
                i12 = cCharAt == '0' ? i12 + 1 : 0;
                i10++;
                cCharAt = charAt(string, i10);
            }
            int i13 = 0;
            while (true) {
                if (!Character.isSpaceChar(cCharAt2) && cCharAt2 != '0') {
                    break;
                }
                i13 = cCharAt2 == '0' ? i13 + 1 : 0;
                i11++;
                cCharAt2 = charAt(string2, i11);
            }
            if (Character.isDigit(cCharAt) && Character.isDigit(cCharAt2) && (iCompareRight = compareRight(string.substring(i10), string2.substring(i11))) != 0) {
                return iCompareRight;
            }
            if (cCharAt == 0 && cCharAt2 == 0) {
                return i12 - i13;
            }
            if (cCharAt < cCharAt2) {
                return -1;
            }
            if (cCharAt > cCharAt2) {
                return 1;
            }
            i10++;
            i11++;
        }
    }

    int compareRight(String str, String str2) {
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            char cCharAt = charAt(str, i10);
            char cCharAt2 = charAt(str2, i11);
            if (!Character.isDigit(cCharAt) && !Character.isDigit(cCharAt2)) {
                break;
            }
            if (!Character.isDigit(cCharAt)) {
                return -1;
            }
            if (!Character.isDigit(cCharAt2)) {
                return 1;
            }
            if (cCharAt >= cCharAt2) {
                if (cCharAt <= cCharAt2) {
                    if (cCharAt == 0 && cCharAt2 == 0) {
                        break;
                    }
                } else if (i12 == 0) {
                    i12 = 1;
                }
            } else if (i12 == 0) {
                i12 = -1;
            }
            i10++;
            i11++;
        }
        return i12;
    }
}
