package com.fasterxml.jackson.core.io;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f102440a = "2.2250738585072012e-308";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final long f102441b = 1000000000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f102442c = String.valueOf(Long.MIN_VALUE).substring(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f102443d = String.valueOf(Long.MAX_VALUE);

    private static NumberFormatException a(String str) {
        return new NumberFormatException("Value \"" + str + "\" can not be represented as BigDecimal");
    }

    public static boolean b(String str, boolean z10) {
        String str2 = z10 ? f102442c : f102443d;
        int length = str2.length();
        int length2 = str.length();
        if (length2 < length) {
            return true;
        }
        if (length2 > length) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            int iCharAt = str.charAt(i10) - str2.charAt(i10);
            if (iCharAt != 0) {
                return iCharAt < 0;
            }
        }
        return true;
    }

    public static boolean c(char[] cArr, int i10, int i11, boolean z10) {
        String str = z10 ? f102442c : f102443d;
        int length = str.length();
        if (i11 < length) {
            return true;
        }
        if (i11 > length) {
            return false;
        }
        for (int i12 = 0; i12 < length; i12++) {
            int iCharAt = cArr[i10 + i12] - str.charAt(i12);
            if (iCharAt != 0) {
                return iCharAt < 0;
            }
        }
        return true;
    }

    public static double d(String str, double d10) {
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.length() != 0) {
                try {
                    return j(strTrim);
                } catch (NumberFormatException unused) {
                    return d10;
                }
            }
        }
        return d10;
    }

    public static int e(String str, int i10) {
        String strTrim;
        int length;
        if (str == null || (length = (strTrim = str.trim()).length()) == 0) {
            return i10;
        }
        int i11 = 0;
        if (length > 0) {
            char cCharAt = strTrim.charAt(0);
            if (cCharAt == '+') {
                strTrim = strTrim.substring(1);
                length = strTrim.length();
            } else if (cCharAt == '-') {
                i11 = 1;
            }
        }
        while (i11 < length) {
            char cCharAt2 = strTrim.charAt(i11);
            if (cCharAt2 > '9' || cCharAt2 < '0') {
                try {
                    return (int) j(strTrim);
                } catch (NumberFormatException unused) {
                    return i10;
                }
            }
            i11++;
        }
        try {
            return Integer.parseInt(strTrim);
        } catch (NumberFormatException unused2) {
            return i10;
        }
    }

    public static long f(String str, long j10) {
        String strTrim;
        int length;
        if (str == null || (length = (strTrim = str.trim()).length()) == 0) {
            return j10;
        }
        int i10 = 0;
        if (length > 0) {
            char cCharAt = strTrim.charAt(0);
            if (cCharAt == '+') {
                strTrim = strTrim.substring(1);
                length = strTrim.length();
            } else if (cCharAt == '-') {
                i10 = 1;
            }
        }
        while (i10 < length) {
            char cCharAt2 = strTrim.charAt(i10);
            if (cCharAt2 > '9' || cCharAt2 < '0') {
                try {
                    return (long) j(strTrim);
                } catch (NumberFormatException unused) {
                    return j10;
                }
            }
            i10++;
        }
        try {
            return Long.parseLong(strTrim);
        } catch (NumberFormatException unused2) {
            return j10;
        }
    }

    public static BigDecimal g(String str) throws NumberFormatException {
        try {
            return new BigDecimal(str);
        } catch (NumberFormatException unused) {
            throw a(str);
        }
    }

    public static BigDecimal h(char[] cArr) throws NumberFormatException {
        return i(cArr, 0, cArr.length);
    }

    public static BigDecimal i(char[] cArr, int i10, int i11) throws NumberFormatException {
        try {
            return new BigDecimal(cArr, i10, i11);
        } catch (NumberFormatException unused) {
            throw a(new String(cArr, i10, i11));
        }
    }

    public static double j(String str) throws NumberFormatException {
        if (f102440a.equals(str)) {
            return Double.MIN_VALUE;
        }
        return Double.parseDouble(str);
    }

    public static int k(String str) {
        char cCharAt = str.charAt(0);
        int length = str.length();
        int i10 = 1;
        boolean z10 = cCharAt == '-';
        if (z10) {
            if (length == 1 || length > 10) {
                return Integer.parseInt(str);
            }
            cCharAt = str.charAt(1);
            i10 = 2;
        } else if (length > 9) {
            return Integer.parseInt(str);
        }
        if (cCharAt <= '9' && cCharAt >= '0') {
            int i11 = cCharAt - org.locationtech.jts.geom.l.f338160j;
            if (i10 < length) {
                int i12 = i10 + 1;
                char cCharAt2 = str.charAt(i10);
                if (cCharAt2 > '9' || cCharAt2 < '0') {
                    return Integer.parseInt(str);
                }
                i11 = (i11 * 10) + (cCharAt2 - org.locationtech.jts.geom.l.f338160j);
                if (i12 < length) {
                    int i13 = i10 + 2;
                    char cCharAt3 = str.charAt(i12);
                    if (cCharAt3 > '9' || cCharAt3 < '0') {
                        return Integer.parseInt(str);
                    }
                    i11 = (i11 * 10) + (cCharAt3 - org.locationtech.jts.geom.l.f338160j);
                    if (i13 < length) {
                        while (true) {
                            int i14 = i13 + 1;
                            char cCharAt4 = str.charAt(i13);
                            if (cCharAt4 > '9' || cCharAt4 < '0') {
                                break;
                            }
                            i11 = (i11 * 10) + (cCharAt4 - '0');
                            if (i14 < length) {
                                i13 = i14;
                            }
                        }
                        return Integer.parseInt(str);
                    }
                }
            }
            return z10 ? -i11 : i11;
        }
        return Integer.parseInt(str);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0067  */
    /* JADX WARN: Code duplicated, block: B:14:0x0075  */
    /* JADX WARN: Code duplicated, block: B:16:0x0085  */
    public static int l(char[] cArr, int i10, int i11) {
        int i12;
        char c10;
        int i13 = cArr[i10] - '0';
        if (i11 <= 4) {
            if (i11 > 1) {
                i13 = (i13 * 10) + (cArr[i10 + 1] - '0');
                if (i11 > 2) {
                    i13 = (i13 * 10) + (cArr[i10 + 2] - '0');
                    if (i11 > 3) {
                        i12 = i13 * 10;
                        c10 = cArr[i10 + 3];
                    }
                }
            }
            return i13;
        }
        int i14 = i10 + 4;
        i13 = (((((((i13 * 10) + (cArr[i10 + 1] - '0')) * 10) + (cArr[i10 + 2] - '0')) * 10) + (cArr[i10 + 3] - '0')) * 10) + (cArr[i14] - '0');
        i11 -= 4;
        if (i11 <= 4) {
            i10 = i14;
            if (i11 > 1) {
                i13 = (i13 * 10) + (cArr[i10 + 1] - '0');
                if (i11 > 2) {
                    i13 = (i13 * 10) + (cArr[i10 + 2] - '0');
                    if (i11 > 3) {
                        i12 = i13 * 10;
                        c10 = cArr[i10 + 3];
                    }
                }
            }
            return i13;
        }
        i12 = ((((((i13 * 10) + (cArr[i10 + 5] - '0')) * 10) + (cArr[i10 + 6] - '0')) * 10) + (cArr[i10 + 7] - '0')) * 10;
        c10 = cArr[i10 + 8];
        return i12 + (c10 - '0');
    }

    public static long m(String str) {
        return str.length() <= 9 ? k(str) : Long.parseLong(str);
    }

    public static long n(char[] cArr, int i10, int i11) {
        int i12 = i11 - 9;
        return (((long) l(cArr, i10, i12)) * 1000000000) + ((long) l(cArr, i10 + i12, 9));
    }
}
