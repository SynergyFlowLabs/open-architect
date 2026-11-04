package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class h5 implements u3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media3.common.util.j f63836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f63837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f63838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f63839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private androidx.media3.common.y0 f63840e = androidx.media3.common.y0.f61871d;

    public h5(androidx.media3.common.util.j jVar) {
        this.f63836a = jVar;
    }

    public void a(long j10) {
        this.f63838c = j10;
        if (this.f63837b) {
            this.f63839d = this.f63836a.b();
        }
    }

    public void b() {
        if (this.f63837b) {
            return;
        }
        this.f63839d = this.f63836a.b();
        this.f63837b = true;
    }

    @Override // androidx.media3.exoplayer.u3
    public androidx.media3.common.y0 c() {
        return this.f63840e;
    }

    public void d() {
        if (this.f63837b) {
            a(k());
            this.f63837b = false;
        }
    }

    @Override // androidx.media3.exoplayer.u3
    public void h(androidx.media3.common.y0 y0Var) {
        if (this.f63837b) {
            a(k());
        }
        this.f63840e = y0Var;
    }

    @Override // androidx.media3.exoplayer.u3
    public long k() {
        long j10 = this.f63838c;
        if (!this.f63837b) {
            return j10;
        }
        long jB = this.f63836a.b() - this.f63839d;
        androidx.media3.common.y0 y0Var = this.f63840e;
        return j10 + (y0Var.f61874a == 1.0f ? androidx.media3.common.util.k1.D1(jB) : y0Var.b(jB));
    }
}
