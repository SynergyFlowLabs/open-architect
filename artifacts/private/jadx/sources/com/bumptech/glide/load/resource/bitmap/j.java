package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class j implements com.bumptech.glide.load.l<ByteBuffer, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f96997a;

    public j(q qVar) {
        this.f96997a = qVar;
    }

    @Override // com.bumptech.glide.load.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.v<Bitmap> b(@NonNull ByteBuffer byteBuffer, int i10, int i11, @NonNull com.bumptech.glide.load.j jVar) throws IOException {
        return this.f96997a.f(com.bumptech.glide.util.a.f(byteBuffer), i10, i11, jVar);
    }

    @Override // com.bumptech.glide.load.l
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@NonNull ByteBuffer byteBuffer, @NonNull com.bumptech.glide.load.j jVar) {
        return this.f96997a.q(byteBuffer);
    }
}
