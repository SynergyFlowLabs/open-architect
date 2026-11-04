package com.planner5d.library.widget.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.planner5d.library.widget.c1;

/* JADX INFO: loaded from: classes12.dex */
public class a extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f254244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f254245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f254246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TextPaint f254247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f254248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Layout f254249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Integer f254250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f254251h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Point f254252i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f254253j;

    public a(Context context, String str, int i10) {
        Paint paint = new Paint(1);
        this.f254244a = paint;
        this.f254246c = new Rect();
        TextPaint textPaint = new TextPaint(1);
        this.f254247d = textPaint;
        this.f254249f = null;
        this.f254250g = null;
        this.f254252i = new Point(0, 0);
        this.f254253j = false;
        Resources resources = context.getResources();
        this.f254251h = resources.getDimensionPixelSize(c1.f.Kd);
        this.f254245b = str;
        this.f254248e = i10;
        textPaint.setTextSize(resources.getDimensionPixelSize(c1.f.f251196p3));
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(androidx.core.content.d.g(context, c1.e.Ya));
    }

    private Layout a(CharSequence charSequence, int i10) {
        boolean z10 = false;
        return new StaticLayout(charSequence, 0, charSequence.length(), this.f254247d, i10, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, true);
    }

    private Layout b(int i10) {
        Integer num = this.f254250g;
        if (num == null || num.intValue() != i10) {
            Layout layoutA = a(this.f254245b, i10);
            this.f254249f = layoutA;
            if (layoutA.getLineCount() > this.f254248e) {
                this.f254249f = a(new SpannableStringBuilder(this.f254249f.getText().subSequence(0, this.f254249f.getLineEnd(this.f254248e - 1) - 3)).append((CharSequence) "…"), i10);
            }
        }
        return this.f254249f;
    }

    public void c(boolean z10) {
        this.f254253j = z10;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f254246c.set(getBounds());
        Layout layoutB = b(this.f254246c.width() - (this.f254251h * 2));
        this.f254252i.set(this.f254246c.width(), this.f254246c.height());
        if (this.f254253j) {
            canvas.drawRect(this.f254246c, this.f254244a);
        }
        canvas.save();
        canvas.translate(this.f254251h, this.f254246c.centerY() - (layoutB.getHeight() / 2));
        layoutB.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f254252i.y;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f254252i.x;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
