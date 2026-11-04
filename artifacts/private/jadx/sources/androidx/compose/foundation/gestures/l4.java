package androidx.compose.foundation.gestures;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableDefaults\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1070:1\n1282#2,6:1071\n*S KotlinDebug\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableDefaults\n*L\n549#1:1071,6\n*E\n"})
public final class l4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final l4 f14799a = new l4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f14800b = 0;

    private static final class a implements androidx.compose.foundation.x3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f14801a = new a();

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.l4$a$a, reason: collision with other inner class name */
        public static final class C0080a extends androidx.compose.ui.a0.d {
            C0080a() {
            }
        }

        private a() {
        }

        @Override // androidx.compose.foundation.x3
        @Nullable
        public Object A(long j10, @NotNull Function2<? super androidx.compose.ui.unit.c0, ? super kotlin.coroutines.d<? super androidx.compose.ui.unit.c0>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
            Object objInvoke = function2.invoke(androidx.compose.ui.unit.c0.b(j10), dVar);
            return objInvoke == kotlin.coroutines.intrinsics.b.l() ? objInvoke : Unit.f312394a;
        }

        @Override // androidx.compose.foundation.x3
        @NotNull
        public androidx.compose.ui.node.j w() {
            return new C0080a();
        }

        @Override // androidx.compose.foundation.x3
        public boolean x() {
            return false;
        }

        @Override // androidx.compose.foundation.x3
        public long z(long j10, int i10, @NotNull Function1<? super n0.g, n0.g> function1) {
            return function1.invoke(n0.g.d(j10)).B();
        }
    }

    private l4() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @androidx.compose.runtime.o
    @NotNull
    public final c3 a(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1107739818, i10, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.flingBehavior (Scrollable.kt:546)");
        }
        androidx.compose.animation.core.g0 g0VarB = androidx.compose.animation.n1.b(c0Var, 0);
        boolean zD = c0Var.D(g0VarB);
        Object objI0 = c0Var.i0();
        if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new x0(g0VarB, null, 2, 0 == true ? 1 : 0);
            c0Var.Y(objI0);
        }
        x0 x0Var = (x0) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return x0Var;
    }

    @androidx.compose.runtime.o
    @kotlin.l(message = "This API has been replaced with rememberOverscrollEffect, which queries theme provided OverscrollFactory values instead of the 'platform default' without customization.", replaceWith = @kotlin.b1(expression = "rememberOverscrollEffect()", imports = {"androidx.compose.foundation.rememberOverscrollEffect"}))
    @NotNull
    public final androidx.compose.foundation.x3 b(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1809802212, i10, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.overscrollEffect (Scrollable.kt:566)");
        }
        androidx.compose.foundation.x3 x3VarF = androidx.compose.foundation.t.f(c0Var, 0);
        if (x3VarF == null) {
            x3VarF = a.f14801a;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return x3VarF;
    }

    public final boolean c(@NotNull androidx.compose.ui.unit.w wVar, @NotNull q3 q3Var, boolean z10) {
        return (wVar != androidx.compose.ui.unit.w.Rtl || q3Var == q3.Vertical) ? !z10 : z10;
    }
}
