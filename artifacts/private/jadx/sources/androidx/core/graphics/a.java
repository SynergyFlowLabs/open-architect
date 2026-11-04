package androidx.core.graphics;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.annotation.v0;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: androidx.core.graphics.a$a, reason: collision with other inner class name */
    @w0(27)
    static class C0388a {
        private C0388a() {
        }

        static Bitmap a(Bitmap bitmap) {
            if (bitmap.getConfig() != Bitmap.Config.HARDWARE) {
                return bitmap;
            }
            Bitmap.Config configA = Bitmap.Config.ARGB_8888;
            if (Build.VERSION.SDK_INT >= 31) {
                configA = c.a(bitmap);
            }
            return bitmap.copy(configA, true);
        }

        static Bitmap b(int i10, int i11, Bitmap bitmap, boolean z10) {
            Bitmap.Config config = bitmap.getConfig();
            ColorSpace colorSpace = bitmap.getColorSpace();
            ColorSpace colorSpace2 = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
            if (z10 && !bitmap.getColorSpace().equals(colorSpace2)) {
                config = Bitmap.Config.RGBA_F16;
                colorSpace = colorSpace2;
            } else if (bitmap.getConfig() == Bitmap.Config.HARDWARE) {
                config = Bitmap.Config.ARGB_8888;
                if (Build.VERSION.SDK_INT >= 31) {
                    config = c.a(bitmap);
                }
            }
            return Bitmap.createBitmap(i10, i11, config, bitmap.hasAlpha(), colorSpace);
        }

        static boolean c(Bitmap bitmap) {
            return bitmap.getConfig() == Bitmap.Config.RGBA_F16 && bitmap.getColorSpace().equals(ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB));
        }
    }

    @w0(29)
    static class b {
        private b() {
        }

        static void a(Paint paint) {
            paint.setBlendMode(BlendMode.SRC);
        }
    }

    @w0(31)
    static class c {
        private c() {
        }

        static Bitmap.Config a(Bitmap bitmap) {
            return bitmap.getHardwareBuffer().getFormat() == 22 ? Bitmap.Config.RGBA_F16 : Bitmap.Config.ARGB_8888;
        }
    }

    private a() {
    }

    @NonNull
    public static Bitmap a(@NonNull Bitmap bitmap, int i10, int i11, @p0 Rect rect, boolean z10) {
        Bitmap bitmapB;
        int i12;
        int i13;
        if (i10 <= 0 || i11 <= 0) {
            throw new IllegalArgumentException("dstW and dstH must be > 0!");
        }
        if (rect != null && (rect.isEmpty() || rect.left < 0 || rect.right > bitmap.getWidth() || rect.top < 0 || rect.bottom > bitmap.getHeight())) {
            throw new IllegalArgumentException("srcRect must be contained by srcBm!");
        }
        Bitmap bitmapA = C0388a.a(bitmap);
        int iWidth = rect != null ? rect.width() : bitmap.getWidth();
        int iHeight = rect != null ? rect.height() : bitmap.getHeight();
        float f10 = i10 / iWidth;
        float f11 = i11 / iHeight;
        int i14 = rect != null ? rect.left : 0;
        int i15 = rect != null ? rect.top : 0;
        if (i14 == 0 && i15 == 0 && i10 == bitmap.getWidth() && i11 == bitmap.getHeight()) {
            return (bitmap.isMutable() && bitmap == bitmapA) ? bitmap.copy(bitmap.getConfig(), true) : bitmapA;
        }
        Paint paint = new Paint(1);
        paint.setFilterBitmap(true);
        b.a(paint);
        if (iWidth == i10 && iHeight == i11) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, bitmapA.getConfig());
            new Canvas(bitmapCreateBitmap).drawBitmap(bitmapA, -i14, -i15, paint);
            return bitmapCreateBitmap;
        }
        double dLog = Math.log(2.0d);
        int iCeil = (int) (f10 > 1.0f ? Math.ceil(Math.log(f10) / dLog) : Math.floor(Math.log(f10) / dLog));
        int iCeil2 = (int) (f11 > 1.0f ? Math.ceil(Math.log(f11) / dLog) : Math.floor(Math.log(f11) / dLog));
        if (!z10 || C0388a.c(bitmap)) {
            bitmapB = null;
            i12 = i14;
            i13 = 0;
        } else {
            Bitmap bitmapB2 = C0388a.b(iCeil > 0 ? e(iWidth, i10, 1, iCeil) : iWidth, iCeil2 > 0 ? e(iHeight, i11, 1, iCeil2) : iHeight, bitmap, true);
            new Canvas(bitmapB2).drawBitmap(bitmapA, -i14, -i15, paint);
            bitmapB = bitmapA;
            bitmapA = bitmapB2;
            i13 = 1;
            i15 = 0;
            i12 = 0;
        }
        Rect rect2 = new Rect(i12, i15, iWidth, iHeight);
        Rect rect3 = new Rect();
        int i16 = iCeil;
        int i17 = iCeil2;
        while (true) {
            if (i16 == 0 && i17 == 0) {
                break;
            }
            if (i16 < 0) {
                i16++;
            } else if (i16 > 0) {
                i16--;
            }
            if (i17 < 0) {
                i17++;
            } else if (i17 > 0) {
                i17--;
            }
            int i18 = i16;
            int i19 = i13;
            rect3.set(0, 0, e(iWidth, i10, i16, iCeil), e(iHeight, i11, i17, iCeil2));
            boolean z11 = i18 == 0 && i17 == 0;
            boolean z12 = bitmapB != null && bitmapB.getWidth() == i10 && bitmapB.getHeight() == i11;
            if (bitmapB == null || bitmapB == bitmap || ((z10 && !C0388a.c(bitmapB)) || (z11 && (!z12 || i19 != 0)))) {
                if (bitmapB != bitmap && bitmapB != null) {
                    bitmapB.recycle();
                }
                bitmapB = C0388a.b(e(iWidth, i10, i18 > 0 ? i19 : i18, iCeil), e(iHeight, i11, i17 > 0 ? i19 : i17, iCeil2), bitmap, z10 && !z11);
            }
            new Canvas(bitmapB).drawBitmap(bitmapA, rect2, rect3, paint);
            rect2.set(rect3);
            Bitmap bitmap2 = bitmapB;
            bitmapB = bitmapA;
            bitmapA = bitmap2;
            i16 = i18;
            i13 = i19;
        }
        if (bitmapB != bitmap && bitmapB != null) {
            bitmapB.recycle();
        }
        return bitmapA;
    }

    @v0(expression = "bitmap.getAllocationByteCount()")
    @Deprecated
    public static int b(@NonNull Bitmap bitmap) {
        return bitmap.getAllocationByteCount();
    }

    @v0(expression = "bitmap.hasMipMap()")
    @Deprecated
    public static boolean c(@NonNull Bitmap bitmap) {
        return bitmap.hasMipMap();
    }

    @v0(expression = "bitmap.setHasMipMap(hasMipMap)")
    @Deprecated
    public static void d(@NonNull Bitmap bitmap, boolean z10) {
        bitmap.setHasMipMap(z10);
    }

    @l1
    static int e(int i10, int i11, int i12, int i13) {
        if (i12 == 0) {
            return i11;
        }
        return i12 > 0 ? i10 * (1 << (i13 - i12)) : i11 << ((-i12) - 1);
    }
}
