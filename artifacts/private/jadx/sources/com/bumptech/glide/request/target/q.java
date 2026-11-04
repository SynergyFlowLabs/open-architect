package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q<T> extends j<T> {
    public q(ImageView imageView) {
        super(imageView);
    }

    @Override // com.bumptech.glide.request.target.j
    protected void w(@p0 T t10) {
        ViewGroup.LayoutParams layoutParams = ((ImageView) this.f97413b).getLayoutParams();
        Drawable drawableY = y(t10);
        if (layoutParams != null && layoutParams.width > 0 && layoutParams.height > 0) {
            drawableY = new i(drawableY, layoutParams.width, layoutParams.height);
        }
        ((ImageView) this.f97413b).setImageDrawable(drawableY);
    }

    protected abstract Drawable y(T t10);

    @Deprecated
    public q(ImageView imageView, boolean z10) {
        super(imageView, z10);
    }
}
