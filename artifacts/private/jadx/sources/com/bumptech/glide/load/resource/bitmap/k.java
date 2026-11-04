package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
@w0(api = 28)
public final class k implements com.bumptech.glide.load.l<ByteBuffer, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f97011a = new f();

    @Override // com.bumptech.glide.load.l
    @p0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.v<Bitmap> b(@NonNull ByteBuffer byteBuffer, int i10, int i11, @NonNull com.bumptech.glide.load.j jVar) throws IOException {
        return this.f97011a.b(ImageDecoder.createSource(byteBuffer), i10, i11, jVar);
    }

    @Override // com.bumptech.glide.load.l
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@NonNull ByteBuffer byteBuffer, @NonNull com.bumptech.glide.load.j jVar) throws IOException {
        return true;
    }
}
