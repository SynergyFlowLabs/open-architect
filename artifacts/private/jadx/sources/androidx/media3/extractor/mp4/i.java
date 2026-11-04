package androidx.media3.extractor.mp4;

import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.p0;
import androidx.collection.g3;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.o0;
import androidx.media3.common.util.w0;
import androidx.media3.common.v0;
import androidx.media3.extractor.g0;
import androidx.media3.extractor.n0;
import androidx.media3.extractor.t0;
import androidx.media3.extractor.u0;
import com.google.common.collect.l6;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
@b1
public class i implements androidx.media3.extractor.r {
    public static final int P = 1;
    public static final int Q = 2;
    public static final int R = 4;
    public static final int S = 16;
    public static final int T = 32;
    public static final int U = 64;
    public static final int V = 128;
    private static final String X = "FragmentedMp4Extractor";
    private static final int Y = 1936025959;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final int f67962b0 = 100;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final int f67963c0 = 0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final int f67964d0 = 1;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final int f67965e0 = 2;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final int f67966f0 = 3;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final int f67967g0 = 4;
    private long A;
    private int B;
    private long C;
    private long D;
    private long E;

    @p0
    private c F;
    private int G;
    private int H;
    private int I;
    private boolean J;
    private boolean K;
    private androidx.media3.extractor.t L;
    private u0[] M;
    private u0[] N;
    private boolean O;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.media3.extractor.text.r.a f67968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f67969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private final v f67970f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<androidx.media3.common.w> f67971g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final SparseArray<c> f67972h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final o0 f67973i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final o0 f67974j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final o0 f67975k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final byte[] f67976l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final o0 f67977m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @p0
    private final w0 f67978n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final androidx.media3.extractor.metadata.emsg.c f67979o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final o0 f67980p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ArrayDeque<androidx.media3.container.b.C0572b> f67981q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ArrayDeque<b> f67982r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final androidx.media3.container.j f67983s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @p0
    private final u0 f67984t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private l6<t0> f67985u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f67986v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f67987w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f67988x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f67989y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @p0
    private o0 f67990z;

    @Deprecated
    public static final androidx.media3.extractor.w W = new androidx.media3.extractor.w() { // from class: androidx.media3.extractor.mp4.f
        @Override // androidx.media3.extractor.w
        public final androidx.media3.extractor.r[] c() {
            return i.i();
        }
    };
    private static final byte[] Z = {-94, 57, 79, 82, 90, -101, 79, com.google.common.base.c.f116471x, -94, 68, 108, 66, 124, 100, -115, -12};

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final androidx.media3.common.w f67961a0 = new androidx.media3.common.w.b().u0("application/x-emsg").N();

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f67991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f67992b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f67993c;

        public b(long j10, boolean z10, int i10) {
            this.f67991a = j10;
            this.f67992b = z10;
            this.f67993c = i10;
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final int f67994n = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u0 f67995a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public y f67998d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public androidx.media3.extractor.mp4.c f67999e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f68000f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f68001g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f68002h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f68003i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final String f68004j;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f68007m;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final x f67996b = new x();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o0 f67997c = new o0();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final o0 f68005k = new o0(1);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final o0 f68006l = new o0();

        public c(u0 u0Var, y yVar, androidx.media3.extractor.mp4.c cVar, String str) {
            this.f67995a = u0Var;
            this.f67998d = yVar;
            this.f67999e = cVar;
            this.f68004j = str;
            j(yVar, cVar);
        }

        public int c() {
            int i10;
            if (this.f68007m) {
                i10 = this.f67996b.f68138k[this.f68000f] ? 1 : 0;
            } else {
                i10 = this.f67998d.f68152g[this.f68000f];
            }
            return g() != null ? 1073741824 | i10 : i10;
        }

        public long d() {
            return !this.f68007m ? this.f67998d.f68148c[this.f68000f] : this.f67996b.f68134g[this.f68002h];
        }

        public long e() {
            return !this.f68007m ? this.f67998d.f68151f[this.f68000f] : this.f67996b.c(this.f68000f);
        }

        public int f() {
            return !this.f68007m ? this.f67998d.f68149d[this.f68000f] : this.f67996b.f68136i[this.f68000f];
        }

        @p0
        public w g() {
            if (!this.f68007m) {
                return null;
            }
            int i10 = ((androidx.media3.extractor.mp4.c) k1.o(this.f67996b.f68128a)).f67947a;
            w wVarC = this.f67996b.f68141n;
            if (wVarC == null) {
                wVarC = this.f67998d.f68146a.c(i10);
            }
            if (wVarC == null || !wVarC.f68123a) {
                return null;
            }
            return wVarC;
        }

        public boolean h() {
            this.f68000f++;
            if (!this.f68007m) {
                return false;
            }
            int i10 = this.f68001g + 1;
            this.f68001g = i10;
            int[] iArr = this.f67996b.f68135h;
            int i11 = this.f68002h;
            if (i10 != iArr[i11]) {
                return true;
            }
            this.f68002h = i11 + 1;
            this.f68001g = 0;
            return false;
        }

        public int i(int i10, int i11) {
            o0 o0Var;
            w wVarG = g();
            if (wVarG == null) {
                return 0;
            }
            int length = wVarG.f68126d;
            if (length != 0) {
                o0Var = this.f67996b.f68142o;
            } else {
                byte[] bArr = (byte[]) k1.o(wVarG.f68127e);
                this.f68006l.Y(bArr, bArr.length);
                o0 o0Var2 = this.f68006l;
                length = bArr.length;
                o0Var = o0Var2;
            }
            boolean zG = this.f67996b.g(this.f68000f);
            boolean z10 = zG || i11 != 0;
            this.f68005k.e()[0] = (byte) ((z10 ? 128 : 0) | length);
            this.f68005k.a0(0);
            this.f67995a.a(this.f68005k, 1, 1);
            this.f67995a.a(o0Var, length, 1);
            if (!z10) {
                return length + 1;
            }
            if (!zG) {
                this.f67997c.W(8);
                byte[] bArrE = this.f67997c.e();
                bArrE[0] = 0;
                bArrE[1] = 1;
                bArrE[2] = (byte) ((i11 >> 8) & 255);
                bArrE[3] = (byte) (i11 & 255);
                bArrE[4] = (byte) ((i10 >> 24) & 255);
                bArrE[5] = (byte) ((i10 >> 16) & 255);
                bArrE[6] = (byte) ((i10 >> 8) & 255);
                bArrE[7] = (byte) (i10 & 255);
                this.f67995a.a(this.f67997c, 8, 1);
                return length + 9;
            }
            o0 o0Var3 = this.f67996b.f68142o;
            int iT = o0Var3.T();
            o0Var3.b0(-2);
            int i12 = (iT * 6) + 2;
            if (i11 != 0) {
                this.f67997c.W(i12);
                byte[] bArrE2 = this.f67997c.e();
                o0Var3.n(bArrE2, 0, i12);
                int i13 = (((bArrE2[2] & 255) << 8) | (bArrE2[3] & 255)) + i11;
                bArrE2[2] = (byte) ((i13 >> 8) & 255);
                bArrE2[3] = (byte) (i13 & 255);
                o0Var3 = this.f67997c;
            }
            this.f67995a.a(o0Var3, i12, 1);
            return length + 1 + i12;
        }

        public void j(y yVar, androidx.media3.extractor.mp4.c cVar) {
            this.f67998d = yVar;
            this.f67999e = cVar;
            this.f67995a.e(yVar.f68146a.f68116g.b().U(this.f68004j).N());
            k();
        }

        public void k() {
            this.f67996b.f();
            this.f68000f = 0;
            this.f68002h = 0;
            this.f68001g = 0;
            this.f68003i = 0;
            this.f68007m = false;
        }

        public void l(long j10) {
            int i10 = this.f68000f;
            while (true) {
                x xVar = this.f67996b;
                if (i10 >= xVar.f68133f || xVar.c(i10) > j10) {
                    return;
                }
                if (this.f67996b.f68138k[i10]) {
                    this.f68003i = i10;
                }
                i10++;
            }
        }

        public void m() {
            w wVarG = g();
            if (wVarG == null) {
                return;
            }
            o0 o0Var = this.f67996b.f68142o;
            int i10 = wVarG.f68126d;
            if (i10 != 0) {
                o0Var.b0(i10);
            }
            if (this.f67996b.g(this.f68000f)) {
                o0Var.b0(o0Var.T() * 6);
            }
        }

        public void n(DrmInitData drmInitData) {
            w wVarC = this.f67998d.f68146a.c(((androidx.media3.extractor.mp4.c) k1.o(this.f67996b.f68128a)).f67947a);
            this.f67995a.e(this.f67998d.f68146a.f68116g.b().U(this.f68004j).Y(drmInitData.c(wVarC != null ? wVarC.f68124b : null)).N());
        }
    }

    @Deprecated
    public i() {
        this(androidx.media3.extractor.text.r.a.f68570a, 32, null, null, l6.F(), null);
    }

    private void A(long j10) {
        while (!this.f67982r.isEmpty()) {
            b bVarRemoveFirst = this.f67982r.removeFirst();
            this.B -= bVarRemoveFirst.f67993c;
            long jA = bVarRemoveFirst.f67991a;
            if (bVarRemoveFirst.f67992b) {
                jA += j10;
            }
            w0 w0Var = this.f67978n;
            if (w0Var != null) {
                jA = w0Var.a(jA);
            }
            long j11 = jA;
            for (u0 u0Var : this.M) {
                u0Var.g(j11, 1, bVarRemoveFirst.f67993c, this.B, null);
            }
        }
    }

    private static long B(o0 o0Var) {
        o0Var.a0(8);
        return androidx.media3.extractor.mp4.b.n(o0Var.s()) == 0 ? o0Var.N() : o0Var.S();
    }

    private static void C(androidx.media3.container.b.C0572b c0572b, SparseArray<c> sparseArray, boolean z10, int i10, byte[] bArr) throws v0 {
        int size = c0572b.S1.size();
        for (int i11 = 0; i11 < size; i11++) {
            androidx.media3.container.b.C0572b c0572b2 = c0572b.S1.get(i11);
            if (c0572b2.f62099a == 1953653094) {
                L(c0572b2, sparseArray, z10, i10, bArr);
            }
        }
    }

    private static void D(o0 o0Var, x xVar) throws v0 {
        o0Var.a0(8);
        int iS = o0Var.s();
        if ((androidx.media3.extractor.mp4.b.m(iS) & 1) == 1) {
            o0Var.b0(8);
        }
        int iP = o0Var.P();
        if (iP == 1) {
            xVar.f68131d += androidx.media3.extractor.mp4.b.n(iS) == 0 ? o0Var.N() : o0Var.S();
        } else {
            throw v0.a("Unexpected saio entry count: " + iP, null);
        }
    }

    private static void E(w wVar, o0 o0Var, x xVar) throws v0 {
        int i10;
        int i11 = wVar.f68126d;
        o0Var.a0(8);
        if ((androidx.media3.extractor.mp4.b.m(o0Var.s()) & 1) == 1) {
            o0Var.b0(8);
        }
        int iL = o0Var.L();
        int iP = o0Var.P();
        if (iP > xVar.f68133f) {
            throw v0.a("Saiz sample count " + iP + " is greater than fragment sample count" + xVar.f68133f, null);
        }
        int i12 = 5 ^ 0;
        if (iL == 0) {
            boolean[] zArr = xVar.f68140m;
            i10 = 0;
            for (int i13 = 0; i13 < iP; i13++) {
                int iL2 = o0Var.L();
                i10 += iL2;
                zArr[i13] = iL2 > i11;
            }
        } else {
            i10 = iL * iP;
            Arrays.fill(xVar.f68140m, 0, iP, iL > i11);
        }
        Arrays.fill(xVar.f68140m, iP, xVar.f68133f, false);
        if (i10 > 0) {
            xVar.d(i10);
        }
    }

    private static void F(androidx.media3.container.b.C0572b c0572b, @p0 String str, x xVar) throws v0 {
        byte[] bArr = null;
        o0 o0Var = null;
        o0 o0Var2 = null;
        for (int i10 = 0; i10 < c0572b.R1.size(); i10++) {
            androidx.media3.container.b.c cVar = c0572b.R1.get(i10);
            o0 o0Var3 = cVar.Q1;
            int i11 = cVar.f62099a;
            if (i11 == 1935828848) {
                o0Var3.a0(12);
                if (o0Var3.s() == Y) {
                    o0Var = o0Var3;
                }
            } else if (i11 == 1936158820) {
                o0Var3.a0(12);
                if (o0Var3.s() == Y) {
                    o0Var2 = o0Var3;
                }
            }
        }
        if (o0Var == null || o0Var2 == null) {
            return;
        }
        o0Var.a0(8);
        int iN = androidx.media3.extractor.mp4.b.n(o0Var.s());
        o0Var.b0(4);
        if (iN == 1) {
            o0Var.b0(4);
        }
        if (o0Var.s() != 1) {
            throw v0.e("Entry count in sbgp != 1 (unsupported).");
        }
        o0Var2.a0(8);
        int iN2 = androidx.media3.extractor.mp4.b.n(o0Var2.s());
        o0Var2.b0(4);
        if (iN2 == 1) {
            if (o0Var2.N() == 0) {
                throw v0.e("Variable length description in sgpd found (unsupported)");
            }
        } else if (iN2 >= 2) {
            o0Var2.b0(4);
        }
        if (o0Var2.N() != 1) {
            throw v0.e("Entry count in sgpd != 1 (unsupported).");
        }
        o0Var2.b0(1);
        int iL = o0Var2.L();
        int i12 = (iL & 240) >> 4;
        int i13 = iL & 15;
        boolean z10 = o0Var2.L() == 1;
        if (z10) {
            int iL2 = o0Var2.L();
            byte[] bArr2 = new byte[16];
            o0Var2.n(bArr2, 0, 16);
            if (iL2 == 0) {
                int iL3 = o0Var2.L();
                bArr = new byte[iL3];
                o0Var2.n(bArr, 0, iL3);
            }
            xVar.f68139l = true;
            xVar.f68141n = new w(z10, str, iL2, bArr2, i12, i13, bArr);
        }
    }

    private static void G(o0 o0Var, int i10, x xVar) throws v0 {
        o0Var.a0(i10 + 8);
        int iM = androidx.media3.extractor.mp4.b.m(o0Var.s());
        if ((iM & 1) != 0) {
            throw v0.e("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        int i11 = 4 & 0;
        boolean z10 = (iM & 2) != 0;
        int iP = o0Var.P();
        if (iP == 0) {
            Arrays.fill(xVar.f68140m, 0, xVar.f68133f, false);
            return;
        }
        if (iP == xVar.f68133f) {
            Arrays.fill(xVar.f68140m, 0, iP, z10);
            xVar.d(o0Var.a());
            xVar.a(o0Var);
        } else {
            boolean z11 = true & false;
            throw v0.a("Senc sample count " + iP + " is different from fragment sample count" + xVar.f68133f, null);
        }
    }

    private static void H(o0 o0Var, x xVar) throws v0 {
        G(o0Var, 0, xVar);
    }

    private static Pair<Long, androidx.media3.extractor.g> I(o0 o0Var, long j10) throws v0 {
        long jS;
        long jS2;
        o0Var.a0(8);
        int iN = androidx.media3.extractor.mp4.b.n(o0Var.s());
        o0Var.b0(4);
        long jN = o0Var.N();
        if (iN == 0) {
            jS = o0Var.N();
            jS2 = o0Var.N();
        } else {
            jS = o0Var.S();
            jS2 = o0Var.S();
        }
        long j11 = j10 + jS2;
        long jX1 = k1.X1(jS, 1000000L, jN);
        o0Var.b0(2);
        int iT = o0Var.T();
        int[] iArr = new int[iT];
        long[] jArr = new long[iT];
        long[] jArr2 = new long[iT];
        long[] jArr3 = new long[iT];
        long j12 = j11;
        long jX2 = jX1;
        int i10 = 0;
        while (i10 < iT) {
            int iS = o0Var.s();
            if ((Integer.MIN_VALUE & iS) != 0) {
                throw v0.a("Unhandled indirect reference", null);
            }
            long jN2 = o0Var.N();
            iArr[i10] = iS & Integer.MAX_VALUE;
            jArr[i10] = j12;
            jArr3[i10] = jX2;
            jS += jN2;
            long[] jArr4 = jArr3;
            jX2 = k1.X1(jS, 1000000L, jN);
            jArr2[i10] = jX2 - jArr4[i10];
            o0Var.b0(4);
            j12 += (long) iArr[i10];
            i10++;
            jArr3 = jArr4;
        }
        return Pair.create(Long.valueOf(jX1), new androidx.media3.extractor.g(iArr, jArr, jArr2, jArr3));
    }

    private static long J(o0 o0Var) {
        o0Var.a0(8);
        return androidx.media3.extractor.mp4.b.n(o0Var.s()) == 1 ? o0Var.S() : o0Var.N();
    }

    @p0
    private static c K(o0 o0Var, SparseArray<c> sparseArray, boolean z10) {
        o0Var.a0(8);
        int iM = androidx.media3.extractor.mp4.b.m(o0Var.s());
        c cVarValueAt = z10 ? sparseArray.valueAt(0) : sparseArray.get(o0Var.s());
        if (cVarValueAt == null) {
            return null;
        }
        if ((iM & 1) != 0) {
            long jS = o0Var.S();
            x xVar = cVarValueAt.f67996b;
            xVar.f68130c = jS;
            xVar.f68131d = jS;
        }
        androidx.media3.extractor.mp4.c cVar = cVarValueAt.f67999e;
        cVarValueAt.f67996b.f68128a = new androidx.media3.extractor.mp4.c((iM & 2) != 0 ? o0Var.s() - 1 : cVar.f67947a, (iM & 8) != 0 ? o0Var.s() : cVar.f67948b, (iM & 16) != 0 ? o0Var.s() : cVar.f67949c, (iM & 32) != 0 ? o0Var.s() : cVar.f67950d);
        return cVarValueAt;
    }

    private static void L(androidx.media3.container.b.C0572b c0572b, SparseArray<c> sparseArray, boolean z10, int i10, byte[] bArr) throws v0 {
        c cVarK = K(((androidx.media3.container.b.c) androidx.media3.common.util.a.g(c0572b.e(1952868452))).Q1, sparseArray, z10);
        if (cVarK == null) {
            return;
        }
        x xVar = cVarK.f67996b;
        long j10 = xVar.f68144q;
        boolean z11 = xVar.f68145r;
        cVarK.k();
        cVarK.f68007m = true;
        androidx.media3.container.b.c cVarE = c0572b.e(1952867444);
        if (cVarE == null || (i10 & 2) != 0) {
            xVar.f68144q = j10;
            xVar.f68145r = z11;
        } else {
            xVar.f68144q = J(cVarE.Q1);
            xVar.f68145r = true;
        }
        O(c0572b, cVarK, i10);
        w wVarC = cVarK.f67998d.f68146a.c(((androidx.media3.extractor.mp4.c) androidx.media3.common.util.a.g(xVar.f68128a)).f67947a);
        androidx.media3.container.b.c cVarE2 = c0572b.e(1935763834);
        if (cVarE2 != null) {
            E((w) androidx.media3.common.util.a.g(wVarC), cVarE2.Q1, xVar);
        }
        androidx.media3.container.b.c cVarE3 = c0572b.e(1935763823);
        if (cVarE3 != null) {
            D(cVarE3.Q1, xVar);
        }
        androidx.media3.container.b.c cVarE4 = c0572b.e(1936027235);
        if (cVarE4 != null) {
            H(cVarE4.Q1, xVar);
        }
        F(c0572b, wVarC != null ? wVarC.f68124b : null, xVar);
        int size = c0572b.R1.size();
        for (int i11 = 0; i11 < size; i11++) {
            androidx.media3.container.b.c cVar = c0572b.R1.get(i11);
            if (cVar.f62099a == 1970628964) {
                P(cVar.Q1, xVar, bArr);
            }
        }
    }

    private static Pair<Integer, androidx.media3.extractor.mp4.c> M(o0 o0Var) {
        o0Var.a0(12);
        return Pair.create(Integer.valueOf(o0Var.s()), new androidx.media3.extractor.mp4.c(o0Var.s() - 1, o0Var.s(), o0Var.s(), o0Var.s()));
    }

    private static int N(c cVar, int i10, int i11, o0 o0Var, int i12) throws v0 {
        int iS;
        o0Var.a0(8);
        int iM = androidx.media3.extractor.mp4.b.m(o0Var.s());
        v vVar = cVar.f67998d.f68146a;
        x xVar = cVar.f67996b;
        androidx.media3.extractor.mp4.c cVar2 = (androidx.media3.extractor.mp4.c) k1.o(xVar.f68128a);
        xVar.f68135h[i10] = o0Var.P();
        long[] jArr = xVar.f68134g;
        long j10 = xVar.f68130c;
        jArr[i10] = j10;
        if ((iM & 1) != 0) {
            jArr[i10] = j10 + ((long) o0Var.s());
        }
        boolean z10 = (iM & 4) != 0;
        int iS2 = cVar2.f67950d;
        if (z10) {
            iS2 = o0Var.s();
        }
        boolean z11 = (iM & 256) != 0;
        boolean z12 = (iM & 512) != 0;
        boolean z13 = (iM & 1024) != 0;
        boolean z14 = (iM & 2048) != 0;
        long j11 = s(vVar) ? ((long[]) k1.o(vVar.f68119j))[0] : 0L;
        int[] iArr = xVar.f68136i;
        long[] jArr2 = xVar.f68137j;
        boolean[] zArr = xVar.f68138k;
        boolean z15 = z14;
        boolean z16 = vVar.f68111b == 2 && (i11 & 1) != 0;
        int i13 = i12 + xVar.f68135h[i10];
        boolean z17 = z10;
        long j12 = vVar.f68112c;
        long j13 = xVar.f68144q;
        int i14 = i12;
        while (i14 < i13) {
            int iK = k(z11 ? o0Var.s() : cVar2.f67948b);
            int iK2 = k(z12 ? o0Var.s() : cVar2.f67949c);
            if (z13) {
                iS = o0Var.s();
            } else {
                iS = (i14 == 0 && z17) ? iS2 : cVar2.f67950d;
            }
            int i15 = i14;
            long jX1 = k1.X1((((long) (z15 ? o0Var.s() : 0)) + j13) - j11, 1000000L, j12);
            jArr2[i15] = jX1;
            if (!xVar.f68145r) {
                jArr2[i15] = jX1 + cVar.f67998d.f68153h;
            }
            iArr[i15] = iK2;
            zArr[i15] = ((iS >> 16) & 1) == 0 && (!z16 || i15 == 0);
            j13 += (long) iK;
            i14 = i15 + 1;
            i13 = i13;
            z16 = z16;
        }
        int i16 = i13;
        xVar.f68144q = j13;
        return i16;
    }

    private static void O(androidx.media3.container.b.C0572b c0572b, c cVar, int i10) throws v0 {
        List<androidx.media3.container.b.c> list = c0572b.R1;
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            androidx.media3.container.b.c cVar2 = list.get(i13);
            if (cVar2.f62099a == 1953658222) {
                o0 o0Var = cVar2.Q1;
                o0Var.a0(12);
                int iP = o0Var.P();
                if (iP > 0) {
                    i12 += iP;
                    i11++;
                }
            }
        }
        cVar.f68002h = 0;
        cVar.f68001g = 0;
        cVar.f68000f = 0;
        cVar.f67996b.e(i11, i12);
        int i14 = 0;
        int iN = 0;
        for (int i15 = 0; i15 < size; i15++) {
            androidx.media3.container.b.c cVar3 = list.get(i15);
            if (cVar3.f62099a == 1953658222) {
                iN = N(cVar, i14, i10, cVar3.Q1, iN);
                i14++;
            }
        }
    }

    private static void P(o0 o0Var, x xVar, byte[] bArr) throws v0 {
        o0Var.a0(8);
        o0Var.n(bArr, 0, 16);
        if (Arrays.equals(bArr, Z)) {
            G(o0Var, 16, xVar);
        }
    }

    private void Q(long j10) throws v0 {
        while (!this.f67981q.isEmpty() && this.f67981q.peek().Q1 == j10) {
            v(this.f67981q.pop());
        }
        m();
    }

    private boolean R(androidx.media3.extractor.s sVar) throws IOException {
        if (this.f67989y == 0) {
            if (!sVar.e(this.f67980p.e(), 0, 8, true)) {
                return false;
            }
            this.f67989y = 8;
            this.f67980p.a0(0);
            this.f67988x = this.f67980p.N();
            this.f67987w = this.f67980p.s();
        }
        long j10 = this.f67988x;
        if (j10 == 1) {
            sVar.readFully(this.f67980p.e(), 8, 8);
            this.f67989y += 8;
            this.f67988x = this.f67980p.S();
        } else if (j10 == 0) {
            long length = sVar.getLength();
            if (length == -1 && !this.f67981q.isEmpty()) {
                length = this.f67981q.peek().Q1;
            }
            if (length != -1) {
                this.f67988x = (length - sVar.getPosition()) + ((long) this.f67989y);
            }
        }
        if (this.f67988x < this.f67989y) {
            throw v0.e("Atom size less than header length (unsupported).");
        }
        long position = sVar.getPosition() - ((long) this.f67989y);
        int i10 = this.f67987w;
        if ((i10 == 1836019558 || i10 == 1835295092) && !this.O) {
            this.L.u(new androidx.media3.extractor.p0.b(this.D, position));
            this.O = true;
        }
        if (this.f67987w == 1836019558) {
            int size = this.f67972h.size();
            for (int i11 = 0; i11 < size; i11++) {
                x xVar = this.f67972h.valueAt(i11).f67996b;
                xVar.f68129b = position;
                xVar.f68131d = position;
                xVar.f68130c = position;
            }
        }
        int i12 = this.f67987w;
        if (i12 == 1835295092) {
            this.F = null;
            this.A = position + this.f67988x;
            this.f67986v = 2;
            return true;
        }
        if (V(i12)) {
            long position2 = (sVar.getPosition() + this.f67988x) - 8;
            this.f67981q.push(new androidx.media3.container.b.C0572b(this.f67987w, position2));
            if (this.f67988x == this.f67989y) {
                Q(position2);
            } else {
                m();
            }
        } else if (W(this.f67987w)) {
            if (this.f67989y != 8) {
                throw v0.e("Leaf atom defines extended atom size (unsupported).");
            }
            if (this.f67988x > g3.f12256c) {
                throw v0.e("Leaf atom with length > 2147483647 (unsupported).");
            }
            o0 o0Var = new o0((int) this.f67988x);
            System.arraycopy(this.f67980p.e(), 0, o0Var.e(), 0, 8);
            this.f67990z = o0Var;
            this.f67986v = 1;
        } else {
            if (this.f67988x > g3.f12256c) {
                throw v0.e("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.f67990z = null;
            this.f67986v = 1;
        }
        return true;
    }

    private void S(androidx.media3.extractor.s sVar) throws IOException {
        int i10 = (int) (this.f67988x - ((long) this.f67989y));
        o0 o0Var = this.f67990z;
        if (o0Var != null) {
            sVar.readFully(o0Var.e(), 8, i10);
            x(new androidx.media3.container.b.c(this.f67987w, o0Var), sVar.getPosition());
        } else {
            sVar.o(i10);
        }
        Q(sVar.getPosition());
    }

    private void T(androidx.media3.extractor.s sVar) throws IOException {
        int size = this.f67972h.size();
        long j10 = Long.MAX_VALUE;
        c cVarValueAt = null;
        for (int i10 = 0; i10 < size; i10++) {
            x xVar = this.f67972h.valueAt(i10).f67996b;
            if (xVar.f68143p) {
                long j11 = xVar.f68131d;
                if (j11 < j10) {
                    cVarValueAt = this.f67972h.valueAt(i10);
                    j10 = j11;
                }
            }
        }
        if (cVarValueAt == null) {
            this.f67986v = 3;
            return;
        }
        int position = (int) (j10 - sVar.getPosition());
        if (position < 0) {
            throw v0.a("Offset to encryption data was negative.", null);
        }
        sVar.o(position);
        cVarValueAt.f67996b.b(sVar);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x011a  */
    private boolean U(androidx.media3.extractor.s sVar) throws IOException {
        int iF;
        int iQ;
        c cVarP = this.F;
        if (cVarP == null) {
            cVarP = p(this.f67972h);
            if (cVarP == null) {
                int position = (int) (this.A - sVar.getPosition());
                if (position < 0) {
                    throw v0.a("Offset to end of mdat was negative.", null);
                }
                sVar.o(position);
                m();
                return false;
            }
            int iD = (int) (cVarP.d() - sVar.getPosition());
            if (iD < 0) {
                androidx.media3.common.util.z.n(X, "Ignoring negative offset to sample data.");
                iD = 0;
            }
            sVar.o(iD);
            this.F = cVarP;
        }
        if (this.f67986v == 3) {
            this.G = cVarP.f();
            this.J = !j(cVarP.f67998d.f68146a.f68116g);
            if (cVarP.f68000f < cVarP.f68003i) {
                sVar.o(this.G);
                cVarP.m();
                if (!cVarP.h()) {
                    this.F = null;
                }
                this.f67986v = 3;
                return true;
            }
            if (cVarP.f67998d.f68146a.f68117h == 1) {
                this.G -= 8;
                sVar.o(8);
            }
            if ("audio/ac4".equals(cVarP.f67998d.f68146a.f68116g.f61761o)) {
                this.H = cVarP.i(this.G, 7);
                androidx.media3.extractor.c.a(this.G, this.f67977m);
                cVarP.f67995a.b(this.f67977m, 7);
                this.H += 7;
            } else {
                this.H = cVarP.i(this.G, 0);
            }
            this.G += this.H;
            this.f67986v = 4;
            this.I = 0;
        }
        v vVar = cVarP.f67998d.f68146a;
        u0 u0Var = cVarP.f67995a;
        long jE = cVarP.e();
        w0 w0Var = this.f67978n;
        if (w0Var != null) {
            jE = w0Var.a(jE);
        }
        if (vVar.f68120k == 0) {
            while (true) {
                int i10 = this.H;
                int i11 = this.G;
                if (i10 >= i11) {
                    break;
                }
                this.H += u0Var.f(sVar, i11 - i10, false);
            }
        } else {
            byte[] bArrE = this.f67974j.e();
            bArrE[0] = 0;
            bArrE[1] = 0;
            bArrE[2] = 0;
            int i12 = 4 - vVar.f68120k;
            while (this.H < this.G) {
                int i13 = this.I;
                if (i13 == 0) {
                    if (this.N.length > 0 || !this.J) {
                        iQ = androidx.media3.container.f.q(vVar.f68116g);
                        if (vVar.f68120k + iQ > this.G - this.H) {
                            iQ = 0;
                        }
                    } else {
                        iQ = 0;
                    }
                    sVar.readFully(bArrE, i12, vVar.f68120k + iQ);
                    this.f67974j.a0(0);
                    int iS = this.f67974j.s();
                    if (iS < 0) {
                        throw v0.a("Invalid NAL length", null);
                    }
                    this.I = iS - iQ;
                    this.f67973i.a0(0);
                    u0Var.b(this.f67973i, 4);
                    this.H += 4;
                    this.G += i12;
                    this.K = this.N.length > 0 && iQ > 0 && androidx.media3.container.f.o(vVar.f68116g, bArrE[4]);
                    u0Var.b(this.f67974j, iQ);
                    this.H += iQ;
                    if (iQ > 0 && !this.J && androidx.media3.container.f.l(bArrE, 4, iQ, vVar.f68116g)) {
                        this.J = true;
                    }
                } else {
                    if (this.K) {
                        this.f67975k.W(i13);
                        sVar.readFully(this.f67975k.e(), 0, this.I);
                        u0Var.b(this.f67975k, this.I);
                        iF = this.I;
                        int iN = androidx.media3.container.f.N(this.f67975k.e(), this.f67975k.g());
                        this.f67975k.a0(0);
                        this.f67975k.Z(iN);
                        if (vVar.f68116g.f61763q != -1) {
                            int iF2 = this.f67983s.f();
                            int i14 = vVar.f68116g.f61763q;
                            if (iF2 != i14) {
                                this.f67983s.g(i14);
                            }
                        } else if (this.f67983s.f() != 0) {
                            this.f67983s.g(0);
                        }
                        this.f67983s.a(jE, this.f67975k);
                        if ((cVarP.c() & 4) != 0) {
                            this.f67983s.d();
                        }
                    } else {
                        iF = u0Var.f(sVar, i13, false);
                    }
                    this.H += iF;
                    this.I -= iF;
                }
            }
        }
        int iC = cVarP.c();
        if (!this.J) {
            iC |= 67108864;
        }
        int i15 = iC;
        w wVarG = cVarP.g();
        u0Var.g(jE, i15, this.G, 0, wVarG != null ? wVarG.f68125c : null);
        A(jE);
        if (!cVarP.h()) {
            this.F = null;
        }
        this.f67986v = 3;
        return true;
    }

    private static boolean V(int i10) {
        if (i10 != 1836019574 && i10 != 1953653099 && i10 != 1835297121 && i10 != 1835626086 && i10 != 1937007212 && i10 != 1836019558 && i10 != 1953653094 && i10 != 1836475768 && i10 != 1701082227) {
            return false;
        }
        return true;
    }

    private static boolean W(int i10) {
        return i10 == 1751411826 || i10 == 1835296868 || i10 == 1836476516 || i10 == 1936286840 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1668576371 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1937011571 || i10 == 1952867444 || i10 == 1952868452 || i10 == 1953196132 || i10 == 1953654136 || i10 == 1953658222 || i10 == 1886614376 || i10 == 1935763834 || i10 == 1935763823 || i10 == 1936027235 || i10 == 1970628964 || i10 == 1935828848 || i10 == 1936158820 || i10 == 1701606260 || i10 == 1835362404 || i10 == 1701671783;
    }

    public static /* synthetic */ androidx.media3.extractor.r[] e(androidx.media3.extractor.text.r.a aVar) {
        return new androidx.media3.extractor.r[]{new i(aVar)};
    }

    public static /* synthetic */ androidx.media3.extractor.r[] i() {
        return new androidx.media3.extractor.r[]{new i(androidx.media3.extractor.text.r.a.f68570a, 32)};
    }

    private boolean j(androidx.media3.common.w wVar) {
        if (Objects.equals(wVar.f61761o, "video/avc")) {
            return (this.f67969e & 64) != 0;
        }
        return Objects.equals(wVar.f61761o, "video/hevc") && (this.f67969e & 128) != 0;
    }

    private static int k(int i10) throws v0 {
        if (i10 >= 0) {
            return i10;
        }
        throw v0.a("Unexpected negative value: " + i10, null);
    }

    public static int l(int i10) {
        int i11 = (i10 & 1) != 0 ? 64 : 0;
        return (i10 & 2) != 0 ? i11 | 128 : i11;
    }

    private void m() {
        this.f67986v = 0;
        this.f67989y = 0;
    }

    private androidx.media3.extractor.mp4.c n(SparseArray<androidx.media3.extractor.mp4.c> sparseArray, int i10) {
        return sparseArray.size() == 1 ? sparseArray.valueAt(0) : (androidx.media3.extractor.mp4.c) androidx.media3.common.util.a.g(sparseArray.get(i10));
    }

    @p0
    private static DrmInitData o(List<androidx.media3.container.b.c> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            androidx.media3.container.b.c cVar = list.get(i10);
            if (cVar.f62099a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrE = cVar.Q1.e();
                UUID uuidF = r.f(bArrE);
                if (uuidF == null) {
                    androidx.media3.common.util.z.n(X, "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new DrmInitData.SchemeData(uuidF, "video/mp4", bArrE));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    @p0
    private static c p(SparseArray<c> sparseArray) {
        int size = sparseArray.size();
        c cVar = null;
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            c cVarValueAt = sparseArray.valueAt(i10);
            if ((cVarValueAt.f68007m || cVarValueAt.f68000f != cVarValueAt.f67998d.f68147b) && (!cVarValueAt.f68007m || cVarValueAt.f68002h != cVarValueAt.f67996b.f68132e)) {
                long jD = cVarValueAt.d();
                if (jD < j10) {
                    cVar = cVarValueAt;
                    j10 = jD;
                }
            }
        }
        return cVar;
    }

    private void r() {
        int i10;
        u0[] u0VarArr = new u0[2];
        this.M = u0VarArr;
        u0 u0Var = this.f67984t;
        int i11 = 0;
        if (u0Var != null) {
            u0VarArr[0] = u0Var;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i12 = 100;
        if ((this.f67969e & 4) != 0) {
            u0VarArr[i10] = this.L.a(100, 5);
            i12 = 101;
            i10++;
        }
        u0[] u0VarArr2 = (u0[]) k1.J1(this.M, i10);
        this.M = u0VarArr2;
        for (u0 u0Var2 : u0VarArr2) {
            u0Var2.e(f67961a0);
        }
        this.N = new u0[this.f67971g.size()];
        while (i11 < this.N.length) {
            u0 u0VarA = this.L.a(i12, 3);
            u0VarA.e(this.f67971g.get(i11));
            this.N[i11] = u0VarA;
            i11++;
            i12++;
        }
    }

    private static boolean s(v vVar) {
        long[] jArr = vVar.f68118i;
        if (jArr != null && jArr.length == 1 && vVar.f68119j != null) {
            long j10 = jArr[0];
            if (j10 == 0 || k1.X1(j10, 1000000L, vVar.f68113d) + k1.X1(vVar.f68119j[0], 1000000L, vVar.f68112c) >= vVar.f68114e) {
                return true;
            }
        }
        return false;
    }

    public static androidx.media3.extractor.w u(final androidx.media3.extractor.text.r.a aVar) {
        return new androidx.media3.extractor.w() { // from class: androidx.media3.extractor.mp4.g
            @Override // androidx.media3.extractor.w
            public final androidx.media3.extractor.r[] c() {
                return i.e(aVar);
            }
        };
    }

    private void v(androidx.media3.container.b.C0572b c0572b) throws v0 {
        int i10 = c0572b.f62099a;
        if (i10 == 1836019574) {
            z(c0572b);
        } else if (i10 == 1836019558) {
            y(c0572b);
        } else {
            if (this.f67981q.isEmpty()) {
                return;
            }
            this.f67981q.peek().b(c0572b);
        }
    }

    private void w(o0 o0Var) {
        String str;
        String str2;
        long jX1;
        long jX2;
        long jN;
        long jA;
        if (this.M.length == 0) {
            return;
        }
        o0Var.a0(8);
        int iN = androidx.media3.extractor.mp4.b.n(o0Var.s());
        if (iN == 0) {
            str = (String) androidx.media3.common.util.a.g(o0Var.F());
            str2 = (String) androidx.media3.common.util.a.g(o0Var.F());
            long jN2 = o0Var.N();
            jX1 = k1.X1(o0Var.N(), 1000000L, jN2);
            long j10 = this.E;
            long j11 = j10 != -9223372036854775807L ? j10 + jX1 : -9223372036854775807L;
            jX2 = k1.X1(o0Var.N(), 1000L, jN2);
            jN = o0Var.N();
            jA = j11;
        } else {
            if (iN != 1) {
                androidx.media3.common.util.z.n(X, "Skipping unsupported emsg version: " + iN);
                return;
            }
            long jN3 = o0Var.N();
            jA = k1.X1(o0Var.S(), 1000000L, jN3);
            long jX3 = k1.X1(o0Var.N(), 1000L, jN3);
            long jN4 = o0Var.N();
            str = (String) androidx.media3.common.util.a.g(o0Var.F());
            str2 = (String) androidx.media3.common.util.a.g(o0Var.F());
            jX2 = jX3;
            jN = jN4;
            jX1 = -9223372036854775807L;
        }
        String str3 = str;
        String str4 = str2;
        byte[] bArr = new byte[o0Var.a()];
        o0Var.n(bArr, 0, o0Var.a());
        o0 o0Var2 = new o0(this.f67979o.a(new androidx.media3.extractor.metadata.emsg.a(str3, str4, jX2, jN, bArr)));
        int iA = o0Var2.a();
        for (u0 u0Var : this.M) {
            o0Var2.a0(0);
            u0Var.b(o0Var2, iA);
        }
        if (jA == -9223372036854775807L) {
            this.f67982r.addLast(new b(jX1, true, iA));
            this.B += iA;
            return;
        }
        if (!this.f67982r.isEmpty()) {
            this.f67982r.addLast(new b(jA, false, iA));
            this.B += iA;
            return;
        }
        w0 w0Var = this.f67978n;
        if (w0Var != null && !w0Var.g()) {
            this.f67982r.addLast(new b(jA, false, iA));
            this.B += iA;
            return;
        }
        w0 w0Var2 = this.f67978n;
        if (w0Var2 != null) {
            jA = w0Var2.a(jA);
        }
        long j12 = jA;
        for (u0 u0Var2 : this.M) {
            u0Var2.g(j12, 1, iA, 0, null);
        }
    }

    private void x(androidx.media3.container.b.c cVar, long j10) throws v0 {
        if (!this.f67981q.isEmpty()) {
            this.f67981q.peek().c(cVar);
            return;
        }
        int i10 = cVar.f62099a;
        if (i10 != 1936286840) {
            if (i10 == 1701671783) {
                w(cVar.Q1);
            }
        } else {
            Pair<Long, androidx.media3.extractor.g> pairI = I(cVar.Q1, j10);
            this.E = ((Long) pairI.first).longValue();
            this.L.u((androidx.media3.extractor.p0) pairI.second);
            this.O = true;
        }
    }

    private void y(androidx.media3.container.b.C0572b c0572b) throws v0 {
        int i10 = 7 & 0;
        C(c0572b, this.f67972h, this.f67970f != null, this.f67969e, this.f67976l);
        DrmInitData drmInitDataO = o(c0572b.R1);
        if (drmInitDataO != null) {
            int size = this.f67972h.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.f67972h.valueAt(i11).n(drmInitDataO);
            }
        }
        if (this.C != -9223372036854775807L) {
            int size2 = this.f67972h.size();
            for (int i12 = 0; i12 < size2; i12++) {
                this.f67972h.valueAt(i12).l(this.C);
            }
            this.C = -9223372036854775807L;
        }
    }

    private void z(androidx.media3.container.b.C0572b c0572b) throws v0 {
        int i10 = 0;
        androidx.media3.common.util.a.j(this.f67970f == null, "Unexpected moov box.");
        DrmInitData drmInitDataO = o(c0572b.R1);
        androidx.media3.container.b.C0572b c0572b2 = (androidx.media3.container.b.C0572b) androidx.media3.common.util.a.g(c0572b.d(1836475768));
        SparseArray<androidx.media3.extractor.mp4.c> sparseArray = new SparseArray<>();
        int size = c0572b2.R1.size();
        long jB = -9223372036854775807L;
        for (int i11 = 0; i11 < size; i11++) {
            androidx.media3.container.b.c cVar = c0572b2.R1.get(i11);
            int i12 = cVar.f62099a;
            if (i12 == 1953654136) {
                Pair<Integer, androidx.media3.extractor.mp4.c> pairM = M(cVar.Q1);
                sparseArray.put(((Integer) pairM.first).intValue(), (androidx.media3.extractor.mp4.c) pairM.second);
            } else if (i12 == 1835362404) {
                jB = B(cVar.Q1);
            }
        }
        List<y> listE = androidx.media3.extractor.mp4.b.E(c0572b, new g0(), jB, drmInitDataO, (this.f67969e & 16) != 0, false, new com.google.common.base.t() { // from class: androidx.media3.extractor.mp4.e
            @Override // com.google.common.base.t
            public final Object apply(Object obj) {
                return this.f67958a.t((v) obj);
            }
        });
        int size2 = listE.size();
        if (this.f67972h.size() != 0) {
            androidx.media3.common.util.a.i(this.f67972h.size() == size2);
            while (i10 < size2) {
                y yVar = listE.get(i10);
                v vVar = yVar.f68146a;
                this.f67972h.get(vVar.f68110a).j(yVar, n(sparseArray, vVar.f68110a));
                i10++;
            }
            return;
        }
        String strB = l.b(listE);
        while (i10 < size2) {
            y yVar2 = listE.get(i10);
            v vVar2 = yVar2.f68146a;
            u0 u0VarA = this.L.a(i10, vVar2.f68111b);
            u0VarA.c(vVar2.f68114e);
            this.f67972h.put(vVar2.f68110a, new c(u0VarA, yVar2, n(sparseArray, vVar2.f68110a), strB));
            this.D = Math.max(this.D, vVar2.f68114e);
            i10++;
        }
        this.L.l();
    }

    @Override // androidx.media3.extractor.r
    public void a(long j10, long j11) {
        int size = this.f67972h.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f67972h.valueAt(i10).k();
        }
        this.f67982r.clear();
        this.B = 0;
        this.f67983s.b();
        this.C = j11;
        this.f67981q.clear();
        m();
    }

    @Override // androidx.media3.extractor.r
    public int f(androidx.media3.extractor.s sVar, n0 n0Var) throws IOException {
        while (true) {
            int i10 = this.f67986v;
            if (i10 != 0) {
                if (i10 == 1) {
                    S(sVar);
                } else if (i10 == 2) {
                    T(sVar);
                } else if (U(sVar)) {
                    return 0;
                }
            } else if (!R(sVar)) {
                this.f67983s.d();
                return -1;
            }
        }
    }

    @Override // androidx.media3.extractor.r
    public boolean g(androidx.media3.extractor.s sVar) throws IOException {
        t0 t0VarB = u.b(sVar);
        this.f67985u = t0VarB != null ? l6.G(t0VarB) : l6.F();
        return t0VarB == null;
    }

    @Override // androidx.media3.extractor.r
    public void h(androidx.media3.extractor.t tVar) {
        if ((this.f67969e & 32) == 0) {
            tVar = new androidx.media3.extractor.text.t(tVar, this.f67968d);
        }
        this.L = tVar;
        m();
        r();
        v vVar = this.f67970f;
        if (vVar != null) {
            this.f67972h.put(0, new c(this.L.a(0, vVar.f68111b), new y(this.f67970f, new long[0], new int[0], 0, new long[0], new int[0], 0L), new androidx.media3.extractor.mp4.c(0, 0, 0, 0), l.a(this.f67970f.f68116g)));
            this.L.l();
        }
    }

    @Override // androidx.media3.extractor.r
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public l6<t0> c() {
        return this.f67985u;
    }

    @Override // androidx.media3.extractor.r
    public void release() {
    }

    @p0
    protected v t(@p0 v vVar) {
        return vVar;
    }

    public i(androidx.media3.extractor.text.r.a aVar) {
        this(aVar, 0, null, null, l6.F(), null);
    }

    @Deprecated
    public i(int i10) {
        this(androidx.media3.extractor.text.r.a.f68570a, i10 | 32, null, null, l6.F(), null);
    }

    public i(androidx.media3.extractor.text.r.a aVar, int i10) {
        this(aVar, i10, null, null, l6.F(), null);
    }

    @Deprecated
    public i(int i10, @p0 w0 w0Var) {
        this(androidx.media3.extractor.text.r.a.f68570a, i10 | 32, w0Var, null, l6.F(), null);
    }

    @Deprecated
    public i(int i10, @p0 w0 w0Var, @p0 v vVar) {
        this(androidx.media3.extractor.text.r.a.f68570a, i10 | 32, w0Var, vVar, l6.F(), null);
    }

    @Deprecated
    public i(int i10, @p0 w0 w0Var, @p0 v vVar, List<androidx.media3.common.w> list) {
        this(androidx.media3.extractor.text.r.a.f68570a, i10 | 32, w0Var, vVar, list, null);
    }

    @Deprecated
    public i(int i10, @p0 w0 w0Var, @p0 v vVar, List<androidx.media3.common.w> list, @p0 u0 u0Var) {
        this(androidx.media3.extractor.text.r.a.f68570a, i10 | 32, w0Var, vVar, list, u0Var);
    }

    public i(androidx.media3.extractor.text.r.a aVar, int i10, @p0 w0 w0Var, @p0 v vVar, List<androidx.media3.common.w> list, @p0 u0 u0Var) {
        this.f67968d = aVar;
        this.f67969e = i10;
        this.f67978n = w0Var;
        this.f67970f = vVar;
        this.f67971g = Collections.unmodifiableList(list);
        this.f67984t = u0Var;
        this.f67979o = new androidx.media3.extractor.metadata.emsg.c();
        this.f67980p = new o0(16);
        this.f67973i = new o0(androidx.media3.container.f.C);
        this.f67974j = new o0(6);
        this.f67975k = new o0();
        byte[] bArr = new byte[16];
        this.f67976l = bArr;
        this.f67977m = new o0(bArr);
        this.f67981q = new ArrayDeque<>();
        this.f67982r = new ArrayDeque<>();
        this.f67972h = new SparseArray<>();
        this.f67985u = l6.F();
        this.D = -9223372036854775807L;
        this.C = -9223372036854775807L;
        this.E = -9223372036854775807L;
        this.L = androidx.media3.extractor.t.f68307e1;
        this.M = new u0[0];
        this.N = new u0[0];
        this.f67983s = new androidx.media3.container.j(new androidx.media3.container.j.b() { // from class: androidx.media3.extractor.mp4.h
            @Override // androidx.media3.container.j.b
            public final void a(long j10, o0 o0Var) {
                androidx.media3.extractor.f.a(j10, o0Var, this.f67960a.N);
            }
        });
    }
}
