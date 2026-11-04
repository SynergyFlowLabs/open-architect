package kotlinx.coroutines.channels;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.f3;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.w2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class b {
    @f3
    @NotNull
    public static final <E> o0<E> a(@NotNull s0 s0Var, @NotNull CoroutineContext coroutineContext, int i10, @NotNull u0 u0Var, @Nullable Function1<? super Throwable, Unit> function1, @NotNull Function2<? super c<E>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        CoroutineContext coroutineContextK = kotlinx.coroutines.l0.k(s0Var, coroutineContext);
        int i11 = 0 << 6;
        p pVarD = s.d(i10, null, null, 6, null);
        a g0Var = u0Var.o() ? new g0(coroutineContextK, pVarD, function2) : new a(coroutineContextK, pVarD, true);
        if (function1 != null) {
            ((w2) g0Var).E(function1);
        }
        ((kotlinx.coroutines.a) g0Var).h2(u0Var, g0Var, function2);
        return (o0<E>) g0Var;
    }

    public static /* synthetic */ o0 b(s0 s0Var, CoroutineContext coroutineContext, int i10, u0 u0Var, Function1 function1, Function2 function2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineContext = kotlin.coroutines.h.f312451a;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            u0Var = u0.DEFAULT;
        }
        if ((i11 & 8) != 0) {
            function1 = null;
        }
        u0 u0Var2 = u0Var;
        return a(s0Var, coroutineContext, i10, u0Var2, function1, function2);
    }
}
