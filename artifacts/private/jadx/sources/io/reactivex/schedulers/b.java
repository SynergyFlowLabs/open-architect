package io.reactivex.schedulers;

import io.reactivex.internal.schedulers.p;
import io.reactivex.internal.schedulers.r;
import io.reactivex.internal.schedulers.s;
import io.reactivex.j0;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @cj.f
    static final j0 f303714a = io.reactivex.plugins.a.J(new h());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @cj.f
    static final j0 f303715b = io.reactivex.plugins.a.G(new CallableC2201b());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @cj.f
    static final j0 f303716c = io.reactivex.plugins.a.H(new c());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @cj.f
    static final j0 f303717d = s.l();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @cj.f
    static final j0 f303718e = io.reactivex.plugins.a.I(new f());

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final j0 f303719a = new io.reactivex.internal.schedulers.b();

        a() {
        }
    }

    /* JADX INFO: renamed from: io.reactivex.schedulers.b$b, reason: collision with other inner class name */
    static final class CallableC2201b implements Callable<j0> {
        CallableC2201b() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j0 call() throws Exception {
            return a.f303719a;
        }
    }

    static final class c implements Callable<j0> {
        c() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j0 call() throws Exception {
            return d.f303720a;
        }
    }

    static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final j0 f303720a = new io.reactivex.internal.schedulers.g();

        d() {
        }
    }

    static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final j0 f303721a = new io.reactivex.internal.schedulers.h();

        e() {
        }
    }

    static final class f implements Callable<j0> {
        f() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j0 call() throws Exception {
            return e.f303721a;
        }
    }

    static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final j0 f303722a = new r();

        g() {
        }
    }

    static final class h implements Callable<j0> {
        h() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j0 call() throws Exception {
            return g.f303722a;
        }
    }

    private b() {
        throw new IllegalStateException("No instances!");
    }

    @cj.f
    public static j0 a() {
        return io.reactivex.plugins.a.X(f303715b);
    }

    @cj.f
    public static j0 b(@cj.f Executor executor) {
        return new io.reactivex.internal.schedulers.d(executor, false);
    }

    @cj.f
    @cj.e
    public static j0 c(@cj.f Executor executor, boolean z10) {
        return new io.reactivex.internal.schedulers.d(executor, z10);
    }

    @cj.f
    public static j0 d() {
        return io.reactivex.plugins.a.Z(f303716c);
    }

    @cj.f
    public static j0 e() {
        return io.reactivex.plugins.a.a0(f303718e);
    }

    public static void f() {
        a().h();
        d().h();
        e().h();
        g().h();
        i().h();
        p.b();
    }

    @cj.f
    public static j0 g() {
        return io.reactivex.plugins.a.c0(f303714a);
    }

    public static void h() {
        a().i();
        d().i();
        e().i();
        g().i();
        i().i();
        p.c();
    }

    @cj.f
    public static j0 i() {
        return f303717d;
    }
}
