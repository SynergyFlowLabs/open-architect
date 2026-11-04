package io.intercom.android.sdk.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.annotation.p0;
import androidx.core.content.d;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;

/* JADX INFO: loaded from: classes13.dex */
class BackButtonCountDrawable extends Drawable {
    private static final String COUNT_BACKGROUND_COLOR = "#FE536C";
    private static final int COUNT_BACKGROUND_RADIUS_DP = 8;
    private static final int COUNT_TEXT_PADDING_TOP = 4;
    private static final int COUNT_TEXT_SIZE_DP = 11;
    private static final int ICON_PADDING_DP = 16;
    private static final int ICON_SIZE_DP = 24;
    private final Drawable backIcon;
    private final Paint countBackgroundPaint;
    private final int countBackgroundRadius;
    private final int iconPadding;
    private final int iconSize;

    @p0
    private String text;
    private final Paint textPaint;
    private final int textTopPadding;

    BackButtonCountDrawable(Context context, @p0 String str) {
        this.text = str;
        Drawable drawableL = d.l(context, R.drawable.intercom_ic_back);
        this.backIcon = drawableL;
        drawableL.setLayoutDirection(context.getResources().getConfiguration().getLayoutDirection());
        this.iconPadding = ScreenUtils.dpToPx(16.0f, context);
        this.iconSize = ScreenUtils.dpToPx(24.0f, context);
        Paint paint = new Paint();
        this.countBackgroundPaint = paint;
        paint.setAntiAlias(true);
        paint.setColor(Color.parseColor(COUNT_BACKGROUND_COLOR));
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.countBackgroundRadius = ScreenUtils.dpToPx(8.0f, context);
        Paint paint2 = new Paint();
        this.textPaint = paint2;
        paint2.setAntiAlias(true);
        paint2.setColor(-1);
        paint2.setTextSize(ScreenUtils.dpToPx(11.0f, context));
        paint2.setFakeBoldText(true);
        paint2.setStyle(style);
        paint2.setTextAlign(Paint.Align.CENTER);
        this.textTopPadding = ScreenUtils.dpToPx(4.0f, context);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i10 = bounds.left;
        int i11 = this.iconPadding;
        int i12 = i10 + i11;
        int i13 = bounds.top + i11;
        int i14 = this.iconSize;
        int i15 = i12 + i14;
        this.backIcon.setBounds(i12, i13, i15, i14 + i13);
        this.backIcon.draw(canvas);
        if (TextUtils.isEmpty(this.text)) {
            return;
        }
        float f10 = i15;
        canvas.drawCircle(f10, i13, this.countBackgroundRadius, this.countBackgroundPaint);
        canvas.drawText(this.text, f10, i13 + this.textTopPadding, this.textPaint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.textPaint.setAlpha(i10);
        this.countBackgroundPaint.setAlpha(i10);
        this.backIcon.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@p0 ColorFilter colorFilter) {
        this.backIcon.setColorFilter(colorFilter);
    }

    public void setText(@p0 String str) {
        this.text = str;
        invalidateSelf();
    }
}
