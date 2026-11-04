package io.sentry;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class t4 implements g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private volatile io.sentry.protocol.v f306789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private y7 f306790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private r1 f306791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private WeakReference<p1> f306792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private String f306793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private io.sentry.protocol.g0 f306794f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private String f306795g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private io.sentry.protocol.m f306796h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private List<String> f306797i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private volatile Queue<f> f306798j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private Map<String, String> f306799k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private Map<String, Object> f306800l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private List<io.sentry.internal.eventprocessor.a> f306801m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private volatile n8 f306802n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private volatile k9 f306803o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f306804p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f306805q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f306806r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private io.sentry.protocol.c f306807s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private List<io.sentry.b> f306808t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private m4 f306809u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private io.sentry.protocol.v f306810v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private k1 f306811w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    private final Map<Throwable, io.sentry.util.z<WeakReference<p1>, String>> f306812x;

    @lm.a.c
    public interface a {
        void a(@NotNull m4 m4Var);
    }

    interface b {
        void a(@Nullable k9 k9Var);
    }

    @lm.a.c
    public interface c {
        void a(@Nullable r1 r1Var);
    }

    static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final k9 f306813a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final k9 f306814b;

        public d(@NotNull k9 k9Var, @Nullable k9 k9Var2) {
            this.f306814b = k9Var;
            this.f306813a = k9Var2;
        }

        @NotNull
        public k9 a() {
            return this.f306814b;
        }

        @Nullable
        public k9 b() {
            return this.f306813a;
        }
    }

    public t4(@NotNull n8 n8Var) {
        this.f306792d = new WeakReference<>(null);
        this.f306797i = new ArrayList();
        this.f306799k = new ConcurrentHashMap();
        this.f306800l = new ConcurrentHashMap();
        this.f306801m = new CopyOnWriteArrayList();
        this.f306804p = new io.sentry.util.a();
        this.f306805q = new io.sentry.util.a();
        this.f306806r = new io.sentry.util.a();
        this.f306807s = new io.sentry.protocol.c();
        this.f306808t = new CopyOnWriteArrayList();
        io.sentry.protocol.v vVar = io.sentry.protocol.v.f306474b;
        this.f306810v = vVar;
        this.f306811w = l3.s();
        this.f306812x = Collections.synchronizedMap(new WeakHashMap());
        this.f306802n = (n8) io.sentry.util.y.c(n8Var, "SentryOptions is required.");
        this.f306798j = i(this.f306802n.getMaxBreadcrumbs());
        this.f306809u = new m4();
        this.f306789a = vVar;
    }

    @NotNull
    static Queue<f> i(int i10) {
        return i10 > 0 ? ba.k(new j(i10)) : new z();
    }

    @Nullable
    private f w(@NotNull n8.a aVar, @NotNull f fVar, @NotNull n0 n0Var) {
        try {
            return aVar.a(fVar, n0Var);
        } catch (Throwable th2) {
            this.f306802n.getLogger().a(y7.ERROR, "The BeforeBreadcrumbCallback callback threw an exception. Exception details will be added to the breadcrumb.", th2);
            if (th2.getMessage() != null) {
                fVar.U("sentry:message", th2.getMessage());
            }
            return fVar;
        }
    }

    @Override // io.sentry.g1
    public void A(@NotNull io.sentry.protocol.v vVar) {
        this.f306810v = vVar;
        Iterator<h1> it = this.f306802n.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().A(vVar);
        }
    }

    @Override // io.sentry.g1
    public void B(@Nullable String str, @Nullable Collection<?> collection) {
        if (str == null) {
            return;
        }
        if (collection == null) {
            X(str, null);
            return;
        }
        HashMap map = new HashMap();
        map.put("value", collection);
        X(str, map);
    }

    @Override // io.sentry.g1
    @lm.a.c
    @NotNull
    public Queue<f> C() {
        return this.f306798j;
    }

    @Override // io.sentry.g1
    @lm.a.c
    @Nullable
    public k9 D(@NotNull b bVar) {
        m1 m1VarA = this.f306804p.a();
        try {
            bVar.a(this.f306803o);
            k9 k9VarClone = this.f306803o != null ? this.f306803o.clone() : null;
            if (m1VarA != null) {
                m1VarA.close();
            }
            return k9VarClone;
        } catch (Throwable th2) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.g1
    @lm.a.c
    @NotNull
    public Map<String, String> E() {
        return io.sentry.util.d.f(this.f306799k);
    }

    @Override // io.sentry.g1
    public void F(@Nullable r1 r1Var) {
        m1 m1VarA = this.f306805q.a();
        try {
            this.f306791c = r1Var;
            for (h1 h1Var : this.f306802n.getScopeObservers()) {
                if (r1Var != null) {
                    h1Var.l(r1Var.getName());
                    h1Var.n(r1Var.m(), this);
                } else {
                    h1Var.l(null);
                    h1Var.n(null, this);
                }
            }
            if (m1VarA != null) {
                m1VarA.close();
            }
        } catch (Throwable th2) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.g1
    @Nullable
    public io.sentry.protocol.g0 G() {
        return this.f306794f;
    }

    @Override // io.sentry.g1
    public void H(@Nullable String str, @Nullable Boolean bool) {
        if (str == null) {
            return;
        }
        if (bool == null) {
            X(str, null);
            return;
        }
        HashMap map = new HashMap();
        map.put("value", bool);
        X(str, map);
    }

    @Override // io.sentry.g1
    public void I() {
        this.f306808t.clear();
    }

    @Override // io.sentry.g1
    public void J() {
        m1 m1VarA = this.f306805q.a();
        try {
            this.f306791c = null;
            if (m1VarA != null) {
                m1VarA.close();
            }
            this.f306793e = null;
            for (h1 h1Var : this.f306802n.getScopeObservers()) {
                h1Var.l(null);
                h1Var.n(null, this);
            }
        } catch (Throwable th2) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.g1
    public void K(@Nullable String str, @Nullable Character ch2) {
        if (str == null) {
            return;
        }
        if (ch2 == null) {
            X(str, null);
            return;
        }
        HashMap map = new HashMap();
        map.put("value", ch2);
        X(str, map);
    }

    @Override // io.sentry.g1
    @lm.a.c
    @Nullable
    public k9 L() {
        return this.f306803o;
    }

    @Override // io.sentry.g1
    public void M(@Nullable String str, @Nullable Object[] objArr) {
        if (str == null) {
            return;
        }
        if (objArr == null) {
            X(str, null);
            return;
        }
        HashMap map = new HashMap();
        map.put("value", objArr);
        X(str, map);
    }

    @Override // io.sentry.g1
    @lm.a.c
    public void N(@Nullable String str) {
        this.f306795g = str;
        io.sentry.protocol.c cVarQ = q();
        io.sentry.protocol.a aVarD = cVarQ.d();
        if (aVarD == null) {
            aVarD = new io.sentry.protocol.a();
            cVarQ.w(aVarD);
        }
        if (str == null) {
            aVarD.K(null);
        } else {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(str);
            aVarD.K(arrayList);
        }
        Iterator<h1> it = this.f306802n.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().g(cVarQ);
        }
    }

    @Override // io.sentry.g1
    @NotNull
    public k1 O() {
        return this.f306811w;
    }

    @Override // io.sentry.g1
    public void P(@NotNull i0 i0Var) {
        this.f306801m.add(new io.sentry.internal.eventprocessor.a(i0Var, i0Var.getOrder()));
    }

    @Override // io.sentry.g1
    @lm.a.c
    public void Q(@NotNull o7 o7Var) {
        io.sentry.util.z<WeakReference<p1>, String> zVar;
        p1 p1Var;
        if (this.f306802n.isTracingEnabled() && o7Var.S() != null && (zVar = this.f306812x.get(io.sentry.util.h.a(o7Var.S()))) != null) {
            WeakReference<p1> weakReferenceA = zVar.a();
            if (o7Var.E().o() == null && weakReferenceA != null && (p1Var = weakReferenceA.get()) != null) {
                o7Var.E().G(p1Var.m());
            }
            String strB = zVar.b();
            if (o7Var.F0() == null && strB != null) {
                o7Var.T0(strB);
            }
        }
    }

    @Override // io.sentry.g1
    @lm.a.c
    @NotNull
    public List<i0> R() {
        return io.sentry.util.g.a(this.f306801m);
    }

    @Override // io.sentry.g1
    public void S(@Nullable String str, @Nullable Number number) {
        if (str == null) {
            return;
        }
        if (number == null) {
            X(str, null);
            return;
        }
        HashMap map = new HashMap();
        map.put("value", number);
        X(str, map);
    }

    @Override // io.sentry.g1
    @lm.a.c
    public void T(@NotNull m4 m4Var) {
        this.f306809u = m4Var;
        p9 p9VarO = m4Var.o();
        Iterator<h1> it = this.f306802n.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().n(p9VarO, this);
        }
    }

    @Override // io.sentry.g1
    @lm.a.c
    public void U(@NotNull n8 n8Var) {
        this.f306802n = n8Var;
        Queue<f> queue = this.f306798j;
        this.f306798j = i(n8Var.getMaxBreadcrumbs());
        Iterator<f> it = queue.iterator();
        while (it.hasNext()) {
            k(it.next());
        }
    }

    @Override // io.sentry.g1
    public void V(@Nullable String str, @Nullable String str2) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            X(str, null);
            return;
        }
        HashMap map = new HashMap();
        map.put("value", str2);
        X(str, map);
    }

    @Override // io.sentry.g1
    @lm.a.c
    @NotNull
    public List<io.sentry.internal.eventprocessor.a> W() {
        return this.f306801m;
    }

    @Override // io.sentry.g1
    public void X(@Nullable String str, @Nullable Object obj) {
        if (str != null) {
            this.f306807s.r(str, obj);
            Iterator<h1> it = this.f306802n.getScopeObservers().iterator();
            while (it.hasNext()) {
                it.next().g(this.f306807s);
            }
        }
    }

    @Override // io.sentry.g1
    @lm.a.c
    @Nullable
    public String Y() {
        return this.f306795g;
    }

    @Override // io.sentry.g1
    @lm.a.c
    @NotNull
    public List<String> Z() {
        return this.f306797i;
    }

    @Override // io.sentry.g1
    public void a(@Nullable String str, @Nullable String str2) {
        if (str != null) {
            if (str2 == null) {
                f(str);
                return;
            }
            this.f306799k.put(str, str2);
            for (h1 h1Var : this.f306802n.getScopeObservers()) {
                h1Var.a(str, str2);
                h1Var.b(this.f306799k);
            }
        }
    }

    @Override // io.sentry.g1
    @Nullable
    public String a0() {
        r1 r1Var = this.f306791c;
        return r1Var != null ? r1Var.getName() : this.f306793e;
    }

    @Override // io.sentry.g1
    @lm.a.c
    @NotNull
    public n8 b() {
        return this.f306802n;
    }

    @Override // io.sentry.g1
    public void b0(@Nullable String str) {
        if (str == null) {
            return;
        }
        this.f306807s.u(str);
    }

    @Override // io.sentry.g1
    public void c(@Nullable String str) {
        if (str == null) {
            return;
        }
        this.f306800l.remove(str);
        for (h1 h1Var : this.f306802n.getScopeObservers()) {
            h1Var.c(str);
            h1Var.i(this.f306800l);
        }
    }

    @Override // io.sentry.g1
    @lm.a.c
    @NotNull
    public m4 c0() {
        return this.f306809u;
    }

    @Override // io.sentry.g1
    public void clear() {
        this.f306790b = null;
        this.f306794f = null;
        this.f306796h = null;
        this.f306795g = null;
        this.f306797i.clear();
        o();
        this.f306799k.clear();
        this.f306800l.clear();
        this.f306801m.clear();
        J();
        I();
    }

    @Override // io.sentry.g1
    public void d(@Nullable String str, @Nullable String str2) {
        if (str != null) {
            if (str2 == null) {
                c(str);
                return;
            }
            this.f306800l.put(str, str2);
            for (h1 h1Var : this.f306802n.getScopeObservers()) {
                h1Var.d(str, str2);
                h1Var.i(this.f306800l);
            }
        }
    }

    @Override // io.sentry.g1
    public void d0(@NotNull io.sentry.b bVar) {
        this.f306808t.add(bVar);
    }

    @Override // io.sentry.g1
    @Nullable
    public p1 e() {
        p1 p1VarH;
        p1 p1Var = this.f306792d.get();
        if (p1Var != null) {
            return p1Var;
        }
        r1 r1Var = this.f306791c;
        return (r1Var == null || (p1VarH = r1Var.H()) == null) ? r1Var : p1VarH;
    }

    @Override // io.sentry.g1
    @lm.a.c
    @NotNull
    public List<io.sentry.b> e0() {
        return new CopyOnWriteArrayList(this.f306808t);
    }

    @Override // io.sentry.g1
    public void f(@Nullable String str) {
        if (str == null) {
            return;
        }
        this.f306799k.remove(str);
        for (h1 h1Var : this.f306802n.getScopeObservers()) {
            h1Var.f(str);
            h1Var.b(this.f306799k);
        }
    }

    @Override // io.sentry.g1
    @lm.a.c
    public void f0() {
        this.f306803o = null;
    }

    @Override // io.sentry.g1
    @Nullable
    public y7 g() {
        return this.f306790b;
    }

    @Override // io.sentry.g1
    @lm.a.c
    @NotNull
    public m4 g0(@NotNull a aVar) {
        m1 m1VarA = this.f306806r.a();
        try {
            aVar.a(this.f306809u);
            m4 m4Var = new m4(this.f306809u);
            if (m1VarA != null) {
                m1VarA.close();
            }
            return m4Var;
        } catch (Throwable th2) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.g1
    @lm.a.c
    @NotNull
    public Map<String, Object> getExtras() {
        return this.f306800l;
    }

    @Override // io.sentry.g1
    @Nullable
    public io.sentry.protocol.m getRequest() {
        return this.f306796h;
    }

    @Override // io.sentry.g1
    public void h(@Nullable y7 y7Var) {
        this.f306790b = y7Var;
        Iterator<h1> it = this.f306802n.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().h(y7Var);
        }
    }

    @Override // io.sentry.g1
    @lm.a.c
    public void h0(@NotNull c cVar) {
        m1 m1VarA = this.f306805q.a();
        try {
            cVar.a(this.f306791c);
            if (m1VarA != null) {
                m1VarA.close();
            }
        } catch (Throwable th2) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.g1
    public void i0(@NotNull io.sentry.protocol.v vVar) {
        this.f306789a = vVar;
    }

    @Override // io.sentry.g1
    public void j(@Nullable io.sentry.protocol.g0 g0Var) {
        this.f306794f = g0Var;
        Iterator<h1> it = this.f306802n.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().j(g0Var);
        }
    }

    @Override // io.sentry.g1
    public void k(@NotNull f fVar) {
        m(fVar, null);
    }

    @Override // io.sentry.g1
    public void l(@NotNull String str) {
        if (str == null) {
            this.f306802n.getLogger().c(y7.WARNING, "Transaction cannot be null", new Object[0]);
            return;
        }
        r1 r1Var = this.f306791c;
        if (r1Var != null) {
            r1Var.s(str, io.sentry.protocol.f0.CUSTOM);
        }
        this.f306793e = str;
        Iterator<h1> it = this.f306802n.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().l(str);
        }
    }

    @Override // io.sentry.g1
    public void m(@NotNull f fVar, @Nullable n0 n0Var) {
        if (fVar != null && !(this.f306798j instanceof z)) {
            if (n0Var == null) {
                n0Var = new n0();
            }
            n8.a beforeBreadcrumb = this.f306802n.getBeforeBreadcrumb();
            if (beforeBreadcrumb != null) {
                fVar = w(beforeBreadcrumb, fVar, n0Var);
            }
            if (fVar == null) {
                this.f306802n.getLogger().c(y7.INFO, "Breadcrumb was dropped by beforeBreadcrumb", new Object[0]);
                return;
            }
            this.f306798j.add(fVar);
            for (h1 h1Var : this.f306802n.getScopeObservers()) {
                h1Var.k(fVar);
                h1Var.e(this.f306798j);
            }
        }
    }

    @Override // io.sentry.g1
    @lm.a.c
    public void n(@NotNull Throwable th2, @NotNull p1 p1Var, @NotNull String str) {
        io.sentry.util.y.c(th2, "throwable is required");
        io.sentry.util.y.c(p1Var, "span is required");
        io.sentry.util.y.c(str, "transactionName is required");
        Throwable thA = io.sentry.util.h.a(th2);
        if (this.f306812x.containsKey(thA)) {
            return;
        }
        this.f306812x.put(thA, new io.sentry.util.z<>(new WeakReference(p1Var), str));
    }

    @Override // io.sentry.g1
    public void o() {
        this.f306798j.clear();
        Iterator<h1> it = this.f306802n.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().e(this.f306798j);
        }
    }

    @Override // io.sentry.g1
    @Nullable
    public r1 p() {
        return this.f306791c;
    }

    @Override // io.sentry.g1
    @NotNull
    public io.sentry.protocol.c q() {
        return this.f306807s;
    }

    @Override // io.sentry.g1
    public void r(@Nullable io.sentry.protocol.m mVar) {
        this.f306796h = mVar;
        Iterator<h1> it = this.f306802n.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().r(mVar);
        }
    }

    @Override // io.sentry.g1
    public void s(@NotNull k1 k1Var) {
        this.f306811w = k1Var;
    }

    @Override // io.sentry.g1
    @NotNull
    public io.sentry.protocol.v t() {
        return this.f306810v;
    }

    @Override // io.sentry.g1
    @lm.a.c
    @Nullable
    public d u() {
        m1 m1VarA = this.f306804p.a();
        try {
            if (this.f306803o != null) {
                this.f306803o.c();
                this.f306802n.getContinuousProfiler().k();
            }
            k9 k9Var = this.f306803o;
            d dVar = null;
            if (this.f306802n.getRelease() != null) {
                this.f306803o = new k9(this.f306802n.getDistinctId(), this.f306794f, this.f306802n.getEnvironment(), this.f306802n.getRelease());
                dVar = new d(this.f306803o.clone(), k9Var != null ? k9Var.clone() : null);
            } else {
                this.f306802n.getLogger().c(y7.WARNING, "Release is not set on SentryOptions. Session could not be started", new Object[0]);
            }
            if (m1VarA != null) {
                m1VarA.close();
            }
            return dVar;
        } catch (Throwable th2) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.g1
    public void v(@NotNull List<String> list) {
        if (list != null) {
            this.f306797i = new ArrayList(list);
            Iterator<h1> it = this.f306802n.getScopeObservers().iterator();
            while (it.hasNext()) {
                it.next().m(list);
            }
        }
    }

    @Override // io.sentry.g1
    public void x(@Nullable p1 p1Var) {
        this.f306792d = new WeakReference<>(p1Var);
    }

    @Override // io.sentry.g1
    @lm.a.c
    @Nullable
    public k9 y() {
        m1 m1VarA = this.f306804p.a();
        try {
            k9 k9Var = null;
            if (this.f306803o != null) {
                this.f306803o.c();
                this.f306802n.getContinuousProfiler().k();
                k9 k9VarClone = this.f306803o.clone();
                this.f306803o = null;
                k9Var = k9VarClone;
            }
            if (m1VarA != null) {
                m1VarA.close();
            }
            return k9Var;
        } catch (Throwable th2) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.g1
    @NotNull
    public io.sentry.protocol.v z() {
        return this.f306789a;
    }

    @Override // io.sentry.g1
    @NotNull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public g1 m784clone() {
        return new t4(this);
    }

    private t4(@NotNull t4 t4Var) {
        this.f306792d = new WeakReference<>(null);
        this.f306797i = new ArrayList();
        this.f306799k = new ConcurrentHashMap();
        this.f306800l = new ConcurrentHashMap();
        this.f306801m = new CopyOnWriteArrayList();
        this.f306804p = new io.sentry.util.a();
        this.f306805q = new io.sentry.util.a();
        this.f306806r = new io.sentry.util.a();
        this.f306807s = new io.sentry.protocol.c();
        this.f306808t = new CopyOnWriteArrayList();
        this.f306810v = io.sentry.protocol.v.f306474b;
        this.f306811w = l3.s();
        this.f306812x = Collections.synchronizedMap(new WeakHashMap());
        this.f306791c = t4Var.f306791c;
        this.f306793e = t4Var.f306793e;
        this.f306803o = t4Var.f306803o;
        this.f306802n = t4Var.f306802n;
        this.f306790b = t4Var.f306790b;
        this.f306811w = t4Var.f306811w;
        this.f306789a = t4Var.z();
        io.sentry.protocol.g0 g0Var = t4Var.f306794f;
        this.f306794f = g0Var != null ? new io.sentry.protocol.g0(g0Var) : null;
        this.f306795g = t4Var.f306795g;
        this.f306810v = t4Var.f306810v;
        io.sentry.protocol.m mVar = t4Var.f306796h;
        this.f306796h = mVar != null ? new io.sentry.protocol.m(mVar) : null;
        this.f306797i = new ArrayList(t4Var.f306797i);
        this.f306801m = new CopyOnWriteArrayList(t4Var.f306801m);
        f[] fVarArr = (f[]) t4Var.f306798j.toArray(new f[0]);
        Queue<f> queueI = i(t4Var.f306802n.getMaxBreadcrumbs());
        for (f fVar : fVarArr) {
            queueI.add(new f(fVar));
        }
        this.f306798j = queueI;
        Map<String, String> map = t4Var.f306799k;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry != null) {
                concurrentHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        this.f306799k = concurrentHashMap;
        Map<String, Object> map2 = t4Var.f306800l;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        for (Map.Entry<String, Object> entry2 : map2.entrySet()) {
            if (entry2 != null) {
                concurrentHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        this.f306800l = concurrentHashMap2;
        this.f306807s = new io.sentry.protocol.c(t4Var.f306807s);
        this.f306808t = new CopyOnWriteArrayList(t4Var.f306808t);
        this.f306809u = new m4(t4Var.f306809u);
    }
}
