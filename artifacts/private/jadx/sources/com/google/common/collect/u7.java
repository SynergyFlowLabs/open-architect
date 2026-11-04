package com.google.common.collect;

import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true, serializable = true)
public final class u7<E> extends f<E> {
    u7(int distinctElements) {
        super(distinctElements);
    }

    public static <E> u7<E> r() {
        return s(3);
    }

    public static <E> u7<E> s(int distinctElements) {
        return new u7<>(distinctElements);
    }

    public static <E> u7<E> t(Iterable<? extends E> elements) {
        u7<E> u7VarS = s(r8.l(elements));
        o7.a(u7VarS, elements);
        return u7VarS;
    }

    @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.q8
    public /* bridge */ /* synthetic */ boolean contains(@fj.a Object element) {
        return super.contains(element);
    }

    @Override // com.google.common.collect.i, com.google.common.collect.q8
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.i, com.google.common.collect.q8
    public /* bridge */ /* synthetic */ Set o() {
        return super.o();
    }

    @Override // com.google.common.collect.f
    y8<E> p(int distinctElements) {
        return new z8(distinctElements);
    }
}
