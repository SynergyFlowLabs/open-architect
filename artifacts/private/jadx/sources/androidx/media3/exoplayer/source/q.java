package androidx.media3.exoplayer.source;

import android.content.Context;
import com.google.common.collect.l6;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements c1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f65397q = "DMediaSourceFactory";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f65398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.media3.datasource.p.a f65399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private androidx.media3.extractor.text.r.a f65400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private t0.a f65401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private x f65402g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.p0
    private androidx.media3.exoplayer.source.ads.a.b f65403h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.p0
    private androidx.media3.common.c f65404i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.p0
    private androidx.media3.exoplayer.upstream.m f65405j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f65406k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f65407l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f65408m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f65409n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f65410o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f65411p;

    @androidx.media3.common.util.b1
    @Deprecated
    public interface a extends androidx.media3.exoplayer.source.ads.a.b {
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.media3.extractor.w f65412a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private androidx.media3.datasource.p.a f65415d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private androidx.media3.extractor.text.r.a f65417f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f65418g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @androidx.annotation.p0
        private androidx.media3.exoplayer.upstream.f.c f65419h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @androidx.annotation.p0
        private androidx.media3.exoplayer.drm.w f65420i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @androidx.annotation.p0
        private androidx.media3.exoplayer.upstream.m f65421j;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<Integer, com.google.common.base.s0<t0.a>> f65413b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map<Integer, t0.a> f65414c = new HashMap();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f65416e = true;

        public b(androidx.media3.extractor.w wVar, androidx.media3.extractor.text.r.a aVar) {
            this.f65412a = wVar;
            this.f65417f = aVar;
        }

        public static /* synthetic */ t0.a c(b bVar, androidx.media3.datasource.p.a aVar) {
            bVar.getClass();
            return new m1.b(aVar, bVar.f65412a);
        }

        private void f() {
            j(0);
            j(1);
            j(2);
            j(3);
            j(4);
        }

        private com.google.common.base.s0<t0.a> i(int i10) throws ClassNotFoundException {
            com.google.common.base.s0<t0.a> s0Var;
            com.google.common.base.s0<t0.a> s0Var2;
            com.google.common.base.s0<t0.a> s0Var3 = this.f65413b.get(Integer.valueOf(i10));
            if (s0Var3 != null) {
                return s0Var3;
            }
            final androidx.media3.datasource.p.a aVar = (androidx.media3.datasource.p.a) androidx.media3.common.util.a.g(this.f65415d);
            if (i10 == 0) {
                final Class<? extends U> clsAsSubclass = Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(t0.a.class);
                s0Var = new com.google.common.base.s0() { // from class: androidx.media3.exoplayer.source.r
                    @Override // com.google.common.base.s0
                    public final Object get() {
                        return q.r(clsAsSubclass, aVar);
                    }
                };
            } else {
                if (i10 != 1) {
                    if (i10 == 2) {
                        final Class<? extends U> clsAsSubclass2 = Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(t0.a.class);
                        s0Var = new com.google.common.base.s0() { // from class: androidx.media3.exoplayer.source.t
                            @Override // com.google.common.base.s0
                            public final Object get() {
                                return q.r(clsAsSubclass2, aVar);
                            }
                        };
                    } else if (i10 == 3) {
                        final Class<? extends U> clsAsSubclass3 = Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(t0.a.class);
                        s0Var2 = new com.google.common.base.s0() { // from class: androidx.media3.exoplayer.source.u
                            @Override // com.google.common.base.s0
                            public final Object get() {
                                return q.q(clsAsSubclass3);
                            }
                        };
                    } else {
                        if (i10 != 4) {
                            throw new IllegalArgumentException("Unrecognized contentType: " + i10);
                        }
                        s0Var2 = new com.google.common.base.s0() { // from class: androidx.media3.exoplayer.source.v
                            @Override // com.google.common.base.s0
                            public final Object get() {
                                return q.b.c(this.f65479a, aVar);
                            }
                        };
                    }
                    this.f65413b.put(Integer.valueOf(i10), s0Var2);
                    return s0Var2;
                }
                final Class<? extends U> clsAsSubclass4 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(t0.a.class);
                s0Var = new com.google.common.base.s0() { // from class: androidx.media3.exoplayer.source.s
                    @Override // com.google.common.base.s0
                    public final Object get() {
                        return q.r(clsAsSubclass4, aVar);
                    }
                };
            }
            s0Var2 = s0Var;
            this.f65413b.put(Integer.valueOf(i10), s0Var2);
            return s0Var2;
        }

        @z7.a
        @androidx.annotation.p0
        private com.google.common.base.s0<t0.a> j(int i10) {
            try {
                return i(i10);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        }

        public t0.a g(int i10) throws ClassNotFoundException {
            t0.a aVar = this.f65414c.get(Integer.valueOf(i10));
            if (aVar != null) {
                return aVar;
            }
            t0.a aVar2 = i(i10).get();
            androidx.media3.exoplayer.upstream.f.c cVar = this.f65419h;
            if (cVar != null) {
                aVar2.g(cVar);
            }
            androidx.media3.exoplayer.drm.w wVar = this.f65420i;
            if (wVar != null) {
                aVar2.e(wVar);
            }
            androidx.media3.exoplayer.upstream.m mVar = this.f65421j;
            if (mVar != null) {
                aVar2.f(mVar);
            }
            aVar2.a(this.f65417f);
            aVar2.d(this.f65416e);
            aVar2.b(this.f65418g);
            this.f65414c.put(Integer.valueOf(i10), aVar2);
            return aVar2;
        }

        public int[] h() {
            f();
            return com.google.common.primitives.l.E(this.f65413b.keySet());
        }

        public void k(androidx.media3.exoplayer.upstream.f.c cVar) {
            this.f65419h = cVar;
            Iterator<t0.a> it = this.f65414c.values().iterator();
            while (it.hasNext()) {
                it.next().g(cVar);
            }
        }

        public void l(int i10) {
            this.f65418g = i10;
            this.f65412a.b(i10);
        }

        public void m(androidx.media3.datasource.p.a aVar) {
            if (aVar != this.f65415d) {
                this.f65415d = aVar;
                this.f65413b.clear();
                this.f65414c.clear();
            }
        }

        public void n(androidx.media3.exoplayer.drm.w wVar) {
            this.f65420i = wVar;
            Iterator<t0.a> it = this.f65414c.values().iterator();
            while (it.hasNext()) {
                it.next().e(wVar);
            }
        }

        public void o(int i10) {
            androidx.media3.extractor.w wVar = this.f65412a;
            if (wVar instanceof androidx.media3.extractor.l) {
                ((androidx.media3.extractor.l) wVar).t(i10);
            }
        }

        public void p(androidx.media3.exoplayer.upstream.m mVar) {
            this.f65421j = mVar;
            Iterator<t0.a> it = this.f65414c.values().iterator();
            while (it.hasNext()) {
                it.next().f(mVar);
            }
        }

        public void q(boolean z10) {
            this.f65416e = z10;
            this.f65412a.d(z10);
            Iterator<t0.a> it = this.f65414c.values().iterator();
            while (it.hasNext()) {
                it.next().d(z10);
            }
        }

        public void r(androidx.media3.extractor.text.r.a aVar) {
            this.f65417f = aVar;
            this.f65412a.a(aVar);
            Iterator<t0.a> it = this.f65414c.values().iterator();
            while (it.hasNext()) {
                it.next().a(aVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c implements androidx.media3.extractor.r {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final androidx.media3.common.w f65422d;

        public c(androidx.media3.common.w wVar) {
            this.f65422d = wVar;
        }

        @Override // androidx.media3.extractor.r
        public void a(long j10, long j11) {
        }

        @Override // androidx.media3.extractor.r
        public int f(androidx.media3.extractor.s sVar, androidx.media3.extractor.n0 n0Var) throws IOException {
            return sVar.b(Integer.MAX_VALUE) == -1 ? -1 : 0;
        }

        @Override // androidx.media3.extractor.r
        public boolean g(androidx.media3.extractor.s sVar) {
            return true;
        }

        @Override // androidx.media3.extractor.r
        public void h(androidx.media3.extractor.t tVar) {
            androidx.media3.extractor.u0 u0VarA = tVar.a(0, 3);
            tVar.u(new androidx.media3.extractor.p0.b(-9223372036854775807L));
            tVar.l();
            u0VarA.e(this.f65422d.b().u0(androidx.media3.common.s0.f61334r0).S(this.f65422d.f61761o).N());
        }

        @Override // androidx.media3.extractor.r
        public void release() {
        }
    }

    public q(Context context) {
        this(new androidx.media3.datasource.y.a(context));
    }

    public static /* synthetic */ androidx.media3.extractor.r[] i(q qVar, androidx.media3.common.w wVar) {
        return new androidx.media3.extractor.r[]{qVar.f65400e.b(wVar) ? new androidx.media3.extractor.text.n(qVar.f65400e.c(wVar), null) : new c(wVar)};
    }

    private static t0 o(androidx.media3.common.k0 k0Var, t0 t0Var) {
        androidx.media3.common.k0.d dVar = k0Var.f60826f;
        return (dVar.f60857b == 0 && dVar.f60859d == Long.MIN_VALUE && !dVar.f60861f) ? t0Var : new f.b(t0Var).p(k0Var.f60826f.f60857b).m(k0Var.f60826f.f60859d).k(!k0Var.f60826f.f60862g).i(k0Var.f60826f.f60860e).n(k0Var.f60826f.f60861f).h();
    }

    private t0 p(androidx.media3.common.k0 k0Var, t0 t0Var) {
        androidx.media3.common.util.a.g(k0Var.f60822b);
        androidx.media3.common.k0.b bVar = k0Var.f60822b.f60923d;
        if (bVar == null) {
            return t0Var;
        }
        androidx.media3.exoplayer.source.ads.a.b bVar2 = this.f65403h;
        androidx.media3.common.c cVar = this.f65404i;
        if (bVar2 == null || cVar == null) {
            androidx.media3.common.util.z.n(f65397q, "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
            return t0Var;
        }
        androidx.media3.exoplayer.source.ads.a aVarA = bVar2.a(bVar);
        if (aVarA == null) {
            androidx.media3.common.util.z.n(f65397q, "Playing media without ads, as no AdsLoader was provided.");
            return t0Var;
        }
        androidx.media3.datasource.x xVar = new androidx.media3.datasource.x(bVar.f60830a);
        Object objK = bVar.f60831b;
        if (objK == null) {
            objK = l6.K(k0Var.f60821a, k0Var.f60822b.f60920a, bVar.f60830a);
        }
        return new androidx.media3.exoplayer.source.ads.e(t0Var, xVar, objK, this, aVarA, cVar, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static t0.a q(Class<? extends t0.a> cls) {
        try {
            return cls.getConstructor(null).newInstance(null);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static t0.a r(Class<? extends t0.a> cls, androidx.media3.datasource.p.a aVar) {
        try {
            return cls.getConstructor(androidx.media3.datasource.p.a.class).newInstance(aVar);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    @androidx.media3.common.util.b1
    @z7.a
    public q A(long j10) {
        this.f65407l = j10;
        return this;
    }

    @androidx.media3.common.util.b1
    @z7.a
    public q B(float f10) {
        this.f65409n = f10;
        return this;
    }

    @androidx.media3.common.util.b1
    @z7.a
    public q C(long j10) {
        this.f65406k = j10;
        return this;
    }

    @Override // androidx.media3.exoplayer.source.t0.a
    @androidx.media3.common.util.b1
    @z7.a
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public q f(androidx.media3.exoplayer.upstream.m mVar) {
        this.f65405j = (androidx.media3.exoplayer.upstream.m) androidx.media3.common.util.a.h(mVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f65398c.p(mVar);
        return this;
    }

    @z7.a
    public q E(androidx.media3.exoplayer.source.ads.a.b bVar, androidx.media3.common.c cVar) {
        this.f65403h = (androidx.media3.exoplayer.source.ads.a.b) androidx.media3.common.util.a.g(bVar);
        this.f65404i = (androidx.media3.common.c) androidx.media3.common.util.a.g(cVar);
        return this;
    }

    @z7.a
    public q F(@androidx.annotation.p0 t0.a aVar) {
        this.f65401f = aVar;
        return this;
    }

    @Override // androidx.media3.exoplayer.source.t0.a
    @androidx.media3.common.util.b1
    @z7.a
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public q a(androidx.media3.extractor.text.r.a aVar) {
        this.f65400e = (androidx.media3.extractor.text.r.a) androidx.media3.common.util.a.g(aVar);
        this.f65398c.r(aVar);
        return this;
    }

    @Override // androidx.media3.exoplayer.source.t0.a
    @androidx.media3.common.util.b1
    public int[] c() {
        return this.f65398c.h();
    }

    @Override // androidx.media3.exoplayer.source.t0.a
    @androidx.media3.common.util.b1
    public t0 h(androidx.media3.common.k0 k0Var) {
        androidx.media3.common.util.a.g(k0Var.f60822b);
        String scheme = k0Var.f60822b.f60920a.getScheme();
        if (scheme != null && scheme.equals(androidx.media3.common.j.f60726p)) {
            return ((t0.a) androidx.media3.common.util.a.g(this.f65401f)).h(k0Var);
        }
        if (Objects.equals(k0Var.f60822b.f60921b, androidx.media3.common.s0.U0)) {
            return new z.b(androidx.media3.common.util.k1.D1(k0Var.f60822b.f60929j), (x) androidx.media3.common.util.a.g(this.f65402g)).h(k0Var);
        }
        androidx.media3.common.k0.h hVar = k0Var.f60822b;
        int iA1 = androidx.media3.common.util.k1.a1(hVar.f60920a, hVar.f60921b);
        if (k0Var.f60822b.f60929j != -9223372036854775807L) {
            this.f65398c.o(1);
        }
        try {
            t0.a aVarG = this.f65398c.g(iA1);
            androidx.media3.common.k0.g.a aVarA = k0Var.f60824d.a();
            if (k0Var.f60824d.f60902a == -9223372036854775807L) {
                aVarA.k(this.f65406k);
            }
            if (k0Var.f60824d.f60905d == -3.4028235E38f) {
                aVarA.j(this.f65409n);
            }
            if (k0Var.f60824d.f60906e == -3.4028235E38f) {
                aVarA.h(this.f65410o);
            }
            if (k0Var.f60824d.f60903b == -9223372036854775807L) {
                aVarA.i(this.f65407l);
            }
            if (k0Var.f60824d.f60904c == -9223372036854775807L) {
                aVarA.g(this.f65408m);
            }
            androidx.media3.common.k0.g gVarF = aVarA.f();
            if (!gVarF.equals(k0Var.f60824d)) {
                k0Var = k0Var.a().y(gVarF).a();
            }
            t0 t0VarH = aVarG.h(k0Var);
            l6<androidx.media3.common.k0.k> l6Var = ((androidx.media3.common.k0.h) androidx.media3.common.util.k1.o(k0Var.f60822b)).f60926g;
            if (!l6Var.isEmpty()) {
                t0[] t0VarArr = new t0[l6Var.size() + 1];
                t0VarArr[0] = t0VarH;
                for (int i10 = 0; i10 < l6Var.size(); i10++) {
                    if (this.f65411p) {
                        final androidx.media3.common.w wVarN = new androidx.media3.common.w.b().u0(l6Var.get(i10).f60948b).j0(l6Var.get(i10).f60949c).w0(l6Var.get(i10).f60950d).s0(l6Var.get(i10).f60951e).h0(l6Var.get(i10).f60952f).f0(l6Var.get(i10).f60953g).N();
                        m1.b bVar = new m1.b(this.f65399d, new androidx.media3.extractor.w() { // from class: androidx.media3.exoplayer.source.p
                            @Override // androidx.media3.extractor.w
                            public final androidx.media3.extractor.r[] c() {
                                return q.i(this.f65280b, wVarN);
                            }
                        });
                        if (this.f65400e.b(wVarN)) {
                            wVarN = wVarN.b().u0(androidx.media3.common.s0.T0).S(wVarN.f61761o).W(this.f65400e.a(wVarN)).N();
                        }
                        m1.b bVarL = bVar.l(0, wVarN);
                        androidx.media3.exoplayer.upstream.m mVar = this.f65405j;
                        if (mVar != null) {
                            bVarL.f(mVar);
                        }
                        t0VarArr[i10 + 1] = bVarL.h(androidx.media3.common.k0.d(l6Var.get(i10).f60947a.toString()));
                    } else {
                        y1.b bVar2 = new y1.b(this.f65399d);
                        androidx.media3.exoplayer.upstream.m mVar2 = this.f65405j;
                        if (mVar2 != null) {
                            bVar2.d(mVar2);
                        }
                        t0VarArr[i10 + 1] = bVar2.b(l6Var.get(i10), -9223372036854775807L);
                    }
                }
                t0VarH = new f1(t0VarArr);
            }
            return p(k0Var, o(k0Var, t0VarH));
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @z7.a
    public q l() {
        this.f65403h = null;
        this.f65404i = null;
        return this;
    }

    @Override // androidx.media3.exoplayer.source.t0.a
    @androidx.media3.common.util.b1
    @z7.a
    @Deprecated
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public q d(boolean z10) {
        this.f65411p = z10;
        this.f65398c.q(z10);
        return this;
    }

    @Override // androidx.media3.exoplayer.source.t0.a
    @androidx.media3.common.util.b1
    @z7.a
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public q b(int i10) {
        this.f65398c.l(i10);
        return this;
    }

    @androidx.media3.common.util.b1
    @z7.a
    @Deprecated
    public q s(@androidx.annotation.p0 androidx.media3.common.c cVar) {
        this.f65404i = cVar;
        return this;
    }

    @androidx.media3.common.util.b1
    @z7.a
    @Deprecated
    public q t(@androidx.annotation.p0 androidx.media3.exoplayer.source.ads.a.b bVar) {
        this.f65403h = bVar;
        return this;
    }

    @Override // androidx.media3.exoplayer.source.t0.a
    @androidx.media3.common.util.b1
    @z7.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public q g(androidx.media3.exoplayer.upstream.f.c cVar) {
        this.f65398c.k((androidx.media3.exoplayer.upstream.f.c) androidx.media3.common.util.a.g(cVar));
        return this;
    }

    @z7.a
    public q v(androidx.media3.datasource.p.a aVar) {
        this.f65399d = aVar;
        this.f65398c.m(aVar);
        return this;
    }

    @Override // androidx.media3.exoplayer.source.t0.a
    @androidx.media3.common.util.b1
    @z7.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public q e(androidx.media3.exoplayer.drm.w wVar) {
        this.f65398c.n((androidx.media3.exoplayer.drm.w) androidx.media3.common.util.a.h(wVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."));
        return this;
    }

    @androidx.media3.common.util.b1
    @z7.a
    public q x(@androidx.annotation.p0 x xVar) {
        this.f65402g = xVar;
        return this;
    }

    @androidx.media3.common.util.b1
    @z7.a
    public q y(long j10) {
        this.f65408m = j10;
        return this;
    }

    @androidx.media3.common.util.b1
    @z7.a
    public q z(float f10) {
        this.f65410o = f10;
        return this;
    }

    @androidx.media3.common.util.b1
    public q(Context context, androidx.media3.extractor.w wVar) {
        this(new androidx.media3.datasource.y.a(context), wVar);
    }

    @androidx.media3.common.util.b1
    public q(androidx.media3.datasource.p.a aVar) {
        this(aVar, new androidx.media3.extractor.l());
    }

    @androidx.media3.common.util.b1
    public q(androidx.media3.datasource.p.a aVar, androidx.media3.extractor.w wVar) {
        this.f65399d = aVar;
        androidx.media3.extractor.text.g gVar = new androidx.media3.extractor.text.g();
        this.f65400e = gVar;
        b bVar = new b(wVar, gVar);
        this.f65398c = bVar;
        bVar.m(aVar);
        this.f65406k = -9223372036854775807L;
        this.f65407l = -9223372036854775807L;
        this.f65408m = -9223372036854775807L;
        this.f65409n = -3.4028235E38f;
        this.f65410o = -3.4028235E38f;
        int i10 = 5 | 1;
        this.f65411p = true;
    }
}
