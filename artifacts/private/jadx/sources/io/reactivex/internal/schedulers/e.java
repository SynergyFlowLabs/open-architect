package io.reactivex.internal.schedulers;

import io.reactivex.j0;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends j0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j0 f303224b = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final j0.c f303225c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final io.reactivex.disposables.c f303226d;

    static final class a extends j0.c {
        a() {
        }

        @Override // io.reactivex.j0.c
        @cj.f
        public io.reactivex.disposables.c b(@cj.f Runnable runnable) {
            runnable.run();
            return e.f303226d;
        }

        @Override // io.reactivex.j0.c
        @cj.f
        public io.reactivex.disposables.c c(@cj.f Runnable runnable, long j10, @cj.f TimeUnit timeUnit) {
            throw new UnsupportedOperationException("This scheduler doesn't support delayed execution");
        }

        @Override // io.reactivex.j0.c
        @cj.f
        public io.reactivex.disposables.c d(@cj.f Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            throw new UnsupportedOperationException("This scheduler doesn't support periodic execution");
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return false;
        }
    }

    static {
        io.reactivex.disposables.c cVarB = io.reactivex.disposables.d.b();
        f303226d = cVarB;
        cVarB.dispose();
    }

    private e() {
    }

    @Override // io.reactivex.j0
    @cj.f
    public j0.c c() {
        return f303225c;
    }

    @Override // io.reactivex.j0
    @cj.f
    public io.reactivex.disposables.c e(@cj.f Runnable runnable) {
        runnable.run();
        return f303226d;
    }

    @Override // io.reactivex.j0
    @cj.f
    public io.reactivex.disposables.c f(@cj.f Runnable runnable, long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("This scheduler doesn't support delayed execution");
    }

    @Override // io.reactivex.j0
    @cj.f
    public io.reactivex.disposables.c g(@cj.f Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("This scheduler doesn't support periodic execution");
    }
}
