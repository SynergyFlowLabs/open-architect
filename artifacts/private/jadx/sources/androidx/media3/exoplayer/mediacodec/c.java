package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PersistableBundle;
import android.view.Surface;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.z0;
import com.google.common.base.s0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
@w0(23)
final class c implements q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f64044g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f64045h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f64046i = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f64047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f64048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r f64049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private final o f64050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f64051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f64052f;

    public static final class b implements q.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final s0<HandlerThread> f64053b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final s0<HandlerThread> f64054c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f64055d;

        public b(final int i10) {
            this(new s0() { // from class: androidx.media3.exoplayer.mediacodec.d
                @Override // com.google.common.base.s0
                public final Object get() {
                    return c.b.d(i10);
                }
            }, new s0() { // from class: androidx.media3.exoplayer.mediacodec.e
                @Override // com.google.common.base.s0
                public final Object get() {
                    return c.b.c(i10);
                }
            });
        }

        public static /* synthetic */ HandlerThread c(int i10) {
            return new HandlerThread(c.v(i10));
        }

        public static /* synthetic */ HandlerThread d(int i10) {
            return new HandlerThread(c.u(i10));
        }

        @androidx.annotation.k(api = 34)
        private static boolean g(androidx.media3.common.w wVar) {
            int i10 = k1.f61540a;
            int i11 = 1 << 0;
            if (i10 < 34) {
                return false;
            }
            return i10 >= 35 || androidx.media3.common.s0.v(wVar.f61761o);
        }

        @Override // androidx.media3.exoplayer.mediacodec.q.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public c a(q.a aVar) throws Exception {
            Exception exc;
            MediaCodec mediaCodecCreateByCodecName;
            r fVar;
            int i10;
            String str = aVar.f64127a.f64139a;
            c cVar = null;
            try {
                z0.a("createCodec:" + str);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    if (this.f64055d && g(aVar.f64129c)) {
                        fVar = new i0(mediaCodecCreateByCodecName);
                        i10 = 4;
                    } else {
                        fVar = new f(mediaCodecCreateByCodecName, this.f64054c.get());
                        i10 = 0;
                    }
                    c cVar2 = new c(mediaCodecCreateByCodecName, this.f64053b.get(), fVar, aVar.f64132f);
                    try {
                        z0.b();
                        Surface surface = aVar.f64130d;
                        if (surface == null && aVar.f64127a.f64149k && k1.f61540a >= 35) {
                            i10 |= 8;
                        }
                        cVar2.x(aVar.f64128b, surface, aVar.f64131e, i10);
                        return cVar2;
                    } catch (Exception e10) {
                        exc = e10;
                        cVar = cVar2;
                        if (cVar != null) {
                            cVar.release();
                            throw exc;
                        }
                        if (mediaCodecCreateByCodecName == null) {
                            throw exc;
                        }
                        mediaCodecCreateByCodecName.release();
                        throw exc;
                    }
                } catch (Exception e11) {
                    exc = e11;
                }
            } catch (Exception e12) {
                exc = e12;
                mediaCodecCreateByCodecName = null;
            }
        }

        public void f(boolean z10) {
            this.f64055d = z10;
        }

        public b(s0<HandlerThread> s0Var, s0<HandlerThread> s0Var2) {
            this.f64053b = s0Var;
            this.f64054c = s0Var2;
            this.f64055d = false;
        }
    }

    public static /* synthetic */ void q(c cVar, q.d dVar, MediaCodec mediaCodec, long j10, long j11) {
        cVar.getClass();
        dVar.a(cVar, j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String u(int i10) {
        return w(i10, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String v(int i10) {
        return w(i10, "ExoPlayer:MediaCodecQueueingThread:");
    }

    private static String w(int i10, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            sb2.append("Audio");
        } else if (i10 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            sb2.append(")");
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(@p0 MediaFormat mediaFormat, @p0 Surface surface, @p0 MediaCrypto mediaCrypto, int i10) {
        o oVar;
        this.f64048b.h(this.f64047a);
        z0.a("configureCodec");
        this.f64047a.configure(mediaFormat, surface, mediaCrypto, i10);
        z0.b();
        this.f64049c.start();
        z0.a("startCodec");
        this.f64047a.start();
        z0.b();
        if (k1.f61540a >= 35 && (oVar = this.f64050d) != null) {
            oVar.b(this.f64047a);
        }
        this.f64052f = 1;
    }

    @Override // androidx.media3.exoplayer.mediacodec.q
    public void a(Bundle bundle) {
        this.f64049c.a(bundle);
    }

    @Override // androidx.media3.exoplayer.mediacodec.q
    public void b(int i10) {
        this.f64047a.setVideoScalingMode(i10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.q
    public void c(int i10, int i11, int i12, long j10, int i13) {
        this.f64049c.c(i10, i11, i12, j10, i13);
    }

    @Override // androidx.media3.exoplayer.mediacodec.q
    public void d(int i10, int i11, androidx.media3.decoder.d dVar, long j10, int i12) {
        this.f64049c.d(i10, i11, dVar, j10, i12);
    }

    @Override // androidx.media3.exoplayer.mediacodec.q
    public boolean e() {
        return false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.q
    public void f(int i10, long j10) {
        this.f64047a.releaseOutputBuffer(i10, j10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.q
    public void flush() {
        this.f64049c.flush();
        this.f64047a.flush();
        this.f64048b.e();
        this.f64047a.start();
    }

    @Override // androidx.media3.exoplayer.mediacodec.q
    public int g(MediaCodec.BufferInfo bufferInfo) {
        this.f64049c.b();
        return this.f64048b.d(bufferInfo);
    }

    @Override // androidx.media3.exoplayer.mediacodec.q
    @w0(26)
    public PersistableBundle getMetrics() {
        return this.f64047a.getMetrics();
    }

    @Override // androidx.media3.exoplayer.mediacodec.q
    public void h(int i10, boolean z10) {
        this.f64047a.releaseOutputBuffer(i10, z10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.q
    public boolean i(q.c cVar) {
        this.f64048b.p(cVar);
        return true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.q
    public void j(final q.d dVar, Handler handler) {
        this.f64047a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: androidx.media3.exoplayer.mediacodec.b
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                c.q(this.f64041a, dVar, mediaCodec, j10, j11);
            }
        }, handler);
    }

    @Override // androidx.media3.exoplayer.mediacodec.q
    public MediaFormat k() {
        return this.f64048b.g();
    }

    @Override // androidx.media3.exoplayer.mediacodec.q
    @w0(35)
    public void l() {
        this.f64047a.detachOutputSurface();
    }

    @Override // androidx.media3.exoplayer.mediacodec.q
    @p0
    public ByteBuffer m(int i10) {
        return this.f64047a.getInputBuffer(i10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.q
    public void n(Surface surface) {
        this.f64047a.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.q
    public int o() {
        this.f64049c.b();
        return this.f64048b.c();
    }

    @Override // androidx.media3.exoplayer.mediacodec.q
    @p0
    public ByteBuffer p(int i10) {
        return this.f64047a.getOutputBuffer(i10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.q
    public void release() {
        o oVar;
        o oVar2;
        o oVar3;
        o oVar4;
        try {
            if (this.f64052f == 1) {
                this.f64049c.shutdown();
                this.f64048b.q();
            }
            this.f64052f = 2;
            if (this.f64051e) {
                return;
            }
            try {
                int i10 = k1.f61540a;
                if (i10 >= 30 && i10 < 33) {
                    this.f64047a.stop();
                }
                if (i10 >= 35 && (oVar4 = this.f64050d) != null) {
                    oVar4.d(this.f64047a);
                }
                this.f64047a.release();
                this.f64051e = true;
            } catch (Throwable th2) {
                if (k1.f61540a >= 35 && (oVar3 = this.f64050d) != null) {
                    oVar3.d(this.f64047a);
                }
                this.f64047a.release();
                this.f64051e = true;
                throw th2;
            }
        } catch (Throwable th3) {
            if (!this.f64051e) {
                try {
                    int i11 = k1.f61540a;
                    if (i11 >= 30 && i11 < 33) {
                        this.f64047a.stop();
                    }
                    if (i11 >= 35 && (oVar2 = this.f64050d) != null) {
                        oVar2.d(this.f64047a);
                    }
                    this.f64047a.release();
                    this.f64051e = true;
                } catch (Throwable th4) {
                    if (k1.f61540a >= 35 && (oVar = this.f64050d) != null) {
                        oVar.d(this.f64047a);
                    }
                    this.f64047a.release();
                    this.f64051e = true;
                    throw th4;
                }
            }
            throw th3;
        }
    }

    @l1
    void y(MediaCodec.CodecException codecException) {
        this.f64048b.onError(this.f64047a, codecException);
    }

    @l1
    void z(MediaFormat mediaFormat) {
        this.f64048b.onOutputFormatChanged(this.f64047a, mediaFormat);
    }

    private c(MediaCodec mediaCodec, HandlerThread handlerThread, r rVar, @p0 o oVar) {
        this.f64047a = mediaCodec;
        this.f64048b = new h(handlerThread);
        this.f64049c = rVar;
        this.f64050d = oVar;
        this.f64052f = 0;
    }
}
