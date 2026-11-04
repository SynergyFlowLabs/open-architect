package androidx.compose.ui.layout;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class t0 extends i2.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.node.u0 f39547c;

    public t0(@NotNull androidx.compose.ui.node.u0 u0Var) {
        this.f39547c = u0Var;
    }

    @Override // androidx.compose.ui.layout.i2.a
    public float I(@NotNull s2 s2Var, float f10) {
        return s2Var.b() != null ? s2Var.b().invoke(this, Float.valueOf(f10)).floatValue() : this.f39547c.R1(s2Var, f10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.i2.a
    @NotNull
    public androidx.compose.ui.unit.w J() {
        return this.f39547c.getLayoutDirection();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.i2.a
    public int K() {
        return this.f39547c.b0();
    }

    @Override // androidx.compose.ui.layout.i2.a, androidx.compose.ui.unit.d
    public float getDensity() {
        return this.f39547c.getDensity();
    }

    @Override // androidx.compose.ui.layout.i2.a, androidx.compose.ui.unit.n
    public float m0() {
        return this.f39547c.m0();
    }

    @Override // androidx.compose.ui.layout.i2.a
    @Nullable
    public g0 n() {
        g0 g0VarN = this.f39547c.B2() ? null : this.f39547c.n();
        if (g0VarN == null) {
            this.f39547c.i4().k0().H();
        }
        return g0VarN;
    }
}
