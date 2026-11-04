package kotlinx.coroutines.rx2;

import io.reactivex.k0;
import io.reactivex.m0;
import io.reactivex.o0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.f2;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.u0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nRxSingle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RxSingle.kt\nkotlinx/coroutines/rx2/RxSingleKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,69:1\n1#2:70\n*E\n"})
public final class d0 {
    @NotNull
    public static final <T> k0<T> b(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super s0, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2) {
        if (coroutineContext.get(p2.M2) == null) {
            return f(f2.f314023a, coroutineContext, function2);
        }
        throw new IllegalArgumentException(("Single context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had " + coroutineContext).toString());
    }

    public static /* synthetic */ k0 d(CoroutineContext coroutineContext, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.h.f312451a;
        }
        return b(coroutineContext, function2);
    }

    public static /* synthetic */ k0 e(s0 s0Var, CoroutineContext coroutineContext, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.h.f312451a;
        }
        return f(s0Var, coroutineContext, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> k0<T> f(final s0 s0Var, final CoroutineContext coroutineContext, final Function2<? super s0, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2) {
        return k0.C(new o0() { // from class: kotlinx.coroutines.rx2.c0
            @Override // io.reactivex.o0
            public final void a(m0 m0Var) {
                d0.g(s0Var, coroutineContext, function2, m0Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(s0 s0Var, CoroutineContext coroutineContext, Function2 function2, m0 m0Var) {
        b0 b0Var = new b0(l0.k(s0Var, coroutineContext), m0Var);
        m0Var.c(new i(b0Var));
        b0Var.h2(u0.DEFAULT, b0Var, function2);
    }
}
