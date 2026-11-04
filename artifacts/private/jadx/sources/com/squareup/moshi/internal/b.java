package com.squareup.moshi.internal;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public final class b<T> extends h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h<T> f267170a;

    public b(h<T> hVar) {
        this.f267170a = hVar;
    }

    @Override // com.squareup.moshi.h
    @fj.h
    public T b(m mVar) throws IOException {
        return mVar.f() == m.c.NULL ? (T) mVar.c() : this.f267170a.b(mVar);
    }

    @Override // com.squareup.moshi.h
    public void m(t tVar, @fj.h T t10) throws IOException {
        if (t10 == null) {
            tVar.q();
        } else {
            this.f267170a.m(tVar, t10);
        }
    }

    public h<T> p() {
        return this.f267170a;
    }

    public String toString() {
        return this.f267170a + ".nullSafe()";
    }
}
