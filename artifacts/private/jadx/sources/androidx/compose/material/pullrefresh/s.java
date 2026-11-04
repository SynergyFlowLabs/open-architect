package androidx.compose.material.pullrefresh;

import androidx.compose.material.u7;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.w6;
import androidx.compose.ui.platform.q1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nPullRefreshState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefreshState.kt\nandroidx/compose/material/pullrefresh/PullRefreshStateKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,241:1\n113#2:242\n1#3:243\n607#4:244\n604#4,6:245\n1282#5,3:251\n1285#5,3:255\n1282#5,6:259\n1282#5,6:265\n605#6:254\n75#7:258\n*S KotlinDebug\n*F\n+ 1 PullRefreshState.kt\nandroidx/compose/material/pullrefresh/PullRefreshStateKt\n*L\n63#1:242\n65#1:244\n65#1:245,6\n65#1:251,3\n65#1:255,3\n76#1:259,6\n78#1:265,6\n65#1:254\n70#1:258\n*E\n"})
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f24359a = 0.5f;

    @androidx.compose.runtime.o
    @u7
    @NotNull
    public static final q b(final boolean z10, @NotNull Function0<Unit> function0, float f10, float f11, @Nullable c0 c0Var, int i10, int i11) {
        if ((i11 & 4) != 0) {
            f10 = b.f24291a.a();
        }
        if ((i11 & 8) != 0) {
            f11 = b.f24291a.b();
        }
        if (m0.l0()) {
            m0.A0(-174977512, i10, -1, "androidx.compose.material.pullrefresh.rememberPullRefreshState (PullRefreshState.kt:61)");
        }
        if (androidx.compose.ui.unit.h.q(f10, androidx.compose.ui.unit.h.r(0)) <= 0) {
            throw new IllegalArgumentException("The refresh trigger must be greater than zero!");
        }
        Object objI0 = c0Var.i0();
        c0.a aVar = c0.f35327a;
        if (objI0 == aVar.a()) {
            objI0 = b2.o(kotlin.coroutines.h.f312451a, c0Var);
            c0Var.Y(objI0);
        }
        s0 s0Var = (s0) objI0;
        n7 n7VarW = w6.w(function0, c0Var, (i10 >> 3) & 14);
        final i1.e eVar = new i1.e();
        final i1.e eVar2 = new i1.e();
        androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) c0Var.W(q1.m());
        eVar.f312748a = dVar.S7(f10);
        eVar2.f312748a = dVar.S7(f11);
        boolean zD = c0Var.D(s0Var);
        Object objI1 = c0Var.i0();
        if (zD || objI1 == aVar.a()) {
            objI1 = new q(s0Var, n7VarW, eVar2.f312748a, eVar.f312748a);
            c0Var.Y(objI1);
        }
        final q qVar = (q) objI1;
        boolean zK0 = c0Var.k0(qVar) | ((((i10 & 14) ^ 6) > 4 && c0Var.G(z10)) || (i10 & 6) == 4) | c0Var.I(eVar.f312748a) | c0Var.I(eVar2.f312748a);
        Object objI2 = c0Var.i0();
        if (zK0 || objI2 == aVar.a()) {
            objI2 = new Function0() { // from class: androidx.compose.material.pullrefresh.r
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return s.c(qVar, z10, eVar, eVar2);
                }
            };
            c0Var.Y(objI2);
        }
        b2.m((Function0) objI2, c0Var, 0);
        if (m0.l0()) {
            m0.z0();
        }
        return qVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(q qVar, boolean z10, i1.e eVar, i1.e eVar2) {
        qVar.u(z10);
        qVar.w(eVar.f312748a);
        qVar.v(eVar2.f312748a);
        return Unit.f312394a;
    }
}
