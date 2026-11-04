package com.planner5d.library.widget.drawable;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes12.dex */
public class j extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f254284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Drawable f254285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bitmap f254286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Canvas f254287d;

    public j(Drawable drawable, int i10) {
        Paint paint = new Paint(1);
        this.f254284a = paint;
        this.f254286c = null;
        this.f254287d = null;
        this.f254285b = drawable;
        paint.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        paint.setMaskFilter(new BlurMaskFilter(1.0f, BlurMaskFilter.Blur.NORMAL));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        Bitmap bitmap = this.f254286c;
        if (bitmap == null || bitmap.getWidth() != bounds.width() || this.f254286c.getHeight() != bounds.height()) {
            this.f254286c = td.a.f380845a.b(bounds.width(), bounds.height(), Bitmap.Config.ARGB_8888);
            this.f254287d = new Canvas(this.f254286c);
        }
        this.f254286c.eraseColor(0);
        this.f254285b.draw(this.f254287d);
        Bitmap bitmapExtractAlpha = this.f254286c.extractAlpha();
        this.f254286c.eraseColor(0);
        this.f254287d.drawBitmap(bitmapExtractAlpha, 0.0f, 0.0f, this.f254284a);
        canvas.drawBitmap(this.f254286c, 1.0f, 1.0f, (Paint) null);
        this.f254285b.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f254285b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f254285b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f254285b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f254285b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.f254285b.setBounds(i10, i11, i12, i13);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f254285b.setColorFilter(colorFilter);
    }
}
