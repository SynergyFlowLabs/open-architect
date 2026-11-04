package androidx.media2.exoplayer.external;

import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class e0 extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0 f53929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f53930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f53931c;

    public e0(z0 timeline, int windowIndex, long positionMs) {
        this.f53929a = timeline;
        this.f53930b = windowIndex;
        this.f53931c = positionMs;
    }
}
