package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
public class c0 implements com.bumptech.glide.load.l<Uri, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.resource.drawable.e f96962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f96963b;

    public c0(com.bumptech.glide.load.resource.drawable.e eVar, com.bumptech.glide.load.engine.bitmap_recycle.e eVar2) {
        this.f96962a = eVar;
        this.f96963b = eVar2;
    }

    @Override // com.bumptech.glide.load.l
    @p0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.v<Bitmap> b(@NonNull Uri uri, int i10, int i11, @NonNull com.bumptech.glide.load.j jVar) {
        com.bumptech.glide.load.engine.v<Drawable> vVarB = this.f96962a.b(uri, i10, i11, jVar);
        if (vVarB == null) {
            return null;
        }
        return r.a(this.f96963b, vVarB.get(), i10, i11);
    }

    @Override // com.bumptech.glide.load.l
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@NonNull Uri uri, @NonNull com.bumptech.glide.load.j jVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
