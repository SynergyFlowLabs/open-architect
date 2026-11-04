package androidx.media3.exoplayer.audio;

import android.media.AudioTrack;
import androidx.media3.common.util.k1;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
final class z {
    private static final int K = 1;
    private static final int L = 2;
    private static final int M = 3;
    private static final long N = 5000000;
    private static final long O = 5000000;
    private static final long P = 1000000;
    private static final long Q = 5;
    private static final long R = 200;
    private static final int S = 10;
    private static final int T = 30000;
    private static final int U = 500000;
    private long A;
    private long B;
    private long C;
    private long D;
    private boolean E;
    private long F;
    private long G;
    private boolean H;
    private long I;
    private androidx.media3.common.util.j J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f63476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f63477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private AudioTrack f63478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f63479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f63480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private y f63481f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f63482g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f63483h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f63484i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f63485j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f63486k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f63487l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f63488m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.p0
    private Method f63489n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f63490o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f63491p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f63492q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f63493r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f63494s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f63495t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f63496u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f63497v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f63498w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f63499x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f63500y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f63501z;

    public interface a {
        void a(long j10);

        void b(long j10, long j11, long j12, long j13);

        void c(long j10, long j11, long j12, long j13);

        void d(int i10, long j10);

        void e(long j10);
    }

    public z(a aVar) {
        this.f63476a = (a) androidx.media3.common.util.a.g(aVar);
        try {
            this.f63489n = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f63477b = new long[10];
        this.J = androidx.media3.common.util.j.f61520a;
    }

    private boolean b() {
        return this.f63483h && ((AudioTrack) androidx.media3.common.util.a.g(this.f63478c)).getPlayState() == 2 && e() == 0;
    }

    private long e() {
        if (this.f63500y != -9223372036854775807L) {
            return Math.min(this.B, g());
        }
        long jB = this.J.b();
        if (jB - this.f63494s >= 5) {
            x(jB);
            this.f63494s = jB;
        }
        return this.f63495t + this.I + (this.f63496u << 32);
    }

    private long f() {
        return k1.W1(e(), this.f63482g);
    }

    private long g() {
        if (((AudioTrack) androidx.media3.common.util.a.g(this.f63478c)).getPlayState() == 2) {
            return this.A;
        }
        return this.A + k1.P(k1.z0(k1.D1(this.J.b()) - this.f63500y, this.f63485j), this.f63482g);
    }

    private void m(long j10) {
        y yVar = (y) androidx.media3.common.util.a.g(this.f63481f);
        if (yVar.g(j10)) {
            long jD = yVar.d();
            long jC = yVar.c();
            long jF = f();
            if (Math.abs(jD - j10) > 5000000) {
                this.f63476a.c(jC, jD, j10, jF);
                yVar.h();
            } else if (Math.abs(k1.W1(jC, this.f63482g) - jF) <= 5000000) {
                yVar.a();
            } else {
                this.f63476a.b(jC, jD, j10, jF);
                yVar.h();
            }
        }
    }

    private void n() {
        long jA = this.J.a() / 1000;
        if (jA - this.f63488m >= 30000) {
            long jF = f();
            if (jF != 0) {
                this.f63477b[this.f63498w] = k1.F0(jF, this.f63485j) - jA;
                this.f63498w = (this.f63498w + 1) % 10;
                int i10 = this.f63499x;
                if (i10 < 10) {
                    this.f63499x = i10 + 1;
                }
                this.f63488m = jA;
                this.f63487l = 0L;
                int i11 = 0;
                while (true) {
                    int i12 = this.f63499x;
                    if (i11 >= i12) {
                        break;
                    }
                    this.f63487l += this.f63477b[i11] / ((long) i12);
                    i11++;
                }
            } else {
                return;
            }
        }
        if (this.f63483h) {
            return;
        }
        m(jA);
        o(jA);
    }

    private void o(long j10) {
        Method method;
        if (!this.f63492q || (method = this.f63489n) == null || j10 - this.f63493r < 500000) {
            return;
        }
        try {
            long jIntValue = (((long) ((Integer) k1.o((Integer) method.invoke(androidx.media3.common.util.a.g(this.f63478c), null))).intValue()) * 1000) - this.f63484i;
            this.f63490o = jIntValue;
            long jMax = Math.max(jIntValue, 0L);
            this.f63490o = jMax;
            if (jMax > 5000000) {
                this.f63476a.e(jMax);
                this.f63490o = 0L;
            }
        } catch (Exception unused) {
            this.f63489n = null;
        }
        this.f63493r = j10;
    }

    private static boolean p(int i10) {
        if (k1.f61540a >= 23) {
            return false;
        }
        if (i10 != 5) {
            int i11 = 3 & 6;
            if (i10 != 6) {
                return false;
            }
        }
        return true;
    }

    private void s() {
        this.f63487l = 0L;
        this.f63499x = 0;
        this.f63498w = 0;
        this.f63488m = 0L;
        this.D = 0L;
        this.G = 0L;
        this.f63486k = false;
    }

    private void x(long j10) {
        AudioTrack audioTrack = (AudioTrack) androidx.media3.common.util.a.g(this.f63478c);
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & com.rabbitmq.client.k0.f265952a;
        if (this.f63483h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f63497v = this.f63495t;
            }
            playbackHeadPosition += this.f63497v;
        }
        if (k1.f61540a <= 29) {
            if (playbackHeadPosition == 0 && this.f63495t > 0 && playState == 3) {
                if (this.f63501z == -9223372036854775807L) {
                    this.f63501z = j10;
                    return;
                }
                return;
            }
            this.f63501z = -9223372036854775807L;
        }
        long j11 = this.f63495t;
        if (j11 > playbackHeadPosition) {
            if (this.H) {
                this.I += j11;
                this.H = false;
            } else {
                this.f63496u++;
            }
        }
        this.f63495t = playbackHeadPosition;
    }

    public void a() {
        this.H = true;
        y yVar = this.f63481f;
        if (yVar != null) {
            yVar.b();
        }
    }

    public int c(long j10) {
        return this.f63480e - ((int) (j10 - (e() * ((long) this.f63479d))));
    }

    public long d() {
        long jZ0;
        long jMin;
        AudioTrack audioTrack = (AudioTrack) androidx.media3.common.util.a.g(this.f63478c);
        if (audioTrack.getPlayState() == 3) {
            n();
        }
        long jA = this.J.a() / 1000;
        y yVar = (y) androidx.media3.common.util.a.g(this.f63481f);
        boolean zE = yVar.e();
        if (zE) {
            jMin = k1.W1(yVar.c(), this.f63482g) + k1.z0(jA - yVar.d(), this.f63485j);
        } else {
            if (this.f63499x == 0) {
                jZ0 = this.f63500y != -9223372036854775807L ? k1.W1(g(), this.f63482g) : f();
            } else {
                jZ0 = k1.z0(this.f63487l + jA, this.f63485j);
            }
            long jMax = Math.max(0L, jZ0 - this.f63490o);
            jMin = this.f63500y != -9223372036854775807L ? Math.min(k1.W1(this.B, this.f63482g), jMax) : jMax;
        }
        if (this.E != zE) {
            this.G = this.D;
            this.F = this.C;
        }
        long j10 = jA - this.G;
        if (j10 < 1000000) {
            long jZ1 = this.F + k1.z0(j10, this.f63485j);
            long j11 = (j10 * 1000) / 1000000;
            jMin = ((jMin * j11) + ((1000 - j11) * jZ1)) / 1000;
        }
        if (!this.f63486k && jMin > this.C && audioTrack.getPlayState() == 3) {
            this.f63486k = true;
            this.f63476a.a(this.J.currentTimeMillis() - k1.A2(k1.F0(k1.A2(jMin - this.C), this.f63485j)));
        }
        this.D = jA;
        this.C = jMin;
        this.E = zE;
        return jMin;
    }

    public void h(long j10) {
        this.A = e();
        this.f63500y = k1.D1(this.J.b());
        this.B = j10;
    }

    public boolean i(long j10) {
        return j10 > k1.P(d(), this.f63482g) || b();
    }

    public boolean j() {
        return ((AudioTrack) androidx.media3.common.util.a.g(this.f63478c)).getPlayState() == 3;
    }

    public boolean k(long j10) {
        return this.f63501z != -9223372036854775807L && j10 > 0 && this.J.b() - this.f63501z >= R;
    }

    public boolean l(long j10) {
        int playState = ((AudioTrack) androidx.media3.common.util.a.g(this.f63478c)).getPlayState();
        if (this.f63483h) {
            if (playState == 2) {
                this.f63491p = false;
                return false;
            }
            if (playState == 1 && e() == 0) {
                return false;
            }
        }
        boolean z10 = this.f63491p;
        boolean zI = i(j10);
        this.f63491p = zI;
        if (z10 && !zI && playState != 1) {
            this.f63476a.d(this.f63480e, k1.A2(this.f63484i));
        }
        return true;
    }

    public boolean q() {
        s();
        if (this.f63500y == -9223372036854775807L) {
            ((y) androidx.media3.common.util.a.g(this.f63481f)).i();
            return true;
        }
        this.A = e();
        return false;
    }

    public void r() {
        s();
        this.f63478c = null;
        this.f63481f = null;
    }

    public void t(AudioTrack audioTrack, boolean z10, int i10, int i11, int i12) {
        this.f63478c = audioTrack;
        this.f63479d = i11;
        this.f63480e = i12;
        this.f63481f = new y(audioTrack);
        this.f63482g = audioTrack.getSampleRate();
        this.f63483h = z10 && p(i10);
        boolean zH1 = k1.h1(i10);
        this.f63492q = zH1;
        this.f63484i = zH1 ? k1.W1(i12 / i11, this.f63482g) : -9223372036854775807L;
        this.f63495t = 0L;
        this.f63496u = 0L;
        this.H = false;
        this.I = 0L;
        this.f63497v = 0L;
        this.f63491p = false;
        this.f63500y = -9223372036854775807L;
        this.f63501z = -9223372036854775807L;
        this.f63493r = 0L;
        this.f63490o = 0L;
        this.f63485j = 1.0f;
    }

    public void u(float f10) {
        this.f63485j = f10;
        y yVar = this.f63481f;
        if (yVar != null) {
            yVar.i();
        }
        s();
    }

    public void v(androidx.media3.common.util.j jVar) {
        this.J = jVar;
    }

    public void w() {
        if (this.f63500y != -9223372036854775807L) {
            this.f63500y = k1.D1(this.J.b());
        }
        ((y) androidx.media3.common.util.a.g(this.f63481f)).i();
    }
}
