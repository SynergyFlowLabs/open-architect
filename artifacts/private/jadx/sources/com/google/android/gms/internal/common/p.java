package com.google.android.gms.internal.common;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class p implements Iterator {
    protected p() {
    }

    @Override // java.util.Iterator
    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
