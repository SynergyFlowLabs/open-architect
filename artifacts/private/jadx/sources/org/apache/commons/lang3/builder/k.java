package org.apache.commons.lang3.builder;

/* JADX INFO: loaded from: classes14.dex */
final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f336983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f336984b;

    k(Object obj) {
        this.f336984b = System.identityHashCode(obj);
        this.f336983a = obj;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f336984b == kVar.f336984b && this.f336983a == kVar.f336983a;
    }

    public int hashCode() {
        return this.f336984b;
    }
}
