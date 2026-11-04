package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.j0;
import androidx.annotation.p0;
import androidx.appcompat.app.r;

/* JADX INFO: loaded from: classes4.dex */
public class f extends r {

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private boolean f111586p1;

    private class b extends BottomSheetBehavior.g {
        private b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void onSlide(@NonNull View view, float f10) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void onStateChanged(@NonNull View view, int i10) {
            if (i10 == 5) {
                f.this.B();
            }
        }
    }

    public f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        if (this.f111586p1) {
            super.dismissAllowingStateLoss();
        } else {
            super.dismiss();
        }
    }

    private void C(@NonNull BottomSheetBehavior<?> bottomSheetBehavior, boolean z10) {
        this.f111586p1 = z10;
        if (bottomSheetBehavior.getState() == 5) {
            B();
            return;
        }
        if (getDialog() instanceof e) {
            ((e) getDialog()).u();
        }
        bottomSheetBehavior.h0(new b());
        bottomSheetBehavior.g(5);
    }

    private boolean D(boolean z10) {
        Dialog dialog = getDialog();
        if (!(dialog instanceof e)) {
            return false;
        }
        e eVar = (e) dialog;
        BottomSheetBehavior<FrameLayout> bottomSheetBehaviorR = eVar.r();
        if (!bottomSheetBehaviorR.T0() || !eVar.s()) {
            return false;
        }
        C(bottomSheetBehaviorR, z10);
        return true;
    }

    @Override // androidx.fragment.app.m
    public void dismiss() {
        if (D(false)) {
            return;
        }
        super.dismiss();
    }

    @Override // androidx.fragment.app.m
    public void dismissAllowingStateLoss() {
        if (D(true)) {
            return;
        }
        super.dismissAllowingStateLoss();
    }

    @Override // androidx.appcompat.app.r, androidx.fragment.app.m
    @NonNull
    public Dialog onCreateDialog(@p0 Bundle bundle) {
        return new e(getContext(), getTheme());
    }

    @e.a({"ValidFragment"})
    public f(@j0 int i10) {
        super(i10);
    }
}
