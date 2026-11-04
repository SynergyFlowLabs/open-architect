package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface n<Model, Data> {

    public static class a<Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.bumptech.glide.load.g f96864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<com.bumptech.glide.load.g> f96865b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.bumptech.glide.load.data.d<Data> f96866c;

        public a(@NonNull com.bumptech.glide.load.g gVar, @NonNull com.bumptech.glide.load.data.d<Data> dVar) {
            this(gVar, Collections.EMPTY_LIST, dVar);
        }

        public a(@NonNull com.bumptech.glide.load.g gVar, @NonNull List<com.bumptech.glide.load.g> list, @NonNull com.bumptech.glide.load.data.d<Data> dVar) {
            this.f96864a = (com.bumptech.glide.load.g) com.bumptech.glide.util.k.d(gVar);
            this.f96865b = (List) com.bumptech.glide.util.k.d(list);
            this.f96866c = (com.bumptech.glide.load.data.d) com.bumptech.glide.util.k.d(dVar);
        }
    }

    @p0
    a<Data> a(@NonNull Model model, int i10, int i11, @NonNull com.bumptech.glide.load.j jVar);

    boolean b(@NonNull Model model);
}
