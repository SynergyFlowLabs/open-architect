package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
public class g extends j<Drawable> {
    public g(ImageView imageView) {
        super(imageView);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.request.target.j
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void w(@p0 Drawable drawable) {
        ((ImageView) this.f97413b).setImageDrawable(drawable);
    }

    @Deprecated
    public g(ImageView imageView, boolean z10) {
        super(imageView, z10);
    }
}
