package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(serializable = true)
final class h3<T> extends a9<T> implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f117435d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Comparator<T> f117436c;

    h3(Comparator<T> comparator) {
        this.f117436c = (Comparator) com.google.common.base.j0.E(comparator);
    }

    @Override // com.google.common.collect.a9, java.util.Comparator
    public int compare(@b9 T a10, @b9 T b10) {
        return this.f117436c.compare(a10, b10);
    }

    @Override // java.util.Comparator
    public boolean equals(@fj.a Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof h3) {
            return this.f117436c.equals(((h3) object).f117436c);
        }
        return false;
    }

    public int hashCode() {
        return this.f117436c.hashCode();
    }

    public String toString() {
        return this.f117436c.toString();
    }
}
