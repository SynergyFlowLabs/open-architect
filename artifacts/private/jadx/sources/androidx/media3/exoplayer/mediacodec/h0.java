package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.view.Surface;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.z0;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class h0 implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f64105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final o f64106b;

    public static class b implements q.b {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.media3.exoplayer.mediacodec.q.b
        @e.a({"WrongConstant"})
        public q a(q.a aVar) throws Throwable {
            MediaCodec mediaCodec = null;
            Object[] objArr = 0;
            try {
                MediaCodec mediaCodecC = c(aVar);
                try {
                    z0.a("configureCodec");
                    Surface surface = aVar.f64130d;
                    mediaCodecC.configure(aVar.f64128b, surface, aVar.f64131e, (surface == null && aVar.f64127a.f64149k && k1.f61540a >= 35) ? 8 : 0);
                    z0.b();
                    z0.a("startCodec");
                    mediaCodecC.start();
                    z0.b();
                    return new h0(mediaCodecC, aVar.f64132f);
                } catch (IOException | RuntimeException e10) {
                    e = e10;
                    mediaCodec = mediaCodecC;
                    if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (IOException | RuntimeException e11) {
                e = e11;
            }
        }

        protected MediaCodec c(q.a aVar) throws IOException {
            androidx.media3.common.util.a.g(aVar.f64127a);
            String str = aVar.f64127a.f64139a;
            z0.a("createCodec:" + str);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            z0.b();
            return mediaCodecCreateByCodecName;
        }
    }

    public static /* synthetic */ void q(h0 h0Var, q.d dVar, MediaCodec mediaCodec, long j10, long j11) {
        h0Var.getClass();
        dVar.a(h0Var, j10, j11);
    }

    @Override // androidx.media3.exoplayer.mediacodec.q
    public void a(Bundle bundle) {
        this.f64105a.setParameters(bundle);
    }

    @Override // androidx.media3.exoplayer.mediacodec.q
    public void b(int i10) {
        this.f64105a.setVideoScalingMode(i10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.q
    public void c(int i10, int i11, int i12, long j10, int i13) {
        this.f64105a.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    @Override // androidx.media3.exoplayer.mediacodec.q
    public void d(int i10, int i11, androidx.media3.decoder.d dVar, long j10, int i12) {
        this.f64105a.queueSecureInputBuffer(i10, i11, dVar.a(), j10, i12);
    }

    @Override // androidx.media3.exoplayer.mediacodec.q
    public boolean e() {
        return false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.q
    public void f(int i10, long j10) {
        this.f64105a.releaseOutputBuffer(i10, j10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.q
    public void flush() {
        this.f64105a.flush();
    }

    @Override // androidx.media3.exoplayer.mediacodec.q
    public int g(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f64105a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // androidx.media3.exoplayer.mediacodec.q
    @w0(26)
    public PersistableBundle getMetrics() {
        return this.f64105a.getMetrics();
    }

    @Override // androidx.media3.exoplayer.mediacodec.q
    public void h(int i10, boolean z10) {
        this.f64105a.releaseOutputBuffer(i10, z10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.q
    @w0(23)
    public void j(final q.d dVar, Handler handler) {
        this.f64105a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: androidx.media3.exoplayer.mediacodec.g0
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                h0.q(this.f64088a, dVar, mediaCodec, j10, j11);
            }
        }, handler);
    }

    @Override // androidx.media3.exoplayer.mediacodec.q
    public MediaFormat k() {
        return this.f64105a.getOutputFormat();
    }

    @Override // androidx.media3.exoplayer.mediacodec.q
    @w0(35)
    public void l() {
        this.f64105a.detachOutputSurface();
    }

    @Override // androidx.media3.exoplayer.mediacodec.q
    @p0
    public ByteBuffer m(int i10) {
        return this.f64105a.getInputBuffer(i10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.q
    @w0(23)
    public void n(Surface surface) {
        this.f64105a.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.q
    public int o() {
        return this.f64105a.dequeueInputBuffer(0L);
    }

    @Override // androidx.media3.exoplayer.mediacodec.q
    @p0
    public ByteBuffer p(int i10) {
        return this.f64105a.getOutputBuffer(i10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.q
    public void release() {
        o oVar;
        o oVar2;
        try {
            int i10 = k1.f61540a;
            if (i10 >= 30 && i10 < 33) {
                this.f64105a.stop();
            }
            if (i10 >= 35 && (oVar2 = this.f64106b) != null) {
                oVar2.d(this.f64105a);
            }
        } finally {
            if (k1.f61540a >= 35 && (oVar = this.f64106b) != null) {
                oVar.d(this.f64105a);
            }
            this.f64105a.release();
        }
    }

    private h0(MediaCodec mediaCodec, @p0 o oVar) {
        this.f64105a = mediaCodec;
        this.f64106b = oVar;
        if (k1.f61540a < 35 || oVar == null) {
            return;
        }
        oVar.b(mediaCodec);
    }
}
