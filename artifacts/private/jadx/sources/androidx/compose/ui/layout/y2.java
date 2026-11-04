package androidx.compose.ui.layout;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
final class y2 extends i2.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f39594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.unit.w f39595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f39596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f39597f;

    public y2(int i10, @NotNull androidx.compose.ui.unit.w wVar, float f10, float f11) {
        this.f39594c = i10;
        this.f39595d = wVar;
        this.f39596e = f10;
        this.f39597f = f11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.i2.a
    @NotNull
    public androidx.compose.ui.unit.w J() {
        return this.f39595d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.i2.a
    public int K() {
        return this.f39594c;
    }

    @Override // androidx.compose.ui.layout.i2.a, androidx.compose.ui.unit.d
    public float getDensity() {
        return this.f39596e;
    }

    @Override // androidx.compose.ui.layout.i2.a, androidx.compose.ui.unit.n
    public float m0() {
        return this.f39597f;
    }
}
