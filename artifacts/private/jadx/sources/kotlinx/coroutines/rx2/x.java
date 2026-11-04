package kotlinx.coroutines.rx2;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.l0;
import kotlinx.coroutines.f2;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.u0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nRxObservable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RxObservable.kt\nkotlinx/coroutines/rx2/RxObservableKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,217:1\n1#2:218\n*E\n"})
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f315428a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f315429b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f315430c = -2;

    @NotNull
    public static final <T> io.reactivex.b0<T> b(@NotNull CoroutineContext coroutineContext, @kotlin.b @NotNull Function2<? super l0<? super T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        if (coroutineContext.get(p2.M2) == null) {
            return f(f2.f314023a, coroutineContext, function2);
        }
        throw new IllegalArgumentException(("Observable context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had " + coroutineContext).toString());
    }

    public static /* synthetic */ io.reactivex.b0 d(CoroutineContext coroutineContext, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.h.f312451a;
        }
        return b(coroutineContext, function2);
    }

    public static /* synthetic */ io.reactivex.b0 e(s0 s0Var, CoroutineContext coroutineContext, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.h.f312451a;
        }
        return f(s0Var, coroutineContext, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> io.reactivex.b0<T> f(final s0 s0Var, final CoroutineContext coroutineContext, final Function2<? super l0<? super T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        return io.reactivex.b0.q1(new io.reactivex.e0() { // from class: kotlinx.coroutines.rx2.w
            @Override // io.reactivex.e0
            public final void a(io.reactivex.d0 d0Var) {
                x.g(s0Var, coroutineContext, function2, d0Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(s0 s0Var, CoroutineContext coroutineContext, Function2 function2, io.reactivex.d0 d0Var) {
        v vVar = new v(kotlinx.coroutines.l0.k(s0Var, coroutineContext), d0Var);
        d0Var.c(new i(vVar));
        vVar.h2(u0.DEFAULT, vVar, function2);
    }
}
