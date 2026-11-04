package org.apache.commons.collections4.trie;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import org.apache.commons.collections4.k0;

/* JADX INFO: loaded from: classes14.dex */
public class d<E> extends b<String, E> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f336379j = 4446367780901817838L;

    public d() {
        super(new qk.a());
    }

    @Override // org.apache.commons.collections4.trie.b, org.apache.commons.collections4.j0, org.apache.commons.collections4.s
    public /* bridge */ /* synthetic */ k0 T() {
        return super.T();
    }

    @Override // org.apache.commons.collections4.trie.b, java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.n0
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // org.apache.commons.collections4.trie.b, java.util.SortedMap
    public /* bridge */ /* synthetic */ Comparator comparator() {
        return super.comparator();
    }

    @Override // org.apache.commons.collections4.trie.b, java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.r
    public /* bridge */ /* synthetic */ boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    @Override // org.apache.commons.collections4.trie.b, java.util.AbstractMap, java.util.Map, java.util.SortedMap, org.apache.commons.collections4.r
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // org.apache.commons.collections4.trie.b, java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.r
    public /* bridge */ /* synthetic */ Object get(Object obj) {
        return super.get(obj);
    }

    @Override // org.apache.commons.collections4.trie.b, java.util.AbstractMap, java.util.Map, java.util.SortedMap, org.apache.commons.collections4.r
    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    @Override // org.apache.commons.collections4.trie.b, java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.r
    public /* bridge */ /* synthetic */ Object remove(Object obj) {
        return super.remove(obj);
    }

    @Override // org.apache.commons.collections4.trie.b, java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.r
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // org.apache.commons.collections4.trie.b, java.util.AbstractMap, java.util.Map, java.util.SortedMap, org.apache.commons.collections4.r
    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    public d(Map<? extends String, ? extends E> map) {
        super(new qk.a(), map);
    }
}
