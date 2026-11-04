package androidx.lifecycle;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class s implements kotlinx.coroutines.o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final w0<?> f52499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final a1<?> f52500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f52501c;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.EmittedSource$dispose$1", f = "CoroutineLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f52502a;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return s.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f52502a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            s.this.d();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.EmittedSource$disposeNow$2", f = "CoroutineLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f52504a;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return s.this.new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f52504a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            s.this.d();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public s(@NotNull w0<?> source, @NotNull a1<?> mediator) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(mediator, "mediator");
        this.f52499a = source;
        this.f52500b = mediator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.l0
    public final void d() {
        if (!this.f52501c) {
            this.f52500b.t(this.f52499a);
            this.f52501c = true;
        }
    }

    @Nullable
    public final Object b(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = kotlinx.coroutines.i.h(kotlinx.coroutines.l1.e().R0(), new b(null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    @Override // kotlinx.coroutines.o1
    public void dispose() {
        int i10 = 5 >> 0;
        kotlinx.coroutines.k.f(kotlinx.coroutines.t0.a(kotlinx.coroutines.l1.e().R0()), null, null, new a(null), 3, null);
    }
}
