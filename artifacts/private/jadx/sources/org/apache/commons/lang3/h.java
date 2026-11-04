package org.apache.commons.lang3;

/* JADX INFO: loaded from: classes14.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f337176a = -1;

    static int a(CharSequence charSequence, int i10, int i11) {
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(i10, i11);
        }
        int length = charSequence.length();
        if (i11 < 0) {
            i11 = 0;
        }
        if (i10 < 65536) {
            for (int i12 = i11; i12 < length; i12++) {
                if (charSequence.charAt(i12) == i10) {
                    return i12;
                }
            }
        }
        if (i10 > 1114111) {
            return -1;
        }
        char[] chars = Character.toChars(i10);
        while (i11 < length - 1) {
            char cCharAt = charSequence.charAt(i11);
            int i13 = i11 + 1;
            char cCharAt2 = charSequence.charAt(i13);
            if (cCharAt == chars[0] && cCharAt2 == chars[1]) {
                return i11;
            }
            i11 = i13;
        }
        return -1;
    }

    static int b(CharSequence charSequence, CharSequence charSequence2, int i10) {
        return charSequence.toString().indexOf(charSequence2.toString(), i10);
    }

    static int c(CharSequence charSequence, int i10, int i11) {
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(i10, i11);
        }
        int length = charSequence.length();
        if (i11 < 0) {
            return -1;
        }
        if (i11 >= length) {
            i11 = length - 1;
        }
        if (i10 < 65536) {
            for (int i12 = i11; i12 >= 0; i12--) {
                if (charSequence.charAt(i12) == i10) {
                    return i12;
                }
            }
        }
        if (i10 <= 1114111) {
            char[] chars = Character.toChars(i10);
            if (i11 == length - 1) {
                return -1;
            }
            while (i11 >= 0) {
                char cCharAt = charSequence.charAt(i11);
                char cCharAt2 = charSequence.charAt(i11 + 1);
                if (chars[0] == cCharAt && chars[1] == cCharAt2) {
                    return i11;
                }
                i11--;
            }
        }
        return -1;
    }

    static int d(CharSequence charSequence, CharSequence charSequence2, int i10) {
        return charSequence.toString().lastIndexOf(charSequence2.toString(), i10);
    }

    static boolean e(CharSequence charSequence, boolean z10, int i10, CharSequence charSequence2, int i11, int i12) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return ((String) charSequence).regionMatches(z10, i10, (String) charSequence2, i11, i12);
        }
        int length = charSequence.length() - i10;
        int length2 = charSequence2.length() - i11;
        if (i10 >= 0 && i11 >= 0 && i12 >= 0 && length >= i12 && length2 >= i12) {
            while (true) {
                int i13 = i12 - 1;
                if (i12 <= 0) {
                    return true;
                }
                int i14 = i10 + 1;
                char cCharAt = charSequence.charAt(i10);
                int i15 = i11 + 1;
                char cCharAt2 = charSequence2.charAt(i11);
                if (cCharAt != cCharAt2) {
                    if (!z10) {
                        return false;
                    }
                    if (Character.toUpperCase(cCharAt) != Character.toUpperCase(cCharAt2) && Character.toLowerCase(cCharAt) != Character.toLowerCase(cCharAt2)) {
                        return false;
                    }
                }
                i10 = i14;
                i12 = i13;
                i11 = i15;
            }
        }
        return false;
    }

    public static CharSequence f(CharSequence charSequence, int i10) {
        if (charSequence == null) {
            return null;
        }
        return charSequence.subSequence(i10, charSequence.length());
    }

    static char[] g(CharSequence charSequence) {
        if (charSequence instanceof String) {
            return ((String) charSequence).toCharArray();
        }
        int length = charSequence.length();
        char[] cArr = new char[charSequence.length()];
        for (int i10 = 0; i10 < length; i10++) {
            cArr[i10] = charSequence.charAt(i10);
        }
        return cArr;
    }
}
