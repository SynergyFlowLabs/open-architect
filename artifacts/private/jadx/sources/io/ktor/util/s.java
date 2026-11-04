package io.ktor.util;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nCaseInsensitiveMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CaseInsensitiveMap.kt\nio/ktor/util/CaseInsensitiveMap\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,80:1\n216#2,2:81\n*S KotlinDebug\n*F\n+ 1 CaseInsensitiveMap.kt\nio/ktor/util/CaseInsensitiveMap\n*L\n32#1:81,2\n*E\n"})
public final class s<Value> implements Map<String, Value>, qj.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<u, Value> f296805a = new LinkedHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map.Entry e(Map.Entry DelegatingMutableSet) {
        Intrinsics.checkNotNullParameter(DelegatingMutableSet, "$this$DelegatingMutableSet");
        return new o0(((u) DelegatingMutableSet.getKey()).a(), DelegatingMutableSet.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map.Entry f(Map.Entry DelegatingMutableSet) {
        Intrinsics.checkNotNullParameter(DelegatingMutableSet, "$this$DelegatingMutableSet");
        return new o0(y1.a((String) DelegatingMutableSet.getKey()), DelegatingMutableSet.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String g(u DelegatingMutableSet) {
        Intrinsics.checkNotNullParameter(DelegatingMutableSet, "$this$DelegatingMutableSet");
        return DelegatingMutableSet.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u h(String DelegatingMutableSet) {
        Intrinsics.checkNotNullParameter(DelegatingMutableSet, "$this$DelegatingMutableSet");
        return y1.a(DelegatingMutableSet);
    }

    @Override // java.util.Map
    public void clear() {
        this.f296805a.clear();
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return i((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        return this.f296805a.containsValue(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<String, Value>> entrySet() {
        return k();
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object obj) {
        if (obj == null || !(obj instanceof s)) {
            return false;
        }
        return Intrinsics.areEqual(((s) obj).f296805a, this.f296805a);
    }

    @Override // java.util.Map
    public final /* bridge */ Value get(Object obj) {
        if (obj instanceof String) {
            return j((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f296805a.hashCode();
    }

    public boolean i(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f296805a.containsKey(new u(key));
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f296805a.isEmpty();
    }

    @Nullable
    public Value j(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f296805a.get(y1.a(key));
    }

    @NotNull
    public Set<Map.Entry<String, Value>> k() {
        return new j0(this.f296805a.entrySet(), new Function1() { // from class: io.ktor.util.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s.e((Map.Entry) obj);
            }
        }, new Function1() { // from class: io.ktor.util.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s.f((Map.Entry) obj);
            }
        });
    }

    @Override // java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return l();
    }

    @NotNull
    public Set<String> l() {
        return new j0(this.f296805a.keySet(), new Function1() { // from class: io.ktor.util.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s.g((u) obj);
            }
        }, new Function1() { // from class: io.ktor.util.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s.h((String) obj);
            }
        });
    }

    public int m() {
        return this.f296805a.size();
    }

    @NotNull
    public Collection<Value> n() {
        return this.f296805a.values();
    }

    @Override // java.util.Map
    @Nullable
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Value put(@NotNull String key, @NotNull Value value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f296805a.put(y1.a(key), value);
    }

    @Nullable
    public Value p(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f296805a.remove(y1.a(key));
    }

    @Override // java.util.Map
    public void putAll(@NotNull Map<? extends String, ? extends Value> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        for (Map.Entry<? extends String, ? extends Value> entry : from.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final /* bridge */ Value remove(Object obj) {
        if (obj instanceof String) {
            return p((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<Value> values() {
        return n();
    }
}
