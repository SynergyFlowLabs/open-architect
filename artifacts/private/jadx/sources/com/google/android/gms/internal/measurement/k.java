package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
final class k implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Iterator f108592a;

    k(Iterator it) {
        this.f108592a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f108592a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new t((String) this.f108592a.next());
    }
}
