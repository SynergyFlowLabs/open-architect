package com.bumptech.glide.load.model.stream;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.model.n;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.model.r;
import java.io.InputStream;
import java.net.URL;

/* JADX INFO: loaded from: classes3.dex */
public class g implements n<URL, InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n<com.bumptech.glide.load.model.g, InputStream> f96924a;

    public static class a implements o<URL, InputStream> {
        @Override // com.bumptech.glide.load.model.o
        public void b() {
        }

        @Override // com.bumptech.glide.load.model.o
        @NonNull
        public n<URL, InputStream> c(r rVar) {
            return new g(rVar.d(com.bumptech.glide.load.model.g.class, InputStream.class));
        }
    }

    public g(n<com.bumptech.glide.load.model.g, InputStream> nVar) {
        this.f96924a = nVar;
    }

    @Override // com.bumptech.glide.load.model.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<InputStream> a(@NonNull URL url, int i10, int i11, @NonNull j jVar) {
        return this.f96924a.a(new com.bumptech.glide.load.model.g(url), i10, i11, jVar);
    }

    @Override // com.bumptech.glide.load.model.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull URL url) {
        return true;
    }
}
