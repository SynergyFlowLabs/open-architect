package com.bumptech.glide.load.resource.transcode;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.resource.bitmap.z;
import com.bumptech.glide.util.k;

/* JADX INFO: loaded from: classes3.dex */
public class b implements e<Bitmap, BitmapDrawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f97182a;

    public b(@NonNull Context context) {
        this(context.getResources());
    }

    @Override // com.bumptech.glide.load.resource.transcode.e
    @p0
    public v<BitmapDrawable> a(@NonNull v<Bitmap> vVar, @NonNull j jVar) {
        return z.d(this.f97182a, vVar);
    }

    @Deprecated
    public b(@NonNull Resources resources, com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        this(resources);
    }

    public b(@NonNull Resources resources) {
        this.f97182a = (Resources) k.d(resources);
    }
}
