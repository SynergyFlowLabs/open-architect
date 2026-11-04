package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
public abstract class u5<R, C, V> extends m5 implements oa<R, C, V> {
    protected u5() {
    }

    public void A0(oa<? extends R, ? extends C, ? extends V> table) {
        i1().A0(table);
    }

    public Set<oa.a<R, C, V>> D0() {
        return i1().D0();
    }

    public Set<C> E0() {
        return i1().E0();
    }

    @Override // com.google.common.collect.oa
    public boolean F0(@fj.a Object rowKey) {
        return i1().F0(rowKey);
    }

    public Map<C, V> J0(@b9 R rowKey) {
        return i1().J0(rowKey);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.m5
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public abstract oa<R, C, V> i1();

    @Override // com.google.common.collect.oa
    public boolean M(@fj.a Object columnKey) {
        return i1().M(columnKey);
    }

    public Map<C, Map<R, V>> a0() {
        return i1().a0();
    }

    public Map<R, V> c0(@b9 C columnKey) {
        return i1().c0(columnKey);
    }

    public void clear() {
        i1().clear();
    }

    @Override // com.google.common.collect.oa
    public boolean containsValue(@fj.a Object value) {
        return i1().containsValue(value);
    }

    @z7.a
    @fj.a
    public V e0(@b9 R rowKey, @b9 C columnKey, @b9 V value) {
        return i1().e0(rowKey, columnKey, value);
    }

    @Override // com.google.common.collect.oa
    public boolean equals(@fj.a Object obj) {
        return obj == this || i1().equals(obj);
    }

    @Override // com.google.common.collect.oa
    public int hashCode() {
        return i1().hashCode();
    }

    @Override // com.google.common.collect.oa
    public boolean isEmpty() {
        return i1().isEmpty();
    }

    @Override // com.google.common.collect.oa
    public boolean n0(@fj.a Object rowKey, @fj.a Object columnKey) {
        return i1().n0(rowKey, columnKey);
    }

    @z7.a
    @fj.a
    public V remove(@fj.a Object rowKey, @fj.a Object columnKey) {
        return i1().remove(rowKey, columnKey);
    }

    public Map<R, Map<C, V>> s() {
        return i1().s();
    }

    @Override // com.google.common.collect.oa
    public int size() {
        return i1().size();
    }

    public Set<R> t() {
        return i1().t();
    }

    public Collection<V> values() {
        return i1().values();
    }

    @Override // com.google.common.collect.oa
    @fj.a
    public V w(@fj.a Object rowKey, @fj.a Object columnKey) {
        return i1().w(rowKey, columnKey);
    }
}
