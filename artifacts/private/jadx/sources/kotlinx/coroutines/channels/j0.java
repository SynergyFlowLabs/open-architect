package kotlinx.coroutines.channels;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.c2;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.u0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nProduce.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Produce.kt\nkotlinx/coroutines/channels/ProduceKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,300:1\n1#2:301\n426#3,11:302\n*S KotlinDebug\n*F\n+ 1 Produce.kt\nkotlinx/coroutines/channels/ProduceKt\n*L\n63#1:302,11\n*E\n"})
public final class j0 {

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", i = {0, 0}, l = {302}, m = "awaitClose", n = {"$this$awaitClose", "block"}, s = {"L$0", "L$1"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f313783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f313784b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f313785c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f313786d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f313785c = obj;
            this.f313786d |= Integer.MIN_VALUE;
            return j0.b(null, null, this);
        }
    }

    static final class b implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.n<Unit> f313787a;

        /* JADX WARN: Multi-variable type inference failed */
        b(kotlinx.coroutines.n<? super Unit> nVar) {
            this.f313787a = nVar;
        }

        public final void c(Throwable th2) {
            kotlinx.coroutines.n<Unit> nVar = this.f313787a;
            Result.a aVar = Result.Companion;
            nVar.resumeWith(Result.m785constructorimpl(Unit.f312394a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            c(th2);
            return Unit.f312394a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public static final Object b(@NotNull l0<?> l0Var, @NotNull Function0<Unit> function0, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f313786d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f313786d = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f313785c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f313786d;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                if (aVar.getContext().get(p2.M2) != l0Var) {
                    throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                }
                aVar.f313783a = l0Var;
                aVar.f313784b = function0;
                aVar.f313786d = 1;
                kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(aVar), 1);
                pVar.p0();
                l0Var.n(new b(pVar));
                Object objU = pVar.u();
                if (objU == kotlin.coroutines.intrinsics.b.l()) {
                    kotlin.coroutines.jvm.internal.h.c(aVar);
                }
                if (objU == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function0 = (Function0) aVar.f313784b;
                ResultKt.m(obj);
            }
            function0.invoke();
            return Unit.f312394a;
        } catch (Throwable th2) {
            function0.invoke();
            throw th2;
        }
    }

    public static /* synthetic */ Object c(l0 l0Var, Function0 function0, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function0 = new Function0() { // from class: kotlinx.coroutines.channels.i0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return j0.d();
                }
            };
        }
        return b(l0Var, function0, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d() {
        return Unit.f312394a;
    }

    @c2
    @NotNull
    public static final <E> n0<E> e(@NotNull s0 s0Var, @NotNull CoroutineContext coroutineContext, int i10, @kotlin.b @NotNull Function2<? super l0<? super E>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        return g(s0Var, coroutineContext, i10, j.SUSPEND, u0.DEFAULT, null, function2);
    }

    @k2
    @NotNull
    public static final <E> n0<E> f(@NotNull s0 s0Var, @NotNull CoroutineContext coroutineContext, int i10, @NotNull u0 u0Var, @Nullable Function1<? super Throwable, Unit> function1, @kotlin.b @NotNull Function2<? super l0<? super E>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        return g(s0Var, coroutineContext, i10, j.SUSPEND, u0Var, function1, function2);
    }

    @NotNull
    public static final <E> n0<E> g(@NotNull s0 s0Var, @NotNull CoroutineContext coroutineContext, int i10, @NotNull j jVar, @NotNull u0 u0Var, @Nullable Function1<? super Throwable, Unit> function1, @kotlin.b @NotNull Function2<? super l0<? super E>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        k0 k0Var = new k0(kotlinx.coroutines.l0.k(s0Var, coroutineContext), s.d(i10, jVar, null, 4, null));
        if (function1 != null) {
            k0Var.E(function1);
        }
        k0Var.h2(u0Var, k0Var, function2);
        return k0Var;
    }

    public static /* synthetic */ n0 h(s0 s0Var, CoroutineContext coroutineContext, int i10, Function2 function2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineContext = kotlin.coroutines.h.f312451a;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return e(s0Var, coroutineContext, i10, function2);
    }

    public static /* synthetic */ n0 i(s0 s0Var, CoroutineContext coroutineContext, int i10, u0 u0Var, Function1 function1, Function2 function2, int i11, Object obj) {
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
        return f(s0Var, coroutineContext, i10, u0Var2, function1, function2);
    }

    public static /* synthetic */ n0 j(s0 s0Var, CoroutineContext coroutineContext, int i10, j jVar, u0 u0Var, Function1 function1, Function2 function2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineContext = kotlin.coroutines.h.f312451a;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            jVar = j.SUSPEND;
        }
        if ((i11 & 8) != 0) {
            u0Var = u0.DEFAULT;
        }
        if ((i11 & 16) != 0) {
            function1 = null;
        }
        Function1 function3 = function1;
        return g(s0Var, coroutineContext, i10, jVar, u0Var, function3, function2);
    }
}
