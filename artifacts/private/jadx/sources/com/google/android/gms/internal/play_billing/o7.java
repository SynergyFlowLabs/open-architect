package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class o7 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterator f109245a;

    public o7(Iterator it) {
        this.f109245a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f109245a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f109245a.next();
        return entry.getValue() instanceof q7 ? new n7(entry, null) : entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f109245a.remove();
    }
}
