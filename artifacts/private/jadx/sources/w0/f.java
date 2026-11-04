package w0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.t0;
import androidx.compose.runtime.internal.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
public final class f extends MetricAffectingSpan {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f385825b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f385826a;

    public f(@t0 float f10) {
        this.f385826a = f10;
    }

    private final void b(TextPaint textPaint) {
        float textSize = textPaint.getTextSize() * textPaint.getTextScaleX();
        if (textSize == 0.0f) {
            return;
        }
        textPaint.setLetterSpacing(this.f385826a / textSize);
    }

    public final float a() {
        return this.f385826a;
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
