package com.google.common.collect;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(serializable = true)
public class x5<R, C, V> extends ma<R, C, V> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f118269i = 0;

    private static class a<C, V> implements com.google.common.base.s0<Map<C, V>>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f118270b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f118271a;

        a(int expectedSize) {
            this.f118271a = expectedSize;
        }

        @Override // com.google.common.base.s0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<C, V> get() {
            return b8.e0(this.f118271a);
        }
    }

    x5(Map<R, Map<C, V>> backingMap, a<C, V> factory) {
        super(backingMap, factory);
    }

    public static <R, C, V> x5<R, C, V> n() {
        return new x5<>(new LinkedHashMap(), new a(0));
    }

    public static <R, C, V> x5<R, C, V> o(int expectedRows, int expectedCellsPerRow) {
        a3.b(expectedCellsPerRow, "expectedCellsPerRow");
        return new x5<>(b8.e0(expectedRows), new a(expectedCellsPerRow));
    }

    public static <R, C, V> x5<R, C, V> p(oa<? extends R, ? extends C, ? extends V> table) {
        x5<R, C, V> x5VarN = n();
        x5VarN.A0(table);
        return x5VarN;
    }

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    public /* bridge */ /* synthetic */ void A0(oa table) {
        super.A0(table);
    }

    @Override // com.google.common.collect.ma, com.google.common.collect.q, com.google.common.collect.oa
    public /* bridge */ /* synthetic */ Set D0() {
        return super.D0();
    }

    @Override // com.google.common.collect.ma, com.google.common.collect.q, com.google.common.collect.oa
    public /* bridge */ /* synthetic */ Set E0() {
        return super.E0();
    }

    @Override // com.google.common.collect.ma, com.google.common.collect.q, com.google.common.collect.oa
    public /* bridge */ /* synthetic */ boolean F0(@fj.a Object rowKey) {
        return super.F0(rowKey);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ma, com.google.common.collect.oa
    public /* bridge */ /* synthetic */ Map J0(Object rowKey) {
        return super.J0(rowKey);
    }

    @Override // com.google.common.collect.ma, com.google.common.collect.q, com.google.common.collect.oa
    public /* bridge */ /* synthetic */ boolean M(@fj.a Object columnKey) {
        return super.M(columnKey);
    }

    @Override // com.google.common.collect.ma, com.google.common.collect.oa
    public /* bridge */ /* synthetic */ Map a0() {
        return super.a0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ma, com.google.common.collect.oa
    public /* bridge */ /* synthetic */ Map c0(Object columnKey) {
        return super.c0(columnKey);
    }

    @Override // com.google.common.collect.ma, com.google.common.collect.q, com.google.common.collect.oa
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.ma, com.google.common.collect.q, com.google.common.collect.oa
    public /* bridge */ /* synthetic */ boolean containsValue(@fj.a Object value) {
        return super.containsValue(value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ma, com.google.common.collect.q, com.google.common.collect.oa
    @z7.a
    @fj.a
    public /* bridge */ /* synthetic */ Object e0(Object rowKey, Object columnKey, Object value) {
        return super.e0(rowKey, columnKey, value);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    public /* bridge */ /* synthetic */ boolean equals(@fj.a Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.ma, com.google.common.collect.q, com.google.common.collect.oa
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.ma, com.google.common.collect.q, com.google.common.collect.oa
    public /* bridge */ /* synthetic */ boolean n0(@fj.a Object rowKey, @fj.a Object columnKey) {
        return super.n0(rowKey, columnKey);
    }

    @Override // com.google.common.collect.ma, com.google.common.collect.q, com.google.common.collect.oa
    @z7.a
    @fj.a
    public /* bridge */ /* synthetic */ Object remove(@fj.a Object rowKey, @fj.a Object columnKey) {
        return super.remove(rowKey, columnKey);
    }

    @Override // com.google.common.collect.ma, com.google.common.collect.oa
    public /* bridge */ /* synthetic */ Map s() {
        return super.s();
    }

    @Override // com.google.common.collect.ma, com.google.common.collect.oa
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.ma, com.google.common.collect.q, com.google.common.collect.oa
    public /* bridge */ /* synthetic */ Set t() {
        return super.t();
    }

    @Override // com.google.common.collect.q
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.ma, com.google.common.collect.q, com.google.common.collect.oa
    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    @Override // com.google.common.collect.ma, com.google.common.collect.q, com.google.common.collect.oa
    @fj.a
    public /* bridge */ /* synthetic */ Object w(@fj.a Object rowKey, @fj.a Object columnKey) {
        return super.w(rowKey, columnKey);
    }
}
