package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.compose.animation.core.z1;
import androidx.media3.common.util.k1;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
@w0(23)
class f implements r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f64060g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f64061h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f64062i = 3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f64063j = 4;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.b0("MESSAGE_PARAMS_INSTANCE_POOL")
    private static final ArrayDeque<b> f64064k = new ArrayDeque<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Object f64065l = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f64066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HandlerThread f64067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f64068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicReference<RuntimeException> f64069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.media3.common.util.m f64070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f64071f;

    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            f.this.k(message);
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f64073a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f64074b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f64075c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f64076d = new MediaCodec.CryptoInfo();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f64077e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f64078f;

        b() {
        }

        public void a(int i10, int i11, int i12, long j10, int i13) {
            this.f64073a = i10;
            this.f64074b = i11;
            this.f64075c = i12;
            this.f64077e = j10;
            this.f64078f = i13;
        }
    }

    public f(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new androidx.media3.common.util.m());
    }

    private void g() throws InterruptedException {
        this.f64070e.d();
        ((Handler) androidx.media3.common.util.a.g(this.f64068c)).obtainMessage(3).sendToTarget();
        this.f64070e.a();
    }

    private static void h(androidx.media3.decoder.d dVar, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = dVar.f62688f;
        cryptoInfo.numBytesOfClearData = j(dVar.f62686d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = j(dVar.f62687e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) androidx.media3.common.util.a.g(i(dVar.f62684b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) androidx.media3.common.util.a.g(i(dVar.f62683a, cryptoInfo.iv));
        cryptoInfo.mode = dVar.f62685c;
        if (k1.f61540a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(dVar.f62689g, dVar.f62690h));
        }
    }

    @p0
    private static byte[] i(@p0 byte[] bArr, @p0 byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    @p0
    private static int[] j(@p0 int[] iArr, @p0 int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:18:0x006a  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    public void k(Message message) {
        b bVar;
        b bVar2;
        int i10 = message.what;
        if (i10 != 1) {
            int i11 = 2 ^ 2;
            if (i10 != 2) {
                bVar2 = null;
                if (i10 == 3) {
                    this.f64070e.f();
                } else if (i10 != 4) {
                    z1.a(this.f64069d, null, new IllegalStateException(String.valueOf(message.what)));
                } else {
                    n((Bundle) message.obj);
                }
            } else {
                bVar = (b) message.obj;
                m(bVar.f64073a, bVar.f64074b, bVar.f64076d, bVar.f64077e, bVar.f64078f);
            }
            if (bVar2 != null) {
                q(bVar2);
            }
        }
        bVar = (b) message.obj;
        l(bVar.f64073a, bVar.f64074b, bVar.f64075c, bVar.f64077e, bVar.f64078f);
        bVar2 = bVar;
        if (bVar2 != null) {
            q(bVar2);
        }
    }

    private void l(int i10, int i11, int i12, long j10, int i13) {
        try {
            this.f64066a.queueInputBuffer(i10, i11, i12, j10, i13);
        } catch (RuntimeException e10) {
            z1.a(this.f64069d, null, e10);
        }
    }

    private void m(int i10, int i11, MediaCodec.CryptoInfo cryptoInfo, long j10, int i12) {
        try {
            synchronized (f64065l) {
                this.f64066a.queueSecureInputBuffer(i10, i11, cryptoInfo, j10, i12);
            }
        } catch (RuntimeException e10) {
            z1.a(this.f64069d, null, e10);
        }
    }

    private void n(Bundle bundle) {
        try {
            this.f64066a.setParameters(bundle);
        } catch (RuntimeException e10) {
            z1.a(this.f64069d, null, e10);
        }
    }

    private void o() throws InterruptedException {
        ((Handler) androidx.media3.common.util.a.g(this.f64068c)).removeCallbacksAndMessages(null);
        g();
    }

    private static b p() {
        ArrayDeque<b> arrayDeque = f64064k;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new b();
                }
                return arrayDeque.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void q(b bVar) {
        ArrayDeque<b> arrayDeque = f64064k;
        synchronized (arrayDeque) {
            try {
                arrayDeque.add(bVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public void a(Bundle bundle) {
        b();
        ((Handler) k1.o(this.f64068c)).obtainMessage(4, bundle).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public void b() {
        RuntimeException andSet = this.f64069d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public void c(int i10, int i11, int i12, long j10, int i13) {
        b();
        b bVarP = p();
        bVarP.a(i10, i11, i12, j10, i13);
        ((Handler) k1.o(this.f64068c)).obtainMessage(1, bVarP).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public void d(int i10, int i11, androidx.media3.decoder.d dVar, long j10, int i12) {
        b();
        b bVarP = p();
        bVarP.a(i10, i11, 0, j10, i12);
        h(dVar, bVarP.f64076d);
        ((Handler) k1.o(this.f64068c)).obtainMessage(2, bVarP).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public void e() throws InterruptedException {
        g();
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public void flush() {
        if (this.f64071f) {
            try {
                o();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    @l1(otherwise = 5)
    void r(RuntimeException runtimeException) {
        this.f64069d.set(runtimeException);
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public void shutdown() {
        if (this.f64071f) {
            flush();
            this.f64067b.quit();
        }
        this.f64071f = false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public void start() {
        if (this.f64071f) {
            return;
        }
        this.f64067b.start();
        this.f64068c = new a(this.f64067b.getLooper());
        this.f64071f = true;
    }

    @l1
    f(MediaCodec mediaCodec, HandlerThread handlerThread, androidx.media3.common.util.m mVar) {
        this.f64066a = mediaCodec;
        this.f64067b = handlerThread;
        this.f64070e = mVar;
        this.f64069d = new AtomicReference<>();
    }
}
