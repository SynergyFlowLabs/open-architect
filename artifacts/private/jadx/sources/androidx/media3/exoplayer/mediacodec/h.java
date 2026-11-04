package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.media3.common.util.k1;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes3.dex */
@w0(23)
final class h extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HandlerThread f64091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f64092c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
    @p0
    private MediaFormat f64097h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
    @p0
    private MediaFormat f64098i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
    @p0
    private MediaCodec.CodecException f64099j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
    @p0
    private MediaCodec.CryptoException f64100k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
    private long f64101l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
    private boolean f64102m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
    @p0
    private IllegalStateException f64103n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
    @p0
    private q.c f64104o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f64090a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
    private final androidx.collection.g f64093d = new androidx.collection.g();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
    private final androidx.collection.g f64094e = new androidx.collection.g();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
    private final ArrayDeque<MediaCodec.BufferInfo> f64095f = new ArrayDeque<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
    private final ArrayDeque<MediaFormat> f64096g = new ArrayDeque<>();

    h(HandlerThread handlerThread) {
        this.f64091b = handlerThread;
    }

    @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
    private void b(MediaFormat mediaFormat) {
        this.f64094e.b(-2);
        this.f64096g.add(mediaFormat);
    }

    @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
    private void f() {
        if (!this.f64096g.isEmpty()) {
            this.f64098i = this.f64096g.getLast();
        }
        this.f64093d.c();
        this.f64094e.c();
        this.f64095f.clear();
        this.f64096g.clear();
    }

    @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
    private boolean i() {
        return this.f64101l > 0 || this.f64102m;
    }

    @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
    private void j() {
        k();
        m();
        l();
    }

    @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
    private void k() {
        IllegalStateException illegalStateException = this.f64103n;
        if (illegalStateException == null) {
            return;
        }
        this.f64103n = null;
        throw illegalStateException;
    }

    @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
    private void l() {
        MediaCodec.CryptoException cryptoException = this.f64100k;
        if (cryptoException == null) {
            return;
        }
        this.f64100k = null;
        throw cryptoException;
    }

    @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
    private void m() {
        MediaCodec.CodecException codecException = this.f64099j;
        if (codecException == null) {
            return;
        }
        this.f64099j = null;
        throw codecException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        synchronized (this.f64090a) {
            try {
                if (this.f64102m) {
                    return;
                }
                long j10 = this.f64101l - 1;
                this.f64101l = j10;
                if (j10 > 0) {
                    return;
                }
                if (j10 < 0) {
                    o(new IllegalStateException());
                } else {
                    f();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void o(IllegalStateException illegalStateException) {
        synchronized (this.f64090a) {
            try {
                this.f64103n = illegalStateException;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int c() {
        synchronized (this.f64090a) {
            try {
                j();
                int i10 = -1;
                if (i()) {
                    return -1;
                }
                if (!this.f64093d.h()) {
                    i10 = this.f64093d.i();
                }
                return i10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int d(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f64090a) {
            try {
                j();
                if (i()) {
                    return -1;
                }
                if (this.f64094e.h()) {
                    return -1;
                }
                int i10 = this.f64094e.i();
                if (i10 >= 0) {
                    androidx.media3.common.util.a.k(this.f64097h);
                    MediaCodec.BufferInfo bufferInfoRemove = this.f64095f.remove();
                    bufferInfo.set(bufferInfoRemove.offset, bufferInfoRemove.size, bufferInfoRemove.presentationTimeUs, bufferInfoRemove.flags);
                } else if (i10 == -2) {
                    this.f64097h = this.f64096g.remove();
                }
                return i10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e() {
        synchronized (this.f64090a) {
            this.f64101l++;
            ((Handler) k1.o(this.f64092c)).post(new Runnable() { // from class: androidx.media3.exoplayer.mediacodec.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f64087a.n();
                }
            });
        }
    }

    public MediaFormat g() {
        MediaFormat mediaFormat;
        synchronized (this.f64090a) {
            try {
                mediaFormat = this.f64097h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mediaFormat;
    }

    public void h(MediaCodec mediaCodec) {
        androidx.media3.common.util.a.i(this.f64092c == null);
        this.f64091b.start();
        Handler handler = new Handler(this.f64091b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f64092c = handler;
    }

    @Override // android.media.MediaCodec.Callback
    public void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f64090a) {
            try {
                this.f64100k = cryptoException;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f64090a) {
            try {
                this.f64099j = codecException;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f64090a) {
            try {
                this.f64093d.b(i10);
                q.c cVar = this.f64104o;
                if (cVar != null) {
                    cVar.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f64090a) {
            try {
                MediaFormat mediaFormat = this.f64098i;
                if (mediaFormat != null) {
                    b(mediaFormat);
                    this.f64098i = null;
                }
                this.f64094e.b(i10);
                this.f64095f.add(bufferInfo);
                q.c cVar = this.f64104o;
                if (cVar != null) {
                    cVar.b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f64090a) {
            try {
                b(mediaFormat);
                this.f64098i = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void p(q.c cVar) {
        synchronized (this.f64090a) {
            this.f64104o = cVar;
        }
    }

    public void q() {
        synchronized (this.f64090a) {
            this.f64102m = true;
            this.f64091b.quit();
            f();
        }
    }
}
