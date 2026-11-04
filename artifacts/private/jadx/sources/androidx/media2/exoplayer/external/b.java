package androidx.media2.exoplayer.external;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.drm.DrmInitData;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public abstract class b implements t0, u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f53585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private v0 f53586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f53587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f53588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private androidx.media2.exoplayer.external.source.v0 f53589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Format[] f53590f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f53591g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f53592h = Long.MIN_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f53593i;

    public b(int trackType) {
        this.f53585a = trackType;
    }

    protected static boolean J(@androidx.annotation.p0 androidx.media2.exoplayer.external.drm.r<?> drmSessionManager, @androidx.annotation.p0 DrmInitData drmInitData) {
        if (drmInitData == null) {
            return true;
        }
        if (drmSessionManager == null) {
            return false;
        }
        return drmSessionManager.c(drmInitData);
    }

    @Override // androidx.media2.exoplayer.external.t0
    public final void A(Format[] formats, androidx.media2.exoplayer.external.source.v0 stream, long offsetUs) throws i {
        androidx.media2.exoplayer.external.util.a.i(!this.f53593i);
        this.f53589e = stream;
        this.f53592h = offsetUs;
        this.f53590f = formats;
        this.f53591g = offsetUs;
        G(formats, offsetUs);
    }

    protected void B(boolean joining) throws i {
    }

    protected void C(long positionUs, boolean joining) throws i {
    }

    protected void D() {
    }

    protected void E() throws i {
    }

    protected void F() throws i {
    }

    protected void G(Format[] formats, long offsetUs) throws i {
    }

    protected final int H(d0 formatHolder, androidx.media2.exoplayer.external.decoder.e buffer, boolean formatRequired) {
        int iQ = this.f53589e.q(formatHolder, buffer, formatRequired);
        if (iQ != -4) {
            if (iQ == -5) {
                Format format = formatHolder.f53762c;
                long j10 = format.f53109m;
                if (j10 != Long.MAX_VALUE) {
                    formatHolder.f53762c = format.m(j10 + this.f53591g);
                }
            }
            return iQ;
        }
        if (buffer.t()) {
            this.f53592h = Long.MIN_VALUE;
            return this.f53593i ? -4 : -3;
        }
        long j11 = buffer.f53790d + this.f53591g;
        buffer.f53790d = j11;
        this.f53592h = Math.max(this.f53592h, j11);
        return iQ;
    }

    protected int I(long positionUs) {
        return this.f53589e.l(positionUs - this.f53591g);
    }

    @Override // androidx.media2.exoplayer.external.t0
    public final void d() {
        int i10 = 0 << 1;
        androidx.media2.exoplayer.external.util.a.i(this.f53588d == 1);
        this.f53588d = 0;
        this.f53589e = null;
        this.f53590f = null;
        this.f53593i = false;
        o();
    }

    @Override // androidx.media2.exoplayer.external.t0
    @androidx.annotation.p0
    public final androidx.media2.exoplayer.external.source.v0 e() {
        return this.f53589e;
    }

    @Override // androidx.media2.exoplayer.external.t0, androidx.media2.exoplayer.external.u0
    public final int f() {
        return this.f53585a;
    }

    @Override // androidx.media2.exoplayer.external.t0
    public final int getState() {
        return this.f53588d;
    }

    protected final v0 h() {
        return this.f53586b;
    }

    @Override // androidx.media2.exoplayer.external.q0.b
    public void i(int what, @androidx.annotation.p0 Object object) throws i {
    }

    protected final int j() {
        return this.f53587c;
    }

    @Override // androidx.media2.exoplayer.external.u0
    public int l() throws i {
        return 0;
    }

    protected final Format[] m() {
        return this.f53590f;
    }

    protected final boolean n() {
        return q() ? this.f53593i : this.f53589e.isReady();
    }

    protected void o() {
    }

    @Override // androidx.media2.exoplayer.external.t0
    public final u0 p() {
        return this;
    }

    @Override // androidx.media2.exoplayer.external.t0
    public final boolean q() {
        return this.f53592h == Long.MIN_VALUE;
    }

    @Override // androidx.media2.exoplayer.external.t0
    public final boolean r() {
        return this.f53593i;
    }

    @Override // androidx.media2.exoplayer.external.t0
    public final void reset() {
        androidx.media2.exoplayer.external.util.a.i(this.f53588d == 0);
        D();
    }

    @Override // androidx.media2.exoplayer.external.t0
    public final long s() {
        return this.f53592h;
    }

    @Override // androidx.media2.exoplayer.external.t0
    public final void setIndex(int index) {
        this.f53587c = index;
    }

    @Override // androidx.media2.exoplayer.external.t0
    public final void start() throws i {
        androidx.media2.exoplayer.external.util.a.i(this.f53588d == 1);
        this.f53588d = 2;
        E();
    }

    @Override // androidx.media2.exoplayer.external.t0
    public final void stop() throws i {
        androidx.media2.exoplayer.external.util.a.i(this.f53588d == 2);
        this.f53588d = 1;
        F();
    }

    @Override // androidx.media2.exoplayer.external.t0
    public final void t(long positionUs) throws i {
        this.f53593i = false;
        this.f53592h = positionUs;
        C(positionUs, false);
    }

    @Override // androidx.media2.exoplayer.external.t0
    @androidx.annotation.p0
    public androidx.media2.exoplayer.external.util.r u() {
        return null;
    }

    @Override // androidx.media2.exoplayer.external.t0
    public final void v() {
        this.f53593i = true;
    }

    @Override // androidx.media2.exoplayer.external.t0
    public final void x() throws IOException {
        this.f53589e.a();
    }

    @Override // androidx.media2.exoplayer.external.t0
    public final void y(v0 configuration, Format[] formats, androidx.media2.exoplayer.external.source.v0 stream, long positionUs, boolean joining, long offsetUs) throws i {
        androidx.media2.exoplayer.external.util.a.i(this.f53588d == 0);
        this.f53586b = configuration;
        this.f53588d = 1;
        B(joining);
        A(formats, stream, offsetUs);
        C(positionUs, joining);
    }

    @Override // androidx.media2.exoplayer.external.t0
    public void z(float f10) throws i {
        s0.a(this, f10);
    }
}
