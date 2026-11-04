package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class j6 implements androidx.compose.ui.layout.o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f29699a = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.i2.a aVar) {
        androidx.compose.ui.layout.i2.a.P(aVar, i2Var, 0, 0, 0.0f, 4, null);
        return Unit.f312394a;
    }

    @Override // androidx.compose.ui.layout.o0
    @NotNull
    public androidx.compose.ui.layout.b1 c(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull androidx.compose.ui.layout.z0 z0Var, long j10) {
        float fI1;
        float fD3 = c1Var.D3(androidx.compose.ui.unit.b.o(j10));
        if (androidx.compose.ui.unit.h.q(fD3, s70.f32766t) >= 0) {
            fI1 = d0.b3.f267681a.b();
        } else {
            fI1 = androidx.compose.ui.unit.h.q(fD3, s70.f32767u) >= 0 ? s70.f32768v : s70.I1();
        }
        int iG6 = c1Var.g6(fI1);
        final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(androidx.compose.ui.unit.b.f42658b.c(iG6, iG6));
        return androidx.compose.ui.layout.c1.h6(c1Var, i2VarP0.h1(), i2VarP0.c1(), null, new Function1() { // from class: androidx.compose.material3.i6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j6.b(i2VarP0, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }
}
