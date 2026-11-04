package com.google.common.reflect;

import com.google.common.base.j0;
import com.google.common.collect.b8;
import com.google.common.collect.g5;
import com.google.common.collect.h5;
import com.google.common.collect.o5;
import com.google.common.collect.p7;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@d
public final class i<B> extends g5<q<? extends B>, B> implements p<B> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<q<? extends B>, B> f119833a = b8.Y();

    /* JADX INFO: Access modifiers changed from: private */
    static final class a<K, V> extends h5<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map.Entry<K, V> f119834a;

        /* JADX INFO: renamed from: com.google.common.reflect.i$a$a, reason: collision with other inner class name */
        class C1113a extends o5<Map.Entry<K, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Set f119835a;

            C1113a(final Set val$entries) {
                this.f119835a = val$entries;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.o5, com.google.common.collect.v4
            public Set<Map.Entry<K, V>> i1() {
                return this.f119835a;
            }

            @Override // com.google.common.collect.v4, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return a.X0(super.iterator());
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

        private a(Map.Entry<K, V> delegate) {
            this.f119834a = (Map.Entry) j0.E(delegate);
        }

        public static /* synthetic */ a V0(Map.Entry entry) {
            return new a(entry);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <K, V> Iterator<Map.Entry<K, V>> X0(Iterator<Map.Entry<K, V>> entries) {
            return p7.b0(entries, new com.google.common.base.t() { // from class: com.google.common.reflect.h
                @Override // com.google.common.base.t
                public final Object apply(Object obj) {
                    return i.a.V0((Map.Entry) obj);
                }
            });
        }

        static <K, V> Set<Map.Entry<K, V>> Y0(Set<Map.Entry<K, V>> entries) {
            return new C1113a(entries);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.h5, com.google.common.collect.m5
        /* JADX INFO: renamed from: L0 */
        public Map.Entry<K, V> i1() {
            return this.f119834a;
        }

        @Override // com.google.common.collect.h5, java.util.Map.Entry
        @k
        public V setValue(@k V value) {
            throw new UnsupportedOperationException();
        }
    }

    @fj.a
    private <T extends B> T f1(q<T> qVar) {
        return this.f119833a.get(qVar);
    }

    @fj.a
    private <T extends B> T i1(q<T> qVar, @k T t10) {
        return this.f119833a.put(qVar, t10);
    }

    @Override // com.google.common.reflect.p
    @fj.a
    public <T extends B> T G2(q<T> qVar) {
        return (T) f1(qVar.U());
    }

    @Override // com.google.common.reflect.p
    @z7.a
    @fj.a
    public <T extends B> T H3(q<T> qVar, @k T t10) {
        return (T) i1(qVar.U(), t10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.g5, com.google.common.collect.m5
    /* JADX INFO: renamed from: L0 */
    public Map<q<? extends B>, B> i1() {
        return this.f119833a;
    }

    @Override // com.google.common.collect.g5, java.util.Map, com.google.common.collect.w
    @z7.a
    @Deprecated
    @z7.e("Always throws UnsupportedOperationException")
    @fj.a
    /* JADX INFO: renamed from: c1, reason: merged with bridge method [inline-methods] */
    public B put(q<? extends B> key, @k B value) {
        throw new UnsupportedOperationException("Please use putInstance() instead.");
    }

    @Override // com.google.common.reflect.p
    @z7.a
    @fj.a
    public <T extends B> T d1(Class<T> cls, @k T t10) {
        return (T) i1(q.S(cls), t10);
    }

    @Override // com.google.common.collect.g5, java.util.Map
    public Set<Map.Entry<q<? extends B>, B>> entrySet() {
        return a.Y0(super.entrySet());
    }

    @Override // com.google.common.collect.g5, java.util.Map, com.google.common.collect.w
    @z7.e("Always throws UnsupportedOperationException")
    @Deprecated
    public void putAll(Map<? extends q<? extends B>, ? extends B> map) {
        throw new UnsupportedOperationException("Please use putInstance() instead.");
    }

    @Override // com.google.common.reflect.p
    @fj.a
    public <T extends B> T u1(Class<T> cls) {
        return (T) f1(q.S(cls));
    }
}
