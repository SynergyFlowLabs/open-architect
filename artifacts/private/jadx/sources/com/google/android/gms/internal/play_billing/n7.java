package com.google.android.gms.internal.play_billing;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class n7 implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map.Entry f109236a;

    public final q7 a() {
        return (q7) this.f109236a.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f109236a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((q7) this.f109236a.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof h8) {
            return ((q7) this.f109236a.getValue()).c((h8) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
