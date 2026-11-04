package androidx.compose.material;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderDraggableState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1288:1\n85#2:1289\n117#2,2:1290\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderDraggableState\n*L\n1265#1:1289\n1265#1:1290,2\n*E\n"})
final class we implements androidx.compose.foundation.gestures.a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<Float, Unit> f25391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f25392b = androidx.compose.runtime.d7.g(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.gestures.k2 f25393c = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.s3 f25394d = new androidx.compose.foundation.s3();

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SliderDraggableState$drag$2", f = "Slider.kt", i = {}, l = {1280}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25395a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.q3 f25397c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.foundation.gestures.k2, kotlin.coroutines.d<? super Unit>, Object> f25398d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.foundation.q3 q3Var, Function2<? super androidx.compose.foundation.gestures.k2, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f25397c = q3Var;
            this.f25398d = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return we.this.new a(this.f25397c, this.f25398d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f25395a;
            if (i10 == 0) {
                ResultKt.m(obj);
                we.this.i(true);
                androidx.compose.foundation.s3 s3Var = we.this.f25394d;
                androidx.compose.foundation.gestures.k2 k2Var = we.this.f25393c;
                androidx.compose.foundation.q3 q3Var = this.f25397c;
                Function2<androidx.compose.foundation.gestures.k2, kotlin.coroutines.d<? super Unit>, Object> function2 = this.f25398d;
                this.f25395a = 1;
                if (s3Var.f(k2Var, q3Var, function2, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            we.this.i(false);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final class b implements androidx.compose.foundation.gestures.k2 {
        b() {
        }

        @Override // androidx.compose.foundation.gestures.k2
        public void a(float f10) {
            we.this.g().invoke(Float.valueOf(f10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public we(@NotNull Function1<? super Float, Unit> function1) {
        this.f25391a = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(boolean z10) {
        this.f25392b.setValue(Boolean.valueOf(z10));
    }

    @Override // androidx.compose.foundation.gestures.a3
    @Nullable
    public Object a(@NotNull androidx.compose.foundation.q3 q3Var, @NotNull Function2<? super androidx.compose.foundation.gestures.k2, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objG = kotlinx.coroutines.t0.g(new a(q3Var, function2, null), dVar);
        return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
    }

    @Override // androidx.compose.foundation.gestures.a3
    public void b(float f10) {
        this.f25391a.invoke(Float.valueOf(f10));
    }

    @NotNull
    public final Function1<Float, Unit> g() {
        return this.f25391a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean h() {
        return ((Boolean) this.f25392b.getValue()).booleanValue();
    }
}
