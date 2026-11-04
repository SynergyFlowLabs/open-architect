package io.reactivex.disposables;

import java.util.concurrent.Future;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes8.dex */
public final class d {
    private d() {
        throw new IllegalStateException("No instances!");
    }

    @cj.f
    public static c a() {
        return io.reactivex.internal.disposables.e.INSTANCE;
    }

    @cj.f
    public static c b() {
        return f(io.reactivex.internal.functions.a.f298691b);
    }

    @cj.f
    public static c c(@cj.f dj.a aVar) {
        io.reactivex.internal.functions.b.g(aVar, "run is null");
        return new a(aVar);
    }

    @cj.f
    public static c d(@cj.f Future<?> future) {
        io.reactivex.internal.functions.b.g(future, "future is null");
        return e(future, true);
    }

    @cj.f
    public static c e(@cj.f Future<?> future, boolean z10) {
        io.reactivex.internal.functions.b.g(future, "future is null");
        return new e(future, z10);
    }

    @cj.f
    public static c f(@cj.f Runnable runnable) {
        io.reactivex.internal.functions.b.g(runnable, "run is null");
        return new g(runnable);
    }

    @cj.f
    public static c g(@cj.f w wVar) {
        io.reactivex.internal.functions.b.g(wVar, "subscription is null");
        return new i(wVar);
    }
}
