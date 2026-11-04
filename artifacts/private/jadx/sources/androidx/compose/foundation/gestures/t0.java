package androidx.compose.foundation.gestures;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class t0 implements s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<n0.g, Unit> f15106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final c1 f15107b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.s3 f15108c = new androidx.compose.foundation.s3();

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DefaultDraggable2DState$drag$2", f = "Draggable2D.kt", i = {}, l = {com.rabbitmq.client.a.f264844o}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f15109a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.q3 f15111c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<c1, kotlin.coroutines.d<? super Unit>, Object> f15112d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.foundation.q3 q3Var, Function2<? super c1, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f15111c = q3Var;
            this.f15112d = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return t0.this.new a(this.f15111c, this.f15112d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f15109a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.foundation.s3 s3Var = t0.this.f15108c;
                c1 c1Var = t0.this.f15107b;
                androidx.compose.foundation.q3 q3Var = this.f15111c;
                Function2<c1, kotlin.coroutines.d<? super Unit>, Object> function2 = this.f15112d;
                this.f15109a = 1;
                if (s3Var.f(c1Var, q3Var, function2, this) == objL) {
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

    public static final class b implements c1 {
        b() {
        }

        @Override // androidx.compose.foundation.gestures.c1
        public void a(long j10) {
            t0.this.f().invoke(n0.g.d(j10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t0(@NotNull Function1<? super n0.g, Unit> function1) {
        this.f15106a = function1;
    }

    @Override // androidx.compose.foundation.gestures.s2
    @Nullable
    public Object a(@NotNull androidx.compose.foundation.q3 q3Var, @NotNull Function2<? super c1, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objG = kotlinx.coroutines.t0.g(new a(q3Var, function2, null), dVar);
        return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
    }

    @Override // androidx.compose.foundation.gestures.s2
    public void c(long j10) {
        this.f15106a.invoke(n0.g.d(j10));
    }

    @NotNull
    public final Function1<n0.g, Unit> f() {
        return this.f15106a;
    }
}
