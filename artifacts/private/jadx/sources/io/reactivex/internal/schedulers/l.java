package io.reactivex.internal.schedulers;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends a implements Runnable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f303267f = 1811839108042568751L;

    public l(Runnable runnable) {
        super(runnable);
    }

    @Override // io.reactivex.internal.schedulers.a, io.reactivex.schedulers.a
    public /* bridge */ /* synthetic */ Runnable a() {
        return super.a();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f303177b = Thread.currentThread();
        try {
            this.f303176a.run();
            this.f303177b = null;
        } catch (Throwable th2) {
            this.f303177b = null;
            lazySet(a.f303174d);
            io.reactivex.plugins.a.Y(th2);
        }
    }
}
