package androidx.paging;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSimpleChannelFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleChannelFlow.kt\nandroidx/paging/SimpleProducerScopeImpl\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,100:1\n314#2,11:101\n*S KotlinDebug\n*F\n+ 1 SimpleChannelFlow.kt\nandroidx/paging/SimpleProducerScopeImpl\n*L\n90#1:101,11\n*E\n"})
public final class b3<T> implements a3<T>, kotlinx.coroutines.s0, kotlinx.coroutines.channels.o0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.channels.o0<T> f71543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ kotlinx.coroutines.s0 f71544b;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.SimpleProducerScopeImpl", f = "SimpleChannelFlow.kt", i = {0, 0}, l = {101}, m = "awaitClose", n = {"block", "job"}, s = {"L$0", "L$1"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f71545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f71546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f71547c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ b3<T> f71548d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f71549e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(b3<T> b3Var, kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
            this.f71548d = b3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f71547c = obj;
            this.f71549e |= Integer.MIN_VALUE;
            return this.f71548d.U0(null, this);
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.n<Unit> f71550a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(kotlinx.coroutines.n<? super Unit> nVar) {
            super(1);
            this.f71550a = nVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Throwable th2) {
            kotlinx.coroutines.n<Unit> nVar = this.f71550a;
            Result.a aVar = Result.Companion;
            nVar.resumeWith(Result.m785constructorimpl(Unit.f312394a));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b3(@NotNull kotlinx.coroutines.s0 scope, @NotNull kotlinx.coroutines.channels.o0<? super T> channel) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.f71543a = channel;
        this.f71544b = scope;
    }

    @Override // kotlinx.coroutines.channels.o0
    public boolean B() {
        return this.f71543a.B();
    }

    @Override // kotlinx.coroutines.channels.o0
    public boolean F(@Nullable Throwable th2) {
        return this.f71543a.F(th2);
    }

    @Override // kotlinx.coroutines.channels.o0
    @Nullable
    public Object G(T t10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return this.f71543a.G(t10, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // androidx.paging.a3
    @Nullable
    public Object U0(@NotNull Function0<Unit> function0, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f71549e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f71549e = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, dVar);
            }
        } else {
            aVar = new a(this, dVar);
        }
        Object obj = aVar.f71547c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f71549e;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                CoroutineContext.Element element = getCoroutineContext().get(kotlinx.coroutines.p2.M2);
                if (element == null) {
                    throw new IllegalStateException("Internal error, context should have a job.");
                }
                kotlinx.coroutines.p2 p2Var = (kotlinx.coroutines.p2) element;
                aVar.f71545a = function0;
                aVar.f71546b = p2Var;
                aVar.f71549e = 1;
                kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(aVar), 1);
                pVar.p0();
                p2Var.E(new b(pVar));
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
                function0 = (Function0) aVar.f71545a;
                ResultKt.m(obj);
            }
            function0.invoke();
            return Unit.f312394a;
        } catch (Throwable th2) {
            function0.invoke();
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.s0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f71544b.getCoroutineContext();
    }

    @Override // kotlinx.coroutines.channels.o0
    @NotNull
    public kotlinx.coroutines.selects.j<T, kotlinx.coroutines.channels.o0<T>> i() {
        return this.f71543a.i();
    }

    @Override // kotlinx.coroutines.channels.o0
    public void n(@NotNull Function1<? super Throwable, Unit> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f71543a.n(handler);
    }

    @Override // kotlinx.coroutines.channels.o0
    @kotlin.l(level = kotlin.n.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @kotlin.b1(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(T t10) {
        return this.f71543a.offer(t10);
    }

    @Override // kotlinx.coroutines.channels.o0
    @NotNull
    public Object p(T t10) {
        return this.f71543a.p(t10);
    }

    @Override // androidx.paging.a3
    @NotNull
    public kotlinx.coroutines.channels.o0<T> s() {
        return this.f71543a;
    }
}
