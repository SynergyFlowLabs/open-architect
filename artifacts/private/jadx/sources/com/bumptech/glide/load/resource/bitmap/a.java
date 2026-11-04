package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class a<DataType> implements com.bumptech.glide.load.l<DataType, BitmapDrawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.l<DataType, Bitmap> f96949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources f96950b;

    public a(Context context, com.bumptech.glide.load.l<DataType, Bitmap> lVar) {
        this(context.getResources(), lVar);
    }

    @Override // com.bumptech.glide.load.l
    public boolean a(@NonNull DataType datatype, @NonNull com.bumptech.glide.load.j jVar) throws IOException {
        return this.f96949a.a(datatype, jVar);
    }

    @Override // com.bumptech.glide.load.l
    public com.bumptech.glide.load.engine.v<BitmapDrawable> b(@NonNull DataType datatype, int i10, int i11, @NonNull com.bumptech.glide.load.j jVar) throws IOException {
        return z.d(this.f96950b, this.f96949a.b(datatype, i10, i11, jVar));
    }

    @Deprecated
    public a(Resources resources, com.bumptech.glide.load.engine.bitmap_recycle.e eVar, com.bumptech.glide.load.l<DataType, Bitmap> lVar) {
        this(resources, lVar);
    }

    public a(@NonNull Resources resources, @NonNull com.bumptech.glide.load.l<DataType, Bitmap> lVar) {
        this.f96950b = (Resources) com.bumptech.glide.util.k.d(resources);
        this.f96949a = (com.bumptech.glide.load.l) com.bumptech.glide.util.k.d(lVar);
    }
}
