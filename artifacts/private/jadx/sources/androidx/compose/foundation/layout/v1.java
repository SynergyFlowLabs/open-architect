package androidx.compose.foundation.layout;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class v1 extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.a2 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f16485t = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f16486s;

    public v1(float f10) {
        this.f16486s = f10;
    }

    public final float v9() {
        return this.f16486s;
    }

    @Override // androidx.compose.ui.node.a2
    @NotNull
    /* JADX INFO: renamed from: w9, reason: merged with bridge method [inline-methods] */
    public t5 V(@NotNull androidx.compose.ui.unit.d dVar, @Nullable Object obj) {
        t5 t5Var = obj instanceof t5 ? (t5) obj : null;
        if (t5Var == null) {
            t5Var = new t5(0.0f, false, null, null, 15, null);
        }
        l2 l2VarI = t5Var.i();
        if (l2VarI == null) {
            l2VarI = new l2(this.f16486s);
        }
        t5Var.m(l2VarI);
        l2 l2VarI2 = t5Var.i();
        Intrinsics.checkNotNull(l2VarI2);
        l2VarI2.e(this.f16486s);
        return t5Var;
    }

    public final void x9(float f10) {
        this.f16486s = f10;
    }
}
