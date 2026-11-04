package androidx.compose.foundation;

import androidx.compose.runtime.k7;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nBasicMarquee.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/BasicMarqueeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,535:1\n1#2:536\n*E\n"})
public final class a0 {
    @NotNull
    public static final p3 b(final float f10) {
        return new p3() { // from class: androidx.compose.foundation.z
            @Override // androidx.compose.foundation.p3
            public final int a(androidx.compose.ui.unit.d dVar, int i10, int i11) {
                return a0.c(f10, dVar, i10, i11);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(float f10, androidx.compose.ui.unit.d dVar, int i10, int i11) {
        return dVar.g6(f10);
    }

    @k7
    @NotNull
    public static final androidx.compose.ui.a0 e(@NotNull androidx.compose.ui.a0 a0Var, int i10, int i11, int i12, int i13, @NotNull p3 p3Var, float f10) {
        return a0Var.B2(new MarqueeModifierElement(i10, i11, i12, i13, p3Var, f10, null));
    }

    public static /* synthetic */ androidx.compose.ui.a0 f(androidx.compose.ui.a0 a0Var, int i10, int i11, int i12, int i13, p3 p3Var, float f10, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = i3.f15609a.a();
        }
        if ((i14 & 2) != 0) {
            i11 = h3.f15511b.a();
        }
        if ((i14 & 4) != 0) {
            i12 = i3.f15609a.c();
        }
        if ((i14 & 8) != 0) {
            i13 = h3.f(i11, h3.f15511b.a()) ? i12 : 0;
        }
        if ((i14 & 16) != 0) {
            p3Var = i3.f15609a.e();
        }
        if ((i14 & 32) != 0) {
            f10 = i3.f15609a.f();
        }
        return e(a0Var, i10, i11, i12, i13, p3Var, f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.core.o<Float> g(int i10, float f10, int i11, int i12, float f11, androidx.compose.ui.unit.d dVar) {
        androidx.compose.animation.core.y3<Float> y3VarH = h(Math.abs(dVar.S7(f11)), f10, i12);
        long jD = androidx.compose.animation.core.t2.d((-i12) + i11, 0, 2, null);
        return i10 == Integer.MAX_VALUE ? androidx.compose.animation.core.p.g(y3VarH, null, jD, 2, null) : androidx.compose.animation.core.p.n(i10, y3VarH, null, jD, 4, null);
    }

    private static final androidx.compose.animation.core.y3<Float> h(float f10, float f11, int i10) {
        return androidx.compose.animation.core.p.s((int) Math.ceil(f11 / (f10 / 1000.0f)), i10, androidx.compose.animation.core.u0.e());
    }
}
