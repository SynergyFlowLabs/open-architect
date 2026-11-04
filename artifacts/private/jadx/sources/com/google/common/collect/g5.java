package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@a4
@com.google.common.annotations.b
public abstract class g5<K, V> extends m5 implements Map<K, V> {

    /* JADX INFO: loaded from: classes5.dex */
    protected abstract class a extends b8.s<K, V> {
        protected a() {
        }

        @Override // com.google.common.collect.b8.s
        Map<K, V> l() {
            return g5.this;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    protected class b extends b8.b0<K, V> {
        public b() {
            super(g5.this);
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    protected class c extends b8.q0<K, V> {
        public c() {
            super(g5.this);
        }
    }

    protected g5() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.m5
    public abstract Map<K, V> L0();

    protected void N0() {
        p7.g(entrySet().iterator());
    }

    protected boolean P0(@fj.a Object key) {
        return b8.q(this, key);
    }

    protected boolean S0(@fj.a Object value) {
        return b8.r(this, value);
    }

    protected boolean V0(@fj.a Object object) {
        return b8.w(this, object);
    }

    protected int W0() {
        return z9.k(entrySet());
    }

    protected boolean X0() {
        return !entrySet().iterator().hasNext();
    }

    protected void Y0(Map<? extends K, ? extends V> map) {
        b8.j0(this, map);
    }

    @fj.a
    protected V Z0(@fj.a Object key) {
        Iterator<Map.Entry<K, V>> it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (com.google.common.base.d0.a(next.getKey(), key)) {
                V value = next.getValue();
                it.remove();
                return value;
            }
        }
        return null;
    }

    protected String a1() {
        return b8.y0(this);
    }

    public void clear() {
        L0().clear();
    }

    public boolean containsKey(@fj.a Object key) {
        return L0().containsKey(key);
    }

    public boolean containsValue(@fj.a Object value) {
        return L0().containsValue(value);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return L0().entrySet();
    }

    public boolean equals(@fj.a Object object) {
        return object == this || L0().equals(object);
    }

    @fj.a
    public V get(@fj.a Object key) {
        return L0().get(key);
    }

    public int hashCode() {
        return L0().hashCode();
    }

    public boolean isEmpty() {
        return L0().isEmpty();
    }

    public Set<K> keySet() {
        return L0().keySet();
    }

    @z7.a
    @fj.a
    public V put(@b9 K key, @b9 V value) {
        return L0().put(key, value);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        L0().putAll(map);
    }

    @z7.a
    @fj.a
    public V remove(@fj.a Object key) {
        return L0().remove(key);
    }

    public int size() {
        return L0().size();
    }

    public Collection<V> values() {
        return L0().values();
    }
}
