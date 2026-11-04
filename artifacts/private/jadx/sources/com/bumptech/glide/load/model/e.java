package com.bumptech.glide.load.model;

import android.util.Base64;
import androidx.annotation.NonNull;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class e<Model, Data> implements n<Model, Data> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f96819b = "data:image";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f96820c = ";base64";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a<Data> f96821a;

    public interface a<Data> {
        Class<Data> a();

        void b(Data data) throws IOException;

        Data c(String str) throws IllegalArgumentException;
    }

    private static final class b<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f96822a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a<Data> f96823b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Data f96824c;

        b(String str, a<Data> aVar) {
            this.f96822a = str;
            this.f96823b = aVar;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public Class<Data> a() {
            return this.f96823b.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            try {
                this.f96823b.b(this.f96824c);
            } catch (IOException unused) {
            }
        }

        /* JADX WARN: Type inference failed for: r3v2, types: [Data, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.d
        public void c(@NonNull com.bumptech.glide.h hVar, @NonNull com.bumptech.glide.load.data.d.a<? super Data> aVar) {
            try {
                Data dataC = this.f96823b.c(this.f96822a);
                this.f96824c = dataC;
                aVar.d(dataC);
            } catch (IllegalArgumentException e10) {
                aVar.e(e10);
            }
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

    public static final class c<Model> implements o<Model, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a<InputStream> f96825a = new a();

        class a implements a<InputStream> {
            a() {
            }

            @Override // com.bumptech.glide.load.model.e.a
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // com.bumptech.glide.load.model.e.a
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // com.bumptech.glide.load.model.e.a
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream c(String str) {
                if (!str.startsWith(e.f96819b)) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int iIndexOf = str.indexOf(44);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, iIndexOf).endsWith(e.f96820c)) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
        }

        @Override // com.bumptech.glide.load.model.o
        public void b() {
        }

        @Override // com.bumptech.glide.load.model.o
        @NonNull
        public n<Model, InputStream> c(@NonNull r rVar) {
            return new e(this.f96825a);
        }
    }

    public e(a<Data> aVar) {
        this.f96821a = aVar;
    }

    @Override // com.bumptech.glide.load.model.n
    public n.a<Data> a(@NonNull Model model, int i10, int i11, @NonNull com.bumptech.glide.load.j jVar) {
        return new n.a<>(new com.bumptech.glide.signature.e(model), new b(model.toString(), this.f96821a));
    }

    @Override // com.bumptech.glide.load.model.n
    public boolean b(@NonNull Model model) {
        return model.toString().startsWith(f96819b);
    }
}
