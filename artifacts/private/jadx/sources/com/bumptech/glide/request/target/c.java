package com.bumptech.glide.request.target;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes3.dex */
public class c extends j<Bitmap> {
    public c(ImageView imageView) {
        super(imageView);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.request.target.j
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void w(Bitmap bitmap) {
        ((ImageView) this.f97413b).setImageBitmap(bitmap);
    }

    @Deprecated
    public c(ImageView imageView, boolean z10) {
        super(imageView, z10);
    }
}
