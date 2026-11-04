package androidx.compose.foundation;

import androidx.compose.runtime.k7;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class m4 {
    @k7
    @NotNull
    public static final androidx.compose.ui.a0 c(@NotNull androidx.compose.ui.a0 a0Var) {
        return androidx.compose.ui.semantics.t.e(a0Var, true, new Function1() { // from class: androidx.compose.foundation.l4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m4.g((androidx.compose.ui.semantics.e0) obj);
            }
        });
    }

    @k7
    @NotNull
    public static final androidx.compose.ui.a0 d(@NotNull androidx.compose.ui.a0 a0Var, final float f10, @NotNull final kotlin.ranges.f<Float> fVar, @androidx.annotation.g0(from = 0) final int i10) {
        return androidx.compose.ui.semantics.t.e(a0Var, true, new Function1() { // from class: androidx.compose.foundation.k4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m4.f(f10, fVar, i10, (androidx.compose.ui.semantics.e0) obj);
            }
        });
    }

    public static /* synthetic */ androidx.compose.ui.a0 e(androidx.compose.ui.a0 a0Var, float f10, kotlin.ranges.f fVar, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            fVar = kotlin.ranges.r.e(0.0f, 1.0f);
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return d(a0Var, f10, fVar, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(float f10, kotlin.ranges.f fVar, int i10, androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.J1(e0Var, new androidx.compose.ui.semantics.i(((Number) kotlin.ranges.r.N(Float.valueOf(f10), fVar)).floatValue(), fVar, i10));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.J1(e0Var, androidx.compose.ui.semantics.i.f41108d.a());
        return Unit.f312394a;
    }
}
