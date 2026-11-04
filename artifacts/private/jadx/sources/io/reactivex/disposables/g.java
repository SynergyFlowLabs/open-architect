package io.reactivex.disposables;

/* JADX INFO: loaded from: classes8.dex */
final class g extends f<Runnable> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f298664b = -8219729196779211169L;

    g(Runnable runnable) {
        super(runnable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.reactivex.disposables.f
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@cj.f Runnable runnable) {
        runnable.run();
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        return "RunnableDisposable(disposed=" + k() + ", " + get() + ")";
    }
}
