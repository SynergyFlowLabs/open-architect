package com.google.android.gms.internal.auth;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class r5 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f107785a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f107786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Iterator f107787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ v5 f107788d;

    /* synthetic */ r5(v5 v5Var, q5 q5Var) {
        this.f107788d = v5Var;
    }

    private final Iterator b() {
        if (this.f107787c == null) {
            this.f107787c = this.f107788d.f107860c.entrySet().iterator();
        }
        return this.f107787c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f107785a + 1 >= this.f107788d.f107859b.size()) {
            return !this.f107788d.f107860c.isEmpty() && b().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f107786b = true;
        int i10 = this.f107785a + 1;
        this.f107785a = i10;
        return i10 < this.f107788d.f107859b.size() ? (Map.Entry) this.f107788d.f107859b.get(this.f107785a) : (Map.Entry) b().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f107786b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f107786b = false;
        this.f107788d.n();
        if (this.f107785a >= this.f107788d.f107859b.size()) {
            b().remove();
            return;
        }
        v5 v5Var = this.f107788d;
        int i10 = this.f107785a;
        this.f107785a = i10 - 1;
        v5Var.l(i10);
    }
}
