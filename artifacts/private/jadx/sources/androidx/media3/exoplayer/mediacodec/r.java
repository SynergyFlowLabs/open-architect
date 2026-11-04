package androidx.media3.exoplayer.mediacodec;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
interface r {
    void a(Bundle bundle);

    void b();

    void c(int i10, int i11, int i12, long j10, int i13);

    void d(int i10, int i11, androidx.media3.decoder.d dVar, long j10, int i12);

    void e() throws InterruptedException;

    void flush();

    void shutdown();

    void start();
}
