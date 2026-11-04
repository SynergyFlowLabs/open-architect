package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.core.view.u1;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public class l extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f112869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f112870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f112871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f112872d;

    public l(@NonNull Context context) {
        this(context, null);
    }

    private static int a(int i10, int i11, int i12) {
        if (i11 != Integer.MIN_VALUE) {
            return i11 != 1073741824 ? i12 : i10;
        }
        return Math.min(i12, i10);
    }

    private void d(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, r6.a.o.Hg, 0, 0);
        this.f112869a = typedArrayObtainStyledAttributes.getDimensionPixelSize(r6.a.o.Jg, 0);
        this.f112870b = typedArrayObtainStyledAttributes.getDimensionPixelSize(r6.a.o.Ig, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public int b(@NonNull View view) {
        Object tag = view.getTag(r6.a.h.H4);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -1;
    }

    public boolean c() {
        return this.f112871c;
    }

    protected int getItemSpacing() {
        return this.f112870b;
    }

    protected int getLineSpacing() {
        return this.f112869a;
    }

    protected int getRowCount() {
        return this.f112872d;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iB;
        int iC;
        if (getChildCount() == 0) {
            this.f112872d = 0;
            return;
        }
        this.f112872d = 1;
        boolean z11 = u1.c0(this) == 1;
        int paddingRight = z11 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z11 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i14 = (i12 - i10) - paddingLeft;
        int measuredWidth = paddingRight;
        int i15 = paddingTop;
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(r6.a.h.H4, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    iC = androidx.core.view.j0.c(marginLayoutParams);
                    iB = androidx.core.view.j0.b(marginLayoutParams);
                } else {
                    iB = 0;
                    iC = 0;
                }
                int measuredWidth2 = measuredWidth + iC + childAt.getMeasuredWidth();
                if (!this.f112871c && measuredWidth2 > i14) {
                    i15 = this.f112869a + paddingTop;
                    this.f112872d++;
                    measuredWidth = paddingRight;
                }
                childAt.setTag(r6.a.h.H4, Integer.valueOf(this.f112872d - 1));
                int i17 = measuredWidth + iC;
                int measuredWidth3 = childAt.getMeasuredWidth() + i17;
                int measuredHeight = childAt.getMeasuredHeight() + i15;
                if (z11) {
                    childAt.layout(i14 - measuredWidth3, i15, (i14 - measuredWidth) - iC, measuredHeight);
                } else {
                    childAt.layout(i17, i15, measuredWidth3, measuredHeight);
                }
                measuredWidth += iC + iB + childAt.getMeasuredWidth() + this.f112870b;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int paddingLeft;
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        int i14 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft2 = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i14 - getPaddingRight();
        int i15 = paddingTop;
        int i16 = 0;
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i10, i11);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i12 = marginLayoutParams.leftMargin;
                    i13 = marginLayoutParams.rightMargin;
                } else {
                    i12 = 0;
                    i13 = 0;
                }
                int i18 = paddingLeft2;
                if (paddingLeft2 + i12 + childAt.getMeasuredWidth() <= paddingRight || c()) {
                    paddingLeft = i18;
                } else {
                    paddingLeft = getPaddingLeft();
                    i15 = this.f112869a + paddingTop;
                }
                int measuredWidth = paddingLeft + i12 + childAt.getMeasuredWidth();
                int measuredHeight = i15 + childAt.getMeasuredHeight();
                if (measuredWidth > i16) {
                    i16 = measuredWidth;
                }
                paddingLeft2 = paddingLeft + i12 + i13 + childAt.getMeasuredWidth() + this.f112870b;
                if (i17 == getChildCount() - 1) {
                    i16 += i13;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(a(size, mode, i16 + getPaddingRight()), a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    protected void setItemSpacing(int i10) {
        this.f112870b = i10;
    }

    protected void setLineSpacing(int i10) {
        this.f112869a = i10;
    }

    public void setSingleLine(boolean z10) {
        this.f112871c = z10;
    }

    public l(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public l(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f112871c = false;
        d(context, attributeSet);
    }

    @e.b(21)
    public l(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f112871c = false;
        d(context, attributeSet);
    }
}
