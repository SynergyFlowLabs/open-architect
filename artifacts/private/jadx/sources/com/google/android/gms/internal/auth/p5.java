package com.google.android.gms.internal.auth;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class p5 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Comparable f107737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f107738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ v5 f107739c;

    p5(v5 v5Var, Comparable comparable, Object obj) {
        this.f107739c = v5Var;
        this.f107737a = comparable;
        this.f107738b = obj;
    }

    private static final boolean l(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f107737a.compareTo(((p5) obj).f107737a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return l(this.f107737a, entry.getKey()) && l(this.f107738b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f107737a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f107738b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f107737a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f107738b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    public final Comparable k() {
        return this.f107737a;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f107739c.n();
        Object obj2 = this.f107738b;
        this.f107738b = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f107737a) + "=" + String.valueOf(this.f107738b);
    }
}
