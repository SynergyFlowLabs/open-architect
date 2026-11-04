package com.bumptech.glide.load.resource.transcode;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.j;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class a implements e<Bitmap, byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bitmap.CompressFormat f97180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f97181b;

    public a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // com.bumptech.glide.load.resource.transcode.e
    @p0
    public v<byte[]> a(@NonNull v<Bitmap> vVar, @NonNull j jVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        vVar.get().compress(this.f97180a, this.f97181b, byteArrayOutputStream);
        vVar.a();
        return new w4.b(byteArrayOutputStream.toByteArray());
    }

    public a(@NonNull Bitmap.CompressFormat compressFormat, int i10) {
        this.f97180a = compressFormat;
        this.f97181b = i10;
    }
}
