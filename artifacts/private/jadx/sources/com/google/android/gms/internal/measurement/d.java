package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class d implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Iterator f108347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Iterator f108348b;

    d(f fVar, Iterator it, Iterator it2) {
        this.f108347a = it;
        this.f108348b = it2;
        Objects.requireNonNull(fVar);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f108347a.hasNext()) {
            return true;
        }
        return this.f108348b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.f108347a;
        if (it.hasNext()) {
            return new t(((Integer) it.next()).toString());
        }
        Iterator it2 = this.f108348b;
        if (it2.hasNext()) {
            return new t((String) it2.next());
        }
        throw new NoSuchElementException();
    }
}
