package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@w0(21)
public final class a0 implements com.bumptech.glide.load.l<ParcelFileDescriptor, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f96951a;

    public a0(q qVar) {
        this.f96951a = qVar;
    }

    @Override // com.bumptech.glide.load.l
    @p0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.v<Bitmap> b(@NonNull ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, @NonNull com.bumptech.glide.load.j jVar) throws IOException {
        return this.f96951a.d(parcelFileDescriptor, i10, i11, jVar);
    }

    @Override // com.bumptech.glide.load.l
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@NonNull ParcelFileDescriptor parcelFileDescriptor, @NonNull com.bumptech.glide.load.j jVar) {
        return this.f96951a.o(parcelFileDescriptor);
    }
}
