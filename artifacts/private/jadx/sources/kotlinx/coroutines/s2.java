package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class s2 {
    @NotNull
    public static final p2 A(@NotNull CoroutineContext coroutineContext) {
        return u2.z(coroutineContext);
    }

    @NotNull
    public static final o1 B(@NotNull p2 p2Var, boolean z10, @NotNull v2 v2Var) {
        return u2.A(p2Var, z10, v2Var);
    }

    public static final boolean D(@NotNull CoroutineContext coroutineContext) {
        return u2.C(coroutineContext);
    }

    @NotNull
    public static final a0 a(@Nullable p2 p2Var) {
        return u2.a(p2Var);
    }

    public static final void f(@NotNull CoroutineContext coroutineContext, @Nullable CancellationException cancellationException) {
        u2.f(coroutineContext, cancellationException);
    }

    public static final void g(@NotNull p2 p2Var, @NotNull String str, @Nullable Throwable th2) {
        u2.g(p2Var, str, th2);
    }

    @Nullable
    public static final Object l(@NotNull p2 p2Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return u2.l(p2Var, dVar);
    }

    public static final void o(@NotNull CoroutineContext coroutineContext, @Nullable CancellationException cancellationException) {
        u2.o(coroutineContext, cancellationException);
    }

    public static final void r(@NotNull p2 p2Var, @Nullable CancellationException cancellationException) {
        u2.r(p2Var, cancellationException);
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "This function does not do what its name implies: it will not cancel the future if just cancel() was called.", replaceWith = @kotlin.b1(expression = "this.invokeOnCancellation { future.cancel(false) }", imports = {}))
    public static final void w(@NotNull n<?> nVar, @NotNull Future<?> future) {
        t2.a(nVar, future);
    }

    @NotNull
    public static final o1 x(@NotNull p2 p2Var, @NotNull o1 o1Var) {
        return u2.w(p2Var, o1Var);
    }

    public static final void y(@NotNull CoroutineContext coroutineContext) {
        u2.x(coroutineContext);
    }

    public static final void z(@NotNull p2 p2Var) {
        u2.y(p2Var);
    }
}
