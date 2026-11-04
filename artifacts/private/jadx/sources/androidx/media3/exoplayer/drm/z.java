package androidx.media3.exoplayer.drm;

import androidx.media3.common.util.b1;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class z implements m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final m.a f63760f;

    public z(m.a aVar) {
        this.f63760f = (m.a) androidx.media3.common.util.a.g(aVar);
    }

    @Override // androidx.media3.exoplayer.drm.m
    @androidx.annotation.p0
    public m.a T() {
        return this.f63760f;
    }

    @Override // androidx.media3.exoplayer.drm.m
    @androidx.annotation.p0
    public Map<String, String> U() {
        return null;
    }

    @Override // androidx.media3.exoplayer.drm.m
    @androidx.annotation.p0
    public byte[] V() {
        return null;
    }

    @Override // androidx.media3.exoplayer.drm.m
    public boolean a() {
        return false;
    }

    @Override // androidx.media3.exoplayer.drm.m
    @androidx.annotation.p0
    public androidx.media3.decoder.b c() {
        return null;
    }

    @Override // androidx.media3.exoplayer.drm.m
    public void d(@androidx.annotation.p0 t.a aVar) {
    }

    @Override // androidx.media3.exoplayer.drm.m
    public final UUID e() {
        return androidx.media3.common.j.f60704k2;
    }

    @Override // androidx.media3.exoplayer.drm.m
    public void f(@androidx.annotation.p0 t.a aVar) {
    }

    @Override // androidx.media3.exoplayer.drm.m
    public boolean g(String str) {
        return false;
    }

    @Override // androidx.media3.exoplayer.drm.m
    public int getState() {
        return 1;
    }
}
