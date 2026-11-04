package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class g2 {
    @kotlin.internal.h
    @kotlin.l(level = kotlin.n.ERROR, message = "'async' can not be called without the corresponding coroutine scope. Consider wrapping 'async' in 'coroutineScope { }', using 'runBlocking { }', or using some other 'CoroutineScope'")
    @NotNull
    public static final <T> a1<T> a(@NotNull CoroutineContext coroutineContext, @NotNull u0 u0Var, @NotNull Function2<? super s0, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2) {
        throw new UnsupportedOperationException("Should never be called, was introduced to help with incomplete code");
    }

    public static /* synthetic */ a1 b(CoroutineContext coroutineContext, u0 u0Var, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.h.f312451a;
        }
        if ((i10 & 2) != 0) {
            u0Var = u0.DEFAULT;
        }
        return a(coroutineContext, u0Var, function2);
    }

    @kotlin.internal.h
    @kotlin.l(level = kotlin.n.ERROR, message = "'launch' can not be called without the corresponding coroutine scope. Consider wrapping 'launch' in 'coroutineScope { }', using 'runBlocking { }', or using some other 'CoroutineScope'")
    @NotNull
    public static final p2 c(@NotNull CoroutineContext coroutineContext, @NotNull u0 u0Var, @NotNull Function2<? super s0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        throw new UnsupportedOperationException("Should never be called, was introduced to help with incomplete code");
    }

    public static /* synthetic */ p2 d(CoroutineContext coroutineContext, u0 u0Var, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.h.f312451a;
        }
        if ((i10 & 2) != 0) {
            u0Var = u0.DEFAULT;
        }
        return c(coroutineContext, u0Var, function2);
    }
}
