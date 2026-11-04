package com.fasterxml.jackson.core.sym;

import androidx.compose.animation.core.z1;
import java.util.Arrays;
import java.util.BitSet;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f102718n = 33;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f102719o = 64;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f102720p = 65536;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final int f102721q = 12000;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final int f102722r = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f102723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference<C0928b> f102724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f102725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f102726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f102727e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String[] f102728f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a[] f102729g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f102730h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f102731i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f102732j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f102733k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f102734l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private BitSet f102735m;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f102736a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f102737b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f102738c;

        public a(String str, a aVar) {
            this.f102736a = str;
            this.f102737b = aVar;
            this.f102738c = aVar != null ? 1 + aVar.f102738c : 1;
        }

        public String a(char[] cArr, int i10, int i11) {
            if (this.f102736a.length() != i11) {
                return null;
            }
            int i12 = 0;
            while (this.f102736a.charAt(i12) == cArr[i10 + i12]) {
                i12++;
                if (i12 >= i11) {
                    return this.f102736a;
                }
            }
            return null;
        }
    }

    private b(int i10) {
        this.f102723a = null;
        this.f102725c = i10;
        this.f102727e = true;
        this.f102726d = -1;
        this.f102734l = false;
        this.f102733k = 0;
        this.f102724b = new AtomicReference<>(C0928b.a(64));
    }

    private String a(char[] cArr, int i10, int i11, int i12, int i13) {
        if (this.f102734l) {
            n();
            this.f102734l = false;
        } else if (this.f102730h >= this.f102731i) {
            w();
            i13 = d(l(cArr, i10, i11));
        }
        String str = new String(cArr, i10, i11);
        if (com.fasterxml.jackson.core.f.a.INTERN_FIELD_NAMES.n(this.f102726d)) {
            str = com.fasterxml.jackson.core.util.g.f102818d.a(str);
        }
        this.f102730h++;
        String[] strArr = this.f102728f;
        if (strArr[i13] == null) {
            strArr[i13] = str;
            return str;
        }
        int i14 = i13 >> 1;
        a aVar = new a(str, this.f102729g[i14]);
        int i15 = aVar.f102738c;
        if (i15 > 100) {
            c(i14, aVar);
            return str;
        }
        this.f102729g[i14] = aVar;
        this.f102733k = Math.max(i15, this.f102733k);
        return str;
    }

    private String b(char[] cArr, int i10, int i11, a aVar) {
        while (aVar != null) {
            String strA = aVar.a(cArr, i10, i11);
            if (strA != null) {
                return strA;
            }
            aVar = aVar.f102737b;
        }
        return null;
    }

    private void c(int i10, a aVar) {
        BitSet bitSet = this.f102735m;
        if (bitSet == null) {
            BitSet bitSet2 = new BitSet();
            this.f102735m = bitSet2;
            bitSet2.set(i10);
        } else if (bitSet.get(i10)) {
            if (com.fasterxml.jackson.core.f.a.FAIL_ON_SYMBOL_HASH_OVERFLOW.n(this.f102726d)) {
                y(100);
            }
            this.f102727e = false;
        } else {
            this.f102735m.set(i10);
        }
        this.f102728f[i10 + i10] = aVar.f102736a;
        this.f102729g[i10] = null;
        this.f102730h -= aVar.f102738c;
        int i11 = 2 | (-1);
        this.f102733k = -1;
    }

    private static int e(int i10) {
        return i10 - (i10 >> 2);
    }

    private void n() {
        String[] strArr = this.f102728f;
        this.f102728f = (String[]) Arrays.copyOf(strArr, strArr.length);
        a[] aVarArr = this.f102729g;
        this.f102729g = (a[]) Arrays.copyOf(aVarArr, aVarArr.length);
    }

    public static b o() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return p((((int) jCurrentTimeMillis) + ((int) (jCurrentTimeMillis >>> 32))) | 1);
    }

    protected static b p(int i10) {
        return new b(i10);
    }

    private void v(C0928b c0928b) {
        int i10 = c0928b.f102739a;
        C0928b c0928b2 = this.f102724b.get();
        if (i10 == c0928b2.f102739a) {
            return;
        }
        if (i10 > f102721q) {
            c0928b = C0928b.a(64);
        }
        z1.a(this.f102724b, c0928b2, c0928b);
    }

    private void w() {
        String[] strArr = this.f102728f;
        int length = strArr.length;
        int i10 = length + length;
        if (i10 > 65536) {
            this.f102730h = 0;
            this.f102727e = false;
            this.f102728f = new String[64];
            this.f102729g = new a[32];
            this.f102732j = 63;
            this.f102734l = false;
            return;
        }
        a[] aVarArr = this.f102729g;
        this.f102728f = new String[i10];
        this.f102729g = new a[i10 >> 1];
        this.f102732j = i10 - 1;
        this.f102731i = e(i10);
        int i11 = 0;
        int iMax = 0;
        for (String str : strArr) {
            if (str != null) {
                i11++;
                int iD = d(k(str));
                String[] strArr2 = this.f102728f;
                if (strArr2[iD] == null) {
                    strArr2[iD] = str;
                } else {
                    int i12 = iD >> 1;
                    a aVar = new a(str, this.f102729g[i12]);
                    this.f102729g[i12] = aVar;
                    iMax = Math.max(iMax, aVar.f102738c);
                }
            }
        }
        int i13 = length >> 1;
        for (int i14 = 0; i14 < i13; i14++) {
            for (a aVar2 = aVarArr[i14]; aVar2 != null; aVar2 = aVar2.f102737b) {
                i11++;
                String str2 = aVar2.f102736a;
                int iD2 = d(k(str2));
                String[] strArr3 = this.f102728f;
                if (strArr3[iD2] == null) {
                    strArr3[iD2] = str2;
                } else {
                    int i15 = iD2 >> 1;
                    a aVar3 = new a(str2, this.f102729g[i15]);
                    this.f102729g[i15] = aVar3;
                    iMax = Math.max(iMax, aVar3.f102738c);
                }
            }
        }
        this.f102733k = iMax;
        this.f102735m = null;
        if (i11 != this.f102730h) {
            throw new IllegalStateException(String.format("Internal error on SymbolTable.rehash(): had %d entries; now have %d", Integer.valueOf(this.f102730h), Integer.valueOf(i11)));
        }
    }

    public int d(int i10) {
        int i11 = i10 + (i10 >>> 15);
        int i12 = i11 ^ (i11 << 7);
        return this.f102732j & (i12 + (i12 >>> 3));
    }

    public int j() {
        return this.f102728f.length;
    }

    public int k(String str) {
        int length = str.length();
        int iCharAt = this.f102725c;
        for (int i10 = 0; i10 < length; i10++) {
            iCharAt = (iCharAt * 33) + str.charAt(i10);
        }
        if (iCharAt == 0) {
            return 1;
        }
        return iCharAt;
    }

    public int l(char[] cArr, int i10, int i11) {
        int i12 = this.f102725c;
        int i13 = i11 + i10;
        while (i10 < i13) {
            i12 = (i12 * 33) + cArr[i10];
            i10++;
        }
        if (i12 == 0) {
            return 1;
        }
        return i12;
    }

    public int m() {
        int i10 = 0;
        for (a aVar : this.f102729g) {
            if (aVar != null) {
                i10 += aVar.f102738c;
            }
        }
        return i10;
    }

    public String q(char[] cArr, int i10, int i11, int i12) {
        if (i11 < 1) {
            return "";
        }
        if (!this.f102727e) {
            return new String(cArr, i10, i11);
        }
        int iD = d(i12);
        String str = this.f102728f[iD];
        if (str != null) {
            if (str.length() == i11) {
                int i13 = 0;
                while (str.charAt(i13) == cArr[i10 + i13]) {
                    i13++;
                    if (i13 == i11) {
                        return str;
                    }
                }
            }
            a aVar = this.f102729g[iD >> 1];
            if (aVar != null) {
                String strA = aVar.a(cArr, i10, i11);
                if (strA != null) {
                    return strA;
                }
                String strB = b(cArr, i10, i11, aVar.f102737b);
                if (strB != null) {
                    return strB;
                }
            }
        }
        return a(cArr, i10, i11, i12, iD);
    }

    public int r() {
        return this.f102725c;
    }

    public b s(int i10) {
        return new b(this, i10, this.f102725c, this.f102724b.get());
    }

    public int t() {
        return this.f102733k;
    }

    public boolean u() {
        return !this.f102734l;
    }

    public void x() {
        b bVar;
        if (u() && (bVar = this.f102723a) != null && this.f102727e) {
            bVar.v(new C0928b(this));
            this.f102734l = true;
        }
    }

    protected void y(int i10) {
        throw new IllegalStateException("Longest collision chain in symbol table (of size " + this.f102730h + ") now exceeds maximum, " + i10 + " -- suspect a DoS attack based on hash collisions");
    }

    public int z() {
        AtomicReference<C0928b> atomicReference = this.f102724b;
        return atomicReference != null ? atomicReference.get().f102739a : this.f102730h;
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.core.sym.b$b, reason: collision with other inner class name */
    private static final class C0928b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f102739a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f102740b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String[] f102741c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final a[] f102742d;

        public C0928b(int i10, int i11, String[] strArr, a[] aVarArr) {
            this.f102739a = i10;
            this.f102740b = i11;
            this.f102741c = strArr;
            this.f102742d = aVarArr;
        }

        public static C0928b a(int i10) {
            return new C0928b(0, 0, new String[i10], new a[i10 >> 1]);
        }

        public C0928b(b bVar) {
            this.f102739a = bVar.f102730h;
            this.f102740b = bVar.f102733k;
            this.f102741c = bVar.f102728f;
            this.f102742d = bVar.f102729g;
        }
    }

    private b(b bVar, int i10, int i11, C0928b c0928b) {
        this.f102723a = bVar;
        this.f102725c = i11;
        this.f102724b = null;
        this.f102726d = i10;
        this.f102727e = com.fasterxml.jackson.core.f.a.CANONICALIZE_FIELD_NAMES.n(i10);
        String[] strArr = c0928b.f102741c;
        this.f102728f = strArr;
        this.f102729g = c0928b.f102742d;
        this.f102730h = c0928b.f102739a;
        this.f102733k = c0928b.f102740b;
        int length = strArr.length;
        this.f102731i = e(length);
        this.f102732j = length - 1;
        this.f102734l = true;
    }
}
