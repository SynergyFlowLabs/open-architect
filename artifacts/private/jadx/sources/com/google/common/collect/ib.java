package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true, serializable = true)
public class ib<K, V> extends n<K, V> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @com.google.common.annotations.c
    @com.google.common.annotations.d
    private static final long f117483m = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private transient Comparator<? super K> f117484k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private transient Comparator<? super V> f117485l;

    ib(Comparator<? super K> keyComparator, Comparator<? super V> valueComparator) {
        super(new TreeMap(keyComparator));
        this.f117484k = keyComparator;
        this.f117485l = valueComparator;
    }

    public static <K extends Comparable, V extends Comparable> ib<K, V> Q() {
        return new ib<>(a9.z(), a9.z());
    }

    public static <K extends Comparable, V extends Comparable> ib<K, V> S(k8<? extends K, ? extends V> multimap) {
        return new ib<>(a9.z(), a9.z(), multimap);
    }

    public static <K, V> ib<K, V> T(Comparator<? super K> keyComparator, Comparator<? super V> valueComparator) {
        return new ib<>((Comparator) com.google.common.base.j0.E(keyComparator), (Comparator) com.google.common.base.j0.E(valueComparator));
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
        stream.defaultReadObject();
        Comparator<? super K> comparator = (Comparator) stream.readObject();
        Objects.requireNonNull(comparator);
        this.f117484k = comparator;
        Comparator<? super V> comparator2 = (Comparator) stream.readObject();
        Objects.requireNonNull(comparator2);
        this.f117485l = comparator2;
        D(new TreeMap(this.f117484k));
        x9.d(this, stream);
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeObject(V());
        stream.writeObject(Y());
        x9.j(this, stream);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8
    public /* bridge */ /* synthetic */ boolean I0(@fj.a Object key, @fj.a Object value) {
        return super.I0(key, value);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.p, com.google.common.collect.m, com.google.common.collect.e
    /* JADX INFO: renamed from: J */
    public SortedSet<V> u() {
        return new TreeSet(this.f117485l);
    }

    @Override // com.google.common.collect.n, com.google.common.collect.p, com.google.common.collect.m, com.google.common.collect.h, com.google.common.collect.k8, com.google.common.collect.w7
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public NavigableMap<K, Collection<V>> l() {
        return (NavigableMap) super.l();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8
    @z7.a
    public /* bridge */ /* synthetic */ boolean R(k8 multimap) {
        return super.R(multimap);
    }

    @Override // com.google.common.collect.p, com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.k8, com.google.common.collect.y9
    @com.google.common.annotations.c
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public NavigableSet<V> x(@b9 K key) {
        return (NavigableSet) super.x((Object) key);
    }

    @Deprecated
    public Comparator<? super K> V() {
        return this.f117484k;
    }

    @Override // com.google.common.collect.n, com.google.common.collect.h, com.google.common.collect.k8
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public NavigableSet<K> keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // com.google.common.collect.ja
    public Comparator<? super V> Y() {
        return this.f117485l;
    }

    @Override // com.google.common.collect.e, com.google.common.collect.h
    Map<K, Collection<V>> a() {
        return x();
    }

    @Override // com.google.common.collect.p, com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.k8, com.google.common.collect.y9
    @z7.a
    public /* bridge */ /* synthetic */ SortedSet c(@fj.a Object key) {
        return super.c(key);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.k8
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.e, com.google.common.collect.k8
    public /* bridge */ /* synthetic */ boolean containsKey(@fj.a Object key) {
        return super.containsKey(key);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8
    public /* bridge */ /* synthetic */ boolean containsValue(@fj.a Object value) {
        return super.containsValue(value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.p, com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.k8, com.google.common.collect.y9
    @z7.a
    public /* bridge */ /* synthetic */ SortedSet d(@b9 Object key, Iterable values) {
        return super.d(key, values);
    }

    @Override // com.google.common.collect.m, com.google.common.collect.h, com.google.common.collect.k8, com.google.common.collect.w7
    public /* bridge */ /* synthetic */ boolean equals(@fj.a Object object) {
        return super.equals(object);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.k8, com.google.common.collect.y9
    /* JADX INFO: renamed from: k */
    public /* bridge */ /* synthetic */ Set u() {
        return super.u();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8
    public /* bridge */ /* synthetic */ q8 keys() {
        return super.keys();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.k8
    @z7.a
    public /* bridge */ /* synthetic */ boolean put(@b9 Object key, @b9 Object value) {
        return super.put(key, value);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8
    @z7.a
    public /* bridge */ /* synthetic */ boolean remove(@fj.a Object key, @fj.a Object value) {
        return super.remove(key, value);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.k8
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.h
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.h, com.google.common.collect.k8
    @z7.a
    public /* bridge */ /* synthetic */ boolean v(@b9 Object key, Iterable values) {
        return super.v(key, values);
    }

    @Override // com.google.common.collect.p, com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.k8
    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.e
    Collection<V> w(@b9 K key) {
        if (key == 0) {
            V().compare(key, key);
        }
        return super.w(key);
    }

    private ib(Comparator<? super K> keyComparator, Comparator<? super V> valueComparator, k8<? extends K, ? extends V> multimap) {
        this(keyComparator, valueComparator);
        R(multimap);
    }
}
