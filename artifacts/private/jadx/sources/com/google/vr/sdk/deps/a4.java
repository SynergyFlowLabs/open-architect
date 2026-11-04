package com.google.vr.sdk.deps;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class a4<K> implements Iterator<Map.Entry<K, Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Iterator<Map.Entry<K, Object>> f127700a;

    public a4(Iterator<Map.Entry<K, Object>> it) {
        this.f127700a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f127700a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.f127700a.next();
        return next.getValue() instanceof y3 ? new z3(next, (byte) 0) : next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f127700a.remove();
    }
}
