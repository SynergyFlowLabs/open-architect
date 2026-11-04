package androidx.media3.exoplayer.drm;

import androidx.media3.common.util.b1;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class n0 implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f63705a;

    public n0(byte[] bArr) {
        this.f63705a = (byte[]) androidx.media3.common.util.a.g(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.o0
    public byte[] a(UUID uuid, a0.b bVar) {
        return this.f63705a;
    }

    @Override // androidx.media3.exoplayer.drm.o0
    public byte[] b(UUID uuid, a0.h hVar) {
        throw new UnsupportedOperationException();
    }
}
