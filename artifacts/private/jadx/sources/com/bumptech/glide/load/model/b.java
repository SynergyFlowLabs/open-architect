package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class b<Data> implements n<byte[], Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0866b<Data> f96811a;

    public static class a implements o<byte[], ByteBuffer> {

        /* JADX INFO: renamed from: com.bumptech.glide.load.model.b$a$a, reason: collision with other inner class name */
        class C0865a implements InterfaceC0866b<ByteBuffer> {
            C0865a() {
            }

            @Override // com.bumptech.glide.load.model.b.InterfaceC0866b
            public Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            @Override // com.bumptech.glide.load.model.b.InterfaceC0866b
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // com.bumptech.glide.load.model.o
        public void b() {
        }

        @Override // com.bumptech.glide.load.model.o
        @NonNull
        public n<byte[], ByteBuffer> c(@NonNull r rVar) {
            return new b(new C0865a());
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.b$b, reason: collision with other inner class name */
    public interface InterfaceC0866b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    private static class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f96813a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterfaceC0866b<Data> f96814b;

        c(byte[] bArr, InterfaceC0866b<Data> interfaceC0866b) {
            this.f96813a = bArr;
            this.f96814b = interfaceC0866b;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public Class<Data> a() {
            return this.f96814b.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void c(@NonNull com.bumptech.glide.h hVar, @NonNull com.bumptech.glide.load.data.d.a<? super Data> aVar) {
            aVar.d(this.f96814b.b(this.f96813a));
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

    public static class d implements o<byte[], InputStream> {

        class a implements InterfaceC0866b<InputStream> {
            a() {
            }

            @Override // com.bumptech.glide.load.model.b.InterfaceC0866b
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // com.bumptech.glide.load.model.b.InterfaceC0866b
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // com.bumptech.glide.load.model.o
        public void b() {
        }

        @Override // com.bumptech.glide.load.model.o
        @NonNull
        public n<byte[], InputStream> c(@NonNull r rVar) {
            return new b(new a());
        }
    }

    public b(InterfaceC0866b<Data> interfaceC0866b) {
        this.f96811a = interfaceC0866b;
    }

    @Override // com.bumptech.glide.load.model.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<Data> a(@NonNull byte[] bArr, int i10, int i11, @NonNull com.bumptech.glide.load.j jVar) {
        return new n.a<>(new com.bumptech.glide.signature.e(bArr), new c(bArr, this.f96811a));
    }

    @Override // com.bumptech.glide.load.model.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull byte[] bArr) {
        return true;
    }
}
