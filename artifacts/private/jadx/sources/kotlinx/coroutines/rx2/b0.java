package kotlinx.coroutines.rx2;

import io.reactivex.m0;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
final class b0<T> extends kotlinx.coroutines.a<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final m0<T> f315314d;

    public b0(@NotNull CoroutineContext coroutineContext, @NotNull m0<T> m0Var) {
        super(coroutineContext, false, true);
        this.f315314d = m0Var;
    }

    @Override // kotlinx.coroutines.a
    protected void f2(@NotNull Throwable th2, boolean z10) {
        try {
            if (this.f315314d.a(th2)) {
                return;
            }
        } catch (Throwable th3) {
            kotlin.p.a(th2, th3);
        }
        j.a(th2, getContext());
    }

    @Override // kotlinx.coroutines.a
    protected void g2(@NotNull T t10) {
        try {
            this.f315314d.b(t10);
        } catch (Throwable th2) {
            j.a(th2, getContext());
        }
    }
}
