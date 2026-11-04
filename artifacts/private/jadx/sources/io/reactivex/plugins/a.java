package io.reactivex.plugins;

import cj.g;
import dj.e;
import dj.o;
import io.reactivex.b0;
import io.reactivex.c;
import io.reactivex.exceptions.d;
import io.reactivex.f;
import io.reactivex.i0;
import io.reactivex.internal.schedulers.h;
import io.reactivex.internal.schedulers.r;
import io.reactivex.internal.util.k;
import io.reactivex.j0;
import io.reactivex.k0;
import io.reactivex.l;
import io.reactivex.n0;
import io.reactivex.parallel.b;
import io.reactivex.s;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadFactory;
import org.reactivestreams.v;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @g
    static volatile dj.g<? super Throwable> f303583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @g
    static volatile o<? super Runnable, ? extends Runnable> f303584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @g
    static volatile o<? super Callable<j0>, ? extends j0> f303585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @g
    static volatile o<? super Callable<j0>, ? extends j0> f303586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @g
    static volatile o<? super Callable<j0>, ? extends j0> f303587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @g
    static volatile o<? super Callable<j0>, ? extends j0> f303588f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @g
    static volatile o<? super j0, ? extends j0> f303589g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @g
    static volatile o<? super j0, ? extends j0> f303590h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @g
    static volatile o<? super j0, ? extends j0> f303591i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @g
    static volatile o<? super j0, ? extends j0> f303592j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @g
    static volatile o<? super l, ? extends l> f303593k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @g
    static volatile o<? super io.reactivex.flowables.a, ? extends io.reactivex.flowables.a> f303594l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @g
    static volatile o<? super b0, ? extends b0> f303595m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @g
    static volatile o<? super io.reactivex.observables.a, ? extends io.reactivex.observables.a> f303596n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @g
    static volatile o<? super s, ? extends s> f303597o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @g
    static volatile o<? super k0, ? extends k0> f303598p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @g
    static volatile o<? super c, ? extends c> f303599q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @g
    static volatile o<? super b, ? extends b> f303600r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @g
    static volatile dj.c<? super l, ? super v, ? extends v> f303601s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @g
    static volatile dj.c<? super s, ? super io.reactivex.v, ? extends io.reactivex.v> f303602t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @g
    static volatile dj.c<? super b0, ? super i0, ? extends i0> f303603u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @g
    static volatile dj.c<? super k0, ? super n0, ? extends n0> f303604v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @g
    static volatile dj.c<? super c, ? super f, ? extends f> f303605w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @g
    static volatile e f303606x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static volatile boolean f303607y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    static volatile boolean f303608z;

    private a() {
        throw new IllegalStateException("No instances!");
    }

    @g
    public static dj.c<? super b0, ? super i0, ? extends i0> A() {
        return f303603u;
    }

    public static void A0(@g dj.c<? super s, io.reactivex.v, ? extends io.reactivex.v> cVar) {
        if (f303607y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f303602t = cVar;
    }

    @g
    public static o<? super b, ? extends b> B() {
        return f303600r;
    }

    public static void B0(@g o<? super b0, ? extends b0> oVar) {
        if (f303607y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f303595m = oVar;
    }

    @g
    public static o<? super k0, ? extends k0> C() {
        return f303598p;
    }

    public static void C0(@g dj.c<? super b0, ? super i0, ? extends i0> cVar) {
        if (f303607y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f303603u = cVar;
    }

    @g
    public static dj.c<? super k0, ? super n0, ? extends n0> D() {
        return f303604v;
    }

    public static void D0(@g o<? super b, ? extends b> oVar) {
        if (f303607y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f303600r = oVar;
    }

    @g
    public static o<? super Runnable, ? extends Runnable> E() {
        return f303584b;
    }

    public static void E0(@g o<? super k0, ? extends k0> oVar) {
        if (f303607y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f303598p = oVar;
    }

    @g
    public static o<? super j0, ? extends j0> F() {
        return f303590h;
    }

    public static void F0(@g dj.c<? super k0, ? super n0, ? extends n0> cVar) {
        if (f303607y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f303604v = cVar;
    }

    @cj.f
    public static j0 G(@cj.f Callable<j0> callable) {
        io.reactivex.internal.functions.b.g(callable, "Scheduler Callable can't be null");
        o<? super Callable<j0>, ? extends j0> oVar = f303585c;
        return oVar == null ? d(callable) : c(oVar, callable);
    }

    public static void G0(@g o<? super Runnable, ? extends Runnable> oVar) {
        if (f303607y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f303584b = oVar;
    }

    @cj.f
    public static j0 H(@cj.f Callable<j0> callable) {
        io.reactivex.internal.functions.b.g(callable, "Scheduler Callable can't be null");
        o<? super Callable<j0>, ? extends j0> oVar = f303587e;
        return oVar == null ? d(callable) : c(oVar, callable);
    }

    public static void H0(@g o<? super j0, ? extends j0> oVar) {
        if (f303607y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f303590h = oVar;
    }

    @cj.f
    public static j0 I(@cj.f Callable<j0> callable) {
        io.reactivex.internal.functions.b.g(callable, "Scheduler Callable can't be null");
        o<? super Callable<j0>, ? extends j0> oVar = f303588f;
        return oVar == null ? d(callable) : c(oVar, callable);
    }

    static void I0(@cj.f Throwable th2) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
    }

    @cj.f
    public static j0 J(@cj.f Callable<j0> callable) {
        io.reactivex.internal.functions.b.g(callable, "Scheduler Callable can't be null");
        o<? super Callable<j0>, ? extends j0> oVar = f303586d;
        return oVar == null ? d(callable) : c(oVar, callable);
    }

    static void J0() {
        f303607y = false;
    }

    static boolean K(Throwable th2) {
        return (th2 instanceof d) || (th2 instanceof io.reactivex.exceptions.c) || (th2 instanceof IllegalStateException) || (th2 instanceof NullPointerException) || (th2 instanceof IllegalArgumentException) || (th2 instanceof io.reactivex.exceptions.a);
    }

    public static boolean L() {
        return f303608z;
    }

    public static boolean M() {
        return f303607y;
    }

    public static void N() {
        f303607y = true;
    }

    @cj.f
    public static c O(@cj.f c cVar) {
        o<? super c, ? extends c> oVar = f303599q;
        return oVar != null ? (c) b(oVar, cVar) : cVar;
    }

    @cj.f
    public static <T> l<T> P(@cj.f l<T> lVar) {
        o<? super l, ? extends l> oVar = f303593k;
        return oVar != null ? (l) b(oVar, lVar) : lVar;
    }

    @cj.f
    public static <T> s<T> Q(@cj.f s<T> sVar) {
        o<? super s, ? extends s> oVar = f303597o;
        if (oVar != null) {
            sVar = (s) b(oVar, sVar);
        }
        return sVar;
    }

    @cj.f
    public static <T> b0<T> R(@cj.f b0<T> b0Var) {
        o<? super b0, ? extends b0> oVar = f303595m;
        return oVar != null ? (b0) b(oVar, b0Var) : b0Var;
    }

    @cj.f
    public static <T> k0<T> S(@cj.f k0<T> k0Var) {
        o<? super k0, ? extends k0> oVar = f303598p;
        return oVar != null ? (k0) b(oVar, k0Var) : k0Var;
    }

    @cj.f
    public static <T> io.reactivex.flowables.a<T> T(@cj.f io.reactivex.flowables.a<T> aVar) {
        o<? super io.reactivex.flowables.a, ? extends io.reactivex.flowables.a> oVar = f303594l;
        return oVar != null ? (io.reactivex.flowables.a) b(oVar, aVar) : aVar;
    }

    @cj.f
    public static <T> io.reactivex.observables.a<T> U(@cj.f io.reactivex.observables.a<T> aVar) {
        o<? super io.reactivex.observables.a, ? extends io.reactivex.observables.a> oVar = f303596n;
        if (oVar != null) {
            aVar = (io.reactivex.observables.a) b(oVar, aVar);
        }
        return aVar;
    }

    @cj.f
    public static <T> b<T> V(@cj.f b<T> bVar) {
        o<? super b, ? extends b> oVar = f303600r;
        return oVar != null ? (b) b(oVar, bVar) : bVar;
    }

    public static boolean W() {
        e eVar = f303606x;
        if (eVar == null) {
            return false;
        }
        try {
            return eVar.a();
        } catch (Throwable th2) {
            throw k.f(th2);
        }
    }

    @cj.f
    public static j0 X(@cj.f j0 j0Var) {
        o<? super j0, ? extends j0> oVar = f303589g;
        return oVar == null ? j0Var : (j0) b(oVar, j0Var);
    }

    public static void Y(@cj.f Throwable th2) {
        dj.g<? super Throwable> gVar = f303583a;
        if (th2 == null) {
            th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!K(th2)) {
            th2 = new io.reactivex.exceptions.f(th2);
        }
        if (gVar != null) {
            try {
                gVar.accept(th2);
                return;
            } catch (Throwable th3) {
                th3.printStackTrace();
                I0(th3);
            }
        }
        th2.printStackTrace();
        I0(th2);
    }

    @cj.f
    public static j0 Z(@cj.f j0 j0Var) {
        o<? super j0, ? extends j0> oVar = f303591i;
        return oVar == null ? j0Var : (j0) b(oVar, j0Var);
    }

    @cj.f
    static <T, U, R> R a(@cj.f dj.c<T, U, R> cVar, @cj.f T t10, @cj.f U u10) {
        try {
            return cVar.apply(t10, u10);
        } catch (Throwable th2) {
            throw k.f(th2);
        }
    }

    @cj.f
    public static j0 a0(@cj.f j0 j0Var) {
        o<? super j0, ? extends j0> oVar = f303592j;
        return oVar == null ? j0Var : (j0) b(oVar, j0Var);
    }

    @cj.f
    static <T, R> R b(@cj.f o<T, R> oVar, @cj.f T t10) {
        try {
            return oVar.apply(t10);
        } catch (Throwable th2) {
            throw k.f(th2);
        }
    }

    @cj.f
    public static Runnable b0(@cj.f Runnable runnable) {
        io.reactivex.internal.functions.b.g(runnable, "run is null");
        o<? super Runnable, ? extends Runnable> oVar = f303584b;
        return oVar == null ? runnable : (Runnable) b(oVar, runnable);
    }

    @cj.f
    static j0 c(@cj.f o<? super Callable<j0>, ? extends j0> oVar, Callable<j0> callable) {
        return (j0) io.reactivex.internal.functions.b.g(b(oVar, callable), "Scheduler Callable result can't be null");
    }

    @cj.f
    public static j0 c0(@cj.f j0 j0Var) {
        o<? super j0, ? extends j0> oVar = f303590h;
        return oVar == null ? j0Var : (j0) b(oVar, j0Var);
    }

    @cj.f
    static j0 d(@cj.f Callable<j0> callable) {
        try {
            return (j0) io.reactivex.internal.functions.b.g(callable.call(), "Scheduler Callable result can't be null");
        } catch (Throwable th2) {
            throw k.f(th2);
        }
    }

    @cj.f
    public static f d0(@cj.f c cVar, @cj.f f fVar) {
        dj.c<? super c, ? super f, ? extends f> cVar2 = f303605w;
        return cVar2 != null ? (f) a(cVar2, cVar, fVar) : fVar;
    }

    @cj.f
    public static j0 e(@cj.f ThreadFactory threadFactory) {
        return new io.reactivex.internal.schedulers.b((ThreadFactory) io.reactivex.internal.functions.b.g(threadFactory, "threadFactory is null"));
    }

    @cj.f
    public static <T> io.reactivex.v<? super T> e0(@cj.f s<T> sVar, @cj.f io.reactivex.v<? super T> vVar) {
        dj.c<? super s, ? super io.reactivex.v, ? extends io.reactivex.v> cVar = f303602t;
        return cVar != null ? (io.reactivex.v) a(cVar, sVar, vVar) : vVar;
    }

    @cj.f
    public static j0 f(@cj.f ThreadFactory threadFactory) {
        return new io.reactivex.internal.schedulers.g((ThreadFactory) io.reactivex.internal.functions.b.g(threadFactory, "threadFactory is null"));
    }

    @cj.f
    public static <T> i0<? super T> f0(@cj.f b0<T> b0Var, @cj.f i0<? super T> i0Var) {
        dj.c<? super b0, ? super i0, ? extends i0> cVar = f303603u;
        return cVar != null ? (i0) a(cVar, b0Var, i0Var) : i0Var;
    }

    @cj.f
    public static j0 g(@cj.f ThreadFactory threadFactory) {
        return new h((ThreadFactory) io.reactivex.internal.functions.b.g(threadFactory, "threadFactory is null"));
    }

    @cj.f
    public static <T> n0<? super T> g0(@cj.f k0<T> k0Var, @cj.f n0<? super T> n0Var) {
        dj.c<? super k0, ? super n0, ? extends n0> cVar = f303604v;
        return cVar != null ? (n0) a(cVar, k0Var, n0Var) : n0Var;
    }

    @cj.f
    public static j0 h(@cj.f ThreadFactory threadFactory) {
        return new r((ThreadFactory) io.reactivex.internal.functions.b.g(threadFactory, "threadFactory is null"));
    }

    @cj.f
    public static <T> v<? super T> h0(@cj.f l<T> lVar, @cj.f v<? super T> vVar) {
        dj.c<? super l, ? super v, ? extends v> cVar = f303601s;
        return cVar != null ? (v) a(cVar, lVar, vVar) : vVar;
    }

    @g
    public static o<? super j0, ? extends j0> i() {
        return f303589g;
    }

    public static void i0() {
        k0(null);
        G0(null);
        j0(null);
        m0(null);
        q0(null);
        n0(null);
        H0(null);
        p0(null);
        r0(null);
        o0(null);
        x0(null);
        y0(null);
        B0(null);
        C0(null);
        E0(null);
        F0(null);
        t0(null);
        u0(null);
        v0(null);
        w0(null);
        z0(null);
        A0(null);
        D0(null);
        l0(false);
        s0(null);
    }

    @g
    public static dj.g<? super Throwable> j() {
        return f303583a;
    }

    public static void j0(@g o<? super j0, ? extends j0> oVar) {
        if (f303607y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f303589g = oVar;
    }

    @g
    public static o<? super Callable<j0>, ? extends j0> k() {
        return f303585c;
    }

    public static void k0(@g dj.g<? super Throwable> gVar) {
        if (f303607y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f303583a = gVar;
    }

    @g
    public static o<? super Callable<j0>, ? extends j0> l() {
        return f303587e;
    }

    public static void l0(boolean z10) {
        if (f303607y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f303608z = z10;
    }

    @g
    public static o<? super Callable<j0>, ? extends j0> m() {
        return f303588f;
    }

    public static void m0(@g o<? super Callable<j0>, ? extends j0> oVar) {
        if (f303607y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f303585c = oVar;
    }

    @g
    public static o<? super Callable<j0>, ? extends j0> n() {
        return f303586d;
    }

    public static void n0(@g o<? super Callable<j0>, ? extends j0> oVar) {
        if (f303607y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f303587e = oVar;
    }

    @g
    public static o<? super j0, ? extends j0> o() {
        return f303591i;
    }

    public static void o0(@g o<? super Callable<j0>, ? extends j0> oVar) {
        if (f303607y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f303588f = oVar;
    }

    @g
    public static o<? super j0, ? extends j0> p() {
        return f303592j;
    }

    public static void p0(@g o<? super Callable<j0>, ? extends j0> oVar) {
        if (f303607y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f303586d = oVar;
    }

    @g
    public static e q() {
        return f303606x;
    }

    public static void q0(@g o<? super j0, ? extends j0> oVar) {
        if (f303607y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f303591i = oVar;
    }

    @g
    public static o<? super c, ? extends c> r() {
        return f303599q;
    }

    public static void r0(@g o<? super j0, ? extends j0> oVar) {
        if (f303607y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f303592j = oVar;
    }

    @g
    public static dj.c<? super c, ? super f, ? extends f> s() {
        return f303605w;
    }

    public static void s0(@g e eVar) {
        if (f303607y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f303606x = eVar;
    }

    @g
    public static o<? super io.reactivex.flowables.a, ? extends io.reactivex.flowables.a> t() {
        return f303594l;
    }

    public static void t0(@g o<? super c, ? extends c> oVar) {
        if (f303607y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f303599q = oVar;
    }

    @g
    public static o<? super io.reactivex.observables.a, ? extends io.reactivex.observables.a> u() {
        return f303596n;
    }

    public static void u0(@g dj.c<? super c, ? super f, ? extends f> cVar) {
        if (f303607y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f303605w = cVar;
    }

    @g
    public static o<? super l, ? extends l> v() {
        return f303593k;
    }

    public static void v0(@g o<? super io.reactivex.flowables.a, ? extends io.reactivex.flowables.a> oVar) {
        if (f303607y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f303594l = oVar;
    }

    @g
    public static dj.c<? super l, ? super v, ? extends v> w() {
        return f303601s;
    }

    public static void w0(@g o<? super io.reactivex.observables.a, ? extends io.reactivex.observables.a> oVar) {
        if (f303607y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f303596n = oVar;
    }

    @g
    public static o<? super s, ? extends s> x() {
        return f303597o;
    }

    public static void x0(@g o<? super l, ? extends l> oVar) {
        if (f303607y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f303593k = oVar;
    }

    @g
    public static dj.c<? super s, ? super io.reactivex.v, ? extends io.reactivex.v> y() {
        return f303602t;
    }

    public static void y0(@g dj.c<? super l, ? super v, ? extends v> cVar) {
        if (f303607y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f303601s = cVar;
    }

    @g
    public static o<? super b0, ? extends b0> z() {
        return f303595m;
    }

    public static void z0(@g o<? super s, ? extends s> oVar) {
        if (f303607y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f303597o = oVar;
    }
}
