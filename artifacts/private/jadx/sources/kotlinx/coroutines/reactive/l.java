package kotlinx.coroutines.reactive;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.b1;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.l0;
import kotlinx.coroutines.f2;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.p0;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.u0;
import org.jetbrains.annotations.NotNull;
import org.reactivestreams.u;
import org.reactivestreams.v;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nPublish.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Publish.kt\nkotlinx/coroutines/reactive/PublishKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,337:1\n1#2:338\n*E\n"})
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f315266a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f315267b = -2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Function2<Throwable, CoroutineContext, Unit> f315268c = new Function2() { // from class: kotlinx.coroutines.reactive.k
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return l.c((Throwable) obj, (CoroutineContext) obj2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(Throwable th2, CoroutineContext coroutineContext) {
        if (!(th2 instanceof CancellationException)) {
            p0.b(coroutineContext, th2);
        }
        return Unit.f312394a;
    }

    @NotNull
    public static final <T> u<T> d(@NotNull CoroutineContext coroutineContext, @kotlin.b @NotNull Function2<? super l0<? super T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        if (coroutineContext.get(p2.M2) == null) {
            return h(f2.f314023a, coroutineContext, f315268c, function2);
        }
        throw new IllegalArgumentException(("Publisher context cannot contain job in it.Its lifecycle should be managed via subscription. Had " + coroutineContext).toString());
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "CoroutineScope.publish is deprecated in favour of top-level publish", replaceWith = @b1(expression = "publish(context, block)", imports = {}))
    public static final /* synthetic */ u e(s0 s0Var, CoroutineContext coroutineContext, @kotlin.b Function2 function2) {
        return h(s0Var, coroutineContext, f315268c, function2);
    }

    public static /* synthetic */ u f(CoroutineContext coroutineContext, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.h.f312451a;
        }
        return d(coroutineContext, function2);
    }

    public static /* synthetic */ u g(s0 s0Var, CoroutineContext coroutineContext, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.h.f312451a;
        }
        return e(s0Var, coroutineContext, function2);
    }

    @k2
    @NotNull
    public static final <T> u<T> h(@NotNull final s0 s0Var, @NotNull final CoroutineContext coroutineContext, @NotNull final Function2<? super Throwable, ? super CoroutineContext, Unit> function2, @NotNull final Function2<? super l0<? super T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function3) {
        return new u() { // from class: kotlinx.coroutines.reactive.j
            @Override // org.reactivestreams.u
            public final void e(v vVar) {
                l.i(s0Var, coroutineContext, function2, function3, vVar);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(s0 s0Var, CoroutineContext coroutineContext, Function2 function2, Function2 function3, v vVar) {
        if (vVar == null) {
            throw new NullPointerException("Subscriber cannot be null");
        }
        n nVar = new n(kotlinx.coroutines.l0.k(s0Var, coroutineContext), vVar, function2);
        vVar.l(nVar);
        nVar.h2(u0.DEFAULT, nVar, function3);
    }
}
