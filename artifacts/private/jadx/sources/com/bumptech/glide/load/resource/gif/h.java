package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.l;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements l<com.bumptech.glide.gifdecoder.a, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f97173a;

    public h(com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        this.f97173a = eVar;
    }

    @Override // com.bumptech.glide.load.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public v<Bitmap> b(@NonNull com.bumptech.glide.gifdecoder.a aVar, int i10, int i11, @NonNull com.bumptech.glide.load.j jVar) {
        return com.bumptech.glide.load.resource.bitmap.g.d(aVar.i(), this.f97173a);
    }

    @Override // com.bumptech.glide.load.l
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@NonNull com.bumptech.glide.gifdecoder.a aVar, @NonNull com.bumptech.glide.load.j jVar) {
        return true;
    }
}
