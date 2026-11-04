package io.reactivex.internal.schedulers;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends a implements Callable<Void> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f303268f = 1811839108042568751L;

    public m(Runnable runnable) {
        super(runnable);
    }

    @Override // io.reactivex.internal.schedulers.a, io.reactivex.schedulers.a
    public /* bridge */ /* synthetic */ Runnable a() {
        return super.a();
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Void call() throws Exception {
        this.f303177b = Thread.currentThread();
        try {
            this.f303176a.run();
            lazySet(a.f303174d);
            return null;
        } finally {
            lazySet(a.f303174d);
            this.f303177b = null;
        }
    }
}
