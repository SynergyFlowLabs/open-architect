package org.apache.commons.collections4.keyvalue;

import java.util.Map;
import org.apache.commons.collections4.x;

/* JADX INFO: loaded from: classes14.dex */
public final class e<K, V> extends b<K, V> {
    public e(K k10, V v10) {
        super(k10, v10);
    }

    public e(x<? extends K, ? extends V> xVar) {
        super(xVar.getKey(), xVar.getValue());
    }

    public e(Map.Entry<? extends K, ? extends V> entry) {
        super(entry.getKey(), entry.getValue());
    }
}
