package w0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.compose.runtime.internal.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
public final class e extends MetricAffectingSpan {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f385823b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f385824a;

    public e(float f10) {
        this.f385824a = f10;
    }

    public final float a() {
        return this.f385824a;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint textPaint) {
        textPaint.setLetterSpacing(this.f385824a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@NotNull TextPaint textPaint) {
        textPaint.setLetterSpacing(this.f385824a);
    }
}
