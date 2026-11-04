package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
final class c2 extends a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f109073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f109074b;

    c2(Object obj) {
        this.f109073a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f109074b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f109074b) {
            throw new NoSuchElementException();
        }
        this.f109074b = true;
        return this.f109073a;
    }
}
