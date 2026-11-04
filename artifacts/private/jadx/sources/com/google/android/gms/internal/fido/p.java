package com.google.android.gms.internal.fido;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
abstract class p extends c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f108029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f108030b;

    protected p(int i10, int i11) {
        n.b(i11, i10, FirebaseAnalytics.d.f120644b0);
        this.f108029a = i10;
        this.f108030b = i11;
    }

    protected abstract Object b(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f108030b < this.f108029a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f108030b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f108030b;
        this.f108030b = i10 + 1;
        return b(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f108030b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f108030b - 1;
        this.f108030b = i10;
        return b(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f108030b - 1;
    }
}
