package com.google.vr.sdk.deps;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes5.dex */
public final class c4 extends f2<String> implements d4, RandomAccess {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c4 f127763c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<Object> f127764b;

    static {
        c4 c4Var = new c4();
        f127763c = c4Var;
        c4Var.b();
    }

    public c4() {
        this(10);
    }

    private static String d(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj instanceof k2 ? ((k2) obj).D() : k3.i((byte[]) obj);
    }

    @Override // com.google.vr.sdk.deps.u3
    public final /* synthetic */ u3 N3(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.f127764b);
        return new c4((ArrayList<Object>) arrayList);
    }

    @Override // com.google.vr.sdk.deps.d4
    public final Object V3(int i10) {
        return this.f127764b.get(i10);
    }

    @Override // com.google.vr.sdk.deps.f2, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        c();
        this.f127764b.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.vr.sdk.deps.f2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.vr.sdk.deps.f2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        c();
        this.f127764b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.vr.sdk.deps.d4
    public final d4 e() {
        return super.y() ? new c6(this) : this;
    }

    @Override // com.google.vr.sdk.deps.f2, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        Object obj = this.f127764b.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof k2) {
            k2 k2Var = (k2) obj;
            String strD = k2Var.D();
            if (k2Var.F()) {
                this.f127764b.set(i10, strD);
            }
            return strD;
        }
        byte[] bArr = (byte[]) obj;
        String strI = k3.i(bArr);
        if (k3.h(bArr)) {
            this.f127764b.set(i10, strI);
        }
        return strI;
    }

    @Override // com.google.vr.sdk.deps.f2, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.vr.sdk.deps.f2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.vr.sdk.deps.f2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.vr.sdk.deps.f2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // com.google.vr.sdk.deps.f2, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i10, Object obj) {
        c();
        return d(this.f127764b.set(i10, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f127764b.size();
    }

    @Override // com.google.vr.sdk.deps.d4
    public final void t2(k2 k2Var) {
        c();
        this.f127764b.add(k2Var);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.vr.sdk.deps.f2, com.google.vr.sdk.deps.u3
    public final /* bridge */ /* synthetic */ boolean y() {
        return super.y();
    }

    public c4(int i10) {
        this((ArrayList<Object>) new ArrayList(i10));
    }

    @Override // com.google.vr.sdk.deps.f2, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection<? extends String> collection) {
        c();
        if (collection instanceof d4) {
            collection = ((d4) collection).d();
        }
        boolean zAddAll = this.f127764b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.vr.sdk.deps.f2, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i10) {
        c();
        Object objRemove = this.f127764b.remove(i10);
        ((AbstractList) this).modCount++;
        return d(objRemove);
    }

    private c4(ArrayList<Object> arrayList) {
        this.f127764b = arrayList;
    }

    @Override // com.google.vr.sdk.deps.d4
    public final List<?> d() {
        return Collections.unmodifiableList(this.f127764b);
    }
}
