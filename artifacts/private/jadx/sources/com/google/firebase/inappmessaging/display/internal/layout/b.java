package com.google.firebase.inappmessaging.display.internal.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.d0;
import androidx.annotation.p0;
import com.google.firebase.inappmessaging.display.g;
import com.google.firebase.inappmessaging.display.internal.l;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b extends FrameLayout {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f122449e = -1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f122450f = -1.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f122451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f122452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DisplayMetrics f122453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<View> f122454d;

    public b(Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f122454d = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, g.h.f122245a, 0, 0);
        try {
            this.f122451a = typedArrayObtainStyledAttributes.getFloat(g.h.f122247c, -1.0f);
            this.f122452b = typedArrayObtainStyledAttributes.getFloat(g.h.f122246b, -1.0f);
            typedArrayObtainStyledAttributes.recycle();
            this.f122453c = context.getResources().getDisplayMetrics();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    protected int a(int i10) {
        if (getMaxHeightPct() > 0.0f) {
            l.a("Height: restrict by pct");
            return n((int) (getDisplayMetrics().heightPixels * getMaxHeightPct()), 4);
        }
        l.a("Height: restrict by spec");
        return View.MeasureSpec.getSize(i10);
    }

    protected int b(int i10) {
        if (getMaxWidthPct() > 0.0f) {
            l.a("Width: restrict by pct");
            return n((int) (getDisplayMetrics().widthPixels * getMaxWidthPct()), 4);
        }
        l.a("Width: restrict by spec");
        return View.MeasureSpec.getSize(i10);
    }

    protected int c(int i10) {
        int i11 = 1 << 1;
        return (int) Math.floor(TypedValue.applyDimension(1, i10, this.f122453c));
    }

    @NonNull
    protected View d(@d0 int i10) {
        View viewFindViewById = findViewById(i10);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        throw new IllegalStateException("No such child: " + i10);
    }

    protected int e(View view) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        return view.getMeasuredHeight();
    }

    protected int f(View view) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        return view.getMeasuredWidth();
    }

    protected int g(View view) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        FrameLayout.LayoutParams layoutParamsH = h(view);
        return e(view) + layoutParamsH.topMargin + layoutParamsH.bottomMargin;
    }

    protected DisplayMetrics getDisplayMetrics() {
        return this.f122453c;
    }

    protected float getMaxHeightPct() {
        return this.f122452b;
    }

    protected float getMaxWidthPct() {
        return this.f122451a;
    }

    protected List<View> getVisibleChildren() {
        return this.f122454d;
    }

    protected FrameLayout.LayoutParams h(View view) {
        return (FrameLayout.LayoutParams) view.getLayoutParams();
    }

    protected int i(View view) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        return h(view).bottomMargin;
    }

    protected int j(View view) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        return h(view).topMargin;
    }

    protected int k(View view) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        FrameLayout.LayoutParams layoutParamsH = h(view);
        return f(view) + layoutParamsH.leftMargin + layoutParamsH.rightMargin;
    }

    protected void l(View view, int i10, int i11) {
        m(view, i10, i11, i10 + f(view), i11 + e(view));
    }

    protected void m(View view, int i10, int i11, int i12, int i13) {
        l.d("\tleft, right", i10, i12);
        l.d("\ttop, bottom", i11, i13);
        view.layout(i10, i11, i12, i13);
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        l.d("\tdesired (w,h)", view.getMeasuredWidth(), view.getMeasuredHeight());
        super.measureChildWithMargins(view, i10, i11, i12, i13);
        l.d("\tactual  (w,h)", view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    protected int n(int i10, int i11) {
        return i11 * Math.round(i10 / i11);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        l.b("BEGIN LAYOUT");
        l.a("onLayout: l: " + i10 + ", t: " + i11 + ", r: " + i12 + ", b: " + i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        l.b("BEGIN MEASURE");
        l.d("Display", getDisplayMetrics().widthPixels, getDisplayMetrics().heightPixels);
        this.f122454d.clear();
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                this.f122454d.add(childAt);
            } else {
                l.c("Skipping GONE child", i12);
            }
        }
    }
}
