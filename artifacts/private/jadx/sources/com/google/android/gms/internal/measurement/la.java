package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
abstract class la implements na {
    la() {
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return Byte.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
