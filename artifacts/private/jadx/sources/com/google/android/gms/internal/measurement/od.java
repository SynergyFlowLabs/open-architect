package com.google.android.gms.internal.measurement;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class od implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Comparable f108717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f108718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ rd f108719c;

    od(rd rdVar, Comparable comparable, Object obj) {
        Objects.requireNonNull(rdVar);
        this.f108719c = rdVar;
        this.f108717a = comparable;
        this.f108718b = obj;
    }

    private static final boolean l(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f108717a.compareTo(((od) obj).f108717a);
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
        return l(this.f108717a, entry.getKey()) && l(this.f108718b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f108717a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f108718b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f108717a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f108718b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    public final Comparable k() {
        return this.f108717a;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f108719c.h();
        Object obj2 = this.f108718b;
        this.f108718b = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f108717a);
        String strValueOf2 = String.valueOf(this.f108718b);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
        sb2.append(strValueOf);
        sb2.append("=");
        sb2.append(strValueOf2);
        return sb2.toString();
    }
}
