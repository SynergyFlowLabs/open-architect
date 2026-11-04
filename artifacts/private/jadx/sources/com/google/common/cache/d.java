package com.google.common.cache;

import com.google.common.base.j0;
import com.google.common.base.s0;
import com.google.common.base.t0;
import com.google.common.base.w0;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
@i
@com.google.common.annotations.b(emulated = true)
public final class d<K, V> {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f116754q = 16;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f116755r = 4;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f116756s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f116757t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final s0<? extends com.google.common.cache.a.b> f116758u = t0.e(new a());

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final h f116759v = new h(0, 0, 0, 0, 0, 0);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final s0<com.google.common.cache.a.b> f116760w = new b();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static final w0 f116761x = new c();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static final int f116762y = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @fj.a
    c0<? super K, ? super V> f116768f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @fj.a
    n.t f116769g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @fj.a
    n.t f116770h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @fj.a
    com.google.common.base.m<Object> f116774l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @fj.a
    com.google.common.base.m<Object> f116775m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @fj.a
    w<? super K, ? super V> f116776n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @fj.a
    w0 f116777o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f116763a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f116764b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f116765c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    long f116766d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f116767e = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    long f116771i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    long f116772j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    long f116773k = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    s0<? extends com.google.common.cache.a.b> f116778p = f116758u;

    class a implements com.google.common.cache.a.b {
        a() {
        }

        @Override // com.google.common.cache.a.b
        public void a(int count) {
        }

        @Override // com.google.common.cache.a.b
        public void b() {
        }

        @Override // com.google.common.cache.a.b
        public void c(long loadTime) {
        }

        @Override // com.google.common.cache.a.b
        public void d(int count) {
        }

        @Override // com.google.common.cache.a.b
        public void e(long loadTime) {
        }

        @Override // com.google.common.cache.a.b
        public h f() {
            return d.f116759v;
        }
    }

    class b implements s0<com.google.common.cache.a.b> {
        b() {
        }

        @Override // com.google.common.base.s0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.google.common.cache.a.b get() {
            return new com.google.common.cache.a.C1048a();
        }
    }

    class c extends w0 {
        c() {
        }

        @Override // com.google.common.base.w0
        public long a() {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.d$d, reason: collision with other inner class name */
    private static final class C1049d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final Logger f116779a = Logger.getLogger(d.class.getName());

        private C1049d() {
        }
    }

    enum e implements w<Object, Object> {
        INSTANCE;

        @Override // com.google.common.cache.w
        public void b(a0<Object, Object> notification) {
        }
    }

    enum f implements c0<Object, Object> {
        INSTANCE;

        @Override // com.google.common.cache.c0
        public int b(Object key, Object value) {
            return 1;
        }
    }

    private d() {
    }

    public static d<Object, Object> F() {
        return new d<>();
    }

    @com.google.common.annotations.c
    @l
    private static long O(Duration duration) {
        try {
            return duration.toNanos();
        } catch (ArithmeticException unused) {
            return duration.isNegative() ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
    }

    private void c() {
        j0.h0(this.f116773k == -1, "refreshAfterWrite requires a LoadingCache");
    }

    private void d() {
        if (this.f116768f == null) {
            j0.h0(this.f116767e == -1, "maximumWeight requires weigher");
        } else if (this.f116763a) {
            j0.h0(this.f116767e != -1, "weigher requires maximumWeight");
        } else if (this.f116767e == -1) {
            C1049d.f116779a.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
        }
    }

    @com.google.common.annotations.c
    public static d<Object, Object> j(com.google.common.cache.e spec) {
        return spec.f().C();
    }

    @com.google.common.annotations.c
    public static d<Object, Object> k(String spec) {
        return j(com.google.common.cache.e.e(spec));
    }

    boolean A() {
        return this.f116778p == f116760w;
    }

    @com.google.common.annotations.c
    @z7.a
    d<K, V> B(com.google.common.base.m<Object> equivalence) {
        com.google.common.base.m<Object> mVar = this.f116774l;
        j0.x0(mVar == null, "key equivalence was already set to %s", mVar);
        this.f116774l = (com.google.common.base.m) j0.E(equivalence);
        return this;
    }

    @com.google.common.annotations.c
    @z7.a
    d<K, V> C() {
        this.f116763a = false;
        return this;
    }

    @z7.a
    public d<K, V> D(long maximumSize) {
        long j10 = this.f116766d;
        j0.s0(j10 == -1, "maximum size was already set to %s", j10);
        long j11 = this.f116767e;
        j0.s0(j11 == -1, "maximum weight was already set to %s", j11);
        j0.h0(this.f116768f == null, "maximum size can not be combined with weigher");
        j0.e(maximumSize >= 0, "maximum size must not be negative");
        this.f116766d = maximumSize;
        return this;
    }

    @com.google.common.annotations.c
    @z7.a
    public d<K, V> E(long maximumWeight) {
        long j10 = this.f116767e;
        j0.s0(j10 == -1, "maximum weight was already set to %s", j10);
        long j11 = this.f116766d;
        j0.s0(j11 == -1, "maximum size was already set to %s", j11);
        j0.e(maximumWeight >= 0, "maximum weight must not be negative");
        this.f116767e = maximumWeight;
        return this;
    }

    @z7.a
    public d<K, V> G() {
        this.f116778p = f116760w;
        return this;
    }

    @com.google.common.annotations.c
    @z7.a
    public d<K, V> H(long duration, TimeUnit unit) {
        j0.E(unit);
        long j10 = this.f116773k;
        j0.s0(j10 == -1, "refresh was already set to %s ns", j10);
        j0.t(duration > 0, "duration must be positive: %s %s", duration, unit);
        this.f116773k = unit.toNanos(duration);
        return this;
    }

    @com.google.common.annotations.c
    @z7.a
    @l
    public d<K, V> I(Duration duration) {
        return H(O(duration), TimeUnit.NANOSECONDS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <K1 extends K, V1 extends V> d<K1, V1> J(w<? super K1, ? super V1> listener) {
        j0.g0(this.f116776n == null);
        this.f116776n = (w) j0.E(listener);
        return this;
    }

    @z7.a
    d<K, V> K(n.t strength) {
        n.t tVar = this.f116769g;
        j0.x0(tVar == null, "Key strength was already set to %s", tVar);
        this.f116769g = (n.t) j0.E(strength);
        return this;
    }

    @z7.a
    d<K, V> L(n.t strength) {
        n.t tVar = this.f116770h;
        j0.x0(tVar == null, "Value strength was already set to %s", tVar);
        this.f116770h = (n.t) j0.E(strength);
        return this;
    }

    @com.google.common.annotations.c
    @z7.a
    public d<K, V> M() {
        return L(n.t.f116948b);
    }

    @z7.a
    public d<K, V> N(w0 ticker) {
        j0.g0(this.f116777o == null);
        this.f116777o = (w0) j0.E(ticker);
        return this;
    }

    @com.google.common.annotations.c
    @z7.a
    d<K, V> P(com.google.common.base.m<Object> equivalence) {
        com.google.common.base.m<Object> mVar = this.f116775m;
        j0.x0(mVar == null, "value equivalence was already set to %s", mVar);
        this.f116775m = (com.google.common.base.m) j0.E(equivalence);
        return this;
    }

    @com.google.common.annotations.c
    @z7.a
    public d<K, V> Q() {
        return K(n.t.f116949c);
    }

    @com.google.common.annotations.c
    @z7.a
    public d<K, V> R() {
        return L(n.t.f116949c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @com.google.common.annotations.c
    @z7.a
    public <K1 extends K, V1 extends V> d<K1, V1> S(c0<? super K1, ? super V1> weigher) {
        j0.g0(this.f116768f == null);
        if (this.f116763a) {
            long j10 = this.f116766d;
            j0.s0(j10 == -1, "weigher can not be combined with maximum size (%s provided)", j10);
        }
        this.f116768f = (c0) j0.E(weigher);
        return this;
    }

    public <K1 extends K, V1 extends V> com.google.common.cache.c<K1, V1> a() {
        d();
        c();
        return new n.o(this);
    }

    public <K1 extends K, V1 extends V> m<K1, V1> b(g<? super K1, V1> loader) {
        d();
        return new n.C1052n(this, loader);
    }

    @z7.a
    public d<K, V> e(int concurrencyLevel) {
        int i10 = this.f116765c;
        j0.n0(i10 == -1, "concurrency level was already set to %s", i10);
        j0.d(concurrencyLevel > 0);
        this.f116765c = concurrencyLevel;
        return this;
    }

    @z7.a
    public d<K, V> f(long duration, TimeUnit unit) {
        long j10 = this.f116772j;
        j0.s0(j10 == -1, "expireAfterAccess was already set to %s ns", j10);
        j0.t(duration >= 0, "duration cannot be negative: %s %s", duration, unit);
        this.f116772j = unit.toNanos(duration);
        return this;
    }

    @com.google.common.annotations.c
    @z7.a
    @l
    public d<K, V> g(Duration duration) {
        return f(O(duration), TimeUnit.NANOSECONDS);
    }

    @z7.a
    public d<K, V> h(long duration, TimeUnit unit) {
        long j10 = this.f116771i;
        j0.s0(j10 == -1, "expireAfterWrite was already set to %s ns", j10);
        j0.t(duration >= 0, "duration cannot be negative: %s %s", duration, unit);
        this.f116771i = unit.toNanos(duration);
        return this;
    }

    @com.google.common.annotations.c
    @z7.a
    @l
    public d<K, V> i(Duration duration) {
        return h(O(duration), TimeUnit.NANOSECONDS);
    }

    int l() {
        int i10 = this.f116765c;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 6 ^ 4;
        return 4;
    }

    long m() {
        long j10 = this.f116772j;
        if (j10 == -1) {
            return 0L;
        }
        return j10;
    }

    long n() {
        long j10 = this.f116771i;
        if (j10 == -1) {
            j10 = 0;
        }
        return j10;
    }

    int o() {
        int i10 = this.f116764b;
        if (i10 == -1) {
            i10 = 16;
        }
        return i10;
    }

    com.google.common.base.m<Object> p() {
        return (com.google.common.base.m) com.google.common.base.b0.a(this.f116774l, q().l());
    }

    n.t q() {
        return (n.t) com.google.common.base.b0.a(this.f116769g, n.t.f116947a);
    }

    long r() {
        if (this.f116771i != 0 && this.f116772j != 0) {
            return this.f116768f == null ? this.f116766d : this.f116767e;
        }
        return 0L;
    }

    long s() {
        long j10 = this.f116773k;
        if (j10 == -1) {
            j10 = 0;
        }
        return j10;
    }

    <K1 extends K, V1 extends V> w<K1, V1> t() {
        return (w) com.google.common.base.b0.a(this.f116776n, e.INSTANCE);
    }

    public String toString() {
        com.google.common.base.b0.b bVarC = com.google.common.base.b0.c(this);
        int i10 = this.f116764b;
        if (i10 != -1) {
            bVarC.d("initialCapacity", i10);
        }
        int i11 = this.f116765c;
        if (i11 != -1) {
            bVarC.d("concurrencyLevel", i11);
        }
        long j10 = this.f116766d;
        if (j10 != -1) {
            bVarC.e("maximumSize", j10);
        }
        long j11 = this.f116767e;
        if (j11 != -1) {
            bVarC.e("maximumWeight", j11);
        }
        if (this.f116771i != -1) {
            bVarC.f("expireAfterWrite", this.f116771i + "ns");
        }
        if (this.f116772j != -1) {
            bVarC.f("expireAfterAccess", this.f116772j + "ns");
        }
        n.t tVar = this.f116769g;
        if (tVar != null) {
            bVarC.f("keyStrength", com.google.common.base.c.g(tVar.toString()));
        }
        n.t tVar2 = this.f116770h;
        if (tVar2 != null) {
            bVarC.f("valueStrength", com.google.common.base.c.g(tVar2.toString()));
        }
        if (this.f116774l != null) {
            bVarC.s("keyEquivalence");
        }
        if (this.f116775m != null) {
            bVarC.s("valueEquivalence");
        }
        if (this.f116776n != null) {
            bVarC.s("removalListener");
        }
        return bVarC.toString();
    }

    s0<? extends com.google.common.cache.a.b> u() {
        return this.f116778p;
    }

    w0 v(boolean recordsTime) {
        w0 w0Var = this.f116777o;
        if (w0Var != null) {
            return w0Var;
        }
        return recordsTime ? w0.b() : f116761x;
    }

    com.google.common.base.m<Object> w() {
        return (com.google.common.base.m) com.google.common.base.b0.a(this.f116775m, x().l());
    }

    n.t x() {
        return (n.t) com.google.common.base.b0.a(this.f116770h, n.t.f116947a);
    }

    <K1 extends K, V1 extends V> c0<K1, V1> y() {
        return (c0) com.google.common.base.b0.a(this.f116768f, f.INSTANCE);
    }

    @z7.a
    public d<K, V> z(int initialCapacity) {
        int i10 = this.f116764b;
        j0.n0(i10 == -1, "initial capacity was already set to %s", i10);
        j0.d(initialCapacity >= 0);
        this.f116764b = initialCapacity;
        return this;
    }
}
