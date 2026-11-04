package org.apache.commons.lang3;

import java.util.Random;

/* JADX INFO: loaded from: classes14.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Random f337273a = new Random();

    public static String a(int i10) {
        return f(i10, false, false);
    }

    public static String b(int i10, int i11, int i12, boolean z10, boolean z11) {
        return d(i10, i11, i12, z10, z11, null, f337273a);
    }

    public static String c(int i10, int i11, int i12, boolean z10, boolean z11, char... cArr) {
        return d(i10, i11, i12, z10, z11, cArr, f337273a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String d(int i10, int i11, int i12, boolean z10, boolean z11, char[] cArr, Random random) {
        char cNextInt;
        if (i10 == 0) {
            return "";
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("Requested random string length " + i10 + " is less than 0.");
        }
        if (cArr != 0 && cArr.length == 0) {
            throw new IllegalArgumentException("The chars array must not be empty");
        }
        if (i11 == 0 && i12 == 0) {
            if (cArr != 0) {
                i12 = cArr.length;
            } else if (z10 || z11) {
                i12 = 123;
                i11 = 32;
            } else {
                i12 = 1114111;
            }
        } else if (i12 <= i11) {
            throw new IllegalArgumentException("Parameter end (" + i12 + ") must be greater than start (" + i11 + ")");
        }
        if (cArr == 0 && ((z11 && i12 <= 48) || (z10 && i12 <= 65))) {
            throw new IllegalArgumentException("Parameter end (" + i12 + ") must be greater then (48) for generating digits or greater then (65) for generating letters.");
        }
        StringBuilder sb2 = new StringBuilder(i10);
        int i13 = i12 - i11;
        while (true) {
            int i14 = i10 - 1;
            if (i10 == 0) {
                return sb2.toString();
            }
            if (cArr == 0) {
                cNextInt = random.nextInt(i13) + i11;
                int type = Character.getType(cNextInt);
                if (type == 0 || type == 18 || type == 19) {
                }
            } else {
                cNextInt = cArr[random.nextInt(i13) + i11];
            }
            int iCharCount = Character.charCount(cNextInt);
            if (i14 != 0 || iCharCount <= 1) {
                if ((z10 && Character.isLetter(cNextInt)) || ((z11 && Character.isDigit(cNextInt)) || (!z10 && !z11))) {
                    sb2.appendCodePoint(cNextInt);
                    i10 = iCharCount == 2 ? i10 - 2 : i14;
                }
            }
        }
    }

    public static String e(int i10, String str) {
        if (str != null) {
            return g(i10, str.toCharArray());
        }
        int i11 = 6 >> 0;
        return d(i10, 0, 0, false, false, null, f337273a);
    }

    public static String f(int i10, boolean z10, boolean z11) {
        return b(i10, 0, 0, z10, z11);
    }

    public static String g(int i10, char... cArr) {
        if (cArr != null) {
            return d(i10, 0, cArr.length, false, false, cArr, f337273a);
        }
        int i11 = (7 << 0) | 0;
        return d(i10, 0, 0, false, false, null, f337273a);
    }

    public static String h(int i10) {
        return f(i10, true, false);
    }

    public static String i(int i10, int i11) {
        return h(u.h(i10, i11));
    }

    public static String j(int i10) {
        return f(i10, true, true);
    }

    public static String k(int i10, int i11) {
        return j(u.h(i10, i11));
    }

    public static String l(int i10) {
        return b(i10, 32, 127, false, false);
    }

    public static String m(int i10, int i11) {
        return l(u.h(i10, i11));
    }

    public static String n(int i10) {
        return b(i10, 33, okhttp3.internal.ws.g.f334652s, false, false);
    }

    public static String o(int i10, int i11) {
        return n(u.h(i10, i11));
    }

    public static String p(int i10) {
        return f(i10, false, true);
    }

    public static String q(int i10, int i11) {
        return p(u.h(i10, i11));
    }

    public static String r(int i10) {
        return b(i10, 32, okhttp3.internal.ws.g.f334652s, false, false);
    }

    public static String s(int i10, int i11) {
        return r(u.h(i10, i11));
    }
}
