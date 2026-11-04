package com.google.android.gms.measurement.internal;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class c0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterator f109806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ zzbe f109807b;

    c0(zzbe zzbeVar) {
        Objects.requireNonNull(zzbeVar);
        this.f109807b = zzbeVar;
        this.f109806a = zzbeVar.p2().keySet().iterator();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String next() {
        return (String) this.f109806a.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f109806a.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
