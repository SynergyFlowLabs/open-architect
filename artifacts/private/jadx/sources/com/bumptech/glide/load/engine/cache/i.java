package com.bumptech.glide.load.engine.cache;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.bumptech.glide.load.engine.v;

/* JADX INFO: loaded from: classes3.dex */
public class i extends com.bumptech.glide.util.h<com.bumptech.glide.load.g, v<?>> implements j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private j.a f96481e;

    public i(long j10) {
        super(j10);
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    @e.a({"InlinedApi"})
    public void b(int i10) {
        if (i10 >= 40) {
            c();
        } else if (i10 >= 20 || i10 == 15) {
            q(a() / 2);
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    @p0
    public /* bridge */ /* synthetic */ v f(@NonNull com.bumptech.glide.load.g gVar, @p0 v vVar) {
        return (v) super.o(gVar, vVar);
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    @p0
    public /* bridge */ /* synthetic */ v g(@NonNull com.bumptech.glide.load.g gVar) {
        return (v) super.p(gVar);
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    public void h(@NonNull j.a aVar) {
        this.f96481e = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.util.h
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public int m(@p0 v<?> vVar) {
        return vVar == null ? super.m(null) : vVar.getSize();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.util.h
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void n(@NonNull com.bumptech.glide.load.g gVar, @p0 v<?> vVar) {
        j.a aVar = this.f96481e;
        if (aVar == null || vVar == null) {
            return;
        }
        aVar.d(vVar);
    }
}
