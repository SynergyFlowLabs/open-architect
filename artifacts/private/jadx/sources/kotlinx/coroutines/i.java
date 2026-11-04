package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class i {
    @NotNull
    public static final <T> a1<T> a(@NotNull s0 s0Var, @NotNull CoroutineContext coroutineContext, @NotNull u0 u0Var, @NotNull Function2<? super s0, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2) {
        return k.a(s0Var, coroutineContext, u0Var, function2);
    }

    @Nullable
    public static final <T> Object c(@NotNull n0 n0Var, @NotNull Function2<? super s0, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super T> dVar) {
        return k.c(n0Var, function2, dVar);
    }

    @NotNull
    public static final p2 d(@NotNull s0 s0Var, @NotNull CoroutineContext coroutineContext, @NotNull u0 u0Var, @NotNull Function2<? super s0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        return k.e(s0Var, coroutineContext, u0Var, function2);
    }

    public static final <T> T f(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super s0, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2) throws InterruptedException {
        return (T) j.a(coroutineContext, function2);
    }

    @Nullable
    public static final <T> Object h(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super s0, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super T> dVar) {
        return k.g(coroutineContext, function2, dVar);
    }
}
