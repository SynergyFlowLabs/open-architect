package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.os.Bundle;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes3.dex */
@w0(23)
class i0 implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f64112a;

    public i0(MediaCodec mediaCodec) {
        this.f64112a = mediaCodec;
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public void a(Bundle bundle) {
        this.f64112a.setParameters(bundle);
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public void b() {
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public void c(int i10, int i11, int i12, long j10, int i13) {
        this.f64112a.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public void d(int i10, int i11, androidx.media3.decoder.d dVar, long j10, int i12) {
        this.f64112a.queueSecureInputBuffer(i10, i11, dVar.a(), j10, i12);
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public void e() {
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public void flush() {
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public void shutdown() {
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public void start() {
    }
}
