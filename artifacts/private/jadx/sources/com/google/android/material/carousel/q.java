package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f111799d = {1};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f111800e = {1, 0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f111801c = 0;

    @Override // com.google.android.material.carousel.g
    @NonNull
    k g(@NonNull b bVar, @NonNull View view) {
        float fB = bVar.b();
        if (bVar.i()) {
            fB = bVar.d();
        }
        float f10 = fB;
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        float f11 = ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (bVar.i()) {
            f11 = ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float f12 = f11;
        float fD = d() + f12;
        float fMax = Math.max(c() + f12, fD);
        float fMin = Math.min(measuredHeight + f12, f10);
        float fD2 = n1.a.d((measuredHeight / 3.0f) + f12, fD + f12, fMax + f12);
        float f13 = (fMin + fD2) / 2.0f;
        int[] iArrA = f111799d;
        if (f10 < 2.0f * fD) {
            iArrA = new int[]{0};
        }
        int[] iArrA2 = f111800e;
        if (bVar.f() == 1) {
            iArrA = g.a(iArrA);
            iArrA2 = g.a(iArrA2);
        }
        int[] iArr = iArrA2;
        int[] iArr2 = iArrA;
        int iMax = (int) Math.max(1.0d, Math.floor(((f10 - (h.i(iArr) * f13)) - (h.i(iArr2) * fMax)) / fMin));
        int iCeil = (int) Math.ceil(f10 / fMin);
        int i10 = (iCeil - iMax) + 1;
        int[] iArr3 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr3[i11] = iCeil - i11;
        }
        a aVarC = a.c(f10, fD2, fD, fMax, iArr2, f13, iArr, fMin, iArr3);
        this.f111801c = aVarC.e();
        if (k(aVarC, bVar.a())) {
            aVarC = a.c(f10, fD2, fD, fMax, new int[]{aVarC.f111738c}, f13, new int[]{aVarC.f111739d}, fMin, new int[]{aVarC.f111742g});
        }
        return h.d(view.getContext(), f12, f10, aVarC, bVar.f());
    }

    @Override // com.google.android.material.carousel.g
    boolean j(b bVar, int i10) {
        return (i10 < this.f111801c && bVar.a() >= this.f111801c) || (i10 >= this.f111801c && bVar.a() < this.f111801c);
    }

    boolean k(a aVar, int i10) {
        int iE = aVar.e() - i10;
        boolean z10 = iE > 0 && (aVar.f111738c > 0 || aVar.f111739d > 1);
        while (iE > 0) {
            int i11 = aVar.f111738c;
            if (i11 > 0) {
                aVar.f111738c = i11 - 1;
            } else {
                int i12 = aVar.f111739d;
                if (i12 > 1) {
                    aVar.f111739d = i12 - 1;
                }
            }
            iE--;
        }
        return z10;
    }
}
