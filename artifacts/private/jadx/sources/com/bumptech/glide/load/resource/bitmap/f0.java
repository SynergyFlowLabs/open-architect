package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class f0 implements com.bumptech.glide.load.l<InputStream, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f96977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f96978b;

    static class a implements q.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b0 f96979a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.bumptech.glide.util.d f96980b;

        a(b0 b0Var, com.bumptech.glide.util.d dVar) {
            this.f96979a = b0Var;
            this.f96980b = dVar;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q.b
        public void a() {
            this.f96979a.b();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q.b
        public void b(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, Bitmap bitmap) throws IOException {
            IOException iOExceptionB = this.f96980b.b();
            if (iOExceptionB != null) {
                if (bitmap != null) {
                    eVar.e(bitmap);
                }
                throw iOExceptionB;
            }
        }
    }

    public f0(q qVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.f96977a = qVar;
        this.f96978b = bVar;
    }

    @Override // com.bumptech.glide.load.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.v<Bitmap> b(@NonNull InputStream inputStream, int i10, int i11, @NonNull com.bumptech.glide.load.j jVar) throws IOException {
        boolean z10;
        b0 b0Var;
        if (inputStream instanceof b0) {
            b0Var = (b0) inputStream;
            z10 = false;
        } else {
            z10 = true;
            b0Var = new b0(inputStream, this.f96978b);
        }
        com.bumptech.glide.util.d dVarC = com.bumptech.glide.util.d.c(b0Var);
        try {
            com.bumptech.glide.load.engine.v<Bitmap> vVarG = this.f96977a.g(new com.bumptech.glide.util.i(dVarC), i10, i11, jVar, new a(b0Var, dVarC));
            dVarC.release();
            if (z10) {
            }
            return vVarG;
        } finally {
            dVarC.release();
            if (z10) {
                b0Var.release();
            }
        }
    }

    @Override // com.bumptech.glide.load.l
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@NonNull InputStream inputStream, @NonNull com.bumptech.glide.load.j jVar) {
        return this.f96977a.p(inputStream);
    }
}
