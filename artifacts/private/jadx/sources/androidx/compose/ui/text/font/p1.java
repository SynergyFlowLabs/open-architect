package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.w0(26)
final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final p1 f41684a = new p1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static ThreadLocal<Paint> f41685b = new ThreadLocal<>();

    private p1() {
    }

    @androidx.compose.ui.text.v
    @Nullable
    public final Typeface a(@Nullable Typeface typeface, @NotNull u0.e eVar, @NotNull Context context) {
        if (typeface == null) {
            return null;
        }
        if (eVar.b().isEmpty()) {
            return typeface;
        }
        Paint paint = f41685b.get();
        if (paint == null) {
            paint = new Paint();
            f41685b.set(paint);
        }
        paint.setFontVariationSettings(null);
        paint.setTypeface(typeface);
        paint.setFontVariationSettings(f1.e(eVar, context));
        return paint.getTypeface();
    }
}
