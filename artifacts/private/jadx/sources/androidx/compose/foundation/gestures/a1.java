package androidx.compose.foundation.gestures;

import androidx.compose.runtime.d7;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class a1 implements p5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final pj.n<Float, n0.g, Float, Unit> f14313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final k5 f14314b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.s3 f14315c = new androidx.compose.foundation.s3();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3<Boolean> f14316d = d7.g(Boolean.FALSE, null, 2, null);

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DefaultTransformableState$transform$2", f = "TransformableState.kt", i = {}, l = {443}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14317a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.q3 f14319c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<k5, kotlin.coroutines.d<? super Unit>, Object> f14320d;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.a1$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DefaultTransformableState$transform$2$1", f = "TransformableState.kt", i = {}, l = {446}, m = "invokeSuspend", n = {}, s = {})
        static final class C0074a extends kotlin.coroutines.jvm.internal.o implements Function2<k5, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f14321a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f14322b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ a1 f14323c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function2<k5, kotlin.coroutines.d<? super Unit>, Object> f14324d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0074a(a1 a1Var, Function2<? super k5, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super C0074a> dVar) {
                super(2, dVar);
                this.f14323c = a1Var;
                this.f14324d = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                C0074a c0074a = new C0074a(this.f14323c, this.f14324d, dVar);
                c0074a.f14322b = obj;
                return c0074a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, kotlin.Unit] */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f14321a;
                try {
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        k5 k5Var = (k5) this.f14322b;
                        this.f14323c.f14316d.setValue(kotlin.coroutines.jvm.internal.b.a(true));
                        Function2<k5, kotlin.coroutines.d<? super Unit>, Object> function2 = this.f14324d;
                        this.f14321a = 1;
                        if (function2.invoke(k5Var, this) == objL) {
                            return objL;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.m(obj);
                    }
                    this.f14323c.f14316d.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                    this = Unit.f312394a;
                    return this;
                } catch (Throwable th2) {
                    this.f14323c.f14316d.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                    throw th2;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(k5 k5Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0074a) create(k5Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.foundation.q3 q3Var, Function2<? super k5, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f14319c = q3Var;
            this.f14320d = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a1.this.new a(this.f14319c, this.f14320d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f14317a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.foundation.s3 s3Var = a1.this.f14315c;
                k5 k5Var = a1.this.f14314b;
                androidx.compose.foundation.q3 q3Var = this.f14319c;
                int i11 = 7 << 0;
                C0074a c0074a = new C0074a(a1.this, this.f14320d, null);
                this.f14317a = 1;
                if (s3Var.f(k5Var, q3Var, c0074a, this) == objL) {
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

    public static final class b implements k5 {
        b() {
        }

        @Override // androidx.compose.foundation.gestures.k5
        public void a(float f10, long j10, float f11) {
            a1.this.g().invoke(Float.valueOf(f10), n0.g.d(j10), Float.valueOf(f11));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a1(@NotNull pj.n<? super Float, ? super n0.g, ? super Float, Unit> nVar) {
        this.f14313a = nVar;
        int i10 = 0 << 0;
    }

    @Override // androidx.compose.foundation.gestures.p5
    public boolean b() {
        return this.f14316d.getValue().booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.p5
    @Nullable
    public Object c(@NotNull androidx.compose.foundation.q3 q3Var, @NotNull Function2<? super k5, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objG = kotlinx.coroutines.t0.g(new a(q3Var, function2, null), dVar);
        return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
    }

    @NotNull
    public final pj.n<Float, n0.g, Float, Unit> g() {
        return this.f14313a;
    }
}
