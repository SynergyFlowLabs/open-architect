package org.apache.commons.collections4.keyvalue;

import java.util.Map;
import org.apache.commons.collections4.x;

/* JADX INFO: loaded from: classes14.dex */
public class d<K, V> extends a<K, V> {
    public d() {
        super(null, null);
    }

    @Override // org.apache.commons.collections4.keyvalue.a
    public K a(K k10) {
        if (k10 != this) {
            return (K) super.a(k10);
        }
        throw new IllegalArgumentException("DefaultKeyValue may not contain itself as a key.");
    }

    public Map.Entry<K, V> b() {
        return new e(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (getKey() != null ? getKey().equals(dVar.getKey()) : dVar.getKey() == null) {
            if (getValue() != null ? getValue().equals(dVar.getValue()) : dVar.getValue() == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (getKey() == null ? 0 : getKey().hashCode()) ^ (getValue() != null ? getValue().hashCode() : 0);
    }

    @Override // org.apache.commons.collections4.keyvalue.a, java.util.Map.Entry
    public V setValue(V v10) {
        if (v10 != this) {
            return (V) super.setValue(v10);
        }
        throw new IllegalArgumentException("DefaultKeyValue may not contain itself as a value.");
    }

    public d(K k10, V v10) {
        super(k10, v10);
    }

    public d(x<? extends K, ? extends V> xVar) {
        super(xVar.getKey(), xVar.getValue());
    }

    public d(Map.Entry<? extends K, ? extends V> entry) {
        super(entry.getKey(), entry.getValue());
    }
}
