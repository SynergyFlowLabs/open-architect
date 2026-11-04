package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public interface e {
    long a();

    void b(int i10);

    void c();

    void d(float f10);

    void e(Bitmap bitmap);

    @NonNull
    Bitmap f(int i10, int i11, Bitmap.Config config);

    @NonNull
    Bitmap g(int i10, int i11, Bitmap.Config config);
}
