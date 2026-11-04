package androidx.compose.foundation.gestures;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class v0 implements a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<Float, Unit> f15167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final k2 f15168b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.s3 f15169c = new androidx.compose.foundation.s3();

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DefaultDraggableState$drag$2", f = "Draggable.kt", i = {}, l = {643}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f15170a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.q3 f15172c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<k2, kotlin.coroutines.d<? super Unit>, Object> f15173d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.foundation.q3 q3Var, Function2<? super k2, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f15172c = q3Var;
            this.f15173d = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return v0.this.new a(this.f15172c, this.f15173d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f15170a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.foundation.s3 s3Var = v0.this.f15169c;
                k2 k2Var = v0.this.f15168b;
                androidx.compose.foundation.q3 q3Var = this.f15172c;
                Function2<k2, kotlin.coroutines.d<? super Unit>, Object> function2 = this.f15173d;
                this.f15170a = 1;
                if (s3Var.f(k2Var, q3Var, function2, this) == objL) {
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

    public static final class b implements k2 {
        b() {
        }

        @Override // androidx.compose.foundation.gestures.k2
        public void a(float f10) {
            v0.this.f().invoke(Float.valueOf(f10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v0(@NotNull Function1<? super Float, Unit> function1) {
        this.f15167a = function1;
    }

    @Override // androidx.compose.foundation.gestures.a3
    @Nullable
    public Object a(@NotNull androidx.compose.foundation.q3 q3Var, @NotNull Function2<? super k2, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objG = kotlinx.coroutines.t0.g(new a(q3Var, function2, null), dVar);
        return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
    }

    @Override // androidx.compose.foundation.gestures.a3
    public void b(float f10) {
        this.f15167a.invoke(Float.valueOf(f10));
    }

    @NotNull
    public final Function1<Float, Unit> f() {
        return this.f15167a;
    }
}
