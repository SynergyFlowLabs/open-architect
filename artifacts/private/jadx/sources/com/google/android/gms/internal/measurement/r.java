package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class r implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f108762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ t f108763b;

    r(t tVar) {
        Objects.requireNonNull(tVar);
        this.f108763b = tVar;
        this.f108762a = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f108762a < this.f108763b.i().length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        String strI = this.f108763b.i();
        int i10 = this.f108762a;
        if (i10 >= strI.length()) {
            throw new NoSuchElementException();
        }
        this.f108762a = i10 + 1;
        return new t(String.valueOf(i10));
    }
}
