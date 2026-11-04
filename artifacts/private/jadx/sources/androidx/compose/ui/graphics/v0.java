package androidx.compose.ui.graphics;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.w0(26)
final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final v0 f38262a = new v0();

    private v0() {
    }

    @NotNull
    public final float[] a(@NotNull ColorMatrixColorFilter colorMatrixColorFilter) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrixColorFilter.getColorMatrix(colorMatrix);
        return t0.b(colorMatrix.getArray());
    }
}
