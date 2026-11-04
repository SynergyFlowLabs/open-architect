package kotlinx.coroutines.rx2;

import kotlin.Unit;
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
@SourceDebugExtension({"SMAP\nRxCompletable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RxCompletable.kt\nkotlinx/coroutines/rx2/RxCompletableKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n1#2:72\n*E\n"})
public final class n {
    @NotNull
    public static final io.reactivex.c b(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super s0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        if (coroutineContext.get(p2.M2) == null) {
            return f(f2.f314023a, coroutineContext, function2);
        }
        throw new IllegalArgumentException(("Completable context cannot contain job in it. Its lifecycle should be managed via Disposable handle. Had " + coroutineContext).toString());
    }

    public static /* synthetic */ io.reactivex.c d(CoroutineContext coroutineContext, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.h.f312451a;
        }
        return b(coroutineContext, function2);
    }

    public static /* synthetic */ io.reactivex.c e(s0 s0Var, CoroutineContext coroutineContext, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.h.f312451a;
        }
        return f(s0Var, coroutineContext, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.reactivex.c f(final s0 s0Var, final CoroutineContext coroutineContext, final Function2<? super s0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        return io.reactivex.c.A(new io.reactivex.g() { // from class: kotlinx.coroutines.rx2.m
            @Override // io.reactivex.g
            public final void a(io.reactivex.e eVar) {
                n.g(s0Var, coroutineContext, function2, eVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(s0 s0Var, CoroutineContext coroutineContext, Function2 function2, io.reactivex.e eVar) {
        l lVar = new l(l0.k(s0Var, coroutineContext), eVar);
        eVar.c(new i(lVar));
        lVar.h2(u0.DEFAULT, lVar, function2);
    }
}
