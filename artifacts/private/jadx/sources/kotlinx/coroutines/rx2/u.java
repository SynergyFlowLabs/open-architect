package kotlinx.coroutines.rx2;

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
@SourceDebugExtension({"SMAP\nRxMaybe.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RxMaybe.kt\nkotlinx/coroutines/rx2/RxMaybeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,70:1\n1#2:71\n*E\n"})
public final class u {
    @NotNull
    public static final <T> io.reactivex.s<T> b(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super s0, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2) {
        if (coroutineContext.get(p2.M2) == null) {
            return f(f2.f314023a, coroutineContext, function2);
        }
        throw new IllegalArgumentException(("Maybe context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had " + coroutineContext).toString());
    }

    public static /* synthetic */ io.reactivex.s d(CoroutineContext coroutineContext, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.h.f312451a;
        }
        return b(coroutineContext, function2);
    }

    public static /* synthetic */ io.reactivex.s e(s0 s0Var, CoroutineContext coroutineContext, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.h.f312451a;
        }
        return f(s0Var, coroutineContext, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> io.reactivex.s<T> f(final s0 s0Var, final CoroutineContext coroutineContext, final Function2<? super s0, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2) {
        return io.reactivex.s.F(new io.reactivex.w() { // from class: kotlinx.coroutines.rx2.t
            @Override // io.reactivex.w
            public final void a(io.reactivex.u uVar) {
                u.g(s0Var, coroutineContext, function2, uVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(s0 s0Var, CoroutineContext coroutineContext, Function2 function2, io.reactivex.u uVar) {
        s sVar = new s(l0.k(s0Var, coroutineContext), uVar);
        uVar.c(new i(sVar));
        sVar.h2(u0.DEFAULT, sVar, function2);
    }
}
