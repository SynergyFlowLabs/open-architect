package org.apache.commons.collections4.map;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public class x<K, V> extends e<K, V> implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f336140d = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Object, Long> f336141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b<K, V> f336142c;

    public static class a<K, V> implements b<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f336143b = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f336144a;

        public a() {
            this(-1L);
        }

        @Override // org.apache.commons.collections4.map.x.b
        public long D2(K k10, V v10) {
            if (this.f336144a < 0) {
                return -1L;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j10 = this.f336144a;
            if (jCurrentTimeMillis > Long.MAX_VALUE - j10) {
                return -1L;
            }
            return jCurrentTimeMillis + j10;
        }

        public a(long j10) {
            this.f336144a = j10;
        }

        public a(long j10, TimeUnit timeUnit) {
            this(x.g(j10, timeUnit));
        }
    }

    public interface b<K, V> extends Serializable {
        long D2(K k10, V v10);
    }

    public x() {
        this(-1L);
    }

    private boolean c(long j10, Long l10) {
        boolean z10 = false;
        if (l10 != null) {
            long jLongValue = l10.longValue();
            if (jLongValue >= 0 && j10 >= jLongValue) {
                z10 = true;
            }
        }
        return z10;
    }

    private long d() {
        return System.currentTimeMillis();
    }

    private void e(long j10) {
        Iterator<Map.Entry<Object, Long>> it = this.f336141b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Object, Long> next = it.next();
            if (c(j10, next.getValue())) {
                super.remove(next.getKey());
                it.remove();
            }
        }
    }

    private void f(Object obj, long j10) {
        if (c(j10, this.f336141b.get(obj))) {
            remove(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long g(long j10, TimeUnit timeUnit) {
        if (timeUnit != null) {
            return TimeUnit.MILLISECONDS.convert(j10, timeUnit);
        }
        throw new NullPointerException("Time unit must not be null");
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f336038a = (Map) objectInputStream.readObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f336038a);
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.n0
    public void clear() {
        super.clear();
        this.f336141b.clear();
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.r
    public boolean containsKey(Object obj) {
        f(obj, d());
        return super.containsKey(obj);
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.r
    public boolean containsValue(Object obj) {
        e(d());
        return super.containsValue(obj);
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.r
    public Set<Map.Entry<K, V>> entrySet() {
        e(d());
        return super.entrySet();
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.r
    public V get(Object obj) {
        f(obj, d());
        return (V) super.get(obj);
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.r
    public boolean isEmpty() {
        e(d());
        return super.isEmpty();
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.r
    public Set<K> keySet() {
        e(d());
        return super.keySet();
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.n0
    public V put(K k10, V v10) {
        this.f336141b.put(k10, Long.valueOf(this.f336142c.D2(k10, v10)));
        return (V) super.put(k10, v10);
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.n0
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.r
    public V remove(Object obj) {
        this.f336141b.remove(obj);
        return (V) super.remove(obj);
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.r
    public int size() {
        e(d());
        return super.size();
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.r
    public Collection<V> values() {
        e(d());
        return super.values();
    }

    public x(b<K, V> bVar) {
        this(bVar, new HashMap());
    }

    public x(b<K, V> bVar, Map<K, V> map) {
        super(map);
        this.f336141b = new HashMap();
        if (bVar == null) {
            throw new NullPointerException("Policy must not be null.");
        }
        this.f336142c = bVar;
    }

    public x(long j10) {
        this(new a(j10), new HashMap());
    }

    public x(long j10, Map<K, V> map) {
        this(new a(j10), map);
    }

    public x(long j10, TimeUnit timeUnit) {
        this(g(j10, timeUnit));
    }

    public x(long j10, TimeUnit timeUnit, Map<K, V> map) {
        this(g(j10, timeUnit), map);
    }

    public x(Map<K, V> map) {
        this(-1L, map);
    }
}
