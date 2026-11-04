package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f113593a;

    public n(@androidx.annotation.x(from = 0.0d, to = 1.0d) float f10) {
        this.f113593a = f10;
    }

    @NonNull
    @b1({b1.a.LIBRARY_GROUP})
    public static n b(@NonNull RectF rectF, @NonNull e eVar) {
        return eVar instanceof n ? (n) eVar : new n(eVar.a(rectF) / c(rectF));
    }

    private static float c(@NonNull RectF rectF) {
        return Math.min(rectF.width(), rectF.height());
    }

    @Override // com.google.android.material.shape.e
    public float a(@NonNull RectF rectF) {
        return this.f113593a * c(rectF);
    }

    @androidx.annotation.x(from = 0.0d, to = 1.0d)
    public float d() {
        return this.f113593a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && this.f113593a == ((n) obj).f113593a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f113593a)});
    }
}
