package io.noties.markwon.core.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.NonNull;
import androidx.annotation.g0;

/* JADX INFO: loaded from: classes8.dex */
public class g extends MetricAffectingSpan implements LeadingMarginSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.noties.markwon.core.c f297571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f297572b = i.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Paint f297573c = i.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f297574d;

    public g(@NonNull io.noties.markwon.core.c cVar, @g0(from = 1, to = 6) int i10) {
        this.f297571a = cVar;
        this.f297574d = i10;
    }

    private void a(TextPaint textPaint) {
        this.f297571a.e(textPaint, this.f297574d);
    }

    public int b() {
        return this.f297574d;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        int width;
        int i17 = this.f297574d;
        if ((i17 == 1 || i17 == 2) && io.noties.markwon.utils.f.a(i16, charSequence, this)) {
            this.f297573c.set(paint);
            this.f297571a.d(this.f297573c);
            float strokeWidth = this.f297573c.getStrokeWidth();
            if (strokeWidth > 0.0f) {
                int i18 = (int) ((i14 - strokeWidth) + 0.5f);
                if (i11 > 0) {
                    width = canvas.getWidth();
                } else {
                    width = i10;
                    i10 -= canvas.getWidth();
                }
                this.f297572b.set(i10, i18, width, i14);
                canvas.drawRect(this.f297572b, this.f297573c);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z10) {
        return 0;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        a(textPaint);
    }
}
