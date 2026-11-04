package androidx.media2.exoplayer.external.util;

import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class g0 implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f57562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f57563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f57564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f57565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private androidx.media2.exoplayer.external.m0 f57566e = androidx.media2.exoplayer.external.m0.f55312e;

    public g0(c clock) {
        this.f57562a = clock;
    }

    public void a(long positionUs) {
        this.f57564c = positionUs;
        if (this.f57563b) {
            this.f57565d = this.f57562a.b();
        }
    }

    public void b() {
        if (this.f57563b) {
            return;
        }
        this.f57565d = this.f57562a.b();
        this.f57563b = true;
    }

    @Override // androidx.media2.exoplayer.external.util.r
    public androidx.media2.exoplayer.external.m0 c() {
        return this.f57566e;
    }

    public void d() {
        if (this.f57563b) {
            a(k());
            int i10 = 2 | 0;
            this.f57563b = false;
        }
    }

    @Override // androidx.media2.exoplayer.external.util.r
    public long k() {
        long j10 = this.f57564c;
        if (!this.f57563b) {
            return j10;
        }
        long jB = this.f57562a.b() - this.f57565d;
        androidx.media2.exoplayer.external.m0 m0Var = this.f57566e;
        return j10 + (m0Var.f55313a == 1.0f ? androidx.media2.exoplayer.external.c.b(jB) : m0Var.a(jB));
    }

    @Override // androidx.media2.exoplayer.external.util.r
    public void w(androidx.media2.exoplayer.external.m0 playbackParameters) {
        if (this.f57563b) {
            a(k());
        }
        this.f57566e = playbackParameters;
    }
}
