package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public final class d4 extends o2 implements RandomAccess, e4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final d4 f107616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final e4 f107617d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f107618b;

    static {
        d4 d4Var = new d4(false);
        f107616c = d4Var;
        f107617d = d4Var;
    }

    public d4() {
        this(10);
    }

    private static String i(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj instanceof d3 ? ((d3) obj).t(z3.f107903b) : z3.d((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.auth.o2, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        c();
        this.f107618b.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.o2, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        c();
        if (collection instanceof e4) {
            collection = ((e4) collection).q();
        }
        boolean zAddAll = this.f107618b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.android.gms.internal.auth.o2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        c();
        this.f107618b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final String get(int i10) {
        Object obj = this.f107618b.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof d3) {
            d3 d3Var = (d3) obj;
            String strT = d3Var.t(z3.f107903b);
            if (d3Var.n()) {
                this.f107618b.set(i10, strT);
            }
            return strT;
        }
        byte[] bArr = (byte[]) obj;
        String strD = z3.d(bArr);
        if (o6.b(bArr)) {
            this.f107618b.set(i10, strD);
        }
        return strD;
    }

    @Override // com.google.android.gms.internal.auth.x3
    public final /* bridge */ /* synthetic */ x3 e(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.f107618b);
        return new d4(arrayList);
    }

    @Override // com.google.android.gms.internal.auth.e4
    public final e4 j() {
        return h() ? new f6(this) : this;
    }

    @Override // com.google.android.gms.internal.auth.e4
    public final List q() {
        return Collections.unmodifiableList(this.f107618b);
    }

    @Override // com.google.android.gms.internal.auth.o2, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        c();
        Object objRemove = this.f107618b.remove(i10);
        ((AbstractList) this).modCount++;
        return i(objRemove);
    }

    @Override // com.google.android.gms.internal.auth.o2, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        c();
        return i(this.f107618b.set(i10, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f107618b.size();
    }

    public d4(int i10) {
        ArrayList arrayList = new ArrayList(i10);
        super(true);
        this.f107618b = arrayList;
    }

    private d4(ArrayList arrayList) {
        super(true);
        this.f107618b = arrayList;
    }

    private d4(boolean z10) {
        super(false);
        this.f107618b = Collections.EMPTY_LIST;
    }

    @Override // com.google.android.gms.internal.auth.o2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
