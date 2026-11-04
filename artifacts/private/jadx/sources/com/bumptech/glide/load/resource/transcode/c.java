package com.bumptech.glide.load.resource.transcode;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.j;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements e<Drawable, byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f97183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e<Bitmap, byte[]> f97184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e<com.bumptech.glide.load.resource.gif.c, byte[]> f97185c;

    public c(@NonNull com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @NonNull e<Bitmap, byte[]> eVar2, @NonNull e<com.bumptech.glide.load.resource.gif.c, byte[]> eVar3) {
        this.f97183a = eVar;
        this.f97184b = eVar2;
        this.f97185c = eVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    private static v<com.bumptech.glide.load.resource.gif.c> b(@NonNull v<Drawable> vVar) {
        return vVar;
    }

    @Override // com.bumptech.glide.load.resource.transcode.e
    @p0
    public v<byte[]> a(@NonNull v<Drawable> vVar, @NonNull j jVar) {
        Drawable drawable = vVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f97184b.a(com.bumptech.glide.load.resource.bitmap.g.d(((BitmapDrawable) drawable).getBitmap(), this.f97183a), jVar);
        }
        if (drawable instanceof com.bumptech.glide.load.resource.gif.c) {
            return this.f97185c.a(b(vVar), jVar);
        }
        return null;
    }
}
