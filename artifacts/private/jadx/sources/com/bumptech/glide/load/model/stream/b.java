package com.bumptech.glide.load.model.stream;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.model.m;
import com.bumptech.glide.load.model.n;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.model.r;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class b implements n<com.bumptech.glide.load.model.g, InputStream> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i<Integer> f96898b = i.g("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private final m<com.bumptech.glide.load.model.g, com.bumptech.glide.load.model.g> f96899a;

    public static class a implements o<com.bumptech.glide.load.model.g, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m<com.bumptech.glide.load.model.g, com.bumptech.glide.load.model.g> f96900a = new m<>(500);

        @Override // com.bumptech.glide.load.model.o
        public void b() {
        }

        @Override // com.bumptech.glide.load.model.o
        @NonNull
        public n<com.bumptech.glide.load.model.g, InputStream> c(r rVar) {
            return new b(this.f96900a);
        }
    }

    public b() {
        this(null);
    }

    @Override // com.bumptech.glide.load.model.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<InputStream> a(@NonNull com.bumptech.glide.load.model.g gVar, int i10, int i11, @NonNull j jVar) {
        m<com.bumptech.glide.load.model.g, com.bumptech.glide.load.model.g> mVar = this.f96899a;
        if (mVar != null) {
            com.bumptech.glide.load.model.g gVarB = mVar.b(gVar, 0, 0);
            if (gVarB == null) {
                this.f96899a.c(gVar, 0, 0, gVar);
            } else {
                gVar = gVarB;
            }
        }
        return new n.a<>(gVar, new com.bumptech.glide.load.data.j(gVar, ((Integer) jVar.c(f96898b)).intValue()));
    }

    @Override // com.bumptech.glide.load.model.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull com.bumptech.glide.load.model.g gVar) {
        return true;
    }

    public b(@p0 m<com.bumptech.glide.load.model.g, com.bumptech.glide.load.model.g> mVar) {
        this.f96899a = mVar;
    }
}
