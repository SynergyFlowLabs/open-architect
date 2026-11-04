package com.google.android.material.progressindicator;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.g1;
import androidx.annotation.p0;
import androidx.annotation.t0;
import com.google.android.material.color.u;
import com.google.android.material.internal.g0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @t0
    public int f113184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @t0
    public int f113185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public int[] f113186c = new int[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.l
    public int f113187d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f113188e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f113189f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @t0
    public int f113190g;

    protected c(@NonNull Context context, @p0 AttributeSet attributeSet, @androidx.annotation.f int i10, @g1 int i11) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(r6.a.f.f360256jd);
        TypedArray typedArrayK = g0.k(context, attributeSet, r6.a.o.A4, i10, i11, new int[0]);
        this.f113184a = com.google.android.material.resources.c.d(context, typedArrayK, r6.a.o.K4, dimensionPixelSize);
        this.f113185b = Math.min(com.google.android.material.resources.c.d(context, typedArrayK, r6.a.o.J4, 0), this.f113184a / 2);
        this.f113188e = typedArrayK.getInt(r6.a.o.G4, 0);
        this.f113189f = typedArrayK.getInt(r6.a.o.C4, 0);
        this.f113190g = typedArrayK.getDimensionPixelSize(r6.a.o.E4, 0);
        c(context, typedArrayK);
        d(context, typedArrayK);
        typedArrayK.recycle();
    }

    private void c(@NonNull Context context, @NonNull TypedArray typedArray) {
        if (!typedArray.hasValue(r6.a.o.D4)) {
            this.f113186c = new int[]{u.b(context, r6.a.c.R3, -1)};
            return;
        }
        if (typedArray.peekValue(r6.a.o.D4).type != 1) {
            this.f113186c = new int[]{typedArray.getColor(r6.a.o.D4, -1)};
            return;
        }
        int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(r6.a.o.D4, -1));
        this.f113186c = intArray;
        if (intArray.length == 0) {
            throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        }
    }

    private void d(@NonNull Context context, @NonNull TypedArray typedArray) {
        if (typedArray.hasValue(r6.a.o.I4)) {
            this.f113187d = typedArray.getColor(r6.a.o.I4, -1);
            return;
        }
        this.f113187d = this.f113186c[0];
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.disabledAlpha});
        float f10 = typedArrayObtainStyledAttributes.getFloat(0, 0.2f);
        typedArrayObtainStyledAttributes.recycle();
        this.f113187d = u.a(this.f113187d, (int) (f10 * 255.0f));
    }

    public boolean a() {
        return this.f113189f != 0;
    }

    public boolean b() {
        return this.f113188e != 0;
    }

    @androidx.annotation.i
    void e() {
        if (this.f113190g < 0) {
            throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
    }
}
