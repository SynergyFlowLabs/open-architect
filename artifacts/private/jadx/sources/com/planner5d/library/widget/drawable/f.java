package com.planner5d.library.widget.drawable;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.g0;
import androidx.annotation.p0;
import androidx.collection.b3;
import com.planner5d.library.services.utility.h3;

/* JADX INFO: loaded from: classes12.dex */
public class f extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f254264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f254265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f254266c;

    public f(Context context, int i10) {
        Paint paint = new Paint(1);
        this.f254264a = paint;
        this.f254266c = context;
        this.f254265b = i10 / 2;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(2134071352);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Rect bounds = getBounds();
        int i10 = h3.U(this.f254266c) ? bounds.right - (this.f254265b * 2) : bounds.left;
        int i11 = this.f254265b;
        canvas.drawCircle(i10 + i11, bounds.top + i11, i11, this.f254264a);
        int i12 = this.f254265b;
        canvas.drawCircle(i10 + i12, bounds.bottom - i12, i12, this.f254264a);
        int i13 = bounds.top;
        int i14 = this.f254265b;
        canvas.drawRect(i10, i13 + i14, i10 + (i14 * 2), bounds.bottom - i14, this.f254264a);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@g0(from = 0, to = b3.f12144d) int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@p0 ColorFilter colorFilter) {
    }
}
