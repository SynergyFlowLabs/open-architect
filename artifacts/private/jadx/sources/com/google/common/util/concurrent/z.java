package com.google.common.util.concurrent;

import com.google.common.collect.b8;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.d
@o0
@com.google.common.annotations.b
public final class z<K> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<K, AtomicLong> f120385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @a8.b
    @fj.a
    private transient Map<K, Long> f120386b;

    class a implements com.google.common.base.t<AtomicLong, Long> {
        a() {
        }

        @Override // com.google.common.base.t
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long apply(AtomicLong atomic) {
            return Long.valueOf(atomic.get());
        }
    }

    private z(ConcurrentHashMap<K, AtomicLong> map) {
        this.f120385a = (ConcurrentHashMap) com.google.common.base.j0.E(map);
    }

    public static <K> z<K> e() {
        return new z<>(new ConcurrentHashMap());
    }

    public static <K> z<K> f(Map<? extends K, ? extends Long> m10) {
        z<K> zVarE = e();
        zVarE.p(m10);
        return zVarE;
    }

    private Map<K, Long> g() {
        return Collections.unmodifiableMap(b8.D0(this.f120385a, new a()));
    }

    @z7.a
    public long a(K key, long delta) {
        AtomicLong atomicLongPutIfAbsent;
        long j10;
        long j11;
        do {
            atomicLongPutIfAbsent = this.f120385a.get(key);
            if (atomicLongPutIfAbsent == null && (atomicLongPutIfAbsent = this.f120385a.putIfAbsent(key, new AtomicLong(delta))) == null) {
                break;
            }
            do {
                j10 = atomicLongPutIfAbsent.get();
                if (j10 != 0) {
                    j11 = j10 + delta;
                }
            } while (!atomicLongPutIfAbsent.compareAndSet(j10, j11));
            return j11;
        } while (!this.f120385a.replace(key, atomicLongPutIfAbsent, new AtomicLong(delta)));
        return delta;
    }

    public Map<K, Long> b() {
        Map<K, Long> map = this.f120386b;
        if (map != null) {
            return map;
        }
        Map<K, Long> mapG = g();
        this.f120386b = mapG;
        return mapG;
    }

    public void c() {
        this.f120385a.clear();
    }

    public boolean d(Object key) {
        return this.f120385a.containsKey(key);
    }

    @z7.a
    public long h(K key) {
        return a(key, -1L);
    }

    public long i(K key) {
        AtomicLong atomicLong = this.f120385a.get(key);
        if (atomicLong == null) {
            return 0L;
        }
        return atomicLong.get();
    }

    @z7.a
    public long j(K key, long delta) {
        AtomicLong atomicLongPutIfAbsent;
        long j10;
        do {
            atomicLongPutIfAbsent = this.f120385a.get(key);
            if (atomicLongPutIfAbsent == null && (atomicLongPutIfAbsent = this.f120385a.putIfAbsent(key, new AtomicLong(delta))) == null) {
                return 0L;
            }
            do {
                j10 = atomicLongPutIfAbsent.get();
                if (j10 == 0) {
                }
            } while (!atomicLongPutIfAbsent.compareAndSet(j10, j10 + delta));
            return j10;
        } while (!this.f120385a.replace(key, atomicLongPutIfAbsent, new AtomicLong(delta)));
        return 0L;
    }

    @z7.a
    public long k(K key) {
        return j(key, -1L);
    }

    @z7.a
    public long l(K key) {
        return j(key, 1L);
    }

    @z7.a
    public long m(K key) {
        return a(key, 1L);
    }

    public boolean n() {
        return this.f120385a.isEmpty();
    }

    @z7.a
    public long o(K key, long newValue) {
        AtomicLong atomicLongPutIfAbsent;
        long j10;
        do {
            atomicLongPutIfAbsent = this.f120385a.get(key);
            if (atomicLongPutIfAbsent == null && (atomicLongPutIfAbsent = this.f120385a.putIfAbsent(key, new AtomicLong(newValue))) == null) {
                return 0L;
            }
            do {
                j10 = atomicLongPutIfAbsent.get();
                if (j10 == 0) {
                }
            } while (!atomicLongPutIfAbsent.compareAndSet(j10, newValue));
            return j10;
        } while (!this.f120385a.replace(key, atomicLongPutIfAbsent, new AtomicLong(newValue)));
        return 0L;
    }

    public void p(Map<? extends K, ? extends Long> m10) {
        for (Map.Entry<? extends K, ? extends Long> entry : m10.entrySet()) {
            o(entry.getKey(), entry.getValue().longValue());
        }
    }

    long q(K key, long newValue) {
        AtomicLong atomicLongPutIfAbsent;
        do {
            atomicLongPutIfAbsent = this.f120385a.get(key);
            if (atomicLongPutIfAbsent == null && (atomicLongPutIfAbsent = this.f120385a.putIfAbsent(key, new AtomicLong(newValue))) == null) {
                return 0L;
            }
            long j10 = atomicLongPutIfAbsent.get();
            if (j10 != 0) {
                return j10;
            }
        } while (!this.f120385a.replace(key, atomicLongPutIfAbsent, new AtomicLong(newValue)));
        return 0L;
    }

    @z7.a
    public long r(K key) {
        long j10;
        AtomicLong atomicLong = this.f120385a.get(key);
        if (atomicLong == null) {
            return 0L;
        }
        do {
            j10 = atomicLong.get();
            if (j10 == 0) {
                break;
            }
        } while (!atomicLong.compareAndSet(j10, 0L));
        this.f120385a.remove(key, atomicLong);
        return j10;
    }

    boolean s(K key, long value) {
        AtomicLong atomicLong = this.f120385a.get(key);
        if (atomicLong == null) {
            return false;
        }
        long j10 = atomicLong.get();
        if (j10 != value) {
            return false;
        }
        if (j10 != 0 && !atomicLong.compareAndSet(j10, 0L)) {
            return false;
        }
        this.f120385a.remove(key, atomicLong);
        return true;
    }

    public void t() {
        Iterator<Map.Entry<K, AtomicLong>> it = this.f120385a.entrySet().iterator();
        while (it.hasNext()) {
            AtomicLong value = it.next().getValue();
            if (value != null && value.get() == 0) {
                it.remove();
            }
        }
    }

    public String toString() {
        return this.f120385a.toString();
    }

    @z7.a
    public boolean u(K key) {
        return s(key, 0L);
    }

    boolean v(K key, long expectedOldValue, long newValue) {
        if (expectedOldValue == 0) {
            if (q(key, newValue) != 0) {
                return false;
            }
            int i10 = 5 | 1;
            return true;
        }
        AtomicLong atomicLong = this.f120385a.get(key);
        if (atomicLong == null) {
            return false;
        }
        return atomicLong.compareAndSet(expectedOldValue, newValue);
    }

    public int w() {
        return this.f120385a.size();
    }

    public long x() {
        Iterator<AtomicLong> it = this.f120385a.values().iterator();
        long j10 = 0;
        while (it.hasNext()) {
            j10 += it.next().get();
        }
        return j10;
    }
}
