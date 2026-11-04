package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Class<?> f97484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Class<?> f97485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Class<?> f97486c;

    public j() {
    }

    public void a(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
        b(cls, cls2, null);
    }

    public void b(@NonNull Class<?> cls, @NonNull Class<?> cls2, @p0 Class<?> cls3) {
        this.f97484a = cls;
        this.f97485b = cls2;
        this.f97486c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f97484a.equals(jVar.f97484a) && this.f97485b.equals(jVar.f97485b) && m.d(this.f97486c, jVar.f97486c);
    }

    public int hashCode() {
        int iHashCode = ((this.f97484a.hashCode() * 31) + this.f97485b.hashCode()) * 31;
        Class<?> cls = this.f97486c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f97484a + ", second=" + this.f97485b + AbstractJsonLexerKt.END_OBJ;
    }

    public j(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
        a(cls, cls2);
    }

    public j(@NonNull Class<?> cls, @NonNull Class<?> cls2, @p0 Class<?> cls3) {
        b(cls, cls2, cls3);
    }
}
