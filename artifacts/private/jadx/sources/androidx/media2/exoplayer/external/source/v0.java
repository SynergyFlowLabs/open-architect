package androidx.media2.exoplayer.external.source;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public interface v0 {
    void a() throws IOException;

    boolean isReady();

    int l(long positionUs);

    int q(androidx.media2.exoplayer.external.d0 formatHolder, androidx.media2.exoplayer.external.decoder.e buffer, boolean formatRequired);
}
