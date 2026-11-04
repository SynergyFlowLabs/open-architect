package org.apache.commons.codec.language;

import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
final class m {
    m() {
    }

    static String a(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        int length = str.length();
        char[] cArr = new char[length];
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (Character.isLetter(str.charAt(i11))) {
                cArr[i10] = str.charAt(i11);
                i10++;
            }
        }
        return i10 == length ? str.toUpperCase(Locale.ENGLISH) : new String(cArr, 0, i10).toUpperCase(Locale.ENGLISH);
    }

    static int b(nk.j jVar, String str, String str2) throws nk.h {
        return c(jVar.f(str), jVar.f(str2));
    }

    static int c(String str, String str2) {
        if (str == null || str2 == null) {
            return 0;
        }
        int iMin = Math.min(str.length(), str2.length());
        int i10 = 0;
        for (int i11 = 0; i11 < iMin; i11++) {
            if (str.charAt(i11) == str2.charAt(i11)) {
                i10++;
            }
        }
        return i10;
    }
}
