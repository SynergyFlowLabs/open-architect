package com.google.android.gms.internal.location;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
abstract class s3 extends a4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f108186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f108187b;

    protected s3(int i10, int i11) {
        q3.d(i11, i10, FirebaseAnalytics.d.f120644b0);
        this.f108186a = i10;
        this.f108187b = i11;
    }

    protected abstract Object b(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f108187b < this.f108186a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f108187b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f108187b;
        this.f108187b = i10 + 1;
        return b(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f108187b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f108187b - 1;
        this.f108187b = i10;
        return b(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f108187b - 1;
    }
}
