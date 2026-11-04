package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class y8 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f109448a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f109449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Iterator f109450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ b9 f109451d;

    /* synthetic */ y8(b9 b9Var, a9 a9Var) {
        this.f109451d = b9Var;
    }

    private final Iterator b() {
        if (this.f109450c == null) {
            this.f109450c = this.f109451d.f109061c.entrySet().iterator();
        }
        return this.f109450c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f109448a + 1;
        b9 b9Var = this.f109451d;
        if (i10 >= b9Var.f109060b) {
            return !b9Var.f109061c.isEmpty() && b().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f109449b = true;
        int i10 = this.f109448a + 1;
        this.f109448a = i10;
        b9 b9Var = this.f109451d;
        return i10 < b9Var.f109060b ? (x8) b9Var.f109059a[i10] : (Map.Entry) b().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f109449b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f109449b = false;
        this.f109451d.o();
        int i10 = this.f109448a;
        b9 b9Var = this.f109451d;
        if (i10 >= b9Var.f109060b) {
            b().remove();
        } else {
            this.f109448a = i10 - 1;
            b9Var.m(i10);
        }
    }
}
