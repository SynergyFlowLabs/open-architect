package com.google.android.material.navigationrail;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.j0;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.appcompat.widget.j1;
import androidx.core.graphics.j;
import androidx.core.view.g3;
import androidx.core.view.u1;
import com.google.android.material.internal.g0;
import com.google.android.material.navigation.NavigationBarView;

/* JADX INFO: loaded from: classes4.dex */
public class c extends NavigationBarView {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    static final int f113135p0 = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final int f113136t = 49;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final int f113137v = 7;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f113138w = 49;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f113139l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    private View f113140m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @p0
    private Boolean f113141n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @p0
    private Boolean f113142o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @p0
    private Boolean f113143s;

    class a implements com.google.android.material.internal.p0.d {
        a() {
        }

        @Override // com.google.android.material.internal.p0.d
        @NonNull
        public g3 a(View view, @NonNull g3 g3Var, @NonNull com.google.android.material.internal.p0.e eVar) {
            j jVarF = g3Var.f(g3.m.i());
            c cVar = c.this;
            if (cVar.u(cVar.f113141n)) {
                eVar.f112900b += jVarF.f47824b;
            }
            c cVar2 = c.this;
            if (cVar2.u(cVar2.f113142o)) {
                eVar.f112902d += jVarF.f47826d;
            }
            c cVar3 = c.this;
            if (cVar3.u(cVar3.f113143s)) {
                eVar.f112899a += com.google.android.material.internal.p0.s(view) ? jVarF.f47825c : jVarF.f47823a;
            }
            eVar.a(view);
            return g3Var;
        }
    }

    public c(@NonNull Context context) {
        this(context, null);
    }

    private b getNavigationRailMenuView() {
        return (b) getMenuView();
    }

    private void p() {
        com.google.android.material.internal.p0.h(this, new a());
    }

    private boolean r() {
        View view = this.f113140m;
        return (view == null || view.getVisibility() == 8) ? false : true;
    }

    private int s(int i10) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (View.MeasureSpec.getMode(i10) == 1073741824 || suggestedMinimumWidth <= 0) {
            return i10;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), suggestedMinimumWidth + getPaddingLeft() + getPaddingRight()), 1073741824);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean u(Boolean bool) {
        return bool != null ? bool.booleanValue() : u1.W(this);
    }

    @p0
    public View getHeaderView() {
        return this.f113140m;
    }

    public int getItemMinimumHeight() {
        return ((b) getMenuView()).getItemMinimumHeight();
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 7;
    }

    public int getMenuGravity() {
        return getNavigationRailMenuView().getMenuGravity();
    }

    public void n(@j0 int i10) {
        o(LayoutInflater.from(getContext()).inflate(i10, (ViewGroup) this, false));
    }

    public void o(@NonNull View view) {
        t();
        this.f113140m = view;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.topMargin = this.f113139l;
        addView(view, 0, layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        b navigationRailMenuView = getNavigationRailMenuView();
        int i14 = 0;
        if (r()) {
            int bottom = this.f113140m.getBottom() + this.f113139l;
            int top = navigationRailMenuView.getTop();
            if (top < bottom) {
                i14 = bottom - top;
            }
        } else if (navigationRailMenuView.u()) {
            i14 = this.f113139l;
        }
        if (i14 > 0) {
            navigationRailMenuView.layout(navigationRailMenuView.getLeft(), navigationRailMenuView.getTop() + i14, navigationRailMenuView.getRight(), navigationRailMenuView.getBottom() + i14);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        int iS = s(i10);
        super.onMeasure(iS, i11);
        if (r()) {
            measureChild(getNavigationRailMenuView(), iS, View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - this.f113140m.getMeasuredHeight()) - this.f113139l, Integer.MIN_VALUE));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.navigation.NavigationBarView
    @NonNull
    @b1({b1.a.LIBRARY_GROUP})
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public b c(@NonNull Context context) {
        return new b(context);
    }

    public void setItemMinimumHeight(@t0 int i10) {
        ((b) getMenuView()).setItemMinimumHeight(i10);
    }

    public void setMenuGravity(int i10) {
        getNavigationRailMenuView().setMenuGravity(i10);
    }

    public void t() {
        View view = this.f113140m;
        if (view != null) {
            removeView(view);
            this.f113140m = null;
        }
    }

    public c(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, r6.a.c.f359499qe);
    }

    public c(@NonNull Context context, @p0 AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, r6.a.n.Nj);
    }

    public c(@NonNull Context context, @p0 AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f113141n = null;
        this.f113142o = null;
        this.f113143s = null;
        this.f113139l = getResources().getDimensionPixelSize(r6.a.f.Tc);
        Context context2 = getContext();
        j1 j1VarL = g0.l(context2, attributeSet, r6.a.o.qq, i10, i11, new int[0]);
        int iU = j1VarL.u(r6.a.o.rq, 0);
        if (iU != 0) {
            n(iU);
        }
        setMenuGravity(j1VarL.o(r6.a.o.tq, 49));
        if (j1VarL.C(r6.a.o.sq)) {
            setItemMinimumHeight(j1VarL.g(r6.a.o.sq, -1));
        }
        if (j1VarL.C(r6.a.o.wq)) {
            this.f113141n = Boolean.valueOf(j1VarL.a(r6.a.o.wq, false));
        }
        if (j1VarL.C(r6.a.o.uq)) {
            this.f113142o = Boolean.valueOf(j1VarL.a(r6.a.o.uq, false));
        }
        if (j1VarL.C(r6.a.o.vq)) {
            this.f113143s = Boolean.valueOf(j1VarL.a(r6.a.o.vq, false));
        }
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(r6.a.f.Z7);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(r6.a.f.X7);
        float fB = com.google.android.material.animation.b.b(0.0f, 1.0f, 0.3f, 1.0f, com.google.android.material.resources.c.f(context2) - 1.0f);
        float fC = com.google.android.material.animation.b.c(getItemPaddingTop(), dimensionPixelOffset, fB);
        float fC2 = com.google.android.material.animation.b.c(getItemPaddingBottom(), dimensionPixelOffset2, fB);
        setItemPaddingTop(Math.round(fC));
        setItemPaddingBottom(Math.round(fC2));
        j1VarL.I();
        p();
    }
}
