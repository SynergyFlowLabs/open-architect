package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class fc implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterator f108430a;

    public fc(Iterator it) {
        this.f108430a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f108430a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f108430a.next();
        return entry.getValue() instanceof gc ? new ec(entry, null) : entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f108430a.remove();
    }
}
