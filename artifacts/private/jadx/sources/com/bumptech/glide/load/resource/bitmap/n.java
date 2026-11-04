package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public class n extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f97016c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f97017d = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f97018e = f97017d.getBytes(com.bumptech.glide.load.g.f96793b);

    @Override // com.bumptech.glide.load.g
    public void b(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f97018e);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.h
    protected Bitmap c(@NonNull com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @NonNull Bitmap bitmap, int i10, int i11) {
        return g0.d(eVar, bitmap, i10, i11);
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        return obj instanceof n;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return 1101716364;
    }
}
