package androidx.media3.extractor.mp4;

import androidx.collection.g3;
import androidx.media3.common.r0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.o0;
import androidx.media3.extractor.g0;
import androidx.media3.extractor.n0;
import androidx.media3.extractor.p0;
import androidx.media3.extractor.q0;
import androidx.media3.extractor.t0;
import androidx.media3.extractor.u0;
import androidx.media3.extractor.v0;
import com.google.common.collect.l6;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class p implements androidx.media3.extractor.r, p0 {
    public static final int J = 1;
    public static final int K = 2;
    public static final int L = 4;
    public static final int M = 8;
    public static final int N = 16;
    public static final int O = 32;
    public static final int P = 64;
    public static final int Q = 128;

    @Deprecated
    public static final androidx.media3.extractor.w R = new androidx.media3.extractor.w() { // from class: androidx.media3.extractor.mp4.o
        @Override // androidx.media3.extractor.w
        public final androidx.media3.extractor.r[] c() {
            return p.l();
        }
    };
    private static final int S = 0;
    private static final int T = 1;
    private static final int U = 2;
    private static final int V = 3;
    private static final int W = 0;
    private static final int X = 1;
    private static final int Y = 2;
    private static final long Z = 262144;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final long f68038a0 = 10485760;
    private boolean A;
    private long B;
    private androidx.media3.extractor.t C;
    private b[] D;
    private long[][] E;
    private int F;
    private long G;
    private int H;

    @androidx.annotation.p0
    private androidx.media3.extractor.metadata.mp4.a I;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.media3.extractor.text.r.a f68039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f68040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o0 f68041f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final o0 f68042g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final o0 f68043h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final o0 f68044i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ArrayDeque<androidx.media3.container.b.C0572b> f68045j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final s f68046k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<r0.a> f68047l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private l6<t0> f68048m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f68049n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f68050o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f68051p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f68052q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.p0
    private o0 f68053r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f68054s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f68055t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f68056u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f68057v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f68058w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f68059x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f68060y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f68061z;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v f68062a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final y f68063b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final u0 f68064c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        public final v0 f68065d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f68066e;

        public b(v vVar, y yVar, u0 u0Var) {
            this.f68062a = vVar;
            this.f68063b = yVar;
            this.f68064c = u0Var;
            this.f68065d = "audio/true-hd".equals(vVar.f68116g.f61761o) ? new v0() : null;
        }
    }

    @Deprecated
    public p() {
        this(androidx.media3.extractor.text.r.a.f68570a, 16);
    }

    public static androidx.media3.extractor.w A(final androidx.media3.extractor.text.r.a aVar) {
        return new androidx.media3.extractor.w() { // from class: androidx.media3.extractor.mp4.m
            @Override // androidx.media3.extractor.w
            public final androidx.media3.extractor.r[] c() {
                return p.k(aVar);
            }
        };
    }

    private void B(long j10) throws androidx.media3.common.v0 {
        while (!this.f68045j.isEmpty() && this.f68045j.peek().Q1 == j10) {
            androidx.media3.container.b.C0572b c0572bPop = this.f68045j.pop();
            if (c0572bPop.f62099a == 1836019574) {
                E(c0572bPop);
                this.f68045j.clear();
                if (!this.f68060y) {
                    this.f68049n = 2;
                }
            } else if (!this.f68045j.isEmpty()) {
                this.f68045j.peek().b(c0572bPop);
            }
        }
        if (this.f68049n != 2) {
            q();
        }
    }

    private void C() {
        if (this.H != 2 || (this.f68040e & 2) == 0) {
            return;
        }
        u0 u0VarA = this.C.a(0, 4);
        androidx.media3.extractor.metadata.mp4.a aVar = this.I;
        u0VarA.e(new androidx.media3.common.w.b().n0(aVar == null ? null : new r0(aVar)).N());
        this.C.l();
        this.C.u(new p0.b(-9223372036854775807L));
    }

    private static int D(o0 o0Var) {
        o0Var.a0(8);
        int iM = m(o0Var.s());
        if (iM != 0) {
            return iM;
        }
        o0Var.b0(4);
        while (o0Var.a() > 0) {
            int iM2 = m(o0Var.s());
            if (iM2 != 0) {
                return iM2;
            }
        }
        return 0;
    }

    private void E(androidx.media3.container.b.C0572b c0572b) throws androidx.media3.common.v0 {
        List<Integer> list;
        r0 r0Var;
        r0 r0Var2;
        int i10;
        r0 r0Var3;
        ArrayList arrayList;
        int i11;
        androidx.media3.container.b.C0572b c0572bD = c0572b.d(1835365473);
        List<Integer> arrayList2 = new ArrayList<>();
        if (c0572bD != null) {
            r0 r0VarR = androidx.media3.extractor.mp4.b.r(c0572bD);
            if (this.A) {
                androidx.media3.common.util.a.k(r0VarR);
                y(r0VarR);
                arrayList2 = r(r0VarR);
            } else if (M(r0VarR)) {
                this.f68060y = true;
                return;
            }
            r0Var = r0VarR;
            list = arrayList2;
        } else {
            list = arrayList2;
            r0Var = null;
        }
        ArrayList arrayList3 = new ArrayList();
        boolean z10 = this.H == 1;
        g0 g0Var = new g0();
        androidx.media3.container.b.c cVarE = c0572b.e(1969517665);
        if (cVarE != null) {
            r0 r0VarF = androidx.media3.extractor.mp4.b.F(cVarE);
            g0Var.c(r0VarF);
            r0Var2 = r0VarF;
        } else {
            r0Var2 = null;
        }
        r0 r0Var4 = new r0(androidx.media3.extractor.mp4.b.t(((androidx.media3.container.b.c) androidx.media3.common.util.a.g(c0572b.e(1836476516))).Q1));
        List<y> listE = androidx.media3.extractor.mp4.b.E(c0572b, g0Var, -9223372036854775807L, null, (this.f68040e & 1) != 0, z10, new com.google.common.base.t() { // from class: androidx.media3.extractor.mp4.n
            @Override // com.google.common.base.t
            public final Object apply(Object obj) {
                return p.j((v) obj);
            }
        });
        if (this.A) {
            androidx.media3.common.util.a.j(list.size() == listE.size(), String.format(Locale.US, "The number of auxiliary track types from metadata (%d) is not same as the number of auxiliary tracks (%d)", Integer.valueOf(list.size()), Integer.valueOf(listE.size())));
        }
        String strB = l.b(listE);
        int i12 = 0;
        int i13 = 0;
        long j10 = -9223372036854775807L;
        int size = -1;
        while (i12 < listE.size()) {
            y yVar = listE.get(i12);
            if (yVar.f68147b == 0) {
                i10 = i13;
                r0Var3 = r0Var;
                arrayList = arrayList3;
            } else {
                v vVar = yVar.f68146a;
                ArrayList arrayList4 = arrayList3;
                i10 = i13 + 1;
                String str = strB;
                b bVar = new b(vVar, yVar, this.C.a(i13, vVar.f68111b));
                r0 r0Var5 = r0Var;
                long j11 = vVar.f68114e;
                if (j11 == -9223372036854775807L) {
                    j11 = yVar.f68153h;
                }
                bVar.f68064c.c(j11);
                long jMax = Math.max(j10, j11);
                int i14 = "audio/true-hd".equals(vVar.f68116g.f61761o) ? yVar.f68150e * 16 : yVar.f68150e + 30;
                androidx.media3.common.w.b bVarB = vVar.f68116g.b();
                bVarB.k0(i14);
                if (vVar.f68111b == 2) {
                    androidx.media3.common.w wVar = vVar.f68116g;
                    int i15 = wVar.f61752f;
                    if ((this.f68040e & 8) != 0) {
                        i15 |= size == -1 ? 1 : 2;
                    }
                    if (wVar.f61770x == -1.0f && j11 > 0 && (i11 = yVar.f68147b) > 0) {
                        bVarB.b0(i11 / (j11 / 1000000.0f));
                    }
                    if (this.A) {
                        i15 |= 32768;
                        bVarB.P(list.get(i12).intValue());
                    }
                    bVarB.s0(i15);
                }
                k.l(vVar.f68111b, g0Var, bVarB);
                r0Var3 = r0Var5;
                k.m(vVar.f68111b, r0Var3, bVarB, this.f68047l.isEmpty() ? null : new r0(this.f68047l), r0Var2, r0Var4);
                strB = str;
                bVarB.U(strB);
                bVar.f68064c.e(bVarB.N());
                if (vVar.f68111b == 2 && size == -1) {
                    size = arrayList4.size();
                }
                arrayList = arrayList4;
                arrayList.add(bVar);
                j10 = jMax;
            }
            i12++;
            arrayList3 = arrayList;
            listE = listE;
            r0Var = r0Var3;
            i13 = i10;
        }
        this.F = size;
        this.G = j10;
        b[] bVarArr = (b[]) arrayList3.toArray(new b[0]);
        this.D = bVarArr;
        this.E = n(bVarArr);
        this.C.l();
        this.C.u(this);
    }

    private void F(long j10) {
        if (this.f68050o == 1836086884) {
            int i10 = this.f68052q;
            this.I = new androidx.media3.extractor.metadata.mp4.a(0L, j10, -9223372036854775807L, j10 + ((long) i10), this.f68051p - ((long) i10));
        }
    }

    private boolean G(androidx.media3.extractor.s sVar) throws IOException {
        androidx.media3.container.b.C0572b c0572bPeek;
        if (this.f68052q == 0) {
            if (!sVar.e(this.f68044i.e(), 0, 8, true)) {
                C();
                return false;
            }
            this.f68052q = 8;
            this.f68044i.a0(0);
            this.f68051p = this.f68044i.N();
            this.f68050o = this.f68044i.s();
        }
        long j10 = this.f68051p;
        if (j10 == 1) {
            sVar.readFully(this.f68044i.e(), 8, 8);
            this.f68052q += 8;
            this.f68051p = this.f68044i.S();
        } else if (j10 == 0) {
            long length = sVar.getLength();
            if (length == -1 && (c0572bPeek = this.f68045j.peek()) != null) {
                length = c0572bPeek.Q1;
            }
            if (length != -1) {
                this.f68051p = (length - sVar.getPosition()) + ((long) this.f68052q);
            }
        }
        if (this.f68051p < this.f68052q) {
            throw androidx.media3.common.v0.e("Atom size less than header length (unsupported).");
        }
        if (K(this.f68050o)) {
            long position = sVar.getPosition();
            long j11 = this.f68051p;
            int i10 = this.f68052q;
            long j12 = (position + j11) - ((long) i10);
            if (j11 != i10 && this.f68050o == 1835365473) {
                z(sVar);
            }
            this.f68045j.push(new androidx.media3.container.b.C0572b(this.f68050o, j12));
            if (this.f68051p == this.f68052q) {
                B(j12);
            } else {
                q();
            }
        } else if (L(this.f68050o)) {
            androidx.media3.common.util.a.i(this.f68052q == 8);
            androidx.media3.common.util.a.i(this.f68051p <= g3.f12256c);
            o0 o0Var = new o0((int) this.f68051p);
            System.arraycopy(this.f68044i.e(), 0, o0Var.e(), 0, 8);
            this.f68053r = o0Var;
            this.f68049n = 1;
        } else {
            F(sVar.getPosition() - ((long) this.f68052q));
            this.f68053r = null;
            this.f68049n = 1;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007e  */
    private boolean H(androidx.media3.extractor.s sVar, n0 n0Var) throws IOException {
        boolean z10;
        long j10 = this.f68051p - ((long) this.f68052q);
        long position = sVar.getPosition() + j10;
        o0 o0Var = this.f68053r;
        if (o0Var == null) {
            if (!this.f68059x && this.f68050o == 1835295092) {
                this.H = 1;
            }
            if (j10 < 262144) {
                sVar.o((int) j10);
            } else {
                n0Var.f68159a = sVar.getPosition() + j10;
                z10 = true;
            }
            B(position);
            if (this.f68060y) {
                this.A = true;
                n0Var.f68159a = this.f68061z;
                this.f68060y = false;
                z10 = true;
            }
            return (z10 || this.f68049n == 2) ? false : true;
        }
        sVar.readFully(o0Var.e(), this.f68052q, (int) j10);
        if (this.f68050o == 1718909296) {
            this.f68059x = true;
            this.H = D(o0Var);
        } else if (!this.f68045j.isEmpty()) {
            this.f68045j.peek().c(new androidx.media3.container.b.c(this.f68050o, o0Var));
        }
        z10 = false;
        B(position);
        if (this.f68060y) {
            this.A = true;
            n0Var.f68159a = this.f68061z;
            this.f68060y = false;
            z10 = true;
        }
        if (z10) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    private int I(androidx.media3.extractor.s sVar, n0 n0Var) throws IOException {
        u0.a aVar;
        ?? r10;
        boolean z10;
        int iQ;
        long position = sVar.getPosition();
        if (this.f68054s == -1) {
            int iW = w(position);
            this.f68054s = iW;
            if (iW == -1) {
                return -1;
            }
        }
        b bVar = this.D[this.f68054s];
        u0 u0Var = bVar.f68064c;
        int i10 = bVar.f68066e;
        y yVar = bVar.f68063b;
        long j10 = yVar.f68148c[i10] + this.B;
        int i11 = yVar.f68149d[i10];
        v0 v0Var = bVar.f68065d;
        long j11 = (j10 - position) + ((long) this.f68055t);
        if (j11 < 0 || j11 >= 262144) {
            n0Var.f68159a = j10;
            return 1;
        }
        if (bVar.f68062a.f68117h == 1) {
            j11 += 8;
            i11 -= 8;
        }
        sVar.o((int) j11);
        if (!o(bVar.f68062a.f68116g)) {
            this.f68058w = true;
        }
        v vVar = bVar.f68062a;
        if (vVar.f68120k == 0) {
            aVar = null;
            if ("audio/ac4".equals(vVar.f68116g.f61761o)) {
                if (this.f68056u == 0) {
                    androidx.media3.extractor.c.a(i11, this.f68043h);
                    u0Var.b(this.f68043h, 7);
                    this.f68056u += 7;
                }
                i11 += 7;
            } else if (v0Var != null) {
                v0Var.d(sVar);
            }
            while (true) {
                int i12 = this.f68056u;
                if (i12 >= i11) {
                    break;
                }
                int iF = u0Var.f(sVar, i11 - i12, false);
                this.f68055t += iF;
                this.f68056u += iF;
                this.f68057v -= iF;
            }
        } else {
            byte[] bArrE = this.f68042g.e();
            bArrE[0] = 0;
            bArrE[1] = 0;
            bArrE[2] = 0;
            int i13 = 4 - bVar.f68062a.f68120k;
            i11 += i13;
            while (this.f68056u < i11) {
                int i14 = this.f68057v;
                if (i14 == 0) {
                    v vVar2 = bVar.f68062a;
                    int i15 = vVar2.f68120k;
                    if (this.f68058w || androidx.media3.container.f.q(vVar2.f68116g) + i15 > bVar.f68063b.f68149d[i10] - this.f68055t) {
                        iQ = 0;
                    } else {
                        iQ = androidx.media3.container.f.q(bVar.f68062a.f68116g);
                        i15 = bVar.f68062a.f68120k + iQ;
                    }
                    sVar.readFully(bArrE, i13, i15);
                    this.f68055t += i15;
                    this.f68042g.a0(0);
                    int iS = this.f68042g.s();
                    if (iS < 0) {
                        throw androidx.media3.common.v0.a("Invalid NAL length", null);
                    }
                    this.f68057v = iS - iQ;
                    this.f68041f.a0(0);
                    u0Var.b(this.f68041f, 4);
                    this.f68056u += 4;
                    if (iQ > 0) {
                        u0Var.b(this.f68042g, iQ);
                        this.f68056u += iQ;
                        if (androidx.media3.container.f.l(bArrE, 4, iQ, bVar.f68062a.f68116g)) {
                            this.f68058w = true;
                        }
                    }
                } else {
                    int iF2 = u0Var.f(sVar, i14, false);
                    this.f68055t += iF2;
                    this.f68056u += iF2;
                    this.f68057v -= iF2;
                }
            }
            aVar = null;
        }
        int i16 = i11;
        y yVar2 = bVar.f68063b;
        long j12 = yVar2.f68151f[i10];
        int i17 = yVar2.f68152g[i10];
        if (!this.f68058w) {
            i17 |= 67108864;
        }
        if (v0Var != null) {
            int i18 = i17;
            z10 = false;
            v0Var.c(u0Var, j12, i18, i16, 0, null);
            if (i10 + 1 == bVar.f68063b.f68147b) {
                r10 = z10;
                v0Var.a(u0Var, aVar);
                r10 = z10;
            }
        } else {
            int i19 = i17;
            r10 = 0;
            u0Var.g(j12, i19, i16, 0, null);
        }
        r10 = z10;
        bVar.f68066e++;
        this.f68054s = -1;
        this.f68055t = r10;
        this.f68056u = r10;
        this.f68057v = r10;
        this.f68058w = r10;
        return r10;
    }

    private int J(androidx.media3.extractor.s sVar, n0 n0Var) throws IOException {
        int iC = this.f68046k.c(sVar, n0Var, this.f68047l);
        if (iC == 1 && n0Var.f68159a == 0) {
            q();
        }
        return iC;
    }

    private static boolean K(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1701082227 || i10 == 1835365473 || i10 == 1635284069;
    }

    private static boolean L(int i10) {
        return i10 == 1835296868 || i10 == 1836476516 || i10 == 1751411826 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1937011571 || i10 == 1668576371 || i10 == 1701606260 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1953196132 || i10 == 1718909296 || i10 == 1969517665 || i10 == 1801812339 || i10 == 1768715124;
    }

    private boolean M(@androidx.annotation.p0 r0 r0Var) {
        androidx.media3.container.a aVarA;
        if (r0Var == null) {
            return false;
        }
        if ((this.f68040e & 64) != 0 && (aVarA = k.a(r0Var, androidx.media3.container.a.f62005f)) != null) {
            long jS = new o0(aVarA.f62019b).S();
            if (jS > 0) {
                this.f68061z = jS;
                return true;
            }
        }
        return false;
    }

    private void N(b bVar, long j10) {
        y yVar = bVar.f68063b;
        int iA = yVar.a(j10);
        if (iA == -1) {
            iA = yVar.b(j10);
        }
        bVar.f68066e = iA;
    }

    public static /* synthetic */ v j(v vVar) {
        return vVar;
    }

    public static /* synthetic */ androidx.media3.extractor.r[] k(androidx.media3.extractor.text.r.a aVar) {
        return new androidx.media3.extractor.r[]{new p(aVar)};
    }

    public static /* synthetic */ androidx.media3.extractor.r[] l() {
        return new androidx.media3.extractor.r[]{new p(androidx.media3.extractor.text.r.a.f68570a, 16)};
    }

    private static int m(int i10) {
        if (i10 != 1751476579) {
            return i10 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static long[][] n(b[] bVarArr) {
        long[][] jArr = new long[bVarArr.length][];
        int[] iArr = new int[bVarArr.length];
        long[] jArr2 = new long[bVarArr.length];
        boolean[] zArr = new boolean[bVarArr.length];
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            jArr[i10] = new long[bVarArr[i10].f68063b.f68147b];
            jArr2[i10] = bVarArr[i10].f68063b.f68151f[0];
        }
        long j10 = 0;
        int i11 = 0;
        while (i11 < bVarArr.length) {
            long j11 = Long.MAX_VALUE;
            int i12 = -1;
            for (int i13 = 0; i13 < bVarArr.length; i13++) {
                if (!zArr[i13]) {
                    long j12 = jArr2[i13];
                    if (j12 <= j11) {
                        i12 = i13;
                        j11 = j12;
                    }
                }
            }
            int i14 = iArr[i12];
            long[] jArr3 = jArr[i12];
            jArr3[i14] = j10;
            y yVar = bVarArr[i12].f68063b;
            j10 += (long) yVar.f68149d[i14];
            int i15 = i14 + 1;
            iArr[i12] = i15;
            if (i15 < jArr3.length) {
                jArr2[i12] = yVar.f68151f[i15];
            } else {
                zArr[i12] = true;
                i11++;
            }
        }
        return jArr;
    }

    private boolean o(androidx.media3.common.w wVar) {
        if (Objects.equals(wVar.f61761o, "video/avc")) {
            return (this.f68040e & 32) != 0;
        }
        return Objects.equals(wVar.f61761o, "video/hevc") && (this.f68040e & 128) != 0;
    }

    public static int p(int i10) {
        int i11 = (i10 & 1) != 0 ? 32 : 0;
        return (i10 & 2) != 0 ? i11 | 128 : i11;
    }

    private void q() {
        this.f68049n = 0;
        this.f68052q = 0;
    }

    private List<Integer> r(r0 r0Var) {
        List<Integer> listB = ((androidx.media3.container.a) androidx.media3.common.util.a.k(k.a(r0Var, androidx.media3.container.a.f62007h))).b();
        ArrayList arrayList = new ArrayList(listB.size());
        for (int i10 = 0; i10 < listB.size(); i10++) {
            int iIntValue = listB.get(i10).intValue();
            int i11 = 1;
            if (iIntValue != 0) {
                if (iIntValue != 1) {
                    i11 = 3;
                    if (iIntValue != 2) {
                        i11 = iIntValue != 3 ? 0 : 4;
                    }
                } else {
                    i11 = 2;
                }
            }
            arrayList.add(Integer.valueOf(i11));
        }
        return arrayList;
    }

    private static int v(y yVar, long j10) {
        int iA = yVar.a(j10);
        return iA == -1 ? yVar.b(j10) : iA;
    }

    private int w(long j10) {
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        long j11 = Long.MAX_VALUE;
        boolean z10 = true;
        long j12 = Long.MAX_VALUE;
        boolean z11 = true;
        long j13 = Long.MAX_VALUE;
        while (true) {
            b[] bVarArr = this.D;
            if (i12 >= bVarArr.length) {
                break;
            }
            b bVar = bVarArr[i12];
            int i13 = bVar.f68066e;
            y yVar = bVar.f68063b;
            if (i13 != yVar.f68147b) {
                long j14 = yVar.f68148c[i13];
                long j15 = ((long[][]) k1.o(this.E))[i12][i13];
                long j16 = j14 - j10;
                boolean z12 = j16 < 0 || j16 >= 262144;
                if ((!z12 && z11) || (z12 == z11 && j16 < j13)) {
                    j12 = j15;
                    z11 = z12;
                    i11 = i12;
                    j13 = j16;
                }
                if (j15 < j11) {
                    j11 = j15;
                    z10 = z12;
                    i10 = i12;
                }
            }
            i12++;
        }
        return (j11 == Long.MAX_VALUE || !z10 || j12 < j11 + 10485760) ? i11 : i10;
    }

    private static long x(y yVar, long j10, long j11) {
        int iV = v(yVar, j10);
        return iV == -1 ? j11 : Math.min(yVar.f68148c[iV], j11);
    }

    private void y(r0 r0Var) {
        androidx.media3.container.a aVarA = k.a(r0Var, androidx.media3.container.a.f62008i);
        if (aVarA == null || aVarA.f62019b[0] != 0) {
            return;
        }
        this.B = this.f68061z + 16;
    }

    private void z(androidx.media3.extractor.s sVar) throws IOException {
        this.f68043h.W(8);
        sVar.i(this.f68043h.e(), 0, 8);
        androidx.media3.extractor.mp4.b.e(this.f68043h);
        sVar.o(this.f68043h.f());
        sVar.l();
    }

    @Override // androidx.media3.extractor.p0
    public long Q1() {
        return this.G;
    }

    @Override // androidx.media3.extractor.p0
    public p0.a R1(long j10) {
        return t(j10, -1);
    }

    @Override // androidx.media3.extractor.p0
    public boolean S1() {
        return true;
    }

    @Override // androidx.media3.extractor.r
    public void a(long j10, long j11) {
        this.f68045j.clear();
        this.f68052q = 0;
        this.f68054s = -1;
        this.f68055t = 0;
        this.f68056u = 0;
        this.f68057v = 0;
        this.f68058w = false;
        if (j10 == 0) {
            int i10 = 2 | 3;
            if (this.f68049n != 3) {
                q();
                return;
            } else {
                this.f68046k.g();
                this.f68047l.clear();
                return;
            }
        }
        for (b bVar : this.D) {
            N(bVar, j11);
            v0 v0Var = bVar.f68065d;
            if (v0Var != null) {
                v0Var.b();
            }
        }
    }

    @Override // androidx.media3.extractor.r
    public int f(androidx.media3.extractor.s sVar, n0 n0Var) throws IOException {
        while (true) {
            int i10 = this.f68049n;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        return I(sVar, n0Var);
                    }
                    if (i10 == 3) {
                        return J(sVar, n0Var);
                    }
                    throw new IllegalStateException();
                }
                if (H(sVar, n0Var)) {
                    return 1;
                }
            } else if (!G(sVar)) {
                return -1;
            }
        }
    }

    @Override // androidx.media3.extractor.r
    public boolean g(androidx.media3.extractor.s sVar) throws IOException {
        t0 t0VarD = u.d(sVar, (this.f68040e & 2) != 0);
        this.f68048m = t0VarD != null ? l6.G(t0VarD) : l6.F();
        return t0VarD == null;
    }

    @Override // androidx.media3.extractor.r
    public void h(androidx.media3.extractor.t tVar) {
        if ((this.f68040e & 16) == 0) {
            tVar = new androidx.media3.extractor.text.t(tVar, this.f68039d);
        }
        this.C = tVar;
    }

    @Override // androidx.media3.extractor.r
    public void release() {
    }

    public long[] s(int i10) {
        b[] bVarArr = this.D;
        return bVarArr.length <= i10 ? new long[0] : bVarArr[i10].f68063b.f68151f;
    }

    public p0.a t(long j10, int i10) {
        long j11;
        long jX;
        long j12;
        long j13;
        int iB;
        long j14 = j10;
        b[] bVarArr = this.D;
        if (bVarArr.length == 0) {
            return new p0.a(q0.f68288c);
        }
        int i11 = i10 != -1 ? i10 : this.F;
        if (i11 != -1) {
            y yVar = bVarArr[i11].f68063b;
            int iV = v(yVar, j14);
            if (iV == -1) {
                return new p0.a(q0.f68288c);
            }
            long j15 = yVar.f68151f[iV];
            j11 = yVar.f68148c[iV];
            if (j15 >= j14 || iV >= yVar.f68147b - 1 || (iB = yVar.b(j14)) == -1 || iB == iV) {
                j13 = -1;
                j12 = -9223372036854775807L;
            } else {
                j12 = yVar.f68151f[iB];
                j13 = yVar.f68148c[iB];
            }
            jX = j13;
            j14 = j15;
        } else {
            j11 = Long.MAX_VALUE;
            jX = -1;
            j12 = -9223372036854775807L;
        }
        if (i10 == -1) {
            int i12 = 0;
            while (true) {
                b[] bVarArr2 = this.D;
                if (i12 >= bVarArr2.length) {
                    break;
                }
                if (i12 != this.F) {
                    y yVar2 = bVarArr2[i12].f68063b;
                    long jX2 = x(yVar2, j14, j11);
                    if (j12 != -9223372036854775807L) {
                        jX = x(yVar2, j12, jX);
                    }
                    j11 = jX2;
                }
                i12++;
            }
        }
        q0 q0Var = new q0(j14, j11);
        return j12 == -9223372036854775807L ? new p0.a(q0Var) : new p0.a(q0Var, new q0(j12, jX));
    }

    @Override // androidx.media3.extractor.r
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public l6<t0> c() {
        return this.f68048m;
    }

    public p(androidx.media3.extractor.text.r.a aVar) {
        this(aVar, 0);
    }

    @Deprecated
    public p(int i10) {
        this(androidx.media3.extractor.text.r.a.f68570a, i10);
    }

    public p(androidx.media3.extractor.text.r.a aVar, int i10) {
        this.f68039d = aVar;
        this.f68040e = i10;
        this.f68048m = l6.F();
        this.f68049n = (i10 & 4) != 0 ? 3 : 0;
        this.f68046k = new s();
        this.f68047l = new ArrayList();
        this.f68044i = new o0(16);
        this.f68045j = new ArrayDeque<>();
        this.f68041f = new o0(androidx.media3.container.f.C);
        this.f68042g = new o0(6);
        this.f68043h = new o0();
        this.f68054s = -1;
        this.C = androidx.media3.extractor.t.f68307e1;
        this.D = new b[0];
    }
}
