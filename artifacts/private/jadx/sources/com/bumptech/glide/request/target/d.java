package com.bumptech.glide.request.target;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes3.dex */
public class d extends q<Bitmap> {
    public d(ImageView imageView) {
        super(imageView);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.request.target.q
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public Drawable y(Bitmap bitmap) {
        return new BitmapDrawable(((ImageView) this.f97413b).getResources(), bitmap);
    }

    @Deprecated
    public d(ImageView imageView, boolean z10) {
        super(imageView, z10);
    }
}
