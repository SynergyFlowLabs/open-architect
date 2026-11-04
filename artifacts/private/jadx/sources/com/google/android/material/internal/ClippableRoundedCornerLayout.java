package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public class ClippableRoundedCornerLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.p0
    private Path f112725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f112726b;

    public ClippableRoundedCornerLayout(@NonNull Context context) {
        super(context);
    }

    public void a() {
        this.f112725a = null;
        this.f112726b = 0.0f;
        invalidate();
    }

    public void b(float f10, float f11, float f12, float f13, float f14) {
        d(new RectF(f10, f11, f12, f13), f14);
    }

    public void c(@NonNull Rect rect, float f10) {
        b(rect.left, rect.top, rect.right, rect.bottom, f10);
    }

    public void d(@NonNull RectF rectF, float f10) {
        if (this.f112725a == null) {
            this.f112725a = new Path();
        }
        this.f112726b = f10;
        this.f112725a.reset();
        this.f112725a.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        this.f112725a.close();
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (this.f112725a == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipPath(this.f112725a);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSave);
    }

    public void e(float f10) {
        b(getLeft(), getTop(), getRight(), getBottom(), f10);
    }

    public float getCornerRadius() {
        return this.f112726b;
    }

    public ClippableRoundedCornerLayout(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ClippableRoundedCornerLayout(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
