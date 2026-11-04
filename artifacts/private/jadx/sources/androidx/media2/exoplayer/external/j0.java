package androidx.media2.exoplayer.external;

import androidx.annotation.b1;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public abstract class j0 implements t0, u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private v0 f55290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f55291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f55292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.media2.exoplayer.external.source.v0 f55293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f55294e;

    @Override // androidx.media2.exoplayer.external.t0
    public final void A(Format[] formats, androidx.media2.exoplayer.external.source.v0 stream, long offsetUs) throws i {
        androidx.media2.exoplayer.external.util.a.i(!this.f55294e);
        this.f55293d = stream;
        n(offsetUs);
    }

    protected void B() throws i {
    }

    @Override // androidx.media2.exoplayer.external.t0
    public boolean a() {
        return true;
    }

    @Override // androidx.media2.exoplayer.external.u0
    public int b(Format format) throws i {
        return 0;
    }

    protected final v0 c() {
        return this.f55290a;
    }

    @Override // androidx.media2.exoplayer.external.t0
    public final void d() {
        androidx.media2.exoplayer.external.util.a.i(this.f55292c == 1);
        this.f55292c = 0;
        this.f55293d = null;
        this.f55294e = false;
        j();
    }

    @Override // androidx.media2.exoplayer.external.t0
    @androidx.annotation.p0
    public final androidx.media2.exoplayer.external.source.v0 e() {
        return this.f55293d;
    }

    @Override // androidx.media2.exoplayer.external.t0, androidx.media2.exoplayer.external.u0
    public final int f() {
        return 6;
    }

    @Override // androidx.media2.exoplayer.external.t0
    public final int getState() {
        return this.f55292c;
    }

    protected final int h() {
        return this.f55291b;
    }

    @Override // androidx.media2.exoplayer.external.q0.b
    public void i(int what, @androidx.annotation.p0 Object object) throws i {
    }

    @Override // androidx.media2.exoplayer.external.t0
    public boolean isReady() {
        return true;
    }

    protected void j() {
    }

    protected void k(boolean joining) throws i {
    }

    @Override // androidx.media2.exoplayer.external.u0
    public int l() throws i {
        return 0;
    }

    protected void m(long positionUs, boolean joining) throws i {
    }

    protected void n(long offsetUs) throws i {
    }

    protected void o() {
    }

    @Override // androidx.media2.exoplayer.external.t0
    public final u0 p() {
        return this;
    }

    @Override // androidx.media2.exoplayer.external.t0
    public final boolean q() {
        return true;
    }

    @Override // androidx.media2.exoplayer.external.t0
    public final boolean r() {
        return this.f55294e;
    }

    @Override // androidx.media2.exoplayer.external.t0
    public final void reset() {
        androidx.media2.exoplayer.external.util.a.i(this.f55292c == 0);
        o();
    }

    @Override // androidx.media2.exoplayer.external.t0
    public long s() {
        return Long.MIN_VALUE;
    }

    @Override // androidx.media2.exoplayer.external.t0
    public final void setIndex(int index) {
        this.f55291b = index;
    }

    @Override // androidx.media2.exoplayer.external.t0
    public final void start() throws i {
        androidx.media2.exoplayer.external.util.a.i(this.f55292c == 1);
        this.f55292c = 2;
        w();
    }

    @Override // androidx.media2.exoplayer.external.t0
    public final void stop() throws i {
        androidx.media2.exoplayer.external.util.a.i(this.f55292c == 2);
        this.f55292c = 1;
        B();
    }

    @Override // androidx.media2.exoplayer.external.t0
    public final void t(long positionUs) throws i {
        this.f55294e = false;
        m(positionUs, false);
    }

    @Override // androidx.media2.exoplayer.external.t0
    @androidx.annotation.p0
    public androidx.media2.exoplayer.external.util.r u() {
        return null;
    }

    @Override // androidx.media2.exoplayer.external.t0
    public final void v() {
        this.f55294e = true;
    }

    protected void w() throws i {
    }

    @Override // androidx.media2.exoplayer.external.t0
    public final void x() throws IOException {
    }

    @Override // androidx.media2.exoplayer.external.t0
    public final void y(v0 configuration, Format[] formats, androidx.media2.exoplayer.external.source.v0 stream, long positionUs, boolean joining, long offsetUs) throws i {
        androidx.media2.exoplayer.external.util.a.i(this.f55292c == 0);
        this.f55290a = configuration;
        this.f55292c = 1;
        k(joining);
        A(formats, stream, offsetUs);
        m(positionUs, joining);
    }

    @Override // androidx.media2.exoplayer.external.t0
    public void z(float f10) throws i {
        s0.a(this, f10);
    }
}
