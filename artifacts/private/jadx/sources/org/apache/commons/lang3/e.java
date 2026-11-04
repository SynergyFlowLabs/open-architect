package org.apache.commons.lang3;

import com.facebook.internal.z0;
import kotlinx.coroutines.w0;

/* JADX INFO: loaded from: classes14.dex */
public class e {
    public static Integer A(Boolean bool) {
        if (bool == null) {
            return null;
        }
        return bool.booleanValue() ? sk.c.f376053e : sk.c.f376052d;
    }

    public static Integer B(Boolean bool, Integer num, Integer num2, Integer num3) {
        if (bool == null) {
            return num3;
        }
        return bool.booleanValue() ? num : num2;
    }

    public static Integer C(boolean z10) {
        return z10 ? sk.c.f376053e : sk.c.f376052d;
    }

    public static Integer D(boolean z10, Integer num, Integer num2) {
        return z10 ? num : num2;
    }

    public static String E(Boolean bool, String str, String str2, String str3) {
        if (bool == null) {
            return str3;
        }
        return bool.booleanValue() ? str : str2;
    }

    public static String F(boolean z10, String str, String str2) {
        return z10 ? str : str2;
    }

    public static String G(Boolean bool) {
        return E(bool, w0.f315666d, w0.f315667e, null);
    }

    public static String H(boolean z10) {
        return F(z10, w0.f315666d, w0.f315667e);
    }

    public static String I(Boolean bool) {
        return E(bool, z0.P, "false", null);
    }

    public static String J(boolean z10) {
        return F(z10, z0.P, "false");
    }

    public static String K(Boolean bool) {
        return E(bool, "yes", "no", null);
    }

    public static String L(boolean z10) {
        return F(z10, "yes", "no");
    }

    public static Boolean M(Boolean... boolArr) {
        if (boolArr == null) {
            throw new IllegalArgumentException("The Array must not be null");
        }
        if (boolArr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        try {
            return N(c.a5(boolArr)) ? Boolean.TRUE : Boolean.FALSE;
        } catch (NullPointerException unused) {
            throw new IllegalArgumentException("The array must not contain any null elements");
        }
    }

    public static boolean N(boolean... zArr) {
        if (zArr == null) {
            throw new IllegalArgumentException("The Array must not be null");
        }
        if (zArr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        boolean z10 = false;
        for (boolean z11 : zArr) {
            z10 ^= z11;
        }
        return z10;
    }

    public static Boolean a(Boolean... boolArr) {
        if (boolArr == null) {
            throw new IllegalArgumentException("The Array must not be null");
        }
        if (boolArr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        try {
            return b(c.a5(boolArr)) ? Boolean.TRUE : Boolean.FALSE;
        } catch (NullPointerException unused) {
            throw new IllegalArgumentException("The array must not contain any null elements");
        }
    }

    public static boolean b(boolean... zArr) {
        if (zArr == null) {
            throw new IllegalArgumentException("The Array must not be null");
        }
        if (zArr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        for (boolean z10 : zArr) {
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    public static int c(boolean z10, boolean z11) {
        if (z10 == z11) {
            return 0;
        }
        return z10 ? 1 : -1;
    }

    public static boolean d(Boolean bool) {
        return Boolean.FALSE.equals(bool);
    }

    public static boolean e(Boolean bool) {
        return !d(bool);
    }

    public static boolean f(Boolean bool) {
        return !g(bool);
    }

    public static boolean g(Boolean bool) {
        return Boolean.TRUE.equals(bool);
    }

    public static Boolean h(Boolean bool) {
        if (bool == null) {
            return null;
        }
        return bool.booleanValue() ? Boolean.FALSE : Boolean.TRUE;
    }

    public static Boolean i(Boolean... boolArr) {
        if (boolArr == null) {
            throw new IllegalArgumentException("The Array must not be null");
        }
        if (boolArr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        try {
            return j(c.a5(boolArr)) ? Boolean.TRUE : Boolean.FALSE;
        } catch (NullPointerException unused) {
            throw new IllegalArgumentException("The array must not contain any null elements");
        }
    }

    public static boolean j(boolean... zArr) {
        if (zArr == null) {
            throw new IllegalArgumentException("The Array must not be null");
        }
        if (zArr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        for (boolean z10 : zArr) {
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public static boolean k(int i10) {
        return i10 != 0;
    }

    public static boolean l(int i10, int i11, int i12) {
        if (i10 == i11) {
            return true;
        }
        if (i10 == i12) {
            return false;
        }
        throw new IllegalArgumentException("The Integer did not match either specified value");
    }

    public static boolean m(Boolean bool) {
        return bool != null && bool.booleanValue();
    }

    public static boolean n(Integer num, Integer num2, Integer num3) {
        if (num == null) {
            if (num2 == null) {
                return true;
            }
            if (num3 == null) {
                return false;
            }
        } else {
            if (num.equals(num2)) {
                return true;
            }
            if (num.equals(num3)) {
                return false;
            }
        }
        throw new IllegalArgumentException("The Integer did not match either specified value");
    }

    public static boolean o(String str) {
        return v(str) == Boolean.TRUE;
    }

    public static boolean p(String str, String str2, String str3) {
        if (str == str2) {
            return true;
        }
        if (str == str3) {
            return false;
        }
        if (str != null) {
            if (str.equals(str2)) {
                return true;
            }
            if (str.equals(str3)) {
                return false;
            }
        }
        throw new IllegalArgumentException("The String did not match either specified value");
    }

    public static boolean q(Boolean bool, boolean z10) {
        return bool == null ? z10 : bool.booleanValue();
    }

    public static Boolean r(int i10) {
        return i10 == 0 ? Boolean.FALSE : Boolean.TRUE;
    }

    public static Boolean s(int i10, int i11, int i12, int i13) {
        if (i10 == i11) {
            return Boolean.TRUE;
        }
        if (i10 == i12) {
            return Boolean.FALSE;
        }
        if (i10 == i13) {
            return null;
        }
        throw new IllegalArgumentException("The Integer did not match any specified value");
    }

    public static Boolean t(Integer num) {
        if (num == null) {
            return null;
        }
        return num.intValue() == 0 ? Boolean.FALSE : Boolean.TRUE;
    }

    public static Boolean u(Integer num, Integer num2, Integer num3, Integer num4) {
        if (num == null) {
            if (num2 == null) {
                return Boolean.TRUE;
            }
            if (num3 == null) {
                return Boolean.FALSE;
            }
            if (num4 == null) {
                return null;
            }
        } else {
            if (num.equals(num2)) {
                return Boolean.TRUE;
            }
            if (num.equals(num3)) {
                return Boolean.FALSE;
            }
            if (num.equals(num4)) {
                return null;
            }
        }
        throw new IllegalArgumentException("The Integer did not match any specified value");
    }

    public static Boolean v(String str) {
        Boolean bool;
        if (str == z0.P) {
            return Boolean.TRUE;
        }
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 1) {
            bool = null;
            char cCharAt = str.charAt(0);
            if (cCharAt == 'y' || cCharAt == 'Y' || cCharAt == 't' || cCharAt == 'T') {
                return Boolean.TRUE;
            }
            if (cCharAt == 'n' || cCharAt == 'N' || cCharAt == 'f' || cCharAt == 'F') {
                return Boolean.FALSE;
            }
        } else if (length != 2) {
            bool = null;
            if (length == 3) {
                char cCharAt2 = str.charAt(0);
                char cCharAt3 = str.charAt(1);
                char cCharAt4 = str.charAt(2);
                if ((cCharAt2 == 'y' || cCharAt2 == 'Y') && ((cCharAt3 == 'e' || cCharAt3 == 'E') && (cCharAt4 == 's' || cCharAt4 == 'S'))) {
                    return Boolean.TRUE;
                }
                if ((cCharAt2 == 'o' || cCharAt2 == 'O') && ((cCharAt3 == 'f' || cCharAt3 == 'F') && (cCharAt4 == 'f' || cCharAt4 == 'F'))) {
                    return Boolean.FALSE;
                }
            } else if (length == 4) {
                char cCharAt5 = str.charAt(0);
                char cCharAt6 = str.charAt(1);
                char cCharAt7 = str.charAt(2);
                char cCharAt8 = str.charAt(3);
                if ((cCharAt5 == 't' || cCharAt5 == 'T') && ((cCharAt6 == 'r' || cCharAt6 == 'R') && ((cCharAt7 == 'u' || cCharAt7 == 'U') && (cCharAt8 == 'e' || cCharAt8 == 'E')))) {
                    return Boolean.TRUE;
                }
            } else if (length == 5) {
                char cCharAt9 = str.charAt(0);
                char cCharAt10 = str.charAt(1);
                char cCharAt11 = str.charAt(2);
                char cCharAt12 = str.charAt(3);
                char cCharAt13 = str.charAt(4);
                if ((cCharAt9 == 'f' || cCharAt9 == 'F') && ((cCharAt10 == 'a' || cCharAt10 == 'A') && ((cCharAt11 == 'l' || cCharAt11 == 'L') && ((cCharAt12 == 's' || cCharAt12 == 'S') && (cCharAt13 == 'e' || cCharAt13 == 'E'))))) {
                    return Boolean.FALSE;
                }
            }
        } else {
            bool = null;
            char cCharAt14 = str.charAt(0);
            char cCharAt15 = str.charAt(1);
            if ((cCharAt14 == 'o' || cCharAt14 == 'O') && (cCharAt15 == 'n' || cCharAt15 == 'N')) {
                return Boolean.TRUE;
            }
            if ((cCharAt14 == 'n' || cCharAt14 == 'N') && (cCharAt15 == 'o' || cCharAt15 == 'O')) {
                return Boolean.FALSE;
            }
        }
        return bool;
    }

    public static Boolean w(String str, String str2, String str3, String str4) {
        if (str == null) {
            if (str2 == null) {
                return Boolean.TRUE;
            }
            if (str3 == null) {
                return Boolean.FALSE;
            }
            if (str4 == null) {
                return null;
            }
        } else {
            if (str.equals(str2)) {
                return Boolean.TRUE;
            }
            if (str.equals(str3)) {
                return Boolean.FALSE;
            }
            if (str.equals(str4)) {
                return null;
            }
        }
        throw new IllegalArgumentException("The String did not match any specified value");
    }

    public static int x(Boolean bool, int i10, int i11, int i12) {
        if (bool == null) {
            return i12;
        }
        return bool.booleanValue() ? i10 : i11;
    }

    public static int y(boolean z10) {
        return z10 ? 1 : 0;
    }

    public static int z(boolean z10, int i10, int i11) {
        return z10 ? i10 : i11;
    }
}
