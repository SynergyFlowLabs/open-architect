package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.g1;
import androidx.annotation.p0;
import androidx.annotation.t0;
import com.google.android.material.internal.g0;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @t0
    public int f113221h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @t0
    public int f113222i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f113223j;

    public f(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, r6.a.c.L2);
    }

    int f() {
        int i10 = this.f113190g;
        if (i10 == 0) {
            return 0;
        }
        return (int) Math.round(360.0d / ((((double) ((this.f113221h - (this.f113222i * 2)) - this.f113184a)) * 3.141592653589793d) / ((double) (i10 + this.f113185b))));
    }

    public f(@NonNull Context context, @p0 AttributeSet attributeSet, @androidx.annotation.f int i10) {
        this(context, attributeSet, i10, CircularProgressIndicator.f113145i3);
    }

    public f(@NonNull Context context, @p0 AttributeSet attributeSet, @androidx.annotation.f int i10, @g1 int i11) {
        super(context, attributeSet, i10, i11);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(r6.a.f.f360160dd);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(r6.a.f.Yc);
        TypedArray typedArrayK = g0.k(context, attributeSet, r6.a.o.f362016r7, i10, i11, new int[0]);
        this.f113221h = Math.max(com.google.android.material.resources.c.d(context, typedArrayK, r6.a.o.f362089u7, dimensionPixelSize), this.f113184a * 2);
        this.f113222i = com.google.android.material.resources.c.d(context, typedArrayK, r6.a.o.f362065t7, dimensionPixelSize2);
        this.f113223j = typedArrayK.getInt(r6.a.o.f362041s7, 0);
        typedArrayK.recycle();
        e();
    }
}
