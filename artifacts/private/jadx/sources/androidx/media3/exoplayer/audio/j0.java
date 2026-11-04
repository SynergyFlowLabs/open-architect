package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.y0;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.analytics.j4;
import com.google.common.collect.l6;
import com.google.common.collect.nb;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class j0 implements x {
    public static final float A0 = 8.0f;
    private static final boolean B0 = false;
    public static final int C0 = 0;
    public static final int D0 = 1;
    public static final int E0 = 2;
    private static final int F0 = -32;
    private static final String G0 = "DefaultAudioSink";
    public static boolean H0 = false;
    private static final Object I0 = new Object();

    @androidx.annotation.b0("releaseExecutorLock")
    @androidx.annotation.p0
    private static ScheduledExecutorService J0 = null;

    @androidx.annotation.b0("releaseExecutorLock")
    private static int K0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final int f63225s0 = 1000000;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final int f63226t0 = 300000;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final int f63227u0 = 100;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private static final int f63228v0 = 20;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final float f63229w0 = 1.0f;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final float f63230x0 = 0.1f;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final float f63231y0 = 8.0f;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final float f63232z0 = 0.1f;

    @androidx.annotation.p0
    private x.d A;

    @androidx.annotation.p0
    private i B;
    private i C;
    private androidx.media3.common.audio.f D;

    @androidx.annotation.p0
    private AudioTrack E;
    private androidx.media3.exoplayer.audio.e F;
    private androidx.media3.exoplayer.audio.h G;

    @androidx.annotation.p0
    private m H;
    private androidx.media3.common.d I;

    @androidx.annotation.p0
    private l J;
    private l K;
    private y0 L;
    private boolean M;

    @androidx.annotation.p0
    private ByteBuffer N;
    private int O;
    private long P;
    private long Q;
    private long R;
    private long S;
    private int T;
    private boolean U;
    private boolean V;
    private long W;
    private float X;

    @androidx.annotation.p0
    private ByteBuffer Y;
    private int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @androidx.annotation.p0
    private ByteBuffer f63233a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f63234b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f63235c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private boolean f63236d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private boolean f63237e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private boolean f63238f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private int f63239g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.p0
    private final Context f63240h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private androidx.media3.common.f f63241h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final androidx.media3.common.audio.h f63242i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    @androidx.annotation.p0
    private androidx.media3.exoplayer.audio.i f63243i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f63244j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private boolean f63245j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final b0 f63246k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private long f63247k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final v0 f63248l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private long f63249l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final l6<androidx.media3.common.audio.g> f63250m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private boolean f63251m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final l6<androidx.media3.common.audio.g> f63252n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private boolean f63253n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final z f63254o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    @androidx.annotation.p0
    private Looper f63255o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ArrayDeque<l> f63256p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private long f63257p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f63258q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private long f63259q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f63260r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private Handler f63261r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private q f63262s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final o<x.c> f63263t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final o<x.h> f63264u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final f f63265v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final d f63266w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.p0
    private final ExoPlayer.a f63267x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final g f63268y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @androidx.annotation.p0
    private j4 f63269z;

    @androidx.annotation.w0(23)
    private static final class b {
        private b() {
        }

        public static void a(AudioTrack audioTrack, @androidx.annotation.p0 androidx.media3.exoplayer.audio.i iVar) {
            audioTrack.setPreferredDevice(iVar == null ? null : iVar.f63215a);
        }
    }

    @androidx.annotation.w0(31)
    private static final class c {
        private c() {
        }

        public static void a(AudioTrack audioTrack, j4 j4Var) {
            LogSessionId logSessionIdA = j4Var.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            audioTrack.setLogSessionId(logSessionIdA);
        }
    }

    public interface d {
        androidx.media3.exoplayer.audio.j a(androidx.media3.common.w wVar, androidx.media3.common.d dVar);
    }

    @Deprecated
    public interface e extends androidx.media3.common.audio.h {
    }

    public interface f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f63270a = new m0.a().h();

        int a(int i10, int i11, int i12, int i13, int i14, int i15, double d10);
    }

    public interface g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f63271a = new n0();

        AudioTrack a(x.a aVar, androidx.media3.common.d dVar, int i10);
    }

    private static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.media3.common.w f63282a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f63283b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f63284c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f63285d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f63286e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f63287f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f63288g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f63289h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final androidx.media3.common.audio.f f63290i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f63291j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f63292k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f63293l;

        public i(androidx.media3.common.w wVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, androidx.media3.common.audio.f fVar, boolean z10, boolean z11, boolean z12) {
            this.f63282a = wVar;
            this.f63283b = i10;
            this.f63284c = i11;
            this.f63285d = i12;
            this.f63286e = i13;
            this.f63287f = i14;
            this.f63288g = i15;
            this.f63289h = i16;
            this.f63290i = fVar;
            this.f63291j = z10;
            this.f63292k = z11;
            this.f63293l = z12;
        }

        public x.a a() {
            return new x.a(this.f63288g, this.f63286e, this.f63287f, this.f63293l, this.f63284c == 1, this.f63289h);
        }

        public boolean b(i iVar) {
            return iVar.f63284c == this.f63284c && iVar.f63288g == this.f63288g && iVar.f63286e == this.f63286e && iVar.f63287f == this.f63287f && iVar.f63285d == this.f63285d && iVar.f63291j == this.f63291j && iVar.f63292k == this.f63292k;
        }

        public i c(int i10) {
            return new i(this.f63282a, this.f63283b, this.f63284c, this.f63285d, this.f63286e, this.f63287f, this.f63288g, i10, this.f63290i, this.f63291j, this.f63292k, this.f63293l);
        }

        public long d(long j10) {
            return k1.W1(j10, this.f63286e);
        }

        public long e(long j10) {
            return k1.W1(j10, this.f63282a.F);
        }

        public boolean f() {
            return this.f63284c == 1;
        }
    }

    public static class j implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.media3.common.audio.g[] f63294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final s0 f63295b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final androidx.media3.common.audio.m f63296c;

        public j(androidx.media3.common.audio.g... gVarArr) {
            this(gVarArr, new s0(), new androidx.media3.common.audio.m());
        }

        @Override // androidx.media3.common.audio.h
        public androidx.media3.common.audio.g[] a() {
            return this.f63294a;
        }

        @Override // androidx.media3.common.audio.h
        public long b() {
            return this.f63295b.u();
        }

        @Override // androidx.media3.common.audio.h
        public long c(long j10) {
            return this.f63296c.isActive() ? this.f63296c.h(j10) : j10;
        }

        @Override // androidx.media3.common.audio.h
        public y0 d(y0 y0Var) {
            this.f63296c.m(y0Var.f61874a);
            this.f63296c.l(y0Var.f61875b);
            return y0Var;
        }

        @Override // androidx.media3.common.audio.h
        public boolean e(boolean z10) {
            this.f63295b.D(z10);
            return z10;
        }

        public j(androidx.media3.common.audio.g[] gVarArr, s0 s0Var, androidx.media3.common.audio.m mVar) {
            androidx.media3.common.audio.g[] gVarArr2 = new androidx.media3.common.audio.g[gVarArr.length + 2];
            this.f63294a = gVarArr2;
            System.arraycopy(gVarArr, 0, gVarArr2, 0, gVarArr.length);
            this.f63295b = s0Var;
            this.f63296c = mVar;
            gVarArr2[gVarArr.length] = s0Var;
            gVarArr2[gVarArr.length + 1] = mVar;
        }
    }

    public static final class k extends RuntimeException {
        private k(String str) {
            super(str);
        }
    }

    private static final class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final y0 f63297a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f63298b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f63299c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f63300d;

        private l(y0 y0Var, long j10, long j11) {
            this.f63297a = y0Var;
            this.f63298b = j10;
            this.f63299c = j11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.w0(24)
    static final class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AudioTrack f63301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.media3.exoplayer.audio.h f63302b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        private AudioRouting.OnRoutingChangedListener f63303c = new AudioRouting.OnRoutingChangedListener() { // from class: androidx.media3.exoplayer.audio.l0
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                this.f63319a.b(audioRouting);
            }
        };

        public m(AudioTrack audioTrack, androidx.media3.exoplayer.audio.h hVar) {
            this.f63301a = audioTrack;
            this.f63302b = hVar;
            audioTrack.addOnRoutingChangedListener(this.f63303c, new Handler(Looper.myLooper()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(AudioRouting audioRouting) {
            AudioDeviceInfo routedDevice;
            if (this.f63303c != null && (routedDevice = audioRouting.getRoutedDevice()) != null) {
                this.f63302b.i(routedDevice);
            }
        }

        public void c() {
            this.f63301a.removeOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) androidx.media3.common.util.a.g(this.f63303c));
            this.f63303c = null;
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface n {
    }

    private static final class o<T extends Exception> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f63304d = 200;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f63305e = 50;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.p0
        private T f63306a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f63307b = -9223372036854775807L;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f63308c = -9223372036854775807L;

        public void a() {
            this.f63306a = null;
            this.f63307b = -9223372036854775807L;
            this.f63308c = -9223372036854775807L;
        }

        public boolean b() {
            if (this.f63306a == null) {
                return false;
            }
            return j0.Z() || SystemClock.elapsedRealtime() < this.f63308c;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: T extends java.lang.Exception */
        public void c(T t10) throws Exception {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f63306a == null) {
                this.f63306a = t10;
            }
            if (this.f63307b == -9223372036854775807L && !j0.Z()) {
                this.f63307b = 200 + jElapsedRealtime;
            }
            long j10 = this.f63307b;
            if (j10 == -9223372036854775807L || jElapsedRealtime < j10) {
                this.f63308c = jElapsedRealtime + 50;
                return;
            }
            T t11 = this.f63306a;
            if (t11 != t10) {
                t11.addSuppressed(t10);
            }
            T t12 = this.f63306a;
            a();
            throw t12;
        }
    }

    private final class p implements z.a {
        private p() {
        }

        @Override // androidx.media3.exoplayer.audio.z.a
        public void a(long j10) {
            if (j0.this.A != null) {
                j0.this.A.a(j10);
            }
        }

        @Override // androidx.media3.exoplayer.audio.z.a
        public void b(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + j0.this.W() + ", " + j0.this.X();
            if (j0.H0) {
                throw new k(str);
            }
            androidx.media3.common.util.z.n(j0.G0, str);
        }

        @Override // androidx.media3.exoplayer.audio.z.a
        public void c(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + j0.this.W() + ", " + j0.this.X();
            if (j0.H0) {
                throw new k(str);
            }
            androidx.media3.common.util.z.n(j0.G0, str);
        }

        @Override // androidx.media3.exoplayer.audio.z.a
        public void d(int i10, long j10) {
            if (j0.this.A != null) {
                j0.this.A.b(i10, j10, SystemClock.elapsedRealtime() - j0.this.f63249l0);
            }
        }

        @Override // androidx.media3.exoplayer.audio.z.a
        public void e(long j10) {
            androidx.media3.common.util.z.n(j0.G0, "Ignoring impossibly large audio latency: " + j10);
        }
    }

    @androidx.annotation.w0(29)
    private final class q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f63310a = new Handler(Looper.myLooper());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AudioTrack.StreamEventCallback f63311b;

        class a extends AudioTrack.StreamEventCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ j0 f63313a;

            a(j0 j0Var) {
                this.f63313a = j0Var;
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onDataRequest(AudioTrack audioTrack, int i10) {
                if (audioTrack.equals(j0.this.E) && j0.this.A != null && j0.this.f63237e0) {
                    j0.this.A.k();
                }
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onPresentationEnded(AudioTrack audioTrack) {
                if (audioTrack.equals(j0.this.E)) {
                    j0.this.f63236d0 = true;
                }
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onTearDown(AudioTrack audioTrack) {
                if (audioTrack.equals(j0.this.E) && j0.this.A != null && j0.this.f63237e0) {
                    j0.this.A.k();
                }
            }
        }

        public q() {
            this.f63311b = new a(j0.this);
        }

        public void a(AudioTrack audioTrack) {
            Handler handler = this.f63310a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new androidx.emoji2.text.a(handler), this.f63311b);
        }

        public void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f63311b);
            this.f63310a.removeCallbacksAndMessages(null);
        }
    }

    public static /* synthetic */ void D(AudioTrack audioTrack, final x.d dVar, Handler handler, final x.a aVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (dVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.i0
                    @Override // java.lang.Runnable
                    public final void run() {
                        dVar.f(aVar);
                    }
                });
            }
            synchronized (I0) {
                try {
                    int i10 = K0 - 1;
                    K0 = i10;
                    if (i10 == 0) {
                        J0.shutdown();
                        J0 = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            if (dVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.i0
                    @Override // java.lang.Runnable
                    public final void run() {
                        dVar.f(aVar);
                    }
                });
            }
            synchronized (I0) {
                try {
                    int i11 = K0 - 1;
                    K0 = i11;
                    if (i11 == 0) {
                        J0.shutdown();
                        J0 = null;
                    }
                    throw th3;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    private void M(long j10) {
        y0 y0VarD;
        if (w0()) {
            y0VarD = y0.f61871d;
        } else {
            y0VarD = u0() ? this.f63242i.d(this.L) : y0.f61871d;
            this.L = y0VarD;
        }
        y0 y0Var = y0VarD;
        this.M = u0() ? this.f63242i.e(this.M) : false;
        this.f63256p.add(new l(y0Var, Math.max(0L, j10), this.C.d(X())));
        s0();
        x.d dVar = this.A;
        if (dVar != null) {
            dVar.g(this.M);
        }
    }

    private long N(long j10) {
        while (!this.f63256p.isEmpty() && j10 >= this.f63256p.getFirst().f63299c) {
            this.K = this.f63256p.remove();
        }
        l lVar = this.K;
        long j11 = j10 - lVar.f63299c;
        long jZ0 = k1.z0(j11, lVar.f63297a.f61874a);
        if (!this.f63256p.isEmpty()) {
            l lVar2 = this.K;
            return lVar2.f63298b + jZ0 + lVar2.f63300d;
        }
        long jC = this.f63242i.c(j11);
        l lVar3 = this.K;
        long j12 = lVar3.f63298b + jC;
        lVar3.f63300d = jC - jZ0;
        return j12;
    }

    private long O(long j10) {
        long jB = this.f63242i.b();
        long jD = j10 + this.C.d(jB);
        long j11 = this.f63257p0;
        if (jB > j11) {
            long jD2 = this.C.d(jB - j11);
            this.f63257p0 = jB;
            Y(jD2);
        }
        return jD;
    }

    private AudioTrack P(x.a aVar, androidx.media3.common.d dVar, int i10, androidx.media3.common.w wVar) throws x.c {
        try {
            AudioTrack audioTrackA = this.f63268y.a(aVar, dVar, i10);
            int state = audioTrackA.getState();
            if (state == 1) {
                return audioTrackA;
            }
            try {
                audioTrackA.release();
            } catch (Exception unused) {
            }
            throw new x.c(state, aVar.f63440b, aVar.f63441c, aVar.f63439a, wVar, aVar.f63443e, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e10) {
            throw new x.c(0, aVar.f63440b, aVar.f63441c, aVar.f63439a, wVar, aVar.f63443e, e10);
        }
    }

    private AudioTrack Q(i iVar) throws x.c {
        try {
            AudioTrack audioTrackP = P(iVar.a(), this.I, this.f63239g0, iVar.f63282a);
            ExoPlayer.a aVar = this.f63267x;
            if (aVar == null) {
                return audioTrackP;
            }
            aVar.l(d0(audioTrackP));
            return audioTrackP;
        } catch (x.c e10) {
            x.d dVar = this.A;
            if (dVar != null) {
                dVar.h(e10);
            }
            throw e10;
        }
    }

    private AudioTrack R() throws x.c {
        try {
            return Q((i) androidx.media3.common.util.a.g(this.C));
        } catch (x.c e10) {
            i iVar = this.C;
            if (iVar.f63289h > 1000000) {
                i iVarC = iVar.c(1000000);
                try {
                    AudioTrack audioTrackQ = Q(iVarC);
                    this.C = iVarC;
                    return audioTrackQ;
                } catch (x.c e11) {
                    e10.addSuppressed(e11);
                    e0();
                    throw e10;
                }
            }
            e0();
            throw e10;
        }
    }

    private void S(long j10) throws Exception {
        j0 j0Var;
        int iX0;
        x.d dVar;
        if (this.f63233a0 == null || this.f63264u.b()) {
            return;
        }
        int iRemaining = this.f63233a0.remaining();
        boolean z10 = false;
        if (this.f63245j0) {
            androidx.media3.common.util.a.i(j10 != -9223372036854775807L);
            if (j10 == Long.MIN_VALUE) {
                j10 = this.f63247k0;
            } else {
                this.f63247k0 = j10;
            }
            j0Var = this;
            iX0 = j0Var.y0(this.E, this.f63233a0, iRemaining, j10);
        } else {
            j0Var = this;
            iX0 = x0(j0Var.E, j0Var.f63233a0, iRemaining);
        }
        j0Var.f63249l0 = SystemClock.elapsedRealtime();
        if (iX0 < 0) {
            if (b0(iX0)) {
                if (j0Var.X() > 0) {
                    z10 = true;
                } else if (d0(j0Var.E)) {
                    j0Var.e0();
                    z10 = true;
                }
            }
            x.h hVar = new x.h(iX0, j0Var.C.f63282a, z10);
            x.d dVar2 = j0Var.A;
            if (dVar2 != null) {
                dVar2.h(hVar);
            }
            if (!hVar.f63452b || j0Var.f63240h == null) {
                j0Var.f63264u.c(hVar);
                return;
            } else {
                j0Var.F = androidx.media3.exoplayer.audio.e.f63183e;
                throw hVar;
            }
        }
        j0Var.f63264u.a();
        if (d0(j0Var.E)) {
            if (j0Var.S > 0) {
                j0Var.f63253n0 = false;
            }
            if (j0Var.f63237e0 && (dVar = j0Var.A) != null && iX0 < iRemaining && !j0Var.f63253n0) {
                dVar.j();
            }
        }
        int i10 = j0Var.C.f63284c;
        if (i10 == 0) {
            j0Var.R += (long) iX0;
        }
        if (iX0 == iRemaining) {
            if (i10 != 0) {
                androidx.media3.common.util.a.i(j0Var.f63233a0 == j0Var.Y);
                j0Var.S += ((long) j0Var.T) * ((long) j0Var.Z);
            }
            j0Var.f63233a0 = null;
        }
    }

    private boolean T() throws Exception {
        ByteBuffer byteBuffer;
        if (!this.D.g()) {
            S(Long.MIN_VALUE);
            return this.f63233a0 == null;
        }
        this.D.i();
        k0(Long.MIN_VALUE);
        return this.D.f() && ((byteBuffer = this.f63233a0) == null || !byteBuffer.hasRemaining());
    }

    private static int U(int i10, int i11, int i12) {
        int minBufferSize = AudioTrack.getMinBufferSize(i10, i11, i12);
        androidx.media3.common.util.a.i(minBufferSize != -2);
        return minBufferSize;
    }

    private static int V(int i10, ByteBuffer byteBuffer) {
        if (i10 == 20) {
            return androidx.media3.extractor.m0.h(byteBuffer);
        }
        if (i10 != 30) {
            switch (i10) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int iM = androidx.media3.extractor.k0.m(k1.e0(byteBuffer, byteBuffer.position()));
                    if (iM != -1) {
                        return iM;
                    }
                    throw new IllegalArgumentException();
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return 2048;
                default:
                    switch (i10) {
                        case 14:
                            int iB = androidx.media3.extractor.b.b(byteBuffer);
                            if (iB == -1) {
                                return 0;
                            }
                            return androidx.media3.extractor.b.i(byteBuffer, iB) * 16;
                        case 15:
                            return 512;
                        case 16:
                            return 1024;
                        case 17:
                            return androidx.media3.extractor.c.e(byteBuffer);
                        case 18:
                            break;
                        default:
                            throw new IllegalStateException("Unexpected audio encoding: " + i10);
                    }
                    break;
            }
            return androidx.media3.extractor.b.e(byteBuffer);
        }
        return androidx.media3.extractor.o.f(byteBuffer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long W() {
        i iVar = this.C;
        return iVar.f63284c == 0 ? this.P / ((long) iVar.f63283b) : this.Q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long X() {
        i iVar = this.C;
        return iVar.f63284c == 0 ? k1.r(this.R, iVar.f63285d) : this.S;
    }

    private void Y(long j10) {
        this.f63259q0 += j10;
        if (this.f63261r0 == null) {
            this.f63261r0 = new Handler(Looper.myLooper());
        }
        this.f63261r0.removeCallbacksAndMessages(null);
        this.f63261r0.postDelayed(new Runnable() { // from class: androidx.media3.exoplayer.audio.g0
            @Override // java.lang.Runnable
            public final void run() {
                this.f63198a.g0();
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean Z() {
        boolean z10;
        synchronized (I0) {
            try {
                z10 = K0 > 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    private boolean a0() throws x.c {
        androidx.media3.exoplayer.audio.h hVar;
        j4 j4Var;
        boolean z10 = false & false;
        if (this.f63263t.b()) {
            return false;
        }
        AudioTrack audioTrackR = R();
        this.E = audioTrackR;
        if (d0(audioTrackR)) {
            l0(this.E);
            i iVar = this.C;
            if (iVar.f63292k) {
                AudioTrack audioTrack = this.E;
                androidx.media3.common.w wVar = iVar.f63282a;
                audioTrack.setOffloadDelayPadding(wVar.H, wVar.I);
            }
        }
        int i10 = k1.f61540a;
        if (i10 >= 31 && (j4Var = this.f63269z) != null) {
            c.a(this.E, j4Var);
        }
        this.f63239g0 = this.E.getAudioSessionId();
        z zVar = this.f63254o;
        AudioTrack audioTrack2 = this.E;
        i iVar2 = this.C;
        zVar.t(audioTrack2, iVar2.f63284c == 2, iVar2.f63288g, iVar2.f63285d, iVar2.f63289h);
        r0();
        int i11 = this.f63241h0.f60595a;
        if (i11 != 0) {
            this.E.attachAuxEffect(i11);
            this.E.setAuxEffectSendLevel(this.f63241h0.f60596b);
        }
        androidx.media3.exoplayer.audio.i iVar3 = this.f63243i0;
        if (iVar3 != null && i10 >= 23) {
            b.a(this.E, iVar3);
            androidx.media3.exoplayer.audio.h hVar2 = this.G;
            if (hVar2 != null) {
                hVar2.i(this.f63243i0.f63215a);
            }
        }
        if (i10 >= 24 && (hVar = this.G) != null) {
            this.H = new m(this.E, hVar);
        }
        this.V = true;
        x.d dVar = this.A;
        if (dVar != null) {
            dVar.e(this.C.a());
        }
        return true;
    }

    private static boolean b0(int i10) {
        return (k1.f61540a >= 24 && i10 == -6) || i10 == F0;
    }

    private boolean c0() {
        return this.E != null;
    }

    private static boolean d0(AudioTrack audioTrack) {
        return k1.f61540a >= 29 && audioTrack.isOffloadedPlayback();
    }

    private void e0() {
        if (this.C.f()) {
            this.f63251m0 = true;
        }
    }

    private ByteBuffer f0(ByteBuffer byteBuffer) {
        if (this.C.f63284c == 0) {
            int iP = (int) k1.P(k1.D1(20L), this.C.f63286e);
            long jX = X();
            if (jX < iP) {
                i iVar = this.C;
                return r0.a(byteBuffer, iVar.f63288g, iVar.f63285d, (int) jX, iP);
            }
        }
        return byteBuffer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0() {
        if (this.f63259q0 >= 300000) {
            this.A.d();
            this.f63259q0 = 0L;
        }
    }

    @il.d({"audioCapabilities"})
    private void h0() {
        if (this.G == null && this.f63240h != null) {
            this.f63255o0 = Looper.myLooper();
            androidx.media3.exoplayer.audio.h hVar = new androidx.media3.exoplayer.audio.h(this.f63240h, new androidx.media3.exoplayer.audio.h.f() { // from class: androidx.media3.exoplayer.audio.h0
                @Override // androidx.media3.exoplayer.audio.h.f
                public final void a(e eVar) {
                    this.f63214a.i0(eVar);
                }
            }, this.I, this.f63243i0);
            this.G = hVar;
            this.F = hVar.g();
        }
        androidx.media3.common.util.a.g(this.F);
    }

    private void j0() {
        if (!this.f63235c0) {
            this.f63235c0 = true;
            this.f63254o.h(X());
            if (d0(this.E)) {
                this.f63236d0 = false;
            }
            this.E.stop();
            this.O = 0;
        }
    }

    private void k0(long j10) throws Exception {
        S(j10);
        if (this.f63233a0 != null) {
            return;
        }
        if (!this.D.g()) {
            ByteBuffer byteBuffer = this.Y;
            if (byteBuffer != null) {
                q0(byteBuffer);
                S(j10);
                return;
            }
            return;
        }
        while (!this.D.f()) {
            do {
                ByteBuffer byteBufferD = this.D.d();
                if (byteBufferD.hasRemaining()) {
                    q0(byteBufferD);
                    S(j10);
                } else {
                    ByteBuffer byteBuffer2 = this.Y;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.D.j(this.Y);
                    }
                }
            } while (this.f63233a0 == null);
            return;
        }
    }

    @androidx.annotation.w0(29)
    private void l0(AudioTrack audioTrack) {
        if (this.f63262s == null) {
            this.f63262s = new q();
        }
        this.f63262s.a(audioTrack);
    }

    private static void m0(final AudioTrack audioTrack, @androidx.annotation.p0 final x.d dVar, final x.a aVar) {
        final Handler handler = new Handler(Looper.myLooper());
        synchronized (I0) {
            try {
                if (J0 == null) {
                    J0 = k1.F1("ExoPlayer:AudioTrackReleaseThread");
                }
                K0++;
                J0.schedule(new Runnable() { // from class: androidx.media3.exoplayer.audio.f0
                    @Override // java.lang.Runnable
                    public final void run() {
                        j0.D(audioTrack, dVar, handler, aVar);
                    }
                }, 20L, TimeUnit.MILLISECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void n0() {
        this.P = 0L;
        this.Q = 0L;
        this.R = 0L;
        this.S = 0L;
        this.f63253n0 = false;
        this.T = 0;
        this.K = new l(this.L, 0L, 0L);
        this.W = 0L;
        this.J = null;
        this.f63256p.clear();
        this.Y = null;
        this.Z = 0;
        this.f63233a0 = null;
        this.f63235c0 = false;
        this.f63234b0 = false;
        this.f63236d0 = false;
        this.N = null;
        this.O = 0;
        this.f63248l.n();
        s0();
    }

    private void o0(y0 y0Var) {
        l lVar = new l(y0Var, -9223372036854775807L, -9223372036854775807L);
        if (c0()) {
            this.J = lVar;
        } else {
            this.K = lVar;
        }
    }

    @androidx.annotation.w0(23)
    private void p0() {
        if (c0()) {
            try {
                this.E.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.L.f61874a).setPitch(this.L.f61875b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                androidx.media3.common.util.z.o(G0, "Failed to set playback params", e10);
            }
            y0 y0Var = new y0(this.E.getPlaybackParams().getSpeed(), this.E.getPlaybackParams().getPitch());
            this.L = y0Var;
            this.f63254o.u(y0Var.f61874a);
        }
    }

    private void q0(ByteBuffer byteBuffer) {
        androidx.media3.common.util.a.i(this.f63233a0 == null);
        if (byteBuffer.hasRemaining()) {
            this.f63233a0 = f0(byteBuffer);
        }
    }

    private void r0() {
        if (c0()) {
            this.E.setVolume(this.X);
        }
    }

    private void s0() {
        androidx.media3.common.audio.f fVar = this.C.f63290i;
        this.D = fVar;
        fVar.b();
    }

    private boolean u0() {
        if (!this.f63245j0) {
            i iVar = this.C;
            if (iVar.f63284c == 0 && !v0(iVar.f63282a.G)) {
                return true;
            }
        }
        return false;
    }

    private boolean v0(int i10) {
        return this.f63244j && k1.g1(i10);
    }

    private boolean w0() {
        i iVar = this.C;
        return iVar != null && iVar.f63291j && k1.f61540a >= 23;
    }

    private static int x0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10) {
        return audioTrack.write(byteBuffer, i10, 1);
    }

    private int y0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10, long j10) {
        if (k1.f61540a >= 26) {
            return audioTrack.write(byteBuffer, i10, 1, j10 * 1000);
        }
        if (this.N == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            this.N = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
            this.N.putInt(1431633921);
        }
        if (this.O == 0) {
            this.N.putInt(4, i10);
            this.N.putLong(8, j10 * 1000);
            this.N.position(0);
            this.O = i10;
        }
        int iRemaining = this.N.remaining();
        if (iRemaining > 0) {
            int iWrite = audioTrack.write(this.N, iRemaining, 1);
            if (iWrite < 0) {
                this.O = 0;
                return iWrite;
            }
            if (iWrite < iRemaining) {
                return 0;
            }
        }
        int iX0 = x0(audioTrack, byteBuffer, i10);
        if (iX0 < 0) {
            this.O = 0;
            return iX0;
        }
        this.O -= iX0;
        return iX0;
    }

    @Override // androidx.media3.exoplayer.audio.x
    public void B() {
        this.f63237e0 = true;
        if (c0()) {
            this.f63254o.w();
            this.E.play();
        }
    }

    @Override // androidx.media3.exoplayer.audio.x
    public boolean a() {
        if (c0()) {
            return this.f63234b0 && !j();
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.audio.x
    public boolean b(androidx.media3.common.w wVar) {
        return s(wVar) != 0;
    }

    @Override // androidx.media3.exoplayer.audio.x
    public y0 c() {
        return this.L;
    }

    @Override // androidx.media3.exoplayer.audio.x
    public void d(androidx.media3.common.d dVar) {
        if (this.I.equals(dVar)) {
            return;
        }
        this.I = dVar;
        if (this.f63245j0) {
            return;
        }
        androidx.media3.exoplayer.audio.h hVar = this.G;
        if (hVar != null) {
            hVar.h(dVar);
        }
        flush();
    }

    @Override // androidx.media3.exoplayer.audio.x
    public androidx.media3.common.d e() {
        return this.I;
    }

    @Override // androidx.media3.exoplayer.audio.x
    public void f(float f10) {
        if (this.X != f10) {
            this.X = f10;
            r0();
        }
    }

    @Override // androidx.media3.exoplayer.audio.x
    public void flush() {
        m mVar;
        if (c0()) {
            n0();
            if (this.f63254o.j()) {
                this.E.pause();
            }
            if (d0(this.E)) {
                ((q) androidx.media3.common.util.a.g(this.f63262s)).b(this.E);
            }
            x.a aVarA = this.C.a();
            i iVar = this.B;
            if (iVar != null) {
                this.C = iVar;
                this.B = null;
            }
            this.f63254o.r();
            if (k1.f61540a >= 24 && (mVar = this.H) != null) {
                mVar.c();
                this.H = null;
            }
            m0(this.E, this.A, aVarA);
            this.E = null;
        }
        this.f63264u.a();
        this.f63263t.a();
        this.f63257p0 = 0L;
        this.f63259q0 = 0L;
        Handler handler = this.f63261r0;
        if (handler != null) {
            ((Handler) androidx.media3.common.util.a.g(handler)).removeCallbacksAndMessages(null);
        }
    }

    @Override // androidx.media3.exoplayer.audio.x
    public void g(int i10) {
        if (this.f63239g0 != i10) {
            this.f63239g0 = i10;
            this.f63238f0 = i10 != 0;
            flush();
        }
    }

    @Override // androidx.media3.exoplayer.audio.x
    public void h(y0 y0Var) {
        this.L = new y0(k1.v(y0Var.f61874a, 0.1f, 8.0f), k1.v(y0Var.f61875b, 0.1f, 8.0f));
        if (w0()) {
            p0();
        } else {
            o0(y0Var);
        }
    }

    @Override // androidx.media3.exoplayer.audio.x
    public void i() {
        if (this.f63245j0) {
            this.f63245j0 = false;
            flush();
        }
    }

    public void i0(androidx.media3.exoplayer.audio.e eVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f63255o0;
        if (looper == looperMyLooper) {
            androidx.media3.exoplayer.audio.e eVar2 = this.F;
            if (eVar2 != null && !eVar.equals(eVar2)) {
                this.F = eVar;
                x.d dVar = this.A;
                if (dVar != null) {
                    dVar.i();
                }
            }
            return;
        }
        String name = AbstractJsonLexerKt.NULL;
        String name2 = looper == null ? AbstractJsonLexerKt.NULL : looper.getThread().getName();
        if (looperMyLooper != null) {
            name = looperMyLooper.getThread().getName();
        }
        throw new IllegalStateException("Current looper (" + name + ") is not the playback looper (" + name2 + ")");
    }

    @Override // androidx.media3.exoplayer.audio.x
    public boolean j() {
        if (c0()) {
            return !(k1.f61540a >= 29 && this.E.isOffloadedPlayback() && this.f63236d0) && this.f63254o.i(X());
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.audio.x
    public void k() throws x.h {
        if (!this.f63234b0 && c0() && T()) {
            j0();
            this.f63234b0 = true;
        }
    }

    @Override // androidx.media3.exoplayer.audio.x
    public long l(boolean z10) {
        if (!c0() || this.V) {
            return Long.MIN_VALUE;
        }
        return O(N(Math.min(this.f63254o.d(), this.C.d(X()))));
    }

    @Override // androidx.media3.exoplayer.audio.x
    public void m() {
        this.U = true;
    }

    @Override // androidx.media3.exoplayer.audio.x
    public void n(x.d dVar) {
        this.A = dVar;
    }

    @Override // androidx.media3.exoplayer.audio.x
    @androidx.annotation.w0(29)
    public void o(int i10) {
        androidx.media3.common.util.a.i(k1.f61540a >= 29);
        this.f63260r = i10;
    }

    @Override // androidx.media3.exoplayer.audio.x
    public void p(androidx.media3.common.w wVar, int i10, @androidx.annotation.p0 int[] iArr) throws x.b {
        androidx.media3.common.audio.f fVar;
        int i11;
        boolean z10;
        int i12;
        int i13;
        boolean z11;
        int i14;
        int i15;
        int i16;
        int iA;
        h0();
        int iE0 = -1;
        if ("audio/raw".equals(wVar.f61761o)) {
            androidx.media3.common.util.a.a(k1.h1(wVar.G));
            int iE1 = k1.E0(wVar.G, wVar.E);
            l6.a aVar = new l6.a();
            if (v0(wVar.G)) {
                aVar.c(this.f63252n);
            } else {
                aVar.c(this.f63250m);
                aVar.b(this.f63242i.a());
            }
            androidx.media3.common.audio.f fVar2 = new androidx.media3.common.audio.f(aVar.e());
            if (fVar2.equals(this.D)) {
                fVar2 = this.D;
            }
            this.f63248l.o(wVar.H, wVar.I);
            this.f63246k.m(iArr);
            try {
                androidx.media3.common.audio.g.a aVarA = fVar2.a(new androidx.media3.common.audio.g.a(wVar));
                int i17 = aVarA.f60335c;
                i11 = aVarA.f60333a;
                int iA0 = k1.a0(aVarA.f60334b);
                iE0 = k1.E0(i17, aVarA.f60334b);
                z10 = this.f63258q;
                fVar = fVar2;
                i12 = iA0;
                i13 = 0;
                i14 = i17;
                i15 = iE1;
                z11 = false;
            } catch (androidx.media3.common.audio.g.b e10) {
                throw new x.b(e10, wVar);
            }
        } else {
            fVar = new androidx.media3.common.audio.f(l6.F());
            i11 = wVar.F;
            androidx.media3.exoplayer.audio.j jVarV = this.f63260r != 0 ? v(wVar) : androidx.media3.exoplayer.audio.j.f63218d;
            if (this.f63260r == 0 || !jVarV.f63219a) {
                Pair<Integer, Integer> pairK = this.F.k(wVar, this.I);
                if (pairK == null) {
                    throw new x.b("Unable to configure passthrough for: " + wVar, wVar);
                }
                int iIntValue = ((Integer) pairK.first).intValue();
                int iIntValue2 = ((Integer) pairK.second).intValue();
                z10 = this.f63258q;
                i12 = iIntValue2;
                i13 = 2;
                z11 = false;
                i14 = iIntValue;
            } else {
                int iF = androidx.media3.common.s0.f((String) androidx.media3.common.util.a.g(wVar.f61761o), wVar.f61757k);
                int iA1 = k1.a0(wVar.E);
                z11 = jVarV.f63220b;
                i12 = iA1;
                z10 = true;
                i13 = 1;
                i14 = iF;
            }
            i15 = iE0;
        }
        if (i14 == 0) {
            throw new x.b("Invalid output encoding (mode=" + i13 + ") for: " + wVar, wVar);
        }
        if (i12 == 0) {
            throw new x.b("Invalid output channel config (mode=" + i13 + ") for: " + wVar, wVar);
        }
        int i18 = wVar.f61756j;
        if ("audio/vnd.dts.hd;profile=lbr".equals(wVar.f61761o) && i18 == -1) {
            i18 = 768000;
        }
        int i19 = i18;
        if (i10 != 0) {
            i16 = i11;
            iA = i10;
        } else {
            i16 = i11;
            iA = this.f63265v.a(U(i11, i12, i14), i14, i13, iE0 != -1 ? iE0 : 1, i16, i19, z10 ? 8.0d : 1.0d);
        }
        this.f63251m0 = false;
        i iVar = new i(wVar, i15, i13, iE0, i16, i12, i14, iA, fVar, z10, z11, this.f63245j0);
        if (c0()) {
            this.B = iVar;
        } else {
            this.C = iVar;
        }
    }

    @Override // androidx.media3.exoplayer.audio.x
    public void pause() {
        this.f63237e0 = false;
        if (c0()) {
            if (this.f63254o.q() || d0(this.E)) {
                this.E.pause();
            }
        }
    }

    @Override // androidx.media3.exoplayer.audio.x
    public boolean q() {
        return this.M;
    }

    @Override // androidx.media3.exoplayer.audio.x
    public void r() {
        androidx.media3.common.util.a.i(this.f63238f0);
        if (this.f63245j0) {
            return;
        }
        this.f63245j0 = true;
        flush();
    }

    @Override // androidx.media3.exoplayer.audio.x
    public void release() {
        androidx.media3.exoplayer.audio.h hVar = this.G;
        if (hVar != null) {
            hVar.j();
        }
    }

    @Override // androidx.media3.exoplayer.audio.x
    public void reset() {
        flush();
        nb<androidx.media3.common.audio.g> it = this.f63250m.iterator();
        while (it.hasNext()) {
            it.next().reset();
        }
        nb<androidx.media3.common.audio.g> it2 = this.f63252n.iterator();
        while (it2.hasNext()) {
            it2.next().reset();
        }
        androidx.media3.common.audio.f fVar = this.D;
        if (fVar != null) {
            fVar.k();
        }
        this.f63237e0 = false;
        this.f63251m0 = false;
    }

    @Override // androidx.media3.exoplayer.audio.x
    public int s(androidx.media3.common.w wVar) {
        h0();
        if (!"audio/raw".equals(wVar.f61761o)) {
            return this.F.o(wVar, this.I) ? 2 : 0;
        }
        if (k1.h1(wVar.G)) {
            int i10 = wVar.G;
            return (i10 == 2 || (this.f63244j && i10 == 4)) ? 2 : 1;
        }
        androidx.media3.common.util.z.n(G0, "Invalid PCM encoding: " + wVar.G);
        return 0;
    }

    @Override // androidx.media3.exoplayer.audio.x
    @androidx.annotation.w0(23)
    public void setPreferredDevice(@androidx.annotation.p0 AudioDeviceInfo audioDeviceInfo) {
        androidx.media3.exoplayer.audio.i iVar;
        if (audioDeviceInfo == null) {
            iVar = null;
            int i10 = 5 << 0;
        } else {
            iVar = new androidx.media3.exoplayer.audio.i(audioDeviceInfo);
        }
        this.f63243i0 = iVar;
        androidx.media3.exoplayer.audio.h hVar = this.G;
        if (hVar != null) {
            hVar.i(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.E;
        if (audioTrack != null) {
            b.a(audioTrack, this.f63243i0);
        }
    }

    @Override // androidx.media3.exoplayer.audio.x
    public void t(androidx.media3.common.f fVar) {
        if (this.f63241h0.equals(fVar)) {
            return;
        }
        int i10 = fVar.f60595a;
        float f10 = fVar.f60596b;
        AudioTrack audioTrack = this.E;
        if (audioTrack != null) {
            if (this.f63241h0.f60595a != i10) {
                audioTrack.attachAuxEffect(i10);
            }
            if (i10 != 0) {
                this.E.setAuxEffectSendLevel(f10);
            }
        }
        this.f63241h0 = fVar;
    }

    @Override // androidx.media3.exoplayer.audio.x
    public void t0(boolean z10) {
        this.M = z10;
        o0(w0() ? y0.f61871d : this.L);
    }

    @Override // androidx.media3.exoplayer.audio.x
    public void u(androidx.media3.common.util.j jVar) {
        this.f63254o.v(jVar);
    }

    @Override // androidx.media3.exoplayer.audio.x
    public androidx.media3.exoplayer.audio.j v(androidx.media3.common.w wVar) {
        return this.f63251m0 ? androidx.media3.exoplayer.audio.j.f63218d : this.f63266w.a(wVar, this.I);
    }

    @Override // androidx.media3.exoplayer.audio.x
    public boolean w(ByteBuffer byteBuffer, long j10, int i10) throws Exception {
        ByteBuffer byteBuffer2 = this.Y;
        androidx.media3.common.util.a.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.B != null) {
            if (!T()) {
                return false;
            }
            if (this.B.b(this.C)) {
                this.C = this.B;
                this.B = null;
                AudioTrack audioTrack = this.E;
                if (audioTrack != null && d0(audioTrack) && this.C.f63292k) {
                    if (this.E.getPlayState() == 3) {
                        this.E.setOffloadEndOfStream();
                        this.f63254o.a();
                    }
                    AudioTrack audioTrack2 = this.E;
                    androidx.media3.common.w wVar = this.C.f63282a;
                    audioTrack2.setOffloadDelayPadding(wVar.H, wVar.I);
                    this.f63253n0 = true;
                }
            } else {
                j0();
                if (j()) {
                    return false;
                }
                flush();
            }
            M(j10);
        }
        if (!c0()) {
            try {
                if (!a0()) {
                    return false;
                }
            } catch (x.c e10) {
                if (e10.f63447b) {
                    throw e10;
                }
                this.f63263t.c(e10);
                return false;
            }
        }
        this.f63263t.a();
        if (this.V) {
            this.W = Math.max(0L, j10);
            this.U = false;
            this.V = false;
            if (w0()) {
                p0();
            }
            M(j10);
            if (this.f63237e0) {
                B();
            }
        }
        if (!this.f63254o.l(X())) {
            return false;
        }
        if (this.Y == null) {
            androidx.media3.common.util.a.a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            i iVar = this.C;
            if (iVar.f63284c != 0 && this.T == 0) {
                int iV = V(iVar.f63288g, byteBuffer);
                this.T = iV;
                if (iV == 0) {
                    return true;
                }
            }
            if (this.J != null) {
                if (!T()) {
                    return false;
                }
                M(j10);
                this.J = null;
            }
            long jE = this.W + this.C.e(W() - this.f63248l.m());
            if (!this.U && Math.abs(jE - j10) > 200000) {
                x.d dVar = this.A;
                if (dVar != null) {
                    dVar.h(new x.g(j10, jE));
                }
                this.U = true;
            }
            if (this.U) {
                if (!T()) {
                    return false;
                }
                long j11 = j10 - jE;
                this.W += j11;
                this.U = false;
                M(j10);
                x.d dVar2 = this.A;
                if (dVar2 != null && j11 != 0) {
                    dVar2.c();
                }
            }
            if (this.C.f63284c == 0) {
                this.P += (long) byteBuffer.remaining();
            } else {
                this.Q += ((long) this.T) * ((long) i10);
            }
            this.Y = byteBuffer;
            this.Z = i10;
        }
        k0(j10);
        if (!this.Y.hasRemaining()) {
            this.Y = null;
            this.Z = 0;
            return true;
        }
        if (!this.f63254o.k(X())) {
            return false;
        }
        androidx.media3.common.util.z.n(G0, "Resetting stalled audio track");
        flush();
        return true;
    }

    @Override // androidx.media3.exoplayer.audio.x
    @androidx.annotation.w0(29)
    public void x(int i10, int i11) {
        i iVar;
        AudioTrack audioTrack = this.E;
        if (audioTrack == null || !d0(audioTrack) || (iVar = this.C) == null || !iVar.f63292k) {
            return;
        }
        this.E.setOffloadDelayPadding(i10, i11);
    }

    @Override // androidx.media3.exoplayer.audio.x
    public void y(@androidx.annotation.p0 j4 j4Var) {
        this.f63269z = j4Var;
    }

    @il.m({"#1.audioProcessorChain"})
    private j0(h hVar) {
        Context context = hVar.f63272a;
        this.f63240h = context;
        this.I = androidx.media3.common.d.f60472g;
        this.F = context != null ? null : hVar.f63273b;
        this.f63242i = hVar.f63274c;
        this.f63244j = hVar.f63275d;
        this.f63258q = k1.f61540a >= 23 && hVar.f63276e;
        this.f63260r = 0;
        this.f63265v = hVar.f63278g;
        this.f63266w = (d) androidx.media3.common.util.a.g(hVar.f63280i);
        this.f63254o = new z(new p());
        b0 b0Var = new b0();
        this.f63246k = b0Var;
        v0 v0Var = new v0();
        this.f63248l = v0Var;
        this.f63250m = l6.K(new androidx.media3.common.audio.q(), b0Var, v0Var);
        this.f63252n = l6.K(new u0(), b0Var, v0Var);
        this.X = 1.0f;
        this.f63239g0 = 0;
        this.f63241h0 = new androidx.media3.common.f(0, 0.0f);
        y0 y0Var = y0.f61871d;
        this.K = new l(y0Var, 0L, 0L);
        this.L = y0Var;
        this.M = false;
        this.f63256p = new ArrayDeque<>();
        this.f63263t = new o<>();
        this.f63264u = new o<>();
        this.f63267x = hVar.f63281j;
        this.f63268y = hVar.f63279h;
    }

    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.p0
        private final Context f63272a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private androidx.media3.exoplayer.audio.e f63273b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        private androidx.media3.common.audio.h f63274c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f63275d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f63276e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f63277f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private f f63278g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private g f63279h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private d f63280i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @androidx.annotation.p0
        private ExoPlayer.a f63281j;

        @Deprecated
        public h() {
            this.f63272a = null;
            this.f63273b = androidx.media3.exoplayer.audio.e.f63183e;
            this.f63278g = f.f63270a;
            this.f63279h = g.f63271a;
        }

        public j0 j() {
            androidx.media3.common.util.a.i(!this.f63277f);
            this.f63277f = true;
            if (this.f63274c == null) {
                this.f63274c = new j(new androidx.media3.common.audio.g[0]);
            }
            if (this.f63280i == null) {
                this.f63280i = new d0(this.f63272a);
            }
            return new j0(this);
        }

        @z7.a
        @Deprecated
        public h k(androidx.media3.exoplayer.audio.e eVar) {
            androidx.media3.common.util.a.g(eVar);
            this.f63273b = eVar;
            return this;
        }

        @z7.a
        public h l(d dVar) {
            this.f63280i = dVar;
            return this;
        }

        @z7.a
        public h m(androidx.media3.common.audio.h hVar) {
            androidx.media3.common.util.a.g(hVar);
            this.f63274c = hVar;
            return this;
        }

        @z7.a
        public h n(androidx.media3.common.audio.g[] gVarArr) {
            androidx.media3.common.util.a.g(gVarArr);
            return m(new j(gVarArr));
        }

        @z7.a
        public h o(f fVar) {
            this.f63278g = fVar;
            return this;
        }

        @z7.a
        public h p(g gVar) {
            this.f63279h = gVar;
            return this;
        }

        @z7.a
        public h q(boolean z10) {
            this.f63276e = z10;
            return this;
        }

        @z7.a
        public h r(boolean z10) {
            this.f63275d = z10;
            return this;
        }

        @z7.a
        public h s(@androidx.annotation.p0 ExoPlayer.a aVar) {
            this.f63281j = aVar;
            return this;
        }

        public h(Context context) {
            this.f63272a = context;
            this.f63273b = androidx.media3.exoplayer.audio.e.f63183e;
            this.f63278g = f.f63270a;
            this.f63279h = g.f63271a;
        }
    }
}
