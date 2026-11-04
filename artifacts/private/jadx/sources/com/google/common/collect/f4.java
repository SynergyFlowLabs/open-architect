package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.d
@a4
@com.google.common.annotations.b(emulated = true)
public final class f4<K extends Enum<K>, V> extends a<K, V> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @com.google.common.annotations.c
    private static final long f117390h = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    transient Class<K> f117391g;

    private f4(Class<K> keyType) {
        super(new EnumMap(keyType), new HashMap());
        this.f117391g = keyType;
    }

    public static <K extends Enum<K>, V> f4<K, V> D1(Class<K> keyType) {
        return new f4<>(keyType);
    }

    public static <K extends Enum<K>, V> f4<K, V> F1(Map<K, ? extends V> map) {
        f4<K, V> f4VarD1 = D1(e4.H1(map));
        f4VarD1.putAll(map);
        return f4VarD1;
    }

    @com.google.common.annotations.c
    private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
        stream.defaultReadObject();
        Object object = stream.readObject();
        Objects.requireNonNull(object);
        this.f117391g = (Class) object;
        y1(new EnumMap(this.f117391g), new HashMap());
        x9.b(this, stream);
    }

    @com.google.common.annotations.c
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeObject(this.f117391g);
        x9.i(this, stream);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.a
    /* JADX INFO: renamed from: C1, reason: merged with bridge method [inline-methods] */
    public K m1(K key) {
        return (K) com.google.common.base.j0.E(key);
    }

    @Override // com.google.common.collect.a, com.google.common.collect.w
    @z7.a
    @fj.a
    /* JADX INFO: renamed from: G1, reason: merged with bridge method [inline-methods] */
    public V L2(K k10, @b9 V v10) {
        return (V) super.L2(k10, v10);
    }

    @com.google.common.annotations.c
    public Class<K> H1() {
        return this.f117391g;
    }

    @Override // com.google.common.collect.a, com.google.common.collect.g5, java.util.Map, com.google.common.collect.w
    @z7.a
    @fj.a
    /* JADX INFO: renamed from: I1, reason: merged with bridge method [inline-methods] */
    public V put(K k10, @b9 V v10) {
        return (V) super.put(k10, v10);
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
