package kotlinx.coroutines.future;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import java.util.function.BiFunction;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.p;
import kotlinx.coroutines.p0;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.u2;
import kotlinx.coroutines.x;
import kotlinx.coroutines.x1;
import kotlinx.coroutines.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nFuture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Future.kt\nkotlinx/coroutines/future/FutureKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,208:1\n1#2:209\n426#3,11:210\n*S KotlinDebug\n*F\n+ 1 Future.kt\nkotlinx/coroutines/future/FutureKt\n*L\n168#1:210,11\n*E\n"})
public final class i {

    static final class a implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CompletableFuture<T> f315011a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c<T> f315012b;

        a(CompletableFuture<T> completableFuture, c<T> cVar) {
            this.f315011a = completableFuture;
            this.f315012b = cVar;
        }

        public final void c(Throwable th2) {
            this.f315011a.cancel(false);
            this.f315012b.cont = null;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            c(th2);
            return Unit.f312394a;
        }
    }

    static final class b implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p2 f315013a;

        b(p2 p2Var) {
            this.f315013a = p2Var;
        }

        public final void c(Object obj, Throwable th2) {
            p2 p2Var = this.f315013a;
            CancellationException cancellationExceptionA = null;
            if (th2 != null) {
                cancellationExceptionA = th2 instanceof CancellationException ? (CancellationException) th2 : null;
                if (cancellationExceptionA == null) {
                    cancellationExceptionA = x1.a("CompletableFuture was completed exceptionally", th2);
                }
            }
            p2Var.e(cancellationExceptionA);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            c(obj, (Throwable) obj2);
            return Unit.f312394a;
        }
    }

    @NotNull
    public static final <T> CompletableFuture<T> f(@NotNull final a1<? extends T> a1Var) {
        final CompletableFuture<T> completableFuture = new CompletableFuture<>();
        p(a1Var, completableFuture);
        a1Var.E(new Function1() { // from class: kotlinx.coroutines.future.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i.h(completableFuture, a1Var, (Throwable) obj);
            }
        });
        return completableFuture;
    }

    @NotNull
    public static final CompletableFuture<Unit> g(@NotNull p2 p2Var) {
        final CompletableFuture<Unit> completableFuture = new CompletableFuture<>();
        p(p2Var, completableFuture);
        p2Var.E(new Function1() { // from class: kotlinx.coroutines.future.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i.i(completableFuture, (Throwable) obj);
            }
        });
        return completableFuture;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(CompletableFuture completableFuture, a1 a1Var, Throwable th2) {
        try {
            completableFuture.complete(a1Var.m());
        } catch (Throwable th3) {
            completableFuture.completeExceptionally(th3);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(CompletableFuture completableFuture, Throwable th2) {
        if (th2 == null) {
            completableFuture.complete(Unit.f312394a);
        } else {
            completableFuture.completeExceptionally(th2);
        }
        return Unit.f312394a;
    }

    @NotNull
    public static final <T> a1<T> j(@NotNull CompletionStage<T> completionStage) {
        Throwable cause;
        CompletableFuture<T> completableFuture = completionStage.toCompletableFuture();
        if (!completableFuture.isDone()) {
            final x xVarC = z.c(null, 1, null);
            final Function2 function2 = new Function2() { // from class: kotlinx.coroutines.future.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return i.k(xVarC, obj, (Throwable) obj2);
                }
            };
            completionStage.handle(new BiFunction() { // from class: kotlinx.coroutines.future.f
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return i.l(function2, obj, (Throwable) obj2);
                }
            });
            u2.B(xVarC, false, new kotlinx.coroutines.future.a(completableFuture), 1, null);
            return xVarC;
        }
        try {
            return z.a(completableFuture.get());
        } catch (Throwable th2) {
            th = th2;
            ExecutionException executionException = th instanceof ExecutionException ? (ExecutionException) th : null;
            if (executionException != null && (cause = executionException.getCause()) != null) {
                th = cause;
            }
            x xVarC2 = z.c(null, 1, null);
            xVarC2.f(th);
            return xVarC2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object k(x xVar, Object obj, Throwable th2) {
        boolean zF;
        Throwable cause;
        try {
            if (th2 == null) {
                zF = xVar.R(obj);
            } else {
                CompletionException completionException = th2 instanceof CompletionException ? (CompletionException) th2 : null;
                if (completionException != null && (cause = completionException.getCause()) != null) {
                    th2 = cause;
                }
                zF = xVar.f(th2);
            }
            return Boolean.valueOf(zF);
        } catch (Throwable th3) {
            p0.b(kotlin.coroutines.h.f312451a, th3);
            return Unit.f312394a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object l(Function2 function2, Object obj, Throwable th2) {
        return function2.invoke(obj, th2);
    }

    @Nullable
    public static final <T> Object m(@NotNull CompletionStage<T> completionStage, @NotNull kotlin.coroutines.d<? super T> dVar) throws Throwable {
        CompletableFuture<T> completableFuture = completionStage.toCompletableFuture();
        if (completableFuture.isDone()) {
            try {
                return completableFuture.get();
            } catch (ExecutionException e10) {
                Throwable cause = e10.getCause();
                if (cause == null) {
                    throw e10;
                }
                throw cause;
            }
        }
        p pVar = new p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        c cVar = new c(pVar);
        completionStage.handle(cVar);
        pVar.e0(new a(completableFuture, cVar));
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU;
    }

    @NotNull
    public static final <T> CompletableFuture<T> n(@NotNull s0 s0Var, @NotNull CoroutineContext coroutineContext, @NotNull u0 u0Var, @NotNull Function2<? super s0, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2) {
        if (u0Var.o()) {
            throw new IllegalArgumentException((u0Var + " start is not supported").toString());
        }
        CoroutineContext coroutineContextK = l0.k(s0Var, coroutineContext);
        CompletableFuture<T> completableFuture = new CompletableFuture<>();
        kotlinx.coroutines.future.b bVar = new kotlinx.coroutines.future.b(coroutineContextK, completableFuture);
        completableFuture.handle((BiFunction) bVar);
        bVar.h2(u0Var, bVar, function2);
        return completableFuture;
    }

    public static /* synthetic */ CompletableFuture o(s0 s0Var, CoroutineContext coroutineContext, u0 u0Var, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.h.f312451a;
        }
        if ((i10 & 2) != 0) {
            u0Var = u0.DEFAULT;
        }
        return n(s0Var, coroutineContext, u0Var, function2);
    }

    private static final void p(p2 p2Var, CompletableFuture<?> completableFuture) {
        final b bVar = new b(p2Var);
        completableFuture.handle(new BiFunction() { // from class: kotlinx.coroutines.future.h
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return i.q(bVar, obj, (Throwable) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(Function2 function2, Object obj, Throwable th2) {
        return (Unit) function2.invoke(obj, th2);
    }
}
