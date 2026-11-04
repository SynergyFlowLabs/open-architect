package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.d
@a4
@com.google.common.annotations.b(emulated = true)
public final class e4<K extends Enum<K>, V extends Enum<V>> extends a<K, V> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @com.google.common.annotations.c
    private static final long f117358i = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    transient Class<K> f117359g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    transient Class<V> f117360h;

    private e4(Class<K> keyTypeOrObjectUnderJ2cl, Class<V> valueTypeOrObjectUnderJ2cl) {
        super(new EnumMap(keyTypeOrObjectUnderJ2cl), new EnumMap(valueTypeOrObjectUnderJ2cl));
        this.f117359g = keyTypeOrObjectUnderJ2cl;
        this.f117360h = valueTypeOrObjectUnderJ2cl;
    }

    public static <K extends Enum<K>, V extends Enum<V>> e4<K, V> F1(Class<K> keyType, Class<V> valueType) {
        return new e4<>(keyType, valueType);
    }

    public static <K extends Enum<K>, V extends Enum<V>> e4<K, V> G1(Map<K, V> map) {
        e4<K, V> e4VarF1 = F1(H1(map), I1(map));
        e4VarF1.putAll(map);
        return e4VarF1;
    }

    static <K extends Enum<K>> Class<K> H1(Map<K, ?> map) {
        if (map instanceof e4) {
            return ((e4) map).f117359g;
        }
        if (map instanceof f4) {
            return ((f4) map).f117391g;
        }
        com.google.common.base.j0.d(!map.isEmpty());
        return d9.b(map.keySet().iterator().next());
    }

    private static <V extends Enum<V>> Class<V> I1(Map<?, V> map) {
        if (map instanceof e4) {
            return ((e4) map).f117360h;
        }
        com.google.common.base.j0.d(!map.isEmpty());
        return d9.b(map.values().iterator().next());
    }

    @com.google.common.annotations.c
    private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
        stream.defaultReadObject();
        Object object = stream.readObject();
        Objects.requireNonNull(object);
        this.f117359g = (Class) object;
        Object object2 = stream.readObject();
        Objects.requireNonNull(object2);
        this.f117360h = (Class) object2;
        y1(new EnumMap(this.f117359g), new EnumMap(this.f117360h));
        x9.b(this, stream);
    }

    @com.google.common.annotations.c
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeObject(this.f117359g);
        stream.writeObject(this.f117360h);
        x9.i(this, stream);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.a
    /* JADX INFO: renamed from: C1, reason: merged with bridge method [inline-methods] */
    public K m1(K key) {
        return (K) com.google.common.base.j0.E(key);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.a
    /* JADX INFO: renamed from: D1, reason: merged with bridge method [inline-methods] */
    public V n1(V value) {
        return (V) com.google.common.base.j0.E(value);
    }

    @com.google.common.annotations.c
    public Class<K> K1() {
        return this.f117359g;
    }

    @com.google.common.annotations.c
    public Class<V> L1() {
        return this.f117360h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.a, com.google.common.collect.w
    @z7.a
    @fj.a
    public /* bridge */ /* synthetic */ Object L2(@b9 Object key, @b9 Object value) {
        return super.L2(key, value);
    }

    @Override // com.google.common.collect.a, com.google.common.collect.w
    public /* bridge */ /* synthetic */ w Y2() {
        return super.Y2();
    }

    @Override // com.google.common.collect.a, com.google.common.collect.g5, java.util.Map
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.a, com.google.common.collect.g5, java.util.Map
    public /* bridge */ /* synthetic */ boolean containsValue(@fj.a Object value) {
        return super.containsValue(value);
    }

    @Override // com.google.common.collect.a, com.google.common.collect.g5, java.util.Map
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.a, com.google.common.collect.g5, java.util.Map
    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.a, com.google.common.collect.g5, java.util.Map, com.google.common.collect.w
    @z7.a
    @fj.a
    public /* bridge */ /* synthetic */ Object put(@b9 Object key, @b9 Object value) {
        return super.put(key, value);
    }

    @Override // com.google.common.collect.a, com.google.common.collect.g5, java.util.Map, com.google.common.collect.w
    public /* bridge */ /* synthetic */ void putAll(Map map) {
        super.putAll(map);
    }

    @Override // com.google.common.collect.a, com.google.common.collect.g5, java.util.Map
    @z7.a
    @fj.a
    public /* bridge */ /* synthetic */ Object remove(@fj.a Object key) {
        return super.remove(key);
    }

    @Override // com.google.common.collect.a, com.google.common.collect.g5, java.util.Map, com.google.common.collect.w
    public /* bridge */ /* synthetic */ Set values() {
        return super.values();
    }
}
