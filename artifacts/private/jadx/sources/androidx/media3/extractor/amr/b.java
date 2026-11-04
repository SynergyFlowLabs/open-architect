package androidx.media3.extractor.amr;

import androidx.media3.common.s0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.v0;
import androidx.media3.extractor.h;
import androidx.media3.extractor.j0;
import androidx.media3.extractor.n0;
import androidx.media3.extractor.p0;
import androidx.media3.extractor.r;
import androidx.media3.extractor.s;
import androidx.media3.extractor.t;
import androidx.media3.extractor.u0;
import androidx.media3.extractor.w;
import il.d;
import il.m;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class b implements r {
    private static final int D = 20;
    private static final int E = 16000;
    private static final int F = 8000;
    private static final int G = 20000;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f67027w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f67028x = 2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f67029y = 4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f67031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f67032e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final u0 f67033f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f67034g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f67035h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f67036i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f67037j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f67038k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f67039l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f67040m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f67041n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private t f67042o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private u0 f67043p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private u0 f67044q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private p0 f67045r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f67046s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f67047t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f67048u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final w f67026v = new w() { // from class: androidx.media3.extractor.amr.a
        @Override // androidx.media3.extractor.w
        public final r[] c() {
            return b.d();
        }
    };

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int[] f67030z = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] A = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    private static final byte[] B = k1.Q0("#!AMR\n");
    private static final byte[] C = k1.Q0("#!AMR-WB\n");

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public b() {
        this(0);
    }

    public static /* synthetic */ r[] d() {
        return new r[]{new b()};
    }

    static byte[] e() {
        byte[] bArr = B;
        return Arrays.copyOf(bArr, bArr.length);
    }

    static byte[] i() {
        byte[] bArr = C;
        return Arrays.copyOf(bArr, bArr.length);
    }

    @d({"extractorOutput", "realTrackOutput"})
    private void j() {
        androidx.media3.common.util.a.k(this.f67043p);
        k1.o(this.f67042o);
    }

    static int k(int i10) {
        return f67030z[i10];
    }

    static int l(int i10) {
        return A[i10];
    }

    private static int m(int i10, long j10) {
        return (int) ((((long) i10) * 8000000) / j10);
    }

    private p0 n(long j10, boolean z10) {
        return new h(j10, this.f67038k, m(this.f67039l, 20000L), this.f67039l, z10);
    }

    private int o(int i10) throws v0 {
        if (r(i10)) {
            return this.f67034g ? A[i10] : f67030z[i10];
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Illegal AMR ");
        sb2.append(this.f67034g ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i10);
        throw v0.a(sb2.toString(), null);
    }

    private boolean p(int i10) {
        if (this.f67034g) {
            return false;
        }
        return i10 < 12 || i10 > 14;
    }

    private boolean q(long j10, long j11) {
        return Math.abs(j11 - j10) < 20000;
    }

    private boolean r(int i10) {
        if (i10 < 0 || i10 > 15) {
            return false;
        }
        return s(i10) || p(i10);
    }

    private boolean s(int i10) {
        return this.f67034g && (i10 < 10 || i10 > 13);
    }

    @m({"realTrackOutput"})
    private void t() {
        if (this.f67048u) {
            return;
        }
        this.f67048u = true;
        boolean z10 = this.f67034g;
        String str = "audio/amr-wb";
        String str2 = z10 ? "audio/amr-wb" : s0.f61302d0;
        if (!z10) {
            str = "audio/3gpp";
        }
        this.f67043p.e(new androidx.media3.common.w.b().U(str2).u0(str).k0(z10 ? A[8] : f67030z[7]).R(1).v0(z10 ? 16000 : 8000).N());
    }

    @m({"extractorOutput", "realTrackOutput"})
    private void u(long j10, int i10) {
        int i11;
        if (this.f67045r == null) {
            int i12 = this.f67032e;
            if ((i12 & 4) != 0) {
                this.f67045r = new j0(new long[]{this.f67038k}, new long[]{0}, -9223372036854775807L);
            } else if ((i12 & 1) == 0 || !((i11 = this.f67039l) == -1 || i11 == this.f67036i)) {
                this.f67045r = new p0.b(-9223372036854775807L);
            } else if (this.f67040m >= 20 || i10 == -1) {
                p0 p0VarN = n(j10, (i12 & 2) != 0);
                this.f67045r = p0VarN;
                this.f67043p.c(p0VarN.Q1());
            }
            p0 p0Var = this.f67045r;
            if (p0Var != null) {
                this.f67042o.u(p0Var);
            }
        }
    }

    private static boolean v(s sVar, byte[] bArr) throws IOException {
        sVar.l();
        byte[] bArr2 = new byte[bArr.length];
        sVar.i(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    private int w(s sVar) throws IOException {
        sVar.l();
        sVar.i(this.f67031d, 0, 1);
        byte b10 = this.f67031d[0];
        if ((b10 & 131) <= 0) {
            return o((b10 >> 3) & 15);
        }
        throw v0.a("Invalid padding bits for frame header " + ((int) b10), null);
    }

    private boolean x(s sVar) throws IOException {
        byte[] bArr = B;
        if (v(sVar, bArr)) {
            this.f67034g = false;
            sVar.o(bArr.length);
            return true;
        }
        byte[] bArr2 = C;
        if (!v(sVar, bArr2)) {
            return false;
        }
        this.f67034g = true;
        sVar.o(bArr2.length);
        return true;
    }

    @m({"realTrackOutput"})
    private int y(s sVar) throws IOException {
        if (this.f67037j == 0) {
            try {
                int iW = w(sVar);
                this.f67036i = iW;
                this.f67037j = iW;
                if (this.f67039l == -1) {
                    this.f67038k = sVar.getPosition();
                    this.f67039l = this.f67036i;
                }
                if (this.f67039l == this.f67036i) {
                    this.f67040m++;
                }
                p0 p0Var = this.f67045r;
                if (p0Var instanceof j0) {
                    j0 j0Var = (j0) p0Var;
                    long j10 = this.f67041n + this.f67035h + 20000;
                    long position = sVar.getPosition() + ((long) this.f67036i);
                    if (!j0Var.b(j10, androidx.media3.exoplayer.audio.s0.f63372z)) {
                        j0Var.a(j10, position);
                    }
                    if (this.f67046s && q(j10, this.f67047t)) {
                        this.f67046s = false;
                        this.f67044q = this.f67043p;
                    }
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iF = this.f67044q.f(sVar, this.f67037j, true);
        if (iF == -1) {
            return -1;
        }
        int i10 = this.f67037j - iF;
        this.f67037j = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f67044q.g(this.f67041n + this.f67035h, 1, this.f67036i, 0, null);
        this.f67035h += 20000;
        return 0;
    }

    @Override // androidx.media3.extractor.r
    public void a(long j10, long j11) {
        this.f67035h = 0L;
        this.f67036i = 0;
        this.f67037j = 0;
        this.f67047t = j11;
        p0 p0Var = this.f67045r;
        if (!(p0Var instanceof j0)) {
            if (j10 == 0 || !(p0Var instanceof h)) {
                this.f67041n = 0L;
                return;
            } else {
                this.f67041n = ((h) p0Var).b(j10);
                return;
            }
        }
        long jE = ((j0) p0Var).e(j10);
        this.f67041n = jE;
        if (q(jE, this.f67047t)) {
            return;
        }
        this.f67046s = true;
        this.f67044q = this.f67033f;
    }

    @Override // androidx.media3.extractor.r
    public int f(s sVar, n0 n0Var) throws IOException {
        j();
        if (sVar.getPosition() == 0 && !x(sVar)) {
            throw v0.a("Could not find AMR header.", null);
        }
        t();
        int iY = y(sVar);
        u(sVar.getLength(), iY);
        if (iY == -1) {
            p0 p0Var = this.f67045r;
            if (p0Var instanceof j0) {
                long j10 = this.f67041n + this.f67035h;
                ((j0) p0Var).c(j10);
                this.f67042o.u(this.f67045r);
                this.f67043p.c(j10);
            }
        }
        return iY;
    }

    @Override // androidx.media3.extractor.r
    public boolean g(s sVar) throws IOException {
        return x(sVar);
    }

    @Override // androidx.media3.extractor.r
    public void h(t tVar) {
        this.f67042o = tVar;
        u0 u0VarA = tVar.a(0, 1);
        this.f67043p = u0VarA;
        this.f67044q = u0VarA;
        tVar.l();
    }

    @Override // androidx.media3.extractor.r
    public void release() {
    }

    public b(int i10) {
        this.f67032e = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f67031d = new byte[1];
        this.f67039l = -1;
        androidx.media3.extractor.m mVar = new androidx.media3.extractor.m();
        this.f67033f = mVar;
        this.f67044q = mVar;
    }
}
