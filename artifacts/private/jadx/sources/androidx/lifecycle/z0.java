package androidx.lifecycle;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class z0<T> implements y0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private m<T> f52599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f52600b;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.LiveDataScopeImpl$emit$2", f = "CoroutineLiveData.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160718p1}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f52601a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z0<T> f52602b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f52603c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(z0<T> z0Var, T t10, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f52602b = z0Var;
            this.f52603c = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f52602b, this.f52603c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f52601a;
            if (i10 == 0) {
                ResultKt.m(obj);
                m<T> mVarC = this.f52602b.c();
                this.f52601a = 1;
                if (mVarC.w(this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            this.f52602b.c().r(this.f52603c);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.LiveDataScopeImpl$emitSource$2", f = "CoroutineLiveData.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160697i1}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super kotlinx.coroutines.o1>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f52604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z0<T> f52605b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w0<T> f52606c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(z0<T> z0Var, w0<T> w0Var, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f52605b = z0Var;
            this.f52606c = w0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f52605b, this.f52606c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f52604a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            m<T> mVarC = this.f52605b.c();
            w0<T> w0Var = this.f52606c;
            this.f52604a = 1;
            Object objX = mVarC.x(w0Var, this);
            return objX == objL ? objL : objX;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super kotlinx.coroutines.o1> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public z0(@NotNull m<T> target, @NotNull CoroutineContext context) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f52599a = target;
        this.f52600b = context.plus(kotlinx.coroutines.l1.e().R0());
    }

    @Override // androidx.lifecycle.y0
    @Nullable
    public Object a(@NotNull w0<T> w0Var, @NotNull kotlin.coroutines.d<? super kotlinx.coroutines.o1> dVar) {
        return kotlinx.coroutines.i.h(this.f52600b, new b(this, w0Var, null), dVar);
    }

    @Override // androidx.lifecycle.y0
    @Nullable
    public T b() {
        return this.f52599a.f();
    }

    @NotNull
    public final m<T> c() {
        return this.f52599a;
    }

    public final void d(@NotNull m<T> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<set-?>");
        this.f52599a = mVar;
    }

    @Override // androidx.lifecycle.y0
    @e.a({"NullSafeMutableLiveData"})
    @Nullable
    public Object emit(T t10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = kotlinx.coroutines.i.h(this.f52600b, new a(this, t10, null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }
}
