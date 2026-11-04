package androidx.media2.exoplayer.external.source;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public abstract class r extends androidx.media2.exoplayer.external.z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final androidx.media2.exoplayer.external.z0 f56325b;

    public r(androidx.media2.exoplayer.external.z0 timeline) {
        this.f56325b = timeline;
    }

    @Override // androidx.media2.exoplayer.external.z0
    public int a(boolean shuffleModeEnabled) {
        return this.f56325b.a(shuffleModeEnabled);
    }

    @Override // androidx.media2.exoplayer.external.z0
    public int b(Object uid) {
        return this.f56325b.b(uid);
    }

    @Override // androidx.media2.exoplayer.external.z0
    public int c(boolean shuffleModeEnabled) {
        return this.f56325b.c(shuffleModeEnabled);
    }

    @Override // androidx.media2.exoplayer.external.z0
    public int e(int windowIndex, int repeatMode, boolean shuffleModeEnabled) {
        return this.f56325b.e(windowIndex, repeatMode, shuffleModeEnabled);
    }

    @Override // androidx.media2.exoplayer.external.z0
    public androidx.media2.exoplayer.external.z0.b g(int periodIndex, androidx.media2.exoplayer.external.z0.b period, boolean setIds) {
        return this.f56325b.g(periodIndex, period, setIds);
    }

    @Override // androidx.media2.exoplayer.external.z0
    public int i() {
        return this.f56325b.i();
    }

    @Override // androidx.media2.exoplayer.external.z0
    public int l(int windowIndex, int repeatMode, boolean shuffleModeEnabled) {
        return this.f56325b.l(windowIndex, repeatMode, shuffleModeEnabled);
    }

    @Override // androidx.media2.exoplayer.external.z0
    public Object m(int periodIndex) {
        return this.f56325b.m(periodIndex);
    }

    @Override // androidx.media2.exoplayer.external.z0
    public androidx.media2.exoplayer.external.z0.c o(int windowIndex, androidx.media2.exoplayer.external.z0.c window, long defaultPositionProjectionUs) {
        return this.f56325b.o(windowIndex, window, defaultPositionProjectionUs);
    }

    @Override // androidx.media2.exoplayer.external.z0
    public final androidx.media2.exoplayer.external.z0.c q(int windowIndex, androidx.media2.exoplayer.external.z0.c window, boolean setIds, long defaultPositionProjectionUs) {
        return o(windowIndex, window, defaultPositionProjectionUs);
    }

    @Override // androidx.media2.exoplayer.external.z0
    public int r() {
        return this.f56325b.r();
    }
}
