package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.w0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 3)
@SourceDebugExtension({"SMAP\nPersistentHashMapContentIterators.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentHashMapContentIterators.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/MapEntry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,184:1\n1#2:185\n*E\n"})
public class b<K, V> implements Map.Entry<K, V>, qj.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f35613c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K f35614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V f35615b;

    public b(K k10, V v10) {
        this.f35614a = k10;
        this.f35615b = v10;
    }

    @Override // java.util.Map.Entry
    public boolean equals(@Nullable Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && Intrinsics.areEqual(entry.getKey(), getKey()) && Intrinsics.areEqual(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.f35614a;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.f35615b;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        K key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        V value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public V setValue(V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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
