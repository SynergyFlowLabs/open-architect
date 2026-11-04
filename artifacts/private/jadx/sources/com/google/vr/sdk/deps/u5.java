package com.google.vr.sdk.deps;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class u5 implements Comparable<u5>, Map.Entry<Object, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f129614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f129615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ n5 f129616c;

    u5(n5 n5Var, Map.Entry<Object, Object> entry) {
        this(n5Var, (Comparable) entry.getKey(), entry.getValue());
    }

    private static boolean l(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Comparable, java.lang.Object] */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(u5 u5Var) {
        return this.f129614a.compareTo(u5Var.f129614a);
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
        return l(this.f129614a, entry.getKey()) && l(this.f129615b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f129614a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f129615b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f129614a;
        int iHashCode = 0;
        int iHashCode2 = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f129615b;
        if (obj2 != null) {
            iHashCode = obj2.hashCode();
        }
        return iHashCode2 ^ iHashCode;
    }

    public final Object k() {
        return this.f129614a;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f129616c.p();
        Object obj2 = this.f129615b;
        this.f129615b = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f129614a);
        String strValueOf2 = String.valueOf(this.f129615b);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
        sb2.append(strValueOf);
        sb2.append("=");
        sb2.append(strValueOf2);
        return sb2.toString();
    }

    u5(n5 n5Var, Object obj, Object obj2) {
        this.f129616c = n5Var;
        this.f129614a = obj;
        this.f129615b = obj2;
    }
}
