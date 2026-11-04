package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
class e<DataType> implements com.bumptech.glide.load.engine.cache.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.d<DataType> f96511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DataType f96512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.j f96513c;

    e(com.bumptech.glide.load.d<DataType> dVar, DataType datatype, com.bumptech.glide.load.j jVar) {
        this.f96511a = dVar;
        this.f96512b = datatype;
        this.f96513c = jVar;
    }

    @Override // com.bumptech.glide.load.engine.cache.a.b
    public boolean a(@NonNull File file) {
        return this.f96511a.a(this.f96512b, file, this.f96513c);
    }
}
