package org.apache.commons.codec.language;

/* JADX INFO: loaded from: classes9.dex */
public class l implements nk.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char f335457d = '-';

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f335458e = "01230120022455012623010202";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final char[] f335459f = f335458e.toCharArray();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l f335460g = new l();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l f335461h = new l(f335458e, false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final l f335462i = new l("-123-12--22455-12623-1-2-2");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    private int f335463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char[] f335464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f335465c;

    public l() {
        this.f335463a = 4;
        this.f335464b = f335459f;
        this.f335465c = true;
    }

    private boolean d(char[] cArr) {
        for (char c10 : cArr) {
            if (c10 == '-') {
                return true;
            }
        }
        return false;
    }

    private char g(char c10) {
        int i10 = c10 - 'A';
        if (i10 >= 0) {
            char[] cArr = this.f335464b;
            if (i10 < cArr.length) {
                return cArr[i10];
            }
        }
        throw new IllegalArgumentException("The character is not mapped: " + c10 + " (index=" + i10 + ")");
    }

    @Override // nk.g
    public Object a(Object obj) throws nk.h {
        if (obj instanceof String) {
            return i((String) obj);
        }
        throw new nk.h("Parameter supplied to Soundex encode is not of type java.lang.String");
    }

    public int b(String str, String str2) throws nk.h {
        return m.b(this, str, str2);
    }

    @Deprecated
    public int c() {
        return this.f335463a;
    }

    @Override // nk.j
    public String f(String str) {
        return i(str);
    }

    @Deprecated
    public void h(int i10) {
        this.f335463a = i10;
    }

    public String i(String str) {
        char cG;
        if (str == null) {
            return null;
        }
        String strA = m.a(str);
        if (strA.length() == 0) {
            return strA;
        }
        char[] cArr = {org.locationtech.jts.geom.l.f338160j, org.locationtech.jts.geom.l.f338160j, org.locationtech.jts.geom.l.f338160j, org.locationtech.jts.geom.l.f338160j};
        char cCharAt = strA.charAt(0);
        cArr[0] = cCharAt;
        char cG2 = g(cCharAt);
        int i10 = 1;
        for (int i11 = 1; i11 < strA.length() && i10 < 4; i11++) {
            char cCharAt2 = strA.charAt(i11);
            if ((!this.f335465c || (cCharAt2 != 'H' && cCharAt2 != 'W')) && (cG = g(cCharAt2)) != '-') {
                if (cG != '0' && cG != cG2) {
                    cArr[i10] = cG;
                    i10++;
                }
                cG2 = cG;
            }
        }
        return new String(cArr);
    }

    public l(char[] cArr) {
        this.f335463a = 4;
        char[] cArr2 = new char[cArr.length];
        this.f335464b = cArr2;
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
        this.f335465c = !d(cArr2);
    }

    public l(String str) {
        this.f335463a = 4;
        char[] charArray = str.toCharArray();
        this.f335464b = charArray;
        this.f335465c = !d(charArray);
    }

    public l(String str, boolean z10) {
        int i10 = 5 & 4;
        this.f335463a = 4;
        this.f335464b = str.toCharArray();
        this.f335465c = z10;
    }
}
