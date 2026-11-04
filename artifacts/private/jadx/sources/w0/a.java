package w0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.compose.runtime.internal.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
public class a extends MetricAffectingSpan {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f385816b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f385817a;

    public a(float f10) {
        this.f385817a = f10;
    }

    public final float a() {
        return this.f385817a;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint textPaint) {
        textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f385817a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@NotNull TextPaint textPaint) {
        textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f385817a);
    }
}
