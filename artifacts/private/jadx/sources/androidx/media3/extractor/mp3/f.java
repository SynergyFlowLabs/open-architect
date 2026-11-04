package androidx.media3.extractor.mp3;

import androidx.annotation.p0;
import androidx.media3.common.r0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.o0;
import androidx.media3.common.util.z;
import androidx.media3.extractor.g0;
import androidx.media3.extractor.i0;
import androidx.media3.extractor.k0;
import androidx.media3.extractor.metadata.id3.n;
import androidx.media3.extractor.n0;
import androidx.media3.extractor.r;
import androidx.media3.extractor.s;
import androidx.media3.extractor.t;
import androidx.media3.extractor.u0;
import androidx.media3.extractor.w;
import com.google.common.primitives.l;
import il.m;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class f implements r {
    public static final int A = 2;
    public static final int B = 4;
    public static final int C = 8;
    private static final String D = "Mp3Extractor";
    private static final int F = 131072;
    private static final int G = 32768;
    private static final int H = 10;
    private static final int I = -128000;
    private static final int J = 1483304551;
    private static final int K = 1231971951;
    private static final int L = 1447187017;
    private static final int M = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f67850z = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f67851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f67852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o0 f67853f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final k0.a f67854g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final g0 f67855h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final i0 f67856i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final u0 f67857j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private t f67858k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private u0 f67859l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private u0 f67860m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f67861n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @p0
    private r0 f67862o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f67863p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f67864q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f67865r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f67866s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f67867t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private g f67868u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f67869v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f67870w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f67871x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final w f67849y = new w() { // from class: androidx.media3.extractor.mp3.d
        @Override // androidx.media3.extractor.w
        public final r[] c() {
            return f.d();
        }
    };
    private static final androidx.media3.extractor.metadata.id3.h.a E = new androidx.media3.extractor.metadata.id3.h.a() { // from class: androidx.media3.extractor.mp3.e
        @Override // androidx.media3.extractor.metadata.id3.h.a
        public final boolean a(int i10, int i11, int i12, int i13, int i14) {
            return f.e(i10, i11, i12, i13, i14);
        }
    };

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public f() {
        this(0);
    }

    public static /* synthetic */ r[] d() {
        return new r[]{new f()};
    }

    public static /* synthetic */ boolean e(int i10, int i11, int i12, int i13, int i14) {
        if (i11 != 67 || i12 != 79 || i13 != 77 || (i14 != 77 && i10 != 2)) {
            if (i11 != 77 || i12 != 76 || i13 != 76) {
                return false;
            }
            if (i14 != 84 && i10 != 2) {
                return false;
            }
        }
        return true;
    }

    @il.d({"extractorOutput", "realTrackOutput"})
    private void i() {
        androidx.media3.common.util.a.k(this.f67859l);
        k1.o(this.f67858k);
    }

    @m({"realTrackOutput"})
    private g j(s sVar) throws IOException {
        long jO;
        long jD;
        g gVarS = s(sVar);
        c cVarR = r(this.f67862o, sVar.getPosition());
        if (this.f67869v) {
            return new g.a();
        }
        if ((this.f67851d & 4) != 0) {
            if (cVarR != null) {
                jO = cVarR.Q1();
                jD = cVarR.d();
            } else if (gVarS != null) {
                jO = gVarS.Q1();
                jD = gVarS.d();
            } else {
                jO = o(this.f67862o);
                jD = -1;
            }
            gVarS = new b(jO, sVar.getPosition(), jD);
        } else if (cVarR != null) {
            gVarS = cVarR;
        } else if (gVarS == null) {
            gVarS = null;
        }
        if (gVarS == null || (!gVarS.S1() && (this.f67851d & 1) != 0)) {
            gVarS = n(sVar, (this.f67851d & 2) != 0);
        }
        if (gVarS != null) {
            this.f67859l.c(gVarS.Q1());
        }
        return gVarS;
    }

    private long k(long j10) {
        return this.f67863p + ((j10 * 1000000) / ((long) this.f67854g.f67439d));
    }

    @p0
    private g m(long j10, i iVar, long j11) {
        long j12;
        long j13;
        long jA = iVar.a();
        if (jA == -9223372036854775807L) {
            return null;
        }
        long j14 = iVar.f67880c;
        if (j14 != -1) {
            long j15 = j10 + j14;
            j12 = j14 - ((long) iVar.f67878a.f67438c);
            j13 = j15;
        } else {
            if (j11 == -1) {
                return null;
            }
            j12 = (j11 - j10) - ((long) iVar.f67878a.f67438c);
            j13 = j11;
        }
        long j16 = j12;
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        return new androidx.media3.extractor.mp3.a(j13, j10 + ((long) iVar.f67878a.f67438c), l.e(k1.a2(j16, 8000000L, jA, roundingMode)), l.e(com.google.common.math.h.g(j16, iVar.f67879b, roundingMode)), false);
    }

    private g n(s sVar, boolean z10) throws IOException {
        sVar.i(this.f67853f.e(), 0, 4);
        this.f67853f.a0(0);
        this.f67854g.a(this.f67853f.s());
        return new androidx.media3.extractor.mp3.a(sVar.getLength(), sVar.getPosition(), this.f67854g, z10);
    }

    private static long o(@p0 r0 r0Var) {
        if (r0Var != null) {
            int iE = r0Var.e();
            for (int i10 = 0; i10 < iE; i10++) {
                r0.a aVarD = r0Var.d(i10);
                if (aVarD instanceof n) {
                    n nVar = (n) aVarD;
                    if (nVar.f67574a.equals("TLEN")) {
                        return k1.D1(Long.parseLong(nVar.f67591d.get(0)));
                    }
                }
            }
        }
        return -9223372036854775807L;
    }

    private static int p(o0 o0Var, int i10) {
        if (o0Var.g() >= i10 + 4) {
            o0Var.a0(i10);
            int iS = o0Var.s();
            if (iS == J || iS == K) {
                return iS;
            }
        }
        if (o0Var.g() >= 40) {
            o0Var.a0(36);
            if (o0Var.s() == L) {
                return L;
            }
        }
        return 0;
    }

    private static boolean q(int i10, long j10) {
        return ((long) (i10 & I)) == (j10 & (-128000));
    }

    @p0
    private static c r(@p0 r0 r0Var, long j10) {
        if (r0Var != null) {
            int iE = r0Var.e();
            for (int i10 = 0; i10 < iE; i10++) {
                r0.a aVarD = r0Var.d(i10);
                if (aVarD instanceof androidx.media3.extractor.metadata.id3.l) {
                    return c.a(j10, (androidx.media3.extractor.metadata.id3.l) aVarD, o(r0Var));
                }
            }
        }
        return null;
    }

    @p0
    private g s(s sVar) throws IOException {
        int i10;
        int i11;
        o0 o0Var = new o0(this.f67854g.f67438c);
        sVar.i(o0Var.e(), 0, this.f67854g.f67438c);
        k0.a aVar = this.f67854g;
        int i12 = 21;
        if ((aVar.f67436a & 1) != 0) {
            if (aVar.f67440e != 1) {
                i12 = 36;
            }
        } else if (aVar.f67440e == 1) {
            i12 = 13;
        }
        int iP = p(o0Var, i12);
        if (iP != K) {
            if (iP == L) {
                h hVarA = h.a(sVar.getLength(), sVar.getPosition(), this.f67854g, o0Var);
                sVar.o(this.f67854g.f67438c);
                return hVarA;
            }
            if (iP != J) {
                sVar.l();
                return null;
            }
        }
        i iVarB = i.b(this.f67854g, o0Var);
        if (!this.f67855h.a() && (i10 = iVarB.f67881d) != -1 && (i11 = iVarB.f67882e) != -1) {
            g0 g0Var = this.f67855h;
            g0Var.f67338a = i10;
            g0Var.f67339b = i11;
        }
        long position = sVar.getPosition();
        if (sVar.getLength() != -1 && iVarB.f67880c != -1 && sVar.getLength() != iVarB.f67880c + position) {
            z.h(D, "Data size mismatch between stream (" + sVar.getLength() + ") and Xing frame (" + (iVarB.f67880c + position) + "), using Xing value.");
        }
        sVar.o(this.f67854g.f67438c);
        return iP == J ? j.a(iVarB, position) : m(position, iVarB, sVar.getLength());
    }

    private void t() {
        g gVar = this.f67868u;
        if ((gVar instanceof androidx.media3.extractor.mp3.a) && gVar.S1()) {
            long j10 = this.f67866s;
            if (j10 != -1 && j10 != this.f67868u.d()) {
                this.f67868u = ((androidx.media3.extractor.mp3.a) this.f67868u).f(this.f67866s);
                ((t) androidx.media3.common.util.a.g(this.f67858k)).u(this.f67868u);
                ((u0) androidx.media3.common.util.a.g(this.f67859l)).c(this.f67868u.Q1());
            }
        }
    }

    private boolean u(s sVar) throws IOException {
        g gVar = this.f67868u;
        if (gVar != null) {
            long jD = gVar.d();
            if (jD != -1 && sVar.m() > jD - 4) {
                return true;
            }
        }
        try {
            return !sVar.k(this.f67853f.e(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    @m({"extractorOutput", "realTrackOutput"})
    private int v(s sVar) throws Throwable {
        if (this.f67861n == 0) {
            try {
                x(sVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f67868u == null) {
            g gVarJ = j(sVar);
            this.f67868u = gVarJ;
            this.f67858k.u(gVarJ);
            androidx.media3.common.w.b bVarN0 = new androidx.media3.common.w.b().U("audio/mpeg").u0(this.f67854g.f67437b).k0(4096).R(this.f67854g.f67440e).v0(this.f67854g.f67439d).Z(this.f67855h.f67338a).a0(this.f67855h.f67339b).n0((this.f67851d & 8) != 0 ? null : this.f67862o);
            if (this.f67868u.i() != -2147483647) {
                bVarN0.Q(this.f67868u.i());
            }
            this.f67860m.e(bVarN0.N());
            this.f67865r = sVar.getPosition();
        } else if (this.f67865r != 0) {
            long position = sVar.getPosition();
            long j10 = this.f67865r;
            if (position < j10) {
                sVar.o((int) (j10 - position));
            }
        }
        return w(sVar);
    }

    @m({"realTrackOutput", "seeker"})
    private int w(s sVar) throws IOException {
        int i10 = 2 ^ 1;
        if (this.f67867t == 0) {
            sVar.l();
            if (u(sVar)) {
                return -1;
            }
            this.f67853f.a0(0);
            int iS = this.f67853f.s();
            if (!q(iS, this.f67861n) || k0.j(iS) == -1) {
                sVar.o(1);
                this.f67861n = 0;
                return 0;
            }
            this.f67854g.a(iS);
            if (this.f67863p == -9223372036854775807L) {
                this.f67863p = this.f67868u.e(sVar.getPosition());
                if (this.f67852e != -9223372036854775807L) {
                    this.f67863p += this.f67852e - this.f67868u.e(0L);
                }
            }
            this.f67867t = this.f67854g.f67438c;
            long position = sVar.getPosition();
            k0.a aVar = this.f67854g;
            this.f67866s = position + ((long) aVar.f67438c);
            g gVar = this.f67868u;
            if (gVar instanceof b) {
                b bVar = (b) gVar;
                bVar.b(k(this.f67864q + ((long) aVar.f67442g)), this.f67866s);
                if (this.f67870w && bVar.a(this.f67871x)) {
                    this.f67870w = false;
                    this.f67860m = this.f67859l;
                }
            }
        }
        int iF = this.f67860m.f(sVar, this.f67867t, true);
        if (iF == -1) {
            return -1;
        }
        int i11 = this.f67867t - iF;
        this.f67867t = i11;
        if (i11 > 0) {
            return 0;
        }
        int i12 = 7 ^ 0;
        this.f67860m.g(k(this.f67864q), 1, this.f67854g.f67438c, 0, null);
        this.f67864q += (long) this.f67854g.f67442g;
        this.f67867t = 0;
        return 0;
    }

    private boolean x(s sVar, boolean z10) throws Throwable {
        int iM;
        int i10;
        int iJ;
        int i11 = z10 ? 32768 : 131072;
        sVar.l();
        if (sVar.getPosition() == 0) {
            r0 r0VarA = this.f67856i.a(sVar, (this.f67851d & 8) == 0 ? null : E);
            this.f67862o = r0VarA;
            if (r0VarA != null) {
                this.f67855h.c(r0VarA);
            }
            iM = (int) sVar.m();
            if (!z10) {
                sVar.o(iM);
            }
            i10 = 0;
        } else {
            iM = 0;
            i10 = 0;
        }
        int i12 = i10;
        int i13 = i12;
        while (true) {
            if (u(sVar)) {
                if (i12 > 0) {
                    break;
                }
                t();
                throw new EOFException();
            }
            this.f67853f.a0(0);
            int iS = this.f67853f.s();
            if ((i10 == 0 || q(iS, i10)) && (iJ = k0.j(iS)) != -1) {
                i12++;
                if (i12 != 1) {
                    if (i12 == 4) {
                        break;
                    }
                } else {
                    this.f67854g.a(iS);
                    i10 = iS;
                }
                sVar.n(iJ - 4);
            } else {
                int i14 = i13 + 1;
                if (i13 == i11) {
                    if (z10) {
                        return false;
                    }
                    t();
                    throw new EOFException();
                }
                if (z10) {
                    sVar.l();
                    sVar.n(iM + i14);
                } else {
                    sVar.o(1);
                }
                i12 = 0;
                i13 = i14;
                i10 = 0;
            }
        }
        if (z10) {
            sVar.o(iM + i13);
        } else {
            sVar.l();
        }
        this.f67861n = i10;
        return true;
    }

    @Override // androidx.media3.extractor.r
    public void a(long j10, long j11) {
        this.f67861n = 0;
        this.f67863p = -9223372036854775807L;
        this.f67864q = 0L;
        this.f67867t = 0;
        this.f67871x = j11;
        g gVar = this.f67868u;
        if (!(gVar instanceof b) || ((b) gVar).a(j11)) {
            return;
        }
        this.f67870w = true;
        this.f67860m = this.f67857j;
    }

    @Override // androidx.media3.extractor.r
    public int f(s sVar, n0 n0Var) throws Throwable {
        i();
        int iV = v(sVar);
        if (iV == -1 && (this.f67868u instanceof b)) {
            long jK = k(this.f67864q);
            if (this.f67868u.Q1() != jK) {
                ((b) this.f67868u).c(jK);
                this.f67858k.u(this.f67868u);
                this.f67859l.c(this.f67868u.Q1());
            }
        }
        return iV;
    }

    @Override // androidx.media3.extractor.r
    public boolean g(s sVar) throws IOException {
        return x(sVar, true);
    }

    @Override // androidx.media3.extractor.r
    public void h(t tVar) {
        this.f67858k = tVar;
        u0 u0VarA = tVar.a(0, 1);
        this.f67859l = u0VarA;
        this.f67860m = u0VarA;
        this.f67858k.l();
    }

    public void l() {
        this.f67869v = true;
    }

    @Override // androidx.media3.extractor.r
    public void release() {
    }

    public f(int i10) {
        this(i10, -9223372036854775807L);
    }

    public f(int i10, long j10) {
        this.f67851d = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f67852e = j10;
        this.f67853f = new o0(10);
        this.f67854g = new k0.a();
        this.f67855h = new g0();
        this.f67863p = -9223372036854775807L;
        this.f67856i = new i0();
        androidx.media3.extractor.m mVar = new androidx.media3.extractor.m();
        this.f67857j = mVar;
        this.f67860m = mVar;
        this.f67866s = -1L;
    }
}
