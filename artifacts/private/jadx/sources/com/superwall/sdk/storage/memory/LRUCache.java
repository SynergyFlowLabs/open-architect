package com.superwall.sdk.storage.memory;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nLRUCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LRUCache.kt\ncom/superwall/sdk/storage/memory/LRUCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,64:1\n1#2:65\n*E\n"})
public final class LRUCache<K, V> implements GenericCache<K, V> {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_SIZE = 100;
    private static final boolean PRESENT = true;

    @NotNull
    private final GenericCache<K, V> delegate;

    @Nullable
    private K eldestKeyToRemove;

    @NotNull
    private final LRUCache$keyMap$1 keyMap;
    private final int minimalSize;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public LRUCache(@NotNull GenericCache<K, V> delegate, final int i10) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
        this.minimalSize = i10;
        this.keyMap = new LinkedHashMap<K, Boolean>(this, i10) { // from class: com.superwall.sdk.storage.memory.LRUCache$keyMap$1
            final /* synthetic */ LRUCache<K, V> this$0;

            {
                this.this$0 = this;
            }

            public /* bridge */ boolean containsValue(Boolean bool) {
                return super.containsValue((Object) bool);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<Map.Entry<K, Boolean>> entrySet() {
                return (Set<Map.Entry<K, Boolean>>) getEntries();
            }

            public /* bridge */ Set<Map.Entry<Object, Boolean>> getEntries() {
                return super.entrySet();
            }

            public /* bridge */ Set<Object> getKeys() {
                return super.keySet();
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            public /* bridge */ Collection<Boolean> getValues() {
                return super.values();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<K> keySet() {
                return (Set<K>) getKeys();
            }

            public /* bridge */ boolean remove(Object obj, Boolean bool) {
                return super.remove(obj, (Object) bool);
            }

            @Override // java.util.LinkedHashMap
            protected boolean removeEldestEntry(Map.Entry<K, Boolean> eldest) {
                Intrinsics.checkNotNullParameter(eldest, "eldest");
                boolean z10 = size() > ((LRUCache) this.this$0).minimalSize;
                if (z10) {
                    ((LRUCache) this.this$0).eldestKeyToRemove = eldest.getKey();
                }
                return z10;
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ int size() {
                return getSize();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Collection<Boolean> values() {
                return getValues();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsValue(Object obj) {
                if (obj instanceof Boolean) {
                    return containsValue((Boolean) obj);
                }
                return false;
            }

            @Override // java.util.HashMap, java.util.Map
            public final /* bridge */ boolean remove(Object obj, Object obj2) {
                if (obj2 instanceof Boolean) {
                    return remove(obj, (Boolean) obj2);
                }
                return false;
            }
        };
    }

    private final void cycleKeyMap(K k10) {
        put(k10, Boolean.TRUE);
        K k11 = this.eldestKeyToRemove;
        if (k11 != null) {
            this.delegate.remove(k11);
        }
        this.eldestKeyToRemove = null;
    }

    @Override // com.superwall.sdk.storage.memory.GenericCache
    public void clear() {
        clear();
        this.delegate.clear();
    }

    @Override // com.superwall.sdk.storage.memory.GenericCache
    @Nullable
    public V get(K k10) {
        get(k10);
        return this.delegate.get(k10);
    }

    @Override // com.superwall.sdk.storage.memory.GenericCache
    public int getSize() {
        return this.delegate.getSize();
    }

    @Override // com.superwall.sdk.storage.memory.GenericCache
    @Nullable
    public V remove(K k10) {
        return this.delegate.remove(k10);
    }

    @Override // com.superwall.sdk.storage.memory.GenericCache
    public void set(K k10, V v10) {
        this.delegate.set(k10, v10);
        cycleKeyMap(k10);
    }

    public /* synthetic */ LRUCache(GenericCache genericCache, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(genericCache, (i11 & 2) != 0 ? 100 : i10);
    }
}
