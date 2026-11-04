package androidx.media3.exoplayer;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public class m implements s3 {
    public static final int A = 144310272;
    public static final int B = 13107200;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f63997m = 50000;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f63998n = 50000;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f63999o = 1000;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f64000p = 2000;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f64001q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final boolean f64002r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f64003s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final boolean f64004t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f64005u = 131072000;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f64006v = 13107200;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f64007w = 131072;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f64008x = 131072;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f64009y = 131072;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f64010z = 131072;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.i f64011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f64012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f64013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f64014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f64015f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f64016g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f64017h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f64018i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f64019j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final HashMap<androidx.media3.exoplayer.analytics.j4, c> f64020k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f64021l;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.p0
        private androidx.media3.exoplayer.upstream.i f64022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f64023b = 50000;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f64024c = 50000;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f64025d = 1000;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f64026e = 2000;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f64027f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f64028g = false;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f64029h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f64030i = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f64031j;

        public m a() {
            androidx.media3.common.util.a.i(!this.f64031j);
            this.f64031j = true;
            if (this.f64022a == null) {
                this.f64022a = new androidx.media3.exoplayer.upstream.i(true, 65536);
            }
            return new m(this.f64022a, this.f64023b, this.f64024c, this.f64025d, this.f64026e, this.f64027f, this.f64028g, this.f64029h, this.f64030i);
        }

        @z7.a
        public b b(androidx.media3.exoplayer.upstream.i iVar) {
            androidx.media3.common.util.a.i(!this.f64031j);
            this.f64022a = iVar;
            return this;
        }

        @z7.a
        public b c(int i10, boolean z10) {
            androidx.media3.common.util.a.i(!this.f64031j);
            m.w(i10, 0, "backBufferDurationMs", com.facebook.appevents.p.f99189d0);
            this.f64029h = i10;
            this.f64030i = z10;
            return this;
        }

        @z7.a
        public b d(int i10, int i11, int i12, int i13) {
            androidx.media3.common.util.a.i(!this.f64031j);
            m.w(i12, 0, "bufferForPlaybackMs", com.facebook.appevents.p.f99189d0);
            m.w(i13, 0, "bufferForPlaybackAfterRebufferMs", com.facebook.appevents.p.f99189d0);
            m.w(i10, i12, "minBufferMs", "bufferForPlaybackMs");
            m.w(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            m.w(i11, i10, "maxBufferMs", "minBufferMs");
            this.f64023b = i10;
            this.f64024c = i11;
            this.f64025d = i12;
            this.f64026e = i13;
            return this;
        }

        @z7.a
        public b e(boolean z10) {
            androidx.media3.common.util.a.i(!this.f64031j);
            this.f64028g = z10;
            return this;
        }

        @z7.a
        public b f(int i10) {
            androidx.media3.common.util.a.i(!this.f64031j);
            this.f64027f = i10;
            return this;
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f64032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f64033b;

        private c() {
        }
    }

    public m() {
        this(new androidx.media3.exoplayer.upstream.i(true, 65536), 50000, 50000, 1000, 2000, -1, false, 0, false);
    }

    private static int A(int i10) {
        switch (i10) {
            case -2:
                return 0;
            case -1:
                return 13107200;
            case 0:
                return A;
            case 1:
                return 13107200;
            case 2:
                return f64005u;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
            default:
                throw new IllegalArgumentException();
        }
    }

    private void B(androidx.media3.exoplayer.analytics.j4 j4Var) {
        if (this.f64020k.remove(j4Var) != null) {
            D();
        }
    }

    private void C(androidx.media3.exoplayer.analytics.j4 j4Var) {
        c cVar = (c) androidx.media3.common.util.a.g(this.f64020k.get(j4Var));
        int i10 = this.f64016g;
        if (i10 == -1) {
            i10 = 13107200;
        }
        cVar.f64033b = i10;
        cVar.f64032a = false;
    }

    private void D() {
        if (this.f64020k.isEmpty()) {
            this.f64011b.g();
        } else {
            this.f64011b.h(z());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void w(int i10, int i11, String str, String str2) {
        androidx.media3.common.util.a.b(i10 >= i11, str + " cannot be less than " + str2);
    }

    @Override // androidx.media3.exoplayer.s3
    public androidx.media3.exoplayer.upstream.b e() {
        return this.f64011b;
    }

    @Override // androidx.media3.exoplayer.s3
    public void h(androidx.media3.exoplayer.analytics.j4 j4Var) {
        long id2 = Thread.currentThread().getId();
        long j10 = this.f64021l;
        androidx.media3.common.util.a.j(j10 == -1 || j10 == id2, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.f64021l = id2;
        if (!this.f64020k.containsKey(j4Var)) {
            this.f64020k.put(j4Var, new c());
        }
        C(j4Var);
    }

    @Override // androidx.media3.exoplayer.s3
    public boolean j(s3.a aVar) {
        c cVar = (c) androidx.media3.common.util.a.g(this.f64020k.get(aVar.f64679a));
        boolean z10 = true;
        boolean z11 = this.f64011b.a() >= z();
        long jMin = this.f64012c;
        float f10 = aVar.f64684f;
        if (f10 > 1.0f) {
            jMin = Math.min(androidx.media3.common.util.k1.z0(jMin, f10), this.f64013d);
        }
        long jMax = Math.max(jMin, 500000L);
        long j10 = aVar.f64683e;
        if (j10 < jMax) {
            if (!this.f64017h && z11) {
                z10 = false;
            }
            cVar.f64032a = z10;
            if (!z10 && j10 < 500000) {
                androidx.media3.common.util.z.n("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j10 >= this.f64013d || z11) {
            cVar.f64032a = false;
        }
        return cVar.f64032a;
    }

    @Override // androidx.media3.exoplayer.s3
    public long m(androidx.media3.exoplayer.analytics.j4 j4Var) {
        return this.f64018i;
    }

    @Override // androidx.media3.exoplayer.s3
    public boolean n(s3.a aVar) {
        long jF0 = androidx.media3.common.util.k1.F0(aVar.f64683e, aVar.f64684f);
        long jMin = aVar.f64686h ? this.f64015f : this.f64014e;
        long j10 = aVar.f64687i;
        if (j10 != -9223372036854775807L) {
            jMin = Math.min(j10 / 2, jMin);
        }
        return jMin <= 0 || jF0 >= jMin || (!this.f64017h && this.f64011b.a() >= z());
    }

    @Override // androidx.media3.exoplayer.s3
    public boolean p(androidx.media3.common.z3 z3Var, androidx.media3.exoplayer.source.t0.b bVar, long j10) {
        Iterator<c> it = this.f64020k.values().iterator();
        while (it.hasNext()) {
            if (it.next().f64032a) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.s3
    public void q(s3.a aVar, androidx.media3.exoplayer.source.h2 h2Var, androidx.media3.exoplayer.trackselection.c0[] c0VarArr) {
        c cVar = (c) androidx.media3.common.util.a.g(this.f64020k.get(aVar.f64679a));
        int iY = this.f64016g;
        if (iY == -1) {
            iY = y(c0VarArr);
        }
        cVar.f64033b = iY;
        D();
    }

    @Override // androidx.media3.exoplayer.s3
    public void r(androidx.media3.exoplayer.analytics.j4 j4Var) {
        B(j4Var);
        if (this.f64020k.isEmpty()) {
            this.f64021l = -1L;
        }
    }

    @Override // androidx.media3.exoplayer.s3
    public void s(androidx.media3.exoplayer.analytics.j4 j4Var) {
        B(j4Var);
    }

    @Override // androidx.media3.exoplayer.s3
    public boolean u(androidx.media3.exoplayer.analytics.j4 j4Var) {
        return this.f64019j;
    }

    @z7.m(replacement = "this.calculateTargetBufferBytes(trackSelectionArray)")
    @Deprecated
    protected final int x(z4[] z4VarArr, androidx.media3.exoplayer.trackselection.c0[] c0VarArr) {
        return y(c0VarArr);
    }

    protected int y(androidx.media3.exoplayer.trackselection.c0[] c0VarArr) {
        int iA = 0;
        for (androidx.media3.exoplayer.trackselection.c0 c0Var : c0VarArr) {
            if (c0Var != null) {
                iA += A(c0Var.g().f60461c);
            }
        }
        return Math.max(13107200, iA);
    }

    @androidx.annotation.l1
    int z() {
        Iterator<c> it = this.f64020k.values().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += it.next().f64033b;
        }
        return i10;
    }

    protected m(androidx.media3.exoplayer.upstream.i iVar, int i10, int i11, int i12, int i13, int i14, boolean z10, int i15, boolean z11) {
        w(i12, 0, "bufferForPlaybackMs", com.facebook.appevents.p.f99189d0);
        w(i13, 0, "bufferForPlaybackAfterRebufferMs", com.facebook.appevents.p.f99189d0);
        w(i10, i12, "minBufferMs", "bufferForPlaybackMs");
        w(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        w(i11, i10, "maxBufferMs", "minBufferMs");
        w(i15, 0, "backBufferDurationMs", com.facebook.appevents.p.f99189d0);
        this.f64011b = iVar;
        this.f64012c = androidx.media3.common.util.k1.D1(i10);
        this.f64013d = androidx.media3.common.util.k1.D1(i11);
        this.f64014e = androidx.media3.common.util.k1.D1(i12);
        this.f64015f = androidx.media3.common.util.k1.D1(i13);
        this.f64016g = i14;
        this.f64017h = z10;
        this.f64018i = androidx.media3.common.util.k1.D1(i15);
        this.f64019j = z11;
        this.f64020k = new HashMap<>();
        this.f64021l = -1L;
    }
}
