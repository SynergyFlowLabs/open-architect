package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes4.dex */
final class a extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final SideSheetBehavior<? extends View> f113727a;

    a(@NonNull SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f113727a = sideSheetBehavior;
    }

    @Override // com.google.android.material.sidesheet.e
    int a(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // com.google.android.material.sidesheet.e
    float b(int i10) {
        float fE = e();
        return (i10 - fE) / (d() - fE);
    }

    @Override // com.google.android.material.sidesheet.e
    int c(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // com.google.android.material.sidesheet.e
    int d() {
        return Math.max(0, this.f113727a.w0() + this.f113727a.t0());
    }

    @Override // com.google.android.material.sidesheet.e
    int e() {
        return (-this.f113727a.m0()) - this.f113727a.t0();
    }

    @Override // com.google.android.material.sidesheet.e
    int f() {
        return this.f113727a.t0();
    }

    @Override // com.google.android.material.sidesheet.e
    int g() {
        return -this.f113727a.m0();
    }

    @Override // com.google.android.material.sidesheet.e
    <V extends View> int h(@NonNull V v10) {
        return v10.getRight() + this.f113727a.t0();
    }

    @Override // com.google.android.material.sidesheet.e
    public int i(@NonNull CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    @Override // com.google.android.material.sidesheet.e
    int j() {
        return 1;
    }

    @Override // com.google.android.material.sidesheet.e
    boolean k(float f10) {
        return f10 > 0.0f;
    }

    @Override // com.google.android.material.sidesheet.e
    boolean l(@NonNull View view) {
        return view.getRight() < (d() - e()) / 2;
    }

    @Override // com.google.android.material.sidesheet.e
    boolean m(float f10, float f11) {
        return h.a(f10, f11) && Math.abs(f10) > ((float) this.f113727a.y0());
    }

    @Override // com.google.android.material.sidesheet.e
    boolean n(@NonNull View view, float f10) {
        return Math.abs(((float) view.getLeft()) + (f10 * this.f113727a.r0())) > this.f113727a.s0();
    }

    @Override // com.google.android.material.sidesheet.e
    void o(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        marginLayoutParams.leftMargin = i10;
    }

    @Override // com.google.android.material.sidesheet.e
    void p(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11) {
        if (i10 <= this.f113727a.x0()) {
            marginLayoutParams.leftMargin = i11;
        }
    }
}
