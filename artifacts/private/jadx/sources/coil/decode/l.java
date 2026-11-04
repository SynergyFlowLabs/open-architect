package coil.decode;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nExifUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExifUtils.kt\ncoil/decode/ExifUtils\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,132:1\n95#2:133\n95#2:134\n43#2,3:135\n*S KotlinDebug\n*F\n+ 1 ExifUtils.kt\ncoil/decode/ExifUtils\n*L\n65#1:133\n67#1:134\n70#1:135,3\n*E\n"})
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final l f87174a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Paint f87175b = new Paint(3);

    private l() {
    }

    @NotNull
    public final i a(@Nullable String str, @NotNull okio.n nVar, @NotNull k kVar) {
        if (!m.c(kVar, str)) {
            return i.f87164d;
        }
        androidx.exifinterface.media.a aVar = new androidx.exifinterface.media.a(new j(nVar.peek().rf()));
        return new i(aVar.U(), aVar.F());
    }

    @NotNull
    public final Bitmap b(@NotNull Bitmap bitmap, @NotNull i iVar) {
        if (!iVar.b() && !m.a(iVar)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width = bitmap.getWidth() / 2.0f;
        float height = bitmap.getHeight() / 2.0f;
        if (iVar.b()) {
            matrix.postScale(-1.0f, 1.0f, width, height);
        }
        if (m.a(iVar)) {
            matrix.postRotate(iVar.a(), width, height);
        }
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        float f10 = rectF.left;
        if (f10 != 0.0f || rectF.top != 0.0f) {
            matrix.postTranslate(-f10, -rectF.top);
        }
        Bitmap bitmapCreateBitmap = m.b(iVar) ? Bitmap.createBitmap(bitmap.getHeight(), bitmap.getWidth(), coil.util.a.d(bitmap)) : Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), coil.util.a.d(bitmap));
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, matrix, f87175b);
        bitmap.recycle();
        return bitmapCreateBitmap;
    }
}
