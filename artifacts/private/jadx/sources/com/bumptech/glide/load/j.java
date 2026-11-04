package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.security.MessageDigest;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.collection.a<i<?>, Object> f96800c = new com.bumptech.glide.util.b();

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void f(@NonNull i<T> iVar, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
        iVar.h(obj, messageDigest);
    }

    @Override // com.bumptech.glide.load.g
    public void b(@NonNull MessageDigest messageDigest) {
        for (int i10 = 0; i10 < this.f96800c.size(); i10++) {
            f(this.f96800c.g(i10), this.f96800c.k(i10), messageDigest);
        }
    }

    @p0
    public <T> T c(@NonNull i<T> iVar) {
        return this.f96800c.containsKey(iVar) ? (T) this.f96800c.get(iVar) : iVar.d();
    }

    public void d(@NonNull j jVar) {
        this.f96800c.h(jVar.f96800c);
    }

    @NonNull
    public <T> j e(@NonNull i<T> iVar, @NonNull T t10) {
        this.f96800c.put(iVar, t10);
        return this;
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f96800c.equals(((j) obj).f96800c);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return this.f96800c.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f96800c + AbstractJsonLexerKt.END_OBJ;
    }
}
