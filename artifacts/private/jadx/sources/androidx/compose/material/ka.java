package androidx.compose.material;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class ka extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.h, androidx.compose.ui.node.g0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f23504s = androidx.compose.ui.a0.d.f36940o;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w9(int i10, androidx.compose.ui.layout.i2 i2Var, int i11, androidx.compose.ui.layout.i2.a aVar) {
        androidx.compose.ui.layout.i2.a.P(aVar, i2Var, kotlin.math.b.L0((i10 - i2Var.h1()) / 2.0f), kotlin.math.b.L0((i11 - i2Var.c1()) / 2.0f), 0.0f, 4, null);
        return Unit.f312394a;
    }

    @Override // androidx.compose.ui.node.g0
    @NotNull
    public androidx.compose.ui.layout.b1 c(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull androidx.compose.ui.layout.z0 z0Var, long j10) {
        boolean z10 = a9() && ((Boolean) androidx.compose.ui.node.i.a(this, l9.d())).booleanValue();
        long j11 = l9.f23668c;
        final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(j10);
        final int iMax = z10 ? Math.max(i2VarP0.h1(), c1Var.g6(androidx.compose.ui.unit.l.p(j11))) : i2VarP0.h1();
        final int iMax2 = z10 ? Math.max(i2VarP0.c1(), c1Var.g6(androidx.compose.ui.unit.l.m(j11))) : i2VarP0.c1();
        return androidx.compose.ui.layout.c1.h6(c1Var, iMax, iMax2, null, new Function1() { // from class: androidx.compose.material.ja
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ka.w9(iMax, i2VarP0, iMax2, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }
}
