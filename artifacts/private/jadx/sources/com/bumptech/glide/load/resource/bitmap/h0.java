package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 implements com.bumptech.glide.load.l<Bitmap, Bitmap> {

    private static final class a implements com.bumptech.glide.load.engine.v<Bitmap> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Bitmap f96996a;

        a(@NonNull Bitmap bitmap) {
            this.f96996a = bitmap;
        }

        @Override // com.bumptech.glide.load.engine.v
        public void a() {
        }

        @Override // com.bumptech.glide.load.engine.v
        @NonNull
        public Class<Bitmap> b() {
            return Bitmap.class;
        }

        @Override // com.bumptech.glide.load.engine.v
        @NonNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Bitmap get() {
            return this.f96996a;
        }

        @Override // com.bumptech.glide.load.engine.v
        public int getSize() {
            return com.bumptech.glide.util.m.h(this.f96996a);
        }
    }

    @Override // com.bumptech.glide.load.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.v<Bitmap> b(@NonNull Bitmap bitmap, int i10, int i11, @NonNull com.bumptech.glide.load.j jVar) {
        return new a(bitmap);
    }

    @Override // com.bumptech.glide.load.l
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@NonNull Bitmap bitmap, @NonNull com.bumptech.glide.load.j jVar) {
        return true;
    }
}
