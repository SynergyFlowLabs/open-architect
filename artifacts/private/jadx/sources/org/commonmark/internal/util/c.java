package org.commonmark.internal.util;

import com.planner5d.library.engine.input.f;

/* JADX INFO: loaded from: classes14.dex */
public class c {
    public static int a(CharSequence charSequence, int i10) {
        char cCharAt;
        if (i10 >= charSequence.length()) {
            return -1;
        }
        if (charSequence.charAt(i10) != '<') {
            return b(charSequence, i10);
        }
        while (true) {
            i10++;
            if (i10 >= charSequence.length() || (cCharAt = charSequence.charAt(i10)) == '\n' || cCharAt == '<') {
                break;
            }
            if (cCharAt == '>') {
                return i10 + 1;
            }
            if (cCharAt == '\\') {
                int i11 = i10 + 1;
                if (d.g(charSequence, i11)) {
                    i10 = i11;
                }
            }
        }
        return -1;
    }

    private static int b(CharSequence charSequence, int i10) {
        int i11 = 0;
        int i12 = i10;
        while (i12 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i12);
            if (cCharAt != 0 && cCharAt != ' ') {
                if (cCharAt == '\\') {
                    int i13 = i12 + 1;
                    if (d.g(charSequence, i13)) {
                        i12 = i13;
                    }
                } else if (cCharAt == '(') {
                    i11++;
                    if (i11 > 32) {
                        return -1;
                    }
                } else if (cCharAt != ')') {
                    if (Character.isISOControl(cCharAt)) {
                        if (i12 == i10) {
                            return -1;
                        }
                    }
                } else if (i11 != 0) {
                    i11--;
                }
                i12++;
            } else if (i12 == i10) {
                return -1;
            }
            return i12;
        }
        return charSequence.length();
    }

    public static int c(CharSequence charSequence, int i10) {
        while (i10 < charSequence.length()) {
            switch (charSequence.charAt(i10)) {
                case f.b.f160711n0 /* 91 */:
                    return -1;
                case f.b.f160697i1 /* 92 */:
                    int i11 = i10 + 1;
                    if (d.g(charSequence, i11)) {
                        i10 = i11;
                    }
                    break;
                case f.b.f160700j1 /* 93 */:
                    return i10;
            }
            i10++;
        }
        return charSequence.length();
    }

    public static int d(CharSequence charSequence, int i10) {
        if (i10 >= charSequence.length()) {
            return -1;
        }
        char cCharAt = charSequence.charAt(i10);
        char c10 = '\"';
        if (cCharAt != '\"') {
            c10 = '\'';
            if (cCharAt != '\'') {
                if (cCharAt != '(') {
                    return -1;
                }
                c10 = ')';
            }
        }
        int iE = e(charSequence, i10 + 1, c10);
        if (iE != -1 && iE < charSequence.length() && charSequence.charAt(iE) == c10) {
            return iE + 1;
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    /* JADX WARN: Code duplicated, block: B:21:0x001f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x001d A[DONT_INVERT] */
    public static int e(CharSequence charSequence, int i10, char c10) {
        while (i10 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt == '\\') {
                int i11 = i10 + 1;
                if (d.g(charSequence, i11)) {
                    i10 = i11;
                } else {
                    if (cCharAt == c10) {
                        return i10;
                    }
                    if (c10 == ')' && cCharAt == '(') {
                        return -1;
                    }
                }
            } else {
                if (cCharAt == c10) {
                    return i10;
                }
                if (c10 == ')') {
                    continue;
                }
            }
            i10++;
        }
        return charSequence.length();
    }
}
