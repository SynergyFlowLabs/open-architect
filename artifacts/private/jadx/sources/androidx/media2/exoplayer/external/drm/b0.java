package androidx.media2.exoplayer.external.drm;

import androidx.annotation.b1;
import java.io.IOException;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class b0 implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f53822a;

    public b0(byte[] keyResponse) {
        this.f53822a = (byte[]) androidx.media2.exoplayer.external.util.a.g(keyResponse);
    }

    @Override // androidx.media2.exoplayer.external.drm.c0
    public byte[] a(UUID uuid, u.e request) throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media2.exoplayer.external.drm.c0
    public byte[] b(UUID uuid, u.a request) throws Exception {
        return this.f53822a;
    }
}
