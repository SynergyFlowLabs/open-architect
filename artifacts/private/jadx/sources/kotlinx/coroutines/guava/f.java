package kotlinx.coroutines.guava;

import com.google.common.util.concurrent.a2;
import com.google.common.util.concurrent.e1;
import com.google.common.util.concurrent.f3;
import com.google.common.util.concurrent.h1;
import com.google.common.util.concurrent.t1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.l;
import kotlin.n;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.c2;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.o1;
import kotlinx.coroutines.p;
import kotlinx.coroutines.p0;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.u;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.w;
import kotlinx.coroutines.x;
import kotlinx.coroutines.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nListenableFuture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListenableFuture.kt\nkotlinx/coroutines/guava/ListenableFutureKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,506:1\n1#2:507\n426#3,11:508\n*S KotlinDebug\n*F\n+ 1 ListenableFuture.kt\nkotlinx/coroutines/guava/ListenableFutureKt\n*L\n239#1:508,11\n*E\n"})
public final class f {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @SourceDebugExtension({"SMAP\nListenableFuture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListenableFuture.kt\nkotlinx/coroutines/guava/ListenableFutureKt$asDeferred$4\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,506:1\n1#2:507\n*E\n"})
    public static final class a<T> implements e1<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ x<T> f315027a;

        a(x<T> xVar) {
            this.f315027a = xVar;
        }

        @Override // com.google.common.util.concurrent.e1
        public void b(T t10) {
            Object objM785constructorimpl;
            x<T> xVar = this.f315027a;
            try {
                Result.a aVar = Result.Companion;
                objM785constructorimpl = Result.m785constructorimpl(Boolean.valueOf(xVar.R(t10)));
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thD = Result.d(objM785constructorimpl);
            if (thD != null) {
                p0.b(h.f312451a, thD);
            }
        }

        @Override // com.google.common.util.concurrent.e1
        public void onFailure(Throwable th2) {
            Object objM785constructorimpl;
            x<T> xVar = this.f315027a;
            try {
                Result.a aVar = Result.Companion;
                objM785constructorimpl = Result.m785constructorimpl(Boolean.valueOf(xVar.f(th2)));
            } catch (Throwable th3) {
                Result.a aVar2 = Result.Companion;
                objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(th3));
            }
            Throwable thD = Result.d(objM785constructorimpl);
            if (thD != null) {
                p0.b(h.f312451a, thD);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class b<T> implements a1<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ x<T> f315028a;

        b(x<T> xVar) {
            this.f315028a = xVar;
        }

        @Override // kotlinx.coroutines.p2
        public o1 E(Function1<? super Throwable, Unit> function1) {
            return this.f315028a.E(function1);
        }

        @Override // kotlinx.coroutines.a1
        public kotlinx.coroutines.selects.h<T> b1() {
            return this.f315028a.b1();
        }

        @Override // kotlinx.coroutines.p2
        @l(level = n.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        public /* synthetic */ boolean c(Throwable th2) {
            return this.f315028a.c(th2);
        }

        @Override // kotlinx.coroutines.p2
        @l(level = n.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        public /* synthetic */ void cancel() {
            this.f315028a.cancel();
        }

        @Override // kotlinx.coroutines.p2
        public Object d1(kotlin.coroutines.d<? super Unit> dVar) {
            return this.f315028a.d1(dVar);
        }

        @Override // kotlinx.coroutines.p2
        public void e(CancellationException cancellationException) {
            this.f315028a.e(cancellationException);
        }

        @Override // kotlinx.coroutines.p2
        public kotlinx.coroutines.selects.f f0() {
            return this.f315028a.f0();
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        public <R> R fold(R r10, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) this.f315028a.fold(r10, function2);
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        public <E extends CoroutineContext.Element> E get(CoroutineContext.b<E> bVar) {
            return (E) this.f315028a.get(bVar);
        }

        @Override // kotlin.coroutines.CoroutineContext.Element
        public CoroutineContext.b<?> getKey() {
            return this.f315028a.getKey();
        }

        @Override // kotlinx.coroutines.p2
        public p2 getParent() {
            return this.f315028a.getParent();
        }

        @Override // kotlinx.coroutines.p2
        public boolean isActive() {
            return this.f315028a.isActive();
        }

        @Override // kotlinx.coroutines.p2
        public boolean isCancelled() {
            return this.f315028a.isCancelled();
        }

        @Override // kotlinx.coroutines.p2
        @k2
        public u j0(w wVar) {
            return this.f315028a.j0(wVar);
        }

        @Override // kotlinx.coroutines.a1
        @c2
        public T m() {
            return this.f315028a.m();
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        public CoroutineContext minusKey(CoroutineContext.b<?> bVar) {
            return this.f315028a.minusKey(bVar);
        }

        @Override // kotlin.coroutines.CoroutineContext
        public CoroutineContext plus(CoroutineContext coroutineContext) {
            return this.f315028a.plus(coroutineContext);
        }

        @Override // kotlinx.coroutines.a1
        public Object q(kotlin.coroutines.d<? super T> dVar) {
            return this.f315028a.q(dVar);
        }

        @Override // kotlinx.coroutines.p2
        public Sequence<p2> r0() {
            return this.f315028a.r0();
        }

        @Override // kotlinx.coroutines.p2
        public boolean start() {
            return this.f315028a.start();
        }

        @Override // kotlinx.coroutines.p2
        @l(level = n.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public p2 t(p2 p2Var) {
            return this.f315028a.t(p2Var);
        }

        @Override // kotlinx.coroutines.a1
        @c2
        public Throwable w0() {
            return this.f315028a.w0();
        }

        @Override // kotlinx.coroutines.p2
        public boolean x() {
            return this.f315028a.x();
        }

        @Override // kotlinx.coroutines.p2
        @k2
        public o1 x0(boolean z10, boolean z11, Function1<? super Throwable, Unit> function1) {
            return this.f315028a.x0(z10, z11, function1);
        }

        @Override // kotlinx.coroutines.p2
        @k2
        public CancellationException y0() {
            return this.f315028a.y0();
        }
    }

    static final class c implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t1<T> f315029a;

        c(t1<T> t1Var) {
            this.f315029a = t1Var;
        }

        public final void c(Throwable th2) {
            this.f315029a.cancel(false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            c(th2);
            return Unit.f312394a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> a1<T> d(@NotNull final t1<T> t1Var) {
        Throwable thA;
        if ((t1Var instanceof com.google.common.util.concurrent.internal.a) && (thA = com.google.common.util.concurrent.internal.b.a((com.google.common.util.concurrent.internal.a) t1Var)) != null) {
            x xVarC = z.c(null, 1, null);
            xVarC.f(thA);
            return xVarC;
        }
        if (!t1Var.isDone()) {
            x xVarC2 = z.c(null, 1, null);
            h1.c(t1Var, new a(xVarC2), a2.c());
            xVarC2.E(new Function1() { // from class: kotlinx.coroutines.guava.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return f.e(t1Var, (Throwable) obj);
                }
            });
            return new b(xVarC2);
        }
        try {
            return z.a(f3.f(t1Var));
        } catch (CancellationException e10) {
            x xVarC3 = z.c(null, 1, null);
            xVarC3.e(e10);
            return xVarC3;
        } catch (ExecutionException e11) {
            x xVarC4 = z.c(null, 1, null);
            xVarC4.f(k(e11));
            return xVarC4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(t1 t1Var, Throwable th2) {
        t1Var.cancel(false);
        return Unit.f312394a;
    }

    @NotNull
    public static final <T> t1<T> f(@NotNull final a1<? extends T> a1Var) {
        final kotlinx.coroutines.guava.b bVar = new kotlinx.coroutines.guava.b(a1Var);
        a1Var.E(new Function1() { // from class: kotlinx.coroutines.guava.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f.g(bVar, a1Var, (Throwable) obj);
            }
        });
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(kotlinx.coroutines.guava.b bVar, a1 a1Var, Throwable th2) {
        if (th2 == null) {
            bVar.a(a1Var.m());
        } else {
            bVar.b(th2);
        }
        return Unit.f312394a;
    }

    @Nullable
    public static final <T> Object h(@NotNull t1<T> t1Var, @NotNull kotlin.coroutines.d<? super T> dVar) throws Throwable {
        try {
            if (t1Var.isDone()) {
                return f3.f(t1Var);
            }
            p pVar = new p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
            pVar.p0();
            t1Var.m0(new g(t1Var, pVar), a2.c());
            pVar.e0(new c(t1Var));
            Object objU = pVar.u();
            if (objU == kotlin.coroutines.intrinsics.b.l()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return objU;
        } catch (ExecutionException e10) {
            throw k(e10);
        }
    }

    @NotNull
    public static final <T> t1<T> i(@NotNull s0 s0Var, @NotNull CoroutineContext coroutineContext, @NotNull u0 u0Var, @NotNull Function2<? super s0, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2) {
        if (!u0Var.o()) {
            kotlinx.coroutines.guava.c cVar = new kotlinx.coroutines.guava.c(l0.k(s0Var, coroutineContext));
            cVar.h2(u0Var, cVar, function2);
            return cVar.f315023d;
        }
        throw new IllegalArgumentException((u0Var + " start is not supported").toString());
    }

    public static /* synthetic */ t1 j(s0 s0Var, CoroutineContext coroutineContext, u0 u0Var, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = h.f312451a;
        }
        if ((i10 & 2) != 0) {
            u0Var = u0.DEFAULT;
        }
        return i(s0Var, coroutineContext, u0Var, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable k(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        Intrinsics.checkNotNull(cause);
        return cause;
    }
}
