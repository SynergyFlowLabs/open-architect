package com.google.vr.sdk.deps;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class e6 implements Iterator<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Iterator<String> f129358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ c6 f129359b;

    e6(c6 c6Var) {
        this.f129359b = c6Var;
        this.f129358a = c6Var.f127765a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f129358a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.f129358a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
