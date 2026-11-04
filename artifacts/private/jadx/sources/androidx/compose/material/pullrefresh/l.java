package androidx.compose.material.pullrefresh;

import androidx.compose.animation.core.u0;
import androidx.compose.material.u7;
import androidx.compose.ui.a0;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.q1;
import androidx.compose.ui.graphics.r1;
import com.rabbitmq.client.k0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nPullRefreshIndicatorTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefreshIndicatorTransform.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorTransformKt\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,65:1\n202#2,8:66\n249#2,14:74\n61#3:88\n70#4:89\n22#5:90\n65#6,10:91\n*S KotlinDebug\n*F\n+ 1 PullRefreshIndicatorTransform.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorTransformKt\n*L\n45#1:66,8\n45#1:74,14\n55#1:88\n55#1:89\n55#1:90\n60#1:91,10\n*E\n"})
public final class l {
    @u7
    @NotNull
    public static final a0 c(@NotNull a0 a0Var, @NotNull final q qVar, final boolean z10) {
        return q1.a(androidx.compose.ui.draw.n.d(a0Var, new Function1() { // from class: androidx.compose.material.pullrefresh.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.e((androidx.compose.ui.graphics.drawscope.c) obj);
            }
        }), new Function1() { // from class: androidx.compose.material.pullrefresh.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.f(qVar, z10, (r1) obj);
            }
        });
    }

    public static /* synthetic */ a0 d(a0 a0Var, q qVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return c(a0Var, qVar, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(androidx.compose.ui.graphics.drawscope.c cVar) {
        int iB = p0.f38096b.b();
        androidx.compose.ui.graphics.drawscope.d dVarZ3 = cVar.Z3();
        long jD = dVarZ3.d();
        dVarZ3.f().save();
        try {
            dVarZ3.i().b(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, iB);
            cVar.E4();
            dVarZ3.f().B();
            return Unit.f312394a;
        } finally {
            dVarZ3.f().B();
            dVarZ3.g(jD);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(q qVar, boolean z10, r1 r1Var) {
        r1Var.h(qVar.j() - Float.intBitsToFloat((int) (r1Var.d() & k0.f265952a)));
        if (z10 && !qVar.l()) {
            float fA = u0.f().a(qVar.j() / qVar.m());
            if (fA < 0.0f) {
                fA = 0.0f;
            }
            if (fA > 1.0f) {
                fA = 1.0f;
            }
            r1Var.z(fA);
            r1Var.C(fA);
        }
        return Unit.f312394a;
    }
}
