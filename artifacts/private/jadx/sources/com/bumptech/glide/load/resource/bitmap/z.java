package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements com.bumptech.glide.load.engine.v<BitmapDrawable>, com.bumptech.glide.load.engine.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f97106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.v<Bitmap> f97107b;

    private z(@NonNull Resources resources, @NonNull com.bumptech.glide.load.engine.v<Bitmap> vVar) {
        this.f97106a = (Resources) com.bumptech.glide.util.k.d(resources);
        this.f97107b = (com.bumptech.glide.load.engine.v) com.bumptech.glide.util.k.d(vVar);
    }

    @p0
    public static com.bumptech.glide.load.engine.v<BitmapDrawable> d(@NonNull Resources resources, @p0 com.bumptech.glide.load.engine.v<Bitmap> vVar) {
        if (vVar == null) {
            return null;
        }
        return new z(resources, vVar);
    }

    @Deprecated
    public static z e(Context context, Bitmap bitmap) {
        return (z) d(context.getResources(), g.d(bitmap, com.bumptech.glide.b.d(context).g()));
    }

    @Deprecated
    public static z f(Resources resources, com.bumptech.glide.load.engine.bitmap_recycle.e eVar, Bitmap bitmap) {
        return (z) d(resources, g.d(bitmap, eVar));
    }

    @Override // com.bumptech.glide.load.engine.v
    public void a() {
        this.f97107b.a();
    }

    @Override // com.bumptech.glide.load.engine.v
    @NonNull
    public Class<BitmapDrawable> b() {
        return BitmapDrawable.class;
    }

    @Override // com.bumptech.glide.load.engine.v
    @NonNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f97106a, this.f97107b.get());
    }

    @Override // com.bumptech.glide.load.engine.v
    public int getSize() {
        return this.f97107b.getSize();
    }

    @Override // com.bumptech.glide.load.engine.r
    public void initialize() {
        com.bumptech.glide.load.engine.v<Bitmap> vVar = this.f97107b;
        if (vVar instanceof com.bumptech.glide.load.engine.r) {
            ((com.bumptech.glide.load.engine.r) vVar).initialize();
        }
    }
}
