package io.intercom.android.sdk.spans;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;

/* JADX INFO: loaded from: classes13.dex */
public class UnorderedListSpan implements LeadingMarginSpan {
    private static final int BULLET_RADIUS_IN_DP = 2;
    private static final int INDENT_IN_DP = 5;
    private final int bulletRadius;
    private final int gapWidth;
    private final int indent;

    public UnorderedListSpan(int i10, Context context) {
        this.gapWidth = i10;
        this.bulletRadius = ScreenUtils.dpToPx(2.0f, context);
        this.indent = ScreenUtils.dpToPx(5.0f, context);
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        if (((Spanned) charSequence).getSpanStart(this) == i15) {
            Paint.Style style = paint.getStyle();
            paint.setStyle(Paint.Style.FILL);
            int i17 = this.bulletRadius;
            canvas.drawCircle(i10 + (i11 * (this.indent + i17)), (i12 + i14) / 2.0f, i17, paint);
            paint.setStyle(style);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z10) {
        return (this.bulletRadius * 2) + this.gapWidth;
    }
}
