package com.google.common.collect;

import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true, serializable = true)
public final class b6<E> extends f<E> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @com.google.common.annotations.c
    @com.google.common.annotations.d
    private static final long f117119f = 0;

    b6(int distinctElements) {
        super(distinctElements);
    }

    public static <E> b6<E> r() {
        return s(3);
    }

    public static <E> b6<E> s(int distinctElements) {
        return new b6<>(distinctElements);
    }

    public static <E> b6<E> t(Iterable<? extends E> elements) {
        b6<E> b6VarS = s(r8.l(elements));
        o7.a(b6VarS, elements);
        return b6VarS;
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
        return new y8<>(distinctElements);
    }
}
