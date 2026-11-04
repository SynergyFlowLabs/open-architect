package com.google.android.material.animation;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public class h implements TypeEvaluator<Matrix> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f111053a = new float[9];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f111054b = new float[9];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Matrix f111055c = new Matrix();

    @Override // android.animation.TypeEvaluator
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Matrix evaluate(float f10, @NonNull Matrix matrix, @NonNull Matrix matrix2) {
        matrix.getValues(this.f111053a);
        matrix2.getValues(this.f111054b);
        for (int i10 = 0; i10 < 9; i10++) {
            float[] fArr = this.f111054b;
            float f11 = fArr[i10];
            float f12 = this.f111053a[i10];
            fArr[i10] = f12 + ((f11 - f12) * f10);
        }
        this.f111055c.setValues(this.f111054b);
        return this.f111055c;
    }
}
