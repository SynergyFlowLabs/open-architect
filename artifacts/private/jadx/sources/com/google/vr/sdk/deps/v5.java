package com.google.vr.sdk.deps;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class v5 implements Iterator<Map.Entry<Object, Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f129630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f129631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Iterator<Map.Entry<Object, Object>> f129632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ n5 f129633d;

    private v5(n5 n5Var) {
        this.f129633d = n5Var;
        this.f129630a = -1;
    }

    private final Iterator<Map.Entry<Object, Object>> b() {
        if (this.f129632c == null) {
            this.f129632c = this.f129633d.f129498c.entrySet().iterator();
        }
        return this.f129632c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f129630a + 1 < this.f129633d.f129497b.size() || (!this.f129633d.f129498c.isEmpty() && b().hasNext());
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Map.Entry<Object, Object> next() {
        this.f129631b = true;
        int i10 = this.f129630a + 1;
        this.f129630a = i10;
        return i10 < this.f129633d.f129497b.size() ? (Map.Entry) this.f129633d.f129497b.get(this.f129630a) : b().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f129631b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f129631b = false;
        this.f129633d.p();
        if (this.f129630a >= this.f129633d.f129497b.size()) {
            b().remove();
            return;
        }
        n5 n5Var = this.f129633d;
        int i10 = this.f129630a;
        this.f129630a = i10 - 1;
        n5Var.k(i10);
    }

    /* synthetic */ v5(n5 n5Var, byte b10) {
        this(n5Var);
    }
}
