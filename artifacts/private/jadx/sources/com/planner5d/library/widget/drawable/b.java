package com.planner5d.library.widget.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes12.dex */
public class b extends Drawable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f254255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f254256c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f254254a = new Paint(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ColorFilter f254257d = null;

    public b(int i10, int i11) {
        this.f254255b = i10;
        this.f254256c = i11;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f254254a.setColor(this.f254255b);
        this.f254254a.setColorFilter(null);
        canvas.drawCircle(bounds.centerX(), bounds.centerY(), bounds.centerX(), this.f254254a);
        this.f254254a.setColor(-1);
        this.f254254a.setColorFilter(this.f254257d);
        canvas.drawCircle(bounds.centerX(), bounds.centerY(), bounds.centerX() - this.f254256c, this.f254254a);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f254254a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f254254a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f254257d = colorFilter;
    }
}
