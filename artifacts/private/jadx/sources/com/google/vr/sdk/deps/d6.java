package com.google.vr.sdk.deps;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes5.dex */
final class d6 implements ListIterator<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ListIterator<String> f127776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f127777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ c6 f127778c;

    d6(c6 c6Var, int i10) {
        this.f127778c = c6Var;
        this.f127777b = i10;
        this.f127776a = c6Var.f127765a.listIterator(i10);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f127776a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f127776a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f127776a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f127776a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ String previous() {
        return this.f127776a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f127776a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }
}
