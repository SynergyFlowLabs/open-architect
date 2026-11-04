package com.badlogic.gdx.utils;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class c<K, V> implements Iterable<k0.b<K, V>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public K[] f95209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public V[] f95210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f95211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f95212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f95213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f95214f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C0847c f95215g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C0847c f95216h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private b f95217i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private b f95218j;

    public static class a<K, V> implements Iterable<k0.b<K, V>>, Iterator<k0.b<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c<K, V> f95219a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f95221c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        k0.b<K, V> f95220b = new k0.b<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f95222d = true;

        public a(c<K, V> cVar) {
            this.f95219a = cVar;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public k0.b<K, V> next() {
            int i10 = this.f95221c;
            c<K, V> cVar = this.f95219a;
            if (i10 >= cVar.f95211c) {
                throw new NoSuchElementException(String.valueOf(this.f95221c));
            }
            if (!this.f95222d) {
                throw new t("#iterator() cannot be used nested.");
            }
            k0.b<K, V> bVar = this.f95220b;
            bVar.f95630a = cVar.f95209a[i10];
            V[] vArr = cVar.f95210b;
            this.f95221c = i10 + 1;
            bVar.f95631b = vArr[i10];
            return bVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f95222d) {
                return this.f95221c < this.f95219a.f95211c;
            }
            throw new t("#iterator() cannot be used nested.");
        }

        @Override // java.lang.Iterable
        public Iterator<k0.b<K, V>> iterator() {
            return this;
        }

        @Override // java.util.Iterator
        public void remove() {
            int i10 = this.f95221c - 1;
            this.f95221c = i10;
            this.f95219a.K(i10);
        }

        public void reset() {
            this.f95221c = 0;
        }
    }

    public static class b<K> implements Iterable<K>, Iterator<K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c<K, Object> f95223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f95224b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f95225c = true;

        public b(c<K, Object> cVar) {
            this.f95223a = cVar;
        }

        public com.badlogic.gdx.utils.b<K> c() {
            c<K, Object> cVar = this.f95223a;
            K[] kArr = cVar.f95209a;
            int i10 = this.f95224b;
            return new com.badlogic.gdx.utils.b<>(true, kArr, i10, cVar.f95211c - i10);
        }

        public com.badlogic.gdx.utils.b<K> d(com.badlogic.gdx.utils.b bVar) {
            c<K, Object> cVar = this.f95223a;
            K[] kArr = cVar.f95209a;
            int i10 = this.f95224b;
            bVar.l(kArr, i10, cVar.f95211c - i10);
            return bVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f95225c) {
                return this.f95224b < this.f95223a.f95211c;
            }
            throw new t("#iterator() cannot be used nested.");
        }

        @Override // java.lang.Iterable
        public Iterator<K> iterator() {
            return this;
        }

        @Override // java.util.Iterator
        public K next() {
            int i10 = this.f95224b;
            c<K, Object> cVar = this.f95223a;
            if (i10 >= cVar.f95211c) {
                throw new NoSuchElementException(String.valueOf(this.f95224b));
            }
            if (!this.f95225c) {
                throw new t("#iterator() cannot be used nested.");
            }
            K[] kArr = cVar.f95209a;
            this.f95224b = i10 + 1;
            return kArr[i10];
        }

        @Override // java.util.Iterator
        public void remove() {
            int i10 = this.f95224b - 1;
            this.f95224b = i10;
            this.f95223a.K(i10);
        }

        public void reset() {
            this.f95224b = 0;
        }
    }

    /* JADX INFO: renamed from: com.badlogic.gdx.utils.c$c, reason: collision with other inner class name */
    public static class C0847c<V> implements Iterable<V>, Iterator<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c<Object, V> f95226a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f95227b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f95228c = true;

        public C0847c(c<Object, V> cVar) {
            this.f95226a = cVar;
        }

        public com.badlogic.gdx.utils.b<V> c() {
            c<Object, V> cVar = this.f95226a;
            V[] vArr = cVar.f95210b;
            int i10 = this.f95227b;
            return new com.badlogic.gdx.utils.b<>(true, vArr, i10, cVar.f95211c - i10);
        }

        public com.badlogic.gdx.utils.b<V> d(com.badlogic.gdx.utils.b bVar) {
            c<Object, V> cVar = this.f95226a;
            V[] vArr = cVar.f95210b;
            int i10 = this.f95227b;
            bVar.l(vArr, i10, cVar.f95211c - i10);
            return bVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f95228c) {
                return this.f95227b < this.f95226a.f95211c;
            }
            throw new t("#iterator() cannot be used nested.");
        }

        @Override // java.lang.Iterable
        public Iterator<V> iterator() {
            return this;
        }

        @Override // java.util.Iterator
        public V next() {
            int i10 = this.f95227b;
            c<Object, V> cVar = this.f95226a;
            if (i10 >= cVar.f95211c) {
                throw new NoSuchElementException(String.valueOf(this.f95227b));
            }
            if (!this.f95228c) {
                throw new t("#iterator() cannot be used nested.");
            }
            V[] vArr = cVar.f95210b;
            this.f95227b = i10 + 1;
            return vArr[i10];
        }

        @Override // java.util.Iterator
        public void remove() {
            int i10 = this.f95227b - 1;
            this.f95227b = i10;
            this.f95226a.K(i10);
        }

        public void reset() {
            this.f95227b = 0;
        }
    }

    public c() {
        this(true, 16);
    }

    public b<K> A() {
        if (this.f95217i == null) {
            this.f95217i = new b(this);
            this.f95218j = new b(this);
        }
        b<K> bVar = this.f95217i;
        int i10 = 4 & 1;
        if (!bVar.f95225c) {
            bVar.f95224b = 0;
            bVar.f95225c = true;
            this.f95218j.f95225c = false;
            return bVar;
        }
        b<K> bVar2 = this.f95218j;
        bVar2.f95224b = 0;
        bVar2.f95225c = true;
        bVar.f95225c = false;
        return bVar2;
    }

    public K B() {
        return this.f95209a[this.f95211c - 1];
    }

    public V C() {
        return this.f95210b[this.f95211c - 1];
    }

    public int D(K k10, V v10) {
        int iU = u(k10);
        if (iU == -1) {
            int i10 = this.f95211c;
            if (i10 == this.f95209a.length) {
                N(Math.max(8, (int) (i10 * 1.75f)));
            }
            iU = this.f95211c;
            this.f95211c = iU + 1;
        }
        this.f95209a[iU] = k10;
        this.f95210b[iU] = v10;
        return iU;
    }

    public int F(K k10, V v10, int i10) {
        int iU = u(k10);
        if (iU != -1) {
            K(iU);
        } else {
            int i11 = this.f95211c;
            if (i11 == this.f95209a.length) {
                N(Math.max(8, (int) (i11 * 1.75f)));
            }
        }
        K[] kArr = this.f95209a;
        int i12 = i10 + 1;
        System.arraycopy(kArr, i10, kArr, i12, this.f95211c - i10);
        V[] vArr = this.f95210b;
        System.arraycopy(vArr, i10, vArr, i12, this.f95211c - i10);
        this.f95209a[i10] = k10;
        this.f95210b[i10] = v10;
        this.f95211c++;
        return i10;
    }

    public void G(c cVar) {
        J(cVar, 0, cVar.f95211c);
    }

    public void J(c cVar, int i10, int i11) {
        if (i10 + i11 <= cVar.f95211c) {
            int i12 = (this.f95211c + i11) - i10;
            if (i12 >= this.f95209a.length) {
                N(Math.max(8, (int) (i12 * 1.75f)));
            }
            System.arraycopy(cVar.f95209a, i10, this.f95209a, this.f95211c, i11);
            System.arraycopy(cVar.f95210b, i10, this.f95210b, this.f95211c, i11);
            this.f95211c += i11;
            return;
        }
        throw new IllegalArgumentException("offset + length must be <= size: " + i10 + " + " + i11 + " <= " + cVar.f95211c);
    }

    public void K(int i10) {
        int i11 = this.f95211c;
        if (i10 >= i11) {
            throw new IndexOutOfBoundsException(String.valueOf(i10));
        }
        K[] kArr = this.f95209a;
        int i12 = i11 - 1;
        this.f95211c = i12;
        if (this.f95212d) {
            int i13 = i10 + 1;
            System.arraycopy(kArr, i13, kArr, i10, i12 - i10);
            V[] vArr = this.f95210b;
            System.arraycopy(vArr, i13, vArr, i10, this.f95211c - i10);
        } else {
            kArr[i10] = kArr[i12];
            V[] vArr2 = this.f95210b;
            vArr2[i10] = vArr2[i12];
        }
        int i14 = this.f95211c;
        kArr[i14] = null;
        this.f95210b[i14] = null;
    }

    public V L(K k10) {
        K[] kArr = this.f95209a;
        int i10 = 0;
        if (k10 == null) {
            int i11 = this.f95211c;
            while (i10 < i11) {
                if (kArr[i10] == k10) {
                    V v10 = this.f95210b[i10];
                    K(i10);
                    return v10;
                }
                i10++;
            }
        } else {
            int i12 = this.f95211c;
            while (i10 < i12) {
                if (k10.equals(kArr[i10])) {
                    V v11 = this.f95210b[i10];
                    K(i10);
                    return v11;
                }
                i10++;
            }
        }
        return null;
    }

    public boolean M(V v10, boolean z10) {
        V[] vArr = this.f95210b;
        if (z10 || v10 == null) {
            int i10 = this.f95211c;
            for (int i11 = 0; i11 < i10; i11++) {
                if (vArr[i11] == v10) {
                    K(i11);
                    return true;
                }
            }
        } else {
            int i12 = this.f95211c;
            for (int i13 = 0; i13 < i12; i13++) {
                if (v10.equals(vArr[i13])) {
                    K(i13);
                    return true;
                }
            }
        }
        return false;
    }

    protected void N(int i10) {
        K[] kArr = (K[]) ((Object[]) com.badlogic.gdx.utils.reflect.b.c(this.f95209a.getClass().getComponentType(), i10));
        System.arraycopy(this.f95209a, 0, kArr, 0, Math.min(this.f95211c, kArr.length));
        this.f95209a = kArr;
        V[] vArr = (V[]) ((Object[]) com.badlogic.gdx.utils.reflect.b.c(this.f95210b.getClass().getComponentType(), i10));
        System.arraycopy(this.f95210b, 0, vArr, 0, Math.min(this.f95211c, vArr.length));
        this.f95210b = vArr;
    }

    public void O() {
        int i10 = this.f95211c;
        int i11 = i10 - 1;
        int i12 = i10 / 2;
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i11 - i13;
            K[] kArr = this.f95209a;
            K k10 = kArr[i13];
            kArr[i13] = kArr[i14];
            kArr[i14] = k10;
            V[] vArr = this.f95210b;
            V v10 = vArr[i13];
            vArr[i13] = vArr[i14];
            vArr[i14] = v10;
        }
    }

    public void P(int i10, K k10) {
        if (i10 >= this.f95211c) {
            throw new IndexOutOfBoundsException(String.valueOf(i10));
        }
        this.f95209a[i10] = k10;
    }

    public void Q(int i10, V v10) {
        if (i10 >= this.f95211c) {
            throw new IndexOutOfBoundsException(String.valueOf(i10));
        }
        this.f95210b[i10] = v10;
    }

    public void R() {
        int length = this.f95209a.length;
        int i10 = this.f95211c;
        if (length == i10) {
            return;
        }
        N(i10);
    }

    public void S() {
        for (int i10 = this.f95211c - 1; i10 >= 0; i10--) {
            int iY = com.badlogic.gdx.math.s.y(i10);
            K[] kArr = this.f95209a;
            K k10 = kArr[i10];
            kArr[i10] = kArr[iY];
            kArr[iY] = k10;
            V[] vArr = this.f95210b;
            V v10 = vArr[i10];
            vArr[i10] = vArr[iY];
            vArr[iY] = v10;
        }
    }

    public void T(int i10) {
        if (this.f95211c <= i10) {
            return;
        }
        for (int i11 = i10; i11 < this.f95211c; i11++) {
            this.f95209a[i11] = null;
            this.f95210b[i11] = null;
        }
        this.f95211c = i10;
    }

    public C0847c<V> U() {
        if (this.f95215g == null) {
            this.f95215g = new C0847c(this);
            this.f95216h = new C0847c(this);
        }
        C0847c<V> c0847c = this.f95215g;
        if (!c0847c.f95228c) {
            c0847c.f95227b = 0;
            c0847c.f95228c = true;
            this.f95216h.f95228c = false;
            return c0847c;
        }
        C0847c<V> c0847c2 = this.f95216h;
        c0847c2.f95227b = 0;
        c0847c2.f95228c = true;
        c0847c.f95228c = false;
        return c0847c2;
    }

    public void c(int i10) {
        if (this.f95209a.length <= i10) {
            clear();
        } else {
            this.f95211c = 0;
            N(i10);
        }
    }

    public void clear() {
        K[] kArr = this.f95209a;
        V[] vArr = this.f95210b;
        int i10 = this.f95211c;
        for (int i11 = 0; i11 < i10; i11++) {
            kArr[i11] = null;
            vArr[i11] = null;
        }
        this.f95211c = 0;
    }

    public boolean d(K k10) {
        K[] kArr = this.f95209a;
        boolean z10 = !true;
        int i10 = this.f95211c - 1;
        if (k10 == null) {
            while (i10 >= 0) {
                int i11 = i10 - 1;
                if (kArr[i10] == k10) {
                    return true;
                }
                i10 = i11;
            }
        } else {
            while (i10 >= 0) {
                int i12 = i10 - 1;
                if (k10.equals(kArr[i10])) {
                    return true;
                }
                i10 = i12;
            }
        }
        return false;
    }

    public boolean i(V v10, boolean z10) {
        V[] vArr = this.f95210b;
        int i10 = this.f95211c - 1;
        if (!z10 && v10 != null) {
            while (i10 >= 0) {
                int i11 = i10 - 1;
                if (v10.equals(vArr[i10])) {
                    return true;
                }
                i10 = i11;
            }
            return false;
        }
        while (i10 >= 0) {
            int i12 = i10 - 1;
            if (vArr[i10] == v10) {
                return true;
            }
            i10 = i12;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<k0.b<K, V>> iterator() {
        return l();
    }

    public void k(int i10) {
        int i11 = this.f95211c + i10;
        if (i11 >= this.f95209a.length) {
            N(Math.max(8, i11));
        }
    }

    public a<K, V> l() {
        if (this.f95213e == null) {
            this.f95213e = new a(this);
            this.f95214f = new a(this);
        }
        a<K, V> aVar = this.f95213e;
        if (!aVar.f95222d) {
            aVar.f95221c = 0;
            aVar.f95222d = true;
            this.f95214f.f95222d = false;
            return aVar;
        }
        a<K, V> aVar2 = this.f95214f;
        aVar2.f95221c = 0;
        aVar2.f95222d = true;
        aVar.f95222d = false;
        return aVar2;
    }

    public K m() {
        if (this.f95211c != 0) {
            return this.f95209a[0];
        }
        throw new IllegalStateException("Map is empty.");
    }

    public V n() {
        if (this.f95211c != 0) {
            return this.f95210b[0];
        }
        throw new IllegalStateException("Map is empty.");
    }

    public V p(K k10) {
        K[] kArr = this.f95209a;
        int i10 = this.f95211c - 1;
        if (k10 == null) {
            while (i10 >= 0) {
                if (kArr[i10] == k10) {
                    return this.f95210b[i10];
                }
                i10--;
            }
            return null;
        }
        while (i10 >= 0) {
            if (k10.equals(kArr[i10])) {
                return this.f95210b[i10];
            }
            i10--;
        }
        return null;
    }

    public K r(V v10, boolean z10) {
        V[] vArr = this.f95210b;
        int i10 = this.f95211c - 1;
        if (z10 || v10 == null) {
            while (i10 >= 0) {
                if (vArr[i10] == v10) {
                    return this.f95209a[i10];
                }
                i10--;
            }
        } else {
            while (i10 >= 0) {
                if (v10.equals(vArr[i10])) {
                    return this.f95209a[i10];
                }
                i10--;
            }
        }
        return null;
    }

    public K s(int i10) {
        if (i10 < this.f95211c) {
            return this.f95209a[i10];
        }
        throw new IndexOutOfBoundsException(String.valueOf(i10));
    }

    public V t(int i10) {
        if (i10 < this.f95211c) {
            return this.f95210b[i10];
        }
        throw new IndexOutOfBoundsException(String.valueOf(i10));
    }

    public String toString() {
        if (this.f95211c == 0) {
            return "{}";
        }
        K[] kArr = this.f95209a;
        V[] vArr = this.f95210b;
        f1 f1Var = new f1(32);
        f1Var.append(AbstractJsonLexerKt.BEGIN_OBJ);
        f1Var.n(kArr[0]);
        f1Var.append('=');
        f1Var.n(vArr[0]);
        for (int i10 = 1; i10 < this.f95211c; i10++) {
            f1Var.o(", ");
            f1Var.n(kArr[i10]);
            f1Var.append('=');
            f1Var.n(vArr[i10]);
        }
        f1Var.append(AbstractJsonLexerKt.END_OBJ);
        return f1Var.toString();
    }

    public int u(K k10) {
        K[] kArr = this.f95209a;
        int i10 = 0;
        if (k10 == null) {
            int i11 = this.f95211c;
            while (i10 < i11) {
                if (kArr[i10] == k10) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int i12 = this.f95211c;
        while (i10 < i12) {
            if (k10.equals(kArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public int v(V v10, boolean z10) {
        V[] vArr = this.f95210b;
        int i10 = 0;
        if (z10 || v10 == null) {
            int i11 = this.f95211c;
            while (i10 < i11) {
                if (vArr[i10] == v10) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int i12 = this.f95211c;
        while (i10 < i12) {
            if (v10.equals(vArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public void w(int i10, K k10, V v10) {
        int i11 = this.f95211c;
        if (i10 > i11) {
            throw new IndexOutOfBoundsException(String.valueOf(i10));
        }
        if (i11 == this.f95209a.length) {
            N(Math.max(8, (int) (i11 * 1.75f)));
        }
        if (this.f95212d) {
            K[] kArr = this.f95209a;
            int i12 = i10 + 1;
            System.arraycopy(kArr, i10, kArr, i12, this.f95211c - i10);
            V[] vArr = this.f95210b;
            System.arraycopy(vArr, i10, vArr, i12, this.f95211c - i10);
        } else {
            K[] kArr2 = this.f95209a;
            int i13 = this.f95211c;
            kArr2[i13] = kArr2[i10];
            V[] vArr2 = this.f95210b;
            vArr2[i13] = vArr2[i10];
        }
        this.f95211c++;
        this.f95209a[i10] = k10;
        this.f95210b[i10] = v10;
    }

    public c(int i10) {
        this(true, i10);
    }

    public c(boolean z10, int i10) {
        this.f95212d = z10;
        this.f95209a = (K[]) new Object[i10];
        this.f95210b = (V[]) new Object[i10];
    }

    public c(boolean z10, int i10, Class cls, Class cls2) {
        this.f95212d = z10;
        this.f95209a = (K[]) ((Object[]) com.badlogic.gdx.utils.reflect.b.c(cls, i10));
        this.f95210b = (V[]) ((Object[]) com.badlogic.gdx.utils.reflect.b.c(cls2, i10));
    }

    public c(Class cls, Class cls2) {
        this(false, 16, cls, cls2);
    }

    public c(c cVar) {
        this(cVar.f95212d, cVar.f95211c, cVar.f95209a.getClass().getComponentType(), cVar.f95210b.getClass().getComponentType());
        int i10 = cVar.f95211c;
        this.f95211c = i10;
        System.arraycopy(cVar.f95209a, 0, this.f95209a, 0, i10);
        System.arraycopy(cVar.f95210b, 0, this.f95210b, 0, this.f95211c);
    }
}
