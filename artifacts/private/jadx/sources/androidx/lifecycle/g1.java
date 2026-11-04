package androidx.lifecycle;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@oj.i(name = "PausingDispatcherKt")
public final class g1 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.jvm.kt", i = {0}, l = {213}, m = "invokeSuspend", n = {"controller"}, s = {"L$0"})
    static final class a<T> extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super T>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f52351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f52352b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c0 f52353c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c0.b f52354d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super T>, Object> f52355e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(c0 c0Var, c0.b bVar, Function2<? super kotlinx.coroutines.s0, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f52353c = c0Var;
            this.f52354d = bVar;
            this.f52355e = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f52353c, this.f52354d, this.f52355e, dVar);
            aVar.f52352b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            e0 e0Var;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f52351a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e0Var = (e0) this.f52352b;
                try {
                    ResultKt.m(obj);
                    e0Var.b();
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    e0Var.b();
                    throw th;
                }
            }
            ResultKt.m(obj);
            kotlinx.coroutines.p2 p2Var = (kotlinx.coroutines.p2) ((kotlinx.coroutines.s0) this.f52352b).getCoroutineContext().get(kotlinx.coroutines.p2.M2);
            if (p2Var == null) {
                throw new IllegalStateException("when[State] methods should have a parent job");
            }
            f1 f1Var = new f1();
            e0 e0Var2 = new e0(this.f52353c, this.f52354d, f1Var.f52335b, p2Var);
            try {
                Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super T>, Object> function2 = this.f52355e;
                this.f52352b = e0Var2;
                this.f52351a = 1;
                obj = kotlinx.coroutines.i.h(f1Var, function2, this);
                if (obj == objL) {
                    return objL;
                }
                e0Var = e0Var2;
                e0Var.b();
                return obj;
            } catch (Throwable th3) {
                th = th3;
                e0Var = e0Var2;
                e0Var.b();
                throw th;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super T> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.l(message = "whenCreated has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withCreated for non-suspending work that needs to run only once when the Lifecycle changes.")
    @Nullable
    public static final <T> Object a(@NotNull c0 c0Var, @NotNull Function2<? super kotlinx.coroutines.s0, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super T> dVar) {
        return g(c0Var, c0.b.CREATED, function2, dVar);
    }

    @kotlin.l(message = "whenCreated has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withCreated for non-suspending work that needs to run only once when the Lifecycle changes.")
    @Nullable
    public static final <T> Object b(@NotNull o0 o0Var, @NotNull Function2<? super kotlinx.coroutines.s0, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super T> dVar) {
        return a(o0Var.getLifecycle(), function2, dVar);
    }

    @kotlin.l(message = "whenResumed has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withResumed for non-suspending work that needs to run only once when the Lifecycle changes.")
    @Nullable
    public static final <T> Object c(@NotNull c0 c0Var, @NotNull Function2<? super kotlinx.coroutines.s0, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super T> dVar) {
        return g(c0Var, c0.b.RESUMED, function2, dVar);
    }

    @kotlin.l(message = "whenResumed has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withResumed for non-suspending work that needs to run only once when the Lifecycle changes.")
    @Nullable
    public static final <T> Object d(@NotNull o0 o0Var, @NotNull Function2<? super kotlinx.coroutines.s0, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super T> dVar) {
        return c(o0Var.getLifecycle(), function2, dVar);
    }

    @kotlin.l(message = "whenStarted has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStarted for non-suspending work that needs to run only once when the Lifecycle changes.")
    @Nullable
    public static final <T> Object e(@NotNull c0 c0Var, @NotNull Function2<? super kotlinx.coroutines.s0, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super T> dVar) {
        return g(c0Var, c0.b.STARTED, function2, dVar);
    }

    @kotlin.l(message = "whenStarted has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStarted for non-suspending work that needs to run only once when the Lifecycle changes.")
    @Nullable
    public static final <T> Object f(@NotNull o0 o0Var, @NotNull Function2<? super kotlinx.coroutines.s0, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super T> dVar) {
        return e(o0Var.getLifecycle(), function2, dVar);
    }

    @kotlin.l(message = "whenStateAtLeast has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStateAtLeast for non-suspending work that needs to run only once when the Lifecycle changes.")
    @Nullable
    public static final <T> Object g(@NotNull c0 c0Var, @NotNull c0.b bVar, @NotNull Function2<? super kotlinx.coroutines.s0, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super T> dVar) {
        return kotlinx.coroutines.i.h(kotlinx.coroutines.l1.e().R0(), new a(c0Var, bVar, function2, null), dVar);
    }
}
