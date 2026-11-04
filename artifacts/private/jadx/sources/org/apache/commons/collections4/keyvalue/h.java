package org.apache.commons.collections4.keyvalue;

import java.util.Map;
import org.apache.commons.collections4.a1;
import org.apache.commons.collections4.x;

/* JADX INFO: loaded from: classes14.dex */
public final class h<K, V> extends b<K, V> implements a1 {
    public h(K k10, V v10) {
        super(k10, v10);
    }

    @Override // org.apache.commons.collections4.keyvalue.b, org.apache.commons.collections4.keyvalue.a, java.util.Map.Entry
    public V setValue(V v10) {
        throw new UnsupportedOperationException("setValue() is not supported");
    }

    public h(x<? extends K, ? extends V> xVar) {
        super(xVar.getKey(), xVar.getValue());
    }

    public h(Map.Entry<? extends K, ? extends V> entry) {
        super(entry.getKey(), entry.getValue());
    }
}
