package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.appcompat.widget.j1;
import androidx.core.view.g3;
import androidx.core.view.u1;
import com.google.android.material.internal.g0;
import com.google.android.material.internal.p0;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.e;

/* JADX INFO: loaded from: classes4.dex */
public class c extends NavigationBarView {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f111418l = 5;

    class a implements p0.d {
        a() {
        }

        @Override // com.google.android.material.internal.p0.d
        @NonNull
        public g3 a(View view, @NonNull g3 g3Var, @NonNull p0.e eVar) {
            eVar.f112902d += g3Var.o();
            boolean z10 = u1.c0(view) == 1;
            int iP = g3Var.p();
            int iQ = g3Var.q();
            eVar.f112899a += z10 ? iQ : iP;
            int i10 = eVar.f112901c;
            if (!z10) {
                iP = iQ;
            }
            eVar.f112901c = i10 + iP;
            eVar.a(view);
            return g3Var;
        }
    }

    @Deprecated
    public interface b extends NavigationBarView.c {
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomnavigation.c$c, reason: collision with other inner class name */
    @Deprecated
    public interface InterfaceC0980c extends NavigationBarView.d {
    }

    public c(@NonNull Context context) {
        this(context, null);
    }

    private void j(@NonNull Context context) {
        View view = new View(context);
        view.setBackgroundColor(androidx.core.content.d.g(context, r6.a.e.V));
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(r6.a.f.f360116b1)));
        addView(view);
    }

    private void k() {
        p0.h(this, new a());
    }

    private int m(int i10) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i10) == 1073741824 || suggestedMinimumHeight <= 0) {
            return i10;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), suggestedMinimumHeight + getPaddingTop() + getPaddingBottom()), 1073741824);
    }

    private boolean n() {
        return false;
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    @NonNull
    @b1({b1.a.LIBRARY_GROUP})
    protected e c(@NonNull Context context) {
        return new com.google.android.material.bottomnavigation.b(context);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 5;
    }

    public boolean l() {
        return ((com.google.android.material.bottomnavigation.b) getMenuView()).u();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, m(i11));
    }

    public void setItemHorizontalTranslationEnabled(boolean z10) {
        com.google.android.material.bottomnavigation.b bVar = (com.google.android.material.bottomnavigation.b) getMenuView();
        if (bVar.u() != z10) {
            bVar.setItemHorizontalTranslationEnabled(z10);
            getPresenter().f(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(@androidx.annotation.p0 b bVar) {
        setOnItemReselectedListener(bVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(@androidx.annotation.p0 InterfaceC0980c interfaceC0980c) {
        setOnItemSelectedListener(interfaceC0980c);
    }

    public c(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, r6.a.c.f359348k1);
    }

    public c(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, r6.a.n.Me);
    }

    public c(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        Context context2 = getContext();
        j1 j1VarL = g0.l(context2, attributeSet, r6.a.o.f361678d5, i10, i11, new int[0]);
        setItemHorizontalTranslationEnabled(j1VarL.a(r6.a.o.f361750g5, true));
        if (j1VarL.C(r6.a.o.f361702e5)) {
            setMinimumHeight(j1VarL.g(r6.a.o.f361702e5, 0));
        }
        if (j1VarL.a(r6.a.o.f361726f5, true) && n()) {
            j(context2);
        }
        j1VarL.I();
        k();
    }
}
