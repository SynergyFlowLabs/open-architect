package kotlinx.coroutines.future;

import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.p2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class b<T> extends kotlinx.coroutines.a<T> implements BiFunction<T, Throwable, Unit> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final CompletableFuture<T> f315004d;

    public b(@NotNull CoroutineContext coroutineContext, @NotNull CompletableFuture<T> completableFuture) {
        super(coroutineContext, true, true);
        this.f315004d = completableFuture;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.BiFunction
    public /* bridge */ /* synthetic */ Unit apply(Object obj, Throwable th2) {
        i2(obj, th2);
        return Unit.f312394a;
    }

    @Override // kotlinx.coroutines.a
    protected void f2(@NotNull Throwable th2, boolean z10) {
        this.f315004d.completeExceptionally(th2);
    }

    @Override // kotlinx.coroutines.a
    protected void g2(T t10) {
        this.f315004d.complete(t10);
    }

    public void i2(@Nullable T t10, @Nullable Throwable th2) {
        p2.a.b(this, null, 1, null);
    }
}
