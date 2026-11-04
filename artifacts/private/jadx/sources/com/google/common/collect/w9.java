package com.google.common.collect;

import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
public interface w9<R, C, V> extends oa<R, C, V> {
    @Override // com.google.common.collect.oa
    SortedMap<R, Map<C, V>> s();

    @Override // com.google.common.collect.oa
    SortedSet<R> t();
}
