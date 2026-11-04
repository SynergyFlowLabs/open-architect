package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f97081g = "com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte[] f97082h = f97081g.getBytes(com.bumptech.glide.load.g.f96793b);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f97083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f97084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f97085e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f97086f;

    public v(float f10, float f11, float f12, float f13) {
        this.f97083c = f10;
        this.f97084d = f11;
        this.f97085e = f12;
        this.f97086f = f13;
    }

    @Override // com.bumptech.glide.load.g
    public void b(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f97082h);
        messageDigest.update(ByteBuffer.allocate(16).putFloat(this.f97083c).putFloat(this.f97084d).putFloat(this.f97085e).putFloat(this.f97086f).array());
    }

    @Override // com.bumptech.glide.load.resource.bitmap.h
    protected Bitmap c(@NonNull com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @NonNull Bitmap bitmap, int i10, int i11) {
        return g0.p(eVar, bitmap, this.f97083c, this.f97084d, this.f97085e, this.f97086f);
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (obj instanceof v) {
            v vVar = (v) obj;
            if (this.f97083c == vVar.f97083c && this.f97084d == vVar.f97084d && this.f97085e == vVar.f97085e && this.f97086f == vVar.f97086f) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return com.bumptech.glide.util.m.m(this.f97086f, com.bumptech.glide.util.m.m(this.f97085e, com.bumptech.glide.util.m.m(this.f97084d, com.bumptech.glide.util.m.o(-2013597734, com.bumptech.glide.util.m.l(this.f97083c)))));
    }
}
