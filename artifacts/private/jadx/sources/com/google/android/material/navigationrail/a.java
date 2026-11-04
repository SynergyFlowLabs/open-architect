package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.j0;
import androidx.annotation.q;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
final class a extends com.google.android.material.navigation.c {
    public a(@NonNull Context context) {
        super(context);
    }

    @Override // com.google.android.material.navigation.c
    @q
    protected int getItemDefaultMarginResId() {
        return r6.a.f.Rc;
    }

    @Override // com.google.android.material.navigation.c
    @j0
    protected int getItemLayoutResId() {
        return r6.a.k.G0;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i11) == 0) {
            setMeasuredDimension(getMeasuredWidthAndState(), Math.max(getMeasuredHeight(), View.MeasureSpec.getSize(i11)));
        }
    }
}
