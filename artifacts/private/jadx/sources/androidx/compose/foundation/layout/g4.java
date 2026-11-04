package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
abstract class g4 extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.g0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y9(androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.i2.a aVar) {
        androidx.compose.ui.layout.i2.a.k0(aVar, i2Var, androidx.compose.ui.unit.q.f42709b.b(), 0.0f, 2, null);
        return Unit.f312394a;
    }

    @Override // androidx.compose.ui.node.g0
    public int U(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return yVar.L0(i10);
    }

    @Override // androidx.compose.ui.node.g0
    public int W(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return yVar.M0(i10);
    }

    @Override // androidx.compose.ui.node.g0
    @NotNull
    public final androidx.compose.ui.layout.b1 c(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull androidx.compose.ui.layout.z0 z0Var, long j10) {
        long jW9 = w9(c1Var, z0Var, j10);
        if (x9()) {
            jW9 = androidx.compose.ui.unit.c.g(j10, jW9);
        }
        final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(jW9);
        return androidx.compose.ui.layout.c1.h6(c1Var, i2VarP0.h1(), i2VarP0.c1(), null, new Function1() { // from class: androidx.compose.foundation.layout.f4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g4.y9(i2VarP0, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    public int e0(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return yVar.p0(i10);
    }

    public int k0(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return yVar.D0(i10);
    }

    public abstract long w9(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull androidx.compose.ui.layout.z0 z0Var, long j10);

    public abstract boolean x9();
}
