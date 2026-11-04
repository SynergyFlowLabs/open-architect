package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class b implements com.bumptech.glide.load.m<BitmapDrawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f96952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.m<Bitmap> f96953b;

    public b(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, com.bumptech.glide.load.m<Bitmap> mVar) {
        this.f96952a = eVar;
        this.f96953b = mVar;
    }

    @Override // com.bumptech.glide.load.m
    @NonNull
    public com.bumptech.glide.load.c b(@NonNull com.bumptech.glide.load.j jVar) {
        return this.f96953b.b(jVar);
    }

    @Override // com.bumptech.glide.load.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(@NonNull com.bumptech.glide.load.engine.v<BitmapDrawable> vVar, @NonNull File file, @NonNull com.bumptech.glide.load.j jVar) {
        return this.f96953b.a((Bitmap) new g(vVar.get().getBitmap(), this.f96952a), file, jVar);
    }
}
