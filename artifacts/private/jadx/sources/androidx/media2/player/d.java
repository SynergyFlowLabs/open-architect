package androidx.media2.player;

import android.content.Context;
import android.media.MediaDrm;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PersistableBundle;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.w0;
import androidx.media.AudioAttributesCompat;
import androidx.media2.common.MediaItem;
import androidx.media2.common.SessionPlayer;
import androidx.media2.common.SubtitleData;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes2.dex */
@e.a({"RestrictedApi"})
final class d extends androidx.media2.player.m implements androidx.media2.player.f.d {
    private static final String C0 = "ExoPlayerMediaPlayer2";

    @androidx.annotation.b0("mLock")
    private Pair<Executor, androidx.media2.player.m.c> A0;

    @androidx.annotation.b0("mLock")
    private HandlerThread B0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    final androidx.media2.player.f f58184t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private final Handler f58185u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    @androidx.annotation.b0("mTaskLock")
    final ArrayDeque<u0> f58186v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    final Object f58187w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @androidx.annotation.b0("mTaskLock")
    u0 f58188x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    final Object f58189y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    private Pair<Executor, androidx.media2.player.m.e> f58190z0;

    class a extends u0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f58191f;

        /* JADX INFO: renamed from: androidx.media2.player.d$a$a, reason: collision with other inner class name */
        class C0537a implements t0 {
            C0537a() {
            }

            @Override // androidx.media2.player.d.t0
            public void a(androidx.media2.player.m.e eVar) {
                a aVar = a.this;
                eVar.b(d.this, aVar.f58191f);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, boolean z10, Object obj) {
            super(i10, z10);
            this.f58191f = obj;
        }

        @Override // androidx.media2.player.d.u0
        void a() {
            d.this.w0(new C0537a());
        }
    }

    class a0 implements Callable<PersistableBundle> {
        a0() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PersistableBundle call() throws Exception {
            return d.this.f58184t0.k();
        }
    }

    class b implements Callable<Long> {
        b() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long call() throws Exception {
            return Long.valueOf(d.this.f58184t0.h());
        }
    }

    class b0 implements Callable<androidx.media2.player.n> {
        b0() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public androidx.media2.player.n call() {
            return d.this.f58184t0.o();
        }
    }

    class c implements Callable<Long> {
        c() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long call() throws Exception {
            return Long.valueOf(d.this.f58184t0.i());
        }
    }

    class c0 implements Callable<Void> {
        c0() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            d.this.f58184t0.O();
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.media2.player.d$d, reason: collision with other inner class name */
    class CallableC0538d implements Callable<Long> {
        CallableC0538d() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long call() throws Exception {
            return Long.valueOf(d.this.f58184t0.f());
        }
    }

    class d0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.concurrent.futures.e f58200a;

        d0(androidx.concurrent.futures.e eVar) {
            this.f58200a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                d.this.f58184t0.b();
                this.f58200a.E(null);
            } catch (Throwable th2) {
                this.f58200a.H(th2);
            }
        }
    }

    class e implements Callable<Integer> {
        e() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call() throws Exception {
            return Integer.valueOf(d.this.f58184t0.n());
        }
    }

    class e0 implements t0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MediaItem f58203a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f58204b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f58205c;

        e0(MediaItem mediaItem, int i10, int i11) {
            this.f58203a = mediaItem;
            this.f58204b = i10;
            this.f58205c = i11;
        }

        @Override // androidx.media2.player.d.t0
        public void a(androidx.media2.player.m.e eVar) {
            eVar.i(d.this, this.f58203a, this.f58204b, this.f58205c);
        }
    }

    class f extends u0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f58207f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i10, boolean z10, boolean z11) {
            super(i10, z10);
            this.f58207f = z11;
        }

        @Override // androidx.media2.player.d.u0
        void a() {
            d.this.f58184t0.F(this.f58207f);
        }
    }

    class f0 implements t0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MediaItem f58209a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SessionPlayer.TrackInfo f58210b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SubtitleData f58211c;

        f0(MediaItem mediaItem, SessionPlayer.TrackInfo trackInfo, SubtitleData subtitleData) {
            this.f58209a = mediaItem;
            this.f58210b = trackInfo;
            this.f58211c = subtitleData;
        }

        @Override // androidx.media2.player.d.t0
        public void a(androidx.media2.player.m.e eVar) {
            eVar.f(d.this, this.f58209a, this.f58210b, this.f58211c);
        }
    }

    class g extends u0 {
        g(int i10, boolean z10) {
            super(i10, z10);
        }

        @Override // androidx.media2.player.d.u0
        void a() {
            d.this.f58184t0.a0();
        }
    }

    class g0 extends u0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f58214f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g0(int i10, boolean z10, int i11) {
            super(i10, z10);
            this.f58214f = i11;
        }

        @Override // androidx.media2.player.d.u0
        void a() {
            d.this.f58184t0.S(this.f58214f);
        }
    }

    class h extends u0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ MediaItem f58216f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i10, boolean z10, MediaItem mediaItem) {
            super(i10, z10);
            this.f58216f = mediaItem;
        }

        @Override // androidx.media2.player.d.u0
        void a() {
            d.this.f58184t0.V(this.f58216f);
        }
    }

    class h0 implements t0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MediaItem f58218a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.media2.player.t f58219b;

        h0(MediaItem mediaItem, androidx.media2.player.t tVar) {
            this.f58218a = mediaItem;
            this.f58219b = tVar;
        }

        @Override // androidx.media2.player.d.t0
        public void a(androidx.media2.player.m.e eVar) {
            eVar.g(d.this, this.f58218a, this.f58219b);
        }
    }

    class i extends u0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f58221f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(int i10, boolean z10, List list) {
            super(i10, z10);
            this.f58221f = list;
        }

        @Override // androidx.media2.player.d.u0
        void a() {
            d.this.f58184t0.W(this.f58221f);
        }
    }

    class i0 implements t0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MediaItem f58223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.media2.player.n f58224b;

        i0(MediaItem mediaItem, androidx.media2.player.n nVar) {
            this.f58223a = mediaItem;
            this.f58224b = nVar;
        }

        @Override // androidx.media2.player.d.t0
        public void a(androidx.media2.player.m.e eVar) {
            eVar.e(d.this, this.f58223a, this.f58224b);
        }
    }

    class j extends u0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ AudioAttributesCompat f58226f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(int i10, boolean z10, AudioAttributesCompat audioAttributesCompat) {
            super(i10, z10);
            this.f58226f = audioAttributesCompat;
        }

        @Override // androidx.media2.player.d.u0
        void a() {
            d.this.f58184t0.R(this.f58226f);
        }
    }

    class j0 implements t0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MediaItem f58228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f58229b;

        j0(MediaItem mediaItem, int i10) {
            this.f58228a = mediaItem;
            this.f58229b = i10;
        }

        @Override // androidx.media2.player.d.t0
        public void a(androidx.media2.player.m.e eVar) {
            eVar.c(d.this, this.f58228a, this.f58229b, 0);
        }
    }

    class k implements Callable<AudioAttributesCompat> {
        k() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AudioAttributesCompat call() throws Exception {
            return d.this.f58184t0.d();
        }
    }

    class k0 implements t0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MediaItem f58232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f58233b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f58234c;

        k0(MediaItem mediaItem, int i10, int i11) {
            this.f58232a = mediaItem;
            this.f58233b = i10;
            this.f58234c = i11;
        }

        @Override // androidx.media2.player.d.t0
        public void a(androidx.media2.player.m.e eVar) {
            eVar.d(d.this, this.f58232a, this.f58233b, this.f58234c);
        }
    }

    class l implements Callable<Integer> {
        l() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call() throws Exception {
            return Integer.valueOf(d.this.f58184t0.e());
        }
    }

    class l0 implements Callable<Void> {
        l0() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            d.this.f58184t0.O();
            return null;
        }
    }

    class m extends u0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f58238f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(int i10, boolean z10, int i11) {
            super(i10, z10);
            this.f58238f = i11;
        }

        @Override // androidx.media2.player.d.u0
        void a() {
            d.this.f58184t0.a(this.f58238f);
        }
    }

    class m0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.concurrent.futures.e f58240a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Callable f58241b;

        m0(androidx.concurrent.futures.e eVar, Callable callable) {
            this.f58240a = eVar;
            this.f58241b = callable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f58240a.E(this.f58241b.call());
            } catch (Throwable th2) {
                this.f58240a.H(th2);
            }
        }
    }

    class n extends u0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f58243f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(int i10, boolean z10, float f10) {
            super(i10, z10);
            this.f58243f = f10;
        }

        @Override // androidx.media2.player.d.u0
        void a() {
            d.this.f58184t0.T(this.f58243f);
        }
    }

    class n0 extends u0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ MediaItem f58245f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n0(int i10, boolean z10, MediaItem mediaItem) {
            super(i10, z10);
            this.f58245f = mediaItem;
        }

        @Override // androidx.media2.player.d.u0
        void a() {
            d.this.f58184t0.U(this.f58245f);
        }
    }

    class o extends u0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.media2.player.p f58247f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(int i10, boolean z10, androidx.media2.player.p pVar) {
            super(i10, z10);
            this.f58247f = pVar;
        }

        @Override // androidx.media2.player.d.u0
        void a() {
            d.this.f58184t0.X(this.f58247f);
        }
    }

    class o0 implements Callable<MediaItem> {
        o0() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaItem call() throws Exception {
            return d.this.f58184t0.g();
        }
    }

    class p implements Callable<androidx.media2.player.p> {
        p() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public androidx.media2.player.p call() throws Exception {
            return d.this.f58184t0.l();
        }
    }

    class p0 extends u0 {
        p0(int i10, boolean z10) {
            super(i10, z10);
        }

        @Override // androidx.media2.player.d.u0
        void a() {
            d.this.f58184t0.N();
        }
    }

    class q implements Callable<Integer> {
        q() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call() throws Exception {
            return Integer.valueOf(d.this.f58184t0.r());
        }
    }

    class q0 extends u0 {
        q0(int i10, boolean z10) {
            super(i10, z10);
        }

        @Override // androidx.media2.player.d.u0
        void a() {
            d.this.f58184t0.M();
        }
    }

    class r implements Callable<Integer> {
        r() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call() throws Exception {
            return Integer.valueOf(d.this.f58184t0.q());
        }
    }

    class r0 extends u0 {
        r0(int i10, boolean z10) {
            super(i10, z10);
        }

        @Override // androidx.media2.player.d.u0
        void a() {
            d.this.f58184t0.L();
        }
    }

    class s extends u0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Surface f58256f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(int i10, boolean z10, Surface surface) {
            super(i10, z10);
            this.f58256f = surface;
        }

        @Override // androidx.media2.player.d.u0
        void a() {
            d.this.f58184t0.Y(this.f58256f);
        }
    }

    class s0 extends u0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f58258f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f58259g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s0(int i10, boolean z10, long j10, int i11) {
            super(i10, z10);
            this.f58258f = j10;
            this.f58259g = i11;
        }

        @Override // androidx.media2.player.d.u0
        void a() {
            d.this.f58184t0.P(this.f58258f, this.f58259g);
        }
    }

    class t extends u0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f58261f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(int i10, boolean z10, float f10) {
            super(i10, z10);
            this.f58261f = f10;
        }

        @Override // androidx.media2.player.d.u0
        void a() {
            d.this.f58184t0.Z(this.f58261f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface t0 {
        void a(androidx.media2.player.m.e eVar);
    }

    class u implements Callable<Float> {
        u() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float call() throws Exception {
            return Float.valueOf(d.this.f58184t0.s());
        }
    }

    private abstract class u0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f58264a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean f58265b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        MediaItem f58266c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.b0("this")
        boolean f58267d;

        class a implements t0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f58269a;

            a(int i10) {
                this.f58269a = i10;
            }

            @Override // androidx.media2.player.d.t0
            public void a(androidx.media2.player.m.e eVar) {
                u0 u0Var = u0.this;
                eVar.a(d.this, u0Var.f58266c, u0Var.f58264a, this.f58269a);
            }
        }

        u0(int i10, boolean z10) {
            this.f58264a = i10;
            this.f58265b = z10;
        }

        abstract void a() throws androidx.media2.player.m.j, IOException;

        void b(int i10) {
            if (this.f58264a >= 1000) {
                return;
            }
            d.this.w0(new a(i10));
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            int i10 = 0;
            if (this.f58264a == 14) {
                synchronized (d.this.f58187w0) {
                    try {
                        u0 u0VarPeekFirst = d.this.f58186v0.peekFirst();
                        z10 = u0VarPeekFirst != null && u0VarPeekFirst.f58264a == 14;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } else {
                z10 = false;
            }
            if (z10) {
                i10 = 5;
            } else {
                try {
                    if (this.f58264a == 1000 || !d.this.f58184t0.E()) {
                        a();
                    } else {
                        i10 = 1;
                    }
                } catch (IOException unused) {
                    i10 = 4;
                } catch (IllegalArgumentException unused2) {
                    i10 = 2;
                } catch (IllegalStateException unused3) {
                } catch (SecurityException unused4) {
                    i10 = 3;
                } catch (Exception unused5) {
                    i10 = Integer.MIN_VALUE;
                }
            }
            this.f58266c = d.this.f58184t0.g();
            if (!this.f58265b || i10 != 0 || z10) {
                b(i10);
                synchronized (d.this.f58187w0) {
                    try {
                        d dVar = d.this;
                        dVar.f58188x0 = null;
                        dVar.z0();
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
            synchronized (this) {
                try {
                    this.f58267d = true;
                    notifyAll();
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    class v implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t0 f58271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.media2.player.m.e f58272b;

        v(t0 t0Var, androidx.media2.player.m.e eVar) {
            this.f58271a = t0Var;
            this.f58272b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f58271a.a(this.f58272b);
        }
    }

    class w implements Callable<List<SessionPlayer.TrackInfo>> {
        w() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<SessionPlayer.TrackInfo> call() throws Exception {
            return d.this.f58184t0.p();
        }
    }

    class x implements Callable<SessionPlayer.TrackInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f58275a;

        x(int i10) {
            this.f58275a = i10;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SessionPlayer.TrackInfo call() {
            return d.this.f58184t0.m(this.f58275a);
        }
    }

    class y extends u0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f58277f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(int i10, boolean z10, int i11) {
            super(i10, z10);
            this.f58277f = i11;
        }

        @Override // androidx.media2.player.d.u0
        void a() {
            d.this.f58184t0.Q(this.f58277f);
        }
    }

    class z extends u0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f58279f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(int i10, boolean z10, int i11) {
            super(i10, z10);
            this.f58279f = i11;
        }

        @Override // androidx.media2.player.d.u0
        void a() {
            d.this.f58184t0.c(this.f58279f);
        }
    }

    d(@NonNull Context context) {
        HandlerThread handlerThread = new HandlerThread("ExoMediaPlayer2Thread");
        this.B0 = handlerThread;
        handlerThread.start();
        androidx.media2.player.f fVar = new androidx.media2.player.f(context.getApplicationContext(), this, this.B0.getLooper());
        this.f58184t0 = fVar;
        this.f58185u0 = new Handler(fVar.j());
        this.f58186v0 = new ArrayDeque<>();
        this.f58187w0 = new Object();
        this.f58189y0 = new Object();
        A0();
    }

    private void A0() {
        B0(new l0());
    }

    private <T> T B0(Callable<T> callable) {
        androidx.concurrent.futures.e eVarN = androidx.concurrent.futures.e.N();
        synchronized (this.f58189y0) {
            try {
                androidx.core.util.t.l(this.B0);
                androidx.core.util.t.n(this.f58185u0.post(new m0(eVarN, callable)));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return (T) v0(eVarN);
    }

    public static /* synthetic */ void t0(d dVar, List list, androidx.media2.player.m.e eVar) {
        dVar.getClass();
        eVar.h(dVar, list);
    }

    private Object u0(u0 u0Var) {
        synchronized (this.f58187w0) {
            this.f58186v0.add(u0Var);
            z0();
        }
        return u0Var;
    }

    private static <T> T v0(androidx.concurrent.futures.e<T> eVar) {
        T t10;
        boolean z10 = false;
        while (true) {
            try {
                try {
                    t10 = eVar.get();
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                }
            } catch (ExecutionException e10) {
                Throwable cause = e10.getCause();
                new RuntimeException(cause);
                throw new IllegalStateException(cause);
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return t10;
    }

    private void x0(MediaItem mediaItem, int i10) {
        y0(mediaItem, i10, 0);
    }

    private void y0(MediaItem mediaItem, int i10, int i11) {
        w0(new k0(mediaItem, i10, i11));
    }

    @Override // androidx.media2.player.m
    public int A() {
        return ((Integer) B0(new l())).intValue();
    }

    @Override // androidx.media2.player.m
    public long B() {
        return ((Long) B0(new CallableC0538d())).longValue();
    }

    @Override // androidx.media2.player.m
    public MediaItem C() {
        return (MediaItem) B0(new o0());
    }

    @Override // androidx.media2.player.m
    public long D() {
        return ((Long) B0(new b())).longValue();
    }

    @Override // androidx.media2.player.m
    public androidx.media2.player.m.d E() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media2.player.m
    @NonNull
    public MediaDrm.KeyRequest F(byte[] bArr, byte[] bArr2, String str, int i10, Map<String, String> map) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media2.player.m
    @NonNull
    public String G(@NonNull String str) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media2.player.m
    public long H() {
        return ((Long) B0(new c())).longValue();
    }

    @Override // androidx.media2.player.m
    @w0(21)
    public PersistableBundle J() {
        return (PersistableBundle) B0(new a0());
    }

    @Override // androidx.media2.player.m
    @NonNull
    public androidx.media2.player.p K() {
        return (androidx.media2.player.p) B0(new p());
    }

    @Override // androidx.media2.player.m
    public float L() {
        return ((Float) B0(new u())).floatValue();
    }

    @Override // androidx.media2.player.m
    @androidx.annotation.p0
    public SessionPlayer.TrackInfo M(int i10) {
        return (SessionPlayer.TrackInfo) B0(new x(i10));
    }

    @Override // androidx.media2.player.m
    public int N() {
        return ((Integer) B0(new e())).intValue();
    }

    @Override // androidx.media2.player.m
    public androidx.media2.player.n O() {
        return (androidx.media2.player.n) B0(new b0());
    }

    @Override // androidx.media2.player.m
    @NonNull
    public List<SessionPlayer.TrackInfo> P() {
        return (List) B0(new w());
    }

    @Override // androidx.media2.player.m
    public int Q() {
        return ((Integer) B0(new r())).intValue();
    }

    @Override // androidx.media2.player.m
    public int R() {
        return ((Integer) B0(new q())).intValue();
    }

    @Override // androidx.media2.player.m
    public Object S(boolean z10) {
        return u0(new f(3, false, z10));
    }

    @Override // androidx.media2.player.m
    public Object T(@NonNull Object obj) {
        return u0(new a(1000, false, obj));
    }

    @Override // androidx.media2.player.m
    public Object U() {
        return u0(new r0(4, false));
    }

    @Override // androidx.media2.player.m
    public Object V() {
        return u0(new q0(5, false));
    }

    @Override // androidx.media2.player.m
    public Object W() {
        return u0(new p0(6, true));
    }

    @Override // androidx.media2.player.m
    public Object X(@NonNull UUID uuid) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media2.player.m
    public byte[] Y(@androidx.annotation.p0 byte[] bArr, @NonNull byte[] bArr2) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media2.player.m
    public void Z() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media2.player.f.d
    public void a(MediaItem mediaItem) {
        x0(mediaItem, 3);
    }

    @Override // androidx.media2.player.m
    public void a0() {
        u0 u0Var;
        v();
        synchronized (this.f58187w0) {
            try {
                u0Var = this.f58188x0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (u0Var != null) {
            synchronized (u0Var) {
                while (!u0Var.f58267d) {
                    try {
                        try {
                            u0Var.wait();
                        } catch (InterruptedException unused) {
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        }
        B0(new c0());
    }

    @Override // androidx.media2.player.f.d
    public void b(MediaItem mediaItem, int i10) {
        y0(mediaItem, 704, i10);
    }

    @Override // androidx.media2.player.m
    public void b0(@NonNull byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media2.player.f.d
    public void c(MediaItem mediaItem) {
        x0(mediaItem, 702);
    }

    @Override // androidx.media2.player.f.d
    public void d(MediaItem mediaItem, androidx.media2.player.t tVar) {
        w0(new h0(mediaItem, tVar));
    }

    @Override // androidx.media2.player.m
    public Object d0(long j10, int i10) {
        return u0(new s0(14, true, j10, i10));
    }

    @Override // androidx.media2.player.f.d
    public void e(@NonNull final List<SessionPlayer.TrackInfo> list) {
        w0(new t0() { // from class: androidx.media2.player.c
            @Override // androidx.media2.player.d.t0
            public final void a(m.e eVar) {
                d.t0(this.f58182a, list, eVar);
            }
        });
    }

    @Override // androidx.media2.player.m
    @NonNull
    public Object e0(int i10) {
        return u0(new y(15, false, i10));
    }

    @Override // androidx.media2.player.f.d
    public void f(MediaItem mediaItem) {
        x0(mediaItem, 2);
    }

    @Override // androidx.media2.player.m
    public Object f0(@NonNull AudioAttributesCompat audioAttributesCompat) {
        return u0(new j(16, false, audioAttributesCompat));
    }

    @Override // androidx.media2.player.f.d
    public void g(MediaItem mediaItem, int i10) {
        y0(mediaItem, 703, i10);
    }

    @Override // androidx.media2.player.m
    public Object g0(int i10) {
        return u0(new g0(17, false, i10));
    }

    @Override // androidx.media2.player.f.d
    public void h(MediaItem mediaItem) {
        x0(mediaItem, 701);
    }

    @Override // androidx.media2.player.m
    public Object h0(float f10) {
        return u0(new n(18, false, f10));
    }

    @Override // androidx.media2.player.f.d
    public void i(MediaItem mediaItem) {
        x0(mediaItem, 5);
    }

    @Override // androidx.media2.player.m
    public void i0(@NonNull Executor executor, @NonNull androidx.media2.player.m.c cVar) {
        androidx.core.util.t.l(executor);
        androidx.core.util.t.l(cVar);
        synchronized (this.f58189y0) {
            this.A0 = Pair.create(executor, cVar);
        }
    }

    @Override // androidx.media2.player.f.d
    public void j(MediaItem mediaItem) {
        x0(mediaItem, 7);
    }

    @Override // androidx.media2.player.m
    public void j0(@NonNull String str, @NonNull String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media2.player.f.d
    public void k(MediaItem mediaItem, int i10) {
        synchronized (this.f58187w0) {
            try {
                u0 u0Var = this.f58188x0;
                if (u0Var != null && u0Var.f58265b) {
                    u0Var.b(Integer.MIN_VALUE);
                    this.f58188x0 = null;
                    z0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        w0(new j0(mediaItem, i10));
    }

    @Override // androidx.media2.player.m
    public void k0(@NonNull Executor executor, @NonNull androidx.media2.player.m.e eVar) {
        androidx.core.util.t.l(executor);
        androidx.core.util.t.l(eVar);
        synchronized (this.f58189y0) {
            try {
                this.f58190z0 = Pair.create(executor, eVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.player.f.d
    public void l(MediaItem mediaItem) {
        x0(mediaItem, 6);
    }

    @Override // androidx.media2.player.m
    public Object l0(@NonNull MediaItem mediaItem) {
        return u0(new n0(19, false, mediaItem));
    }

    @Override // androidx.media2.player.f.d
    public void m() {
        synchronized (this.f58187w0) {
            try {
                u0 u0Var = this.f58188x0;
                if (u0Var != null && u0Var.f58264a == 14 && u0Var.f58265b) {
                    u0Var.b(0);
                    this.f58188x0 = null;
                    z0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.player.m
    public Object m0(@NonNull MediaItem mediaItem) {
        return u0(new h(22, false, mediaItem));
    }

    @Override // androidx.media2.player.f.d
    public void n(MediaItem mediaItem, int i10, int i11) {
        w0(new e0(mediaItem, i10, i11));
    }

    @Override // androidx.media2.player.m
    public Object n0(@NonNull List<MediaItem> list) {
        return u0(new i(23, false, list));
    }

    @Override // androidx.media2.player.f.d
    public void o(@NonNull MediaItem mediaItem, @NonNull SessionPlayer.TrackInfo trackInfo, @NonNull SubtitleData subtitleData) {
        w0(new f0(mediaItem, trackInfo, subtitleData));
    }

    @Override // androidx.media2.player.m
    public void o0(androidx.media2.player.m.k kVar) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media2.player.f.d
    public void p(MediaItem mediaItem) {
        x0(mediaItem, 100);
        synchronized (this.f58187w0) {
            try {
                u0 u0Var = this.f58188x0;
                if (u0Var != null && u0Var.f58264a == 6 && androidx.core.util.o.a(u0Var.f58266c, mediaItem)) {
                    u0 u0Var2 = this.f58188x0;
                    if (u0Var2.f58265b) {
                        u0Var2.b(0);
                        this.f58188x0 = null;
                        z0();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.player.m
    public Object p0(@NonNull androidx.media2.player.p pVar) {
        return u0(new o(24, false, pVar));
    }

    @Override // androidx.media2.player.f.d
    public void q(MediaItem mediaItem, androidx.media2.player.n nVar) {
        w0(new i0(mediaItem, nVar));
    }

    @Override // androidx.media2.player.m
    public Object q0(float f10) {
        return u0(new t(26, false, f10));
    }

    @Override // androidx.media2.player.m
    public Object r(int i10) {
        return u0(new m(1, false, i10));
    }

    @Override // androidx.media2.player.m
    public Object r0(Surface surface) {
        return u0(new s(27, false, surface));
    }

    @Override // androidx.media2.player.m
    public boolean s(Object obj) {
        boolean zRemove;
        synchronized (this.f58187w0) {
            try {
                zRemove = this.f58186v0.remove(obj);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zRemove;
    }

    @Override // androidx.media2.player.m
    public Object s0() {
        return u0(new g(29, false));
    }

    @Override // androidx.media2.player.m
    public void t() {
        synchronized (this.f58189y0) {
            this.A0 = null;
        }
    }

    @Override // androidx.media2.player.m
    public void u() {
        synchronized (this.f58189y0) {
            this.f58190z0 = null;
        }
    }

    @Override // androidx.media2.player.m
    public void v() {
        synchronized (this.f58187w0) {
            this.f58186v0.clear();
        }
    }

    @Override // androidx.media2.player.m
    public void w() {
        u();
        synchronized (this.f58189y0) {
            try {
                HandlerThread handlerThread = this.B0;
                if (handlerThread == null) {
                    return;
                }
                this.B0 = null;
                androidx.concurrent.futures.e eVarN = androidx.concurrent.futures.e.N();
                this.f58185u0.post(new d0(eVarN));
                v0(eVarN);
                handlerThread.quit();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void w0(t0 t0Var) {
        Pair<Executor, androidx.media2.player.m.e> pair;
        synchronized (this.f58189y0) {
            pair = this.f58190z0;
        }
        if (pair != null) {
            try {
                ((Executor) pair.first).execute(new v(t0Var, (androidx.media2.player.m.e) pair.second));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    @Override // androidx.media2.player.m
    @NonNull
    public Object y(int i10) {
        return u0(new z(2, false, i10));
    }

    @Override // androidx.media2.player.m
    public AudioAttributesCompat z() {
        return (AudioAttributesCompat) B0(new k());
    }

    @androidx.annotation.b0("mTaskLock")
    void z0() {
        if (this.f58188x0 != null || this.f58186v0.isEmpty()) {
            return;
        }
        u0 u0VarRemoveFirst = this.f58186v0.removeFirst();
        this.f58188x0 = u0VarRemoveFirst;
        this.f58185u0.post(u0VarRemoveFirst);
    }
}
