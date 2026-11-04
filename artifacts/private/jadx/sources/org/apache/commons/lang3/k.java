package org.apache.commons.lang3;

/* JADX INFO: loaded from: classes14.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f337185a = new String[128];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char[] f337186b = {org.locationtech.jts.geom.l.f338160j, org.locationtech.jts.geom.l.f338161k, org.locationtech.jts.geom.l.f338162l, '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', ni.f.f333369f, 'e', 'f'};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final char f337187c = '\n';

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char f337188d = '\r';

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final char f337189e = 0;

    static {
        char c10 = 0;
        while (true) {
            String[] strArr = f337185a;
            if (c10 >= strArr.length) {
                return;
            }
            strArr[c10] = String.valueOf(c10);
            c10 = (char) (c10 + 1);
        }
    }

    public static int a(char c10, char c11) {
        return c10 - c11;
    }

    public static boolean b(char c10) {
        return c10 < 128;
    }

    public static boolean c(char c10) {
        return e(c10) || d(c10);
    }

    public static boolean d(char c10) {
        return c10 >= 'a' && c10 <= 'z';
    }

    public static boolean e(char c10) {
        return c10 >= 'A' && c10 <= 'Z';
    }

    public static boolean f(char c10) {
        return c(c10) || h(c10);
    }

    public static boolean g(char c10) {
        if (c10 >= ' ' && c10 != 127) {
            return false;
        }
        return true;
    }

    public static boolean h(char c10) {
        return c10 >= '0' && c10 <= '9';
    }

    public static boolean i(char c10) {
        return c10 >= ' ' && c10 < 127;
    }

    public static char j(Character ch2) {
        c0.v(ch2 != null, "The Character must not be null", new Object[0]);
        return ch2.charValue();
    }

    public static char k(Character ch2, char c10) {
        return ch2 == null ? c10 : ch2.charValue();
    }

    public static char l(String str) {
        c0.v(z.F0(str), "The String must not be empty", new Object[0]);
        return str.charAt(0);
    }

    public static char m(String str, char c10) {
        return z.A0(str) ? c10 : str.charAt(0);
    }

    @Deprecated
    public static Character n(char c10) {
        return Character.valueOf(c10);
    }

    public static Character o(String str) {
        if (z.A0(str)) {
            return null;
        }
        return Character.valueOf(str.charAt(0));
    }

    public static int p(char c10) {
        if (h(c10)) {
            return c10 - '0';
        }
        throw new IllegalArgumentException("The character " + c10 + " is not in the range '0' - '9'");
    }

    public static int q(char c10, int i10) {
        return !h(c10) ? i10 : c10 - '0';
    }

    public static int r(Character ch2) {
        c0.v(ch2 != null, "The character must not be null", new Object[0]);
        return p(ch2.charValue());
    }

    public static int s(Character ch2, int i10) {
        return ch2 == null ? i10 : q(ch2.charValue(), i10);
    }

    public static String t(char c10) {
        return c10 < 128 ? f337185a[c10] : new String(new char[]{c10});
    }

    public static String u(Character ch2) {
        if (ch2 == null) {
            return null;
        }
        return t(ch2.charValue());
    }

    public static String v(char c10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\\u");
        char[] cArr = f337186b;
        sb2.append(cArr[(c10 >> '\f') & 15]);
        sb2.append(cArr[(c10 >> '\b') & 15]);
        sb2.append(cArr[(c10 >> 4) & 15]);
        sb2.append(cArr[c10 & 15]);
        return sb2.toString();
    }

    public static String w(Character ch2) {
        if (ch2 == null) {
            return null;
        }
        return v(ch2.charValue());
    }
}
