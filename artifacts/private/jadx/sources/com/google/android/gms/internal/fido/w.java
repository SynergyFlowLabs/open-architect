package com.google.android.gms.internal.fido;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
final class w extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f108066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f108067b;

    w(Object obj) {
        this.f108067b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f108066a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f108066a) {
            throw new NoSuchElementException();
        }
        this.f108066a = true;
        return this.f108067b;
    }
}
