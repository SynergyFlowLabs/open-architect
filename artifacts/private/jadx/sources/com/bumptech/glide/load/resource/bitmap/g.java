package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
public class g implements com.bumptech.glide.load.engine.v<Bitmap>, com.bumptech.glide.load.engine.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bitmap f96981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f96982b;

    public g(@NonNull Bitmap bitmap, @NonNull com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        this.f96981a = (Bitmap) com.bumptech.glide.util.k.e(bitmap, "Bitmap must not be null");
        this.f96982b = (com.bumptech.glide.load.engine.bitmap_recycle.e) com.bumptech.glide.util.k.e(eVar, "BitmapPool must not be null");
    }

    @p0
    public static g d(@p0 Bitmap bitmap, @NonNull com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        if (bitmap == null) {
            return null;
        }
        return new g(bitmap, eVar);
    }

    @Override // com.bumptech.glide.load.engine.v
    public void a() {
        this.f96982b.e(this.f96981a);
    }

    @Override // com.bumptech.glide.load.engine.v
    @NonNull
    public Class<Bitmap> b() {
        return Bitmap.class;
    }

    @Override // com.bumptech.glide.load.engine.v
    @NonNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.f96981a;
    }

    @Override // com.bumptech.glide.load.engine.v
    public int getSize() {
        return com.bumptech.glide.util.m.h(this.f96981a);
    }

    @Override // com.bumptech.glide.load.engine.r
    public void initialize() {
        this.f96981a.prepareToDraw();
    }
}
