package io.intercom.android.sdk.views;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes13.dex */
public class ActiveStateDrawable extends Drawable {
    private final Paint paint;
    private final RectF roundRect = new RectF();
    private final int stateColor;
    private final int strokeColor;
    private final float strokeWidth;

    public ActiveStateDrawable(int i10, int i11, float f10) {
        Paint paint = new Paint();
        this.paint = paint;
        this.stateColor = i10;
        this.strokeColor = i11;
        this.strokeWidth = f10;
        paint.setAntiAlias(true);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.roundRect.set(getBounds());
        RectF rectF = this.roundRect;
        float f10 = this.strokeWidth;
        rectF.inset(f10, f10);
        this.paint.setColor(this.stateColor);
        this.paint.setStyle(Paint.Style.FILL);
        canvas.drawRoundRect(this.roundRect, canvas.getHeight() / 2, canvas.getHeight() / 2, this.paint);
        this.paint.setColor(this.strokeColor);
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setStrokeWidth(this.strokeWidth);
        canvas.drawRoundRect(this.roundRect, canvas.getHeight() / 2, canvas.getHeight() / 2, this.paint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.paint.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@p0 ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
