package androidx.media2.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes.dex */
class o extends k {

    @w0(23)
    static final class a {
        private a() {
        }

        @androidx.annotation.u
        static Drawable a(View view) {
            return view.getForeground();
        }
    }

    static class b extends ViewGroup.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f60170a;

        b() {
            this(-1, -1);
        }

        b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        b(int i10, int i11) {
            super(i10, i11);
        }

        b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    o(@NonNull Context context) {
        super(context);
    }

    private int c() {
        return Math.max(getPaddingBottom(), 0);
    }

    private int d() {
        return Math.max(getPaddingLeft(), 0);
    }

    private int e() {
        return Math.max(getPaddingRight(), 0);
    }

    private int f() {
        return Math.max(getPaddingTop(), 0);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int iD = d();
        int iE = (i12 - i10) - e();
        int iF = f();
        int iC = (i13 - i11) - c();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = (((iE - iD) - measuredWidth) / 2) + iD;
                int i16 = (((iC - iF) - measuredHeight) / 2) + iF;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        int measuredState = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            b bVar = (b) childAt.getLayoutParams();
            if (childAt.getVisibility() != 8 && !bVar.f60170a) {
                measureChild(childAt, i10, i11);
                iMax = Math.max(iMax, childAt.getMeasuredWidth());
                iMax2 = Math.max(iMax2, childAt.getMeasuredHeight());
                measuredState |= childAt.getMeasuredState();
            }
        }
        int iD = iMax + d() + e();
        int iF = iMax2 + f() + c();
        int iMax3 = Math.max(iD, getSuggestedMinimumWidth());
        int iMax4 = Math.max(iF, getSuggestedMinimumHeight());
        Drawable drawableA = a.a(this);
        if (drawableA != null) {
            iMax3 = Math.max(iMax3, drawableA.getMinimumWidth());
            iMax4 = Math.max(iMax4, drawableA.getMinimumHeight());
        }
        setMeasuredDimension(View.resolveSizeAndState(iMax3, i10, measuredState), View.resolveSizeAndState(iMax4, i11, measuredState << 16));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() - (d() + e()), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() - (f() + c()), 1073741824);
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt2 = getChildAt(i13);
            b bVar2 = (b) childAt2.getLayoutParams();
            if (childAt2.getVisibility() != 8 && bVar2.f60170a) {
                childAt2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    o(@NonNull Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b ? layoutParams : new b(layoutParams);
    }

    o(@NonNull Context context, @p0 AttributeSet attributeSet, @androidx.annotation.f int i10) {
        super(context, attributeSet, i10);
    }
}
