package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
public interface d<T> {

    public interface a<T> {
        void d(@p0 T t10);

        void e(@NonNull Exception exc);
    }

    @NonNull
    Class<T> a();

    void b();

    void c(@NonNull com.bumptech.glide.h hVar, @NonNull a<? super T> aVar);

    void cancel();

    @NonNull
    com.bumptech.glide.load.a getDataSource();
}
