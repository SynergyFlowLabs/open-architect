package org.apache.commons.collections4.multimap;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import org.apache.commons.collections4.r0;
import org.apache.commons.collections4.s0;

/* JADX INFO: loaded from: classes14.dex */
public abstract class d<K, V> extends b<K, V> implements s0<K, V> {

    private class a extends b<K, V>.i implements Set<V> {
        public a(K k10) {
            super(k10);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            Set set = (Set) c();
            if (set == null) {
                return Collections.EMPTY_SET.equals(obj);
            }
            if (obj instanceof Set) {
                return r0.h(set, (Set) obj);
            }
            return false;
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return r0.f((Set) c());
        }
    }

    protected d() {
    }

    @Override // org.apache.commons.collections4.multimap.b
    protected Map<K, Set<V>> g() {
        return super.g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.commons.collections4.multimap.b
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public abstract Set<V> d();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.apache.commons.collections4.multimap.b
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Set<V> i(K k10) {
        return new a(k10);
    }

    protected d(Map<K, ? extends Set<V>> map) {
        super(map);
    }

    @Override // org.apache.commons.collections4.multimap.b, org.apache.commons.collections4.g0
    public Set<V> get(K k10) {
        return i(k10);
    }

    @Override // org.apache.commons.collections4.multimap.b, org.apache.commons.collections4.g0
    public Set<V> remove(Object obj) {
        return r0.c(g().remove(obj));
    }
}
