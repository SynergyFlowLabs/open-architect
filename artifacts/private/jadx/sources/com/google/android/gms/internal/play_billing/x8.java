package com.google.android.gms.internal.play_billing;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class x8 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Comparable f109433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f109434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ b9 f109435c;

    x8(b9 b9Var, Comparable comparable, Object obj) {
        this.f109435c = b9Var;
        this.f109433a = comparable;
        this.f109434b = obj;
    }

    private static final boolean l(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f109433a.compareTo(((x8) obj).f109433a);
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
        return l(this.f109433a, entry.getKey()) && l(this.f109434b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f109433a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f109434b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f109433a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f109434b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    public final Comparable k() {
        return this.f109433a;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f109435c.o();
        Object obj2 = this.f109434b;
        this.f109434b = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f109433a) + "=" + String.valueOf(this.f109434b);
    }
}
