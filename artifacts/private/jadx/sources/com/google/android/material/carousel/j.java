package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class j extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f111757d = {1};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f111758e = {0, 1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f111759c = 0;

    @Override // com.google.android.material.carousel.g
    @NonNull
    k g(@NonNull b bVar, @NonNull View view) {
        int iB = bVar.b();
        if (bVar.i()) {
            iB = bVar.d();
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        float f10 = ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        float measuredWidth = view.getMeasuredWidth() * 2;
        if (bVar.i()) {
            f10 = ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
            measuredWidth = view.getMeasuredHeight() * 2;
        }
        float fD = d() + f10;
        float fMax = Math.max(c() + f10, fD);
        float f11 = iB;
        float fMin = Math.min(measuredWidth + f10, f11);
        float fD2 = n1.a.d((measuredWidth / 3.0f) + f10, fD + f10, fMax + f10);
        float f12 = (fMin + fD2) / 2.0f;
        int[] iArr = f111757d;
        int i10 = 0;
        int[] iArr2 = f11 < 2.0f * fD ? new int[]{0} : iArr;
        int iMax = (int) Math.max(1.0d, Math.floor((f11 - (h.i(iArr) * fMax)) / fMin));
        int iCeil = (((int) Math.ceil(f11 / fMin)) - iMax) + 1;
        int[] iArr3 = new int[iCeil];
        for (int i11 = 0; i11 < iCeil; i11++) {
            iArr3[i11] = iMax + i11;
        }
        int i12 = bVar.f() == 1 ? 1 : 0;
        a aVarC = a.c(f11, fD2, fD, fMax, i12 != 0 ? g.a(iArr2) : iArr2, f12, i12 != 0 ? g.a(f111758e) : f111758e, fMin, iArr3);
        this.f111759c = aVarC.e();
        if (aVarC.e() > bVar.a()) {
            aVarC = a.c(f11, fD2, fD, fMax, iArr2, f12, f111758e, fMin, iArr3);
        } else {
            i10 = i12;
        }
        return h.d(view.getContext(), f10, f11, aVarC, i10);
    }

    @Override // com.google.android.material.carousel.g
    boolean j(@NonNull b bVar, int i10) {
        return bVar.f() == 1 && ((i10 < this.f111759c && bVar.a() >= this.f111759c) || (i10 >= this.f111759c && bVar.a() < this.f111759c));
    }
}
