package com.google.gson.internal.bind;

import com.google.gson.b0;
import com.google.gson.c0;
import com.google.gson.internal.a0;
import com.google.gson.internal.f0;
import com.google.gson.internal.j0;
import com.google.gson.internal.v;
import com.google.gson.internal.y;
import com.google.gson.r;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f125351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final boolean f125352b;

    private final class a<K, V> extends b0<Map<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b0<K> f125353a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b0<V> f125354b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final f0<? extends Map<K, V>> f125355c;

        a(b0<K> b0Var, b0<V> b0Var2, f0<? extends Map<K, V>> f0Var) {
            this.f125353a = b0Var;
            this.f125354b = b0Var2;
            this.f125355c = f0Var;
        }

        private String a(com.google.gson.l lVar) {
            if (!lVar.K()) {
                if (lVar.G()) {
                    return AbstractJsonLexerKt.NULL;
                }
                throw new AssertionError();
            }
            r rVarW = lVar.w();
            if (rVarW.O()) {
                return String.valueOf(rVarW.B());
            }
            if (rVarW.M()) {
                return Boolean.toString(rVarW.l());
            }
            if (rVarW.P()) {
                return rVarW.D();
            }
            throw new AssertionError();
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map<K, V> read(com.google.gson.stream.a aVar) throws IOException {
            com.google.gson.stream.c cVarX = aVar.x();
            if (cVarX == com.google.gson.stream.c.NULL) {
                aVar.a7();
                return null;
            }
            Map<K, V> mapA = this.f125355c.a();
            if (cVarX != com.google.gson.stream.c.BEGIN_ARRAY) {
                aVar.m1();
                while (aVar.hasNext()) {
                    a0.f125319a.a(aVar);
                    K k10 = this.f125353a.read(aVar);
                    if (mapA.put(k10, this.f125354b.read(aVar)) != null) {
                        throw new com.google.gson.v("duplicate key: " + k10);
                    }
                }
                aVar.F1();
                return mapA;
            }
            aVar.J0();
            while (aVar.hasNext()) {
                aVar.J0();
                K k11 = this.f125353a.read(aVar);
                if (mapA.put(k11, this.f125354b.read(aVar)) != null) {
                    throw new com.google.gson.v("duplicate key: " + k11);
                }
                aVar.F0();
            }
            aVar.F0();
            return mapA;
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(com.google.gson.stream.d dVar, Map<K, V> map) throws IOException {
            if (map == null) {
                dVar.y();
                return;
            }
            if (!i.this.f125352b) {
                dVar.e();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    dVar.t(String.valueOf(entry.getKey()));
                    this.f125354b.write(dVar, entry.getValue());
                }
                dVar.h();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i10 = 0;
            boolean z10 = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                com.google.gson.l jsonTree = this.f125353a.toJsonTree(entry2.getKey());
                arrayList.add(jsonTree);
                arrayList2.add(entry2.getValue());
                z10 |= jsonTree.F() || jsonTree.J();
            }
            if (!z10) {
                dVar.e();
                int size = arrayList.size();
                while (i10 < size) {
                    dVar.t(a((com.google.gson.l) arrayList.get(i10)));
                    this.f125354b.write(dVar, (V) arrayList2.get(i10));
                    i10++;
                }
                dVar.h();
                return;
            }
            dVar.d();
            int size2 = arrayList.size();
            while (i10 < size2) {
                dVar.d();
                j0.b((com.google.gson.l) arrayList.get(i10), dVar);
                this.f125354b.write(dVar, (V) arrayList2.get(i10));
                dVar.g();
                i10++;
            }
            dVar.g();
        }
    }

    public i(v vVar, boolean z10) {
        this.f125351a = vVar;
        this.f125352b = z10;
    }

    private b0<?> a(com.google.gson.f fVar, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? p.f125413f : fVar.t(com.google.gson.reflect.a.get(type));
    }

    @Override // com.google.gson.c0
    public <T> b0<T> create(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
        Type type = aVar.getType();
        Class<? super T> rawType = aVar.getRawType();
        if (!Map.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type[] typeArrJ = y.j(type, rawType);
        Type type2 = typeArrJ[0];
        Type type3 = typeArrJ[1];
        return new a(new o(fVar, a(fVar, type2), type2), new o(fVar, fVar.t(com.google.gson.reflect.a.get(type3)), type3), this.f125351a.x(aVar, false));
    }
}
