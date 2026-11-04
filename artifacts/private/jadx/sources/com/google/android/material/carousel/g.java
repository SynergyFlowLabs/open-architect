package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.x;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f111755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f111756b;

    static int[] a(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr2[i10] = iArr[i10] * 2;
        }
        return iArr2;
    }

    @x(from = 0.0d, to = 1.0d)
    static float b(float f10, float f11, float f12) {
        return 1.0f - ((f10 - f12) / (f11 - f12));
    }

    public float c() {
        return this.f111756b;
    }

    public float d() {
        return this.f111755a;
    }

    void e(Context context) {
        float fH = this.f111755a;
        if (fH <= 0.0f) {
            fH = h.h(context);
        }
        this.f111755a = fH;
        float fG = this.f111756b;
        if (fG <= 0.0f) {
            fG = h.g(context);
        }
        this.f111756b = fG;
    }

    boolean f() {
        return true;
    }

    abstract k g(@NonNull b bVar, @NonNull View view);

    public void h(float f10) {
        this.f111756b = f10;
    }

    public void i(float f10) {
        this.f111755a = f10;
    }

    boolean j(b bVar, int i10) {
        return false;
    }
}
