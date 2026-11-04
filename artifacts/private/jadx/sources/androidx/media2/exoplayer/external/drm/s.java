package androidx.media2.exoplayer.external.drm;

import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.drm.t;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class s<T extends t> implements p<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p.a f53897f;

    public s(p.a error) {
        this.f53897f = (p.a) androidx.media2.exoplayer.external.util.a.g(error);
    }

    @Override // androidx.media2.exoplayer.external.drm.p
    @p0
    public p.a T() {
        return this.f53897f;
    }

    @Override // androidx.media2.exoplayer.external.drm.p
    @p0
    public Map<String, String> U() {
        return null;
    }

    @Override // androidx.media2.exoplayer.external.drm.p
    @p0
    public byte[] V() {
        return null;
    }

    @Override // androidx.media2.exoplayer.external.drm.p
    @p0
    public T W() {
        return null;
    }

    @Override // androidx.media2.exoplayer.external.drm.p
    public void X() {
    }

    @Override // androidx.media2.exoplayer.external.drm.p
    public void Y() {
    }

    @Override // androidx.media2.exoplayer.external.drm.p
    public int getState() {
        return 1;
    }
}
