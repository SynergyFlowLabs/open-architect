package kotlinx.coroutines.guava;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final class c<T> extends kotlinx.coroutines.a<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oj.f
    @NotNull
    public final b<T> f315023d;

    public c(@NotNull CoroutineContext coroutineContext) {
        super(coroutineContext, true, true);
        this.f315023d = new b<>(this);
    }

    @Override // kotlinx.coroutines.a
    protected void f2(@NotNull Throwable th2, boolean z10) {
        this.f315023d.b(th2);
    }

    @Override // kotlinx.coroutines.a
    protected void g2(T t10) {
        this.f315023d.a(t10);
    }
}
