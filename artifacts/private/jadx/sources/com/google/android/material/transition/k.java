package com.google.android.material.transition;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends androidx.transition.w {
    private static PointF b(float f10, float f11, float f12, float f13) {
        return f11 > f13 ? new PointF(f12, f11) : new PointF(f10, f13);
    }

    @Override // androidx.transition.w
    @NonNull
    public Path a(float f10, float f11, float f12, float f13) {
        Path path = new Path();
        path.moveTo(f10, f11);
        PointF pointFB = b(f10, f11, f12, f13);
        path.quadTo(pointFB.x, pointFB.y, f12, f13);
        return path;
    }
}
