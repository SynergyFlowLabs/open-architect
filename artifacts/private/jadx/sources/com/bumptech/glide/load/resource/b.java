package com.bumptech.glide.load.resource;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.util.k;

/* JADX INFO: loaded from: classes3.dex */
public class b<T> implements v<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final T f96948a;

    public b(@NonNull T t10) {
        this.f96948a = (T) k.d(t10);
    }

    @Override // com.bumptech.glide.load.engine.v
    public void a() {
    }

    @Override // com.bumptech.glide.load.engine.v
    @NonNull
    public Class<T> b() {
        return (Class<T>) this.f96948a.getClass();
    }

    @Override // com.bumptech.glide.load.engine.v
    @NonNull
    public final T get() {
        return this.f96948a;
    }

    @Override // com.bumptech.glide.load.engine.v
    public final int getSize() {
        return 1;
    }
}
