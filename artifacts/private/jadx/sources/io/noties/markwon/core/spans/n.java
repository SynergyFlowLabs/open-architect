package io.noties.markwon.core.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
public class n implements LeadingMarginSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.noties.markwon.core.c f297585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f297586b = i.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Paint f297587c = i.a();

    public n(@NonNull io.noties.markwon.core.c cVar) {
        this.f297585a = cVar;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        int width;
        int i17 = i12 + ((i14 - i12) / 2);
        this.f297587c.set(paint);
        this.f297585a.i(this.f297587c);
        int strokeWidth = (int) ((((int) (this.f297587c.getStrokeWidth() + 0.5f)) / 2.0f) + 0.5f);
        if (i11 > 0) {
            width = canvas.getWidth();
        } else {
            width = i10;
            i10 -= canvas.getWidth();
        }
        this.f297586b.set(i10, i17 - strokeWidth, width, i17 + strokeWidth);
        canvas.drawRect(this.f297586b, this.f297587c);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z10) {
        return 0;
    }
}
