package com.google.android.gms.internal.auth;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
final class e6 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterator f107626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ f6 f107627b;

    e6(f6 f6Var) {
        this.f107627b = f6Var;
        this.f107626a = f6Var.f107637a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f107626a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f107626a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
