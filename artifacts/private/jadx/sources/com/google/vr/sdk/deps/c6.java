package com.google.vr.sdk.deps;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes5.dex */
public final class c6 extends AbstractList<String> implements d4, RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d4 f127765a;

    public c6(d4 d4Var) {
        this.f127765a = d4Var;
    }

    @Override // com.google.vr.sdk.deps.d4
    public final Object V3(int i10) {
        return this.f127765a.V3(i10);
    }

    @Override // com.google.vr.sdk.deps.d4
    public final List<?> d() {
        return this.f127765a.d();
    }

    @Override // com.google.vr.sdk.deps.d4
    public final d4 e() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        return (String) this.f127765a.get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new e6(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i10) {
        return new d6(this, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f127765a.size();
    }

    @Override // com.google.vr.sdk.deps.d4
    public final void t2(k2 k2Var) {
        throw new UnsupportedOperationException();
    }
}
