package com.bumptech.glide.load.engine.cache;

import androidx.annotation.NonNull;
import androidx.core.util.s;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes3.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.util.h<com.bumptech.glide.load.g, String> f96504a = new com.bumptech.glide.util.h<>(1000);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s.a<b> f96505b = com.bumptech.glide.util.pool.a.e(10, new a());

    class a implements com.bumptech.glide.util.pool.a.d<b> {
        a() {
        }

        @Override // com.bumptech.glide.util.pool.a.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b k() {
            try {
                return new b(MessageDigest.getInstance(org.apache.commons.codec.digest.g.f335251e));
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    private static final class b implements com.bumptech.glide.util.pool.a.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final MessageDigest f96507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.bumptech.glide.util.pool.c f96508b = com.bumptech.glide.util.pool.c.a();

        b(MessageDigest messageDigest) {
            this.f96507a = messageDigest;
        }

        @Override // com.bumptech.glide.util.pool.a.f
        @NonNull
        public com.bumptech.glide.util.pool.c k() {
            return this.f96508b;
        }
    }

    private String a(com.bumptech.glide.load.g gVar) {
        b bVar = (b) com.bumptech.glide.util.k.d(this.f96505b.acquire());
        try {
            gVar.b(bVar.f96507a);
            String strW = com.bumptech.glide.util.m.w(bVar.f96507a.digest());
            s.a<b> aVar = this.f96505b;
            return strW;
        } finally {
            this.f96505b.a(bVar);
        }
    }

    public String b(com.bumptech.glide.load.g gVar) {
        String strK;
        synchronized (this.f96504a) {
            try {
                strK = this.f96504a.k(gVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (strK == null) {
            strK = a(gVar);
        }
        synchronized (this.f96504a) {
            this.f96504a.o(gVar, strK);
        }
        return strK;
    }
}
