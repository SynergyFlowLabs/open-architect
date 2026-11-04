package com.fasterxml.jackson.core;

import androidx.collection.g3;

/* JADX INFO: loaded from: classes4.dex */
public class k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final char f102635f = '/';

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected static final k f102636g = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final k f102637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected volatile k f102638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final String f102639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final String f102640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final int f102641e;

    protected k() {
        this.f102637a = null;
        this.f102640d = "";
        this.f102641e = -1;
        this.f102639c = "";
    }

    private static void a(StringBuilder sb2, char c10) {
        if (c10 == '0') {
            c10 = '~';
        } else if (c10 == '1') {
            c10 = '/';
        } else {
            sb2.append('~');
        }
        sb2.append(c10);
    }

    private static void b(StringBuilder sb2, String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '/') {
                sb2.append("~1");
            } else if (cCharAt == '~') {
                sb2.append("~0");
            } else {
                sb2.append(cCharAt);
            }
        }
    }

    private static String e(k kVar, String str) {
        if (kVar == null) {
            StringBuilder sb2 = new StringBuilder(str.length() + 1);
            sb2.append('/');
            b(sb2, str);
            return sb2.toString();
        }
        String str2 = kVar.f102639c;
        StringBuilder sb3 = new StringBuilder(str.length() + 1 + str2.length());
        sb3.append('/');
        b(sb3, str);
        sb3.append(str2);
        return sb3.toString();
    }

    private static final int f(String str) {
        int length = str.length();
        if (length == 0 || length > 10) {
            return -1;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt <= '0') {
            return (length == 1 && cCharAt == '0') ? 0 : -1;
        }
        if (cCharAt > '9') {
            return -1;
        }
        for (int i10 = 1; i10 < length; i10++) {
            char cCharAt2 = str.charAt(i10);
            if (cCharAt2 > '9' || cCharAt2 < '0') {
                return -1;
            }
        }
        if (length != 10 || com.fasterxml.jackson.core.io.i.m(str) <= g3.f12256c) {
            return com.fasterxml.jackson.core.io.i.k(str);
        }
        return -1;
    }

    protected static k g(String str, int i10) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(Math.max(16, length));
        if (i10 > 2) {
            sb2.append((CharSequence) str, 1, i10 - 1);
        }
        int i11 = i10 + 1;
        a(sb2, str.charAt(i10));
        while (i11 < length) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == '/') {
                return new k(str, sb2.toString(), h(str.substring(i11)));
            }
            int i12 = i11 + 1;
            if (cCharAt != '~' || i12 >= length) {
                sb2.append(cCharAt);
                i11 = i12;
            } else {
                i11 += 2;
                a(sb2, str.charAt(i12));
            }
        }
        return new k(str, sb2.toString(), f102636g);
    }

    protected static k h(String str) {
        int length = str.length();
        int i10 = 1;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '/') {
                return new k(str, str.substring(1, i10), h(str.substring(i10)));
            }
            i10++;
            if (cCharAt == '~' && i10 < length) {
                return g(str, i10);
            }
        }
        return new k(str, str.substring(1), f102636g);
    }

    public static k j(String str) throws IllegalArgumentException {
        if (str != null && str.length() != 0) {
            if (str.charAt(0) == '/') {
                return h(str);
            }
            throw new IllegalArgumentException("Invalid input: JSON Pointer expression must start with '/': \"" + str + "\"");
        }
        return f102636g;
    }

    public static k k(m mVar, boolean z10) {
        if (mVar == null) {
            return f102636g;
        }
        if (!mVar.j() && (!z10 || !mVar.m() || !mVar.h())) {
            mVar = mVar.e();
        }
        k kVar = null;
        while (mVar != null) {
            if (mVar.l()) {
                String strB = mVar.b();
                if (strB == null) {
                    strB = "";
                }
                kVar = new k(e(kVar, strB), strB, kVar);
            } else if (mVar.k() || z10) {
                int iA = mVar.a();
                String strValueOf = String.valueOf(iA);
                kVar = new k(e(kVar, strValueOf), strValueOf, iA, kVar);
            }
            mVar = mVar.e();
        }
        return kVar == null ? f102636g : kVar;
    }

    public static k x(String str) {
        return j(str);
    }

    protected k c() {
        k kVarO = o();
        if (kVarO == this) {
            return f102636g;
        }
        int length = kVarO.f102639c.length();
        k kVar = this.f102637a;
        String str = this.f102639c;
        int i10 = 3 << 0;
        return new k(str.substring(0, str.length() - length), this.f102640d, this.f102641e, kVar.d(length, kVarO));
    }

    protected k d(int i10, k kVar) {
        if (this == kVar) {
            return f102636g;
        }
        k kVar2 = this.f102637a;
        String str = this.f102639c;
        return new k(str.substring(0, str.length() - i10), this.f102640d, this.f102641e, kVar2.d(i10, kVar));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof k)) {
            return this.f102639c.equals(((k) obj).f102639c);
        }
        return false;
    }

    public int hashCode() {
        return this.f102639c.hashCode();
    }

    public k i(k kVar) {
        k kVar2 = f102636g;
        if (this == kVar2) {
            return kVar;
        }
        if (kVar == kVar2) {
            return this;
        }
        String strSubstring = this.f102639c;
        if (strSubstring.endsWith("/")) {
            strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
        }
        return j(strSubstring + kVar.f102639c);
    }

    public int l() {
        return this.f102641e;
    }

    public String m() {
        return this.f102640d;
    }

    public k n() {
        k kVarC = this.f102638b;
        if (kVarC == null) {
            if (this != f102636g) {
                kVarC = c();
            }
            this.f102638b = kVarC;
        }
        return kVarC;
    }

    public k o() {
        if (this == f102636g) {
            return null;
        }
        while (true) {
            k kVar = this.f102637a;
            if (kVar == f102636g) {
                return this;
            }
            this = kVar;
        }
    }

    public k p(int i10) {
        if (i10 != this.f102641e || i10 < 0) {
            return null;
        }
        return this.f102637a;
    }

    public k q(String str) {
        if (this.f102637a == null || !this.f102640d.equals(str)) {
            return null;
        }
        return this.f102637a;
    }

    public boolean r() {
        return this.f102637a == null;
    }

    public boolean s(int i10) {
        return i10 == this.f102641e && i10 >= 0;
    }

    public boolean t(String str) {
        return this.f102637a != null && this.f102640d.equals(str);
    }

    public String toString() {
        return this.f102639c;
    }

    public boolean u() {
        return this.f102641e >= 0;
    }

    public boolean v() {
        return this.f102640d != null;
    }

    public k w() {
        return this.f102637a;
    }

    protected k(String str, String str2, k kVar) {
        this.f102639c = str;
        this.f102637a = kVar;
        this.f102640d = str2;
        this.f102641e = f(str2);
    }

    protected k(String str, String str2, int i10, k kVar) {
        this.f102639c = str;
        this.f102637a = kVar;
        this.f102640d = str2;
        this.f102641e = i10;
    }
}
