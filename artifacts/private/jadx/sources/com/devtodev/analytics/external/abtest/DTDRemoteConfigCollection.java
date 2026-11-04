package com.devtodev.analytics.external.abtest;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qj.a;

/* JADX INFO: loaded from: classes3.dex */
public final class DTDRemoteConfigCollection implements Map<String, DTDRemoteConfigValue>, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map f98012a = MapsKt.emptyMap();

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: compute, reason: avoid collision after fix types in other method */
    public DTDRemoteConfigValue compute2(String str, BiFunction<? super String, ? super DTDRemoteConfigValue, ? extends DTDRemoteConfigValue> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: computeIfAbsent, reason: avoid collision after fix types in other method */
    public DTDRemoteConfigValue computeIfAbsent2(String str, Function<? super String, ? extends DTDRemoteConfigValue> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: computeIfPresent, reason: avoid collision after fix types in other method */
    public DTDRemoteConfigValue computeIfPresent2(String str, BiFunction<? super String, ? super DTDRemoteConfigValue, ? extends DTDRemoteConfigValue> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return containsKey((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof DTDRemoteConfigValue) {
            return containsValue((DTDRemoteConfigValue) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<String, DTDRemoteConfigValue>> entrySet() {
        return getEntries();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Map
    public final /* bridge */ DTDRemoteConfigValue get(Object obj) {
        if (obj instanceof String) {
            return get((String) obj);
        }
        return null;
    }

    @NotNull
    public Set<Map.Entry<String, DTDRemoteConfigValue>> getEntries() {
        return this.f98012a.entrySet();
    }

    @NotNull
    public Set<String> getKeys() {
        return this.f98012a.keySet();
    }

    public int getSize() {
        return this.f98012a.size();
    }

    @NotNull
    public Collection<DTDRemoteConfigValue> getValues() {
        return this.f98012a.values();
    }

    public final boolean hasKey(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f98012a.containsKey(key);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f98012a.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return getKeys();
    }

    /* JADX INFO: renamed from: merge, reason: avoid collision after fix types in other method */
    public DTDRemoteConfigValue merge2(String str, DTDRemoteConfigValue dTDRemoteConfigValue, BiFunction<? super DTDRemoteConfigValue, ? super DTDRemoteConfigValue, ? extends DTDRemoteConfigValue> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: put, reason: avoid collision after fix types in other method */
    public DTDRemoteConfigValue put2(String str, DTDRemoteConfigValue dTDRemoteConfigValue) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends DTDRemoteConfigValue> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: putIfAbsent, reason: avoid collision after fix types in other method */
    public DTDRemoteConfigValue putIfAbsent2(String str, DTDRemoteConfigValue dTDRemoteConfigValue) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Map
    public DTDRemoteConfigValue remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: replace, reason: avoid collision after fix types in other method */
    public DTDRemoteConfigValue replace2(String str, DTDRemoteConfigValue dTDRemoteConfigValue) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction<? super String, ? super DTDRemoteConfigValue, ? extends DTDRemoteConfigValue> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void reset$DTDAnalytics_androidRelease() {
        this.f98012a = MapsKt.emptyMap();
    }

    public final void set$DTDAnalytics_androidRelease(@NotNull String key, @NotNull DTDRemoteConfigValue value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Map mutableMap = MapsKt.toMutableMap(this.f98012a);
        mutableMap.put(key, value);
        this.f98012a = mutableMap;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<DTDRemoteConfigValue> values() {
        return getValues();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ DTDRemoteConfigValue compute(String str, BiFunction<? super String, ? super DTDRemoteConfigValue, ? extends DTDRemoteConfigValue> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ DTDRemoteConfigValue computeIfAbsent(String str, Function<? super String, ? extends DTDRemoteConfigValue> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ DTDRemoteConfigValue computeIfPresent(String str, BiFunction<? super String, ? super DTDRemoteConfigValue, ? extends DTDRemoteConfigValue> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f98012a.containsKey(key);
    }

    public boolean containsValue(@NotNull DTDRemoteConfigValue value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f98012a.containsValue(value);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ DTDRemoteConfigValue get(Object obj) {
        if (obj instanceof String) {
            return get((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ DTDRemoteConfigValue merge(String str, DTDRemoteConfigValue dTDRemoteConfigValue, BiFunction<? super DTDRemoteConfigValue, ? super DTDRemoteConfigValue, ? extends DTDRemoteConfigValue> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ DTDRemoteConfigValue put(String str, DTDRemoteConfigValue dTDRemoteConfigValue) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ DTDRemoteConfigValue putIfAbsent(String str, DTDRemoteConfigValue dTDRemoteConfigValue) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ DTDRemoteConfigValue replace(String str, DTDRemoteConfigValue dTDRemoteConfigValue) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @NotNull
    public DTDRemoteConfigValue get(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        DTDRemoteConfigValue dTDRemoteConfigValue = (DTDRemoteConfigValue) this.f98012a.get(key);
        return dTDRemoteConfigValue == null ? new DTDRemoteConfigValue("", DTDRemoteConfigSource.Empty) : dTDRemoteConfigValue;
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ boolean replace(String str, DTDRemoteConfigValue dTDRemoteConfigValue, DTDRemoteConfigValue dTDRemoteConfigValue2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: replace, reason: avoid collision after fix types in other method */
    public boolean replace2(String str, DTDRemoteConfigValue dTDRemoteConfigValue, DTDRemoteConfigValue dTDRemoteConfigValue2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
