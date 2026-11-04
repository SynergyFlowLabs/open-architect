package com.bumptech.glide.request.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
public interface f<R> {

    public interface a {
        @p0
        Drawable c();

        void e(Drawable drawable);

        View getView();
    }

    boolean a(R r10, a aVar);
}
