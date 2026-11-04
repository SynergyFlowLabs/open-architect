package org.apache.commons.codec.language;

import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class e implements nk.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f335375a = {'A', 'E', 'I', 'J', 'O', 'U', ni.f.f333371h};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char[] f335376b = {'S', 'C', 'Z'};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final char[] f335377c = {'W', org.locationtech.jts.geom.l.f338157g, 'P', 'V'};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final char[] f335378d = {'G', 'K', 'Q'};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final char[] f335379e = {'C', 'K', 'Q'};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final char[] f335380f = {'A', 'H', 'K', 'L', 'O', 'Q', 'R', 'U', 'X'};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final char[] f335381g = {'S', 'Z'};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final char[] f335382h = {'A', 'H', 'O', 'U', 'K', 'Q', 'X'};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final char[] f335383i = {org.locationtech.jts.geom.l.f338158h, 'D', 'X'};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final char[][] f335384j = {new char[]{196, 'A'}, new char[]{220, 'U'}, new char[]{214, 'O'}, new char[]{223, 'S'}};

    private class b extends a {
        public b(char[] cArr) {
            super(cArr);
        }

        @Override // org.apache.commons.codec.language.e.a
        protected char[] a(int i10, int i11) {
            char[] cArr = new char[i11];
            char[] cArr2 = this.f335385a;
            System.arraycopy(cArr2, (cArr2.length - this.f335386b) + i10, cArr, 0, i11);
            return cArr;
        }

        public void c(char c10) {
            this.f335386b++;
            this.f335385a[e()] = c10;
        }

        public char d() {
            return this.f335385a[e()];
        }

        protected int e() {
            return this.f335385a.length - this.f335386b;
        }

        public char f() {
            char cD = d();
            this.f335386b--;
            return cD;
        }
    }

    private class c extends a {
        public c(int i10) {
            super(i10);
        }

        @Override // org.apache.commons.codec.language.e.a
        protected char[] a(int i10, int i11) {
            char[] cArr = new char[i11];
            System.arraycopy(this.f335385a, i10, cArr, 0, i11);
            return cArr;
        }

        public void c(char c10) {
            char[] cArr = this.f335385a;
            int i10 = this.f335386b;
            cArr[i10] = c10;
            this.f335386b = i10 + 1;
        }
    }

    private static boolean b(char[] cArr, char c10) {
        for (char c11 : cArr) {
            if (c11 == c10) {
                return true;
            }
        }
        return false;
    }

    private String g(String str) {
        char[] charArray = str.toUpperCase(Locale.GERMAN).toCharArray();
        for (int i10 = 0; i10 < charArray.length; i10++) {
            if (charArray[i10] > 'Z') {
                for (char[] cArr : f335384j) {
                    if (charArray[i10] == cArr[0]) {
                        charArray[i10] = cArr[1];
                        break;
                    }
                }
            }
        }
        return new String(charArray);
    }

    @Override // nk.g
    public Object a(Object obj) throws nk.h {
        if (obj instanceof String) {
            return f((String) obj);
        }
        throw new nk.h("This method's parameter was expected to be of the type " + String.class.getName() + ". But actually it was of the type " + obj.getClass().getName() + ".");
    }

    public String c(String str) {
        int iB;
        char c10;
        if (str == null) {
            return null;
        }
        String strG = g(str);
        c cVar = new c(strG.length() * 2);
        b bVar = new b(strG.toCharArray());
        char c11 = '/';
        char c12 = '-';
        for (int iB2 = bVar.b(); iB2 > 0; iB2 = iB) {
            char cF = bVar.f();
            iB = bVar.b();
            char cD = iB > 0 ? bVar.d() : '-';
            if (b(f335375a, cF)) {
                c10 = '0';
            } else if (cF == 'H' || cF < 'A' || cF > 'Z') {
                if (c11 != '/') {
                    c10 = '-';
                }
            } else if (cF == 'B' || (cF == 'P' && cD != 'H')) {
                c10 = org.locationtech.jts.geom.l.f338161k;
            } else if ((cF == 'D' || cF == 'T') && !b(f335376b, cD)) {
                c10 = org.locationtech.jts.geom.l.f338162l;
            } else if (b(f335377c, cF)) {
                c10 = '3';
            } else if (b(f335378d, cF)) {
                c10 = '4';
            } else {
                if (cF == 'X' && !b(f335379e, c12)) {
                    bVar.c('S');
                    iB++;
                } else if (cF == 'S' || cF == 'Z') {
                    c10 = '8';
                } else {
                    if (cF == 'C') {
                        if (c11 != '/' ? b(f335381g, c12) || !b(f335382h, cD) : !b(f335380f, cD)) {
                        }
                    } else if (!b(f335383i, cF)) {
                        if (cF == 'R') {
                            c10 = '7';
                        } else if (cF == 'L') {
                            c10 = '5';
                        } else {
                            c10 = (cF == 'M' || cF == 'N') ? '6' : cF;
                        }
                    }
                    c10 = '8';
                }
                c10 = '4';
            }
            if (c10 != '-' && ((c11 != c10 && (c10 != '0' || c11 == '/')) || c10 < '0' || c10 > '8')) {
                cVar.c(c10);
            }
            c11 = c10;
            c12 = cF;
        }
        return cVar.toString();
    }

    public boolean d(String str, String str2) {
        return c(str).equals(c(str2));
    }

    @Override // nk.j
    public String f(String str) {
        return c(str);
    }

    private abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final char[] f335385a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected int f335386b;

        public a(char[] cArr) {
            this.f335386b = 0;
            this.f335385a = cArr;
            this.f335386b = cArr.length;
        }

        protected abstract char[] a(int i10, int i11);

        public int b() {
            return this.f335386b;
        }

        public String toString() {
            return new String(a(0, this.f335386b));
        }

        public a(int i10) {
            this.f335386b = 0;
            this.f335385a = new char[i10];
            this.f335386b = 0;
        }
    }
}
