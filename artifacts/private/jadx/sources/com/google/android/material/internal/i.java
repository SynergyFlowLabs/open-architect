package com.google.android.material.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public class i extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Drawable f112860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Drawable f112861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float[] f112862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f112863d;

    public i(@NonNull Drawable drawable, @NonNull Drawable drawable2) {
        this.f112860a = drawable.getConstantState().newDrawable().mutate();
        Drawable drawableMutate = drawable2.getConstantState().newDrawable().mutate();
        this.f112861b = drawableMutate;
        drawableMutate.setAlpha(0);
        this.f112862c = new float[2];
    }

    public void a(@androidx.annotation.x(from = 0.0d, to = 1.0d) float f10) {
        if (this.f112863d != f10) {
            this.f112863d = f10;
            k.a(f10, this.f112862c);
            this.f112860a.setAlpha((int) (this.f112862c[0] * 255.0f));
            this.f112861b.setAlpha((int) (this.f112862c[1] * 255.0f));
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        this.f112860a.draw(canvas);
        this.f112861b.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return Math.max(this.f112860a.getIntrinsicHeight(), this.f112861b.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.max(this.f112860a.getIntrinsicWidth(), this.f112861b.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return Math.max(this.f112860a.getMinimumHeight(), this.f112861b.getMinimumHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return Math.max(this.f112860a.getMinimumWidth(), this.f112861b.getMinimumWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!this.f112860a.isStateful() && !this.f112861b.isStateful()) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f112863d <= 0.5f) {
            this.f112860a.setAlpha(i10);
            this.f112861b.setAlpha(0);
        } else {
            this.f112860a.setAlpha(0);
            this.f112861b.setAlpha(i10);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.f112860a.setBounds(i10, i11, i12, i13);
        this.f112861b.setBounds(i10, i11, i12, i13);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@androidx.annotation.p0 ColorFilter colorFilter) {
        this.f112860a.setColorFilter(colorFilter);
        this.f112861b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return this.f112860a.setState(iArr) || this.f112861b.setState(iArr);
    }
}
