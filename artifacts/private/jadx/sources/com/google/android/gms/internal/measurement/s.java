package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class s implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f108787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ t f108788b;

    s(t tVar) {
        Objects.requireNonNull(tVar);
        this.f108788b = tVar;
        this.f108787a = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f108787a < this.f108788b.i().length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        t tVar = this.f108788b;
        String strI = tVar.i();
        int i10 = this.f108787a;
        if (i10 >= strI.length()) {
            throw new NoSuchElementException();
        }
        this.f108787a = i10 + 1;
        return new t(String.valueOf(tVar.i().charAt(i10)));
    }
}
