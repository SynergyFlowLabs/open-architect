package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class u4 extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.g0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f16472s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f16473t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f16474v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final boolean f16475w;

    public /* synthetic */ u4(float f10, float f11, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z9(u4 u4Var, androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.i2.a aVar) {
        if (u4Var.f16474v) {
            androidx.compose.ui.layout.i2.a.e0(aVar, i2Var, aVar.g6(u4Var.f16472s), aVar.g6(u4Var.f16473t), 0.0f, 4, null);
        } else {
            androidx.compose.ui.layout.i2.a.P(aVar, i2Var, aVar.g6(u4Var.f16472s), aVar.g6(u4Var.f16473t), 0.0f, 4, null);
        }
        return Unit.f312394a;
    }

    public final void A9(boolean z10) {
        this.f16474v = z10;
    }

    public final void B9(float f10) {
        this.f16472s = f10;
    }

    public final void C9(float f10) {
        this.f16473t = f10;
    }

    public final void D9(float f10, float f11, boolean z10) {
        if (!androidx.compose.ui.unit.h.x(this.f16472s, f10) || !androidx.compose.ui.unit.h.x(this.f16473t, f11) || this.f16474v != z10) {
            androidx.compose.ui.node.j0.c(this);
        }
        this.f16472s = f10;
        this.f16473t = f11;
        this.f16474v = z10;
    }

    @Override // androidx.compose.ui.a0.d
    public boolean X8() {
        return this.f16475w;
    }

    @Override // androidx.compose.ui.node.g0
    @NotNull
    public androidx.compose.ui.layout.b1 c(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull androidx.compose.ui.layout.z0 z0Var, long j10) {
        final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(j10);
        return androidx.compose.ui.layout.c1.h6(c1Var, i2VarP0.h1(), i2VarP0.c1(), null, new Function1() { // from class: androidx.compose.foundation.layout.t4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u4.z9(this.f16436a, i2VarP0, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    public final boolean w9() {
        return this.f16474v;
    }

    public final float x9() {
        return this.f16472s;
    }

    public final float y9() {
        return this.f16473t;
    }

    private u4(float f10, float f11, boolean z10) {
        this.f16472s = f10;
        this.f16473t = f11;
        this.f16474v = z10;
    }
}
