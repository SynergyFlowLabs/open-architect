package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class f6 extends AbstractList implements RandomAccess, e4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e4 f107637a;

    public f6(e4 e4Var) {
        this.f107637a = e4Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return ((d4) this.f107637a).get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new e6(this);
    }

    @Override // com.google.android.gms.internal.auth.e4
    public final e4 j() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new d6(this, i10);
    }

    @Override // com.google.android.gms.internal.auth.e4
    public final List q() {
        return this.f107637a.q();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f107637a.size();
    }
}
