package kotlinx.coroutines.rx2;

import io.reactivex.j0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.m2;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.o1;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nRxScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RxScheduler.kt\nkotlinx/coroutines/rx2/RxSchedulerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,178:1\n1#2:179\n*E\n"})
public final class a0 {

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.rx2.RxSchedulerKt", f = "RxScheduler.kt", i = {0}, l = {122}, m = "scheduleTask$task", n = {"ctx"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f315307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f315308b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f315309c;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f315308b = obj;
            this.f315309c |= Integer.MIN_VALUE;
            return a0.j(null, null, null, this);
        }
    }

    /* synthetic */ class b extends kotlin.jvm.internal.g0 implements Function1<kotlin.coroutines.d<? super Unit>, Object>, kotlin.coroutines.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ io.reactivex.disposables.c f315310a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CoroutineContext f315311b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Runnable f315312c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(io.reactivex.disposables.c cVar, CoroutineContext coroutineContext, Runnable runnable) {
            super(1, Intrinsics.a.class, "task", "scheduleTask$task(Lio/reactivex/disposables/Disposable;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            this.f315310a = cVar;
            this.f315311b = coroutineContext;
            this.f315312c = runnable;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return a0.j(this.f315310a, this.f315311b, this.f315312c, dVar);
        }
    }

    @NotNull
    public static final n0 e(@NotNull j0 j0Var) {
        return j0Var instanceof e ? ((e) j0Var).f315322b : new g0(j0Var);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Since 1.4.2, binary compatibility with earlier versions")
    @oj.i(name = "asCoroutineDispatcher")
    public static final /* synthetic */ g0 f(j0 j0Var) {
        return new g0(j0Var);
    }

    @NotNull
    public static final j0 g(@NotNull n0 n0Var) {
        return n0Var instanceof g0 ? ((g0) n0Var).R0() : new e(n0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, kotlinx.coroutines.o1] */
    public static final io.reactivex.disposables.c h(s0 s0Var, Runnable runnable, long j10, Function1<? super Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object>, ? extends Runnable> function1) {
        CoroutineContext coroutineContext = s0Var.getCoroutineContext();
        final i1.h hVar = new i1.h();
        io.reactivex.disposables.c cVarF = io.reactivex.disposables.d.f(new Runnable() { // from class: kotlinx.coroutines.rx2.y
            @Override // java.lang.Runnable
            public final void run() {
                a0.i(hVar);
            }
        });
        Runnable runnableInvoke = function1.invoke(new b(cVarF, coroutineContext, io.reactivex.plugins.a.b0(runnable)));
        if (!t0.k(s0Var)) {
            return io.reactivex.disposables.d.a();
        }
        if (j10 <= 0) {
            runnableInvoke.run();
            return cVarF;
        }
        hVar.f312751a = d1.d(coroutineContext).d(j10, runnableInvoke, coroutineContext);
        return cVarF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(i1.h hVar) {
        o1 o1Var = (o1) hVar.f312751a;
        if (o1Var != null) {
            o1Var.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object j(io.reactivex.disposables.c cVar, CoroutineContext coroutineContext, final Runnable runnable, kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f315309c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f315309c = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f315308b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f315309c;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                if (cVar.k()) {
                    return Unit.f312394a;
                }
                Function0 function0 = new Function0() { // from class: kotlinx.coroutines.rx2.z
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return a0.k(runnable);
                    }
                };
                aVar.f315307a = coroutineContext;
                aVar.f315309c = 1;
                if (m2.c(null, function0, aVar, 1, null) == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineContext = (CoroutineContext) aVar.f315307a;
                ResultKt.m(obj);
            }
        } catch (Throwable th2) {
            j.a(th2, coroutineContext);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(Runnable runnable) {
        runnable.run();
        return Unit.f312394a;
    }
}
