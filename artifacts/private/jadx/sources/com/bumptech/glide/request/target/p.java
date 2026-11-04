package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
public interface p<R> extends com.bumptech.glide.manager.i {
    public static final int I1 = Integer.MIN_VALUE;

    void d(@NonNull o oVar);

    @p0
    com.bumptech.glide.request.d getRequest();

    void h(@p0 Drawable drawable);

    void i(@NonNull R r10, @p0 com.bumptech.glide.request.transition.f<? super R> fVar);

    void n(@p0 Drawable drawable);

    void p(@p0 com.bumptech.glide.request.d dVar);

    void q(@p0 Drawable drawable);

    void s(@NonNull o oVar);
}
