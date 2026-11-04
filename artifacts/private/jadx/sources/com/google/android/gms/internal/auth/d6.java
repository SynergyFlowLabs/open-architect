package com.google.android.gms.internal.auth;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes4.dex */
final class d6 implements ListIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ListIterator f107621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f107622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ f6 f107623c;

    d6(f6 f6Var, int i10) {
        this.f107623c = f6Var;
        this.f107622b = i10;
        this.f107621a = f6Var.f107637a.listIterator(i10);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f107621a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f107621a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f107621a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f107621a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f107621a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f107621a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
