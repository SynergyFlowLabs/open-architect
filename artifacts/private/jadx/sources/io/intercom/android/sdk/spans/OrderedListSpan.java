package io.intercom.android.sdk.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: loaded from: classes13.dex */
public class OrderedListSpan implements LeadingMarginSpan {
    private final int gapWidth;
    private final String number;

    public OrderedListSpan(int i10, String str) {
        this.gapWidth = i10;
        this.number = str;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        if (((Spanned) charSequence).getSpanStart(this) == i15) {
            Paint.Style style = paint.getStyle();
            paint.setStyle(Paint.Style.FILL);
            float fMeasureText = i10;
            if (i11 == -1) {
                fMeasureText -= paint.measureText(this.number);
            }
            canvas.drawText(this.number + " ", fMeasureText, i13, paint);
            paint.setStyle(style);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z10) {
        return (int) (new Paint().measureText(this.number) + this.gapWidth);
    }
}
