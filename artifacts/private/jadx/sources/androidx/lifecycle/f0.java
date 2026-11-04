package androidx.lifecycle;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f0 implements kotlinx.coroutines.s0 {

    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1", f = "Lifecycle.jvm.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.V}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f52326a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> f52328c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super kotlinx.coroutines.s0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f52328c = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return f0.this.new a(this.f52328c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f52326a;
            if (i10 == 0) {
                ResultKt.m(obj);
                c0 c0VarC = f0.this.c();
                Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> function2 = this.f52328c;
                this.f52326a = 1;
                if (g1.a(c0VarC, function2, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1", f = "Lifecycle.jvm.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f52329a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> f52331c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function2<? super kotlinx.coroutines.s0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f52331c = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return f0.this.new b(this.f52331c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f52329a;
            if (i10 == 0) {
                ResultKt.m(obj);
                c0 c0VarC = f0.this.c();
                Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> function2 = this.f52331c;
                this.f52329a = 1;
                if (g1.c(c0VarC, function2, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1", f = "Lifecycle.jvm.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160696i0}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f52332a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> f52334c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Function2<? super kotlinx.coroutines.s0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f52334c = function2;
            int i10 = 3 & 2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return f0.this.new c(this.f52334c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f52332a;
            if (i10 == 0) {
                ResultKt.m(obj);
                c0 c0VarC = f0.this.c();
                Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> function2 = this.f52334c;
                this.f52332a = 1;
                if (g1.e(c0VarC, function2, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @NotNull
    public abstract c0 c();

    @kotlin.l(message = "launchWhenCreated is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.CREATED.")
    @NotNull
    public final kotlinx.coroutines.p2 f(@NotNull Function2<? super kotlinx.coroutines.s0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return kotlinx.coroutines.k.f(this, null, null, new a(block, null), 3, null);
    }

    @kotlin.l(message = "launchWhenResumed is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.RESUMED.")
    @NotNull
    public final kotlinx.coroutines.p2 i(@NotNull Function2<? super kotlinx.coroutines.s0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        boolean z10 = false & false;
        return kotlinx.coroutines.k.f(this, null, null, new b(block, null), 3, null);
    }

    @kotlin.l(message = "launchWhenStarted is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.STARTED.")
    @NotNull
    public final kotlinx.coroutines.p2 j(@NotNull Function2<? super kotlinx.coroutines.s0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return kotlinx.coroutines.k.f(this, null, null, new c(block, null), 3, null);
    }
}
