package com.squareup.moshi;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
final class v<K, V> extends h<Map<K, V>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h.e f267305c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h<K> f267306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h<V> f267307b;

    class a implements h.e {
        a() {
        }

        @Override // com.squareup.moshi.h.e
        @fj.h
        public h<?> a(Type type, Set<? extends Annotation> set, w wVar) {
            Class<?> clsJ;
            if (set.isEmpty() && (clsJ = a0.j(type)) == Map.class) {
                Type[] typeArrL = a0.l(type, clsJ);
                return new v(wVar, typeArrL[0], typeArrL[1]).j();
            }
            return null;
        }
    }

    v(w wVar, Type type, Type type2) {
        this.f267306a = wVar.d(type);
        this.f267307b = wVar.d(type2);
    }

    @Override // com.squareup.moshi.h
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Map<K, V> b(m mVar) throws IOException {
        u uVar = new u();
        mVar.m1();
        while (mVar.hasNext()) {
            mVar.h();
            K kB = this.f267306a.b(mVar);
            V vB = this.f267307b.b(mVar);
            V vPut = uVar.put(kB, vB);
            if (vPut != null) {
                throw new j("Map key '" + kB + "' has multiple values at path " + mVar.S() + ": " + vPut + " and " + vB);
            }
        }
        mVar.F1();
        return uVar;
    }

    @Override // com.squareup.moshi.h
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void m(t tVar, Map<K, V> map) throws IOException {
        tVar.c();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getKey() == null) {
                throw new j("Map key is null at " + tVar.S());
            }
            tVar.x();
            this.f267306a.m(tVar, entry.getKey());
            this.f267307b.m(tVar, entry.getValue());
        }
        tVar.g();
    }

    public String toString() {
        return "JsonAdapter(" + this.f267306a + "=" + this.f267307b + ")";
    }
}
