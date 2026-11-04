package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, com.google.firebase.encoders.e<?>> f122045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, com.google.firebase.encoders.g<?>> f122046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.firebase.encoders.e<Object> f122047c;

    public static final class a implements l8.b<a> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.e<Object> f122048d = new com.google.firebase.encoders.e() { // from class: com.google.firebase.encoders.proto.g
            @Override // com.google.firebase.encoders.b
            public final void a(Object obj, com.google.firebase.encoders.f fVar) {
                h.a.c(obj, fVar);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<Class<?>, com.google.firebase.encoders.e<?>> f122049a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<Class<?>, com.google.firebase.encoders.g<?>> f122050b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.google.firebase.encoders.e<Object> f122051c = f122048d;

        public static /* synthetic */ void c(Object obj, com.google.firebase.encoders.f fVar) {
            throw new com.google.firebase.encoders.c("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public h d() {
            return new h(new HashMap(this.f122049a), new HashMap(this.f122050b), this.f122051c);
        }

        @NonNull
        public a e(@NonNull l8.a aVar) {
            aVar.a(this);
            return this;
        }

        @Override // l8.b
        @NonNull
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public <U> a b(@NonNull Class<U> cls, @NonNull com.google.firebase.encoders.e<? super U> eVar) {
            this.f122049a.put(cls, eVar);
            this.f122050b.remove(cls);
            return this;
        }

        @Override // l8.b
        @NonNull
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public <U> a a(@NonNull Class<U> cls, @NonNull com.google.firebase.encoders.g<? super U> gVar) {
            this.f122050b.put(cls, gVar);
            this.f122049a.remove(cls);
            return this;
        }

        @NonNull
        public a h(@NonNull com.google.firebase.encoders.e<Object> eVar) {
            this.f122051c = eVar;
            return this;
        }
    }

    h(Map<Class<?>, com.google.firebase.encoders.e<?>> map, Map<Class<?>, com.google.firebase.encoders.g<?>> map2, com.google.firebase.encoders.e<Object> eVar) {
        this.f122045a = map;
        this.f122046b = map2;
        this.f122047c = eVar;
    }

    public static a a() {
        return new a();
    }

    public void b(@NonNull Object obj, @NonNull OutputStream outputStream) throws IOException {
        new f(outputStream, this.f122045a, this.f122046b, this.f122047c).C(obj);
    }

    @NonNull
    public byte[] c(@NonNull Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
