package androidx.compose.material;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class ia implements androidx.compose.ui.layout.o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f23123a;

    public /* synthetic */ ia(long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(int i10, androidx.compose.ui.layout.i2 i2Var, int i11, androidx.compose.ui.layout.i2.a aVar) {
        androidx.compose.ui.layout.i2.a.P(aVar, i2Var, kotlin.math.b.L0((i10 - i2Var.h1()) / 2.0f), kotlin.math.b.L0((i11 - i2Var.c1()) / 2.0f), 0.0f, 4, null);
        return Unit.f312394a;
    }

    public final long b() {
        return this.f23123a;
    }

    @Override // androidx.compose.ui.layout.o0
    @NotNull
    public androidx.compose.ui.layout.b1 c(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull androidx.compose.ui.layout.z0 z0Var, long j10) {
        final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(j10);
        final int iMax = Math.max(i2VarP0.h1(), c1Var.g6(androidx.compose.ui.unit.l.p(this.f23123a)));
        final int iMax2 = Math.max(i2VarP0.c1(), c1Var.g6(androidx.compose.ui.unit.l.m(this.f23123a)));
        return androidx.compose.ui.layout.c1.h6(c1Var, iMax, iMax2, null, new Function1() { // from class: androidx.compose.material.ha
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ia.d(iMax, i2VarP0, iMax2, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    public boolean equals(@Nullable Object obj) {
        ia iaVar = obj instanceof ia ? (ia) obj : null;
        if (iaVar == null) {
            return false;
        }
        return androidx.compose.ui.unit.l.l(this.f23123a, iaVar.f23123a);
    }

    public int hashCode() {
        return androidx.compose.ui.unit.l.r(this.f23123a);
    }

    private ia(long j10) {
        this.f23123a = j10;
    }
}
