package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.w0(26)
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b0 f37528a = new b0();

    private b0() {
    }

    @oj.n
    @NotNull
    public static final androidx.compose.ui.graphics.colorspace.c a(@NotNull Bitmap bitmap) {
        androidx.compose.ui.graphics.colorspace.c cVarB;
        ColorSpace colorSpace = bitmap.getColorSpace();
        return (colorSpace == null || (cVarB = e.b(colorSpace)) == null) ? androidx.compose.ui.graphics.colorspace.k.f37611a.K() : cVarB;
    }

    @oj.n
    @NotNull
    public static final Bitmap b(int i10, int i11, int i12, boolean z10, @NotNull androidx.compose.ui.graphics.colorspace.c cVar) {
        return Bitmap.createBitmap((DisplayMetrics) null, i10, i11, j.e(i12), z10, e.a(cVar));
    }
}
