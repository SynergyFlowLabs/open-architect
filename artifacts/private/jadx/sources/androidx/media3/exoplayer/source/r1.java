package androidx.media3.exoplayer.source;

import android.os.Looper;
import androidx.media3.common.DrmInitData;
import androidx.media3.exoplayer.analytics.j4;
import androidx.media3.exoplayer.p3;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public class r1 implements androidx.media3.extractor.u0 {

    @androidx.annotation.l1
    static final int K = 1000;
    private static final String L = "SampleQueue";
    private boolean C;

    @androidx.annotation.p0
    private androidx.media3.common.w D;

    @androidx.annotation.p0
    private androidx.media3.common.w E;
    private long F;
    private boolean H;
    private long I;
    private boolean J;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p1 f65431d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private final androidx.media3.exoplayer.drm.u f65434g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.p0
    private final androidx.media3.exoplayer.drm.t.a f65435h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.p0
    private d f65436i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.p0
    private androidx.media3.common.w f65437j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.p0
    private androidx.media3.exoplayer.drm.m f65438k;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f65446s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f65447t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f65448u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f65449v;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f65453z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f65432e = new b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f65439l = 1000;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long[] f65440m = new long[1000];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long[] f65441n = new long[1000];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long[] f65444q = new long[1000];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int[] f65443p = new int[1000];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int[] f65442o = new int[1000];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private androidx.media3.extractor.u0.a[] f65445r = new androidx.media3.extractor.u0.a[1000];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final b2<c> f65433f = new b2<>(new androidx.media3.common.util.o() { // from class: androidx.media3.exoplayer.source.q1
        @Override // androidx.media3.common.util.o
        public final void accept(Object obj) {
            ((r1.c) obj).f65458b.release();
        }
    });

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f65450w = Long.MIN_VALUE;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f65451x = Long.MIN_VALUE;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f65452y = Long.MIN_VALUE;
    private boolean B = true;
    private boolean A = true;
    private boolean G = true;

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f65454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f65455b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        public androidx.media3.extractor.u0.a f65456c;

        b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.media3.common.w f65457a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final androidx.media3.exoplayer.drm.u.b f65458b;

        private c(androidx.media3.common.w wVar, androidx.media3.exoplayer.drm.u.b bVar) {
            this.f65457a = wVar;
            this.f65458b = bVar;
        }
    }

    public interface d {
        void r(androidx.media3.common.w wVar);
    }

    protected r1(androidx.media3.exoplayer.upstream.b bVar, @androidx.annotation.p0 androidx.media3.exoplayer.drm.u uVar, @androidx.annotation.p0 androidx.media3.exoplayer.drm.t.a aVar) {
        this.f65434g = uVar;
        this.f65435h = aVar;
        this.f65431d = new p1(bVar);
    }

    private long F(int i10) {
        long jMax = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int iH = H(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            jMax = Math.max(jMax, this.f65444q[iH]);
            if ((this.f65443p[iH] & 1) != 0) {
                return jMax;
            }
            iH--;
            if (iH == -1) {
                iH = this.f65439l - 1;
            }
        }
        return jMax;
    }

    private int H(int i10) {
        int i11 = this.f65448u + i10;
        int i12 = this.f65439l;
        return i11 < i12 ? i11 : i11 - i12;
    }

    private boolean L() {
        return this.f65449v != this.f65446s;
    }

    private boolean P(int i10) {
        androidx.media3.exoplayer.drm.m mVar = this.f65438k;
        return mVar == null || mVar.getState() == 4 || ((this.f65443p[i10] & 1073741824) == 0 && this.f65438k.a());
    }

    private void R(androidx.media3.common.w wVar, p3 p3Var) {
        androidx.media3.common.w wVar2 = this.f65437j;
        boolean z10 = wVar2 == null;
        DrmInitData drmInitData = wVar2 == null ? null : wVar2.f61765s;
        this.f65437j = wVar;
        DrmInitData drmInitData2 = wVar.f61765s;
        androidx.media3.exoplayer.drm.u uVar = this.f65434g;
        p3Var.f64600b = uVar != null ? wVar.c(uVar.a(wVar)) : wVar;
        p3Var.f64599a = this.f65438k;
        if (this.f65434g == null) {
            return;
        }
        if (z10 || !Objects.equals(drmInitData, drmInitData2)) {
            androidx.media3.exoplayer.drm.m mVar = this.f65438k;
            androidx.media3.exoplayer.drm.m mVarC = this.f65434g.c(this.f65435h, wVar);
            this.f65438k = mVarC;
            p3Var.f64599a = mVarC;
            if (mVar != null) {
                mVar.d(this.f65435h);
            }
        }
    }

    private synchronized int S(p3 p3Var, androidx.media3.decoder.g gVar, boolean z10, boolean z11, b bVar) {
        try {
            gVar.f62701e = false;
            int i10 = (-4) & (-3);
            if (!L()) {
                if (!z11 && !this.f65453z) {
                    androidx.media3.common.w wVar = this.E;
                    if (wVar == null || (!z10 && wVar == this.f65437j)) {
                        return -3;
                    }
                    R((androidx.media3.common.w) androidx.media3.common.util.a.g(wVar), p3Var);
                    return -5;
                }
                gVar.z(4);
                gVar.f62702f = Long.MIN_VALUE;
                return -4;
            }
            androidx.media3.common.w wVar2 = this.f65433f.f(G()).f65457a;
            if (!z10 && wVar2 == this.f65437j) {
                int iH = H(this.f65449v);
                if (!P(iH)) {
                    gVar.f62701e = true;
                    return -3;
                }
                gVar.z(this.f65443p[iH]);
                if (this.f65449v == this.f65446s - 1 && (z11 || this.f65453z)) {
                    gVar.c(536870912);
                }
                gVar.f62702f = this.f65444q[iH];
                bVar.f65454a = this.f65442o[iH];
                bVar.f65455b = this.f65441n[iH];
                bVar.f65456c = this.f65445r[iH];
                return -4;
            }
            R(wVar2, p3Var);
            return -5;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void X() {
        androidx.media3.exoplayer.drm.m mVar = this.f65438k;
        if (mVar != null) {
            mVar.d(this.f65435h);
            this.f65438k = null;
            this.f65437j = null;
        }
    }

    private synchronized void a0() {
        try {
            this.f65449v = 0;
            this.f65431d.o();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized boolean f0(androidx.media3.common.w wVar) {
        try {
            this.B = false;
            if (Objects.equals(wVar, this.E)) {
                return false;
            }
            if (this.f65433f.h() || !this.f65433f.g().f65457a.equals(wVar)) {
                this.E = wVar;
            } else {
                this.E = this.f65433f.g().f65457a;
            }
            boolean z10 = this.G;
            androidx.media3.common.w wVar2 = this.E;
            this.G = z10 & androidx.media3.common.s0.a(wVar2.f61761o, wVar2.f61757k);
            this.H = false;
            int i10 = 3 << 1;
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized boolean i(long j10) {
        if (this.f65446s == 0) {
            return j10 > this.f65451x;
        }
        if (E() >= j10) {
            return false;
        }
        w(this.f65447t + k(j10));
        return true;
    }

    private synchronized void j(long j10, int i10, long j11, int i11, @androidx.annotation.p0 androidx.media3.extractor.u0.a aVar) {
        try {
            int i12 = this.f65446s;
            if (i12 > 0) {
                int iH = H(i12 - 1);
                androidx.media3.common.util.a.a(this.f65441n[iH] + ((long) this.f65442o[iH]) <= j11);
            }
            this.f65453z = (536870912 & i10) != 0;
            this.f65452y = Math.max(this.f65452y, j10);
            int iH2 = H(this.f65446s);
            this.f65444q[iH2] = j10;
            this.f65441n[iH2] = j11;
            this.f65442o[iH2] = i11;
            this.f65443p[iH2] = i10;
            this.f65445r[iH2] = aVar;
            this.f65440m[iH2] = this.F;
            if (this.f65433f.h() || !this.f65433f.g().f65457a.equals(this.E)) {
                androidx.media3.common.w wVar = (androidx.media3.common.w) androidx.media3.common.util.a.g(this.E);
                androidx.media3.exoplayer.drm.u uVar = this.f65434g;
                this.f65433f.b(K(), new c(wVar, uVar != null ? uVar.d(this.f65435h, wVar) : androidx.media3.exoplayer.drm.u.b.f63740a));
            }
            int i13 = this.f65446s + 1;
            this.f65446s = i13;
            int i14 = this.f65439l;
            if (i13 == i14) {
                int i15 = i14 + 1000;
                long[] jArr = new long[i15];
                long[] jArr2 = new long[i15];
                long[] jArr3 = new long[i15];
                int[] iArr = new int[i15];
                int[] iArr2 = new int[i15];
                androidx.media3.extractor.u0.a[] aVarArr = new androidx.media3.extractor.u0.a[i15];
                int i16 = this.f65448u;
                int i17 = i14 - i16;
                System.arraycopy(this.f65441n, i16, jArr2, 0, i17);
                System.arraycopy(this.f65444q, this.f65448u, jArr3, 0, i17);
                System.arraycopy(this.f65443p, this.f65448u, iArr, 0, i17);
                System.arraycopy(this.f65442o, this.f65448u, iArr2, 0, i17);
                System.arraycopy(this.f65445r, this.f65448u, aVarArr, 0, i17);
                System.arraycopy(this.f65440m, this.f65448u, jArr, 0, i17);
                int i18 = this.f65448u;
                System.arraycopy(this.f65441n, 0, jArr2, i17, i18);
                System.arraycopy(this.f65444q, 0, jArr3, i17, i18);
                System.arraycopy(this.f65443p, 0, iArr, i17, i18);
                System.arraycopy(this.f65442o, 0, iArr2, i17, i18);
                System.arraycopy(this.f65445r, 0, aVarArr, i17, i18);
                System.arraycopy(this.f65440m, 0, jArr, i17, i18);
                this.f65441n = jArr2;
                this.f65444q = jArr3;
                this.f65443p = iArr;
                this.f65442o = iArr2;
                this.f65445r = aVarArr;
                this.f65440m = jArr;
                this.f65448u = 0;
                this.f65439l = i15;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private int k(long j10) {
        int i10 = this.f65446s;
        int iH = H(i10 - 1);
        while (i10 > this.f65449v && this.f65444q[iH] >= j10) {
            i10--;
            iH--;
            if (iH == -1) {
                iH = this.f65439l - 1;
            }
        }
        return i10;
    }

    @Deprecated
    public static r1 l(androidx.media3.exoplayer.upstream.b bVar, Looper looper, androidx.media3.exoplayer.drm.u uVar, androidx.media3.exoplayer.drm.t.a aVar) {
        uVar.b(looper, j4.f63008d);
        return new r1(bVar, (androidx.media3.exoplayer.drm.u) androidx.media3.common.util.a.g(uVar), (androidx.media3.exoplayer.drm.t.a) androidx.media3.common.util.a.g(aVar));
    }

    public static r1 m(androidx.media3.exoplayer.upstream.b bVar, androidx.media3.exoplayer.drm.u uVar, androidx.media3.exoplayer.drm.t.a aVar) {
        return new r1(bVar, (androidx.media3.exoplayer.drm.u) androidx.media3.common.util.a.g(uVar), (androidx.media3.exoplayer.drm.t.a) androidx.media3.common.util.a.g(aVar));
    }

    public static r1 n(androidx.media3.exoplayer.upstream.b bVar) {
        return new r1(bVar, null, null);
    }

    private synchronized long o(long j10, boolean z10, boolean z11) throws Throwable {
        Throwable th2;
        try {
            try {
                int i10 = this.f65446s;
                if (i10 != 0) {
                    long[] jArr = this.f65444q;
                    int i11 = this.f65448u;
                    if (j10 >= jArr[i11]) {
                        if (z11) {
                            try {
                                int i12 = this.f65449v;
                                if (i12 != i10) {
                                    i10 = i12 + 1;
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                throw th2;
                            }
                        }
                        int iZ = z(i11, i10, j10, z10);
                        if (iZ == -1) {
                            return -1L;
                        }
                        return r(iZ);
                    }
                }
                return -1L;
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    private synchronized long p() {
        try {
            int i10 = this.f65446s;
            if (i10 == 0) {
                return -1L;
            }
            return r(i10);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @androidx.annotation.b0("this")
    private long r(int i10) {
        this.f65451x = Math.max(this.f65451x, F(i10));
        this.f65446s -= i10;
        int i11 = this.f65447t + i10;
        this.f65447t = i11;
        int i12 = this.f65448u + i10;
        this.f65448u = i12;
        int i13 = this.f65439l;
        if (i12 >= i13) {
            this.f65448u = i12 - i13;
        }
        int i14 = this.f65449v - i10;
        this.f65449v = i14;
        if (i14 < 0) {
            this.f65449v = 0;
        }
        this.f65433f.e(i11);
        if (this.f65446s != 0) {
            return this.f65441n[this.f65448u];
        }
        int i15 = this.f65448u;
        if (i15 == 0) {
            i15 = this.f65439l;
        }
        int i16 = i15 - 1;
        return this.f65441n[i16] + ((long) this.f65442o[i16]);
    }

    private long w(int i10) {
        int iK = K() - i10;
        boolean z10 = false;
        androidx.media3.common.util.a.a(iK >= 0 && iK <= this.f65446s - this.f65449v);
        int i11 = this.f65446s - iK;
        this.f65446s = i11;
        this.f65452y = Math.max(this.f65451x, F(i11));
        if (iK == 0 && this.f65453z) {
            z10 = true;
        }
        this.f65453z = z10;
        this.f65433f.d(i10);
        int i12 = this.f65446s;
        if (i12 == 0) {
            return 0L;
        }
        int iH = H(i12 - 1);
        return this.f65441n[iH] + ((long) this.f65442o[iH]);
    }

    private int y(int i10, int i11, long j10, boolean z10) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f65444q[i10] >= j10) {
                return i12;
            }
            i10++;
            if (i10 == this.f65439l) {
                i10 = 0;
            }
        }
        if (z10) {
            return i11;
        }
        return -1;
    }

    private int z(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.f65444q[i10];
            if (j11 > j10) {
                break;
            }
            if (!z10 || (this.f65443p[i10] & 1) != 0) {
                if (j11 == j10) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f65439l) {
                i10 = 0;
            }
        }
        return i12;
    }

    @androidx.annotation.i
    protected androidx.media3.common.w A(androidx.media3.common.w wVar) {
        return (this.I == 0 || wVar.f61766t == Long.MAX_VALUE) ? wVar : wVar.b().y0(wVar.f61766t + this.I).N();
    }

    public final int B() {
        return this.f65447t;
    }

    public final synchronized long C() {
        return this.f65446s == 0 ? Long.MIN_VALUE : this.f65444q[this.f65448u];
    }

    public final synchronized long D() {
        try {
        } finally {
        }
        return this.f65452y;
    }

    public final synchronized long E() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return Math.max(this.f65451x, F(this.f65449v));
    }

    public final int G() {
        return this.f65447t + this.f65449v;
    }

    public final synchronized int I(long j10, boolean z10) throws Throwable {
        Throwable th2;
        try {
            try {
                int iH = H(this.f65449v);
                if (!L() || j10 < this.f65444q[iH]) {
                    return 0;
                }
                if (j10 <= this.f65452y || !z10) {
                    int iZ = z(iH, this.f65446s - this.f65449v, j10, true);
                    if (iZ == -1) {
                        return 0;
                    }
                    return iZ;
                }
                try {
                    return this.f65446s - this.f65449v;
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
        }
        throw th2;
    }

    @androidx.annotation.p0
    public final synchronized androidx.media3.common.w J() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.B ? null : this.E;
    }

    public final int K() {
        return this.f65447t + this.f65446s;
    }

    protected final void M() {
        this.C = true;
    }

    public final synchronized boolean N() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f65453z;
    }

    @androidx.annotation.i
    public synchronized boolean O(boolean z10) {
        androidx.media3.common.w wVar;
        boolean z11 = true;
        if (L()) {
            if (this.f65433f.f(G()).f65457a != this.f65437j) {
                return true;
            }
            return P(H(this.f65449v));
        }
        if (!z10 && !this.f65453z && ((wVar = this.E) == null || wVar == this.f65437j)) {
            z11 = false;
        }
        return z11;
    }

    @androidx.annotation.i
    public void Q() throws IOException {
        androidx.media3.exoplayer.drm.m mVar = this.f65438k;
        if (mVar != null && mVar.getState() == 1) {
            throw ((androidx.media3.exoplayer.drm.m.a) androidx.media3.common.util.a.g(this.f65438k.T()));
        }
    }

    public final synchronized long T() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return L() ? this.f65440m[H(this.f65449v)] : this.F;
    }

    @androidx.annotation.i
    public void U() {
        t();
        X();
    }

    @androidx.annotation.i
    public int V(p3 p3Var, androidx.media3.decoder.g gVar, int i10, boolean z10) {
        int iS = S(p3Var, gVar, (i10 & 2) != 0, z10, this.f65432e);
        if (iS == -4 && !gVar.s()) {
            boolean z11 = (i10 & 1) != 0;
            if ((i10 & 4) == 0) {
                if (z11) {
                    this.f65431d.f(gVar, this.f65432e);
                } else {
                    this.f65431d.m(gVar, this.f65432e);
                }
            }
            if (!z11) {
                this.f65449v++;
            }
        }
        return iS;
    }

    @androidx.annotation.i
    public void W() {
        Z(true);
        X();
    }

    public final void Y() {
        Z(false);
    }

    @androidx.annotation.i
    public void Z(boolean z10) {
        this.f65431d.n();
        this.f65446s = 0;
        this.f65447t = 0;
        this.f65448u = 0;
        this.f65449v = 0;
        this.A = true;
        this.f65450w = Long.MIN_VALUE;
        this.f65451x = Long.MIN_VALUE;
        this.f65452y = Long.MIN_VALUE;
        this.f65453z = false;
        this.f65433f.c();
        if (z10) {
            this.D = null;
            this.E = null;
            this.B = true;
            this.G = true;
        }
    }

    @Override // androidx.media3.extractor.u0
    public final void a(androidx.media3.common.util.o0 o0Var, int i10, int i11) {
        this.f65431d.q(o0Var, i10);
    }

    public final synchronized boolean b0(int i10) {
        a0();
        int i11 = this.f65447t;
        if (i10 >= i11 && i10 <= this.f65446s + i11) {
            this.f65450w = Long.MIN_VALUE;
            this.f65449v = i10 - i11;
            return true;
        }
        return false;
    }

    public final synchronized boolean c0(long j10, boolean z10) throws Throwable {
        r1 r1Var;
        long j11;
        int iZ;
        try {
            try {
                a0();
                int iH = H(this.f65449v);
                if (!L() || j10 < this.f65444q[iH] || (j10 > this.f65452y && !z10)) {
                    return false;
                }
                if (this.G) {
                    r1Var = this;
                    j11 = j10;
                    iZ = r1Var.y(iH, this.f65446s - this.f65449v, j11, z10);
                } else {
                    r1Var = this;
                    j11 = j10;
                    iZ = r1Var.z(iH, r1Var.f65446s - r1Var.f65449v, j11, true);
                }
                if (iZ == -1) {
                    return false;
                }
                r1Var.f65450w = j11;
                r1Var.f65449v += iZ;
                return true;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // androidx.media3.extractor.u0
    public final int d(androidx.media3.common.l lVar, int i10, boolean z10, int i11) throws IOException {
        return this.f65431d.p(lVar, i10, z10);
    }

    public final void d0(long j10) {
        if (this.I != j10) {
            this.I = j10;
            M();
        }
    }

    @Override // androidx.media3.extractor.u0
    public final void e(androidx.media3.common.w wVar) {
        androidx.media3.common.w wVarA = A(wVar);
        this.C = false;
        this.D = wVar;
        boolean zF0 = f0(wVarA);
        d dVar = this.f65436i;
        if (dVar == null || !zF0) {
            return;
        }
        dVar.r(wVarA);
    }

    public final void e0(long j10) {
        this.f65450w = j10;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    @Override // androidx.media3.extractor.u0
    public void g(long j10, int i10, int i11, int i12, @androidx.annotation.p0 androidx.media3.extractor.u0.a aVar) {
        int i13;
        if (this.C) {
            e((androidx.media3.common.w) androidx.media3.common.util.a.k(this.D));
        }
        int i14 = i10 & 1;
        boolean z10 = i14 != 0;
        if (this.A) {
            if (!z10) {
                return;
            } else {
                this.A = false;
            }
        }
        long j11 = this.I + j10;
        if (!this.G) {
            i13 = i10;
        } else {
            if (j11 < this.f65450w) {
                return;
            }
            if (i14 == 0) {
                if (!this.H) {
                    androidx.media3.common.util.z.n(L, "Overriding unexpected non-sync sample for format: " + this.E);
                    this.H = true;
                }
                i13 = i10 | 1;
            } else {
                i13 = i10;
            }
        }
        if (this.J) {
            if (!z10 || !i(j11)) {
                return;
            } else {
                this.J = false;
            }
        }
        j(j11, i13, (this.f65431d.e() - ((long) i11)) - ((long) i12), i11, aVar);
    }

    public final void g0(@androidx.annotation.p0 d dVar) {
        this.f65436i = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0012  */
    public final synchronized void h0(int i10) {
        boolean z10;
        if (i10 >= 0) {
            try {
                if (this.f65449v + i10 <= this.f65446s) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        } else {
            z10 = false;
        }
        androidx.media3.common.util.a.a(z10);
        this.f65449v += i10;
    }

    public final void i0(long j10) {
        this.F = j10;
    }

    public final void j0() {
        this.J = true;
    }

    public synchronized long q() {
        try {
            int i10 = this.f65449v;
            if (i10 == 0) {
                return -1L;
            }
            return r(i10);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void s(long j10, boolean z10, boolean z11) {
        this.f65431d.b(o(j10, z10, z11));
    }

    public final void t() {
        this.f65431d.b(p());
    }

    public final void u() {
        this.f65431d.b(q());
    }

    public final void v(long j10) {
        if (this.f65446s == 0) {
            return;
        }
        androidx.media3.common.util.a.a(j10 > E());
        x(this.f65447t + k(j10));
    }

    public final void x(int i10) {
        this.f65431d.c(w(i10));
    }
}
