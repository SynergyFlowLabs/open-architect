package w0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.compose.runtime.internal.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
public class m extends MetricAffectingSpan {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f385867b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f385868a;

    public m(float f10) {
        this.f385868a = f10;
    }

    public final float a() {
        return this.f385868a;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint textPaint) {
        textPaint.setTextSkewX(this.f385868a + textPaint.getTextSkewX());
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@NotNull TextPaint textPaint) {
        textPaint.setTextSkewX(this.f385868a + textPaint.getTextSkewX());
    }
}
