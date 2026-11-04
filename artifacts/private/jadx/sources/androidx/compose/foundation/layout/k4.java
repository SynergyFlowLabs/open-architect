package androidx.compose.foundation.layout;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class k4 extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.a2 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f16189v = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f16190s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f16191t;

    public k4(float f10, boolean z10) {
        this.f16190s = f10;
        this.f16191t = z10;
    }

    public final boolean v9() {
        return this.f16191t;
    }

    public final float w9() {
        return this.f16190s;
    }

    @Override // androidx.compose.ui.node.a2
    @NotNull
    /* JADX INFO: renamed from: x9, reason: merged with bridge method [inline-methods] */
    public t5 V(@NotNull androidx.compose.ui.unit.d dVar, @Nullable Object obj) {
        t5 t5Var = obj instanceof t5 ? (t5) obj : null;
        if (t5Var == null) {
            boolean z10 = false & false;
            t5Var = new t5(0.0f, false, null, null, 15, null);
        }
        t5Var.n(this.f16190s);
        t5Var.l(this.f16191t);
        return t5Var;
    }

    public final void y9(boolean z10) {
        this.f16191t = z10;
    }

    public final void z9(float f10) {
        this.f16190s = f10;
    }
}
