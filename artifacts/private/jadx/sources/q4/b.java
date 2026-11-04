package q4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import coil.size.i;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nCircleCropTransformation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CircleCropTransformation.kt\ncoil/transform/CircleCropTransformation\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,41:1\n95#2:42\n43#2,3:43\n*S KotlinDebug\n*F\n+ 1 CircleCropTransformation.kt\ncoil/transform/CircleCropTransformation\n*L\n27#1:42\n28#1:43,3\n*E\n"})
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f350241a = b.class.getName();

    public boolean equals(@Nullable Object obj) {
        return obj instanceof b;
    }

    @Override // q4.e
    @NotNull
    public String getCacheKey() {
        return this.f350241a;
    }

    public int hashCode() {
        return b.class.hashCode();
    }

    @Override // q4.e
    @Nullable
    public Object transform(@NotNull Bitmap bitmap, @NotNull i iVar, @NotNull kotlin.coroutines.d<? super Bitmap> dVar) {
        Paint paint = new Paint(3);
        int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
        float f10 = iMin / 2.0f;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, coil.util.a.d(bitmap));
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawCircle(f10, f10, f10, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, f10 - (bitmap.getWidth() / 2.0f), f10 - (bitmap.getHeight() / 2.0f), paint);
        return bitmapCreateBitmap;
    }
}
