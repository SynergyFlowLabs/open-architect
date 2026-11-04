package com.squareup.moshi;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
final class b extends h<Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h.e f267127c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<?> f267128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h<Object> f267129b;

    class a implements h.e {
        a() {
        }

        @Override // com.squareup.moshi.h.e
        @fj.h
        public h<?> a(Type type, Set<? extends Annotation> set, w wVar) {
            Type typeA = a0.a(type);
            if (typeA != null && set.isEmpty()) {
                return new b(a0.j(typeA), wVar.d(typeA)).j();
            }
            return null;
        }
    }

    b(Class<?> cls, h<Object> hVar) {
        this.f267128a = cls;
        this.f267129b = hVar;
    }

    @Override // com.squareup.moshi.h
    public Object b(m mVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        mVar.J0();
        while (mVar.hasNext()) {
            arrayList.add(this.f267129b.b(mVar));
        }
        mVar.F0();
        Object objNewInstance = Array.newInstance(this.f267128a, arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Array.set(objNewInstance, i10, arrayList.get(i10));
        }
        return objNewInstance;
    }

    @Override // com.squareup.moshi.h
    public void m(t tVar, Object obj) throws IOException {
        tVar.a();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f267129b.m(tVar, Array.get(obj, i10));
        }
        tVar.e();
    }

    public String toString() {
        return this.f267129b + ".array()";
    }
}
