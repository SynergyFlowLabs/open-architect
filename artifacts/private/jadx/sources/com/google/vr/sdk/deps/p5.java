package com.google.vr.sdk.deps;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class p5 implements Iterator<Map.Entry<Object, Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f129538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Iterator<Map.Entry<Object, Object>> f129539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ n5 f129540c;

    private p5(n5 n5Var) {
        this.f129540c = n5Var;
        this.f129538a = n5Var.f129497b.size();
    }

    private final Iterator<Map.Entry<Object, Object>> b() {
        if (this.f129539b == null) {
            this.f129539b = this.f129540c.f129501f.entrySet().iterator();
        }
        return this.f129539b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f129538a;
        return (i10 > 0 && i10 <= this.f129540c.f129497b.size()) || b().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Map.Entry<Object, Object> next() {
        if (b().hasNext()) {
            return b().next();
        }
        List list = this.f129540c.f129497b;
        int i10 = this.f129538a - 1;
        this.f129538a = i10;
        return (Map.Entry) list.get(i10);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ p5(n5 n5Var, byte b10) {
        this(n5Var);
    }
}
