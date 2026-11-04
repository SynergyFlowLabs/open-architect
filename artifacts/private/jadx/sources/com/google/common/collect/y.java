package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(serializable = true)
final class y<F, T> extends a9<F> implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f118313e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final com.google.common.base.t<F, ? extends T> f118314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final a9<T> f118315d;

    y(com.google.common.base.t<F, ? extends T> function, a9<T> ordering) {
        this.f118314c = (com.google.common.base.t) com.google.common.base.j0.E(function);
        this.f118315d = (a9) com.google.common.base.j0.E(ordering);
    }

    @Override // com.google.common.collect.a9, java.util.Comparator
    public int compare(@b9 F f10, @b9 F f11) {
        return this.f118315d.compare(this.f118314c.apply(f10), this.f118314c.apply(f11));
    }

    @Override // java.util.Comparator
    public boolean equals(@fj.a Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof y) {
            y yVar = (y) object;
            if (this.f118314c.equals(yVar.f118314c) && this.f118315d.equals(yVar.f118315d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return com.google.common.base.d0.b(this.f118314c, this.f118315d);
    }

    public String toString() {
        return this.f118315d + ".onResultOf(" + this.f118314c + ")";
    }
}
