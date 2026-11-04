package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
final class x implements com.bumptech.glide.load.g {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final com.bumptech.glide.util.h<Class<?>, byte[]> f96761k = new com.bumptech.glide.util.h<>(50);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f96762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.bumptech.glide.load.g f96763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.load.g f96764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f96765f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f96766g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Class<?> f96767h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.bumptech.glide.load.j f96768i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.bumptech.glide.load.n<?> f96769j;

    x(com.bumptech.glide.load.engine.bitmap_recycle.b bVar, com.bumptech.glide.load.g gVar, com.bumptech.glide.load.g gVar2, int i10, int i11, com.bumptech.glide.load.n<?> nVar, Class<?> cls, com.bumptech.glide.load.j jVar) {
        this.f96762c = bVar;
        this.f96763d = gVar;
        this.f96764e = gVar2;
        this.f96765f = i10;
        this.f96766g = i11;
        this.f96769j = nVar;
        this.f96767h = cls;
        this.f96768i = jVar;
    }

    private byte[] c() {
        com.bumptech.glide.util.h<Class<?>, byte[]> hVar = f96761k;
        byte[] bArrK = hVar.k(this.f96767h);
        if (bArrK != null) {
            return bArrK;
        }
        byte[] bytes = this.f96767h.getName().getBytes(com.bumptech.glide.load.g.f96793b);
        hVar.o(this.f96767h, bytes);
        return bytes;
    }

    @Override // com.bumptech.glide.load.g
    public void b(@NonNull MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f96762c.d(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f96765f).putInt(this.f96766g).array();
        this.f96764e.b(messageDigest);
        this.f96763d.b(messageDigest);
        messageDigest.update(bArr);
        com.bumptech.glide.load.n<?> nVar = this.f96769j;
        if (nVar != null) {
            nVar.b(messageDigest);
        }
        this.f96768i.b(messageDigest);
        messageDigest.update(c());
        this.f96762c.put(bArr);
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (obj instanceof x) {
            x xVar = (x) obj;
            if (this.f96766g == xVar.f96766g && this.f96765f == xVar.f96765f && com.bumptech.glide.util.m.d(this.f96769j, xVar.f96769j) && this.f96767h.equals(xVar.f96767h) && this.f96763d.equals(xVar.f96763d) && this.f96764e.equals(xVar.f96764e) && this.f96768i.equals(xVar.f96768i)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        int iHashCode = (((((this.f96763d.hashCode() * 31) + this.f96764e.hashCode()) * 31) + this.f96765f) * 31) + this.f96766g;
        com.bumptech.glide.load.n<?> nVar = this.f96769j;
        if (nVar != null) {
            iHashCode = (iHashCode * 31) + nVar.hashCode();
        }
        return (((iHashCode * 31) + this.f96767h.hashCode()) * 31) + this.f96768i.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f96763d + ", signature=" + this.f96764e + ", width=" + this.f96765f + ", height=" + this.f96766g + ", decodedResourceClass=" + this.f96767h + ", transformation='" + this.f96769j + "', options=" + this.f96768i + AbstractJsonLexerKt.END_OBJ;
    }
}
