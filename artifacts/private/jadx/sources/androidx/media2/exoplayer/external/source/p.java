package androidx.media2.exoplayer.external.source;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public final class p implements v0 {
    @Override // androidx.media2.exoplayer.external.source.v0
    public void a() throws IOException {
    }

    @Override // androidx.media2.exoplayer.external.source.v0
    public boolean isReady() {
        return true;
    }

    @Override // androidx.media2.exoplayer.external.source.v0
    public int l(long positionUs) {
        return 0;
    }

    @Override // androidx.media2.exoplayer.external.source.v0
    public int q(androidx.media2.exoplayer.external.d0 formatHolder, androidx.media2.exoplayer.external.decoder.e buffer, boolean formatRequired) {
        buffer.w(4);
        return -4;
    }
}
