package com.google.android.gms.internal.common;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
abstract class e extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f107965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f107966b;

    protected e(int i10, int i11) {
        l0.b(i11, i10, FirebaseAnalytics.d.f120644b0);
        this.f107965a = i10;
        this.f107966b = i11;
    }

    protected abstract Object b(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f107966b < this.f107965a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f107966b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f107966b;
        this.f107966b = i10 + 1;
        return b(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f107966b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f107966b - 1;
        this.f107966b = i10;
        return b(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f107966b - 1;
    }
}
