package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class i extends g {
    @Override // com.google.android.material.carousel.g
    @NonNull
    k g(@NonNull b bVar, @NonNull View view) {
        float fB;
        int i10;
        int i11;
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        if (bVar.i()) {
            fB = bVar.d();
            i10 = ((ViewGroup.MarginLayoutParams) qVar).leftMargin;
            i11 = ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        } else {
            fB = bVar.b();
            i10 = ((ViewGroup.MarginLayoutParams) qVar).topMargin;
            i11 = ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }
        float f10 = i10 + i11;
        float f11 = fB;
        return h.e(view.getContext(), f10, f11, new a(0, 0.0f, 0.0f, 0.0f, 0, 0.0f, 0, Math.min(f11 + f10, f11), 1, f11));
    }
}
