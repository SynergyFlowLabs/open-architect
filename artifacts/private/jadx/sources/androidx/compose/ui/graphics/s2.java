package androidx.compose.ui.graphics;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface s2 {

    public static final class a {
    }

    static /* synthetic */ boolean c(s2 s2Var, float f10, float f11, k2 k2Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSegment");
        }
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        return s2Var.b(f10, f11, k2Var, z10);
    }

    long a(float f10);

    boolean b(float f10, float f11, @NotNull k2 k2Var, boolean z10);

    void d(@Nullable k2 k2Var, boolean z10);

    long e(float f10);

    float getLength();
}
