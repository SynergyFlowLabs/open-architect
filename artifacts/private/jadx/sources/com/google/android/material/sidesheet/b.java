package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes4.dex */
final class b extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final SideSheetBehavior<? extends View> f113728a;

    b(@NonNull SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f113728a = sideSheetBehavior;
    }

    @Override // com.google.android.material.sidesheet.e
    int a(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // com.google.android.material.sidesheet.e
    float b(int i10) {
        float fE = e();
        return (fE - i10) / (fE - d());
    }

    @Override // com.google.android.material.sidesheet.e
    int c(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // com.google.android.material.sidesheet.e
    int d() {
        return Math.max(0, (e() - this.f113728a.m0()) - this.f113728a.t0());
    }

    @Override // com.google.android.material.sidesheet.e
    int e() {
        return this.f113728a.x0();
    }

    @Override // com.google.android.material.sidesheet.e
    int f() {
        return this.f113728a.x0();
    }

    @Override // com.google.android.material.sidesheet.e
    int g() {
        return d();
    }

    @Override // com.google.android.material.sidesheet.e
    <V extends View> int h(@NonNull V v10) {
        return v10.getLeft() - this.f113728a.t0();
    }

    @Override // com.google.android.material.sidesheet.e
    public int i(@NonNull CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }

    @Override // com.google.android.material.sidesheet.e
    int j() {
        return 0;
    }

    @Override // com.google.android.material.sidesheet.e
    boolean k(float f10) {
        return f10 < 0.0f;
    }

    @Override // com.google.android.material.sidesheet.e
    boolean l(@NonNull View view) {
        return view.getLeft() > (e() + d()) / 2;
    }

    @Override // com.google.android.material.sidesheet.e
    boolean m(float f10, float f11) {
        return h.a(f10, f11) && Math.abs(f10) > ((float) this.f113728a.y0());
    }

    @Override // com.google.android.material.sidesheet.e
    boolean n(@NonNull View view, float f10) {
        return Math.abs(((float) view.getRight()) + (f10 * this.f113728a.r0())) > this.f113728a.s0();
    }

    @Override // com.google.android.material.sidesheet.e
    void o(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        marginLayoutParams.rightMargin = i10;
    }

    @Override // com.google.android.material.sidesheet.e
    void p(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11) {
        int iX0 = this.f113728a.x0();
        if (i10 <= iX0) {
            marginLayoutParams.rightMargin = iX0 - i10;
        }
    }
}
