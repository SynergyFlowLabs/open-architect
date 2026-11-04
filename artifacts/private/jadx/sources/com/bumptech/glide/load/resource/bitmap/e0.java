package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f96972d = "com.bumptech.glide.load.resource.bitmap.RoundedCorners";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f96973e = f96972d.getBytes(com.bumptech.glide.load.g.f96793b);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f96974c;

    public e0(int i10) {
        com.bumptech.glide.util.k.a(i10 > 0, "roundingRadius must be greater than 0.");
        this.f96974c = i10;
    }

    @Override // com.bumptech.glide.load.g
    public void b(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f96973e);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f96974c).array());
    }

    @Override // com.bumptech.glide.load.resource.bitmap.h
    protected Bitmap c(@NonNull com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @NonNull Bitmap bitmap, int i10, int i11) {
        return g0.q(eVar, bitmap, this.f96974c);
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        return (obj instanceof e0) && this.f96974c == ((e0) obj).f96974c;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return com.bumptech.glide.util.m.o(-569625254, com.bumptech.glide.util.m.n(this.f96974c));
    }
}
