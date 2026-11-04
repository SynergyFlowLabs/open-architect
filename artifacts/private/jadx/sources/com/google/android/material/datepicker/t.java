package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
class t extends LinearLayoutManager {
    private static final float O = 100.0f;

    class a extends androidx.recyclerview.widget.s {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.s
        protected float w(DisplayMetrics displayMetrics) {
            return t.O / displayMetrics.densityDpi;
        }
    }

    t(Context context, int i10, boolean z10) {
        super(context, i10, z10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void j2(RecyclerView recyclerView, RecyclerView.c0 c0Var, int i10) {
        a aVar = new a(recyclerView.getContext());
        aVar.q(i10);
        k2(aVar);
    }
}
