package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
final class d implements com.bumptech.glide.load.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.g f96509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.bumptech.glide.load.g f96510d;

    d(com.bumptech.glide.load.g gVar, com.bumptech.glide.load.g gVar2) {
        this.f96509c = gVar;
        this.f96510d = gVar2;
    }

    @Override // com.bumptech.glide.load.g
    public void b(@NonNull MessageDigest messageDigest) {
        this.f96509c.b(messageDigest);
        this.f96510d.b(messageDigest);
    }

    com.bumptech.glide.load.g c() {
        return this.f96509c;
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f96509c.equals(dVar.f96509c) && this.f96510d.equals(dVar.f96510d)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return (this.f96509c.hashCode() * 31) + this.f96510d.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f96509c + ", signature=" + this.f96510d + AbstractJsonLexerKt.END_OBJ;
    }
}
