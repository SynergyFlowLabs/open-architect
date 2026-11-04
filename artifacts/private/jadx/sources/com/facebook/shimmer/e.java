package com.facebook.shimmer;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
public class e extends FrameLayout {
    private final Paint mContentPaint;
    private final d mShimmerDrawable;
    private boolean mShowShimmer;

    public e(Context context) {
        super(context);
        this.mContentPaint = new Paint();
        this.mShimmerDrawable = new d();
        this.mShowShimmer = true;
        a(context, null);
    }

    private void a(Context context, @p0 AttributeSet attributeSet) {
        setWillNotDraw(false);
        this.mShimmerDrawable.setCallback(this);
        if (attributeSet == null) {
            setShimmer(new c.a().a());
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.c.f102096a, 0, 0);
        try {
            setShimmer(((typedArrayObtainStyledAttributes.hasValue(b.c.f102101f) && typedArrayObtainStyledAttributes.getBoolean(b.c.f102101f, false)) ? new c.C0926c() : new c.a()).d(typedArrayObtainStyledAttributes).a());
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.mShowShimmer) {
            this.mShimmerDrawable.draw(canvas);
        }
    }

    public void hideShimmer() {
        if (this.mShowShimmer) {
            stopShimmer();
            this.mShowShimmer = false;
            invalidate();
        }
    }

    public boolean isShimmerStarted() {
        return this.mShimmerDrawable.a();
    }

    public boolean isShimmerVisible() {
        return this.mShowShimmer;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mShimmerDrawable.b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopShimmer();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.mShimmerDrawable.setBounds(0, 0, getWidth(), getHeight());
    }

    public e setShimmer(@p0 c cVar) {
        this.mShimmerDrawable.d(cVar);
        if (cVar == null || !cVar.f102132o) {
            setLayerType(0, null);
            return this;
        }
        setLayerType(2, this.mContentPaint);
        return this;
    }

    public void showShimmer(boolean z10) {
        if (this.mShowShimmer) {
            return;
        }
        this.mShowShimmer = true;
        if (z10) {
            startShimmer();
        }
    }

    public void startShimmer() {
        this.mShimmerDrawable.e();
    }

    public void stopShimmer() {
        this.mShimmerDrawable.f();
    }

    @Override // android.view.View
    protected boolean verifyDrawable(@NonNull Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mShimmerDrawable;
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mContentPaint = new Paint();
        this.mShimmerDrawable = new d();
        this.mShowShimmer = true;
        a(context, attributeSet);
    }

    public e(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mContentPaint = new Paint();
        this.mShimmerDrawable = new d();
        this.mShowShimmer = true;
        a(context, attributeSet);
    }

    @e.b(21)
    public e(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.mContentPaint = new Paint();
        this.mShimmerDrawable = new d();
        this.mShowShimmer = true;
        a(context, attributeSet);
    }
}
