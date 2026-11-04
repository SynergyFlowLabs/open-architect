package kotlinx.coroutines.flow;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class i0 {

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.LintKt$retry$1", f = "Lint.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<Throwable, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f314479a;

        public a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f314479a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return kotlin.coroutines.jvm.internal.b.a(true);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Throwable th2, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((a) create(th2, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "cancel() is resolved into the extension of outer CoroutineScope which is likely to be an error. Use currentCoroutineContext().cancel() instead or specify the receiver of cancel() explicitly", replaceWith = @kotlin.b1(expression = "currentCoroutineContext().cancel(cause)", imports = {}))
    public static final void a(@NotNull j<?> jVar, @Nullable CancellationException cancellationException) {
        k.d1();
        throw new kotlin.a0();
    }

    public static /* synthetic */ void b(j jVar, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        a(jVar, cancellationException);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Applying 'cancellable' to a SharedFlow has no effect. See the SharedFlow documentation on Operator Fusion.", replaceWith = @kotlin.b1(expression = "this", imports = {}))
    @NotNull
    public static final <T> i<T> c(@NotNull o0<? extends T> o0Var) {
        k.d1();
        throw new kotlin.a0();
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "SharedFlow never completes, so this operator typically has not effect, it can only catch exceptions from 'onSubscribe' operator", replaceWith = @kotlin.b1(expression = "this", imports = {}))
    @kotlin.internal.f
    private static final <T> i<T> d(o0<? extends T> o0Var, pj.n<? super j<? super T>, ? super Throwable, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar) {
        Intrinsics.checkNotNull(o0Var, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.catch>");
        return k.v(o0Var, nVar);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Applying 'conflate' to StateFlow has no effect. See the StateFlow documentation on Operator Fusion.", replaceWith = @kotlin.b1(expression = "this", imports = {}))
    @NotNull
    public static final <T> i<T> e(@NotNull z0<? extends T> z0Var) {
        k.d1();
        throw new kotlin.a0();
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "SharedFlow never completes, so this terminal operation never completes.")
    @kotlin.internal.f
    private static final <T> Object f(o0<? extends T> o0Var, kotlin.coroutines.d<? super Integer> dVar) {
        Intrinsics.checkNotNull(o0Var, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.count>");
        kotlin.jvm.internal.h0.e(0);
        Object objA0 = k.a0(o0Var, dVar);
        kotlin.jvm.internal.h0.e(1);
        return objA0;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Applying 'distinctUntilChanged' to StateFlow has no effect. See the StateFlow documentation on Operator Fusion.", replaceWith = @kotlin.b1(expression = "this", imports = {}))
    @NotNull
    public static final <T> i<T> g(@NotNull z0<? extends T> z0Var) {
        k.d1();
        throw new kotlin.a0();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Applying 'flowOn' to SharedFlow has no effect. See the SharedFlow documentation on Operator Fusion.", replaceWith = @kotlin.b1(expression = "this", imports = {}))
    @NotNull
    public static final <T> i<T> h(@NotNull o0<? extends T> o0Var, @NotNull CoroutineContext coroutineContext) {
        k.d1();
        throw new kotlin.a0();
    }

    @NotNull
    public static final CoroutineContext i(@NotNull j<?> jVar) {
        k.d1();
        throw new kotlin.a0();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "coroutineContext is resolved into the property of outer CoroutineScope which is likely to be an error. Use currentCoroutineContext() instead or specify the receiver of coroutineContext explicitly", replaceWith = @kotlin.b1(expression = "currentCoroutineContext()", imports = {}))
    public static /* synthetic */ void j(j jVar) {
    }

    public static final boolean k(@NotNull j<?> jVar) {
        k.d1();
        throw new kotlin.a0();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "isActive is resolved into the extension of outer CoroutineScope which is likely to be an error. Use currentCoroutineContext().isActive or cancellable() operator instead or specify the receiver of isActive explicitly. Additionally, flow {} builder emissions are cancellable by default.", replaceWith = @kotlin.b1(expression = "currentCoroutineContext().isActive", imports = {}))
    public static /* synthetic */ void l(j jVar) {
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "SharedFlow never completes, so this operator has no effect.", replaceWith = @kotlin.b1(expression = "this", imports = {}))
    @kotlin.internal.f
    private static final <T> i<T> m(o0<? extends T> o0Var, long j10, Function2<? super Throwable, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> function2) {
        Intrinsics.checkNotNull(o0Var, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.retry>");
        return k.y1(o0Var, j10, function2);
    }

    static /* synthetic */ i n(o0 o0Var, long j10, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = Long.MAX_VALUE;
        }
        if ((i10 & 2) != 0) {
            function2 = new a(null);
        }
        Intrinsics.checkNotNull(o0Var, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.retry>");
        return k.y1(o0Var, j10, function2);
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "SharedFlow never completes, so this operator has no effect.", replaceWith = @kotlin.b1(expression = "this", imports = {}))
    @kotlin.internal.f
    private static final <T> i<T> o(o0<? extends T> o0Var, pj.o<? super j<? super T>, ? super Throwable, ? super Long, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> oVar) {
        Intrinsics.checkNotNull(o0Var, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.retryWhen>");
        return k.A1(o0Var, oVar);
    }

    @kotlin.internal.f
    private static final <T> Object p(o0<? extends T> o0Var, List<T> list, kotlin.coroutines.d<?> dVar) {
        Intrinsics.checkNotNull(o0Var, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.toList>");
        kotlin.jvm.internal.h0.e(0);
        k.a2(o0Var, list, dVar);
        kotlin.jvm.internal.h0.e(1);
        throw new IllegalStateException("this code is supposed to be unreachable");
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "SharedFlow never completes, so this terminal operation never completes.")
    @kotlin.internal.f
    private static final <T> Object q(o0<? extends T> o0Var, kotlin.coroutines.d<? super List<? extends T>> dVar) {
        Intrinsics.checkNotNull(o0Var, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.toList>");
        kotlin.jvm.internal.h0.e(0);
        int i10 = 7 << 1;
        Object objC = o.c(o0Var, null, dVar, 1, null);
        kotlin.jvm.internal.h0.e(1);
        return objC;
    }

    @kotlin.internal.f
    private static final <T> Object r(o0<? extends T> o0Var, Set<T> set, kotlin.coroutines.d<?> dVar) {
        Intrinsics.checkNotNull(o0Var, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.toSet>");
        kotlin.jvm.internal.h0.e(0);
        k.c2(o0Var, set, dVar);
        boolean z10 = false | true;
        kotlin.jvm.internal.h0.e(1);
        throw new IllegalStateException("this code is supposed to be unreachable");
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "SharedFlow never completes, so this terminal operation never completes.")
    @kotlin.internal.f
    private static final <T> Object s(o0<? extends T> o0Var, kotlin.coroutines.d<? super Set<? extends T>> dVar) {
        Intrinsics.checkNotNull(o0Var, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.toSet>");
        kotlin.jvm.internal.h0.e(0);
        Object objE = o.e(o0Var, null, dVar, 1, null);
        kotlin.jvm.internal.h0.e(1);
        return objE;
    }
}
