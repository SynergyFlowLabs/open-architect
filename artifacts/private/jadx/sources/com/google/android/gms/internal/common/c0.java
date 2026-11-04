package com.google.android.gms.internal.common;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
abstract class c0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f107963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f107964b = 2;

    protected c0() {
    }

    protected abstract Object a();

    protected final Object b() {
        this.f107964b = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        l0.d(this.f107964b != 4);
        int i10 = this.f107964b;
        int i11 = i10 - 1;
        if (i10 == 0) {
            throw null;
        }
        if (i11 == 0) {
            return true;
        }
        if (i11 != 2) {
            this.f107964b = 4;
            this.f107963a = a();
            if (this.f107964b != 3) {
                this.f107964b = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f107964b = 2;
        Object obj = this.f107963a;
        this.f107963a = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
