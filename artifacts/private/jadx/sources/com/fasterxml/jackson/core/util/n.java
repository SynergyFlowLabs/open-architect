package com.fasterxml.jackson.core.util;

import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final char[] f102838l = new char[0];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final int f102839m = 1000;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final int f102840n = 262144;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f102841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private char[] f102842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f102843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f102844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList<char[]> f102845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f102846f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f102847g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private char[] f102848h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f102849i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f102850j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private char[] f102851k;

    public n(a aVar) {
        this.f102841a = aVar;
    }

    private char[] G() {
        int i10;
        String str = this.f102850j;
        if (str != null) {
            return str.toCharArray();
        }
        int i11 = this.f102843c;
        if (i11 >= 0) {
            int i12 = this.f102844d;
            if (i12 < 1) {
                return f102838l;
            }
            return i11 == 0 ? Arrays.copyOf(this.f102842b, i12) : Arrays.copyOfRange(this.f102842b, i11, i12 + i11);
        }
        int iJ = J();
        if (iJ < 1) {
            return f102838l;
        }
        char[] cArrE = e(iJ);
        ArrayList<char[]> arrayList = this.f102845e;
        if (arrayList != null) {
            int size = arrayList.size();
            i10 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                char[] cArr = this.f102845e.get(i13);
                int length = cArr.length;
                System.arraycopy(cArr, 0, cArrE, i10, length);
                i10 += length;
            }
        } else {
            i10 = 0;
        }
        System.arraycopy(this.f102848h, 0, cArrE, i10, this.f102849i);
        return cArrE;
    }

    private void K(int i10) {
        int i11 = this.f102844d;
        this.f102844d = 0;
        char[] cArr = this.f102842b;
        this.f102842b = null;
        int i12 = this.f102843c;
        this.f102843c = -1;
        int i13 = i10 + i11;
        char[] cArr2 = this.f102848h;
        if (cArr2 == null || i13 > cArr2.length) {
            this.f102848h = d(i13);
        }
        if (i11 > 0) {
            System.arraycopy(cArr, i12, this.f102848h, 0, i11);
        }
        this.f102847g = 0;
        this.f102849i = i11;
    }

    private char[] d(int i10) {
        a aVar = this.f102841a;
        return aVar != null ? aVar.d(2, i10) : new char[Math.max(i10, 1000)];
    }

    private char[] e(int i10) {
        return new char[i10];
    }

    private void f() {
        this.f102846f = false;
        this.f102845e.clear();
        this.f102847g = 0;
        this.f102849i = 0;
    }

    private void p(int i10) {
        if (this.f102845e == null) {
            this.f102845e = new ArrayList<>();
        }
        char[] cArr = this.f102848h;
        this.f102846f = true;
        this.f102845e.add(cArr);
        this.f102847g += cArr.length;
        this.f102849i = 0;
        int length = cArr.length;
        int i11 = length + (length >> 1);
        int i12 = 1000;
        if (i11 < 1000) {
            i11 = i12;
        } else {
            i12 = 262144;
            if (i11 > 262144) {
                i11 = i12;
            }
        }
        this.f102848h = e(i11);
    }

    public void A(char c10) {
        this.f102843c = -1;
        this.f102844d = 0;
        this.f102850j = null;
        this.f102851k = null;
        if (this.f102846f) {
            f();
        } else if (this.f102848h == null) {
            this.f102848h = d(1);
        }
        this.f102848h[0] = c10;
        this.f102847g = 1;
        this.f102849i = 1;
    }

    public void B(String str, int i10, int i11) {
        this.f102842b = null;
        this.f102843c = -1;
        this.f102844d = 0;
        this.f102850j = null;
        this.f102851k = null;
        if (this.f102846f) {
            f();
        } else if (this.f102848h == null) {
            this.f102848h = d(i11);
        }
        this.f102847g = 0;
        this.f102849i = 0;
        b(str, i10, i11);
    }

    public void C(char[] cArr, int i10, int i11) {
        this.f102842b = null;
        this.f102843c = -1;
        this.f102844d = 0;
        this.f102850j = null;
        this.f102851k = null;
        if (this.f102846f) {
            f();
        } else if (this.f102848h == null) {
            this.f102848h = d(i11);
        }
        this.f102847g = 0;
        this.f102849i = 0;
        c(cArr, i10, i11);
    }

    public void D() {
        this.f102843c = -1;
        this.f102849i = 0;
        this.f102844d = 0;
        this.f102842b = null;
        this.f102850j = null;
        this.f102851k = null;
        if (this.f102846f) {
            f();
        }
    }

    public void E(char[] cArr, int i10, int i11) {
        this.f102850j = null;
        this.f102851k = null;
        this.f102842b = cArr;
        this.f102843c = i10;
        this.f102844d = i11;
        if (this.f102846f) {
            f();
        }
    }

    public void F(String str) {
        this.f102842b = null;
        this.f102843c = -1;
        this.f102844d = 0;
        this.f102850j = str;
        this.f102851k = null;
        if (this.f102846f) {
            f();
        }
        this.f102849i = 0;
    }

    public String H(int i10) {
        this.f102849i = i10;
        if (this.f102847g > 0) {
            return l();
        }
        String str = i10 == 0 ? "" : new String(this.f102848h, 0, i10);
        this.f102850j = str;
        return str;
    }

    public void I(int i10) {
        this.f102849i = i10;
    }

    public int J() {
        if (this.f102843c >= 0) {
            return this.f102844d;
        }
        char[] cArr = this.f102851k;
        if (cArr != null) {
            return cArr.length;
        }
        String str = this.f102850j;
        return str != null ? str.length() : this.f102847g + this.f102849i;
    }

    public void a(char c10) {
        if (this.f102843c >= 0) {
            K(16);
        }
        this.f102850j = null;
        this.f102851k = null;
        char[] cArr = this.f102848h;
        if (this.f102849i >= cArr.length) {
            p(1);
            cArr = this.f102848h;
        }
        int i10 = this.f102849i;
        this.f102849i = i10 + 1;
        cArr[i10] = c10;
    }

    public void b(String str, int i10, int i11) {
        if (this.f102843c >= 0) {
            K(i11);
        }
        this.f102850j = null;
        this.f102851k = null;
        char[] cArr = this.f102848h;
        int length = cArr.length;
        int i12 = this.f102849i;
        int i13 = length - i12;
        if (i13 >= i11) {
            str.getChars(i10, i10 + i11, cArr, i12);
            this.f102849i += i11;
            return;
        }
        if (i13 > 0) {
            int i14 = i10 + i13;
            str.getChars(i10, i14, cArr, i12);
            i11 -= i13;
            i10 = i14;
        }
        while (true) {
            p(i11);
            int iMin = Math.min(this.f102848h.length, i11);
            int i15 = i10 + iMin;
            str.getChars(i10, i15, this.f102848h, 0);
            this.f102849i += iMin;
            i11 -= iMin;
            if (i11 <= 0) {
                return;
            } else {
                i10 = i15;
            }
        }
    }

    public void c(char[] cArr, int i10, int i11) {
        if (this.f102843c >= 0) {
            K(i11);
        }
        this.f102850j = null;
        this.f102851k = null;
        char[] cArr2 = this.f102848h;
        int length = cArr2.length;
        int i12 = this.f102849i;
        int i13 = length - i12;
        if (i13 >= i11) {
            System.arraycopy(cArr, i10, cArr2, i12, i11);
            this.f102849i += i11;
            return;
        }
        if (i13 > 0) {
            System.arraycopy(cArr, i10, cArr2, i12, i13);
            i10 += i13;
            i11 -= i13;
        }
        do {
            p(i11);
            int iMin = Math.min(this.f102848h.length, i11);
            System.arraycopy(cArr, i10, this.f102848h, 0, iMin);
            this.f102849i += iMin;
            i10 += iMin;
            i11 -= iMin;
        } while (i11 > 0);
    }

    public char[] g() {
        char[] cArr = this.f102851k;
        if (cArr != null) {
            return cArr;
        }
        char[] cArrG = G();
        this.f102851k = cArrG;
        return cArrG;
    }

    public BigDecimal h() throws NumberFormatException {
        char[] cArr;
        char[] cArr2;
        char[] cArr3 = this.f102851k;
        if (cArr3 != null) {
            return com.fasterxml.jackson.core.io.i.h(cArr3);
        }
        int i10 = this.f102843c;
        if (i10 < 0 || (cArr2 = this.f102842b) == null) {
            return (this.f102847g != 0 || (cArr = this.f102848h) == null) ? com.fasterxml.jackson.core.io.i.h(g()) : com.fasterxml.jackson.core.io.i.i(cArr, 0, this.f102849i);
        }
        return com.fasterxml.jackson.core.io.i.i(cArr2, i10, this.f102844d);
    }

    public double i() throws NumberFormatException {
        return com.fasterxml.jackson.core.io.i.j(l());
    }

    public int j(boolean z10) {
        char[] cArr;
        int i10 = this.f102843c;
        if (i10 < 0 || (cArr = this.f102842b) == null) {
            return z10 ? -com.fasterxml.jackson.core.io.i.l(this.f102848h, 1, this.f102849i - 1) : com.fasterxml.jackson.core.io.i.l(this.f102848h, 0, this.f102849i);
        }
        return z10 ? -com.fasterxml.jackson.core.io.i.l(cArr, i10 + 1, this.f102844d - 1) : com.fasterxml.jackson.core.io.i.l(cArr, i10, this.f102844d);
    }

    public long k(boolean z10) {
        char[] cArr;
        int i10 = this.f102843c;
        if (i10 < 0 || (cArr = this.f102842b) == null) {
            return z10 ? -com.fasterxml.jackson.core.io.i.n(this.f102848h, 1, this.f102849i - 1) : com.fasterxml.jackson.core.io.i.n(this.f102848h, 0, this.f102849i);
        }
        return z10 ? -com.fasterxml.jackson.core.io.i.n(cArr, i10 + 1, this.f102844d - 1) : com.fasterxml.jackson.core.io.i.n(cArr, i10, this.f102844d);
    }

    public String l() {
        if (this.f102850j == null) {
            char[] cArr = this.f102851k;
            if (cArr != null) {
                this.f102850j = new String(cArr);
            } else {
                int i10 = this.f102843c;
                if (i10 >= 0) {
                    int i11 = this.f102844d;
                    if (i11 < 1) {
                        this.f102850j = "";
                        return "";
                    }
                    this.f102850j = new String(this.f102842b, i10, i11);
                } else {
                    int i12 = this.f102847g;
                    int i13 = this.f102849i;
                    if (i12 == 0) {
                        this.f102850j = i13 != 0 ? new String(this.f102848h, 0, i13) : "";
                    } else {
                        StringBuilder sb2 = new StringBuilder(i12 + i13);
                        ArrayList<char[]> arrayList = this.f102845e;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            for (int i14 = 0; i14 < size; i14++) {
                                char[] cArr2 = this.f102845e.get(i14);
                                sb2.append(cArr2, 0, cArr2.length);
                            }
                        }
                        sb2.append(this.f102848h, 0, this.f102849i);
                        this.f102850j = sb2.toString();
                    }
                }
            }
        }
        return this.f102850j;
    }

    public int m(Writer writer) throws IOException {
        int i10;
        char[] cArr = this.f102851k;
        if (cArr != null) {
            writer.write(cArr);
            return this.f102851k.length;
        }
        String str = this.f102850j;
        if (str != null) {
            writer.write(str);
            return this.f102850j.length();
        }
        int i11 = this.f102843c;
        if (i11 >= 0) {
            int i12 = this.f102844d;
            if (i12 > 0) {
                writer.write(this.f102842b, i11, i12);
            }
            return i12;
        }
        ArrayList<char[]> arrayList = this.f102845e;
        if (arrayList != null) {
            int size = arrayList.size();
            i10 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                char[] cArr2 = this.f102845e.get(i13);
                int length = cArr2.length;
                writer.write(cArr2, 0, length);
                i10 += length;
            }
        } else {
            i10 = 0;
        }
        int i14 = this.f102849i;
        if (i14 > 0) {
            writer.write(this.f102848h, 0, i14);
            i10 += i14;
        }
        return i10;
    }

    public char[] n() {
        this.f102843c = -1;
        this.f102849i = 0;
        this.f102844d = 0;
        this.f102842b = null;
        this.f102850j = null;
        this.f102851k = null;
        if (this.f102846f) {
            f();
        }
        char[] cArr = this.f102848h;
        if (cArr != null) {
            return cArr;
        }
        char[] cArrD = d(0);
        this.f102848h = cArrD;
        return cArrD;
    }

    public void o() {
        if (this.f102843c >= 0) {
            K(16);
        }
    }

    public char[] q() {
        char[] cArr = this.f102848h;
        int length = cArr.length;
        int i10 = (length >> 1) + length;
        if (i10 > 262144) {
            i10 = (length >> 2) + length;
        }
        char[] cArrCopyOf = Arrays.copyOf(cArr, i10);
        this.f102848h = cArrCopyOf;
        return cArrCopyOf;
    }

    public char[] r(int i10) {
        char[] cArr = this.f102848h;
        if (cArr.length >= i10) {
            return cArr;
        }
        char[] cArrCopyOf = Arrays.copyOf(cArr, i10);
        this.f102848h = cArrCopyOf;
        return cArrCopyOf;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002c A[PHI: r1
      0x002c: PHI (r1v7 int) = (r1v5 int), (r1v6 int) binds: [B:6:0x002a, B:9:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    public char[] s() {
        if (this.f102845e == null) {
            this.f102845e = new ArrayList<>();
        }
        this.f102846f = true;
        this.f102845e.add(this.f102848h);
        int length = this.f102848h.length;
        this.f102847g += length;
        this.f102849i = 0;
        int i10 = length + (length >> 1);
        int i11 = 1000;
        if (i10 < 1000) {
            i10 = i11;
        } else {
            i11 = 262144;
            if (i10 > 262144) {
                i10 = i11;
            }
        }
        char[] cArrE = e(i10);
        this.f102848h = cArrE;
        return cArrE;
    }

    public char[] t() {
        return this.f102848h;
    }

    public String toString() {
        return l();
    }

    public char[] u() {
        if (this.f102843c >= 0) {
            K(1);
        } else {
            char[] cArr = this.f102848h;
            if (cArr == null) {
                this.f102848h = d(0);
            } else if (this.f102849i >= cArr.length) {
                p(1);
            }
        }
        return this.f102848h;
    }

    public int v() {
        return this.f102849i;
    }

    public char[] w() {
        if (this.f102843c >= 0) {
            return this.f102842b;
        }
        char[] cArr = this.f102851k;
        if (cArr != null) {
            return cArr;
        }
        String str = this.f102850j;
        if (str != null) {
            char[] charArray = str.toCharArray();
            this.f102851k = charArray;
            return charArray;
        }
        if (this.f102846f) {
            return g();
        }
        char[] cArr2 = this.f102848h;
        return cArr2 == null ? f102838l : cArr2;
    }

    public int x() {
        int i10 = this.f102843c;
        if (i10 >= 0) {
            return i10;
        }
        return 0;
    }

    public boolean y() {
        return this.f102843c >= 0 || this.f102851k != null || this.f102850j == null;
    }

    public void z() {
        if (this.f102841a == null) {
            D();
            return;
        }
        if (this.f102848h != null) {
            D();
            char[] cArr = this.f102848h;
            this.f102848h = null;
            int i10 = 4 << 2;
            this.f102841a.j(2, cArr);
        }
    }
}
