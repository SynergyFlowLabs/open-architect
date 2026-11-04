package kotlinx.coroutines.rx2;

import io.reactivex.i0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
final class h0<T> extends kotlinx.coroutines.channels.n<T> implements i0<T>, io.reactivex.v<T> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f315367m = AtomicReferenceFieldUpdater.newUpdater(h0.class, Object.class, "_subscription$volatile");
    private volatile /* synthetic */ Object _subscription$volatile;

    public h0() {
        super(Integer.MAX_VALUE, null, 2, null);
    }

    private final /* synthetic */ Object F2() {
        return this._subscription$volatile;
    }

    private final /* synthetic */ void H2(Object obj) {
        this._subscription$volatile = obj;
    }

    @Override // io.reactivex.v
    public void b(@NotNull T t10) {
        p(t10);
        F(null);
    }

    @Override // io.reactivex.i0
    public void d(@NotNull io.reactivex.disposables.c cVar) {
        f315367m.set(this, cVar);
    }

    @Override // io.reactivex.i0
    public void onComplete() {
        F(null);
    }

    @Override // io.reactivex.i0
    public void onError(@NotNull Throwable th2) {
        F(th2);
    }

    @Override // io.reactivex.i0
    public void onNext(@NotNull T t10) {
        p(t10);
    }

    @Override // kotlinx.coroutines.channels.n
    protected void v1() {
        io.reactivex.disposables.c cVar = (io.reactivex.disposables.c) f315367m.getAndSet(this, null);
        if (cVar != null) {
            cVar.dispose();
        }
    }
}
