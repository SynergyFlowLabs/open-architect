package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface b3 extends r5 {
    /* JADX INFO: Access modifiers changed from: private */
    static Unit n(int[] iArr, int i10, int i11, int i12, androidx.compose.ui.layout.i2[] i2VarArr, b3 b3Var, int i13, androidx.compose.ui.unit.w wVar, int i14, int[] iArr2, androidx.compose.ui.layout.i2.a aVar) {
        int i15 = iArr != null ? iArr[i10] : 0;
        for (int i16 = i11; i16 < i12; i16++) {
            androidx.compose.ui.layout.i2 i2Var = i2VarArr[i16];
            Intrinsics.checkNotNull(i2Var);
            int iR = b3Var.r(i2Var, i13, wVar, i14) + i15;
            if (b3Var.i()) {
                androidx.compose.ui.layout.i2.a.P(aVar, i2Var, iArr2[i16 - i11], iR, 0.0f, 4, null);
            } else {
                androidx.compose.ui.layout.i2.a.P(aVar, i2Var, iR, iArr2[i16 - i11], 0.0f, 4, null);
            }
        }
        return Unit.f312394a;
    }

    @Override // androidx.compose.foundation.layout.r5
    default long f(int i10, int i11, int i12, int i13, boolean z10) {
        return i() ? u5.b(z10, i10, i11, i12, i13) : j0.c(z10, i10, i11, i12, i13);
    }

    @Override // androidx.compose.foundation.layout.r5
    default void g(int i10, @NotNull int[] iArr, @NotNull int[] iArr2, @NotNull androidx.compose.ui.layout.c1 c1Var) {
        if (i()) {
            u().c(c1Var, i10, iArr, c1Var.getLayoutDirection(), iArr2);
        } else {
            q().arrange(c1Var, i10, iArr, iArr2);
        }
    }

    @Override // androidx.compose.foundation.layout.r5
    default int h(@NotNull androidx.compose.ui.layout.i2 i2Var) {
        return i() ? i2Var.q0() : i2Var.b0();
    }

    boolean i();

    @Override // androidx.compose.foundation.layout.r5
    @NotNull
    default androidx.compose.ui.layout.b1 j(@NotNull final androidx.compose.ui.layout.i2[] i2VarArr, @NotNull androidx.compose.ui.layout.c1 c1Var, final int i10, @NotNull final int[] iArr, int i11, final int i12, @Nullable final int[] iArr2, final int i13, final int i14, final int i15) {
        int i16;
        int i17;
        if (i()) {
            i17 = i11;
            i16 = i12;
        } else {
            i16 = i11;
            i17 = i12;
        }
        final androidx.compose.ui.unit.w layoutDirection = i() ? androidx.compose.ui.unit.w.Ltr : c1Var.getLayoutDirection();
        return androidx.compose.ui.layout.c1.h6(c1Var, i17, i16, null, new Function1() { // from class: androidx.compose.foundation.layout.a3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b3.n(iArr2, i13, i14, i15, i2VarArr, this, i12, layoutDirection, i10, iArr, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    @Override // androidx.compose.foundation.layout.r5
    default int k(@NotNull androidx.compose.ui.layout.i2 i2Var) {
        return i() ? i2Var.b0() : i2Var.q0();
    }

    @NotNull
    k1 l();

    @NotNull
    q.m q();

    default int r(@NotNull androidx.compose.ui.layout.i2 i2Var, int i10, @NotNull androidx.compose.ui.unit.w wVar, int i11) {
        k1 k1VarL;
        t5 t5VarD = q5.d(i2Var);
        if (t5VarD == null || (k1VarL = t5VarD.g()) == null) {
            k1VarL = l();
        }
        return k1VarL.d(i10 - h(i2Var), wVar, i2Var, i11);
    }

    @NotNull
    q.e u();
}
