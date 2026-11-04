package com.google.firebase.inappmessaging.display.internal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: classes5.dex */
public class ResizableImageView extends AppCompatImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f122248a;

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f122249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f122250b;

        private b(int i10, int i11) {
            this.f122249a = i10;
            this.f122250b = i11;
        }
    }

    public ResizableImageView(Context context) {
        super(context);
        f(context);
    }

    private b d(int i10, int i11) {
        int maxWidth = getMaxWidth();
        int maxHeight = getMaxHeight();
        if (i10 > maxWidth) {
            l.c("Image: capping width", maxWidth);
            i11 = (i11 * maxWidth) / i10;
            i10 = maxWidth;
        }
        if (i11 > maxHeight) {
            l.c("Image: capping height", maxHeight);
            i10 = (i10 * maxHeight) / i11;
        } else {
            maxHeight = i11;
        }
        return new b(i10, maxHeight);
    }

    private void e() {
        int iMax = Math.max(getMinimumWidth(), getSuggestedMinimumWidth());
        int iMax2 = Math.max(getMinimumHeight(), getSuggestedMinimumHeight());
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f10 = iMax;
        float f11 = iMax2;
        l.d("Image: min width, height", f10, f11);
        float f12 = measuredWidth;
        float f13 = measuredHeight;
        l.d("Image: actual width, height", f12, f13);
        float f14 = measuredWidth < iMax ? f10 / f12 : 1.0f;
        float f15 = measuredHeight < iMax2 ? f11 / f13 : 1.0f;
        if (f14 <= f15) {
            f14 = f15;
        }
        if (f14 > 1.0d) {
            int iCeil = (int) Math.ceil(f12 * f14);
            int iCeil2 = (int) Math.ceil(f13 * f14);
            l.a("Measured dimension (" + measuredWidth + "x" + measuredHeight + ") too small.  Resizing to " + iCeil + "x" + iCeil2);
            b bVarD = d(iCeil, iCeil2);
            setMeasuredDimension(bVarD.f122249a, bVarD.f122250b);
        }
    }

    private void f(@NonNull Context context) {
        this.f122248a = (int) (context.getResources().getDisplayMetrics().density * 160.0f);
    }

    private void g(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        l.d("Image: intrinsic width, height", intrinsicWidth, intrinsicHeight);
        b bVarD = d((int) Math.ceil((intrinsicWidth * this.f122248a) / 160), (int) Math.ceil((intrinsicHeight * this.f122248a) / 160));
        l.d("Image: new target dimensions", bVarD.f122249a, bVarD.f122250b);
        setMeasuredDimension(bVarD.f122249a, bVarD.f122250b);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Drawable drawable = getDrawable();
        boolean adjustViewBounds = getAdjustViewBounds();
        if (drawable == null || !adjustViewBounds) {
            return;
        }
        g(drawable);
        e();
    }

    public ResizableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        f(context);
    }

    public ResizableImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f(context);
    }
}
