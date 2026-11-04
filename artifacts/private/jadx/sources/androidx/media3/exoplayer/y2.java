package androidx.media3.exoplayer;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioDeviceInfo;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.exoplayer.image.ImageOutput;
import com.google.common.collect.l6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
final class y2 extends androidx.media3.common.g implements ExoPlayer {
    private static final String C2 = "ExoPlayerImpl";
    private final c A1;
    private int A2;
    private final d B1;
    private long B2;
    private final androidx.media3.exoplayer.e C1;

    @androidx.annotation.p0
    private final w5 D1;
    private final b6 E1;
    private final e6 F1;
    private final long G1;

    @androidx.annotation.p0
    private final y5 H1;
    private final androidx.media3.common.util.g<Integer> I1;
    private int J1;
    private boolean K1;
    private int L1;
    private int M1;
    private boolean N1;
    private boolean O1;
    private f5 P1;
    private androidx.media3.exoplayer.source.u1 Q1;
    private ExoPlayer.c R1;
    private boolean S1;
    private androidx.media3.common.z0.c T1;
    private androidx.media3.common.q0 U1;
    private androidx.media3.common.q0 V1;

    @androidx.annotation.p0
    private androidx.media3.common.w W1;

    @androidx.annotation.p0
    private androidx.media3.common.w X1;

    @androidx.annotation.p0
    private Object Y1;

    @androidx.annotation.p0
    private Surface Z1;

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    @androidx.annotation.p0
    private SurfaceHolder f66695a2;

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    @androidx.annotation.p0
    private androidx.media3.exoplayer.video.spherical.l f66696b2;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    final androidx.media3.exoplayer.trackselection.l0 f66697c1;

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    private boolean f66698c2;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    final androidx.media3.common.z0.c f66699d1;

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    @androidx.annotation.p0
    private TextureView f66700d2;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private final androidx.media3.common.util.m f66701e1 = new androidx.media3.common.util.m();

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    private int f66702e2;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private final Context f66703f1;

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    private int f66704f2;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private final androidx.media3.common.z0 f66705g1;

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    private androidx.media3.common.util.r0 f66706g2;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private final z4[] f66707h1;

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    @androidx.annotation.p0
    private j f66708h2;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private final z4[] f66709i1;

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    @androidx.annotation.p0
    private j f66710i2;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    private final androidx.media3.exoplayer.trackselection.k0 f66711j1;

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    private androidx.media3.common.d f66712j2;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    private final androidx.media3.common.util.u f66713k1;

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    private float f66714k2;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    private final n3.f f66715l1;

    /* JADX INFO: renamed from: l2, reason: collision with root package name */
    private boolean f66716l2;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    private final n3 f66717m1;

    /* JADX INFO: renamed from: m2, reason: collision with root package name */
    private androidx.media3.common.text.d f66718m2;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    private final androidx.media3.common.util.y<androidx.media3.common.z0.g> f66719n1;

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    @androidx.annotation.p0
    private androidx.media3.exoplayer.video.w f66720n2;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    private final CopyOnWriteArraySet<ExoPlayer.a> f66721o1;

    /* JADX INFO: renamed from: o2, reason: collision with root package name */
    @androidx.annotation.p0
    private androidx.media3.exoplayer.video.spherical.a f66722o2;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private final androidx.media3.common.z3.b f66723p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private boolean f66724p2;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    private final List<e> f66725q1;

    /* JADX INFO: renamed from: q2, reason: collision with root package name */
    private boolean f66726q2;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    private final boolean f66727r1;

    /* JADX INFO: renamed from: r2, reason: collision with root package name */
    private int f66728r2;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    private final androidx.media3.exoplayer.source.t0.a f66729s1;

    /* JADX INFO: renamed from: s2, reason: collision with root package name */
    @androidx.annotation.p0
    private androidx.media3.common.b1 f66730s2;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    private final androidx.media3.exoplayer.analytics.a f66731t1;

    /* JADX INFO: renamed from: t2, reason: collision with root package name */
    private boolean f66732t2;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    private final Looper f66733u1;

    /* JADX INFO: renamed from: u2, reason: collision with root package name */
    private boolean f66734u2;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.d f66735v1;

    /* JADX INFO: renamed from: v2, reason: collision with root package name */
    private androidx.media3.common.o f66736v2;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    private final long f66737w1;

    /* JADX INFO: renamed from: w2, reason: collision with root package name */
    private androidx.media3.common.n4 f66738w2;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private final long f66739x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private androidx.media3.common.q0 f66740x2;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private final long f66741y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private u4 f66742y2;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    private final androidx.media3.common.util.j f66743z1;

    /* JADX INFO: renamed from: z2, reason: collision with root package name */
    private int f66744z2;

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.w0(31)
    static final class b {
        private b() {
        }

        public static /* synthetic */ void a(Context context, boolean z10, y2 y2Var, androidx.media3.exoplayer.analytics.j4 j4Var) {
            androidx.media3.exoplayer.analytics.f4 f4VarJ0 = androidx.media3.exoplayer.analytics.f4.J0(context);
            if (f4VarJ0 == null) {
                androidx.media3.common.util.z.n(y2.C2, "MediaMetricsService unavailable.");
                return;
            }
            if (z10) {
                y2Var.W1(f4VarJ0);
            }
            j4Var.b(f4VarJ0.Q0());
        }

        public static void b(final Context context, final y2 y2Var, final boolean z10, final androidx.media3.exoplayer.analytics.j4 j4Var) {
            y2Var.x0().d(y2Var.p0(), null).g(new Runnable() { // from class: androidx.media3.exoplayer.z2
                @Override // java.lang.Runnable
                public final void run() {
                    y2.b.a(context, z10, y2Var, j4Var);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class c implements androidx.media3.exoplayer.video.l0, androidx.media3.exoplayer.audio.w, androidx.media3.exoplayer.text.h, androidx.media3.exoplayer.metadata.b, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, androidx.media3.exoplayer.video.spherical.l.b, androidx.media3.exoplayer.e.b, w5.b, ExoPlayer.a {
        private c() {
        }

        @Override // androidx.media3.exoplayer.video.l0
        public void D(Object obj, long j10) {
            y2.this.f66731t1.D(obj, j10);
            if (y2.this.Y1 == obj) {
                y2.this.f66719n1.l(26, new androidx.media3.common.o1());
            }
        }

        @Override // androidx.media3.exoplayer.text.h
        public void E(final androidx.media3.common.text.d dVar) {
            y2.this.f66718m2 = dVar;
            y2.this.f66719n1.l(27, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.a3
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    ((androidx.media3.common.z0.g) obj).E(dVar);
                }
            });
        }

        @Override // androidx.media3.exoplayer.metadata.b
        public void F(final androidx.media3.common.r0 r0Var) {
            y2 y2Var = y2.this;
            y2Var.f66740x2 = y2Var.f66740x2.a().M(r0Var).J();
            androidx.media3.common.q0 q0VarO3 = y2.this.O3();
            if (!q0VarO3.equals(y2.this.U1)) {
                y2.this.U1 = q0VarO3;
                y2.this.f66719n1.i(14, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.b3
                    @Override // androidx.media3.common.util.y.a
                    public final void invoke(Object obj) {
                        ((androidx.media3.common.z0.g) obj).N(y2.this.U1);
                    }
                });
            }
            y2.this.f66719n1.i(28, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.c3
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    ((androidx.media3.common.z0.g) obj).F(r0Var);
                }
            });
            y2.this.f66719n1.g();
        }

        @Override // androidx.media3.exoplayer.video.l0
        public void G(androidx.media3.common.w wVar, @androidx.annotation.p0 k kVar) {
            y2.this.W1 = wVar;
            y2.this.f66731t1.G(wVar, kVar);
        }

        @Override // androidx.media3.exoplayer.video.l0
        public void H(j jVar) {
            y2.this.f66731t1.H(jVar);
            y2.this.W1 = null;
            y2.this.f66708h2 = null;
        }

        @Override // androidx.media3.exoplayer.audio.w
        public void I(int i10, long j10, long j11) {
            y2.this.f66731t1.I(i10, j10, j11);
        }

        @Override // androidx.media3.exoplayer.video.l0
        public void a(final androidx.media3.common.n4 n4Var) {
            y2.this.f66738w2 = n4Var;
            y2.this.f66719n1.l(25, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.f3
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    ((androidx.media3.common.z0.g) obj).a(n4Var);
                }
            });
        }

        @Override // androidx.media3.exoplayer.audio.w
        public void b(String str, long j10, long j11) {
            y2.this.f66731t1.b(str, j10, j11);
        }

        @Override // androidx.media3.exoplayer.video.l0
        public void c(int i10, long j10) {
            y2.this.f66731t1.c(i10, j10);
        }

        @Override // androidx.media3.exoplayer.video.l0
        public void d(String str, long j10, long j11) {
            y2.this.f66731t1.d(str, j10, j11);
        }

        @Override // androidx.media3.exoplayer.audio.w
        public void e(androidx.media3.exoplayer.audio.x.a aVar) {
            y2.this.f66731t1.e(aVar);
        }

        @Override // androidx.media3.exoplayer.audio.w
        public void f(androidx.media3.exoplayer.audio.x.a aVar) {
            y2.this.f66731t1.f(aVar);
        }

        @Override // androidx.media3.exoplayer.audio.w
        public void g(final boolean z10) {
            if (y2.this.f66716l2 == z10) {
                return;
            }
            y2.this.f66716l2 = z10;
            y2.this.f66719n1.l(23, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.d3
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    ((androidx.media3.common.z0.g) obj).g(z10);
                }
            });
        }

        @Override // androidx.media3.exoplayer.audio.w
        public void h(Exception exc) {
            y2.this.f66731t1.h(exc);
        }

        @Override // androidx.media3.exoplayer.text.h
        public void i(final List<androidx.media3.common.text.a> list) {
            y2.this.f66719n1.l(27, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.e3
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    ((androidx.media3.common.z0.g) obj).i(list);
                }
            });
        }

        @Override // androidx.media3.exoplayer.e.b
        public void j() {
            y2.this.y4(false, 3);
        }

        @Override // androidx.media3.exoplayer.video.l0
        public void k(String str) {
            y2.this.f66731t1.k(str);
        }

        @Override // androidx.media3.exoplayer.audio.w
        public void m(String str) {
            y2.this.f66731t1.m(str);
        }

        @Override // androidx.media3.exoplayer.ExoPlayer.a
        public void n(boolean z10) {
            y2.this.B4();
        }

        @Override // androidx.media3.exoplayer.audio.w
        public void o(j jVar) {
            y2.this.f66710i2 = jVar;
            y2.this.f66731t1.o(jVar);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            y2.this.s4(surfaceTexture);
            y2.this.h4(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            y2.this.u4(null);
            y2.this.h4(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            y2.this.h4(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // androidx.media3.exoplayer.video.l0
        public void p(j jVar) {
            y2.this.f66708h2 = jVar;
            y2.this.f66731t1.p(jVar);
        }

        @Override // androidx.media3.exoplayer.audio.w
        public void q(androidx.media3.common.w wVar, @androidx.annotation.p0 k kVar) {
            y2.this.X1 = wVar;
            y2.this.f66731t1.q(wVar, kVar);
        }

        @Override // androidx.media3.exoplayer.audio.w
        public void r(j jVar) {
            y2.this.f66731t1.r(jVar);
            y2.this.X1 = null;
            y2.this.f66710i2 = null;
        }

        @Override // androidx.media3.exoplayer.audio.w
        public void s(Exception exc) {
            y2.this.f66731t1.s(exc);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            y2.this.h4(i11, i12);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (y2.this.f66698c2) {
                y2.this.u4(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (y2.this.f66698c2) {
                y2.this.u4(null);
            }
            y2.this.h4(0, 0);
        }

        @Override // androidx.media3.exoplayer.video.l0
        public void t(long j10, int i10) {
            y2.this.f66731t1.t(j10, i10);
        }

        @Override // androidx.media3.exoplayer.w5.b
        public void u(int i10) {
            final androidx.media3.common.o oVarR3 = y2.R3(y2.this.D1);
            if (!oVarR3.equals(y2.this.f66736v2)) {
                y2.this.f66736v2 = oVarR3;
                y2.this.f66719n1.l(29, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.g3
                    @Override // androidx.media3.common.util.y.a
                    public final void invoke(Object obj) {
                        ((androidx.media3.common.z0.g) obj).Y(oVarR3);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.video.spherical.l.b
        public void v(Surface surface) {
            y2.this.u4(null);
        }

        @Override // androidx.media3.exoplayer.audio.w
        public void w(long j10) {
            y2.this.f66731t1.w(j10);
        }

        @Override // androidx.media3.exoplayer.video.spherical.l.b
        public void x(Surface surface) {
            y2.this.u4(surface);
        }

        @Override // androidx.media3.exoplayer.video.l0
        public void y(Exception exc) {
            y2.this.f66731t1.y(exc);
        }

        @Override // androidx.media3.exoplayer.w5.b
        public void z(final int i10, final boolean z10) {
            y2.this.f66719n1.l(30, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.h3
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    ((androidx.media3.common.z0.g) obj).M(i10, z10);
                }
            });
        }
    }

    private static final class d implements androidx.media3.exoplayer.video.w, androidx.media3.exoplayer.video.spherical.a, w4.b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f66746e = 7;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f66747f = 8;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f66748g = 10000;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.p0
        private androidx.media3.exoplayer.video.w f66749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        private androidx.media3.exoplayer.video.spherical.a f66750b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        private androidx.media3.exoplayer.video.w f66751c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        private androidx.media3.exoplayer.video.spherical.a f66752d;

        private d() {
        }

        @Override // androidx.media3.exoplayer.video.spherical.a
        public void b(long j10, float[] fArr) {
            androidx.media3.exoplayer.video.spherical.a aVar = this.f66752d;
            if (aVar != null) {
                aVar.b(j10, fArr);
            }
            androidx.media3.exoplayer.video.spherical.a aVar2 = this.f66750b;
            if (aVar2 != null) {
                aVar2.b(j10, fArr);
            }
        }

        @Override // androidx.media3.exoplayer.video.spherical.a
        public void c() {
            androidx.media3.exoplayer.video.spherical.a aVar = this.f66752d;
            if (aVar != null) {
                aVar.c();
            }
            androidx.media3.exoplayer.video.spherical.a aVar2 = this.f66750b;
            if (aVar2 != null) {
                aVar2.c();
            }
        }

        @Override // androidx.media3.exoplayer.video.w
        public void h(long j10, long j11, androidx.media3.common.w wVar, @androidx.annotation.p0 MediaFormat mediaFormat) {
            androidx.media3.exoplayer.video.w wVar2 = this.f66751c;
            if (wVar2 != null) {
                wVar2.h(j10, j11, wVar, mediaFormat);
            }
            androidx.media3.exoplayer.video.w wVar3 = this.f66749a;
            if (wVar3 != null) {
                wVar3.h(j10, j11, wVar, mediaFormat);
            }
        }

        @Override // androidx.media3.exoplayer.w4.b
        public void i(int i10, @androidx.annotation.p0 Object obj) {
            if (i10 == 7) {
                this.f66749a = (androidx.media3.exoplayer.video.w) obj;
                return;
            }
            if (i10 == 8) {
                this.f66750b = (androidx.media3.exoplayer.video.spherical.a) obj;
                return;
            }
            if (i10 != 10000) {
                return;
            }
            androidx.media3.exoplayer.video.spherical.l lVar = (androidx.media3.exoplayer.video.spherical.l) obj;
            if (lVar == null) {
                this.f66751c = null;
                this.f66752d = null;
            } else {
                this.f66751c = lVar.getVideoFrameMetadataListener();
                this.f66752d = lVar.getCameraMotionListener();
            }
        }
    }

    private static final class e implements d4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f66753a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.media3.exoplayer.source.t0 f66754b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private androidx.media3.common.z3 f66755c;

        public e(Object obj, androidx.media3.exoplayer.source.g0 g0Var) {
            this.f66753a = obj;
            this.f66754b = g0Var;
            this.f66755c = g0Var.T0();
        }

        @Override // androidx.media3.exoplayer.d4
        public Object a() {
            return this.f66753a;
        }

        @Override // androidx.media3.exoplayer.d4
        public androidx.media3.common.z3 b() {
            return this.f66755c;
        }

        public void d(androidx.media3.common.z3 z3Var) {
            this.f66755c = z3Var;
        }
    }

    static {
        androidx.media3.common.p0.a("media3.exoplayer");
    }

    @e.a({"HandlerLeak"})
    public y2(ExoPlayer.b bVar, @androidx.annotation.p0 androidx.media3.common.z0 z0Var) {
        androidx.media3.common.util.j jVar;
        try {
            androidx.media3.common.util.z.h(C2, "Init " + Integer.toHexString(System.identityHashCode(this)) + " [" + androidx.media3.common.p0.f61021c + "] [" + androidx.media3.common.util.k1.f61544e + "]");
            this.f66703f1 = bVar.f62744a.getApplicationContext();
            this.f66731t1 = bVar.f62752i.apply(bVar.f62745b);
            this.f66728r2 = bVar.f62754k;
            this.f66730s2 = bVar.f62755l;
            this.f66712j2 = bVar.f62756m;
            this.f66702e2 = bVar.f62762s;
            this.f66704f2 = bVar.f62763t;
            this.f66716l2 = bVar.f62760q;
            this.G1 = bVar.B;
            c cVar = new c();
            this.A1 = cVar;
            this.B1 = new d();
            Handler handler = new Handler(bVar.f62753j);
            e5 e5Var = bVar.f62747d.get();
            z4[] z4VarArrB = e5Var.b(handler, cVar, cVar, cVar, cVar);
            this.f66707h1 = z4VarArrB;
            androidx.media3.common.util.a.i(z4VarArrB.length > 0);
            this.f66709i1 = new z4[z4VarArrB.length];
            int i10 = 0;
            while (true) {
                z4[] z4VarArr = this.f66709i1;
                if (i10 >= z4VarArr.length) {
                    break;
                }
                z4 z4Var = this.f66707h1[i10];
                c cVar2 = this.A1;
                e5 e5Var2 = e5Var;
                z4VarArr[i10] = e5Var2.a(z4Var, handler, cVar2, cVar2, cVar2, cVar2);
                i10++;
                e5Var = e5Var2;
            }
            androidx.media3.exoplayer.trackselection.k0 k0Var = bVar.f62749f.get();
            this.f66711j1 = k0Var;
            this.f66729s1 = bVar.f62748e.get();
            androidx.media3.exoplayer.upstream.d dVar = bVar.f62751h.get();
            this.f66735v1 = dVar;
            this.f66727r1 = bVar.f62764u;
            this.P1 = bVar.f62765v;
            this.f66737w1 = bVar.f62766w;
            this.f66739x1 = bVar.f62767x;
            this.f66741y1 = bVar.f62768y;
            this.S1 = bVar.C;
            Looper looper = bVar.f62753j;
            this.f66733u1 = looper;
            androidx.media3.common.util.j jVar2 = bVar.f62745b;
            this.f66743z1 = jVar2;
            androidx.media3.common.z0 z0Var2 = z0Var == null ? this : z0Var;
            this.f66705g1 = z0Var2;
            this.f66719n1 = new androidx.media3.common.util.y<>(looper, jVar2, new androidx.media3.common.util.y.b() { // from class: androidx.media3.exoplayer.h2
                @Override // androidx.media3.common.util.y.b
                public final void a(Object obj, androidx.media3.common.s sVar) {
                    ((androidx.media3.common.z0.g) obj).S(this.f63827a.f66705g1, new androidx.media3.common.z0.f(sVar));
                }
            });
            this.f66721o1 = new CopyOnWriteArraySet<>();
            this.f66725q1 = new ArrayList();
            this.Q1 = new androidx.media3.exoplayer.source.u1.a(0);
            this.R1 = ExoPlayer.c.f62770b;
            z4[] z4VarArr2 = this.f66707h1;
            androidx.media3.exoplayer.trackselection.l0 l0Var = new androidx.media3.exoplayer.trackselection.l0(new c5[z4VarArr2.length], new androidx.media3.exoplayer.trackselection.c0[z4VarArr2.length], androidx.media3.common.i4.f60639b, null);
            this.f66697c1 = l0Var;
            this.f66723p1 = new androidx.media3.common.z3.b();
            androidx.media3.common.z0.c cVarF = new androidx.media3.common.z0.c.a().c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32).e(29, k0Var.h()).e(23, bVar.f62761r).e(25, bVar.f62761r).e(33, bVar.f62761r).e(26, bVar.f62761r).e(34, bVar.f62761r).f();
            this.f66699d1 = cVarF;
            this.T1 = new androidx.media3.common.z0.c.a().b(cVarF).a(4).a(10).f();
            this.f66713k1 = jVar2.d(looper, null);
            n3.f fVar = new n3.f() { // from class: androidx.media3.exoplayer.i2
                @Override // androidx.media3.exoplayer.n3.f
                public final void a(n3.e eVar) {
                    y2 y2Var = this.f63859a;
                    y2Var.f66713k1.g(new Runnable() { // from class: androidx.media3.exoplayer.d2
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f63550a.d4(eVar);
                        }
                    });
                }
            };
            this.f66715l1 = fVar;
            this.f66742y2 = u4.k(l0Var);
            this.f66731t1.c0(z0Var2, looper);
            androidx.media3.exoplayer.analytics.j4 j4Var = new androidx.media3.exoplayer.analytics.j4(bVar.H);
            n3 n3Var = new n3(this.f66703f1, this.f66707h1, this.f66709i1, k0Var, l0Var, bVar.f62750g.get(), dVar, this.J1, this.K1, this.f66731t1, this.P1, bVar.f62769z, bVar.A, this.S1, bVar.I, looper, jVar2, fVar, j4Var, bVar.E, this.R1);
            this.f66717m1 = n3Var;
            Looper looperL = n3Var.L();
            this.f66714k2 = 1.0f;
            this.J1 = 0;
            androidx.media3.common.q0 q0Var = androidx.media3.common.q0.X0;
            this.U1 = q0Var;
            this.V1 = q0Var;
            this.f66740x2 = q0Var;
            this.f66744z2 = -1;
            this.f66718m2 = androidx.media3.common.text.d.f61409c;
            this.f66724p2 = true;
            U1(this.f66731t1);
            dVar.d(new Handler(looper), this.f66731t1);
            C0(this.A1);
            long j10 = bVar.f62746c;
            if (j10 > 0) {
                n3Var.F(j10);
            }
            if (androidx.media3.common.util.k1.f61540a >= 31) {
                b.b(this.f66703f1, this, bVar.D, j4Var);
            }
            androidx.media3.common.util.g<Integer> gVar = new androidx.media3.common.util.g<>(0, looperL, looper, jVar2, new androidx.media3.common.util.g.a() { // from class: androidx.media3.exoplayer.j2
                @Override // androidx.media3.common.util.g.a
                public final void a(Object obj, Object obj2) {
                    this.f63921a.i4(((Integer) obj).intValue(), ((Integer) obj2).intValue());
                }
            });
            this.I1 = gVar;
            gVar.e(new Runnable() { // from class: androidx.media3.exoplayer.k2
                @Override // java.lang.Runnable
                public final void run() {
                    y2 y2Var = this.f63952a;
                    y2Var.I1.f(Integer.valueOf(androidx.media3.common.util.k1.V(y2Var.f66703f1)));
                }
            });
            androidx.media3.exoplayer.e eVar = new androidx.media3.exoplayer.e(bVar.f62744a, looperL, bVar.f62753j, this.A1, jVar2);
            androidx.media3.common.util.j jVar3 = jVar2;
            this.C1 = eVar;
            eVar.d(bVar.f62759p);
            if (bVar.G) {
                y5 y5Var = bVar.J;
                this.H1 = y5Var;
                y5Var.b(new y5.a() { // from class: androidx.media3.exoplayer.l2
                    @Override // androidx.media3.exoplayer.y5.a
                    public final void a(boolean z10) {
                        this.f63992a.j4(z10);
                    }
                }, this.f66703f1, looper, looperL, jVar3);
                jVar3 = jVar3;
            } else {
                this.H1 = null;
            }
            if (bVar.f62761r) {
                androidx.media3.common.util.j jVar4 = jVar3;
                w5 w5Var = new w5(bVar.f62744a, this.A1, this.f66712j2.c(), looperL, looper, jVar4);
                jVar = jVar4;
                this.D1 = w5Var;
            } else {
                jVar = jVar3;
                this.D1 = null;
            }
            b6 b6Var = new b6(bVar.f62744a, r10, jVar);
            this.E1 = b6Var;
            b6Var.c(bVar.f62758o != 0);
            e6 e6Var = new e6(bVar.f62744a, looperL, jVar);
            this.F1 = e6Var;
            e6Var.c(bVar.f62758o == 2);
            this.f66736v2 = androidx.media3.common.o.f61003g;
            this.f66738w2 = androidx.media3.common.n4.f60993h;
            this.f66706g2 = androidx.media3.common.util.r0.f61638c;
            n3Var.c1(this.f66712j2, bVar.f62757n);
            o4(1, 3, this.f66712j2);
            o4(2, 4, Integer.valueOf(this.f66702e2));
            o4(2, 5, Integer.valueOf(this.f66704f2));
            o4(1, 9, Boolean.valueOf(this.f66716l2));
            o4(2, 7, this.B1);
            o4(6, 8, this.B1);
            p4(16, Integer.valueOf(this.f66728r2));
        } finally {
            this.f66701e1.f();
        }
    }

    private void A4(boolean z10) {
        androidx.media3.common.b1 b1Var = this.f66730s2;
        if (b1Var != null) {
            if (z10 && !this.f66732t2) {
                b1Var.a(this.f66728r2);
                int i10 = 4 ^ 1;
                this.f66732t2 = true;
            } else if (!z10 && this.f66732t2) {
                b1Var.e(this.f66728r2);
                this.f66732t2 = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B4() {
        int iH = H();
        boolean z10 = false;
        if (iH != 1) {
            if (iH == 2 || iH == 3) {
                boolean zS1 = s1();
                b6 b6Var = this.E1;
                if (J() && !zS1) {
                    z10 = true;
                }
                b6Var.d(z10);
                this.F1.d(J());
                return;
            }
            if (iH != 4) {
                throw new IllegalStateException();
            }
        }
        this.E1.d(false);
        this.F1.d(false);
    }

    private void C4() {
        this.f66701e1.c();
        if (Thread.currentThread() != d0().getThread()) {
            String strS = androidx.media3.common.util.k1.S("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), d0().getThread().getName());
            if (this.f66724p2) {
                throw new IllegalStateException(strS);
            }
            androidx.media3.common.util.z.o(C2, strS, this.f66726q2 ? null : new IllegalStateException());
            this.f66726q2 = true;
        }
    }

    public static /* synthetic */ void G2(u4 u4Var, androidx.media3.common.z0.g gVar) {
        gVar.j(u4Var.f65823g);
        gVar.q0(u4Var.f65823g);
    }

    private List<r4.c> M3(int i10, List<androidx.media3.exoplayer.source.t0> list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            r4.c cVar = new r4.c(list.get(i11), this.f66727r1);
            arrayList.add(cVar);
            this.f66725q1.add(i11 + i10, new e(cVar.f64654b, cVar.f64653a));
        }
        this.Q1 = this.Q1.g(i10, arrayList.size());
        return arrayList;
    }

    private u4 N3(u4 u4Var, int i10, List<androidx.media3.exoplayer.source.t0> list) {
        androidx.media3.common.z3 z3Var = u4Var.f65817a;
        this.L1++;
        List<r4.c> listM3 = M3(i10, list);
        androidx.media3.common.z3 z3VarS3 = S3();
        u4 u4VarF4 = f4(u4Var, z3VarS3, Z3(z3Var, z3VarS3, Y3(u4Var), W3(u4Var)));
        this.f66717m1.r(i10, listM3, this.Q1);
        return u4VarF4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public androidx.media3.common.q0 O3() {
        androidx.media3.common.z3 z3VarC0 = c0();
        if (z3VarC0.w()) {
            return this.f66740x2;
        }
        return this.f66740x2.a().L(z3VarC0.t(l0(), this.f60604b1).f61990c.f60825e).J();
    }

    public static /* synthetic */ Integer P2(y2 y2Var, int i10, Integer num) {
        if (i10 != 0) {
            y2Var.getClass();
        } else {
            i10 = androidx.media3.common.util.k1.V(y2Var.f66703f1);
        }
        return Integer.valueOf(i10);
    }

    private boolean P3(int i10, int i11, List<androidx.media3.common.k0> list) {
        if (i11 - i10 != list.size()) {
            return false;
        }
        for (int i12 = i10; i12 < i11; i12++) {
            if (!this.f66725q1.get(i12).f66754b.O(list.get(i12 - i10))) {
                return false;
            }
        }
        return true;
    }

    private int Q3(boolean z10) {
        y5 y5Var = this.H1;
        if (y5Var == null || y5Var.a()) {
            return (this.f66742y2.f65830n != 1 || z10) ? 0 : 1;
        }
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static androidx.media3.common.o R3(@androidx.annotation.p0 w5 w5Var) {
        return new androidx.media3.common.o.b(0).g(w5Var != null ? w5Var.u() : 0).f(w5Var != null ? w5Var.t() : 0).e();
    }

    private androidx.media3.common.z3 S3() {
        return new x4(this.f66725q1, this.Q1);
    }

    private List<androidx.media3.exoplayer.source.t0> T3(List<androidx.media3.common.k0> list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(this.f66729s1.h(list.get(i10)));
        }
        return arrayList;
    }

    private w4 U3(w4.b bVar) {
        int iY3 = Y3(this.f66742y2);
        n3 n3Var = this.f66717m1;
        androidx.media3.common.z3 z3Var = this.f66742y2.f65817a;
        if (iY3 == -1) {
            iY3 = 0;
        }
        return new w4(n3Var, bVar, z3Var, iY3, this.f66743z1, n3Var.L());
    }

    private Pair<Boolean, Integer> V3(u4 u4Var, u4 u4Var2, boolean z10, int i10, boolean z11, boolean z12) {
        androidx.media3.common.z3 z3Var = u4Var2.f65817a;
        androidx.media3.common.z3 z3Var2 = u4Var.f65817a;
        if (z3Var2.w() && z3Var.w()) {
            return new Pair<>(Boolean.FALSE, -1);
        }
        int i11 = 3;
        if (z3Var2.w() != z3Var.w()) {
            return new Pair<>(Boolean.TRUE, 3);
        }
        if (z3Var.t(z3Var.l(u4Var2.f65818b.f65467a, this.f66723p1).f61969c, this.f60604b1).f61988a.equals(z3Var2.t(z3Var2.l(u4Var.f65818b.f65467a, this.f66723p1).f61969c, this.f60604b1).f61988a)) {
            if (z10 && i10 == 0 && u4Var2.f65818b.f65470d < u4Var.f65818b.f65470d) {
                return new Pair<>(Boolean.TRUE, 0);
            }
            return (z10 && i10 == 1 && z12) ? new Pair<>(Boolean.TRUE, 2) : new Pair<>(Boolean.FALSE, -1);
        }
        if (z10 && i10 == 0) {
            i11 = 1;
        } else if (z10 && i10 == 1) {
            i11 = 2;
        } else if (!z11) {
            throw new IllegalStateException();
        }
        return new Pair<>(Boolean.TRUE, Integer.valueOf(i11));
    }

    private long W3(u4 u4Var) {
        if (!u4Var.f65818b.c()) {
            return androidx.media3.common.util.k1.A2(X3(u4Var));
        }
        u4Var.f65817a.l(u4Var.f65818b.f65467a, this.f66723p1);
        return u4Var.f65819c == -9223372036854775807L ? u4Var.f65817a.t(Y3(u4Var), this.f60604b1).c() : this.f66723p1.p() + androidx.media3.common.util.k1.A2(u4Var.f65819c);
    }

    public static /* synthetic */ Integer X2(int i10, Integer num) {
        if (i10 == 0) {
            i10 = num.intValue();
        }
        return Integer.valueOf(i10);
    }

    private long X3(u4 u4Var) {
        if (u4Var.f65817a.w()) {
            return androidx.media3.common.util.k1.D1(this.B2);
        }
        long jM = u4Var.f65832p ? u4Var.m() : u4Var.f65835s;
        return u4Var.f65818b.c() ? jM : k4(u4Var.f65817a, u4Var.f65818b, jM);
    }

    private int Y3(u4 u4Var) {
        return u4Var.f65817a.w() ? this.f66744z2 : u4Var.f65817a.l(u4Var.f65818b.f65467a, this.f66723p1).f61969c;
    }

    @androidx.annotation.p0
    private Pair<Object, Long> Z3(androidx.media3.common.z3 z3Var, androidx.media3.common.z3 z3Var2, int i10, long j10) {
        if (z3Var.w() || z3Var2.w()) {
            boolean z10 = !z3Var.w() && z3Var2.w();
            return g4(z3Var2, z10 ? -1 : i10, z10 ? -9223372036854775807L : j10);
        }
        Pair<Object, Long> pairP = z3Var.p(this.f60604b1, this.f66723p1, i10, androidx.media3.common.util.k1.D1(j10));
        Object obj = ((Pair) androidx.media3.common.util.k1.o(pairP)).first;
        if (z3Var2.f(obj) != -1) {
            return pairP;
        }
        int iR0 = n3.R0(this.f60604b1, this.f66723p1, this.J1, this.K1, obj, z3Var, z3Var2);
        return iR0 != -1 ? g4(z3Var2, iR0, z3Var2.t(iR0, this.f60604b1).c()) : g4(z3Var2, -1, -9223372036854775807L);
    }

    private androidx.media3.common.z0.k a4(long j10) {
        Object obj;
        int iF;
        androidx.media3.common.k0 k0Var;
        Object obj2;
        int iL0 = l0();
        if (this.f66742y2.f65817a.w()) {
            obj = null;
            iF = -1;
            k0Var = null;
            obj2 = null;
        } else {
            u4 u4Var = this.f66742y2;
            Object obj3 = u4Var.f65818b.f65467a;
            u4Var.f65817a.l(obj3, this.f66723p1);
            iF = this.f66742y2.f65817a.f(obj3);
            obj2 = obj3;
            obj = this.f66742y2.f65817a.t(iL0, this.f60604b1).f61988a;
            k0Var = this.f60604b1.f61990c;
        }
        int i10 = iF;
        long jA2 = androidx.media3.common.util.k1.A2(j10);
        long jA3 = this.f66742y2.f65818b.c() ? androidx.media3.common.util.k1.A2(c4(this.f66742y2)) : jA2;
        androidx.media3.exoplayer.source.t0.b bVar = this.f66742y2.f65818b;
        return new androidx.media3.common.z0.k(obj, iL0, k0Var, obj2, i10, jA2, jA3, bVar.f65468b, bVar.f65469c);
    }

    private androidx.media3.common.z0.k b4(int i10, u4 u4Var, int i11) {
        int i12;
        Object obj;
        androidx.media3.common.k0 k0Var;
        Object obj2;
        int i13;
        long jC4;
        long jC5;
        androidx.media3.common.z3.b bVar = new androidx.media3.common.z3.b();
        if (u4Var.f65817a.w()) {
            i12 = i11;
            obj = null;
            k0Var = null;
            obj2 = null;
            i13 = -1;
        } else {
            Object obj3 = u4Var.f65818b.f65467a;
            u4Var.f65817a.l(obj3, bVar);
            int i14 = bVar.f61969c;
            int iF = u4Var.f65817a.f(obj3);
            Object obj4 = u4Var.f65817a.t(i14, this.f60604b1).f61988a;
            k0Var = this.f60604b1.f61990c;
            obj2 = obj3;
            i13 = iF;
            obj = obj4;
            i12 = i14;
        }
        if (i10 == 0) {
            if (u4Var.f65818b.c()) {
                androidx.media3.exoplayer.source.t0.b bVar2 = u4Var.f65818b;
                jC4 = bVar.c(bVar2.f65468b, bVar2.f65469c);
                jC5 = c4(u4Var);
            } else {
                jC4 = u4Var.f65818b.f65471e != -1 ? c4(this.f66742y2) : bVar.f61971e + bVar.f61970d;
                jC5 = jC4;
            }
        } else if (u4Var.f65818b.c()) {
            jC4 = u4Var.f65835s;
            jC5 = c4(u4Var);
        } else {
            jC4 = bVar.f61971e + u4Var.f65835s;
            jC5 = jC4;
        }
        long jA2 = androidx.media3.common.util.k1.A2(jC4);
        long jA3 = androidx.media3.common.util.k1.A2(jC5);
        androidx.media3.exoplayer.source.t0.b bVar3 = u4Var.f65818b;
        return new androidx.media3.common.z0.k(obj, i12, k0Var, obj2, i13, jA2, jA3, bVar3.f65468b, bVar3.f65469c);
    }

    private static long c4(u4 u4Var) {
        androidx.media3.common.z3.d dVar = new androidx.media3.common.z3.d();
        androidx.media3.common.z3.b bVar = new androidx.media3.common.z3.b();
        u4Var.f65817a.l(u4Var.f65818b.f65467a, bVar);
        return u4Var.f65819c == -9223372036854775807L ? u4Var.f65817a.t(bVar.f61969c, dVar).d() : bVar.q() + u4Var.f65819c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d4(n3.e eVar) {
        boolean z10;
        long jK4;
        int i10 = this.L1 - eVar.f64319c;
        this.L1 = i10;
        boolean z11 = true;
        int i11 = 6 << 1;
        if (eVar.f64320d) {
            this.M1 = eVar.f64321e;
            this.N1 = true;
        }
        if (i10 == 0) {
            androidx.media3.common.z3 z3Var = eVar.f64318b.f65817a;
            if (!this.f66742y2.f65817a.w() && z3Var.w()) {
                this.f66744z2 = -1;
                this.B2 = 0L;
                this.A2 = 0;
            }
            if (!z3Var.w()) {
                List<androidx.media3.common.z3> listM = ((x4) z3Var).M();
                androidx.media3.common.util.a.i(listM.size() == this.f66725q1.size());
                for (int i12 = 0; i12 < listM.size(); i12++) {
                    this.f66725q1.get(i12).d(listM.get(i12));
                }
            }
            long j10 = -9223372036854775807L;
            if (this.N1) {
                if (eVar.f64318b.f65818b.equals(this.f66742y2.f65818b) && eVar.f64318b.f65820d == this.f66742y2.f65835s) {
                    z11 = false;
                }
                if (z11) {
                    if (z3Var.w() || eVar.f64318b.f65818b.c()) {
                        jK4 = eVar.f64318b.f65820d;
                    } else {
                        u4 u4Var = eVar.f64318b;
                        jK4 = k4(z3Var, u4Var.f65818b, u4Var.f65820d);
                    }
                    j10 = jK4;
                }
                z10 = z11;
            } else {
                z10 = false;
            }
            this.N1 = false;
            z4(eVar.f64318b, 1, z10, this.M1, j10, -1, false);
        }
    }

    private static u4 e4(u4 u4Var, int i10) {
        u4 u4VarH = u4Var.h(i10);
        return (i10 == 1 || i10 == 4) ? u4VarH.b(false) : u4VarH;
    }

    public static /* synthetic */ void f3(int i10, androidx.media3.common.z0.k kVar, androidx.media3.common.z0.k kVar2, androidx.media3.common.z0.g gVar) {
        gVar.A(i10);
        gVar.d0(kVar, kVar2, i10);
    }

    private u4 f4(u4 u4Var, androidx.media3.common.z3 z3Var, @androidx.annotation.p0 Pair<Object, Long> pair) {
        androidx.media3.common.util.a.a(z3Var.w() || pair != null);
        androidx.media3.common.z3 z3Var2 = u4Var.f65817a;
        long jW3 = W3(u4Var);
        u4 u4VarJ = u4Var.j(z3Var);
        if (z3Var.w()) {
            androidx.media3.exoplayer.source.t0.b bVarL = u4.l();
            long jD1 = androidx.media3.common.util.k1.D1(this.B2);
            u4 u4VarC = u4VarJ.d(bVarL, jD1, jD1, jD1, 0L, androidx.media3.exoplayer.source.h2.f65074e, this.f66697c1, l6.F()).c(bVarL);
            u4VarC.f65833q = u4VarC.f65835s;
            return u4VarC;
        }
        Object obj = u4VarJ.f65818b.f65467a;
        boolean zEquals = obj.equals(((Pair) androidx.media3.common.util.k1.o(pair)).first);
        androidx.media3.exoplayer.source.t0.b bVar = !zEquals ? new androidx.media3.exoplayer.source.t0.b(pair.first) : u4VarJ.f65818b;
        long jLongValue = ((Long) pair.second).longValue();
        long jD2 = androidx.media3.common.util.k1.D1(jW3);
        if (!z3Var2.w()) {
            jD2 -= z3Var2.l(obj, this.f66723p1).q();
        }
        if (!zEquals || jLongValue < jD2) {
            androidx.media3.exoplayer.source.t0.b bVar2 = bVar;
            androidx.media3.common.util.a.i(!bVar2.c());
            u4 u4VarC2 = u4VarJ.d(bVar2, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? androidx.media3.exoplayer.source.h2.f65074e : u4VarJ.f65824h, !zEquals ? this.f66697c1 : u4VarJ.f65825i, !zEquals ? l6.F() : u4VarJ.f65826j).c(bVar2);
            u4VarC2.f65833q = jLongValue;
            return u4VarC2;
        }
        if (jLongValue != jD2) {
            androidx.media3.exoplayer.source.t0.b bVar3 = bVar;
            androidx.media3.common.util.a.i(!bVar3.c());
            long jMax = Math.max(0L, u4VarJ.f65834r - (jLongValue - jD2));
            long j10 = u4VarJ.f65833q;
            if (u4VarJ.f65827k.equals(u4VarJ.f65818b)) {
                j10 = jLongValue + jMax;
            }
            u4 u4VarD = u4VarJ.d(bVar3, jLongValue, jLongValue, jLongValue, jMax, u4VarJ.f65824h, u4VarJ.f65825i, u4VarJ.f65826j);
            u4VarD.f65833q = j10;
            return u4VarD;
        }
        int iF = z3Var.f(u4VarJ.f65827k.f65467a);
        if (iF != -1 && z3Var.j(iF, this.f66723p1).f61969c == z3Var.l(bVar.f65467a, this.f66723p1).f61969c) {
            return u4VarJ;
        }
        z3Var.l(bVar.f65467a, this.f66723p1);
        long jC = bVar.c() ? this.f66723p1.c(bVar.f65468b, bVar.f65469c) : this.f66723p1.f61970d;
        androidx.media3.exoplayer.source.t0.b bVar4 = bVar;
        u4 u4VarC3 = u4VarJ.d(bVar4, u4VarJ.f65835s, u4VarJ.f65835s, u4VarJ.f65820d, jC - u4VarJ.f65835s, u4VarJ.f65824h, u4VarJ.f65825i, u4VarJ.f65826j).c(bVar4);
        u4VarC3.f65833q = jC;
        return u4VarC3;
    }

    @androidx.annotation.p0
    private Pair<Object, Long> g4(androidx.media3.common.z3 z3Var, int i10, long j10) {
        if (z3Var.w()) {
            this.f66744z2 = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.B2 = j10;
            this.A2 = 0;
            return null;
        }
        if (i10 == -1 || i10 >= z3Var.v()) {
            i10 = z3Var.e(this.K1);
            j10 = z3Var.t(i10, this.f60604b1).c();
        }
        return z3Var.p(this.f60604b1, this.f66723p1, i10, androidx.media3.common.util.k1.D1(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h4(final int i10, final int i11) {
        if (i10 == this.f66706g2.b() && i11 == this.f66706g2.a()) {
            return;
        }
        this.f66706g2 = new androidx.media3.common.util.r0(i10, i11);
        this.f66719n1.l(24, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.y1
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((androidx.media3.common.z0.g) obj).z(i10, i11);
            }
        });
        o4(2, 14, new androidx.media3.common.util.r0(i10, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i4(int i10, final int i11) {
        C4();
        o4(1, 10, Integer.valueOf(i11));
        o4(2, 10, Integer.valueOf(i11));
        this.f66719n1.l(21, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.m2
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((androidx.media3.common.z0.g) obj).K(i11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j4(boolean z10) {
        if (this.f66734u2) {
            return;
        }
        if (!z10) {
            y4(this.f66742y2.f65828l, 1);
            return;
        }
        u4 u4Var = this.f66742y2;
        if (u4Var.f65830n == 3) {
            y4(u4Var.f65828l, 1);
        }
    }

    private long k4(androidx.media3.common.z3 z3Var, androidx.media3.exoplayer.source.t0.b bVar, long j10) {
        z3Var.l(bVar.f65467a, this.f66723p1);
        return j10 + this.f66723p1.q();
    }

    private u4 l4(u4 u4Var, int i10, int i11) {
        int iY3 = Y3(u4Var);
        long jW3 = W3(u4Var);
        androidx.media3.common.z3 z3Var = u4Var.f65817a;
        int size = this.f66725q1.size();
        this.L1++;
        m4(i10, i11);
        androidx.media3.common.z3 z3VarS3 = S3();
        u4 u4VarF4 = f4(u4Var, z3VarS3, Z3(z3Var, z3VarS3, iY3, jW3));
        int i12 = u4VarF4.f65821e;
        if (i12 != 1 && i12 != 4 && i10 < i11 && i11 == size && iY3 >= u4VarF4.f65817a.v()) {
            u4VarF4 = e4(u4VarF4, 4);
        }
        this.f66717m1.G0(i10, i11, this.Q1);
        return u4VarF4;
    }

    private void m4(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            this.f66725q1.remove(i12);
        }
        this.Q1 = this.Q1.f(i10, i11);
    }

    private void n4() {
        if (this.f66696b2 != null) {
            U3(this.B1).t(10000).q(null).n();
            this.f66696b2.g(this.A1);
            this.f66696b2 = null;
        }
        TextureView textureView = this.f66700d2;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.A1) {
                androidx.media3.common.util.z.n(C2, "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f66700d2.setSurfaceTextureListener(null);
            }
            this.f66700d2 = null;
        }
        SurfaceHolder surfaceHolder = this.f66695a2;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.A1);
            this.f66695a2 = null;
        }
    }

    private void o4(int i10, int i11, @androidx.annotation.p0 Object obj) {
        for (z4 z4Var : this.f66707h1) {
            if (i10 == -1 || z4Var.f() == i10) {
                U3(z4Var).t(i11).q(obj).n();
            }
        }
        for (z4 z4Var2 : this.f66709i1) {
            if (z4Var2 != null && (i10 == -1 || z4Var2.f() == i10)) {
                U3(z4Var2).t(i11).q(obj).n();
            }
        }
    }

    private void p4(int i10, @androidx.annotation.p0 Object obj) {
        o4(-1, i10, obj);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a5  */
    private void q4(List<androidx.media3.exoplayer.source.t0> list, int i10, long j10, boolean z10) {
        long j11;
        int i11;
        int i12;
        u4 u4VarE4;
        boolean z11;
        int iE = i10;
        int iY3 = Y3(this.f66742y2);
        long currentPosition = getCurrentPosition();
        this.L1++;
        if (!this.f66725q1.isEmpty()) {
            m4(0, this.f66725q1.size());
        }
        List<r4.c> listM3 = M3(0, list);
        androidx.media3.common.z3 z3VarS3 = S3();
        if (!z3VarS3.w() && iE >= z3VarS3.v()) {
            throw new androidx.media3.common.i0(z3VarS3, iE, j10);
        }
        if (!z10) {
            if (iE == -1) {
                i11 = iY3;
                j11 = currentPosition;
            } else {
                j11 = j10;
            }
            u4 u4VarF4 = f4(this.f66742y2, z3VarS3, g4(z3VarS3, i11, j11));
            i12 = u4VarF4.f65821e;
            if (i11 != -1 && i12 != 1) {
                if (!z3VarS3.w() || i11 >= z3VarS3.v()) {
                    i12 = 4;
                } else {
                    i12 = 2;
                }
            }
            u4VarE4 = e4(u4VarF4, i12);
            this.f66717m1.i1(listM3, i11, androidx.media3.common.util.k1.D1(j11), this.Q1);
            if (!this.f66742y2.f65818b.f65467a.equals(u4VarE4.f65818b.f65467a) || this.f66742y2.f65817a.w()) {
                z11 = false;
            } else {
                z11 = true;
            }
            z4(u4VarE4, 0, z11, 4, X3(u4VarE4), -1, false);
        }
        iE = z3VarS3.e(this.K1);
        j11 = -9223372036854775807L;
        i11 = iE;
        u4 u4VarF5 = f4(this.f66742y2, z3VarS3, g4(z3VarS3, i11, j11));
        i12 = u4VarF5.f65821e;
        if (i11 != -1) {
            if (z3VarS3.w()) {
                i12 = 4;
            } else {
                i12 = 4;
            }
        }
        u4VarE4 = e4(u4VarF5, i12);
        this.f66717m1.i1(listM3, i11, androidx.media3.common.util.k1.D1(j11), this.Q1);
        if (this.f66742y2.f65818b.f65467a.equals(u4VarE4.f65818b.f65467a)) {
            z11 = false;
        } else {
            z11 = false;
        }
        z4(u4VarE4, 0, z11, 4, X3(u4VarE4), -1, false);
    }

    private void r4(SurfaceHolder surfaceHolder) {
        this.f66698c2 = false;
        this.f66695a2 = surfaceHolder;
        surfaceHolder.addCallback(this.A1);
        Surface surface = this.f66695a2.getSurface();
        if (surface == null || !surface.isValid()) {
            h4(0, 0);
        } else {
            Rect surfaceFrame = this.f66695a2.getSurfaceFrame();
            h4(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s4(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        u4(surface);
        this.Z1 = surface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u4(@androidx.annotation.p0 Object obj) {
        Object obj2 = this.Y1;
        boolean z10 = (obj2 == null || obj2 == obj) ? false : true;
        boolean zB1 = this.f66717m1.B1(obj, z10 ? this.G1 : -9223372036854775807L);
        if (z10) {
            Object obj3 = this.Y1;
            Surface surface = this.Z1;
            if (obj3 == surface) {
                surface.release();
                this.Z1 = null;
            }
        }
        this.Y1 = obj;
        if (!zB1) {
            v4(s0.o(new o3(3), 1003));
        }
    }

    private void v4(@androidx.annotation.p0 s0 s0Var) {
        u4 u4Var = this.f66742y2;
        u4 u4VarC = u4Var.c(u4Var.f65818b);
        u4VarC.f65833q = u4VarC.f65835s;
        u4VarC.f65834r = 0L;
        int i10 = 6 ^ 1;
        u4 u4VarE4 = e4(u4VarC, 1);
        if (s0Var != null) {
            u4VarE4 = u4VarE4.f(s0Var);
        }
        this.L1++;
        this.f66717m1.L1();
        z4(u4VarE4, 0, false, 5, -9223372036854775807L, -1, false);
    }

    private void w4() {
        androidx.media3.common.z0.c cVar = this.T1;
        androidx.media3.common.z0.c cVarD0 = androidx.media3.common.util.k1.d0(this.f66705g1, this.f66699d1);
        this.T1 = cVarD0;
        if (cVarD0.equals(cVar)) {
            return;
        }
        this.f66719n1.i(13, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.q2
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((androidx.media3.common.z0.g) obj).Q(this.f64608a.T1);
            }
        });
    }

    private void x4(int i10, int i11, List<androidx.media3.common.k0> list) {
        this.L1++;
        this.f66717m1.Q1(i10, i11, list);
        for (int i12 = i10; i12 < i11; i12++) {
            e eVar = this.f66725q1.get(i12);
            eVar.d(new androidx.media3.exoplayer.source.d2(eVar.b(), list.get(i12 - i10)));
        }
        boolean z10 = false | false;
        z4(this.f66742y2.j(S3()), 0, false, 4, -9223372036854775807L, -1, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y4(boolean z10, int i10) {
        int iQ3 = Q3(z10);
        u4 u4VarA = this.f66742y2;
        if (u4VarA.f65828l == z10 && u4VarA.f65830n == iQ3 && u4VarA.f65829m == i10) {
            return;
        }
        this.L1++;
        if (u4VarA.f65832p) {
            u4VarA = u4VarA.a();
        }
        u4 u4VarE = u4VarA.e(z10, i10, iQ3);
        this.f66717m1.m1(z10, i10, iQ3);
        z4(u4VarE, 0, false, 5, -9223372036854775807L, -1, false);
    }

    private void z4(final u4 u4Var, final int i10, boolean z10, final int i11, long j10, int i12, boolean z11) {
        u4 u4Var2 = this.f66742y2;
        this.f66742y2 = u4Var;
        boolean zEquals = u4Var2.f65817a.equals(u4Var.f65817a);
        Pair<Boolean, Integer> pairV3 = V3(u4Var, u4Var2, z10, i11, !zEquals, z11);
        boolean zBooleanValue = ((Boolean) pairV3.first).booleanValue();
        final int iIntValue = ((Integer) pairV3.second).intValue();
        final androidx.media3.common.k0 k0Var = null;
        if (zBooleanValue) {
            if (!u4Var.f65817a.w()) {
                k0Var = u4Var.f65817a.t(u4Var.f65817a.l(u4Var.f65818b.f65467a, this.f66723p1).f61969c, this.f60604b1).f61990c;
            }
            this.f66740x2 = androidx.media3.common.q0.X0;
        }
        if (zBooleanValue || !u4Var2.f65826j.equals(u4Var.f65826j)) {
            this.f66740x2 = this.f66740x2.a().N(u4Var.f65826j).J();
        }
        androidx.media3.common.q0 q0VarO3 = O3();
        boolean zEquals2 = q0VarO3.equals(this.U1);
        this.U1 = q0VarO3;
        boolean z12 = u4Var2.f65828l != u4Var.f65828l;
        boolean z13 = u4Var2.f65821e != u4Var.f65821e;
        if (z13 || z12) {
            B4();
        }
        boolean z14 = u4Var2.f65823g;
        boolean z15 = u4Var.f65823g;
        boolean z16 = z14 != z15;
        if (z16) {
            A4(z15);
        }
        if (!zEquals) {
            this.f66719n1.i(0, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.r1
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    androidx.media3.common.z0.g gVar = (androidx.media3.common.z0.g) obj;
                    gVar.V(u4Var.f65817a, i10);
                }
            });
        }
        if (z10) {
            final androidx.media3.common.z0.k kVarB4 = b4(i11, u4Var2, i12);
            final androidx.media3.common.z0.k kVarA4 = a4(j10);
            this.f66719n1.i(11, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.t2
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    y2.f3(i11, kVarB4, kVarA4, (androidx.media3.common.z0.g) obj);
                }
            });
        }
        if (zBooleanValue) {
            this.f66719n1.i(1, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.u2
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    ((androidx.media3.common.z0.g) obj).l0(k0Var, iIntValue);
                }
            });
        }
        if (u4Var2.f65822f != u4Var.f65822f) {
            this.f66719n1.i(10, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.v2
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    ((androidx.media3.common.z0.g) obj).w0(u4Var.f65822f);
                }
            });
            if (u4Var.f65822f != null) {
                this.f66719n1.i(10, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.w2
                    @Override // androidx.media3.common.util.y.a
                    public final void invoke(Object obj) {
                        ((androidx.media3.common.z0.g) obj).O(u4Var.f65822f);
                    }
                });
            }
        }
        androidx.media3.exoplayer.trackselection.l0 l0Var = u4Var2.f65825i;
        androidx.media3.exoplayer.trackselection.l0 l0Var2 = u4Var.f65825i;
        if (l0Var != l0Var2) {
            this.f66711j1.i(l0Var2.f65722e);
            this.f66719n1.i(2, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.x2
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    ((androidx.media3.common.z0.g) obj).X(u4Var.f65825i.f65721d);
                }
            });
        }
        if (!zEquals2) {
            final androidx.media3.common.q0 q0Var = this.U1;
            this.f66719n1.i(14, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.s1
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    ((androidx.media3.common.z0.g) obj).N(q0Var);
                }
            });
        }
        if (z16) {
            this.f66719n1.i(3, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.t1
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    y2.G2(u4Var, (androidx.media3.common.z0.g) obj);
                }
            });
        }
        if (z13 || z12) {
            this.f66719n1.i(-1, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.u1
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    u4 u4Var3 = u4Var;
                    ((androidx.media3.common.z0.g) obj).C(u4Var3.f65828l, u4Var3.f65821e);
                }
            });
        }
        if (z13) {
            this.f66719n1.i(4, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.v1
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    ((androidx.media3.common.z0.g) obj).h0(u4Var.f65821e);
                }
            });
        }
        if (z12 || u4Var2.f65829m != u4Var.f65829m) {
            this.f66719n1.i(5, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.c2
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    u4 u4Var3 = u4Var;
                    ((androidx.media3.common.z0.g) obj).a0(u4Var3.f65828l, u4Var3.f65829m);
                }
            });
        }
        if (u4Var2.f65830n != u4Var.f65830n) {
            this.f66719n1.i(6, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.n2
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    ((androidx.media3.common.z0.g) obj).f0(u4Var.f65830n);
                }
            });
        }
        if (u4Var2.n() != u4Var.n()) {
            this.f66719n1.i(7, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.r2
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    ((androidx.media3.common.z0.g) obj).e0(u4Var.n());
                }
            });
        }
        if (!u4Var2.f65831o.equals(u4Var.f65831o)) {
            this.f66719n1.i(12, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.s2
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    ((androidx.media3.common.z0.g) obj).u(u4Var.f65831o);
                }
            });
        }
        w4();
        this.f66719n1.g();
        if (u4Var2.f65832p != u4Var.f65832p) {
            Iterator<ExoPlayer.a> it = this.f66721o1.iterator();
            while (it.hasNext()) {
                it.next().n(u4Var.f65832p);
            }
        }
    }

    @Override // androidx.media3.common.z0
    public void A() {
        C4();
        u4 u4Var = this.f66742y2;
        if (u4Var.f65821e != 1) {
            return;
        }
        u4 u4VarF = u4Var.f(null);
        u4 u4VarE4 = e4(u4VarF, u4VarF.f65817a.w() ? 4 : 2);
        this.L1++;
        this.f66717m1.A0();
        z4(u4VarE4, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void A0(@androidx.annotation.p0 f5 f5Var) {
        C4();
        if (f5Var == null) {
            f5Var = f5.f63791g;
        }
        if (this.P1.equals(f5Var)) {
            return;
        }
        this.P1 = f5Var;
        this.f66717m1.u1(f5Var);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void B0(androidx.media3.exoplayer.source.t0 t0Var, boolean z10) {
        C4();
        N1(Collections.singletonList(t0Var), z10);
    }

    @Override // androidx.media3.common.z0
    @Deprecated
    public void B1() {
        C4();
        w5 w5Var = this.D1;
        if (w5Var != null) {
            w5Var.r(1);
        }
    }

    @Override // androidx.media3.common.z0
    public int C() {
        C4();
        return this.J1;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void C0(ExoPlayer.a aVar) {
        this.f66721o1.add(aVar);
    }

    @Override // androidx.media3.common.z0
    public void D(final int i10) {
        C4();
        if (this.J1 != i10) {
            this.J1 = i10;
            this.f66717m1.s1(i10);
            this.f66719n1.i(8, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.e2
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    ((androidx.media3.common.z0.g) obj).x(i10);
                }
            });
            w4();
            this.f66719n1.g();
        }
    }

    @Override // androidx.media3.common.z0
    public void D0(int i10) {
        C4();
        w5 w5Var = this.D1;
        if (w5Var != null) {
            w5Var.w(i10);
        }
    }

    @Override // androidx.media3.common.z0
    public androidx.media3.common.util.r0 D1() {
        C4();
        return this.f66706g2;
    }

    @Override // androidx.media3.common.z0
    public int E() {
        C4();
        if (x()) {
            return this.f66742y2.f65818b.f65468b;
        }
        return -1;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void E0(androidx.media3.exoplayer.source.t0 t0Var, long j10) {
        C4();
        S0(Collections.singletonList(t0Var), 0, j10);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void E1(ExoPlayer.c cVar) {
        C4();
        if (this.R1.equals(cVar)) {
            return;
        }
        this.R1 = cVar;
        this.f66717m1.q1(cVar);
    }

    @Override // androidx.media3.common.z0
    public void F0(androidx.media3.common.q0 q0Var) {
        C4();
        androidx.media3.common.util.a.g(q0Var);
        if (q0Var.equals(this.V1)) {
            return;
        }
        this.V1 = q0Var;
        this.f66719n1.l(15, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.f2
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((androidx.media3.common.z0.g) obj).v0(this.f63782a.V1);
            }
        });
    }

    @Override // androidx.media3.common.z0
    public int H() {
        C4();
        return this.f66742y2.f65821e;
    }

    @Override // androidx.media3.common.z0
    public void H0(int i10, int i11) {
        C4();
        androidx.media3.common.util.a.a(i10 >= 0 && i11 >= i10);
        int size = this.f66725q1.size();
        int iMin = Math.min(i11, size);
        if (i10 < size && i10 != iMin) {
            u4 u4VarL4 = l4(this.f66742y2, i10, iMin);
            z4(u4VarL4, 0, !u4VarL4.f65818b.f65467a.equals(this.f66742y2.f65818b.f65467a), 4, X3(u4VarL4), -1, false);
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void H1(List<androidx.media3.exoplayer.source.t0> list) {
        C4();
        N1(list, true);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.exoplayer.source.h2 I() {
        C4();
        return this.f66742y2.f65824h;
    }

    @Override // androidx.media3.common.z0
    public boolean J() {
        C4();
        return this.f66742y2.f65828l;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void J0(androidx.media3.exoplayer.analytics.b bVar) {
        C4();
        this.f66731t1.Z((androidx.media3.exoplayer.analytics.b) androidx.media3.common.util.a.g(bVar));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public w4 J1(w4.b bVar) {
        C4();
        return U3(bVar);
    }

    @Override // androidx.media3.common.z0
    public void K(final boolean z10) {
        C4();
        if (this.K1 != z10) {
            this.K1 = z10;
            this.f66717m1.w1(z10);
            this.f66719n1.i(9, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.g2
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    ((androidx.media3.common.z0.g) obj).n(z10);
                }
            });
            w4();
            this.f66719n1.g();
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public int K1() {
        C4();
        return this.f66704f2;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void L(List<androidx.media3.common.p> list) {
        C4();
        try {
            Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(androidx.media3.common.l4.a.class);
            o4(2, 13, list);
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            throw new IllegalStateException("Could not find required lib-effect dependencies.", e10);
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @androidx.annotation.p0
    public androidx.media3.common.w L1() {
        C4();
        return this.W1;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public int M() {
        C4();
        return this.f66707h1.length;
    }

    @Override // androidx.media3.common.z0
    public androidx.media3.common.i4 M0() {
        C4();
        return this.f66742y2.f65825i.f65721d;
    }

    @Override // androidx.media3.common.z0
    public void M1(int i10) {
        C4();
        w5 w5Var = this.D1;
        if (w5Var != null) {
            w5Var.r(i10);
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @androidx.annotation.w0(23)
    public void N0(@androidx.annotation.p0 AudioDeviceInfo audioDeviceInfo) {
        C4();
        o4(1, 12, audioDeviceInfo);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void N1(List<androidx.media3.exoplayer.source.t0> list, boolean z10) {
        C4();
        q4(list, -1, -9223372036854775807L, z10);
    }

    @Override // androidx.media3.common.z0
    public int O() {
        C4();
        if (this.f66742y2.f65817a.w()) {
            return this.A2;
        }
        u4 u4Var = this.f66742y2;
        return u4Var.f65817a.f(u4Var.f65818b.f65467a);
    }

    @Override // androidx.media3.common.z0
    public int P() {
        C4();
        if (x()) {
            return this.f66742y2.f65818b.f65469c;
        }
        return -1;
    }

    @Override // androidx.media3.common.z0
    public androidx.media3.common.text.d P1() {
        C4();
        return this.f66718m2;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void Q0(boolean z10) {
        C4();
        if (this.S1 == z10) {
            return;
        }
        this.S1 = z10;
        this.f66717m1.k1(z10);
    }

    @Override // androidx.media3.common.z0
    public void Q1(androidx.media3.common.z0.g gVar) {
        C4();
        this.f66719n1.k((androidx.media3.common.z0.g) androidx.media3.common.util.a.g(gVar));
    }

    @Override // androidx.media3.common.z0
    public long R() {
        C4();
        if (this.f66742y2.f65817a.w()) {
            return this.B2;
        }
        u4 u4Var = this.f66742y2;
        if (u4Var.f65827k.f65470d != u4Var.f65818b.f65470d) {
            return u4Var.f65817a.t(l0(), this.f60604b1).e();
        }
        long j10 = u4Var.f65833q;
        if (this.f66742y2.f65827k.c()) {
            u4 u4Var2 = this.f66742y2;
            androidx.media3.common.z3.b bVarL = u4Var2.f65817a.l(u4Var2.f65827k.f65467a, this.f66723p1);
            long jG = bVarL.g(this.f66742y2.f65827k.f65468b);
            j10 = jG == Long.MIN_VALUE ? bVarL.f61970d : jG;
        }
        u4 u4Var3 = this.f66742y2;
        return androidx.media3.common.util.k1.A2(k4(u4Var3.f65817a, u4Var3.f65827k, j10));
    }

    @Override // androidx.media3.common.z0
    @Deprecated
    public void R0(boolean z10) {
        C4();
        w5 w5Var = this.D1;
        if (w5Var != null) {
            w5Var.A(z10, 1);
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void R1(boolean z10) {
        C4();
        if (this.f66734u2) {
            return;
        }
        this.C1.d(z10);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void S0(List<androidx.media3.exoplayer.source.t0> list, int i10, long j10) {
        C4();
        q4(list, i10, j10, false);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void S1(int i10) {
        C4();
        if (this.f66704f2 == i10) {
            return;
        }
        this.f66704f2 = i10;
        o4(2, 5, Integer.valueOf(i10));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean T0() {
        C4();
        return this.f66734u2;
    }

    @Override // androidx.media3.common.z0
    @Deprecated
    public void U0() {
        C4();
        w5 w5Var = this.D1;
        if (w5Var != null) {
            int i10 = 2 | 1;
            w5Var.w(1);
        }
    }

    @Override // androidx.media3.common.z0
    public void U1(androidx.media3.common.z0.g gVar) {
        this.f66719n1.c((androidx.media3.common.z0.g) androidx.media3.common.util.a.g(gVar));
    }

    @Override // androidx.media3.common.z0
    public androidx.media3.common.q0 V() {
        C4();
        return this.V1;
    }

    @Override // androidx.media3.common.z0
    public androidx.media3.common.e4 V0() {
        C4();
        return this.f66711j1.c();
    }

    @Override // androidx.media3.common.z0
    public int V1() {
        C4();
        return this.f66742y2.f65830n;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void W(boolean z10) {
        C4();
        if (this.O1 != z10) {
            this.O1 = z10;
            if (!this.f66717m1.e1(z10)) {
                v4(s0.o(new o3(2), 1003));
            }
        }
    }

    @Override // androidx.media3.common.z0
    public int W0() {
        C4();
        w5 w5Var = this.D1;
        if (w5Var != null) {
            return w5Var.v();
        }
        return 0;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void W1(androidx.media3.exoplayer.analytics.b bVar) {
        this.f66731t1.T((androidx.media3.exoplayer.analytics.b) androidx.media3.common.util.a.g(bVar));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean Y1() {
        C4();
        return this.S1;
    }

    @Override // androidx.media3.common.z0
    public long Z0() {
        C4();
        return this.f66741y1;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void a1(int i10, List<androidx.media3.exoplayer.source.t0> list) {
        C4();
        androidx.media3.common.util.a.a(i10 >= 0);
        int iMin = Math.min(i10, this.f66725q1.size());
        if (this.f66725q1.isEmpty()) {
            N1(list, this.f66744z2 == -1);
        } else {
            z4(N3(this.f66742y2, iMin, list), 0, false, 5, -9223372036854775807L, -1, false);
        }
    }

    @Override // androidx.media3.common.z0
    public androidx.media3.common.z0.c a2() {
        C4();
        return this.T1;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void b(int i10) {
        C4();
        this.f66702e2 = i10;
        o4(2, 4, Integer.valueOf(i10));
    }

    @Override // androidx.media3.common.z0
    public void b0(boolean z10) {
        C4();
        y4(z10, 1);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public z4 b1(int i10) {
        C4();
        return this.f66707h1[i10];
    }

    @Override // androidx.media3.common.z0
    public void b2(int i10, int i11) {
        C4();
        w5 w5Var = this.D1;
        if (w5Var != null) {
            w5Var.C(i10, i11);
        }
    }

    @Override // androidx.media3.common.z0
    public androidx.media3.common.y0 c() {
        C4();
        return this.f66742y2.f65831o;
    }

    @Override // androidx.media3.common.z0
    public androidx.media3.common.z3 c0() {
        C4();
        return this.f66742y2.f65817a;
    }

    @Override // androidx.media3.common.z0
    public void c1(final androidx.media3.common.d dVar, boolean z10) {
        C4();
        if (this.f66734u2) {
            return;
        }
        if (!Objects.equals(this.f66712j2, dVar)) {
            this.f66712j2 = dVar;
            o4(1, 3, dVar);
            w5 w5Var = this.D1;
            if (w5Var != null) {
                w5Var.B(dVar.c());
            }
            this.f66719n1.i(20, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.o2
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    ((androidx.media3.common.z0.g) obj).r0(dVar);
                }
            });
        }
        this.f66717m1.c1(this.f66712j2, z10);
        this.f66719n1.g();
    }

    @Override // androidx.media3.common.z0
    public boolean d() {
        C4();
        return this.f66742y2.f65823g;
    }

    @Override // androidx.media3.common.z0
    public Looper d0() {
        return this.f66733u1;
    }

    @Override // androidx.media3.common.z0
    public androidx.media3.common.o d1() {
        C4();
        return this.f66736v2;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @androidx.annotation.p0
    public z4 d2(int i10) {
        C4();
        return this.f66709i1[i10];
    }

    @Override // androidx.media3.common.z0
    public androidx.media3.common.d e() {
        C4();
        return this.f66712j2;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void e1(ExoPlayer.a aVar) {
        C4();
        this.f66721o1.remove(aVar);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public ExoPlayer.c e2() {
        return this.R1;
    }

    @Override // androidx.media3.common.z0
    public void f(float f10) {
        C4();
        final float fV = androidx.media3.common.util.k1.v(f10, 0.0f, 1.0f);
        if (this.f66714k2 == fV) {
            return;
        }
        this.f66714k2 = fV;
        this.f66717m1.D1(fV);
        this.f66719n1.l(22, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.x1
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((androidx.media3.common.z0.g) obj).B(fV);
            }
        });
    }

    @Override // androidx.media3.common.z0
    public void f0(@androidx.annotation.p0 TextureView textureView) {
        C4();
        if (textureView == null) {
            m0();
            return;
        }
        n4();
        this.f66700d2 = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            androidx.media3.common.util.z.n(C2, "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.A1);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            u4(null);
            h4(0, 0);
        } else {
            s4(surfaceTexture);
            h4(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void f1(List<androidx.media3.exoplayer.source.t0> list) {
        C4();
        a1(this.f66725q1.size(), list);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @androidx.annotation.p0
    public androidx.media3.common.w f2() {
        C4();
        return this.X1;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void g(final int i10) {
        C4();
        if (this.I1.d().intValue() == i10) {
            return;
        }
        this.I1.g(new com.google.common.base.t() { // from class: androidx.media3.exoplayer.z1
            @Override // com.google.common.base.t
            public final Object apply(Object obj) {
                return y2.X2(i10, (Integer) obj);
            }
        }, new com.google.common.base.t() { // from class: androidx.media3.exoplayer.a2
            @Override // com.google.common.base.t
            public final Object apply(Object obj) {
                return y2.P2(this.f62776a, i10, (Integer) obj);
            }
        });
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.exoplayer.trackselection.i0 g0() {
        C4();
        return new androidx.media3.exoplayer.trackselection.i0(this.f66742y2.f65825i.f65720c);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @Deprecated
    public void g1(androidx.media3.exoplayer.source.t0 t0Var) {
        C4();
        j2(t0Var);
        A();
    }

    @Override // androidx.media3.common.z0
    public void g2(int i10, List<androidx.media3.common.k0> list) {
        C4();
        a1(i10, T3(list));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public int getAudioSessionId() {
        C4();
        return this.I1.d().intValue();
    }

    @Override // androidx.media3.common.z0
    public long getCurrentPosition() {
        C4();
        return androidx.media3.common.util.k1.A2(X3(this.f66742y2));
    }

    @Override // androidx.media3.common.z0
    public long getDuration() {
        C4();
        if (!x()) {
            return N();
        }
        u4 u4Var = this.f66742y2;
        androidx.media3.exoplayer.source.t0.b bVar = u4Var.f65818b;
        u4Var.f65817a.l(bVar.f65467a, this.f66723p1);
        return androidx.media3.common.util.k1.A2(this.f66723p1.c(bVar.f65468b, bVar.f65469c));
    }

    @Override // androidx.media3.common.z0
    public void h(androidx.media3.common.y0 y0Var) {
        C4();
        if (y0Var == null) {
            y0Var = androidx.media3.common.y0.f61871d;
        }
        if (this.f66742y2.f65831o.equals(y0Var)) {
            return;
        }
        u4 u4VarG = this.f66742y2.g(y0Var);
        this.L1++;
        this.f66717m1.o1(y0Var);
        z4(u4VarG, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // androidx.media3.common.z0
    public androidx.media3.common.n4 h0() {
        C4();
        return this.f66738w2;
    }

    @Override // androidx.media3.common.z0
    public void h1(List<androidx.media3.common.k0> list, int i10, long j10) {
        C4();
        S0(T3(list), i10, j10);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void h2(int i10, androidx.media3.exoplayer.source.t0 t0Var) {
        C4();
        a1(i10, Collections.singletonList(t0Var));
    }

    @Override // androidx.media3.common.z0
    public void i(@androidx.annotation.p0 Surface surface) {
        C4();
        n4();
        u4(surface);
        int i10 = surface == null ? 0 : -1;
        h4(i10, i10);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public int i0(int i10) {
        C4();
        return this.f66707h1[i10].f();
    }

    @Override // androidx.media3.common.z0
    public long i1() {
        C4();
        return this.f66739x1;
    }

    @Override // androidx.media3.common.z0
    public void j(@androidx.annotation.p0 SurfaceView surfaceView) {
        C4();
        if (surfaceView instanceof androidx.media3.exoplayer.video.v) {
            n4();
            u4(surfaceView);
            r4(surfaceView.getHolder());
        } else {
            if (!(surfaceView instanceof androidx.media3.exoplayer.video.spherical.l)) {
                l(surfaceView == null ? null : surfaceView.getHolder());
                return;
            }
            n4();
            this.f66696b2 = (androidx.media3.exoplayer.video.spherical.l) surfaceView;
            U3(this.B1).t(10000).q(this.f66696b2).n();
            this.f66696b2.d(this.A1);
            u4(this.f66696b2.getVideoSurface());
            r4(surfaceView.getHolder());
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @androidx.annotation.p0
    public j j1() {
        C4();
        return this.f66708h2;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void j2(androidx.media3.exoplayer.source.t0 t0Var) {
        C4();
        H1(Collections.singletonList(t0Var));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void k(androidx.media3.exoplayer.video.w wVar) {
        C4();
        this.f66720n2 = wVar;
        U3(this.B1).t(7).q(wVar).n();
    }

    @Override // androidx.media3.common.z0
    public float k0() {
        C4();
        return this.f66714k2;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void k2(androidx.media3.exoplayer.video.w wVar) {
        C4();
        if (this.f66720n2 != wVar) {
            return;
        }
        U3(this.B1).t(7).q(null).n();
    }

    @Override // androidx.media3.common.z0
    public void l(@androidx.annotation.p0 SurfaceHolder surfaceHolder) {
        C4();
        if (surfaceHolder == null) {
            m0();
            return;
        }
        n4();
        this.f66698c2 = true;
        this.f66695a2 = surfaceHolder;
        surfaceHolder.addCallback(this.A1);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            u4(null);
            h4(0, 0);
        } else {
            u4(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            h4(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // androidx.media3.common.z0
    public int l0() {
        C4();
        int iY3 = Y3(this.f66742y2);
        if (iY3 == -1) {
            iY3 = 0;
        }
        return iY3;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @Deprecated
    public void l1(androidx.media3.exoplayer.source.t0 t0Var, boolean z10, boolean z11) {
        C4();
        B0(t0Var, z10);
        A();
    }

    @Override // androidx.media3.common.z0
    public void m(@androidx.annotation.p0 SurfaceHolder surfaceHolder) {
        C4();
        if (surfaceHolder == null || surfaceHolder != this.f66695a2) {
            return;
        }
        m0();
    }

    @Override // androidx.media3.common.z0
    public void m0() {
        C4();
        n4();
        u4(null);
        h4(0, 0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void m1(@androidx.annotation.p0 androidx.media3.common.b1 b1Var) {
        C4();
        if (Objects.equals(this.f66730s2, b1Var)) {
            return;
        }
        if (this.f66732t2) {
            ((androidx.media3.common.b1) androidx.media3.common.util.a.g(this.f66730s2)).e(this.f66728r2);
        }
        if (b1Var == null || !d()) {
            this.f66732t2 = false;
        } else {
            b1Var.a(this.f66728r2);
            this.f66732t2 = true;
        }
        this.f66730s2 = b1Var;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void m2(int i10) {
        C4();
        if (i10 == 0) {
            this.E1.c(false);
            this.F1.c(false);
        } else if (i10 == 1) {
            this.E1.c(true);
            this.F1.c(false);
        } else {
            if (i10 != 2) {
                return;
            }
            this.E1.c(true);
            this.F1.c(true);
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void n() {
        C4();
        t(new androidx.media3.common.f(0, 0.0f));
    }

    @Override // androidx.media3.common.z0
    public long n0() {
        C4();
        return W3(this.f66742y2);
    }

    @Override // androidx.media3.common.z0
    public void n1(final androidx.media3.common.e4 e4Var) {
        C4();
        if (!this.f66711j1.h() || e4Var.equals(this.f66711j1.c())) {
            return;
        }
        this.f66711j1.m(e4Var);
        this.f66719n1.l(19, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.p2
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((androidx.media3.common.z0.g) obj).k0(e4Var);
            }
        });
    }

    @Override // androidx.media3.common.z0
    public void o2(int i10, int i11, int i12) {
        C4();
        androidx.media3.common.util.a.a(i10 >= 0 && i10 <= i11 && i12 >= 0);
        int size = this.f66725q1.size();
        int iMin = Math.min(i11, size);
        int iMin2 = Math.min(i12, size - (iMin - i10));
        if (i10 < size && i10 != iMin && i10 != iMin2) {
            androidx.media3.common.z3 z3VarC0 = c0();
            this.L1++;
            androidx.media3.common.util.k1.C1(this.f66725q1, i10, iMin, iMin2);
            androidx.media3.common.z3 z3VarS3 = S3();
            u4 u4Var = this.f66742y2;
            u4 u4VarF4 = f4(u4Var, z3VarS3, Z3(z3VarC0, z3VarS3, Y3(u4Var), W3(this.f66742y2)));
            this.f66717m1.v0(i10, iMin, iMin2, this.Q1);
            z4(u4VarF4, 0, false, 5, -9223372036854775807L, -1, false);
        }
    }

    @Override // androidx.media3.common.z0
    public void p(@androidx.annotation.p0 TextureView textureView) {
        C4();
        if (textureView != null && textureView == this.f66700d2) {
            m0();
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public Looper p0() {
        return this.f66717m1.L();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.exoplayer.analytics.a p1() {
        C4();
        return this.f66731t1;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean q() {
        C4();
        return this.f66716l2;
    }

    @Override // androidx.media3.common.z0
    public boolean q1() {
        C4();
        w5 w5Var = this.D1;
        if (w5Var != null) {
            return w5Var.x();
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void q2(androidx.media3.exoplayer.video.spherical.a aVar) {
        C4();
        this.f66722o2 = aVar;
        U3(this.B1).t(8).q(aVar).n();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public f5 r() {
        C4();
        return this.P1;
    }

    @Override // androidx.media3.common.z0
    public void r0(@androidx.annotation.p0 SurfaceView surfaceView) {
        C4();
        m(surfaceView == null ? null : surfaceView.getHolder());
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void r1(androidx.media3.exoplayer.video.spherical.a aVar) {
        C4();
        if (this.f66722o2 != aVar) {
            return;
        }
        U3(this.B1).t(8).q(null).n();
    }

    @Override // androidx.media3.common.z0
    @Deprecated
    public void r2(int i10) {
        C4();
        w5 w5Var = this.D1;
        if (w5Var != null) {
            w5Var.C(i10, 1);
        }
    }

    @Override // androidx.media3.common.z0
    public void release() {
        androidx.media3.common.util.z.h(C2, "Release " + Integer.toHexString(System.identityHashCode(this)) + " [" + androidx.media3.common.p0.f61021c + "] [" + androidx.media3.common.util.k1.f61544e + "] [" + androidx.media3.common.p0.b() + "]");
        C4();
        this.C1.d(false);
        w5 w5Var = this.D1;
        if (w5Var != null) {
            w5Var.z();
        }
        this.E1.d(false);
        this.F1.d(false);
        y5 y5Var = this.H1;
        if (y5Var != null) {
            y5Var.d();
        }
        if (!this.f66717m1.C0()) {
            this.f66719n1.l(10, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.b2
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    ((androidx.media3.common.z0.g) obj).O(s0.o(new o3(1), 1003));
                }
            });
        }
        this.f66719n1.j();
        this.f66713k1.c(null);
        this.f66735v1.a(this.f66731t1);
        u4 u4Var = this.f66742y2;
        if (u4Var.f65832p) {
            this.f66742y2 = u4Var.a();
        }
        u4 u4VarE4 = e4(this.f66742y2, 1);
        this.f66742y2 = u4VarE4;
        u4 u4VarC = u4VarE4.c(u4VarE4.f65818b);
        this.f66742y2 = u4VarC;
        u4VarC.f65833q = u4VarC.f65835s;
        this.f66742y2.f65834r = 0L;
        this.f66731t1.release();
        n4();
        Surface surface = this.Z1;
        if (surface != null) {
            surface.release();
            this.Z1 = null;
        }
        if (this.f66732t2) {
            ((androidx.media3.common.b1) androidx.media3.common.util.a.g(this.f66730s2)).e(this.f66728r2);
            this.f66732t2 = false;
        }
        this.f66718m2 = androidx.media3.common.text.d.f61409c;
        this.f66734u2 = true;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public int s() {
        C4();
        return this.f66702e2;
    }

    @Override // androidx.media3.common.z0
    public boolean s0() {
        C4();
        return this.K1;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean s1() {
        C4();
        return this.f66742y2.f65832p;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void s2(androidx.media3.exoplayer.source.t0 t0Var) {
        C4();
        f1(Collections.singletonList(t0Var));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setImageOutput(@androidx.annotation.p0 ImageOutput imageOutput) {
        C4();
        o4(4, 15, imageOutput);
    }

    @Override // androidx.media3.common.z0
    public void stop() {
        C4();
        v4(null);
        this.f66718m2 = new androidx.media3.common.text.d(l6.F(), this.f66742y2.f65835s);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void t(androidx.media3.common.f fVar) {
        C4();
        o4(1, 6, fVar);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void t0(final boolean z10) {
        C4();
        if (this.f66716l2 == z10) {
            return;
        }
        this.f66716l2 = z10;
        o4(1, 9, Boolean.valueOf(z10));
        this.f66719n1.l(23, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.w1
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((androidx.media3.common.z0.g) obj).g(z10);
            }
        });
    }

    void t4(boolean z10) {
        this.f66724p2 = z10;
        this.f66719n1.m(z10);
        androidx.media3.exoplayer.analytics.a aVar = this.f66731t1;
        if (aVar instanceof androidx.media3.exoplayer.analytics.w1) {
            ((androidx.media3.exoplayer.analytics.w1) aVar).c2(z10);
        }
    }

    @Override // androidx.media3.common.z0
    public void u(@androidx.annotation.p0 Surface surface) {
        C4();
        if (surface != null && surface == this.Y1) {
            m0();
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean u0() {
        C4();
        for (c5 c5Var : this.f66742y2.f65825i.f65719b) {
            if (c5Var != null && c5Var.f63544b) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @androidx.annotation.p0
    public j u1() {
        C4();
        return this.f66710i2;
    }

    @Override // androidx.media3.common.z0
    public androidx.media3.common.q0 u2() {
        C4();
        return this.U1;
    }

    @Override // androidx.media3.common.z0
    public long v() {
        C4();
        if (!x()) {
            return R();
        }
        u4 u4Var = this.f66742y2;
        return u4Var.f65827k.equals(u4Var.f65818b) ? androidx.media3.common.util.k1.A2(this.f66742y2.f65833q) : getDuration();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void v1(int i10) {
        C4();
        if (this.f66728r2 == i10) {
            return;
        }
        if (this.f66732t2) {
            androidx.media3.common.b1 b1Var = (androidx.media3.common.b1) androidx.media3.common.util.a.g(this.f66730s2);
            b1Var.a(i10);
            b1Var.e(this.f66728r2);
        }
        this.f66728r2 = i10;
        p4(16, Integer.valueOf(i10));
    }

    @Override // androidx.media3.common.z0
    public long v2() {
        C4();
        return this.f66737w1;
    }

    @Override // androidx.media3.common.z0
    public void w(int i10, int i11, List<androidx.media3.common.k0> list) {
        C4();
        androidx.media3.common.util.a.a(i10 >= 0 && i11 >= i10);
        int size = this.f66725q1.size();
        if (i10 > size) {
            return;
        }
        int iMin = Math.min(i11, size);
        if (P3(i10, iMin, list)) {
            x4(i10, iMin, list);
            return;
        }
        List<androidx.media3.exoplayer.source.t0> listT3 = T3(list);
        if (this.f66725q1.isEmpty()) {
            N1(listT3, this.f66744z2 == -1);
        } else {
            u4 u4VarL4 = l4(N3(this.f66742y2, iMin, listT3), i10, iMin);
            z4(u4VarL4, 0, !u4VarL4.f65818b.f65467a.equals(this.f66742y2.f65818b.f65467a), 4, X3(u4VarL4), -1, false);
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void w0(androidx.media3.exoplayer.source.u1 u1Var) {
        C4();
        androidx.media3.common.util.a.a(u1Var.getLength() == this.f66725q1.size());
        this.Q1 = u1Var;
        androidx.media3.common.z3 z3VarS3 = S3();
        u4 u4VarF4 = f4(this.f66742y2, z3VarS3, g4(z3VarS3, l0(), getCurrentPosition()));
        this.L1++;
        this.f66717m1.y1(u1Var);
        z4(u4VarF4, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // androidx.media3.common.z0
    public boolean x() {
        C4();
        return this.f66742y2.f65818b.c();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.common.util.j x0() {
        return this.f66743z1;
    }

    @Override // androidx.media3.common.z0
    public long y() {
        C4();
        return androidx.media3.common.util.k1.A2(this.f66742y2.f65834r);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.exoplayer.trackselection.k0 y0() {
        C4();
        return this.f66711j1;
    }

    @Override // androidx.media3.common.z0
    public void y1(boolean z10, int i10) {
        C4();
        w5 w5Var = this.D1;
        if (w5Var != null) {
            w5Var.A(z10, i10);
        }
    }

    @Override // androidx.media3.common.z0
    public void z0(List<androidx.media3.common.k0> list, boolean z10) {
        C4();
        N1(T3(list), z10);
    }

    @Override // androidx.media3.common.g
    protected void z2(int i10, long j10, int i11, boolean z10) {
        C4();
        if (i10 == -1) {
            return;
        }
        androidx.media3.common.util.a.a(i10 >= 0);
        androidx.media3.common.z3 z3Var = this.f66742y2.f65817a;
        if (z3Var.w() || i10 < z3Var.v()) {
            this.f66731t1.i0();
            this.L1++;
            if (x()) {
                androidx.media3.common.util.z.n(C2, "seekTo ignored because an ad is playing");
                n3.e eVar = new n3.e(this.f66742y2);
                eVar.b(1);
                this.f66715l1.a(eVar);
                return;
            }
            u4 u4VarE4 = this.f66742y2;
            int i12 = u4VarE4.f65821e;
            if (i12 == 3 || (i12 == 4 && !z3Var.w())) {
                u4VarE4 = e4(this.f66742y2, 2);
            }
            int iL0 = l0();
            u4 u4VarF4 = f4(u4VarE4, z3Var, g4(z3Var, i10, j10));
            this.f66717m1.T0(z3Var, i10, androidx.media3.common.util.k1.D1(j10));
            z4(u4VarF4, 0, true, 1, X3(u4VarF4), iL0, z10);
        }
    }

    @Override // androidx.media3.common.z0
    @androidx.annotation.p0
    public s0 a() {
        C4();
        return this.f66742y2.f65822f;
    }
}
