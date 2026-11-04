package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class d implements n<File, ByteBuffer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f96817a = "ByteBufferFileLoader";

    private static final class a implements com.bumptech.glide.load.data.d<ByteBuffer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final File f96818a;

        a(File file) {
            this.f96818a = file;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void c(@NonNull com.bumptech.glide.h hVar, @NonNull com.bumptech.glide.load.data.d.a<? super ByteBuffer> aVar) {
            try {
                aVar.d(com.bumptech.glide.util.a.a(this.f96818a));
            } catch (IOException e10) {
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

    public static class b implements o<File, ByteBuffer> {
        @Override // com.bumptech.glide.load.model.o
        public void b() {
        }

        @Override // com.bumptech.glide.load.model.o
        @NonNull
        public n<File, ByteBuffer> c(@NonNull r rVar) {
            return new d();
        }
    }

    @Override // com.bumptech.glide.load.model.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<ByteBuffer> a(@NonNull File file, int i10, int i11, @NonNull com.bumptech.glide.load.j jVar) {
        return new n.a<>(new com.bumptech.glide.signature.e(file), new a(file));
    }

    @Override // com.bumptech.glide.load.model.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull File file) {
        return true;
    }
}
