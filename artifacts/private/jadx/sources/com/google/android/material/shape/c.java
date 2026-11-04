package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f113530a;

    public c(float f10) {
        this.f113530a = f10;
    }

    @NonNull
    public static c b(@NonNull a aVar) {
        return new c(aVar.b());
    }

    private static float c(@NonNull RectF rectF) {
        return Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
    }

    @Override // com.google.android.material.shape.e
    public float a(@NonNull RectF rectF) {
        return Math.min(this.f113530a, c(rectF));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f113530a == ((c) obj).f113530a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f113530a)});
    }
}
