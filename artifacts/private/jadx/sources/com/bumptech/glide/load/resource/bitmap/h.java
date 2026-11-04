package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h implements com.bumptech.glide.load.n<Bitmap> {
    @Override // com.bumptech.glide.load.n
    @NonNull
    public final com.bumptech.glide.load.engine.v<Bitmap> a(@NonNull Context context, @NonNull com.bumptech.glide.load.engine.v<Bitmap> vVar, int i10, int i11) {
        if (!com.bumptech.glide.util.m.v(i10, i11)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i10 + " or height: " + i11 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        com.bumptech.glide.load.engine.bitmap_recycle.e eVarG = com.bumptech.glide.b.d(context).g();
        Bitmap bitmap = vVar.get();
        if (i10 == Integer.MIN_VALUE) {
            i10 = bitmap.getWidth();
        }
        if (i11 == Integer.MIN_VALUE) {
            i11 = bitmap.getHeight();
        }
        Bitmap bitmapC = c(eVarG, bitmap, i10, i11);
        return bitmap.equals(bitmapC) ? vVar : g.d(bitmapC, eVarG);
    }

    protected abstract Bitmap c(@NonNull com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @NonNull Bitmap bitmap, int i10, int i11);
}
