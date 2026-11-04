package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
class h<R> implements com.bumptech.glide.load.engine.f.a, Runnable, Comparable<h<?>>, com.bumptech.glide.util.pool.a.f {

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private static final String f96563l3 = "DecodeJob";
    private com.bumptech.glide.load.g H1;
    private long X;
    private boolean Y;
    private Object Z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e f96567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.core.util.s.a<h<?>> f96568e;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private com.bumptech.glide.load.a f96571g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.bumptech.glide.d f96572h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private com.bumptech.glide.load.data.d<?> f96573h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.bumptech.glide.load.g f96574i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private volatile com.bumptech.glide.load.engine.f f96575i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.bumptech.glide.h f96576j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private volatile boolean f96577j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private n f96578k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private volatile boolean f96579k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f96580l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f96581m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private j f96582n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private com.bumptech.glide.load.j f96583o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private Thread f96584p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private com.bumptech.glide.load.g f96585p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private Object f96586p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private b<R> f96587s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f96588t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private EnumC0860h f96589v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private g f96590w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.g<R> f96564a = new com.bumptech.glide.load.engine.g<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<Throwable> f96565b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.util.pool.c f96566c = com.bumptech.glide.util.pool.c.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d<?> f96569f = new d<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final f f96570g = new f();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f96591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f96592b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f96593c;

        static {
            int[] iArr = new int[com.bumptech.glide.load.c.values().length];
            f96593c = iArr;
            try {
                iArr[com.bumptech.glide.load.c.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f96593c[com.bumptech.glide.load.c.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC0860h.values().length];
            f96592b = iArr2;
            try {
                iArr2[EnumC0860h.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f96592b[EnumC0860h.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f96592b[EnumC0860h.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f96592b[EnumC0860h.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f96592b[EnumC0860h.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[g.values().length];
            f96591a = iArr3;
            try {
                iArr3[g.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f96591a[g.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f96591a[g.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    interface b<R> {
        void b(q qVar);

        void c(v<R> vVar, com.bumptech.glide.load.a aVar);

        void d(h<?> hVar);
    }

    private final class c<Z> implements i.a<Z> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.bumptech.glide.load.a f96594a;

        c(com.bumptech.glide.load.a aVar) {
            this.f96594a = aVar;
        }

        @Override // com.bumptech.glide.load.engine.i.a
        @NonNull
        public v<Z> a(@NonNull v<Z> vVar) {
            return h.this.O(this.f96594a, vVar);
        }
    }

    private static class d<Z> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.bumptech.glide.load.g f96596a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.bumptech.glide.load.m<Z> f96597b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private u<Z> f96598c;

        d() {
        }

        void a() {
            this.f96596a = null;
            this.f96597b = null;
            this.f96598c = null;
        }

        void b(e eVar, com.bumptech.glide.load.j jVar) {
            com.bumptech.glide.util.pool.b.a("DecodeJob.encode");
            try {
                eVar.a().a(this.f96596a, new com.bumptech.glide.load.engine.e(this.f96597b, this.f96598c, jVar));
                this.f96598c.f();
                com.bumptech.glide.util.pool.b.e();
            } catch (Throwable th2) {
                this.f96598c.f();
                com.bumptech.glide.util.pool.b.e();
                throw th2;
            }
        }

        boolean c() {
            return this.f96598c != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        <X> void d(com.bumptech.glide.load.g gVar, com.bumptech.glide.load.m<X> mVar, u<X> uVar) {
            this.f96596a = gVar;
            this.f96597b = mVar;
            this.f96598c = uVar;
        }
    }

    interface e {
        com.bumptech.glide.load.engine.cache.a a();
    }

    private static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f96599a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f96600b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f96601c;

        f() {
        }

        private boolean a(boolean z10) {
            return (this.f96601c || z10 || this.f96600b) && this.f96599a;
        }

        synchronized boolean b() {
            this.f96600b = true;
            return a(false);
        }

        synchronized boolean c() {
            try {
                this.f96601c = true;
            } catch (Throwable th2) {
                throw th2;
            }
            return a(false);
        }

        synchronized boolean d(boolean z10) {
            try {
                this.f96599a = true;
            } catch (Throwable th2) {
                throw th2;
            }
            return a(z10);
        }

        synchronized void e() {
            try {
                this.f96600b = false;
                this.f96599a = false;
                this.f96601c = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private enum g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.h$h, reason: collision with other inner class name */
    private enum EnumC0860h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    h(e eVar, androidx.core.util.s.a<h<?>> aVar) {
        this.f96567d = eVar;
        this.f96568e = aVar;
    }

    private void D(String str, long j10) {
        E(str, j10, null);
    }

    private void E(String str, long j10, String str2) {
        com.bumptech.glide.util.g.a(j10);
        Objects.toString(this.f96578k);
        if (str2 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(", ");
            sb2.append(str2);
        }
        Thread.currentThread().getName();
    }

    private void H(v<R> vVar, com.bumptech.glide.load.a aVar) {
        W();
        this.f96587s.c(vVar, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void I(v<R> vVar, com.bumptech.glide.load.a aVar) {
        u uVar;
        if (vVar instanceof r) {
            ((r) vVar).initialize();
        }
        if (this.f96569f.c()) {
            vVar = u.d(vVar);
            uVar = vVar;
        } else {
            uVar = 0;
        }
        H(vVar, aVar);
        this.f96589v = EnumC0860h.ENCODE;
        try {
            if (this.f96569f.c()) {
                this.f96569f.b(this.f96567d, this.f96583o);
            }
            if (uVar != 0) {
                uVar.f();
            }
            M();
        } catch (Throwable th2) {
            if (uVar != 0) {
                uVar.f();
            }
            throw th2;
        }
    }

    private void L() {
        W();
        this.f96587s.b(new q("Failed to load resource", new ArrayList(this.f96565b)));
        N();
    }

    private void M() {
        if (this.f96570g.b()) {
            S();
        }
    }

    private void N() {
        if (this.f96570g.c()) {
            S();
        }
    }

    private void S() {
        this.f96570g.e();
        this.f96569f.a();
        this.f96564a.a();
        this.f96577j3 = false;
        this.f96572h = null;
        this.f96574i = null;
        this.f96583o = null;
        this.f96576j = null;
        this.f96578k = null;
        this.f96587s = null;
        this.f96589v = null;
        this.f96575i3 = null;
        this.f96584p0 = null;
        this.f96585p1 = null;
        this.f96586p2 = null;
        this.f96571g3 = null;
        this.f96573h3 = null;
        this.X = 0L;
        this.f96579k3 = false;
        this.Z = null;
        this.f96565b.clear();
        this.f96568e.a(this);
    }

    private void T() {
        this.f96584p0 = Thread.currentThread();
        this.X = com.bumptech.glide.util.g.b();
        boolean zA = false;
        while (!this.f96579k3 && this.f96575i3 != null && !(zA = this.f96575i3.a())) {
            this.f96589v = v(this.f96589v);
            this.f96575i3 = t();
            if (this.f96589v == EnumC0860h.SOURCE) {
                l();
                return;
            }
        }
        if ((this.f96589v == EnumC0860h.FINISHED || this.f96579k3) && !zA) {
            L();
        }
    }

    private <Data, ResourceType> v<R> U(Data data, com.bumptech.glide.load.a aVar, t<Data, ResourceType, R> tVar) throws q {
        com.bumptech.glide.load.j jVarW = w(aVar);
        com.bumptech.glide.load.data.e<Data> eVarL = this.f96572h.h().l(data);
        try {
            v<R> vVarB = tVar.b(eVarL, jVarW, this.f96580l, this.f96581m, new c(aVar));
            eVarL.b();
            return vVarB;
        } catch (Throwable th2) {
            eVarL.b();
            throw th2;
        }
    }

    private void V() {
        int i10 = a.f96591a[this.f96590w.ordinal()];
        if (i10 == 1) {
            this.f96589v = v(EnumC0860h.INITIALIZE);
            this.f96575i3 = t();
            T();
        } else if (i10 == 2) {
            T();
        } else {
            if (i10 == 3) {
                s();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.f96590w);
        }
    }

    private void W() {
        Throwable th2;
        this.f96566c.c();
        if (!this.f96577j3) {
            this.f96577j3 = true;
            return;
        }
        if (this.f96565b.isEmpty()) {
            th2 = null;
        } else {
            List<Throwable> list = this.f96565b;
            th2 = list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th2);
    }

    private <Data> v<R> q(com.bumptech.glide.load.data.d<?> dVar, Data data, com.bumptech.glide.load.a aVar) throws q {
        if (data == null) {
            dVar.b();
            return null;
        }
        try {
            long jB = com.bumptech.glide.util.g.b();
            v<R> vVarR = r(data, aVar);
            if (Log.isLoggable(f96563l3, 2)) {
                D("Decoded result " + vVarR, jB);
            }
            dVar.b();
            return vVarR;
        } catch (Throwable th2) {
            dVar.b();
            throw th2;
        }
    }

    private <Data> v<R> r(Data data, com.bumptech.glide.load.a aVar) throws q {
        return U(data, aVar, this.f96564a.h(data.getClass()));
    }

    private void s() {
        v<R> vVarQ;
        if (Log.isLoggable(f96563l3, 2)) {
            E("Retrieved data", this.X, "data: " + this.f96586p2 + ", cache key: " + this.f96585p1 + ", fetcher: " + this.f96573h3);
        }
        try {
            vVarQ = q(this.f96573h3, this.f96586p2, this.f96571g3);
        } catch (q e10) {
            e10.j(this.H1, this.f96571g3);
            this.f96565b.add(e10);
            vVarQ = null;
        }
        if (vVarQ != null) {
            I(vVarQ, this.f96571g3);
        } else {
            T();
        }
    }

    private com.bumptech.glide.load.engine.f t() {
        int i10 = a.f96592b[this.f96589v.ordinal()];
        if (i10 == 1) {
            return new w(this.f96564a, this);
        }
        if (i10 == 2) {
            return new com.bumptech.glide.load.engine.c(this.f96564a, this);
        }
        if (i10 == 3) {
            return new z(this.f96564a, this);
        }
        if (i10 == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f96589v);
    }

    private EnumC0860h v(EnumC0860h enumC0860h) {
        int i10 = a.f96592b[enumC0860h.ordinal()];
        if (i10 == 1) {
            return this.f96582n.a() ? EnumC0860h.DATA_CACHE : v(EnumC0860h.DATA_CACHE);
        }
        if (i10 == 2) {
            return this.Y ? EnumC0860h.FINISHED : EnumC0860h.SOURCE;
        }
        if (i10 == 3 || i10 == 4) {
            return EnumC0860h.FINISHED;
        }
        if (i10 == 5) {
            return this.f96582n.b() ? EnumC0860h.RESOURCE_CACHE : v(EnumC0860h.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + enumC0860h);
    }

    @NonNull
    private com.bumptech.glide.load.j w(com.bumptech.glide.load.a aVar) {
        com.bumptech.glide.load.j jVar = this.f96583o;
        boolean z10 = aVar == com.bumptech.glide.load.a.RESOURCE_DISK_CACHE || this.f96564a.w();
        com.bumptech.glide.load.i<Boolean> iVar = com.bumptech.glide.load.resource.bitmap.q.f97063k;
        Boolean bool = (Boolean) jVar.c(iVar);
        if (bool != null && (!bool.booleanValue() || z10)) {
            return jVar;
        }
        com.bumptech.glide.load.j jVar2 = new com.bumptech.glide.load.j();
        jVar2.d(this.f96583o);
        jVar2.e(iVar, Boolean.valueOf(z10));
        return jVar2;
    }

    private int x() {
        return this.f96576j.ordinal();
    }

    @NonNull
    <Z> v<Z> O(com.bumptech.glide.load.a aVar, @NonNull v<Z> vVar) {
        v<Z> vVarA;
        com.bumptech.glide.load.n<Z> nVar;
        com.bumptech.glide.load.c cVarB;
        com.bumptech.glide.load.g dVar;
        Class<?> cls = vVar.get().getClass();
        com.bumptech.glide.load.m<Z> mVarN = null;
        if (aVar != com.bumptech.glide.load.a.RESOURCE_DISK_CACHE) {
            com.bumptech.glide.load.n<Z> nVarR = this.f96564a.r(cls);
            nVar = nVarR;
            vVarA = nVarR.a(this.f96572h, vVar, this.f96580l, this.f96581m);
        } else {
            vVarA = vVar;
            nVar = null;
        }
        if (!vVar.equals(vVarA)) {
            vVar.a();
        }
        if (this.f96564a.v(vVarA)) {
            mVarN = this.f96564a.n(vVarA);
            cVarB = mVarN.b(this.f96583o);
        } else {
            cVarB = com.bumptech.glide.load.c.NONE;
        }
        com.bumptech.glide.load.m mVar = mVarN;
        if (!this.f96582n.d(!this.f96564a.x(this.f96585p1), aVar, cVarB)) {
            return vVarA;
        }
        if (mVar == null) {
            throw new com.bumptech.glide.j.d(vVarA.get().getClass());
        }
        int i10 = a.f96593c[cVarB.ordinal()];
        if (i10 == 1) {
            dVar = new com.bumptech.glide.load.engine.d(this.f96585p1, this.f96574i);
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException("Unknown strategy: " + cVarB);
            }
            dVar = new x(this.f96564a.b(), this.f96585p1, this.f96574i, this.f96580l, this.f96581m, nVar, cls, this.f96583o);
        }
        u uVarD = u.d(vVarA);
        this.f96569f.d(dVar, mVar, uVarD);
        return uVarD;
    }

    void R(boolean z10) {
        if (this.f96570g.d(z10)) {
            S();
        }
    }

    boolean X() {
        EnumC0860h enumC0860hV = v(EnumC0860h.INITIALIZE);
        return enumC0860hV == EnumC0860h.RESOURCE_CACHE || enumC0860hV == EnumC0860h.DATA_CACHE;
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void b(com.bumptech.glide.load.g gVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, com.bumptech.glide.load.a aVar) {
        dVar.b();
        q qVar = new q("Fetching data failed", exc);
        qVar.k(gVar, aVar, dVar.a());
        this.f96565b.add(qVar);
        if (Thread.currentThread() == this.f96584p0) {
            T();
        } else {
            this.f96590w = g.SWITCH_TO_SOURCE_SERVICE;
            this.f96587s.d(this);
        }
    }

    @Override // com.bumptech.glide.util.pool.a.f
    @NonNull
    public com.bumptech.glide.util.pool.c k() {
        return this.f96566c;
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void l() {
        this.f96590w = g.SWITCH_TO_SOURCE_SERVICE;
        this.f96587s.d(this);
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void n(com.bumptech.glide.load.g gVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.g gVar2) {
        this.f96585p1 = gVar;
        this.f96586p2 = obj;
        this.f96573h3 = dVar;
        this.f96571g3 = aVar;
        this.H1 = gVar2;
        if (Thread.currentThread() != this.f96584p0) {
            this.f96590w = g.DECODE_DATA;
            this.f96587s.d(this);
        } else {
            com.bumptech.glide.util.pool.b.a("DecodeJob.decodeFromRetrievedData");
            try {
                s();
            } finally {
                com.bumptech.glide.util.pool.b.e();
            }
        }
    }

    public void o() {
        this.f96579k3 = true;
        com.bumptech.glide.load.engine.f fVar = this.f96575i3;
        if (fVar != null) {
            fVar.cancel();
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NonNull h<?> hVar) {
        int iX = x() - hVar.x();
        return iX == 0 ? this.f96588t - hVar.f96588t : iX;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.bumptech.glide.util.pool.b.b("DecodeJob#run(model=%s)", this.Z);
        com.bumptech.glide.load.data.d<?> dVar = this.f96573h3;
        try {
            try {
                if (this.f96579k3) {
                    L();
                    if (dVar != null) {
                        dVar.b();
                    }
                    com.bumptech.glide.util.pool.b.e();
                    return;
                }
                V();
                if (dVar != null) {
                    dVar.b();
                }
                com.bumptech.glide.util.pool.b.e();
            } catch (Throwable th2) {
                if (dVar != null) {
                    dVar.b();
                }
                com.bumptech.glide.util.pool.b.e();
                throw th2;
            }
        } catch (com.bumptech.glide.load.engine.b e10) {
            throw e10;
        } catch (Throwable th3) {
            if (Log.isLoggable(f96563l3, 3)) {
                Objects.toString(this.f96589v);
            }
            if (this.f96589v != EnumC0860h.ENCODE) {
                this.f96565b.add(th3);
                L();
            }
            if (!this.f96579k3) {
                throw th3;
            }
            throw th3;
        }
    }

    h<R> z(com.bumptech.glide.d dVar, Object obj, n nVar, com.bumptech.glide.load.g gVar, int i10, int i11, Class<?> cls, Class<R> cls2, com.bumptech.glide.h hVar, j jVar, Map<Class<?>, com.bumptech.glide.load.n<?>> map, boolean z10, boolean z11, boolean z12, com.bumptech.glide.load.j jVar2, b<R> bVar, int i12) {
        this.f96564a.u(dVar, obj, gVar, i10, i11, jVar, cls, cls2, hVar, jVar2, map, z10, z11, this.f96567d);
        this.f96572h = dVar;
        this.f96574i = gVar;
        this.f96576j = hVar;
        this.f96578k = nVar;
        this.f96580l = i10;
        this.f96581m = i11;
        this.f96582n = jVar;
        this.Y = z12;
        this.f96583o = jVar2;
        this.f96587s = bVar;
        this.f96588t = i12;
        this.f96590w = g.INITIALIZE;
        this.Z = obj;
        return this;
    }
}
