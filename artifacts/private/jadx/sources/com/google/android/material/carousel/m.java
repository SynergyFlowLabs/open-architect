package com.google.android.material.carousel;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.x;

/* JADX INFO: loaded from: classes4.dex */
interface m {
    @NonNull
    RectF getMaskRectF();

    @x(from = 0.0d, to = 1.0d)
    @Deprecated
    float getMaskXPercentage();

    void setMaskRectF(@NonNull RectF rectF);

    @Deprecated
    void setMaskXPercentage(@x(from = 0.0d, to = 1.0d) float f10);

    void setOnMaskChangedListener(@p0 r rVar);
}
