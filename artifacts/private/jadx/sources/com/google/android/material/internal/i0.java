package com.google.android.material.internal;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
class i0 extends l0 implements k0 {
    i0(Context context, ViewGroup viewGroup, View view) {
        super(context, viewGroup, view);
    }

    static i0 f(ViewGroup viewGroup) {
        return (i0) l0.e(viewGroup);
    }

    @Override // com.google.android.material.internal.k0
    public void c(@NonNull View view) {
        this.f112873a.b(view);
    }

    @Override // com.google.android.material.internal.k0
    public void d(@NonNull View view) {
        this.f112873a.h(view);
    }
}
