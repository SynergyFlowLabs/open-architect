package com.google.vr.sdk.deps;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class h5<E> extends f2<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final h5<Object> f129419c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<E> f129420b;

    static {
        h5<Object> h5Var = new h5<>();
        f129419c = h5Var;
        h5Var.b();
    }

    h5() {
        this(new ArrayList(10));
    }

    public static <E> h5<E> i() {
        return (h5<E>) f129419c;
    }

    @Override // com.google.vr.sdk.deps.u3
    public final /* synthetic */ u3 N3(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.f129420b);
        return new h5(arrayList);
    }

    @Override // com.google.vr.sdk.deps.f2, java.util.AbstractList, java.util.List
    public final void add(int i10, E e10) {
        c();
        this.f129420b.add(i10, e10);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i10) {
        return this.f129420b.get(i10);
    }

    @Override // com.google.vr.sdk.deps.f2, java.util.AbstractList, java.util.List
    public final E remove(int i10) {
        c();
        E eRemove = this.f129420b.remove(i10);
        ((AbstractList) this).modCount++;
        return eRemove;
    }

    @Override // com.google.vr.sdk.deps.f2, java.util.AbstractList, java.util.List
    public final E set(int i10, E e10) {
        c();
        E e11 = this.f129420b.set(i10, e10);
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f129420b.size();
    }

    private h5(List<E> list) {
        this.f129420b = list;
    }
}
