package androidx.compose.foundation.pager;

import androidx.compose.animation.core.j5;
import androidx.compose.foundation.gestures.e5;
import androidx.compose.foundation.gestures.q3;
import androidx.compose.ui.platform.q1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerDefaults\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,592:1\n97#2,4:593\n75#3:597\n75#3:598\n1282#4,6:599\n1282#4,6:605\n*S KotlinDebug\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerDefaults\n*L\n385#1:593,4\n389#1:597\n390#1:598\n391#1:599,6\n434#1:605,6\n*E\n"})
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final v f18478a = new v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f18479b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f18480c = 0;

    private v() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float c(i1 i1Var, androidx.compose.ui.unit.w wVar, float f10, float f11, float f12, float f13) {
        return androidx.compose.foundation.gestures.snapping.g.c(i1Var, wVar, f10, f11, f12, f13);
    }

    @androidx.compose.runtime.o
    @NotNull
    public final e5 b(@NotNull final i1 i1Var, @Nullable b1 b1Var, @Nullable androidx.compose.animation.core.g0<Float> g0Var, @Nullable androidx.compose.animation.core.o<Float> oVar, @androidx.annotation.x(from = 0.0d, to = 1.0d) final float f10, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        boolean z10 = true;
        if ((i11 & 2) != 0) {
            b1Var = b1.f18186a.a(1);
        }
        if ((i11 & 4) != 0) {
            g0Var = androidx.compose.animation.n1.b(c0Var, 0);
        }
        if ((i11 & 8) != 0) {
            oVar = androidx.compose.animation.core.p.r(0.0f, 400.0f, Float.valueOf(j5.b(kotlin.jvm.internal.i0.f312739a)), 1, null);
        }
        if ((i11 & 16) != 0) {
            f10 = 0.5f;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1559769181, i10, -1, "androidx.compose.foundation.pager.PagerDefaults.flingBehavior (Pager.kt:383)");
        }
        if (!(0.0f <= f10 && f10 <= 1.0f)) {
            androidx.compose.foundation.internal.e.g("snapPositionalThreshold should be a number between 0 and 1. You've specified " + f10);
        }
        androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) c0Var.W(q1.m());
        final androidx.compose.ui.unit.w wVar = (androidx.compose.ui.unit.w) c0Var.W(q1.u());
        boolean zD = ((((i10 & 14) ^ 6) > 4 && c0Var.D(i1Var)) || (i10 & 6) == 4) | c0Var.D(g0Var) | c0Var.D(oVar);
        if ((((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) <= 32 || !c0Var.D(b1Var)) && (i10 & 48) != 32) {
            z10 = false;
        }
        boolean zD2 = c0Var.D(dVar) | zD | z10 | c0Var.K(wVar.ordinal());
        Object objI0 = c0Var.i0();
        if (zD2 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = androidx.compose.foundation.gestures.snapping.m.t(androidx.compose.foundation.gestures.snapping.g.a(i1Var, b1Var, new pj.n() { // from class: androidx.compose.foundation.pager.u
                @Override // pj.n
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return Float.valueOf(v.c(i1Var, wVar, f10, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), ((Float) obj3).floatValue()));
                }
            }), g0Var, oVar);
            c0Var.Y(objI0);
        }
        e5 e5Var = (e5) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return e5Var;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final androidx.compose.ui.input.nestedscroll.a d(@NotNull i1 i1Var, @NotNull q3 q3Var, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(877583120, i10, -1, "androidx.compose.foundation.pager.PagerDefaults.pageNestedScrollConnection (Pager.kt:432)");
        }
        boolean z10 = ((((i10 & 14) ^ 6) > 4 && c0Var.D(i1Var)) || (i10 & 6) == 4) | ((((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var.K(q3Var.ordinal())) || (i10 & 48) == 32);
        Object objI0 = c0Var.i0();
        if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new a(i1Var, q3Var);
            c0Var.Y(objI0);
        }
        a aVar = (a) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return aVar;
    }
}
