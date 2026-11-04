package com.google.common.collect;

import java.lang.Comparable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@a4
abstract class k<C extends Comparable> implements i9<C> {
    k() {
    }

    @Override // com.google.common.collect.i9
    public void a(f9<C> range) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.i9
    public boolean c(C value) {
        return h(value) != null;
    }

    @Override // com.google.common.collect.i9
    public void clear() {
        a(f9.a());
    }

    @Override // com.google.common.collect.i9
    public boolean e(f9<C> otherRange) {
        return !k(otherRange).isEmpty();
    }

    @Override // com.google.common.collect.i9
    public boolean equals(@fj.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i9) {
            return m().equals(((i9) obj).m());
        }
        return false;
    }

    @Override // com.google.common.collect.i9
    public void f(Iterable<f9<C>> ranges) {
        Iterator<f9<C>> it = ranges.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    @Override // com.google.common.collect.i9
    public boolean g(i9<C> other) {
        return j(other.m());
    }

    @Override // com.google.common.collect.i9
    @fj.a
    public abstract f9<C> h(C value);

    @Override // com.google.common.collect.i9
    public final int hashCode() {
        return m().hashCode();
    }

    @Override // com.google.common.collect.i9
    public abstract boolean i(f9<C> otherRange);

    @Override // com.google.common.collect.i9
    public boolean isEmpty() {
        return m().isEmpty();
    }

    @Override // com.google.common.collect.i9
    public boolean j(Iterable<f9<C>> ranges) {
        Iterator<f9<C>> it = ranges.iterator();
        while (it.hasNext()) {
            if (!i(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.common.collect.i9
    public void n(i9<C> other) {
        f(other.m());
    }

    @Override // com.google.common.collect.i9
    public void o(f9<C> range) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.i9
    public void p(Iterable<f9<C>> ranges) {
        Iterator<f9<C>> it = ranges.iterator();
        while (it.hasNext()) {
            o(it.next());
        }
    }

    @Override // com.google.common.collect.i9
    public void q(i9<C> other) {
        p(other.m());
    }

    @Override // com.google.common.collect.i9
    public final String toString() {
        return m().toString();
    }
}
