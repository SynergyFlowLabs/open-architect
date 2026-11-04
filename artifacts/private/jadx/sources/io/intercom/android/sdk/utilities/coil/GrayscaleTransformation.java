package io.intercom.android.sdk.utilities.coil;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import androidx.compose.runtime.internal.w0;
import coil.size.i;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q4.e;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nGrayscaleTransformation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrayscaleTransformation.kt\nio/intercom/android/sdk/utilities/coil/GrayscaleTransformation\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,41:1\n42#2,3:42\n1#3:45\n*S KotlinDebug\n*F\n+ 1 GrayscaleTransformation.kt\nio/intercom/android/sdk/utilities/coil/GrayscaleTransformation\n*L\n24#1:42,3\n*E\n"})
public final class GrayscaleTransformation implements e {
    public static final int $stable = 0;

    @NotNull
    private static final ColorMatrixColorFilter COLOR_FILTER;

    @NotNull
    private static final Companion Companion = new Companion(null);

    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ColorMatrixColorFilter getCOLOR_FILTER() {
            return GrayscaleTransformation.COLOR_FILTER;
        }

        private Companion() {
        }
    }

    static {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        COLOR_FILTER = new ColorMatrixColorFilter(colorMatrix);
    }

    public boolean equals(@Nullable Object obj) {
        return obj instanceof GrayscaleTransformation;
    }

    @Override // q4.e
    @NotNull
    public String getCacheKey() {
        String name = GrayscaleTransformation.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    public int hashCode() {
        return GrayscaleTransformation.class.hashCode();
    }

    @NotNull
    public String toString() {
        return "GrayscaleTransformation()";
    }

    @Override // q4.e
    @Nullable
    public Object transform(@NotNull Bitmap bitmap, @NotNull i iVar, @NotNull d<? super Bitmap> dVar) {
        Paint paint = new Paint(3);
        paint.setColorFilter(COLOR_FILTER);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, config);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }
}
