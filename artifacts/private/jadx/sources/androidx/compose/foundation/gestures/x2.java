package androidx.compose.foundation.gestures;

import androidx.compose.runtime.k7;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.w6;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,671:1\n1282#2,6:672\n69#3:678\n65#3:681\n70#4:679\n60#4:682\n22#5:680\n*S KotlinDebug\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt\n*L\n133#1:672,6\n661#1:678\n661#1:681\n661#1:679\n661#1:682\n661#1:680\n*E\n"})
public final class x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final pj.n<kotlinx.coroutines.s0, n0.g, kotlin.coroutines.d<? super Unit>, Object> f15377a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final pj.n<kotlinx.coroutines.s0, Float, kotlin.coroutines.d<? super Unit>, Object> f15378b = new b(null);

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DraggableKt$NoOpOnDragStarted$1", f = "Draggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements pj.n<kotlinx.coroutines.s0, n0.g, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f15379a;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(3, dVar);
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.s0 s0Var, n0.g gVar, kotlin.coroutines.d<? super Unit> dVar) {
            return k(s0Var, gVar.B(), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f15379a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return Unit.f312394a;
        }

        public final Object k(kotlinx.coroutines.s0 s0Var, long j10, kotlin.coroutines.d<? super Unit> dVar) {
            return new a(dVar).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DraggableKt$NoOpOnDragStopped$1", f = "Draggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements pj.n<kotlinx.coroutines.s0, Float, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f15380a;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(3, dVar);
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.s0 s0Var, Float f10, kotlin.coroutines.d<? super Unit> dVar) {
            return k(s0Var, f10.floatValue(), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f15380a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return Unit.f312394a;
        }

        public final Object k(kotlinx.coroutines.s0 s0Var, float f10, kotlin.coroutines.d<? super Unit> dVar) {
            return new b(dVar).invokeSuspend(Unit.f312394a);
        }
    }

    @NotNull
    public static final a3 b(@NotNull Function1<? super Float, Unit> function1) {
        return new v0(function1);
    }

    @k7
    @NotNull
    public static final androidx.compose.ui.a0 h(@NotNull androidx.compose.ui.a0 a0Var, @NotNull a3 a3Var, @NotNull q3 q3Var, boolean z10, @Nullable androidx.compose.foundation.interaction.j jVar, boolean z11, @NotNull pj.n<? super kotlinx.coroutines.s0, ? super n0.g, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar, @NotNull pj.n<? super kotlinx.coroutines.s0, ? super Float, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar2, boolean z12) {
        return a0Var.B2(new DraggableElement(a3Var, q3Var, z10, jVar, z11, nVar, nVar2, z12));
    }

    public static /* synthetic */ androidx.compose.ui.a0 i(androidx.compose.ui.a0 a0Var, a3 a3Var, q3 q3Var, boolean z10, androidx.compose.foundation.interaction.j jVar, boolean z11, pj.n nVar, pj.n nVar2, boolean z12, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z13 = z10;
        if ((i10 & 8) != 0) {
            jVar = null;
        }
        return h(a0Var, a3Var, q3Var, z13, jVar, (i10 & 16) != 0 ? false : z11, (i10 & 32) != 0 ? f15377a : nVar, (i10 & 64) != 0 ? f15378b : nVar2, (i10 & 128) != 0 ? false : z12);
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final a3 j(@NotNull Function1<? super Float, Unit> function1, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-183245213, i10, -1, "androidx.compose.foundation.gestures.rememberDraggableState (Draggable.kt:130)");
        }
        final n7 n7VarW = w6.w(function1, c0Var, i10 & 14);
        Object objI0 = c0Var.i0();
        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = b(new Function1() { // from class: androidx.compose.foundation.gestures.w2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return x2.k(n7VarW, ((Float) obj).floatValue());
                }
            });
            c0Var.Y(objI0);
        }
        a3 a3Var = (a3) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return a3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(n7 n7Var, float f10) {
        ((Function1) n7Var.getValue()).invoke(Float.valueOf(f10));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float l(long j10, q3 q3Var) {
        return Float.intBitsToFloat((int) (q3Var == q3.Vertical ? j10 & com.rabbitmq.client.k0.f265952a : j10 >> 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float m(long j10, q3 q3Var) {
        return q3Var == q3.Vertical ? androidx.compose.ui.unit.c0.n(j10) : androidx.compose.ui.unit.c0.l(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long n(long j10) {
        return androidx.compose.ui.unit.d0.a(Float.isNaN(androidx.compose.ui.unit.c0.l(j10)) ? 0.0f : androidx.compose.ui.unit.c0.l(j10), Float.isNaN(androidx.compose.ui.unit.c0.n(j10)) ? 0.0f : androidx.compose.ui.unit.c0.n(j10));
    }
}
