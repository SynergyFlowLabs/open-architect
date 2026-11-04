package com.google.common.collect;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
@a4
@z7.j(containerOf = {"R", "C", androidx.exifinterface.media.a.Y4})
@com.google.common.annotations.b
final class v3<R, C, V> extends t9<R, C, V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n6<R, Integer> f118186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final n6<C, Integer> f118187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final n6<R, n6<C, V>> f118188f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final n6<C, n6<R, V>> f118189g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int[] f118190h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int[] f118191i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final V[][] f118192j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int[] f118193k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int[] f118194l;

    private final class b extends d<R, V> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f118195h;

        b(int columnIndex) {
            super(v3.this.f118191i[columnIndex]);
            this.f118195h = columnIndex;
        }

        @Override // com.google.common.collect.v3.d
        @fj.a
        V I(int i10) {
            return (V) v3.this.f118192j[i10][this.f118195h];
        }

        @Override // com.google.common.collect.v3.d
        n6<R, Integer> J() {
            return v3.this.f118186d;
        }

        @Override // com.google.common.collect.n6
        boolean n() {
            return true;
        }

        @Override // com.google.common.collect.v3.d, com.google.common.collect.n6.c, com.google.common.collect.n6
        @com.google.common.annotations.c
        @com.google.common.annotations.d
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    private final class c extends d<C, n6<R, V>> {
        @Override // com.google.common.collect.v3.d
        n6<C, Integer> J() {
            return v3.this.f118187e;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.v3.d
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public n6<R, V> I(int keyIndex) {
            return new b(keyIndex);
        }

        @Override // com.google.common.collect.n6
        boolean n() {
            return false;
        }

        @Override // com.google.common.collect.v3.d, com.google.common.collect.n6.c, com.google.common.collect.n6
        @com.google.common.annotations.c
        @com.google.common.annotations.d
        Object writeReplace() {
            return super.writeReplace();
        }

        private c() {
            super(v3.this.f118191i.length);
        }
    }

    private static abstract class d<K, V> extends n6.c<K, V> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f118198g;

        class a extends com.google.common.collect.c<Map.Entry<K, V>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f118199c = -1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final int f118200d;

            a() {
                this.f118200d = d.this.J().size();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.c
            @fj.a
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> b() {
                int i10 = this.f118199c;
                while (true) {
                    this.f118199c = i10 + 1;
                    int i11 = this.f118199c;
                    if (i11 >= this.f118200d) {
                        return c();
                    }
                    Object objI = d.this.I(i11);
                    if (objI != null) {
                        return b8.O(d.this.H(this.f118199c), objI);
                    }
                    i10 = this.f118199c;
                }
            }
        }

        d(int size) {
            this.f118198g = size;
        }

        private boolean isFull() {
            if (this.f118198g != J().size()) {
                return false;
            }
            int i10 = 5 >> 1;
            return true;
        }

        @Override // com.google.common.collect.n6.c
        nb<Map.Entry<K, V>> G() {
            return new a();
        }

        K H(int index) {
            return J().keySet().c().get(index);
        }

        @fj.a
        abstract V I(int keyIndex);

        abstract n6<K, Integer> J();

        @Override // com.google.common.collect.n6, java.util.Map
        @fj.a
        public V get(@fj.a Object key) {
            Integer num = J().get(key);
            if (num == null) {
                return null;
            }
            return I(num.intValue());
        }

        @Override // com.google.common.collect.n6.c, com.google.common.collect.n6
        z6<K> i() {
            return isFull() ? J().keySet() : super.i();
        }

        @Override // java.util.Map
        public int size() {
            return this.f118198g;
        }

        @Override // com.google.common.collect.n6.c, com.google.common.collect.n6
        @com.google.common.annotations.c
        @com.google.common.annotations.d
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    private final class e extends d<C, V> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f118202h;

        e(int rowIndex) {
            super(v3.this.f118190h[rowIndex]);
            this.f118202h = rowIndex;
        }

        @Override // com.google.common.collect.v3.d
        @fj.a
        V I(int i10) {
            return (V) v3.this.f118192j[this.f118202h][i10];
        }

        @Override // com.google.common.collect.v3.d
        n6<C, Integer> J() {
            return v3.this.f118187e;
        }

        @Override // com.google.common.collect.n6
        boolean n() {
            return true;
        }

        @Override // com.google.common.collect.v3.d, com.google.common.collect.n6.c, com.google.common.collect.n6
        @com.google.common.annotations.c
        @com.google.common.annotations.d
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    private final class f extends d<R, n6<C, V>> {
        @Override // com.google.common.collect.v3.d
        n6<R, Integer> J() {
            return v3.this.f118186d;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.v3.d
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public n6<C, V> I(int keyIndex) {
            return new e(keyIndex);
        }

        @Override // com.google.common.collect.n6
        boolean n() {
            return false;
        }

        @Override // com.google.common.collect.v3.d, com.google.common.collect.n6.c, com.google.common.collect.n6
        @com.google.common.annotations.c
        @com.google.common.annotations.d
        Object writeReplace() {
            return super.writeReplace();
        }

        private f() {
            super(v3.this.f118190h.length);
        }
    }

    v3(l6<oa.a<R, C, V>> l6Var, z6<R> z6Var, z6<C> z6Var2) {
        this.f118192j = (V[][]) ((Object[][]) Array.newInstance((Class<?>) Object.class, z6Var.size(), z6Var2.size()));
        n6<R, Integer> n6VarQ = b8.Q(z6Var);
        this.f118186d = n6VarQ;
        n6<C, Integer> n6VarQ2 = b8.Q(z6Var2);
        this.f118187e = n6VarQ2;
        this.f118190h = new int[n6VarQ.size()];
        this.f118191i = new int[n6VarQ2.size()];
        int[] iArr = new int[l6Var.size()];
        int[] iArr2 = new int[l6Var.size()];
        for (int i10 = 0; i10 < l6Var.size(); i10++) {
            oa.a<R, C, V> aVar = l6Var.get(i10);
            R rB = aVar.b();
            C cA = aVar.a();
            Integer num = this.f118186d.get(rB);
            Objects.requireNonNull(num);
            int iIntValue = num.intValue();
            Integer num2 = this.f118187e.get(cA);
            Objects.requireNonNull(num2);
            int iIntValue2 = num2.intValue();
            B(rB, cA, this.f118192j[iIntValue][iIntValue2], aVar.getValue());
            this.f118192j[iIntValue][iIntValue2] = aVar.getValue();
            int[] iArr3 = this.f118190h;
            iArr3[iIntValue] = iArr3[iIntValue] + 1;
            int[] iArr4 = this.f118191i;
            iArr4[iIntValue2] = iArr4[iIntValue2] + 1;
            iArr[i10] = iIntValue;
            iArr2[i10] = iIntValue2;
        }
        this.f118193k = iArr;
        this.f118194l = iArr2;
        this.f118188f = new f();
        this.f118189g = new c();
    }

    @Override // com.google.common.collect.t9
    oa.a<R, C, V> G(int index) {
        int i10 = this.f118193k[index];
        int i11 = this.f118194l[index];
        R r10 = t().c().get(i10);
        C c10 = E0().c().get(i11);
        V v10 = this.f118192j[i10][i11];
        Objects.requireNonNull(v10);
        return k7.g(r10, c10, v10);
    }

    @Override // com.google.common.collect.t9
    V H(int index) {
        V v10 = this.f118192j[this.f118193k[index]][this.f118194l[index]];
        Objects.requireNonNull(v10);
        return v10;
    }

    @Override // com.google.common.collect.k7, com.google.common.collect.oa
    /* JADX INFO: renamed from: k */
    public n6<C, Map<R, V>> a0() {
        return n6.g(this.f118189g);
    }

    @Override // com.google.common.collect.oa
    public int size() {
        return this.f118193k.length;
    }

    @Override // com.google.common.collect.k7, com.google.common.collect.oa
    /* JADX INFO: renamed from: v */
    public n6<R, Map<C, V>> s() {
        return n6.g(this.f118188f);
    }

    @Override // com.google.common.collect.k7, com.google.common.collect.q, com.google.common.collect.oa
    @fj.a
    public V w(@fj.a Object rowKey, @fj.a Object columnKey) {
        Integer num = this.f118186d.get(rowKey);
        Integer num2 = this.f118187e.get(columnKey);
        if (num == null || num2 == null) {
            return null;
        }
        return this.f118192j[num.intValue()][num2.intValue()];
    }

    @Override // com.google.common.collect.t9, com.google.common.collect.k7
    @com.google.common.annotations.c
    @com.google.common.annotations.d
    Object writeReplace() {
        return k7.b.a(this, this.f118193k, this.f118194l);
    }
}
