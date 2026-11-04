package com.google.api.client.repackaged.com.google.common.base;

/* JADX INFO: loaded from: classes4.dex */
@r7.b
public final class v {
    private v() {
    }

    public static String a(CharSequence charSequence, CharSequence charSequence2) {
        q.E(charSequence);
        q.E(charSequence2);
        int iMin = Math.min(charSequence.length(), charSequence2.length());
        int i10 = 0;
        while (i10 < iMin && charSequence.charAt(i10) == charSequence2.charAt(i10)) {
            i10++;
        }
        int i11 = i10 - 1;
        if (i(charSequence, i11) || i(charSequence2, i11)) {
            i10--;
        }
        return charSequence.subSequence(0, i10).toString();
    }

    public static String b(CharSequence charSequence, CharSequence charSequence2) {
        q.E(charSequence);
        q.E(charSequence2);
        int iMin = Math.min(charSequence.length(), charSequence2.length());
        int i10 = 0;
        while (i10 < iMin && charSequence.charAt((charSequence.length() - i10) - 1) == charSequence2.charAt((charSequence2.length() - i10) - 1)) {
            i10++;
        }
        if (i(charSequence, (charSequence.length() - i10) - 1) || i(charSequence2, (charSequence2.length() - i10) - 1)) {
            i10--;
        }
        return charSequence.subSequence(charSequence.length() - i10, charSequence.length()).toString();
    }

    @fj.h
    public static String c(@fj.h String str) {
        if (d(str)) {
            str = null;
        }
        return str;
    }

    public static boolean d(@fj.h String str) {
        return p.g(str);
    }

    public static String e(@fj.h String str) {
        if (str == null) {
            str = "";
        }
        return str;
    }

    public static String f(String str, int i10, char c10) {
        q.E(str);
        if (str.length() >= i10) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(str);
        for (int length = str.length(); length < i10; length++) {
            sb2.append(c10);
        }
        return sb2.toString();
    }

    public static String g(String str, int i10, char c10) {
        q.E(str);
        if (str.length() >= i10) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(i10);
        for (int length = str.length(); length < i10; length++) {
            sb2.append(c10);
        }
        sb2.append(str);
        return sb2.toString();
    }

    public static String h(String str, int i10) {
        q.E(str);
        if (i10 <= 1) {
            q.k(i10 >= 0, "invalid count: %s", i10);
            return i10 == 0 ? "" : str;
        }
        int length = str.length();
        long j10 = ((long) length) * ((long) i10);
        int i11 = (int) j10;
        if (i11 != j10) {
            throw new ArrayIndexOutOfBoundsException("Required array size too large: " + j10);
        }
        char[] cArr = new char[i11];
        str.getChars(0, length, cArr, 0);
        while (true) {
            int i12 = i11 - length;
            if (length >= i12) {
                System.arraycopy(cArr, 0, cArr, length, i12);
                return new String(cArr);
            }
            System.arraycopy(cArr, 0, cArr, length, length);
            length <<= 1;
        }
    }

    @r7.d
    static boolean i(CharSequence charSequence, int i10) {
        return i10 >= 0 && i10 <= charSequence.length() + (-2) && Character.isHighSurrogate(charSequence.charAt(i10)) && Character.isLowSurrogate(charSequence.charAt(i10 + 1));
    }
}
