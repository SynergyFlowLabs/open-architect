package w0;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.compose.runtime.internal.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
public final class o extends MetricAffectingSpan {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f385872b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Typeface f385873a;

    public o(@NotNull Typeface typeface) {
        this.f385873a = typeface;
    }

    private final void b(Paint paint) {
        paint.setTypeface(this.f385873a);
    }

    @NotNull
    public final Typeface a() {
        return this.f385873a;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint textPaint) {
        b(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@NotNull TextPaint textPaint) {
        b(textPaint);
    }
}
