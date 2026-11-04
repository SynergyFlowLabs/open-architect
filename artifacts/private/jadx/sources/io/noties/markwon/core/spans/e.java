package io.noties.markwon.core.spans;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
public class e extends MetricAffectingSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Typeface f297569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f297570b;

    @Deprecated
    public e(@NonNull Typeface typeface) {
        this(typeface, false);
    }

    @NonNull
    public static e a(@NonNull Typeface typeface) {
        return b(typeface, false);
    }

    @NonNull
    public static e b(@NonNull Typeface typeface, boolean z10) {
        return new e(typeface, z10);
    }

    private void c(@NonNull TextPaint textPaint) {
        Typeface typeface = textPaint.getTypeface();
        if (this.f297570b && typeface != null && typeface.getStyle() != 0) {
            textPaint.setTypeface(Typeface.create(this.f297569a, typeface.getStyle() | this.f297569a.getStyle()));
            return;
        }
        textPaint.setTypeface(this.f297569a);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NonNull TextPaint textPaint) {
        c(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@NonNull TextPaint textPaint) {
        c(textPaint);
    }

    e(@NonNull Typeface typeface, boolean z10) {
        this.f297569a = typeface;
        this.f297570b = z10;
    }
}
