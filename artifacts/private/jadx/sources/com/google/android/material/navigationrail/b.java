package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.t0;
import com.google.android.material.navigation.e;
import com.planner5d.library.engine.input.f;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public class b extends e {

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    @t0
    private int f113133s3;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private final FrameLayout.LayoutParams f113134t3;

    public b(@NonNull Context context) {
        super(context);
        this.f113133s3 = -1;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.f113134t3 = layoutParams;
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
        setItemActiveIndicatorResizeable(true);
    }

    private int v(int i10, int i11, int i12) {
        int iMax = i11 / Math.max(1, i12);
        int size = this.f113133s3;
        if (size == -1) {
            size = View.MeasureSpec.getSize(i10);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, iMax), 0);
    }

    private int w(View view, int i10, int i11) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        view.measure(i10, i11);
        return view.getMeasuredHeight();
    }

    private int x(int i10, int i11, int i12, View view) {
        int iV = view == null ? v(i10, i11, i12) : View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        int childCount = getChildCount();
        int iW = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != view) {
                iW += w(childAt, i10, iV);
            }
        }
        return iW;
    }

    private int y(int i10, int i11, int i12) {
        int iW;
        View childAt = getChildAt(getSelectedItemPosition());
        if (childAt != null) {
            iW = w(childAt, i10, v(i10, i11, i12));
            i11 -= iW;
            i12--;
        } else {
            iW = 0;
        }
        return iW + x(i10, i11, i12, childAt);
    }

    @Override // com.google.android.material.navigation.e
    @NonNull
    protected com.google.android.material.navigation.c g(@NonNull Context context) {
        return new a(context);
    }

    @t0
    public int getItemMinimumHeight() {
        return this.f113133s3;
    }

    int getMenuGravity() {
        return this.f113134t3.gravity;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int i14 = i12 - i10;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                int measuredHeight = childAt.getMeasuredHeight() + i15;
                childAt.layout(0, i15, i14, measuredHeight);
                i15 = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        int size2 = getMenu().H().size();
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.resolveSizeAndState((size2 <= 1 || !l(getLabelVisibilityMode(), size2)) ? x(i10, size, size2, null) : y(i10, size, size2), i11, 0));
    }

    public void setItemMinimumHeight(@t0 int i10) {
        if (this.f113133s3 != i10) {
            this.f113133s3 = i10;
            requestLayout();
        }
    }

    void setMenuGravity(int i10) {
        FrameLayout.LayoutParams layoutParams = this.f113134t3;
        if (layoutParams.gravity != i10) {
            layoutParams.gravity = i10;
            setLayoutParams(layoutParams);
        }
    }

    boolean u() {
        return (this.f113134t3.gravity & f.b.B) == 48;
    }
}
