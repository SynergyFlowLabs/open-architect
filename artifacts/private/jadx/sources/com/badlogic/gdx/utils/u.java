package com.badlogic.gdx.utils;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class u<K, V> implements Iterable<b<K, V>> {
    private static final int X = -825114047;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f95756v = -1105259343;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f95757w = -1262997959;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f95758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    K[] f95759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    V[] f95760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f95761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f95762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f95763f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f95764g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f95765h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f95766i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f95767j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f95768k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private a f95769l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private a f95770m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private e f95771n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private e f95772o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private c f95773s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private c f95774t;

    public static class a<K, V> extends d<K, V, b<K, V>> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private b<K, V> f95775f;

        public a(u<K, V> uVar) {
            super(uVar);
            this.f95775f = new b<>();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f95782e) {
                return this.f95778a;
            }
            throw new t("#iterator() cannot be used nested.");
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public b<K, V> next() {
            if (!this.f95778a) {
                throw new NoSuchElementException();
            }
            if (!this.f95782e) {
                throw new t("#iterator() cannot be used nested.");
            }
            u<K, V> uVar = this.f95779b;
            K[] kArr = uVar.f95759b;
            b<K, V> bVar = this.f95775f;
            int i10 = this.f95780c;
            bVar.f95776a = kArr[i10];
            bVar.f95777b = uVar.f95760c[i10];
            this.f95781d = i10;
            c();
            return this.f95775f;
        }

        @Override // java.lang.Iterable
        public Iterator<b<K, V>> iterator() {
            return this;
        }

        @Override // com.badlogic.gdx.utils.u.d, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.badlogic.gdx.utils.u.d
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }
    }

    public static class b<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public K f95776a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public V f95777b;

        public String toString() {
            return this.f95776a + "=" + this.f95777b;
        }
    }

    public static class c<K> extends d<K, Object, K> {
        public c(u<K, ?> uVar) {
            super(uVar);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f95782e) {
                return this.f95778a;
            }
            throw new t("#iterator() cannot be used nested.");
        }

        public com.badlogic.gdx.utils.b<K> i() {
            com.badlogic.gdx.utils.b<K> bVar = new com.badlogic.gdx.utils.b<>(true, this.f95779b.f95758a);
            while (this.f95778a) {
                bVar.c(next());
            }
            return bVar;
        }

        @Override // java.lang.Iterable
        public Iterator<K> iterator() {
            return this;
        }

        @Override // java.util.Iterator
        public K next() {
            if (!this.f95778a) {
                throw new NoSuchElementException();
            }
            if (!this.f95782e) {
                throw new t("#iterator() cannot be used nested.");
            }
            K[] kArr = this.f95779b.f95759b;
            int i10 = this.f95780c;
            K k10 = kArr[i10];
            this.f95781d = i10;
            c();
            return k10;
        }

        @Override // com.badlogic.gdx.utils.u.d, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.badlogic.gdx.utils.u.d
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }
    }

    private static abstract class d<K, V, I> implements Iterable<I>, Iterator<I> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f95778a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final u<K, V> f95779b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f95780c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f95781d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f95782e = true;

        public d(u<K, V> uVar) {
            this.f95779b = uVar;
            reset();
        }

        void c() {
            int i10;
            this.f95778a = false;
            u<K, V> uVar = this.f95779b;
            K[] kArr = uVar.f95759b;
            int i11 = uVar.f95761d + uVar.f95762e;
            do {
                i10 = this.f95780c + 1;
                this.f95780c = i10;
                if (i10 >= i11) {
                    return;
                }
            } while (kArr[i10] == null);
            this.f95778a = true;
        }

        public void remove() {
            int i10 = this.f95781d;
            if (i10 < 0) {
                throw new IllegalStateException("next must be called before remove.");
            }
            u<K, V> uVar = this.f95779b;
            if (i10 >= uVar.f95761d) {
                uVar.G(i10);
                this.f95780c = this.f95781d - 1;
                c();
            } else {
                uVar.f95759b[i10] = null;
                uVar.f95760c[i10] = null;
            }
            this.f95781d = -1;
            this.f95779b.f95758a--;
        }

        public void reset() {
            this.f95781d = -1;
            this.f95780c = -1;
            c();
        }
    }

    public static class e<V> extends d<Object, V, V> {
        public e(u<?, V> uVar) {
            super(uVar);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f95782e) {
                return this.f95778a;
            }
            throw new t("#iterator() cannot be used nested.");
        }

        public com.badlogic.gdx.utils.b<V> i() {
            int i10 = 7 | 1;
            com.badlogic.gdx.utils.b<V> bVar = new com.badlogic.gdx.utils.b<>(true, this.f95779b.f95758a);
            while (this.f95778a) {
                bVar.c(next());
            }
            return bVar;
        }

        @Override // java.lang.Iterable
        public Iterator<V> iterator() {
            return this;
        }

        public void k(com.badlogic.gdx.utils.b<V> bVar) {
            while (this.f95778a) {
                bVar.c(next());
            }
        }

        @Override // java.util.Iterator
        public V next() {
            if (!this.f95778a) {
                throw new NoSuchElementException();
            }
            if (!this.f95782e) {
                throw new t("#iterator() cannot be used nested.");
            }
            V[] vArr = this.f95779b.f95760c;
            int i10 = this.f95780c;
            V v10 = vArr[i10];
            this.f95781d = i10;
            c();
            return v10;
        }

        @Override // com.badlogic.gdx.utils.u.d, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.badlogic.gdx.utils.u.d
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }
    }

    public u() {
        this(32, 0.8f);
    }

    private void B(K k10, V v10) {
        int iIdentityHashCode = System.identityHashCode(k10);
        int i10 = iIdentityHashCode & this.f95765h;
        K[] kArr = this.f95759b;
        K k11 = kArr[i10];
        if (k11 == null) {
            kArr[i10] = k10;
            this.f95760c[i10] = v10;
            int i11 = this.f95758a;
            this.f95758a = i11 + 1;
            if (i11 >= this.f95766i) {
                J(this.f95761d << 1);
                return;
            }
            return;
        }
        int iT = t(iIdentityHashCode);
        K[] kArr2 = this.f95759b;
        K k12 = kArr2[iT];
        if (k12 == null) {
            kArr2[iT] = k10;
            this.f95760c[iT] = v10;
            int i12 = this.f95758a;
            this.f95758a = i12 + 1;
            if (i12 >= this.f95766i) {
                J(this.f95761d << 1);
                return;
            }
            return;
        }
        int iU = u(iIdentityHashCode);
        K[] kArr3 = this.f95759b;
        K k13 = kArr3[iU];
        if (k13 != null) {
            w(k10, v10, i10, k11, iT, k12, iU, k13);
            return;
        }
        kArr3[iU] = k10;
        this.f95760c[iU] = v10;
        int i13 = this.f95758a;
        this.f95758a = i13 + 1;
        if (i13 >= this.f95766i) {
            J(this.f95761d << 1);
        }
    }

    private void C(K k10, V v10) {
        int i10 = this.f95762e;
        if (i10 == this.f95767j) {
            J(this.f95761d << 1);
            A(k10, v10);
            return;
        }
        int i11 = this.f95761d + i10;
        this.f95759b[i11] = k10;
        this.f95760c[i11] = v10;
        this.f95762e = i10 + 1;
        this.f95758a++;
    }

    private void J(int i10) {
        int i11 = this.f95761d + this.f95762e;
        this.f95761d = i10;
        this.f95766i = (int) (i10 * this.f95763f);
        this.f95765h = i10 - 1;
        this.f95764g = 31 - Integer.numberOfTrailingZeros(i10);
        double d10 = i10;
        this.f95767j = Math.max(3, ((int) Math.ceil(Math.log(d10))) * 2);
        this.f95768k = Math.max(Math.min(i10, 8), ((int) Math.sqrt(d10)) / 8);
        K[] kArr = this.f95759b;
        V[] vArr = this.f95760c;
        int i12 = this.f95767j;
        this.f95759b = (K[]) new Object[i10 + i12];
        this.f95760c = (V[]) new Object[i10 + i12];
        int i13 = this.f95758a;
        this.f95758a = 0;
        this.f95762e = 0;
        if (i13 > 0) {
            for (int i14 = 0; i14 < i11; i14++) {
                K k10 = kArr[i14];
                if (k10 != null) {
                    B(k10, vArr[i14]);
                }
            }
        }
    }

    private boolean i(K k10) {
        K[] kArr = this.f95759b;
        int i10 = this.f95761d;
        int i11 = this.f95762e + i10;
        while (i10 < i11) {
            if (kArr[i10] == k10) {
                return true;
            }
            i10++;
        }
        return false;
    }

    private V s(K k10, V v10) {
        K[] kArr = this.f95759b;
        int i10 = this.f95761d;
        int i11 = this.f95762e + i10;
        while (i10 < i11) {
            if (kArr[i10] == k10) {
                return this.f95760c[i10];
            }
            i10++;
        }
        return v10;
    }

    private int t(int i10) {
        int i11 = i10 * f95757w;
        return this.f95765h & (i11 ^ (i11 >>> this.f95764g));
    }

    private int u(int i10) {
        int i11 = i10 * X;
        return this.f95765h & (i11 ^ (i11 >>> this.f95764g));
    }

    private void w(K k10, V v10, int i10, K k11, int i11, K k12, int i12, K k13) {
        K[] kArr = this.f95759b;
        V[] vArr = this.f95760c;
        int i13 = this.f95765h;
        int i14 = this.f95768k;
        V v11 = v10;
        int i15 = i10;
        K k14 = k11;
        int i16 = i11;
        K k15 = k12;
        int i17 = i12;
        K k16 = k13;
        int i18 = 0;
        K k17 = k10;
        while (true) {
            int iY = com.badlogic.gdx.math.s.y(2);
            if (iY == 0) {
                V v12 = vArr[i15];
                kArr[i15] = k17;
                vArr[i15] = v11;
                k17 = k14;
                v11 = v12;
            } else if (iY != 1) {
                V v13 = vArr[i17];
                kArr[i17] = k17;
                vArr[i17] = v11;
                v11 = v13;
                k17 = k16;
            } else {
                V v14 = vArr[i16];
                kArr[i16] = k17;
                vArr[i16] = v11;
                v11 = v14;
                k17 = k15;
            }
            int iIdentityHashCode = System.identityHashCode(k17);
            int i19 = iIdentityHashCode & i13;
            K k18 = kArr[i19];
            if (k18 == null) {
                kArr[i19] = k17;
                vArr[i19] = v11;
                int i20 = this.f95758a;
                this.f95758a = i20 + 1;
                if (i20 >= this.f95766i) {
                    J(this.f95761d << 1);
                    return;
                }
                return;
            }
            int iT = t(iIdentityHashCode);
            K k19 = kArr[iT];
            if (k19 == null) {
                kArr[iT] = k17;
                vArr[iT] = v11;
                int i21 = this.f95758a;
                this.f95758a = i21 + 1;
                if (i21 >= this.f95766i) {
                    J(this.f95761d << 1);
                    return;
                }
                return;
            }
            int iU = u(iIdentityHashCode);
            k16 = kArr[iU];
            if (k16 == null) {
                kArr[iU] = k17;
                vArr[iU] = v11;
                int i22 = this.f95758a;
                this.f95758a = i22 + 1;
                if (i22 >= this.f95766i) {
                    J(this.f95761d << 1);
                    return;
                }
                return;
            }
            i18++;
            if (i18 == i14) {
                C(k17, v11);
                return;
            }
            i17 = iU;
            i15 = i19;
            k14 = k18;
            i16 = iT;
            k15 = k19;
        }
    }

    public V A(K k10, V v10) {
        if (k10 == null) {
            throw new IllegalArgumentException("key cannot be null.");
        }
        K[] kArr = this.f95759b;
        int iIdentityHashCode = System.identityHashCode(k10);
        int i10 = iIdentityHashCode & this.f95765h;
        K k11 = kArr[i10];
        if (k11 == k10) {
            V[] vArr = this.f95760c;
            V v11 = vArr[i10];
            vArr[i10] = v10;
            return v11;
        }
        int iT = t(iIdentityHashCode);
        K k12 = kArr[iT];
        if (k12 == k10) {
            V[] vArr2 = this.f95760c;
            V v12 = vArr2[iT];
            vArr2[iT] = v10;
            return v12;
        }
        int iU = u(iIdentityHashCode);
        K k13 = kArr[iU];
        if (k13 == k10) {
            V[] vArr3 = this.f95760c;
            V v13 = vArr3[iU];
            vArr3[iU] = v10;
            return v13;
        }
        int i11 = this.f95761d;
        int i12 = this.f95762e + i11;
        while (i11 < i12) {
            if (kArr[i11] == k10) {
                V[] vArr4 = this.f95760c;
                V v14 = vArr4[i11];
                vArr4[i11] = v10;
                return v14;
            }
            i11++;
        }
        if (k11 == null) {
            kArr[i10] = k10;
            this.f95760c[i10] = v10;
            int i13 = this.f95758a;
            this.f95758a = i13 + 1;
            if (i13 >= this.f95766i) {
                J(this.f95761d << 1);
            }
            return null;
        }
        if (k12 == null) {
            kArr[iT] = k10;
            this.f95760c[iT] = v10;
            int i14 = this.f95758a;
            this.f95758a = i14 + 1;
            if (i14 >= this.f95766i) {
                J(this.f95761d << 1);
            }
            return null;
        }
        if (k13 != null) {
            w(k10, v10, i10, k11, iT, k12, iU, k13);
            return null;
        }
        kArr[iU] = k10;
        this.f95760c[iU] = v10;
        int i15 = this.f95758a;
        this.f95758a = i15 + 1;
        if (i15 >= this.f95766i) {
            J(this.f95761d << 1);
        }
        return null;
    }

    public V D(K k10) {
        int iIdentityHashCode = System.identityHashCode(k10);
        int i10 = this.f95765h & iIdentityHashCode;
        K[] kArr = this.f95759b;
        if (kArr[i10] == k10) {
            kArr[i10] = null;
            V[] vArr = this.f95760c;
            V v10 = vArr[i10];
            vArr[i10] = null;
            this.f95758a--;
            return v10;
        }
        int iT = t(iIdentityHashCode);
        K[] kArr2 = this.f95759b;
        if (kArr2[iT] == k10) {
            kArr2[iT] = null;
            V[] vArr2 = this.f95760c;
            V v11 = vArr2[iT];
            vArr2[iT] = null;
            this.f95758a--;
            return v11;
        }
        int iU = u(iIdentityHashCode);
        K[] kArr3 = this.f95759b;
        if (kArr3[iU] != k10) {
            return F(k10);
        }
        kArr3[iU] = null;
        V[] vArr3 = this.f95760c;
        V v12 = vArr3[iU];
        vArr3[iU] = null;
        this.f95758a--;
        return v12;
    }

    V F(K k10) {
        K[] kArr = this.f95759b;
        int i10 = this.f95761d;
        int i11 = this.f95762e + i10;
        while (i10 < i11) {
            if (kArr[i10] == k10) {
                V v10 = this.f95760c[i10];
                G(i10);
                this.f95758a--;
                return v10;
            }
            i10++;
        }
        return null;
    }

    void G(int i10) {
        int i11 = this.f95762e - 1;
        this.f95762e = i11;
        int i12 = this.f95761d + i11;
        if (i10 >= i12) {
            this.f95760c[i10] = null;
            return;
        }
        K[] kArr = this.f95759b;
        kArr[i10] = kArr[i12];
        V[] vArr = this.f95760c;
        vArr[i10] = vArr[i12];
        vArr[i12] = null;
    }

    public void K(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("maximumCapacity must be >= 0: " + i10);
        }
        int i11 = this.f95758a;
        if (i11 > i10) {
            i10 = i11;
        }
        if (this.f95761d <= i10) {
            return;
        }
        J(com.badlogic.gdx.math.s.u(i10));
    }

    public e<V> L() {
        if (this.f95771n == null) {
            this.f95771n = new e(this);
            this.f95772o = new e(this);
        }
        e eVar = this.f95771n;
        if (eVar.f95782e) {
            this.f95772o.reset();
            e<V> eVar2 = this.f95772o;
            eVar2.f95782e = true;
            this.f95771n.f95782e = false;
            return eVar2;
        }
        eVar.reset();
        e<V> eVar3 = this.f95771n;
        eVar3.f95782e = true;
        this.f95772o.f95782e = false;
        return eVar3;
    }

    public void c(int i10) {
        if (this.f95761d <= i10) {
            clear();
        } else {
            this.f95758a = 0;
            J(i10);
        }
    }

    public void clear() {
        if (this.f95758a == 0) {
            return;
        }
        K[] kArr = this.f95759b;
        V[] vArr = this.f95760c;
        int i10 = this.f95761d + this.f95762e;
        while (true) {
            int i11 = i10 - 1;
            if (i10 <= 0) {
                this.f95758a = 0;
                this.f95762e = 0;
                return;
            } else {
                kArr[i11] = null;
                vArr[i11] = null;
                i10 = i11;
            }
        }
    }

    public boolean d(K k10) {
        int iIdentityHashCode = System.identityHashCode(k10);
        if (k10 != this.f95759b[this.f95765h & iIdentityHashCode]) {
            if (k10 != this.f95759b[t(iIdentityHashCode)]) {
                if (k10 != this.f95759b[u(iIdentityHashCode)]) {
                    return i(k10);
                }
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator<b<K, V>> iterator() {
        return m();
    }

    public boolean k(Object obj, boolean z10) {
        V[] vArr = this.f95760c;
        if (obj != null) {
            if (!z10) {
                int i10 = this.f95761d + this.f95762e;
                while (true) {
                    int i11 = i10 - 1;
                    if (i10 <= 0) {
                        break;
                    }
                    if (obj.equals(vArr[i11])) {
                        return true;
                    }
                    i10 = i11;
                }
            } else {
                int i12 = this.f95761d + this.f95762e;
                while (true) {
                    int i13 = i12 - 1;
                    if (i12 <= 0) {
                        break;
                    }
                    if (vArr[i13] == obj) {
                        return true;
                    }
                    i12 = i13;
                }
            }
        } else {
            K[] kArr = this.f95759b;
            int i14 = this.f95761d + this.f95762e;
            while (true) {
                int i15 = i14 - 1;
                if (i14 <= 0) {
                    break;
                }
                if (kArr[i15] != null && vArr[i15] == null) {
                    return true;
                }
                i14 = i15;
            }
        }
        return false;
    }

    public void l(int i10) {
        int i11 = this.f95758a + i10;
        if (i11 >= this.f95766i) {
            J(com.badlogic.gdx.math.s.u((int) (i11 / this.f95763f)));
        }
    }

    public a<K, V> m() {
        if (this.f95769l == null) {
            this.f95769l = new a(this);
            this.f95770m = new a(this);
        }
        a aVar = this.f95769l;
        if (aVar.f95782e) {
            this.f95770m.reset();
            a<K, V> aVar2 = this.f95770m;
            aVar2.f95782e = true;
            this.f95769l.f95782e = false;
            return aVar2;
        }
        aVar.reset();
        a<K, V> aVar3 = this.f95769l;
        aVar3.f95782e = true;
        this.f95770m.f95782e = false;
        return aVar3;
    }

    public K n(Object obj, boolean z10) {
        V[] vArr = this.f95760c;
        if (obj != null) {
            if (!z10) {
                int i10 = this.f95761d + this.f95762e;
                while (true) {
                    int i11 = i10 - 1;
                    if (i10 <= 0) {
                        break;
                    }
                    if (obj.equals(vArr[i11])) {
                        return this.f95759b[i11];
                    }
                    i10 = i11;
                }
            } else {
                int i12 = this.f95761d + this.f95762e;
                while (true) {
                    int i13 = i12 - 1;
                    if (i12 <= 0) {
                        break;
                    }
                    if (vArr[i13] == obj) {
                        return this.f95759b[i13];
                    }
                    i12 = i13;
                }
            }
        } else {
            K[] kArr = this.f95759b;
            int i14 = this.f95761d + this.f95762e;
            while (true) {
                int i15 = i14 - 1;
                if (i14 <= 0) {
                    break;
                }
                K k10 = kArr[i15];
                if (k10 != null && vArr[i15] == null) {
                    return k10;
                }
                i14 = i15;
            }
        }
        return null;
    }

    public V p(K k10) {
        int iIdentityHashCode = System.identityHashCode(k10);
        int iT = this.f95765h & iIdentityHashCode;
        if (k10 != this.f95759b[iT]) {
            iT = t(iIdentityHashCode);
            if (k10 != this.f95759b[iT]) {
                iT = u(iIdentityHashCode);
                if (k10 != this.f95759b[iT]) {
                    return s(k10, null);
                }
            }
        }
        return this.f95760c[iT];
    }

    public V r(K k10, V v10) {
        int iIdentityHashCode = System.identityHashCode(k10);
        int iT = this.f95765h & iIdentityHashCode;
        if (k10 != this.f95759b[iT]) {
            iT = t(iIdentityHashCode);
            if (k10 != this.f95759b[iT]) {
                iT = u(iIdentityHashCode);
                if (k10 != this.f95759b[iT]) {
                    return s(k10, v10);
                }
            }
        }
        return this.f95760c[iT];
    }

    public String toString() {
        int i10;
        if (this.f95758a == 0) {
            return okhttp3.v.f334777p;
        }
        f1 f1Var = new f1(32);
        f1Var.append(AbstractJsonLexerKt.BEGIN_LIST);
        K[] kArr = this.f95759b;
        V[] vArr = this.f95760c;
        int length = kArr.length;
        while (true) {
            i10 = length - 1;
            if (length > 0) {
                K k10 = kArr[i10];
                if (k10 != null) {
                    f1Var.n(k10);
                    f1Var.append('=');
                    f1Var.n(vArr[i10]);
                    break;
                }
                length = i10;
            } else {
                break;
            }
        }
        while (true) {
            int i11 = i10 - 1;
            if (i10 <= 0) {
                f1Var.append(AbstractJsonLexerKt.END_LIST);
                return f1Var.toString();
            }
            K k11 = kArr[i11];
            if (k11 != null) {
                f1Var.o(", ");
                f1Var.n(k11);
                f1Var.append('=');
                f1Var.n(vArr[i11]);
            }
            i10 = i11;
        }
    }

    public c<K> v() {
        if (this.f95773s == null) {
            this.f95773s = new c(this);
            this.f95774t = new c(this);
        }
        c cVar = this.f95773s;
        if (cVar.f95782e) {
            this.f95774t.reset();
            c<K> cVar2 = this.f95774t;
            cVar2.f95782e = true;
            this.f95773s.f95782e = false;
            return cVar2;
        }
        cVar.reset();
        c<K> cVar3 = this.f95773s;
        cVar3.f95782e = true;
        this.f95774t.f95782e = false;
        return cVar3;
    }

    public u(int i10) {
        this(i10, 0.8f);
    }

    public u(int i10, float f10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("initialCapacity must be >= 0: " + i10);
        }
        if (i10 <= 1073741824) {
            int iU = com.badlogic.gdx.math.s.u(i10);
            this.f95761d = iU;
            if (f10 > 0.0f) {
                this.f95763f = f10;
                this.f95766i = (int) (iU * f10);
                this.f95765h = iU - 1;
                this.f95764g = 31 - Integer.numberOfTrailingZeros(iU);
                this.f95767j = Math.max(3, ((int) Math.ceil(Math.log(this.f95761d))) * 2);
                this.f95768k = Math.max(Math.min(this.f95761d, 8), ((int) Math.sqrt(this.f95761d)) / 8);
                K[] kArr = (K[]) new Object[this.f95761d + this.f95767j];
                this.f95759b = kArr;
                this.f95760c = (V[]) new Object[kArr.length];
                return;
            }
            throw new IllegalArgumentException("loadFactor must be > 0: " + f10);
        }
        throw new IllegalArgumentException("initialCapacity is too large: " + i10);
    }

    public u(u uVar) {
        this(uVar.f95761d, uVar.f95763f);
        this.f95762e = uVar.f95762e;
        K[] kArr = uVar.f95759b;
        System.arraycopy(kArr, 0, this.f95759b, 0, kArr.length);
        V[] vArr = uVar.f95760c;
        System.arraycopy(vArr, 0, this.f95760c, 0, vArr.length);
        this.f95758a = uVar.f95758a;
    }
}
