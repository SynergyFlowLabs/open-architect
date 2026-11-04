package io.ktor.util;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
final class o0<Key, Value> implements Map.Entry<Key, Value>, qj.g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Key f296746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Value f296747b;

    public o0(Key key, Value value) {
        this.f296746a = key;
        this.f296747b = value;
    }

    public void a(Value value) {
        this.f296747b = value;
    }

    @Override // java.util.Map.Entry
    public boolean equals(@Nullable Object obj) {
        if (obj != null && (obj instanceof Map.Entry)) {
            Map.Entry entry = (Map.Entry) obj;
            if (Intrinsics.areEqual(entry.getKey(), getKey()) && Intrinsics.areEqual(entry.getValue(), getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public Key getKey() {
        return this.f296746a;
    }

    @Override // java.util.Map.Entry
    public Value getValue() {
        return this.f296747b;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        Key key = getKey();
        Intrinsics.checkNotNull(key);
        int iHashCode = key.hashCode() + 527;
        Value value = getValue();
        Intrinsics.checkNotNull(value);
        return iHashCode + value.hashCode();
    }

    @Override // java.util.Map.Entry
    public Value setValue(Value value) {
        a(value);
        return getValue();
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}
