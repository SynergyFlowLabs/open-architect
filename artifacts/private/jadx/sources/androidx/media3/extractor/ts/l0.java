package androidx.media3.extractor.ts;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.w0;
import androidx.media3.common.v0;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class l0 implements androidx.media3.extractor.r {
    public static final int A = 2;
    public static final int B = 1;

    @Deprecated
    public static final androidx.media3.extractor.w C = new androidx.media3.extractor.w() { // from class: androidx.media3.extractor.ts.k0
        @Override // androidx.media3.extractor.w
        public final androidx.media3.extractor.r[] c() {
            return l0.d();
        }
    };
    public static final int D = 188;
    public static final int E = 112800;
    public static final int F = 3;
    public static final int G = 4;
    public static final int H = 15;
    public static final int I = 17;
    public static final int J = 129;
    public static final int K = 138;
    public static final int L = 130;
    public static final int M = 135;
    public static final int N = 172;
    public static final int O = 2;
    public static final int P = 16;
    public static final int Q = 27;
    public static final int R = 36;
    public static final int S = 45;
    public static final int T = 21;
    public static final int U = 134;
    public static final int V = 89;
    public static final int W = 136;
    public static final int X = 139;
    public static final int Y = 128;
    public static final int Z = 257;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f69185a0 = 71;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final int f69186b0 = 0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final int f69187c0 = 8192;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final long f69188d0 = 1094921523;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final long f69189e0 = 1161904947;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final long f69190f0 = 1094921524;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final long f69191g0 = 1212503619;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final int f69192h0 = 9400;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final int f69193i0 = 5;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f69194y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f69195z = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f69196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f69197e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f69198f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<w0> f69199g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final androidx.media3.common.util.o0 f69200h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final SparseIntArray f69201i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final m0.c f69202j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final androidx.media3.extractor.text.r.a f69203k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final SparseArray<m0> f69204l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final SparseBooleanArray f69205m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SparseBooleanArray f69206n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final i0 f69207o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private h0 f69208p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private androidx.media3.extractor.t f69209q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f69210r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f69211s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f69212t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f69213u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.p0
    private m0 f69214v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f69215w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f69216x;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    private class c implements d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.media3.common.util.n0 f69217a = new androidx.media3.common.util.n0(new byte[4]);

        public c() {
        }

        @Override // androidx.media3.extractor.ts.d0
        public void b(androidx.media3.common.util.o0 o0Var) {
            if (o0Var.L() == 0 && (o0Var.L() & 128) != 0) {
                o0Var.b0(6);
                int iA = o0Var.a() / 4;
                for (int i10 = 0; i10 < iA; i10++) {
                    o0Var.l(this.f69217a, 4);
                    int iH = this.f69217a.h(16);
                    this.f69217a.s(3);
                    if (iH == 0) {
                        this.f69217a.s(13);
                    } else {
                        int iH2 = this.f69217a.h(13);
                        if (l0.this.f69204l.get(iH2) == null) {
                            l0.this.f69204l.put(iH2, new e0(l0.this.new d(iH2)));
                            l0.n(l0.this);
                        }
                    }
                }
                if (l0.this.f69196d != 2) {
                    l0.this.f69204l.remove(0);
                }
            }
        }

        @Override // androidx.media3.extractor.ts.d0
        public void c(w0 w0Var, androidx.media3.extractor.t tVar, m0.e eVar) {
        }
    }

    private class d implements d0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f69219f = 5;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f69220g = 10;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f69221h = 106;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f69222i = 111;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int f69223j = 122;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final int f69224k = 123;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final int f69225l = 127;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final int f69226m = 89;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final int f69227n = 21;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final int f69228o = 14;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final int f69229p = 33;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.media3.common.util.n0 f69230a = new androidx.media3.common.util.n0(new byte[5]);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SparseArray<m0> f69231b = new SparseArray<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final SparseIntArray f69232c = new SparseIntArray();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f69233d;

        public d(int i10) {
            this.f69233d = i10;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0047  */
        /* JADX WARN: Code duplicated, block: B:24:0x005c  */
        /* JADX WARN: Code duplicated, block: B:27:0x0063  */
        private m0.b a(androidx.media3.common.util.o0 o0Var, int i10) {
            int i11;
            int iF = o0Var.f();
            int i12 = i10 + iF;
            int i13 = -1;
            String str = null;
            ArrayList arrayList = null;
            int iL = 0;
            while (o0Var.f() < i12) {
                int iL2 = o0Var.L();
                int iF2 = o0Var.f() + o0Var.L();
                if (iF2 > i12) {
                    break;
                }
                if (iL2 == 5) {
                    long jN = o0Var.N();
                    if (jN == l0.f69188d0) {
                        i13 = 129;
                    } else if (jN == l0.f69189e0) {
                        i13 = 135;
                    } else if (jN == l0.f69190f0) {
                        i13 = 172;
                    } else if (jN == l0.f69191g0) {
                        i13 = 36;
                    }
                } else if (iL2 == 106) {
                    i13 = 129;
                } else if (iL2 == f69223j) {
                    i13 = 135;
                } else if (iL2 == 127) {
                    int iL3 = o0Var.L();
                    if (iL3 == 21) {
                        i13 = 172;
                    } else if (iL3 == 14) {
                        i13 = 136;
                    } else if (iL3 == 33) {
                        i13 = 139;
                    }
                } else {
                    if (iL2 == f69224k) {
                        i11 = 138;
                    } else if (iL2 == 10) {
                        String strTrim = o0Var.I(3).trim();
                        iL = o0Var.L();
                        str = strTrim;
                    } else if (iL2 == 89) {
                        ArrayList arrayList2 = new ArrayList();
                        while (o0Var.f() < iF2) {
                            String strTrim2 = o0Var.I(3).trim();
                            int iL4 = o0Var.L();
                            byte[] bArr = new byte[4];
                            o0Var.n(bArr, 0, 4);
                            arrayList2.add(new m0.a(strTrim2, iL4, bArr));
                        }
                        arrayList = arrayList2;
                        i13 = 89;
                    } else if (iL2 == 111) {
                        i11 = 257;
                    }
                    i13 = i11;
                }
                o0Var.b0(iF2 - o0Var.f());
            }
            o0Var.a0(i12);
            return new m0.b(i13, str, iL, arrayList, Arrays.copyOfRange(o0Var.e(), iF, i12));
        }

        @Override // androidx.media3.extractor.ts.d0
        public void b(androidx.media3.common.util.o0 o0Var) {
            w0 w0Var;
            if (o0Var.L() != 2) {
                return;
            }
            if (l0.this.f69196d == 1 || l0.this.f69196d == 2 || l0.this.f69210r == 1) {
                w0Var = (w0) l0.this.f69199g.get(0);
            } else {
                w0Var = new w0(((w0) l0.this.f69199g.get(0)).d());
                l0.this.f69199g.add(w0Var);
            }
            if ((o0Var.L() & 128) == 0) {
                return;
            }
            o0Var.b0(1);
            int iT = o0Var.T();
            int i10 = 3;
            o0Var.b0(3);
            o0Var.l(this.f69230a, 2);
            this.f69230a.s(3);
            int i11 = 13;
            l0.this.f69216x = this.f69230a.h(13);
            o0Var.l(this.f69230a, 2);
            int i12 = 4;
            this.f69230a.s(4);
            o0Var.b0(this.f69230a.h(12));
            if (l0.this.f69196d == 2 && l0.this.f69214v == null) {
                m0.b bVar = new m0.b(21, null, 0, null, k1.f61545f);
                l0 l0Var = l0.this;
                l0Var.f69214v = l0Var.f69202j.b(21, bVar);
                if (l0.this.f69214v != null) {
                    l0.this.f69214v.c(w0Var, l0.this.f69209q, new m0.e(iT, 21, 8192));
                }
            }
            this.f69231b.clear();
            this.f69232c.clear();
            int iA = o0Var.a();
            while (iA > 0) {
                o0Var.l(this.f69230a, 5);
                int iH = this.f69230a.h(8);
                this.f69230a.s(i10);
                int iH2 = this.f69230a.h(i11);
                this.f69230a.s(i12);
                int iH3 = this.f69230a.h(12);
                m0.b bVarA = a(o0Var, iH3);
                if (iH == 6 || iH == 5) {
                    iH = bVarA.f69245a;
                }
                iA -= iH3 + 5;
                int i13 = l0.this.f69196d == 2 ? iH : iH2;
                if (!l0.this.f69205m.get(i13)) {
                    m0 m0VarB = (l0.this.f69196d == 2 && iH == 21) ? l0.this.f69214v : l0.this.f69202j.b(iH, bVarA);
                    if (l0.this.f69196d != 2 || iH2 < this.f69232c.get(i13, 8192)) {
                        this.f69232c.put(i13, iH2);
                        this.f69231b.put(i13, m0VarB);
                    }
                }
                i10 = 3;
                i12 = 4;
                i11 = 13;
            }
            int size = this.f69232c.size();
            for (int i14 = 0; i14 < size; i14++) {
                int iKeyAt = this.f69232c.keyAt(i14);
                int iValueAt = this.f69232c.valueAt(i14);
                l0.this.f69205m.put(iKeyAt, true);
                l0.this.f69206n.put(iValueAt, true);
                m0 m0VarValueAt = this.f69231b.valueAt(i14);
                if (m0VarValueAt != null) {
                    if (m0VarValueAt != l0.this.f69214v) {
                        m0VarValueAt.c(w0Var, l0.this.f69209q, new m0.e(iT, iKeyAt, 8192));
                    }
                    l0.this.f69204l.put(iValueAt, m0VarValueAt);
                }
            }
            if (l0.this.f69196d == 2) {
                if (l0.this.f69211s) {
                    return;
                }
                l0.this.f69209q.l();
                l0.this.f69210r = 0;
                l0.this.f69211s = true;
                return;
            }
            l0.this.f69204l.remove(this.f69233d);
            l0 l0Var2 = l0.this;
            l0Var2.f69210r = l0Var2.f69196d == 1 ? 0 : l0.this.f69210r - 1;
            if (l0.this.f69210r == 0) {
                l0.this.f69209q.l();
                l0.this.f69211s = true;
            }
        }

        @Override // androidx.media3.extractor.ts.d0
        public void c(w0 w0Var, androidx.media3.extractor.t tVar, m0.e eVar) {
        }
    }

    @Deprecated
    public l0() {
        this(1, 1, androidx.media3.extractor.text.r.a.f68570a, new w0(0L), new j(0), E);
    }

    public static androidx.media3.extractor.w A(final androidx.media3.extractor.text.r.a aVar) {
        return new androidx.media3.extractor.w() { // from class: androidx.media3.extractor.ts.j0
            @Override // androidx.media3.extractor.w
            public final androidx.media3.extractor.r[] c() {
                return l0.e(aVar);
            }
        };
    }

    private void B() {
        this.f69205m.clear();
        this.f69204l.clear();
        SparseArray<m0> sparseArrayA = this.f69202j.a();
        int size = sparseArrayA.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f69204l.put(sparseArrayA.keyAt(i10), sparseArrayA.valueAt(i10));
        }
        this.f69204l.put(0, new e0(new c()));
        this.f69214v = null;
    }

    private boolean C(int i10) {
        return this.f69196d == 2 || this.f69211s || !this.f69206n.get(i10, false);
    }

    public static /* synthetic */ androidx.media3.extractor.r[] d() {
        return new androidx.media3.extractor.r[]{new l0(1, androidx.media3.extractor.text.r.a.f68570a)};
    }

    public static /* synthetic */ androidx.media3.extractor.r[] e(androidx.media3.extractor.text.r.a aVar) {
        return new androidx.media3.extractor.r[]{new l0(aVar)};
    }

    static /* synthetic */ int n(l0 l0Var) {
        int i10 = l0Var.f69210r;
        l0Var.f69210r = i10 + 1;
        return i10;
    }

    private boolean x(androidx.media3.extractor.s sVar) throws IOException {
        byte[] bArrE = this.f69200h.e();
        if (9400 - this.f69200h.f() < 188) {
            int iA = this.f69200h.a();
            if (iA > 0) {
                System.arraycopy(bArrE, this.f69200h.f(), bArrE, 0, iA);
            }
            this.f69200h.Y(bArrE, iA);
        }
        while (this.f69200h.a() < 188) {
            int iG = this.f69200h.g();
            int i10 = sVar.read(bArrE, iG, 9400 - iG);
            if (i10 == -1) {
                return false;
            }
            this.f69200h.Z(iG + i10);
        }
        return true;
    }

    private int y() throws v0 {
        int iF = this.f69200h.f();
        int iG = this.f69200h.g();
        int iA = n0.a(this.f69200h.e(), iF, iG);
        this.f69200h.a0(iA);
        int i10 = iA + 188;
        if (i10 <= iG) {
            this.f69215w = 0;
            return i10;
        }
        int i11 = this.f69215w + (iA - iF);
        this.f69215w = i11;
        if (this.f69196d != 2 || i11 <= 376) {
            return i10;
        }
        throw v0.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
    }

    private void z(long j10) {
        if (this.f69212t) {
            return;
        }
        this.f69212t = true;
        if (this.f69207o.b() == -9223372036854775807L) {
            this.f69209q.u(new androidx.media3.extractor.p0.b(this.f69207o.b()));
            return;
        }
        h0 h0Var = new h0(this.f69207o.c(), this.f69207o.b(), j10, this.f69216x, this.f69198f);
        this.f69208p = h0Var;
        this.f69209q.u(h0Var.b());
    }

    @Override // androidx.media3.extractor.r
    public void a(long j10, long j11) {
        h0 h0Var;
        androidx.media3.common.util.a.i(this.f69196d != 2);
        int size = this.f69199g.size();
        for (int i10 = 0; i10 < size; i10++) {
            w0 w0Var = this.f69199g.get(i10);
            boolean z10 = w0Var.f() == -9223372036854775807L;
            if (!z10) {
                long jD = w0Var.d();
                z10 = (jD == -9223372036854775807L || jD == 0 || jD == j11) ? false : true;
            }
            if (z10) {
                w0Var.i(j11);
            }
        }
        if (j11 != 0 && (h0Var = this.f69208p) != null) {
            h0Var.h(j11);
        }
        this.f69200h.W(0);
        this.f69201i.clear();
        for (int i11 = 0; i11 < this.f69204l.size(); i11++) {
            this.f69204l.valueAt(i11).a();
        }
        this.f69215w = 0;
    }

    @Override // androidx.media3.extractor.r
    public int f(androidx.media3.extractor.s sVar, androidx.media3.extractor.n0 n0Var) throws IOException {
        int i10;
        long length = sVar.getLength();
        boolean z10 = this.f69196d == 2;
        if (this.f69211s) {
            if (length != -1 && !z10 && !this.f69207o.d()) {
                return this.f69207o.e(sVar, n0Var, this.f69216x);
            }
            z(length);
            if (this.f69213u) {
                this.f69213u = false;
                a(0L, 0L);
                if (sVar.getPosition() != 0) {
                    n0Var.f68159a = 0L;
                    return 1;
                }
            }
            h0 h0Var = this.f69208p;
            if (h0Var != null && h0Var.d()) {
                return this.f69208p.c(sVar, n0Var);
            }
        }
        if (!x(sVar)) {
            for (int i11 = 0; i11 < this.f69204l.size(); i11++) {
                m0 m0VarValueAt = this.f69204l.valueAt(i11);
                if (m0VarValueAt instanceof y) {
                    y yVar = (y) m0VarValueAt;
                    if (yVar.d(z10)) {
                        yVar.b(new androidx.media3.common.util.o0(), 1);
                    }
                }
            }
            return -1;
        }
        int iY = y();
        int iG = this.f69200h.g();
        if (iY > iG) {
            return 0;
        }
        int iS = this.f69200h.s();
        if ((8388608 & iS) != 0) {
            this.f69200h.a0(iY);
            return 0;
        }
        int i12 = (4194304 & iS) != 0 ? 1 : 0;
        int i13 = (2096896 & iS) >> 8;
        boolean z11 = (iS & 32) != 0;
        m0 m0Var = (iS & 16) != 0 ? this.f69204l.get(i13) : null;
        if (m0Var == null) {
            this.f69200h.a0(iY);
            return 0;
        }
        if (this.f69196d != 2) {
            int i14 = iS & 15;
            i10 = 0;
            int i15 = this.f69201i.get(i13, i14 - 1);
            this.f69201i.put(i13, i14);
            if (i15 == i14) {
                this.f69200h.a0(iY);
                return 0;
            }
            if (i14 != ((i15 + 1) & 15)) {
                m0Var.a();
            }
        } else {
            i10 = 0;
        }
        if (z11) {
            int iL = this.f69200h.L();
            i12 |= (this.f69200h.L() & 64) != 0 ? 2 : i10;
            this.f69200h.b0(iL - 1);
        }
        boolean z12 = this.f69211s;
        if (C(i13)) {
            this.f69200h.Z(iY);
            m0Var.b(this.f69200h, i12);
            this.f69200h.Z(iG);
        }
        if (this.f69196d != 2 && !z12 && this.f69211s && length != -1) {
            this.f69213u = true;
        }
        this.f69200h.a0(iY);
        return i10;
    }

    @Override // androidx.media3.extractor.r
    public boolean g(androidx.media3.extractor.s sVar) throws IOException {
        byte[] bArrE = this.f69200h.e();
        sVar.i(bArrE, 0, 940);
        for (int i10 = 0; i10 < 188; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 >= 5) {
                    sVar.o(i10);
                    return true;
                }
                if (bArrE[(i11 * 188) + i10] != 71) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    @Override // androidx.media3.extractor.r
    public void h(androidx.media3.extractor.t tVar) {
        if ((this.f69197e & 1) == 0) {
            tVar = new androidx.media3.extractor.text.t(tVar, this.f69203k);
        }
        this.f69209q = tVar;
    }

    @Override // androidx.media3.extractor.r
    public void release() {
    }

    public l0(androidx.media3.extractor.text.r.a aVar) {
        this(1, 0, aVar, new w0(0L), new j(0), E);
    }

    public l0(int i10, androidx.media3.extractor.text.r.a aVar) {
        this(1, i10, aVar, new w0(0L), new j(0), E);
    }

    @Deprecated
    public l0(int i10) {
        this(1, 1, androidx.media3.extractor.text.r.a.f68570a, new w0(0L), new j(i10), E);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public l0(int i10, int i11, int i12) {
        this(i10, 1, androidx.media3.extractor.text.r.a.f68570a, new w0(0L), new j(i11), i12);
        boolean z10 = true | true;
    }

    @Deprecated
    public l0(int i10, w0 w0Var, m0.c cVar) {
        this(i10, 1, androidx.media3.extractor.text.r.a.f68570a, w0Var, cVar, E);
    }

    @Deprecated
    public l0(int i10, w0 w0Var, m0.c cVar, int i11) {
        this(i10, 1, androidx.media3.extractor.text.r.a.f68570a, w0Var, cVar, i11);
    }

    public l0(int i10, int i11, androidx.media3.extractor.text.r.a aVar, w0 w0Var, m0.c cVar, int i12) {
        this.f69202j = (m0.c) androidx.media3.common.util.a.g(cVar);
        this.f69198f = i12;
        this.f69196d = i10;
        this.f69197e = i11;
        this.f69203k = aVar;
        if (i10 != 1 && i10 != 2) {
            ArrayList arrayList = new ArrayList();
            this.f69199g = arrayList;
            arrayList.add(w0Var);
        } else {
            this.f69199g = Collections.singletonList(w0Var);
        }
        this.f69200h = new androidx.media3.common.util.o0(new byte[f69192h0], 0);
        this.f69205m = new SparseBooleanArray();
        this.f69206n = new SparseBooleanArray();
        this.f69204l = new SparseArray<>();
        this.f69201i = new SparseIntArray();
        this.f69207o = new i0(i12);
        this.f69209q = androidx.media3.extractor.t.f68307e1;
        this.f69216x = -1;
        B();
    }
}
