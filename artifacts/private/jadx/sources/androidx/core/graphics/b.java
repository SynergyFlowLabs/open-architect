package androidx.core.graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Point;
import android.graphics.PointF;
import androidx.annotation.w0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class b {
    @NotNull
    public static final Bitmap a(@NotNull Bitmap bitmap, @NotNull Function1<? super Canvas, Unit> function1) {
        function1.invoke(new Canvas(bitmap));
        return bitmap;
    }

    public static final boolean b(@NotNull Bitmap bitmap, @NotNull Point point) {
        int i10;
        int width = bitmap.getWidth();
        int i11 = point.x;
        return i11 >= 0 && i11 < width && (i10 = point.y) >= 0 && i10 < bitmap.getHeight();
    }

    public static final boolean c(@NotNull Bitmap bitmap, @NotNull PointF pointF) {
        float f10 = pointF.x;
        if (f10 < 0.0f || f10 >= bitmap.getWidth()) {
            return false;
        }
        float f11 = pointF.y;
        return f11 >= 0.0f && f11 < ((float) bitmap.getHeight());
    }

    @NotNull
    public static final Bitmap d(int i10, int i11, @NotNull Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }

    @e.a({"ClassVerificationFailure"})
    @w0(26)
    @NotNull
    public static final Bitmap e(int i10, int i11, @NotNull Bitmap.Config config, boolean z10, @NotNull ColorSpace colorSpace) {
        return Bitmap.createBitmap(i10, i11, config, z10, colorSpace);
    }

    public static /* synthetic */ Bitmap f(int i10, int i11, Bitmap.Config config, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    public static /* synthetic */ Bitmap g(int i10, int i11, Bitmap.Config config, boolean z10, ColorSpace colorSpace, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        if ((i12 & 8) != 0) {
            z10 = true;
        }
        if ((i12 & 16) != 0) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        return Bitmap.createBitmap(i10, i11, config, z10, colorSpace);
    }

    public static final int h(@NotNull Bitmap bitmap, int i10, int i11) {
        return bitmap.getPixel(i10, i11);
    }

    @NotNull
    public static final Bitmap i(@NotNull Bitmap bitmap, int i10, int i11, boolean z10) {
        return Bitmap.createScaledBitmap(bitmap, i10, i11, z10);
    }

    public static /* synthetic */ Bitmap j(Bitmap bitmap, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            z10 = true;
        }
        return Bitmap.createScaledBitmap(bitmap, i10, i11, z10);
    }

    public static final void k(@NotNull Bitmap bitmap, int i10, int i11, @androidx.annotation.l int i12) {
        bitmap.setPixel(i10, i11, i12);
    }
}
