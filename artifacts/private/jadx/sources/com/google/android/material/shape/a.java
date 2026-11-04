package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f113527a;

    public a(float f10) {
        this.f113527a = f10;
    }

    @Override // com.google.android.material.shape.e
    public float a(@NonNull RectF rectF) {
        return this.f113527a;
    }

    public float b() {
        return this.f113527a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f113527a == ((a) obj).f113527a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f113527a)});
    }
}
