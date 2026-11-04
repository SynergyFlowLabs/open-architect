package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f111802c = 0.85f;

    @b1({b1.a.LIBRARY_GROUP})
    public s() {
    }

    private float k(float f10, float f11, float f12) {
        float fMax = Math.max(1.5f * f12, f10);
        float f13 = 0.85f * f11;
        if (fMax > f13) {
            fMax = Math.max(f13, f12 * 1.2f);
        }
        return Math.min(f11, fMax);
    }

    private k l(float f10, float f11, float f12, int i10, float f13, float f14, float f15) {
        float fMin = Math.min(f14, f12);
        float fB = g.b(fMin, f12, f11);
        float fB2 = g.b(f13, f12, f11);
        float f16 = f13 / 2.0f;
        float f17 = (f15 + 0.0f) - f16;
        float f18 = f17 + f16;
        float f19 = fMin / 2.0f;
        float f20 = (i10 * f12) + f18;
        k.b bVarH = new k.b(f12, f10).a((f17 - f16) - f19, fB, fMin).c(f17, fB2, f13, false).h((f12 / 2.0f) + f18, 0.0f, f12, i10, true);
        bVarH.c(f16 + f20, fB2, f13, false);
        bVarH.a(f20 + f13 + f19, fB, fMin);
        return bVarH.i();
    }

    private k m(Context context, float f10, float f11, float f12, int i10, float f13, int i11, float f14) {
        float fMin = Math.min(f14, f12);
        float fMax = Math.max(fMin, 0.5f * f13);
        float fB = g.b(fMax, f12, f10);
        float fB2 = g.b(fMin, f12, f10);
        float fB3 = g.b(f13, f12, f10);
        float f15 = (i10 * f12) + 0.0f;
        k.b bVarH = new k.b(f12, f11).a(0.0f - (fMax / 2.0f), fB, fMax).h(f12 / 2.0f, 0.0f, f12, i10, true);
        if (i11 > 0) {
            float f16 = (f13 / 2.0f) + f15;
            f15 += f13;
            bVarH.c(f16, fB3, f13, false);
        }
        bVarH.a(f15 + (h.f(context) / 2.0f), fB2, fMin);
        return bVarH.i();
    }

    @Override // com.google.android.material.carousel.g
    boolean f() {
        return false;
    }

    @Override // com.google.android.material.carousel.g
    @NonNull
    k g(@NonNull b bVar, @NonNull View view) {
        float fD = bVar.i() ? bVar.d() : bVar.b();
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        float f10 = ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (bVar.i()) {
            f10 = ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float f11 = measuredHeight;
        float f12 = f10;
        float f13 = f11 + f12;
        float f14 = h.f(view.getContext()) + f12;
        float f15 = h.f(view.getContext()) + f12;
        int iMax = Math.max(1, (int) Math.floor(fD / f13));
        float f16 = fD - (iMax * f13);
        if (bVar.f() == 1) {
            float f17 = f16 / 2.0f;
            return l(fD, f12, f13, iMax, Math.max(Math.min(3.0f * f17, f13), d() + f12), f15, f17);
        }
        return m(view.getContext(), f12, fD, f13, iMax, k(f14, f13, f16), f16 <= 0.0f ? 0 : 1, f15);
    }
}
