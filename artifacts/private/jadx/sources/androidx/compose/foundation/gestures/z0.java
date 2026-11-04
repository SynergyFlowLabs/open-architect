package androidx.compose.foundation.gestures;

import androidx.compose.runtime.d7;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class z0 implements v4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<Float, Float> f15417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final z3 f15418b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.s3 f15419c = new androidx.compose.foundation.s3();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3<Boolean> f15420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3<Boolean> f15421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3<Boolean> f15422f;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2", f = "ScrollableState.kt", i = {}, l = {198}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f15423a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.q3 f15425c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<z3, kotlin.coroutines.d<? super Unit>, Object> f15426d;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.z0$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1", f = "ScrollableState.kt", i = {}, l = {201}, m = "invokeSuspend", n = {}, s = {})
        static final class C0086a extends kotlin.coroutines.jvm.internal.o implements Function2<z3, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f15427a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f15428b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ z0 f15429c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function2<z3, kotlin.coroutines.d<? super Unit>, Object> f15430d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0086a(z0 z0Var, Function2<? super z3, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super C0086a> dVar) {
                super(2, dVar);
                this.f15429c = z0Var;
                this.f15430d = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                C0086a c0086a = new C0086a(this.f15429c, this.f15430d, dVar);
                c0086a.f15428b = obj;
                return c0086a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, kotlin.Unit] */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f15427a;
                try {
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        z3 z3Var = (z3) this.f15428b;
                        this.f15429c.f15420d.setValue(kotlin.coroutines.jvm.internal.b.a(true));
                        Function2<z3, kotlin.coroutines.d<? super Unit>, Object> function2 = this.f15430d;
                        this.f15427a = 1;
                        if (function2.invoke(z3Var, this) == objL) {
                            return objL;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.m(obj);
                    }
                    this.f15429c.f15420d.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                    this = Unit.f312394a;
                    return this;
                } catch (Throwable th2) {
                    this.f15429c.f15420d.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                    throw th2;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(z3 z3Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0086a) create(z3Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.foundation.q3 q3Var, Function2<? super z3, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f15425c = q3Var;
            this.f15426d = function2;
            int i10 = 2 >> 2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return z0.this.new a(this.f15425c, this.f15426d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f15423a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.foundation.s3 s3Var = z0.this.f15419c;
                z3 z3Var = z0.this.f15418b;
                androidx.compose.foundation.q3 q3Var = this.f15425c;
                C0086a c0086a = new C0086a(z0.this, this.f15426d, null);
                this.f15423a = 1;
                if (s3Var.f(z3Var, q3Var, c0086a, this) == objL) {
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

    public static final class b implements z3 {
        b() {
        }

        @Override // androidx.compose.foundation.gestures.z3
        public float f(float f10) {
            if (Float.isNaN(f10)) {
                return 0.0f;
            }
            float fFloatValue = z0.this.r().invoke(Float.valueOf(f10)).floatValue();
            z0.this.f15421e.setValue(Boolean.valueOf(fFloatValue > 0.0f));
            z0.this.f15422f.setValue(Boolean.valueOf(fFloatValue < 0.0f));
            return fFloatValue;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z0(@NotNull Function1<? super Float, Float> function1) {
        this.f15417a = function1;
        Boolean bool = Boolean.FALSE;
        this.f15420d = d7.g(bool, null, 2, null);
        this.f15421e = d7.g(bool, null, 2, null);
        this.f15422f = d7.g(bool, null, 2, null);
    }

    @Override // androidx.compose.foundation.gestures.v4
    public boolean a() {
        return this.f15420d.getValue().booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.v4
    public float b(float f10) {
        return this.f15417a.invoke(Float.valueOf(f10)).floatValue();
    }

    @Override // androidx.compose.foundation.gestures.v4
    @Nullable
    public Object c(@NotNull androidx.compose.foundation.q3 q3Var, @NotNull Function2<? super z3, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objG = kotlinx.coroutines.t0.g(new a(q3Var, function2, null), dVar);
        return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
    }

    @Override // androidx.compose.foundation.gestures.v4
    public boolean g() {
        return this.f15422f.getValue().booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.v4
    public boolean j() {
        return this.f15421e.getValue().booleanValue();
    }

    @NotNull
    public final Function1<Float, Float> r() {
        return this.f15417a;
    }
}
