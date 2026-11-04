package kotlinx.coroutines.rx2;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
final class s<T> extends kotlinx.coroutines.a<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final io.reactivex.u<T> f315408d;

    public s(@NotNull CoroutineContext coroutineContext, @NotNull io.reactivex.u<T> uVar) {
        super(coroutineContext, false, true);
        this.f315408d = uVar;
    }

    @Override // kotlinx.coroutines.a
    protected void f2(@NotNull Throwable th2, boolean z10) {
        try {
            if (this.f315408d.a(th2)) {
                return;
            }
        } catch (Throwable th3) {
            kotlin.p.a(th2, th3);
        }
        j.a(th2, getContext());
    }

    @Override // kotlinx.coroutines.a
    protected void g2(T t10) {
        try {
            if (t10 == null) {
                this.f315408d.onComplete();
            } else {
                this.f315408d.b(t10);
            }
        } catch (Throwable th2) {
            j.a(th2, getContext());
        }
    }
}
