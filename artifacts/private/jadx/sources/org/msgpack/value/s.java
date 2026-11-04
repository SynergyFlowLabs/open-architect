package org.msgpack.value;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public interface s extends x {
    x[] B();

    Set<Map.Entry<x, x>> entrySet();

    Set<x> keySet();

    Map<x, x> map();

    int size();

    Collection<x> values();
}
