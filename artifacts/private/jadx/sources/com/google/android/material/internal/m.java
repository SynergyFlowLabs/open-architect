package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.w0;
import androidx.appcompat.widget.LinearLayoutCompat;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public class m extends LinearLayoutCompat {

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    @androidx.annotation.p0
    private Drawable f112880k3;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private final Rect f112881l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private final Rect f112882m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private int f112883n3;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    protected boolean f112884o3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    boolean f112885p3;

    public m(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f112880k3;
        if (drawable != null) {
            if (this.f112885p3) {
                this.f112885p3 = false;
                Rect rect = this.f112881l3;
                Rect rect2 = this.f112882m3;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f112884o3) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f112883n3, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @w0(21)
    @e.b(21)
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f112880k3;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f112880k3;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f112880k3.setState(getDrawableState());
    }

    @Override // android.view.View
    @androidx.annotation.p0
    public Drawable getForeground() {
        return this.f112880k3;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f112883n3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f112880k3;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f112885p3 = z10 | this.f112885p3;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f112885p3 = true;
    }

    @Override // android.view.View
    public void setForeground(@androidx.annotation.p0 Drawable drawable) {
        Drawable drawable2 = this.f112880k3;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f112880k3);
            }
            this.f112880k3 = drawable;
            this.f112885p3 = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f112883n3 == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i10) {
        if (this.f112883n3 != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= androidx.core.view.d0.f48643b;
            }
            if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
                i10 |= 48;
            }
            this.f112883n3 = i10;
            if (i10 == 119 && this.f112880k3 != null) {
                this.f112880k3.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f112880k3) {
            return false;
        }
        return true;
    }

    public m(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public m(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f112881l3 = new Rect();
        this.f112882m3 = new Rect();
        this.f112883n3 = 119;
        this.f112884o3 = true;
        this.f112885p3 = false;
        TypedArray typedArrayK = g0.k(context, attributeSet, r6.a.o.f361714eh, i10, 0, new int[0]);
        this.f112883n3 = typedArrayK.getInt(r6.a.o.f361762gh, this.f112883n3);
        Drawable drawable = typedArrayK.getDrawable(r6.a.o.f361738fh);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f112884o3 = typedArrayK.getBoolean(r6.a.o.f361786hh, true);
        typedArrayK.recycle();
    }
}
