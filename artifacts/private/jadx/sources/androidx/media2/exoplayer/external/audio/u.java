package androidx.media2.exoplayer.external.audio;

import android.media.AudioTrack;
import android.os.SystemClock;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.util.q0;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class u {
    private static final int A = 2;
    private static final int B = 3;
    private static final long C = 5000000;
    private static final long D = 5000000;
    private static final long E = 200;
    private static final int F = 10;
    private static final int G = 30000;
    private static final int H = 500000;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f53481z = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f53482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f53483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private AudioTrack f53484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f53485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f53486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private t f53487f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f53488g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f53489h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f53490i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f53491j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f53492k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    private Method f53493l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f53494m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f53495n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f53496o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f53497p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f53498q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f53499r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f53500s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f53501t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f53502u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f53503v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f53504w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f53505x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f53506y;

    public interface a {
        void b(long audioTimestampPositionFrames, long audioTimestampSystemTimeUs, long systemTimeUs, long playbackPositionUs);

        void c(long audioTimestampPositionFrames, long audioTimestampSystemTimeUs, long systemTimeUs, long playbackPositionUs);

        void d(int bufferSize, long bufferSizeMs);

        void e(long latencyUs);
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    private @interface b {
    }

    public u(a listener) {
        this.f53482a = (a) androidx.media2.exoplayer.external.util.a.g(listener);
        if (q0.f57626a >= 18) {
            try {
                this.f53493l = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f53483b = new long[10];
    }

    private boolean a() {
        if (!this.f53489h || ((AudioTrack) androidx.media2.exoplayer.external.util.a.g(this.f53484c)).getPlayState() != 2 || e() != 0) {
            return false;
        }
        int i10 = 5 & 1;
        return true;
    }

    private long b(long frameCount) {
        return (frameCount * 1000000) / ((long) this.f53488g);
    }

    private long e() {
        AudioTrack audioTrack = (AudioTrack) androidx.media2.exoplayer.external.util.a.g(this.f53484c);
        if (this.f53503v != -9223372036854775807L) {
            return Math.min(this.f53506y, this.f53505x + ((((SystemClock.elapsedRealtime() * 1000) - this.f53503v) * ((long) this.f53488g)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & com.rabbitmq.client.k0.f265952a;
        if (this.f53489h) {
            int i10 = 6 >> 2;
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f53500s = this.f53498q;
            }
            playbackHeadPosition += this.f53500s;
        }
        if (q0.f57626a <= 29) {
            if (playbackHeadPosition == 0 && this.f53498q > 0 && playState == 3) {
                if (this.f53504w == -9223372036854775807L) {
                    this.f53504w = SystemClock.elapsedRealtime();
                }
                return this.f53498q;
            }
            this.f53504w = -9223372036854775807L;
        }
        if (this.f53498q > playbackHeadPosition) {
            this.f53499r++;
        }
        this.f53498q = playbackHeadPosition;
        return playbackHeadPosition + (this.f53499r << 32);
    }

    private long f() {
        return b(e());
    }

    private void l(long systemTimeUs, long playbackPositionUs) {
        t tVar = (t) androidx.media2.exoplayer.external.util.a.g(this.f53487f);
        if (tVar.f(systemTimeUs)) {
            long jC = tVar.c();
            long jB = tVar.b();
            if (Math.abs(jC - systemTimeUs) > 5000000) {
                this.f53482a.c(jB, jC, systemTimeUs, playbackPositionUs);
                tVar.g();
            } else if (Math.abs(b(jB) - playbackPositionUs) <= 5000000) {
                tVar.a();
            } else {
                this.f53482a.b(jB, jC, systemTimeUs, playbackPositionUs);
                tVar.g();
            }
        }
    }

    private void m() {
        long jF = f();
        if (jF == 0) {
            return;
        }
        long jNanoTime = System.nanoTime() / 1000;
        if (jNanoTime - this.f53492k >= 30000) {
            long[] jArr = this.f53483b;
            int i10 = this.f53501t;
            jArr[i10] = jF - jNanoTime;
            this.f53501t = (i10 + 1) % 10;
            int i11 = this.f53502u;
            if (i11 < 10) {
                this.f53502u = i11 + 1;
            }
            this.f53492k = jNanoTime;
            this.f53491j = 0L;
            int i12 = 0;
            while (true) {
                int i13 = this.f53502u;
                if (i12 >= i13) {
                    break;
                }
                this.f53491j += this.f53483b[i12] / ((long) i13);
                i12++;
            }
        }
        if (this.f53489h) {
            return;
        }
        l(jNanoTime, jF);
        n(jNanoTime);
    }

    private void n(long systemTimeUs) {
        Method method;
        if (!this.f53496o || (method = this.f53493l) == null || systemTimeUs - this.f53497p < 500000) {
            return;
        }
        try {
            long jIntValue = (((long) ((Integer) q0.i((Integer) method.invoke(androidx.media2.exoplayer.external.util.a.g(this.f53484c), null))).intValue()) * 1000) - this.f53490i;
            this.f53494m = jIntValue;
            long jMax = Math.max(jIntValue, 0L);
            this.f53494m = jMax;
            if (jMax > 5000000) {
                this.f53482a.e(jMax);
                this.f53494m = 0L;
            }
        } catch (Exception unused) {
            this.f53493l = null;
        }
        this.f53497p = systemTimeUs;
    }

    private static boolean o(int outputEncoding) {
        if (q0.f57626a < 23) {
            return outputEncoding == 5 || outputEncoding == 6;
        }
        return false;
    }

    private void r() {
        this.f53491j = 0L;
        this.f53502u = 0;
        this.f53501t = 0;
        this.f53492k = 0L;
    }

    public int c(long writtenBytes) {
        return this.f53486e - ((int) (writtenBytes - (e() * ((long) this.f53485d))));
    }

    public long d(boolean sourceEnded) {
        if (((AudioTrack) androidx.media2.exoplayer.external.util.a.g(this.f53484c)).getPlayState() == 3) {
            m();
        }
        long jNanoTime = System.nanoTime() / 1000;
        t tVar = (t) androidx.media2.exoplayer.external.util.a.g(this.f53487f);
        if (tVar.d()) {
            long jB = b(tVar.b());
            return !tVar.e() ? jB : jB + (jNanoTime - tVar.c());
        }
        long jF = this.f53502u == 0 ? f() : jNanoTime + this.f53491j;
        return !sourceEnded ? jF - this.f53494m : jF;
    }

    public void g(long writtenFrames) {
        this.f53505x = e();
        this.f53503v = SystemClock.elapsedRealtime() * 1000;
        this.f53506y = writtenFrames;
    }

    public boolean h(long writtenFrames) {
        return writtenFrames > e() || a();
    }

    public boolean i() {
        if (((AudioTrack) androidx.media2.exoplayer.external.util.a.g(this.f53484c)).getPlayState() != 3) {
            return false;
        }
        int i10 = 3 & 1;
        return true;
    }

    public boolean j(long writtenFrames) {
        return this.f53504w != -9223372036854775807L && writtenFrames > 0 && SystemClock.elapsedRealtime() - this.f53504w >= E;
    }

    public boolean k(long writtenFrames) {
        a aVar;
        int playState = ((AudioTrack) androidx.media2.exoplayer.external.util.a.g(this.f53484c)).getPlayState();
        if (this.f53489h) {
            if (playState == 2) {
                this.f53495n = false;
                return false;
            }
            if (playState == 1 && e() == 0) {
                return false;
            }
        }
        boolean z10 = this.f53495n;
        boolean zH = h(writtenFrames);
        this.f53495n = zH;
        if (z10 && !zH && playState != 1 && (aVar = this.f53482a) != null) {
            aVar.d(this.f53486e, androidx.media2.exoplayer.external.c.c(this.f53490i));
        }
        return true;
    }

    public boolean p() {
        r();
        if (this.f53503v != -9223372036854775807L) {
            return false;
        }
        ((t) androidx.media2.exoplayer.external.util.a.g(this.f53487f)).h();
        return true;
    }

    public void q() {
        r();
        this.f53484c = null;
        this.f53487f = null;
    }

    public void s(AudioTrack audioTrack, int outputEncoding, int outputPcmFrameSize, int bufferSize) {
        this.f53484c = audioTrack;
        this.f53485d = outputPcmFrameSize;
        this.f53486e = bufferSize;
        this.f53487f = new t(audioTrack);
        this.f53488g = audioTrack.getSampleRate();
        this.f53489h = o(outputEncoding);
        boolean zO0 = q0.o0(outputEncoding);
        this.f53496o = zO0;
        this.f53490i = zO0 ? b(bufferSize / outputPcmFrameSize) : -9223372036854775807L;
        this.f53498q = 0L;
        this.f53499r = 0L;
        this.f53500s = 0L;
        this.f53495n = false;
        this.f53503v = -9223372036854775807L;
        this.f53504w = -9223372036854775807L;
        this.f53494m = 0L;
    }

    public void t() {
        ((t) androidx.media2.exoplayer.external.util.a.g(this.f53487f)).h();
    }
}
