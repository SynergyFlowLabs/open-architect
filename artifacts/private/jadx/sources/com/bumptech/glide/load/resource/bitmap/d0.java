package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public class d0 extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f96965d = "com.bumptech.glide.load.resource.bitmap.Rotate";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f96966e = f96965d.getBytes(com.bumptech.glide.load.g.f96793b);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f96967c;

    public d0(int i10) {
        this.f96967c = i10;
    }

    @Override // com.bumptech.glide.load.g
    public void b(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f96966e);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f96967c).array());
    }

    @Override // com.bumptech.glide.load.resource.bitmap.h
    protected Bitmap c(@NonNull com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @NonNull Bitmap bitmap, int i10, int i11) {
        return g0.n(bitmap, this.f96967c);
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        return (obj instanceof d0) && this.f96967c == ((d0) obj).f96967c;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return com.bumptech.glide.util.m.o(-950519196, com.bumptech.glide.util.m.n(this.f96967c));
    }
}
