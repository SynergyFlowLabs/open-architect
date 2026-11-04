package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.d0;
import androidx.core.view.g3;
import androidx.core.view.u1;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e extends f<View> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Rect f111203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Rect f111204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f111205f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f111206g;

    public e() {
        this.f111203d = new Rect();
        this.f111204e = new Rect();
        this.f111205f = 0;
    }

    private static int c0(int i10) {
        if (i10 == 0) {
            return 8388659;
        }
        return i10;
    }

    @Override // com.google.android.material.appbar.f
    protected void R(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i10) {
        View viewW = W(coordinatorLayout.w(view));
        if (viewW == null) {
            super.R(coordinatorLayout, view, i10);
            this.f111205f = 0;
            return;
        }
        CoordinatorLayout.g gVar = (CoordinatorLayout.g) view.getLayoutParams();
        Rect rect = this.f111203d;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin, viewW.getBottom() + ((ViewGroup.MarginLayoutParams) gVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) gVar).rightMargin, ((coordinatorLayout.getHeight() + viewW.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin);
        g3 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && u1.W(coordinatorLayout) && !u1.W(view)) {
            rect.left += lastWindowInsets.p();
            rect.right -= lastWindowInsets.q();
        }
        Rect rect2 = this.f111204e;
        d0.b(c0(gVar.f46850c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i10);
        int iX = X(viewW);
        view.layout(rect2.left, rect2.top - iX, rect2.right, rect2.bottom - iX);
        this.f111205f = rect2.top - viewW.getBottom();
    }

    @p0
    abstract View W(List<View> list);

    final int X(View view) {
        if (this.f111206g == 0) {
            return 0;
        }
        float fY = Y(view);
        int i10 = this.f111206g;
        return n1.a.e((int) (fY * i10), 0, i10);
    }

    float Y(View view) {
        return 1.0f;
    }

    public final int Z() {
        return this.f111206g;
    }

    int a0(@NonNull View view) {
        return view.getMeasuredHeight();
    }

    final int b0() {
        return this.f111205f;
    }

    public final void d0(int i10) {
        this.f111206g = i10;
    }

    protected boolean e0() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean u(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i10, int i11, int i12, int i13) {
        View viewW;
        g3 lastWindowInsets;
        int i14 = view.getLayoutParams().height;
        if ((i14 != -1 && i14 != -2) || (viewW = W(coordinatorLayout.w(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i12);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (u1.W(viewW) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.r() + lastWindowInsets.o();
        }
        int iA0 = size + a0(viewW);
        int measuredHeight = viewW.getMeasuredHeight();
        if (e0()) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            iA0 -= measuredHeight;
        }
        coordinatorLayout.O(view, i10, i11, View.MeasureSpec.makeMeasureSpec(iA0, i14 == -1 ? 1073741824 : Integer.MIN_VALUE), i13);
        return true;
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f111203d = new Rect();
        this.f111204e = new Rect();
        this.f111205f = 0;
    }
}
