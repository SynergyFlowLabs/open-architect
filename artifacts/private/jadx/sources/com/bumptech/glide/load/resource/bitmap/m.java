package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public class m extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f97014c = "com.bumptech.glide.load.resource.bitmap.CenterInside";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f97015d = f97014c.getBytes(com.bumptech.glide.load.g.f96793b);

    @Override // com.bumptech.glide.load.g
    public void b(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f97015d);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.h
    protected Bitmap c(@NonNull com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @NonNull Bitmap bitmap, int i10, int i11) {
        return g0.c(eVar, bitmap, i10, i11);
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        return obj instanceof m;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return -670243078;
    }
}
