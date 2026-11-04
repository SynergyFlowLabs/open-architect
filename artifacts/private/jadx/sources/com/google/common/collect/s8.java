package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@a4
public final class s8<B> extends g5<Class<? extends B>, B> implements a0<B>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<? extends B>, B> f118114a;

    class a extends h5<Class<? extends B>, B> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map.Entry f118115a;

        a(final Map.Entry val$entry) {
            this.f118115a = val$entry;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.h5, com.google.common.collect.m5
        /* JADX INFO: renamed from: L0 */
        public Map.Entry<Class<? extends B>, B> i1() {
            return this.f118115a;
        }

        @Override // com.google.common.collect.h5, java.util.Map.Entry
        @b9
        public B setValue(@b9 B b10) {
            s8.i1(getKey(), b10);
            return (B) super.setValue(b10);
        }
    }

    class b extends o5<Map.Entry<Class<? extends B>, B>> {

        class a extends eb<Map.Entry<Class<? extends B>, B>, Map.Entry<Class<? extends B>, B>> {
            a(Iterator backingIterator) {
                super(backingIterator);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.eb
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Map.Entry<Class<? extends B>, B> b(Map.Entry<Class<? extends B>, B> from) {
                return s8.k1(from);
            }
        }

        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.o5, com.google.common.collect.v4
        public Set<Map.Entry<Class<? extends B>, B>> i1() {
            return s8.this.i1().entrySet();
        }

        @Override // com.google.common.collect.v4, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<Class<? extends B>, B>> iterator() {
            return new a(i1().iterator());
        }

        @Override // com.google.common.collect.v4, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return a1();
        }

        @Override // com.google.common.collect.v4, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) c1(tArr);
        }
    }

    private static final class c<B> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f118118b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<Class<? extends B>, B> f118119a;

        c(Map<Class<? extends B>, B> backingMap) {
            this.f118119a = backingMap;
        }

        Object readResolve() {
            return s8.n1(this.f118119a);
        }
    }

    private s8(Map<Class<? extends B>, B> delegate) {
        this.f118114a = (Map) com.google.common.base.j0.E(delegate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @z7.a
    @fj.a
    public static <T> T i1(Class<T> cls, @fj.a Object obj) {
        return (T) com.google.common.primitives.q.f(cls).cast(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <B> Map.Entry<Class<? extends B>, B> k1(final Map.Entry<Class<? extends B>, B> entry) {
        return new a(entry);
    }

    public static <B> s8<B> m1() {
        return new s8<>(new HashMap());
    }

    public static <B> s8<B> n1(Map<Class<? extends B>, B> backingMap) {
        return new s8<>(backingMap);
    }

    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    private Object writeReplace() {
        return new c(i1());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.g5, com.google.common.collect.m5
    /* JADX INFO: renamed from: L0 */
    public Map<Class<? extends B>, B> i1() {
        return this.f118114a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.a0
    @z7.a
    @fj.a
    public <T extends B> T d1(Class<T> cls, @b9 T t10) {
        return (T) i1(cls, put(cls, t10));
    }

    @Override // com.google.common.collect.g5, java.util.Map
    public Set<Map.Entry<Class<? extends B>, B>> entrySet() {
        return new b();
    }

    @Override // com.google.common.collect.g5, java.util.Map, com.google.common.collect.w
    public void putAll(Map<? extends Class<? extends B>, ? extends B> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            i1((Class) entry.getKey(), entry.getValue());
        }
        super.putAll(linkedHashMap);
    }

    @Override // com.google.common.collect.g5, java.util.Map, com.google.common.collect.w
    @z7.a
    @fj.a
    /* JADX INFO: renamed from: q1, reason: merged with bridge method [inline-methods] */
    public B put(Class<? extends B> cls, @b9 B b10) {
        i1(cls, b10);
        return (B) super.put(cls, b10);
    }

    @Override // com.google.common.collect.a0
    @fj.a
    public <T extends B> T u1(Class<T> cls) {
        return (T) i1(cls, get(cls));
    }
}
