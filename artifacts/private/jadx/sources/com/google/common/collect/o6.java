package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true)
abstract class o6<K, V> extends z6<Map.Entry<K, V>> {

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    private static class a<K, V> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f117888b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final n6<K, V> f117889a;

        a(n6<K, V> map) {
            this.f117889a = map;
        }

        Object readResolve() {
            return this.f117889a.entrySet();
        }
    }

    static final class b<K, V> extends o6<K, V> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final transient n6<K, V> f117890i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final transient l6<Map.Entry<K, V>> f117891j;

        b(n6<K, V> map, Map.Entry<K, V>[] entries) {
            this(map, l6.p(entries));
        }

        @Override // com.google.common.collect.z6
        l6<Map.Entry<K, V>> D() {
            return this.f117891j;
        }

        @Override // com.google.common.collect.o6
        n6<K, V> R() {
            return this.f117890i;
        }

        @Override // com.google.common.collect.h6
        @com.google.common.annotations.c("not used in GWT")
        int d(Object[] dst, int offset) {
            return this.f117891j.d(dst, offset);
        }

        @Override // com.google.common.collect.z6, com.google.common.collect.h6, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: n */
        public nb<Map.Entry<K, V>> iterator() {
            return this.f117891j.iterator();
        }

        @Override // com.google.common.collect.o6, com.google.common.collect.z6, com.google.common.collect.h6
        @com.google.common.annotations.c
        @com.google.common.annotations.d
        Object writeReplace() {
            return super.writeReplace();
        }

        b(n6<K, V> map, l6<Map.Entry<K, V>> entries) {
            this.f117890i = map;
            this.f117891j = entries;
        }
    }

    o6() {
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use EntrySetSerializedForm");
    }

    @Override // com.google.common.collect.z6
    @com.google.common.annotations.c
    boolean F() {
        return R().m();
    }

    abstract n6<K, V> R();

    @Override // com.google.common.collect.h6, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@fj.a Object object) {
        if (object instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) object;
            V v10 = R().get(entry.getKey());
            if (v10 != null && v10.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.z6, java.util.Collection, java.util.Set
    public int hashCode() {
        return R().hashCode();
    }

    @Override // com.google.common.collect.h6
    boolean m() {
        return R().n();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return R().size();
    }

    @Override // com.google.common.collect.z6, com.google.common.collect.h6
    @com.google.common.annotations.c
    @com.google.common.annotations.d
    Object writeReplace() {
        return new a(R());
    }
}
