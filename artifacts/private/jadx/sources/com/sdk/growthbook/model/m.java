package com.sdk.growthbook.model;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class m extends q implements Map<String, q>, qj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, q> f266373a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m(@NotNull Map<String, ? extends q> value) {
        super(null);
        Intrinsics.checkNotNullParameter(value, "value");
        this.f266373a = value;
    }

    private final Map<String, q> i() {
        return this.f266373a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ m t(m mVar, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = mVar.f266373a;
        }
        return mVar.s(map);
    }

    @NotNull
    public Set<String> A() {
        return this.f266373a.keySet();
    }

    public int B() {
        return this.f266373a.size();
    }

    @NotNull
    public Collection<q> C() {
        return this.f266373a.values();
    }

    public q D(String str, q qVar, BiFunction<? super q, ? super q, ? extends q> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public q F(String str, q qVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public q G(String str, q qVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public q remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public q K(String str, q qVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean L(String str, q qVar, q qVar2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ q compute(String str, BiFunction<? super String, ? super q, ? extends q> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ q computeIfAbsent(String str, Function<? super String, ? extends q> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ q computeIfPresent(String str, BiFunction<? super String, ? super q, ? extends q> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return n((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof q) {
            return p((q) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<String, q>> entrySet() {
        return w();
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Intrinsics.areEqual(this.f266373a, ((m) obj).f266373a);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ q get(Object obj) {
        if (obj instanceof String) {
            return v((String) obj);
        }
        int i10 = 2 >> 0;
        return null;
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f266373a.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f266373a.isEmpty();
    }

    public q k(String str, BiFunction<? super String, ? super q, ? extends q> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return A();
    }

    public q l(String str, Function<? super String, ? extends q> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public q m(String str, BiFunction<? super String, ? super q, ? extends q> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ q merge(String str, q qVar, BiFunction<? super q, ? super q, ? extends q> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean n(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f266373a.containsKey(key);
    }

    public boolean p(@NotNull q value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f266373a.containsValue(value);
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ q put(String str, q qVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends q> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ q putIfAbsent(String str, q qVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ q replace(String str, q qVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction<? super String, ? super q, ? extends q> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @NotNull
    public final m s(@NotNull Map<String, ? extends q> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new m(value);
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return B();
    }

    @NotNull
    public String toString() {
        return "GBJson(value=" + this.f266373a + ")";
    }

    public final /* bridge */ q u(Object obj) {
        if (obj instanceof String) {
            return v((String) obj);
        }
        return null;
    }

    @Nullable
    public q v(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f266373a.get(key);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<q> values() {
        return C();
    }

    @NotNull
    public Set<Map.Entry<String, q>> w() {
        return this.f266373a.entrySet();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ boolean replace(String str, q qVar, q qVar2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
