package com.google.common.collect;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true)
final class q6<K, V> extends h6<V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n6<K, V> f117988d;

    class a extends nb<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final nb<Map.Entry<K, V>> f117989a;

        a() {
            this.f117989a = q6.this.f117988d.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f117989a.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            return this.f117989a.next().getValue();
        }
    }

    class b extends l6<V> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ l6 f117991f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ q6 f117992g;

        b(final q6 this$0, final l6 val$entryList) {
            this.f117991f = val$entryList;
            this.f117992g = this$0;
        }

        @Override // java.util.List
        public V get(int i10) {
            return (V) ((Map.Entry) this.f117991f.get(i10)).getValue();
        }

        @Override // com.google.common.collect.h6
        boolean m() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f117991f.size();
        }

        @Override // com.google.common.collect.l6, com.google.common.collect.h6
        @com.google.common.annotations.c
        @com.google.common.annotations.d
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    private static class c<V> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f117993b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final n6<?, V> f117994a;

        c(n6<?, V> map) {
            this.f117994a = map;
        }

        Object readResolve() {
            return this.f117994a.values();
        }
    }

    q6(n6<K, V> map) {
        this.f117988d = map;
    }

    @Override // com.google.common.collect.h6
    public l6<V> c() {
        return new b(this, this.f117988d.entrySet().c());
    }

    @Override // com.google.common.collect.h6, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@fj.a Object object) {
        return object != null && p7.p(iterator(), object);
    }

    @Override // com.google.common.collect.h6
    boolean m() {
        return true;
    }

    @Override // com.google.common.collect.h6, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: n */
    public nb<V> iterator() {
        return new a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f117988d.size();
    }

    @Override // com.google.common.collect.h6
    @com.google.common.annotations.c
    Object writeReplace() {
        return new c(this.f117988d);
    }
}
