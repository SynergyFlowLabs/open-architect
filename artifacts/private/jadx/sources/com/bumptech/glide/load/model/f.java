package com.bumptech.glide.load.model;

import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class f<Data> implements n<File, Data> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f96827b = "FileLoader";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d<Data> f96828a;

    public static class a<Data> implements o<File, Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d<Data> f96829a;

        public a(d<Data> dVar) {
            this.f96829a = dVar;
        }

        @Override // com.bumptech.glide.load.model.o
        public final void b() {
        }

        @Override // com.bumptech.glide.load.model.o
        @NonNull
        public final n<File, Data> c(@NonNull r rVar) {
            return new f(this.f96829a);
        }
    }

    public static class b extends a<ParcelFileDescriptor> {

        class a implements d<ParcelFileDescriptor> {
            a() {
            }

            @Override // com.bumptech.glide.load.model.f.d
            public Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }

            @Override // com.bumptech.glide.load.model.f.d
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            @Override // com.bumptech.glide.load.model.f.d
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public ParcelFileDescriptor c(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public b() {
            super(new a());
        }
    }

    private static final class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final File f96830a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d<Data> f96831b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Data f96832c;

        c(File file, d<Data> dVar) {
            this.f96830a = file;
            this.f96831b = dVar;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public Class<Data> a() {
            return this.f96831b.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            Data data = this.f96832c;
            if (data != null) {
                try {
                    this.f96831b.b(data);
                } catch (IOException unused) {
                }
            }
        }

        /* JADX WARN: Type inference failed for: r3v2, types: [Data, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.d
        public void c(@NonNull com.bumptech.glide.h hVar, @NonNull com.bumptech.glide.load.data.d.a<? super Data> aVar) {
            try {
                Data dataC = this.f96831b.c(this.f96830a);
                this.f96832c = dataC;
                aVar.d(dataC);
            } catch (FileNotFoundException e10) {
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

    public interface d<Data> {
        Class<Data> a();

        void b(Data data) throws IOException;

        Data c(File file) throws FileNotFoundException;
    }

    public static class e extends a<InputStream> {

        class a implements d<InputStream> {
            a() {
            }

            @Override // com.bumptech.glide.load.model.f.d
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // com.bumptech.glide.load.model.f.d
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // com.bumptech.glide.load.model.f.d
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream c(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public f(d<Data> dVar) {
        this.f96828a = dVar;
    }

    @Override // com.bumptech.glide.load.model.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<Data> a(@NonNull File file, int i10, int i11, @NonNull com.bumptech.glide.load.j jVar) {
        return new n.a<>(new com.bumptech.glide.signature.e(file), new c(file, this.f96828a));
    }

    @Override // com.bumptech.glide.load.model.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull File file) {
        return true;
    }
}
