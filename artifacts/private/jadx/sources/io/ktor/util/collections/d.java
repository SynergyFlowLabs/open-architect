package io.ktor.util.collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class d<Key, Value> implements Map<Key, Value>, qj.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap<Key, Value> f296556a;

    public d() {
        this(0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(Function0 function0, Object obj) {
        return function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object e(Function1 function1, Object obj) {
        return function1.invoke(obj);
    }

    public final Value c(Key key, @NotNull final Function0<? extends Value> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        ConcurrentHashMap<Key, Value> concurrentHashMap = this.f296556a;
        final Function1 function1 = new Function1() { // from class: io.ktor.util.collections.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d.d(block, obj);
            }
        };
        return concurrentHashMap.computeIfAbsent(key, new Function() { // from class: io.ktor.util.collections.c
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return d.e(function1, obj);
            }
        });
    }

    @Override // java.util.Map
    public void clear() {
        this.f296556a.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f296556a.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f296556a.containsValue(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<Key, Value>> entrySet() {
        return f();
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object obj) {
        if (obj instanceof Map) {
            return Intrinsics.areEqual(obj, this.f296556a);
        }
        return false;
    }

    @NotNull
    public Set<Map.Entry<Key, Value>> f() {
        Set<Map.Entry<Key, Value>> setEntrySet = this.f296556a.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "<get-entries>(...)");
        return setEntrySet;
    }

    @NotNull
    public Set<Key> g() {
        Set<Key> setKeySet = this.f296556a.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
        return setKeySet;
    }

    @Override // java.util.Map
    @Nullable
    public Value get(Object obj) {
        return this.f296556a.get(obj);
    }

    public int h() {
        return this.f296556a.size();
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f296556a.hashCode();
    }

    @NotNull
    public Collection<Value> i() {
        Collection<Value> collectionValues = this.f296556a.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        return collectionValues;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f296556a.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Key> keySet() {
        return g();
    }

    @Override // java.util.Map
    @Nullable
    public Value put(Key key, Value value) {
        return this.f296556a.put(key, value);
    }

    @Override // java.util.Map
    public void putAll(@NotNull Map<? extends Key, ? extends Value> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        this.f296556a.putAll(from);
    }

    @Override // java.util.Map
    @Nullable
    public Value remove(Object obj) {
        return this.f296556a.remove(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return h();
    }

    @NotNull
    public String toString() {
        return "ConcurrentMapJvm by " + this.f296556a;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<Value> values() {
        return i();
    }

    public d(int i10) {
        this.f296556a = new ConcurrentHashMap<>(i10);
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        return this.f296556a.remove(obj, obj2);
    }

    public /* synthetic */ d(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 32 : i10);
    }
}
