package io.ably.lib.util;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class d {
    private d() {
    }

    public static <K, V> Map<K, V> a(Map<K, V> map) {
        HashMap map2 = new HashMap(map.size());
        map2.putAll(map);
        return map2;
    }
}
