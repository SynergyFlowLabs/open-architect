package com.google.common.collect;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
@a4
@z7.j(containerOf = {"R", "C", androidx.exifinterface.media.a.Y4})
@com.google.common.annotations.b
final class ka<R, C, V> extends t9<R, C, V> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final k7<Object, Object, Object> f117575h = new ka(l6.F(), z6.G(), z6.G());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n6<R, n6<C, V>> f117576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final n6<C, n6<R, V>> f117577e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f117578f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f117579g;

    /* JADX WARN: Multi-variable type inference failed */
    ka(l6<oa.a<R, C, V>> l6Var, z6<R> z6Var, z6<C> z6Var2) {
        n6 n6VarQ = b8.Q(z6Var);
        LinkedHashMap linkedHashMapC0 = b8.c0();
        nb<R> it = z6Var.iterator();
        while (it.hasNext()) {
            linkedHashMapC0.put(it.next(), new LinkedHashMap());
        }
        LinkedHashMap linkedHashMapC1 = b8.c0();
        nb<C> it2 = z6Var2.iterator();
        while (it2.hasNext()) {
            linkedHashMapC1.put(it2.next(), new LinkedHashMap());
        }
        int[] iArr = new int[l6Var.size()];
        int[] iArr2 = new int[l6Var.size()];
        for (int i10 = 0; i10 < l6Var.size(); i10++) {
            oa.a<R, C, V> aVar = l6Var.get(i10);
            R rB = aVar.b();
            C cA = aVar.a();
            V value = aVar.getValue();
            Integer num = (Integer) n6VarQ.get(rB);
            Objects.requireNonNull(num);
            iArr[i10] = num.intValue();
            Map map = (Map) linkedHashMapC0.get(rB);
            Objects.requireNonNull(map);
            Map map2 = map;
            iArr2[i10] = map2.size();
            B(rB, cA, map2.put(cA, value), value);
            Map map3 = (Map) linkedHashMapC1.get(cA);
            Objects.requireNonNull(map3);
            map3.put(rB, value);
        }
        this.f117578f = iArr;
        this.f117579g = iArr2;
        n6.b bVar = new n6.b(linkedHashMapC0.size());
        for (Map.Entry entry : linkedHashMapC0.entrySet()) {
            bVar.i(entry.getKey(), n6.g((Map) entry.getValue()));
        }
        this.f117576d = bVar.d();
        n6.b bVar2 = new n6.b(linkedHashMapC1.size());
        for (Map.Entry entry2 : linkedHashMapC1.entrySet()) {
            bVar2.i(entry2.getKey(), n6.g((Map) entry2.getValue()));
        }
        this.f117577e = bVar2.d();
    }

    @Override // com.google.common.collect.t9
    oa.a<R, C, V> G(int index) {
        Map.Entry<R, n6<C, V>> entry = this.f117576d.entrySet().c().get(this.f117578f[index]);
        n6<C, V> value = entry.getValue();
        Map.Entry<C, V> entry2 = value.entrySet().c().get(this.f117579g[index]);
        return k7.g(entry.getKey(), entry2.getKey(), entry2.getValue());
    }

    @Override // com.google.common.collect.t9
    V H(int index) {
        n6<C, V> n6Var = this.f117576d.values().c().get(this.f117578f[index]);
        return n6Var.values().c().get(this.f117579g[index]);
    }

    @Override // com.google.common.collect.k7, com.google.common.collect.oa
    /* JADX INFO: renamed from: k */
    public n6<C, Map<R, V>> a0() {
        return n6.g(this.f117577e);
    }

    @Override // com.google.common.collect.oa
    public int size() {
        return this.f117578f.length;
    }

    @Override // com.google.common.collect.k7, com.google.common.collect.oa
    /* JADX INFO: renamed from: v */
    public n6<R, Map<C, V>> s() {
        return n6.g(this.f117576d);
    }

    @Override // com.google.common.collect.t9, com.google.common.collect.k7
    @com.google.common.annotations.c
    @com.google.common.annotations.d
    Object writeReplace() {
        n6 n6VarQ = b8.Q(E0());
        int[] iArr = new int[D0().size()];
        nb<oa.a<R, C, V>> it = D0().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Integer num = (Integer) n6VarQ.get(it.next().a());
            Objects.requireNonNull(num);
            iArr[i10] = num.intValue();
            i10++;
        }
        return k7.b.a(this, this.f117578f, iArr);
    }
}
