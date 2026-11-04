package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public class y implements TimeInterpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TimeInterpolator f112957a;

    public y(@NonNull TimeInterpolator timeInterpolator) {
        this.f112957a = timeInterpolator;
    }

    @NonNull
    public static TimeInterpolator a(boolean z10, @NonNull TimeInterpolator timeInterpolator) {
        return z10 ? timeInterpolator : new y(timeInterpolator);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        return 1.0f - this.f112957a.getInterpolation(f10);
    }
}
