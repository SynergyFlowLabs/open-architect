package io.noties.markwon.core.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
public class c extends MetricAffectingSpan implements LeadingMarginSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.noties.markwon.core.c f297565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f297566b = i.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Paint f297567c = i.a();

    public c(@NonNull io.noties.markwon.core.c cVar) {
        this.f297565a = cVar;
    }

    private void a(TextPaint textPaint) {
        this.f297565a.b(textPaint);
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        int width;
        this.f297567c.setStyle(Paint.Style.FILL);
        this.f297567c.setColor(this.f297565a.r(paint));
        if (i11 > 0) {
            width = canvas.getWidth();
        } else {
            i10 -= canvas.getWidth();
            width = i10;
        }
        this.f297566b.set(i10, i12, width, i14);
        canvas.drawRect(this.f297566b, this.f297567c);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z10) {
        return this.f297565a.s();
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
