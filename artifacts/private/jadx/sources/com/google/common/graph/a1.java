package com.google.common.graph;

import java.util.AbstractSet;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@g0
abstract class a1<N> extends AbstractSet<h0<N>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final N f118558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final x<N> f118559b;

    a1(x<N> graph, N node) {
        this.f118559b = graph;
        this.f118558a = node;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@fj.a Object obj) {
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (this.f118559b.c()) {
            if (!h0Var.i()) {
                return false;
            }
            Object objS = h0Var.s();
            Object objT = h0Var.t();
            return (this.f118558a.equals(objS) && this.f118559b.a((Object) this.f118558a).contains(objT)) || (this.f118558a.equals(objT) && this.f118559b.b((Object) this.f118558a).contains(objS));
        }
        if (h0Var.i()) {
            return false;
        }
        Set<N> setD = this.f118559b.d(this.f118558a);
        Object objL = h0Var.l();
        Object objM = h0Var.m();
        return (this.f118558a.equals(objM) && setD.contains(objL)) || (this.f118558a.equals(objL) && setD.contains(objM));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(@fj.a Object o10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f118559b.c() ? (this.f118559b.f(this.f118558a) + this.f118559b.l(this.f118558a)) - (this.f118559b.a((Object) this.f118558a).contains(this.f118558a) ? 1 : 0) : this.f118559b.d(this.f118558a).size();
    }
}
