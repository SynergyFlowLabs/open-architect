package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
abstract class x5 implements z5 {
    x5() {
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
