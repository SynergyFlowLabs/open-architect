package coil.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBitmaps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Bitmaps.kt\ncoil/util/-Bitmaps\n+ 2 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n*L\n1#1,56:1\n28#2:57\n*S KotlinDebug\n*F\n+ 1 Bitmaps.kt\ncoil/util/-Bitmaps\n*L\n50#1:57\n*E\n"})
@oj.i(name = "-Bitmaps")
public final class a {
    public static final int a(@NotNull Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                return bitmap.getWidth() * bitmap.getHeight() * b(bitmap.getConfig());
            }
        }
        throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
    }

    public static final int b(@Nullable Bitmap.Config config) {
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) {
            return 2;
        }
        return config == Bitmap.Config.RGBA_F16 ? 8 : 4;
    }

    public static /* synthetic */ void c(Bitmap.Config config) {
    }

    @NotNull
    public static final Bitmap.Config d(@NotNull Bitmap bitmap) {
        Bitmap.Config config = bitmap.getConfig();
        return config == null ? Bitmap.Config.ARGB_8888 : config;
    }

    public static /* synthetic */ void e(Bitmap bitmap) {
    }

    public static final boolean f(@NotNull Bitmap.Config config) {
        if (config != Bitmap.Config.HARDWARE) {
            return false;
        }
        int i10 = 2 >> 1;
        return true;
    }

    @NotNull
    public static final BitmapDrawable g(@NotNull Bitmap bitmap, @NotNull Context context) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    @NotNull
    public static final Bitmap.Config h(@Nullable Bitmap.Config config) {
        return (config == null || f(config)) ? Bitmap.Config.ARGB_8888 : config;
    }
}
