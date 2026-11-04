package io.intercom.android.sdk.utilities;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.exifinterface.media.a;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nBitmapUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BitmapUtils.kt\nio/intercom/android/sdk/utilities/BitmapUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,114:1\n1#2:115\n1863#3,2:116\n*S KotlinDebug\n*F\n+ 1 BitmapUtils.kt\nio/intercom/android/sdk/utilities/BitmapUtilsKt\n*L\n98#1:116,2\n*E\n"})
public final class BitmapUtilsKt {
    public static final int calculateInSampleSize(@NotNull BitmapFactory.Options options, int i10, int i11) {
        Intrinsics.checkNotNullParameter(options, "options");
        Pair pair = TuplesKt.to(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
        int iIntValue = ((Number) pair.component1()).intValue();
        int iIntValue2 = ((Number) pair.component2()).intValue();
        int i12 = 1;
        int i13 = 0 << 1;
        if (iIntValue <= i11 && iIntValue2 <= i10) {
            return 1;
        }
        int i14 = iIntValue / 2;
        int i15 = iIntValue2 / 2;
        while (i14 / i12 >= i11 && i15 / i12 >= i10) {
            i12 *= 2;
        }
        return i12;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006a  */
    @NotNull
    public static final Bitmap determineBitmapRotation(@NotNull Context context, @NotNull Uri uri, @NotNull Bitmap bitmap) throws IOException {
        Bitmap bitmap2;
        Bitmap bitmap3;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
        if (inputStreamOpenInputStream != null) {
            int iP = new a(inputStreamOpenInputStream).p(a.D, 0);
            Matrix matrix = new Matrix();
            int i10 = 1 | 3;
            if (iP == 3) {
                matrix.postRotate(180.0f);
            } else if (iP == 6) {
                matrix.postRotate(90.0f);
            } else if (iP == 8) {
                matrix.postRotate(270.0f);
            }
            bitmap2 = bitmap;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            if (bitmapCreateBitmap != null) {
                bitmap3 = bitmapCreateBitmap;
            }
            if (inputStreamOpenInputStream != null) {
                inputStreamOpenInputStream.close();
            }
            return bitmap3;
        }
        bitmap2 = bitmap;
        bitmap3 = bitmap2;
        if (inputStreamOpenInputStream != null) {
            inputStreamOpenInputStream.close();
        }
        return bitmap3;
    }

    @NotNull
    public static final Bitmap drawableToBitmap(@NotNull Drawable drawable, int i10, int i11) {
        Bitmap bitmapCreateBitmap;
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                Bitmap bitmap = bitmapDrawable.getBitmap();
                Intrinsics.checkNotNullExpressionValue(bitmap, "getBitmap(...)");
                return bitmap;
            }
        }
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNull(bitmapCreateBitmap);
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNull(bitmapCreateBitmap);
        }
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    @NotNull
    public static final Map<String, String> extractExifData(@NotNull Context context, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream != null) {
                try {
                    a aVar = new a(inputStreamOpenInputStream);
                    for (String str : CollectionsKt.listOf((Object[]) new String[]{a.V, a.f51446n0, a.f51454o0})) {
                        String strM = aVar.m(str);
                        if (strM != null && strM.length() > 0) {
                            linkedHashMap.put(str, strM);
                        }
                    }
                    Unit unit = Unit.f312394a;
                    c.a(inputStreamOpenInputStream, null);
                    return linkedHashMap;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        c.a(inputStreamOpenInputStream, th2);
                        throw th3;
                    }
                }
            }
        } catch (IOException e10) {
            e10.getMessage();
        } catch (NullPointerException e11) {
            e11.getMessage();
        }
        return linkedHashMap;
    }
}
