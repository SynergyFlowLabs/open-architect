package com.google.android.gms.internal.play_billing;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
abstract class j0 extends b3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f109147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f109148b;

    protected j0(int i10, int i11) {
        g0.b(i11, i10, FirebaseAnalytics.d.f120644b0);
        this.f109147a = i10;
        this.f109148b = i11;
    }

    protected abstract Object b(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.f109148b >= this.f109147a) {
            return false;
        }
        int i10 = 1 >> 1;
        return true;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f109148b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f109148b;
        this.f109148b = i10 + 1;
        return b(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f109148b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f109148b - 1;
        this.f109148b = i10;
        return b(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f109148b - 1;
    }
}
