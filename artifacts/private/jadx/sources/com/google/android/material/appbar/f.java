package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes4.dex */
class f<V extends View> extends CoordinatorLayout.c<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g f111207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f111208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f111209c;

    public f() {
        this.f111208b = 0;
        this.f111209c = 0;
    }

    public int N() {
        g gVar = this.f111207a;
        if (gVar != null) {
            return gVar.d();
        }
        return 0;
    }

    public int O() {
        g gVar = this.f111207a;
        if (gVar != null) {
            return gVar.e();
        }
        return 0;
    }

    public boolean P() {
        g gVar = this.f111207a;
        return gVar != null && gVar.f();
    }

    public boolean Q() {
        g gVar = this.f111207a;
        return gVar != null && gVar.g();
    }

    protected void R(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, int i10) {
        coordinatorLayout.N(v10, i10);
    }

    public void S(boolean z10) {
        g gVar = this.f111207a;
        if (gVar != null) {
            gVar.i(z10);
        }
    }

    public boolean T(int i10) {
        g gVar = this.f111207a;
        if (gVar != null) {
            return gVar.j(i10);
        }
        this.f111209c = i10;
        return false;
    }

    public boolean U(int i10) {
        g gVar = this.f111207a;
        if (gVar != null) {
            return gVar.k(i10);
        }
        this.f111208b = i10;
        return false;
    }

    public void V(boolean z10) {
        g gVar = this.f111207a;
        if (gVar != null) {
            gVar.l(z10);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean t(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, int i10) {
        R(coordinatorLayout, v10, i10);
        if (this.f111207a == null) {
            this.f111207a = new g(v10);
        }
        this.f111207a.h();
        this.f111207a.a();
        int i11 = this.f111208b;
        if (i11 != 0) {
            this.f111207a.k(i11);
            this.f111208b = 0;
        }
        int i12 = this.f111209c;
        if (i12 != 0) {
            this.f111207a.j(i12);
            this.f111209c = 0;
        }
        return true;
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f111208b = 0;
        this.f111209c = 0;
    }
}
