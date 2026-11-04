package androidx.lifecycle;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.u2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class g0 extends f0 implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final c0 f52346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f52347b;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f52348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f52349b;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = g0.this.new a(dVar);
            aVar.f52349b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f52348a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) this.f52349b;
            if (g0.this.c().d().compareTo(c0.b.INITIALIZED) >= 0) {
                g0.this.c().c(g0.this);
            } else {
                u2.i(s0Var.getCoroutineContext(), null, 1, null);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public g0(@NotNull c0 lifecycle, @NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f52346a = lifecycle;
        this.f52347b = coroutineContext;
        if (c().d() == c0.b.DESTROYED) {
            u2.i(getCoroutineContext(), null, 1, null);
        }
    }

    @Override // androidx.lifecycle.f0
    @NotNull
    public c0 c() {
        return this.f52346a;
    }

    @Override // androidx.lifecycle.j0
    public void e(@NotNull o0 source, @NotNull c0.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (c().d().compareTo(c0.b.DESTROYED) <= 0) {
            c().g(this);
            u2.i(getCoroutineContext(), null, 1, null);
        }
    }

    @Override // kotlinx.coroutines.s0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f52347b;
    }

    public final void k() {
        int i10 = 6 | 0;
        kotlinx.coroutines.k.f(this, kotlinx.coroutines.l1.e().R0(), null, new a(null), 2, null);
    }
}
