package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.resource.bitmap.b0;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements e<InputStream> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f96332b = 5242880;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b0 f96333a;

    public static final class a implements e.a<InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.bumptech.glide.load.engine.bitmap_recycle.b f96334a;

        public a(com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.f96334a = bVar;
        }

        @Override // com.bumptech.glide.load.data.e.a
        @NonNull
        public Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        @NonNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public e<InputStream> b(InputStream inputStream) {
            return new k(inputStream, this.f96334a);
        }
    }

    public k(InputStream inputStream, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        b0 b0Var = new b0(inputStream, bVar);
        this.f96333a = b0Var;
        b0Var.mark(f96332b);
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
        this.f96333a.release();
    }

    public void c() {
        this.f96333a.b();
    }

    @Override // com.bumptech.glide.load.data.e
    @NonNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public InputStream a() throws IOException {
        this.f96333a.reset();
        return this.f96333a;
    }
}
