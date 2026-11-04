package com.google.common.collect;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
class ba<R, C, V> extends k7<R, C, V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final R f117188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final C f117189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final V f117190f;

    ba(R r10, C c10, V v10) {
        this.f117188d = (R) com.google.common.base.j0.E(r10);
        this.f117189e = (C) com.google.common.base.j0.E(c10);
        this.f117190f = (V) com.google.common.base.j0.E(v10);
    }

    @Override // com.google.common.collect.k7, com.google.common.collect.oa
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public n6<R, V> c0(C columnKey) {
        com.google.common.base.j0.E(columnKey);
        return M(columnKey) ? n6.s(this.f117188d, this.f117190f) : n6.q();
    }

    @Override // com.google.common.collect.k7, com.google.common.collect.oa
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public n6<C, Map<R, V>> a0() {
        return n6.s(this.f117189e, n6.s(this.f117188d, this.f117190f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.k7, com.google.common.collect.q
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public z6<oa.a<R, C, V>> b() {
        return z6.J(k7.g(this.f117188d, this.f117189e, this.f117190f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.k7, com.google.common.collect.q
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public h6<V> c() {
        return z6.J(this.f117190f);
    }

    @Override // com.google.common.collect.oa
    public int size() {
        return 1;
    }

    @Override // com.google.common.collect.k7, com.google.common.collect.oa
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public n6<R, Map<C, V>> s() {
        return n6.s(this.f117188d, n6.s(this.f117189e, this.f117190f));
    }

    @Override // com.google.common.collect.k7
    @com.google.common.annotations.c
    @com.google.common.annotations.d
    Object writeReplace() {
        return k7.b.a(this, new int[]{0}, new int[]{0});
    }

    ba(oa.a<R, C, V> cell) {
        this(cell.b(), cell.a(), cell.getValue());
    }
}
