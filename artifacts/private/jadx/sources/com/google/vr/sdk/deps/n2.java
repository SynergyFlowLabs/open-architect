package com.google.vr.sdk.deps;

/* JADX INFO: loaded from: classes5.dex */
abstract class n2 implements q2 {
    n2() {
    }

    @Override // java.util.Iterator
    public /* synthetic */ Byte next() {
        return Byte.valueOf(y());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
