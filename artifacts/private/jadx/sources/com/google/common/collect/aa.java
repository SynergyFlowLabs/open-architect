package com.google.common.collect;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true, serializable = true)
final class aa<E> extends z6<E> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final transient E f117094i;

    aa(E e10) {
        this.f117094i = (E) com.google.common.base.j0.E(e10);
    }

    @Override // com.google.common.collect.z6, com.google.common.collect.h6
    public l6<E> c() {
        return l6.G(this.f117094i);
    }

    @Override // com.google.common.collect.h6, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@fj.a Object target) {
        return this.f117094i.equals(target);
    }

    @Override // com.google.common.collect.h6
    int d(Object[] dst, int offset) {
        dst[offset] = this.f117094i;
        return offset + 1;
    }

    @Override // com.google.common.collect.z6, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f117094i.hashCode();
    }

    @Override // com.google.common.collect.h6
    boolean m() {
        return false;
    }

    @Override // com.google.common.collect.z6, com.google.common.collect.h6, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: n */
    public nb<E> iterator() {
        return p7.X(this.f117094i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return AbstractJsonLexerKt.BEGIN_LIST + this.f117094i.toString() + AbstractJsonLexerKt.END_LIST;
    }

    @Override // com.google.common.collect.z6, com.google.common.collect.h6
    @com.google.common.annotations.c
    @com.google.common.annotations.d
    Object writeReplace() {
        return super.writeReplace();
    }
}
