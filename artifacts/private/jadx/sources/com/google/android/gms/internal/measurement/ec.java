package com.google.android.gms.internal.measurement;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class ec implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map.Entry f108391a;

    public final gc a() {
        return (gc) this.f108391a.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f108391a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((gc) this.f108391a.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof yc) {
            return ((gc) this.f108391a.getValue()).a((yc) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
