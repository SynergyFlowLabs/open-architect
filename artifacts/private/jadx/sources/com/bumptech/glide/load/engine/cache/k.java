package com.bumptech.glide.load.engine.cache;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.bumptech.glide.load.engine.v;

/* JADX INFO: loaded from: classes3.dex */
public class k implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j.a f96482a;

    @Override // com.bumptech.glide.load.engine.cache.j
    public long a() {
        return 0L;
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    public void b(int i10) {
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    public void c() {
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    public void d(float f10) {
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    public long e() {
        return 0L;
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    @p0
    public v<?> f(@NonNull com.bumptech.glide.load.g gVar, @p0 v<?> vVar) {
        if (vVar != null) {
            this.f96482a.d(vVar);
        }
        return null;
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    @p0
    public v<?> g(@NonNull com.bumptech.glide.load.g gVar) {
        return null;
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    public void h(@NonNull j.a aVar) {
        this.f96482a = aVar;
    }
}
