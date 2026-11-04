package com.squareup.moshi.internal;

import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public final class a<T> extends h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h<T> f267169a;

    public a(h<T> hVar) {
        this.f267169a = hVar;
    }

    @Override // com.squareup.moshi.h
    @fj.h
    public T b(m mVar) throws IOException {
        if (mVar.f() != m.c.NULL) {
            return this.f267169a.b(mVar);
        }
        throw new j("Unexpected null at " + mVar.S());
    }

    @Override // com.squareup.moshi.h
    public void m(t tVar, @fj.h T t10) throws IOException {
        if (t10 != null) {
            this.f267169a.m(tVar, t10);
            return;
        }
        throw new j("Unexpected null at " + tVar.S());
    }

    public h<T> p() {
        return this.f267169a;
    }

    public String toString() {
        return this.f267169a + ".nonNull()";
    }
}
