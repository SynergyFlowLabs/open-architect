package com.google.common.collect;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true)
public final class u<R, C, V> extends q<R, C, V> implements Serializable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f118145j = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l6<R> f118146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l6<C> f118147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final n6<R, Integer> f118148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final n6<C, Integer> f118149f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final V[][] f118150g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @a8.b
    @fj.a
    private transient u<R, C, V>.f f118151h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @a8.b
    @fj.a
    private transient u<R, C, V>.h f118152i;

    class a extends com.google.common.collect.b<oa.a<R, C, V>> {
        a(int size) {
            super(size);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public oa.a<R, C, V> b(final int index) {
            return u.this.r(index);
        }
    }

    class b extends bb.b<R, C, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f118154a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f118155b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f118156c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ u f118157d;

        b(final u this$0, final int val$index) {
            this.f118156c = val$index;
            this.f118157d = this$0;
            this.f118154a = val$index / this$0.f118147d.size();
            this.f118155b = val$index % this$0.f118147d.size();
        }

        @Override // com.google.common.collect.oa.a
        public C a() {
            return (C) this.f118157d.f118147d.get(this.f118155b);
        }

        @Override // com.google.common.collect.oa.a
        public R b() {
            return (R) this.f118157d.f118146c.get(this.f118154a);
        }

        @Override // com.google.common.collect.oa.a
        @fj.a
        public V getValue() {
            return (V) this.f118157d.k(this.f118154a, this.f118155b);
        }
    }

    class c extends com.google.common.collect.b<V> {
        c(int size) {
            super(size);
        }

        @Override // com.google.common.collect.b
        @fj.a
        protected V b(int i10) {
            return (V) u.this.u(i10);
        }
    }

    private static abstract class d<K, V> extends b8.a0<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n6<K, Integer> f118159a;

        class a extends com.google.common.collect.g<K, V> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f118160a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f118161b;

            a(final d this$0, final int val$index) {
                this.f118160a = val$index;
                this.f118161b = this$0;
            }

            @Override // com.google.common.collect.g, java.util.Map.Entry
            public K getKey() {
                return (K) this.f118161b.c(this.f118160a);
            }

            @Override // com.google.common.collect.g, java.util.Map.Entry
            @b9
            public V getValue() {
                return (V) this.f118161b.e(this.f118160a);
            }

            @Override // com.google.common.collect.g, java.util.Map.Entry
            @b9
            public V setValue(@b9 V v10) {
                return (V) this.f118161b.f(this.f118160a, v10);
            }
        }

        class b extends com.google.common.collect.b<Map.Entry<K, V>> {
            b(int size) {
                super(size);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.b
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> b(final int index) {
                return d.this.b(index);
            }
        }

        /* synthetic */ d(n6 n6Var, a aVar) {
            this(n6Var);
        }

        @Override // com.google.common.collect.b8.a0
        Iterator<Map.Entry<K, V>> a() {
            return new b(size());
        }

        Map.Entry<K, V> b(final int index) {
            com.google.common.base.j0.C(index, size());
            return new a(this, index);
        }

        K c(int index) {
            return this.f118159a.keySet().c().get(index);
        }

        @Override // com.google.common.collect.b8.a0, java.util.AbstractMap, java.util.Map
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@fj.a Object key) {
            return this.f118159a.containsKey(key);
        }

        abstract String d();

        @b9
        abstract V e(int index);

        @b9
        abstract V f(int index, @b9 V newValue);

        @Override // java.util.AbstractMap, java.util.Map
        @fj.a
        public V get(@fj.a Object key) {
            Integer num = this.f118159a.get(key);
            if (num == null) {
                return null;
            }
            return e(num.intValue());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return this.f118159a.isEmpty();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return this.f118159a.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @fj.a
        public V put(K key, @b9 V value) {
            Integer num = this.f118159a.get(key);
            if (num != null) {
                return f(num.intValue(), value);
            }
            throw new IllegalArgumentException(d() + " " + key + " not in " + this.f118159a.keySet());
        }

        @Override // java.util.AbstractMap, java.util.Map
        @fj.a
        public V remove(@fj.a Object key) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.b8.a0, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f118159a.size();
        }

        private d(n6<K, Integer> keyIndex) {
            this.f118159a = keyIndex;
        }
    }

    private class e extends d<R, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f118163b;

        e(int columnIndex) {
            super(u.this.f118148e, null);
            this.f118163b = columnIndex;
        }

        @Override // com.google.common.collect.u.d
        String d() {
            return "Row";
        }

        @Override // com.google.common.collect.u.d
        @fj.a
        V e(int i10) {
            return (V) u.this.k(i10, this.f118163b);
        }

        @Override // com.google.common.collect.u.d
        @fj.a
        V f(int i10, @fj.a V v10) {
            return (V) u.this.y(i10, this.f118163b, v10);
        }
    }

    private class f extends d<C, Map<R, V>> {
        /* synthetic */ f(u uVar, a aVar) {
            this();
        }

        @Override // com.google.common.collect.u.d
        String d() {
            return "Column";
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.u.d
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Map<R, V> e(int index) {
            return new e(index);
        }

        @Override // com.google.common.collect.u.d, java.util.AbstractMap, java.util.Map
        @fj.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Map<R, V> put(C key, Map<R, V> value) {
            throw new UnsupportedOperationException();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.u.d
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Map<R, V> f(int index, Map<R, V> newValue) {
            throw new UnsupportedOperationException();
        }

        private f() {
            super(u.this.f118149f, null);
        }
    }

    private class g extends d<C, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f118166b;

        g(int rowIndex) {
            super(u.this.f118149f, null);
            this.f118166b = rowIndex;
        }

        @Override // com.google.common.collect.u.d
        String d() {
            return "Column";
        }

        @Override // com.google.common.collect.u.d
        @fj.a
        V e(int i10) {
            return (V) u.this.k(this.f118166b, i10);
        }

        @Override // com.google.common.collect.u.d
        @fj.a
        V f(int i10, @fj.a V v10) {
            return (V) u.this.y(this.f118166b, i10, v10);
        }
    }

    private class h extends d<R, Map<C, V>> {
        /* synthetic */ h(u uVar, a aVar) {
            this();
        }

        @Override // com.google.common.collect.u.d
        String d() {
            return "Row";
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.u.d
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Map<C, V> e(int index) {
            return new g(index);
        }

        @Override // com.google.common.collect.u.d, java.util.AbstractMap, java.util.Map
        @fj.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Map<C, V> put(R key, Map<C, V> value) {
            throw new UnsupportedOperationException();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.u.d
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Map<C, V> f(int index, Map<C, V> newValue) {
            throw new UnsupportedOperationException();
        }

        private h() {
            super(u.this.f118148e, null);
        }
    }

    private u(Iterable<? extends R> iterable, Iterable<? extends C> iterable2) {
        l6<R> l6VarV = l6.v(iterable);
        this.f118146c = l6VarV;
        l6<C> l6VarV2 = l6.v(iterable2);
        this.f118147d = l6VarV2;
        com.google.common.base.j0.d(l6VarV.isEmpty() == l6VarV2.isEmpty());
        this.f118148e = b8.Q(l6VarV);
        this.f118149f = b8.Q(l6VarV2);
        this.f118150g = (V[][]) ((Object[][]) Array.newInstance((Class<?>) Object.class, l6VarV.size(), l6VarV2.size()));
        q();
    }

    public static <R, C, V> u<R, C, V> n(oa<R, C, ? extends V> table) {
        return table instanceof u ? new u<>((u) table) : new u<>(table);
    }

    public static <R, C, V> u<R, C, V> o(Iterable<? extends R> rowKeys, Iterable<? extends C> columnKeys) {
        return new u<>(rowKeys, columnKeys);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public oa.a<R, C, V> r(final int index) {
        return new b(this, index);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @fj.a
    public V u(int index) {
        return k(index / this.f118147d.size(), index % this.f118147d.size());
    }

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    public void A0(oa<? extends R, ? extends C, ? extends V> table) {
        super.A0(table);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    public Set<oa.a<R, C, V>> D0() {
        return super.D0();
    }

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    public boolean F0(@fj.a Object rowKey) {
        return this.f118148e.containsKey(rowKey);
    }

    @Override // com.google.common.collect.oa
    public Map<C, V> J0(R rowKey) {
        com.google.common.base.j0.E(rowKey);
        Integer num = this.f118148e.get(rowKey);
        return num == null ? Collections.EMPTY_MAP : new g(num.intValue());
    }

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    public boolean M(@fj.a Object columnKey) {
        return this.f118149f.containsKey(columnKey);
    }

    @Override // com.google.common.collect.q
    Iterator<oa.a<R, C, V>> a() {
        return new a(size());
    }

    @Override // com.google.common.collect.oa
    public Map<C, Map<R, V>> a0() {
        u<R, C, V>.f fVar = this.f118151h;
        if (fVar != null) {
            return fVar;
        }
        u<R, C, V>.f fVar2 = new f(this, null);
        this.f118151h = fVar2;
        return fVar2;
    }

    @Override // com.google.common.collect.oa
    public Map<R, V> c0(C columnKey) {
        com.google.common.base.j0.E(columnKey);
        Integer num = this.f118149f.get(columnKey);
        return num == null ? Collections.EMPTY_MAP : new e(num.intValue());
    }

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    @z7.e("Always throws UnsupportedOperationException")
    @Deprecated
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    public boolean containsValue(@fj.a Object value) {
        for (V[] vArr : this.f118150g) {
            for (V v10 : vArr) {
                if (com.google.common.base.d0.a(value, v10)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.common.collect.q
    Iterator<V> d() {
        return new c(size());
    }

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    @z7.a
    @fj.a
    public V e0(R rowKey, C columnKey, @fj.a V value) {
        com.google.common.base.j0.E(rowKey);
        com.google.common.base.j0.E(columnKey);
        Integer num = this.f118148e.get(rowKey);
        com.google.common.base.j0.y(num != null, "Row %s not in %s", rowKey, this.f118146c);
        Integer num2 = this.f118149f.get(columnKey);
        com.google.common.base.j0.y(num2 != null, "Column %s not in %s", columnKey, this.f118147d);
        return y(num.intValue(), num2.intValue(), value);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    public /* bridge */ /* synthetic */ boolean equals(@fj.a Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    public boolean isEmpty() {
        return this.f118146c.isEmpty() || this.f118147d.isEmpty();
    }

    @fj.a
    public V k(int rowIndex, int columnIndex) {
        com.google.common.base.j0.C(rowIndex, this.f118146c.size());
        com.google.common.base.j0.C(columnIndex, this.f118147d.size());
        return this.f118150g[rowIndex][columnIndex];
    }

    public l6<C> l() {
        return this.f118147d;
    }

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public z6<C> E0() {
        return this.f118149f.keySet();
    }

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    public boolean n0(@fj.a Object rowKey, @fj.a Object columnKey) {
        return F0(rowKey) && M(columnKey);
    }

    @z7.a
    @fj.a
    public V p(@fj.a Object rowKey, @fj.a Object columnKey) {
        Integer num = this.f118148e.get(rowKey);
        Integer num2 = this.f118149f.get(columnKey);
        if (num != null && num2 != null) {
            return y(num.intValue(), num2.intValue(), null);
        }
        return null;
    }

    public void q() {
        for (V[] vArr : this.f118150g) {
            Arrays.fill(vArr, (Object) null);
        }
    }

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    @z7.a
    @Deprecated
    @z7.e("Always throws UnsupportedOperationException")
    @fj.a
    public V remove(@fj.a Object rowKey, @fj.a Object columnKey) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.oa
    public Map<R, Map<C, V>> s() {
        u<R, C, V>.h hVar = this.f118152i;
        if (hVar == null) {
            hVar = new h(this, null);
            this.f118152i = hVar;
        }
        return hVar;
    }

    @Override // com.google.common.collect.oa
    public int size() {
        return this.f118146c.size() * this.f118147d.size();
    }

    @Override // com.google.common.collect.q
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public l6<R> v() {
        return this.f118146c;
    }

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    public Collection<V> values() {
        return super.values();
    }

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    @fj.a
    public V w(@fj.a Object rowKey, @fj.a Object columnKey) {
        Integer num = this.f118148e.get(rowKey);
        Integer num2 = this.f118149f.get(columnKey);
        if (num == null || num2 == null) {
            return null;
        }
        return k(num.intValue(), num2.intValue());
    }

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public z6<R> t() {
        return this.f118148e.keySet();
    }

    @z7.a
    @fj.a
    public V y(int rowIndex, int columnIndex, @fj.a V value) {
        com.google.common.base.j0.C(rowIndex, this.f118146c.size());
        com.google.common.base.j0.C(columnIndex, this.f118147d.size());
        V[] vArr = this.f118150g[rowIndex];
        V v10 = vArr[columnIndex];
        vArr[columnIndex] = value;
        return v10;
    }

    @com.google.common.annotations.c
    public V[][] z(Class<V> cls) {
        V[][] vArr = (V[][]) ((Object[][]) Array.newInstance((Class<?>) cls, this.f118146c.size(), this.f118147d.size()));
        for (int i10 = 0; i10 < this.f118146c.size(); i10++) {
            V[] vArr2 = this.f118150g[i10];
            System.arraycopy(vArr2, 0, vArr[i10], 0, vArr2.length);
        }
        return vArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private u(oa<R, C, ? extends V> table) {
        this(table.t(), table.E0());
        A0(table);
    }

    private u(u<R, C, V> uVar) {
        l6<R> l6Var = uVar.f118146c;
        this.f118146c = l6Var;
        l6<C> l6Var2 = uVar.f118147d;
        this.f118147d = l6Var2;
        this.f118148e = uVar.f118148e;
        this.f118149f = uVar.f118149f;
        V[][] vArr = (V[][]) ((Object[][]) Array.newInstance((Class<?>) Object.class, l6Var.size(), l6Var2.size()));
        this.f118150g = vArr;
        for (int i10 = 0; i10 < this.f118146c.size(); i10++) {
            V[] vArr2 = uVar.f118150g[i10];
            System.arraycopy(vArr2, 0, vArr[i10], 0, vArr2.length);
        }
    }
}
