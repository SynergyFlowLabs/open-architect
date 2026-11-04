package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class v<Model> implements n<Model, Model> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final v<?> f96928a = new v<>();

    public static class a<Model> implements o<Model, Model> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a<?> f96929a = new a<>();

        @Deprecated
        public a() {
        }

        public static <T> a<T> a() {
            return (a<T>) f96929a;
        }

        @Override // com.bumptech.glide.load.model.o
        public void b() {
        }

        @Override // com.bumptech.glide.load.model.o
        @NonNull
        public n<Model, Model> c(r rVar) {
            return v.c();
        }
    }

    private static class b<Model> implements com.bumptech.glide.load.data.d<Model> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Model f96930a;

        b(Model model) {
            this.f96930a = model;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public Class<Model> a() {
            return (Class<Model>) this.f96930a.getClass();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void c(@NonNull com.bumptech.glide.h hVar, @NonNull com.bumptech.glide.load.data.d.a<? super Model> aVar) {
            aVar.d(this.f96930a);
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public com.bumptech.glide.load.a getDataSource() {
            return com.bumptech.glide.load.a.LOCAL;
        }
    }

    @Deprecated
    public v() {
    }

    public static <T> v<T> c() {
        return (v<T>) f96928a;
    }

    @Override // com.bumptech.glide.load.model.n
    public n.a<Model> a(@NonNull Model model, int i10, int i11, @NonNull com.bumptech.glide.load.j jVar) {
        return new n.a<>(new com.bumptech.glide.signature.e(model), new b(model));
    }

    @Override // com.bumptech.glide.load.model.n
    public boolean b(@NonNull Model model) {
        return true;
    }
}
