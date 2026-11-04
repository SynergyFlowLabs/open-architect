package com.google.vr.sdk.deps;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class z3<K> implements Map.Entry<K, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map.Entry<K, y3> f129713a;

    private z3(Map.Entry<K, y3> entry) {
        this.f129713a = entry;
    }

    public final y3 a() {
        return this.f129713a.getValue();
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f129713a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f129713a.getValue() == null) {
            return null;
        }
        return y3.e();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof t4) {
            return this.f129713a.getValue().c((t4) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    /* synthetic */ z3(Map.Entry entry, byte b10) {
        this(entry);
    }
}
