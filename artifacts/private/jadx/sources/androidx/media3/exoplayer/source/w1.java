package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.z3;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class w1 extends z3 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Object f65505r = new Object();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final androidx.media3.common.k0 f65506s = new androidx.media3.common.k0.c().E("SinglePeriodTimeline").M(Uri.EMPTY).a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f65507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f65508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f65509g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f65510h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f65511i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f65512j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f65513k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f65514l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f65515m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f65516n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.p0
    private final Object f65517o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.p0
    private final androidx.media3.common.k0 f65518p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.p0
    private final androidx.media3.common.k0.g f65519q;

    @Deprecated
    public w1(long j10, boolean z10, boolean z11, boolean z12, @androidx.annotation.p0 Object obj, @androidx.annotation.p0 Object obj2) {
        this(j10, j10, 0L, 0L, z10, z11, z12, obj, obj2);
    }

    @Override // androidx.media3.common.z3
    public int f(Object obj) {
        return f65505r.equals(obj) ? 0 : -1;
    }

    @Override // androidx.media3.common.z3
    public z3.b k(int i10, z3.b bVar, boolean z10) {
        androidx.media3.common.util.a.c(i10, 0, 1);
        return bVar.v(null, z10 ? f65505r : null, 0, this.f65510h, -this.f65512j);
    }

    @Override // androidx.media3.common.z3
    public int m() {
        return 1;
    }

    @Override // androidx.media3.common.z3
    public Object s(int i10) {
        androidx.media3.common.util.a.c(i10, 0, 1);
        return f65505r;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0032 A[PHI: r1
      0x0032: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v4 long) binds: [B:3:0x000f, B:5:0x0013, B:7:0x001b, B:12:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.media3.common.z3
    public z3.d u(int i10, z3.d dVar, long j10) {
        long j11;
        androidx.media3.common.util.a.c(i10, 0, 1);
        long j12 = this.f65513k;
        boolean z10 = this.f65515m;
        if (!z10 || this.f65516n || j10 == 0) {
            j11 = j12;
        } else {
            long j13 = this.f65511i;
            if (j13 != -9223372036854775807L) {
                j12 += j10;
                if (j12 <= j13) {
                    j11 = j12;
                }
            }
            j11 = -9223372036854775807L;
        }
        return dVar.j(z3.d.f61978q, this.f65518p, this.f65517o, this.f65507e, this.f65508f, this.f65509g, this.f65514l, z10, this.f65519q, j11, this.f65511i, 0, 0, this.f65512j);
    }

    @Override // androidx.media3.common.z3
    public int v() {
        return 1;
    }

    public w1(long j10, boolean z10, boolean z11, boolean z12, @androidx.annotation.p0 Object obj, androidx.media3.common.k0 k0Var) {
        this(j10, j10, 0L, 0L, z10, z11, z12, obj, k0Var);
    }

    @Deprecated
    public w1(long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, @androidx.annotation.p0 Object obj, @androidx.annotation.p0 Object obj2) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j10, j11, j12, j13, z10, z11, z12, obj, obj2);
    }

    public w1(long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, @androidx.annotation.p0 Object obj, androidx.media3.common.k0 k0Var) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j10, j11, j12, j13, z10, z11, false, obj, k0Var, z12 ? k0Var.f60824d : null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    public w1(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, @androidx.annotation.p0 Object obj, @androidx.annotation.p0 Object obj2) {
        androidx.media3.common.k0 k0Var = f65506s;
        this(j10, j11, j12, j13, j14, j15, j16, z10, z11, false, obj, k0Var.a().L(obj2).a(), z12 ? k0Var.f60824d : null);
    }

    @Deprecated
    public w1(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, @androidx.annotation.p0 Object obj, androidx.media3.common.k0 k0Var, @androidx.annotation.p0 androidx.media3.common.k0.g gVar) {
        this(j10, j11, j12, j13, j14, j15, j16, z10, z11, false, obj, k0Var, gVar);
    }

    public w1(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, @androidx.annotation.p0 Object obj, androidx.media3.common.k0 k0Var, @androidx.annotation.p0 androidx.media3.common.k0.g gVar) {
        this.f65507e = j10;
        this.f65508f = j11;
        this.f65509g = j12;
        this.f65510h = j13;
        this.f65511i = j14;
        this.f65512j = j15;
        this.f65513k = j16;
        this.f65514l = z10;
        this.f65515m = z11;
        this.f65516n = z12;
        this.f65517o = obj;
        this.f65518p = (androidx.media3.common.k0) androidx.media3.common.util.a.g(k0Var);
        this.f65519q = gVar;
    }
}
