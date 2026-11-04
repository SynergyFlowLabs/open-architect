package kotlin.collections;

import com.rabbitmq.tools.jsonrpc.j;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.e1;
import org.jetbrains.annotations.Nullable;
import qj.g;

/* JADX INFO: loaded from: classes11.dex */
@e1(version = j.f266120g)
public abstract class AbstractMutableMap<K, V> extends java.util.AbstractMap<K, V> implements Map<K, V>, g {
    protected AbstractMutableMap() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    public abstract Set getEntries();

    public /* bridge */ Set<Object> getKeys() {
        return super.keySet();
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<Object> getValues() {
        return super.values();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return (Set<K>) getKeys();
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public abstract V put(K k10, V v10);

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<V> values() {
        return (Collection<V>) getValues();
    }
}
