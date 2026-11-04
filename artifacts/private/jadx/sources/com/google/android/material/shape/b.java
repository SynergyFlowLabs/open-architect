package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f113528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f113529b;

    public b(float f10, @NonNull e eVar) {
        while (eVar instanceof b) {
            eVar = ((b) eVar).f113528a;
            f10 += ((b) eVar).f113529b;
        }
        this.f113528a = eVar;
        this.f113529b = f10;
    }

    @Override // com.google.android.material.shape.e
    public float a(@NonNull RectF rectF) {
        return Math.max(0.0f, this.f113528a.a(rectF) + this.f113529b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f113528a.equals(bVar.f113528a) && this.f113529b == bVar.f113529b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f113528a, Float.valueOf(this.f113529b)});
    }
}
