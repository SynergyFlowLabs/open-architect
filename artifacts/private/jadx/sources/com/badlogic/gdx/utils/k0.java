package com.badlogic.gdx.utils;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class k0<K, V> implements Iterable<b<K, V>> {
    private static final int X = -825114047;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f95610v = -1105259343;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f95611w = -1262997959;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f95612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    K[] f95613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    V[] f95614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f95615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f95616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f95617f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f95618g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f95619h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f95620i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f95621j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f95622k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private a f95623l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private a f95624m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private e f95625n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private e f95626o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private c f95627s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private c f95628t;

    public static class a<K, V> extends d<K, V, b<K, V>> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        b<K, V> f95629f;

        public a(k0<K, V> k0Var) {
            super(k0Var);
            this.f95629f = new b<>();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f95636e) {
                return this.f95632a;
            }
            throw new t("#iterator() cannot be used nested.");
        }

        @Override // java.lang.Iterable
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public a<K, V> iterator() {
            return this;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public b<K, V> next() {
            if (!this.f95632a) {
                throw new NoSuchElementException();
            }
            if (!this.f95636e) {
                throw new t("#iterator() cannot be used nested.");
            }
            k0<K, V> k0Var = this.f95633b;
            K[] kArr = k0Var.f95613b;
            b<K, V> bVar = this.f95629f;
            int i10 = this.f95634c;
            bVar.f95630a = kArr[i10];
            bVar.f95631b = k0Var.f95614c[i10];
            this.f95635d = i10;
            c();
            return this.f95629f;
        }

        @Override // com.badlogic.gdx.utils.k0.d, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.badlogic.gdx.utils.k0.d
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }
    }

    public static class b<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public K f95630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public V f95631b;

        public String toString() {
            return this.f95630a + "=" + this.f95631b;
        }
    }

    public static class c<K> extends d<K, Object, K> {
        public c(k0<K, ?> k0Var) {
            super(k0Var);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f95636e) {
                return this.f95632a;
            }
            throw new t("#iterator() cannot be used nested.");
        }

        @Override // java.lang.Iterable
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public c<K> iterator() {
            return this;
        }

        public com.badlogic.gdx.utils.b<K> k() {
            return l(new com.badlogic.gdx.utils.b<>(true, this.f95633b.f95612a));
        }

        public com.badlogic.gdx.utils.b<K> l(com.badlogic.gdx.utils.b<K> bVar) {
            while (this.f95632a) {
                bVar.c(next());
            }
            return bVar;
        }

        @Override // java.util.Iterator
        public K next() {
            if (!this.f95632a) {
                throw new NoSuchElementException();
            }
            if (!this.f95636e) {
                throw new t("#iterator() cannot be used nested.");
            }
            K[] kArr = this.f95633b.f95613b;
            int i10 = this.f95634c;
            K k10 = kArr[i10];
            this.f95635d = i10;
            c();
            return k10;
        }

        @Override // com.badlogic.gdx.utils.k0.d, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.badlogic.gdx.utils.k0.d
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static abstract class d<K, V, I> implements Iterable<I>, Iterator<I> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f95632a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final k0<K, V> f95633b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f95634c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f95635d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f95636e = true;

        public d(k0<K, V> k0Var) {
            this.f95633b = k0Var;
            reset();
        }

        void c() {
            int i10;
            this.f95632a = false;
            k0<K, V> k0Var = this.f95633b;
            K[] kArr = k0Var.f95613b;
            int i11 = k0Var.f95615d + k0Var.f95616e;
            do {
                i10 = this.f95634c + 1;
                this.f95634c = i10;
                if (i10 < i11) {
                }
            } while (kArr[i10] == null);
            this.f95632a = true;
        }

        public void remove() {
            int i10 = this.f95635d;
            if (i10 < 0) {
                throw new IllegalStateException("next must be called before remove.");
            }
            k0<K, V> k0Var = this.f95633b;
            if (i10 >= k0Var.f95615d) {
                k0Var.M(i10);
                this.f95634c = this.f95635d - 1;
                c();
            } else {
                k0Var.f95613b[i10] = null;
                k0Var.f95614c[i10] = null;
            }
            this.f95635d = -1;
            this.f95633b.f95612a--;
        }

        public void reset() {
            this.f95635d = -1;
            this.f95634c = -1;
            c();
        }
    }

    public static class e<V> extends d<Object, V, V> {
        public e(k0<?, V> k0Var) {
            super(k0Var);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f95636e) {
                return this.f95632a;
            }
            throw new t("#iterator() cannot be used nested.");
        }

        @Override // java.lang.Iterable
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public e<V> iterator() {
            return this;
        }

        public com.badlogic.gdx.utils.b<V> k() {
            return l(new com.badlogic.gdx.utils.b<>(true, this.f95633b.f95612a));
        }

        public com.badlogic.gdx.utils.b<V> l(com.badlogic.gdx.utils.b<V> bVar) {
            while (this.f95632a) {
                bVar.c(next());
            }
            return bVar;
        }

        @Override // java.util.Iterator
        public V next() {
            if (!this.f95632a) {
                throw new NoSuchElementException();
            }
            if (!this.f95636e) {
                throw new t("#iterator() cannot be used nested.");
            }
            V[] vArr = this.f95633b.f95614c;
            int i10 = this.f95634c;
            V v10 = vArr[i10];
            this.f95635d = i10;
            c();
            return v10;
        }

        @Override // com.badlogic.gdx.utils.k0.d, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.badlogic.gdx.utils.k0.d
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }
    }

    public k0() {
        this(32, 0.8f);
    }

    private void B(K k10, V v10, int i10, K k11, int i11, K k12, int i12, K k13) {
        K[] kArr = this.f95613b;
        V[] vArr = this.f95614c;
        int i13 = this.f95619h;
        int i14 = this.f95622k;
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
            int iHashCode = k17.hashCode();
            int i19 = iHashCode & i13;
            K k18 = kArr[i19];
            if (k18 == null) {
                kArr[i19] = k17;
                vArr[i19] = v11;
                int i20 = this.f95612a;
                this.f95612a = i20 + 1;
                if (i20 >= this.f95620i) {
                    N(this.f95615d << 1);
                    return;
                }
                return;
            }
            int iU = u(iHashCode);
            K k19 = kArr[iU];
            if (k19 == null) {
                kArr[iU] = k17;
                vArr[iU] = v11;
                int i21 = this.f95612a;
                this.f95612a = i21 + 1;
                if (i21 >= this.f95620i) {
                    N(this.f95615d << 1);
                    return;
                }
                return;
            }
            int iV = v(iHashCode);
            k16 = kArr[iV];
            if (k16 == null) {
                kArr[iV] = k17;
                vArr[iV] = v11;
                int i22 = this.f95612a;
                this.f95612a = i22 + 1;
                if (i22 >= this.f95620i) {
                    N(this.f95615d << 1);
                    return;
                }
                return;
            }
            i18++;
            if (i18 == i14) {
                G(k17, v11);
                return;
            }
            i17 = iV;
            i15 = i19;
            k14 = k18;
            i16 = iU;
            k15 = k19;
        }
    }

    private void F(K k10, V v10) {
        int iHashCode = k10.hashCode();
        int i10 = iHashCode & this.f95619h;
        K[] kArr = this.f95613b;
        K k11 = kArr[i10];
        if (k11 == null) {
            kArr[i10] = k10;
            this.f95614c[i10] = v10;
            int i11 = this.f95612a;
            this.f95612a = i11 + 1;
            if (i11 >= this.f95620i) {
                N(this.f95615d << 1);
                return;
            }
            return;
        }
        int iU = u(iHashCode);
        K[] kArr2 = this.f95613b;
        K k12 = kArr2[iU];
        if (k12 == null) {
            kArr2[iU] = k10;
            this.f95614c[iU] = v10;
            int i12 = this.f95612a;
            this.f95612a = i12 + 1;
            if (i12 >= this.f95620i) {
                N(this.f95615d << 1);
                return;
            }
            return;
        }
        int iV = v(iHashCode);
        K[] kArr3 = this.f95613b;
        K k13 = kArr3[iV];
        if (k13 != null) {
            B(k10, v10, i10, k11, iU, k12, iV, k13);
            return;
        }
        kArr3[iV] = k10;
        this.f95614c[iV] = v10;
        int i13 = this.f95612a;
        this.f95612a = i13 + 1;
        if (i13 >= this.f95620i) {
            N(this.f95615d << 1);
        }
    }

    private void G(K k10, V v10) {
        int i10 = this.f95616e;
        if (i10 == this.f95621j) {
            N(this.f95615d << 1);
            J(k10, v10);
            return;
        }
        int i11 = this.f95615d + i10;
        this.f95613b[i11] = k10;
        this.f95614c[i11] = v10;
        this.f95616e = i10 + 1;
        this.f95612a++;
    }

    private V J(K k10, V v10) {
        Object[] objArr = this.f95613b;
        int iHashCode = k10.hashCode();
        int i10 = iHashCode & this.f95619h;
        K k11 = objArr[i10];
        if (k10.equals(k11)) {
            V[] vArr = this.f95614c;
            V v11 = vArr[i10];
            vArr[i10] = v10;
            return v11;
        }
        int iU = u(iHashCode);
        K k12 = objArr[iU];
        if (k10.equals(k12)) {
            V[] vArr2 = this.f95614c;
            V v12 = vArr2[iU];
            vArr2[iU] = v10;
            return v12;
        }
        int iV = v(iHashCode);
        K k13 = objArr[iV];
        if (k10.equals(k13)) {
            V[] vArr3 = this.f95614c;
            V v13 = vArr3[iV];
            vArr3[iV] = v10;
            return v13;
        }
        int i11 = this.f95615d;
        int i12 = this.f95616e + i11;
        while (i11 < i12) {
            if (k10.equals(objArr[i11])) {
                V[] vArr4 = this.f95614c;
                V v14 = vArr4[i11];
                vArr4[i11] = v10;
                return v14;
            }
            i11++;
        }
        if (k11 == null) {
            objArr[i10] = k10;
            this.f95614c[i10] = v10;
            int i13 = this.f95612a;
            this.f95612a = i13 + 1;
            if (i13 >= this.f95620i) {
                N(this.f95615d << 1);
            }
            return null;
        }
        if (k12 == null) {
            objArr[iU] = k10;
            this.f95614c[iU] = v10;
            int i14 = this.f95612a;
            this.f95612a = i14 + 1;
            if (i14 >= this.f95620i) {
                N(this.f95615d << 1);
            }
            return null;
        }
        if (k13 != null) {
            B(k10, v10, i10, k11, iU, k12, iV, k13);
            return null;
        }
        objArr[iV] = k10;
        this.f95614c[iV] = v10;
        int i15 = this.f95612a;
        this.f95612a = i15 + 1;
        if (i15 >= this.f95620i) {
            N(this.f95615d << 1);
        }
        return null;
    }

    private void N(int i10) {
        int i11 = this.f95615d + this.f95616e;
        this.f95615d = i10;
        this.f95620i = (int) (i10 * this.f95617f);
        this.f95619h = i10 - 1;
        this.f95618g = 31 - Integer.numberOfTrailingZeros(i10);
        double d10 = i10;
        this.f95621j = Math.max(3, ((int) Math.ceil(Math.log(d10))) * 2);
        this.f95622k = Math.max(Math.min(i10, 8), ((int) Math.sqrt(d10)) / 8);
        K[] kArr = this.f95613b;
        V[] vArr = this.f95614c;
        int i12 = this.f95621j;
        this.f95613b = (K[]) new Object[i10 + i12];
        this.f95614c = (V[]) new Object[i10 + i12];
        int i13 = this.f95612a;
        this.f95612a = 0;
        this.f95616e = 0;
        if (i13 > 0) {
            for (int i14 = 0; i14 < i11; i14++) {
                K k10 = kArr[i14];
                if (k10 != null) {
                    F(k10, vArr[i14]);
                }
            }
        }
    }

    private String Q(String str, boolean z10) {
        int i10;
        if (this.f95612a == 0) {
            return z10 ? "{}" : "";
        }
        f1 f1Var = new f1(32);
        if (z10) {
            f1Var.append(AbstractJsonLexerKt.BEGIN_OBJ);
        }
        K[] kArr = this.f95613b;
        V[] vArr = this.f95614c;
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
                break;
            }
            K k11 = kArr[i11];
            if (k11 != null) {
                f1Var.o(str);
                f1Var.n(k11);
                f1Var.append('=');
                f1Var.n(vArr[i11]);
            }
            i10 = i11;
        }
        if (z10) {
            f1Var.append(AbstractJsonLexerKt.END_OBJ);
        }
        return f1Var.toString();
    }

    private boolean i(K k10) {
        K[] kArr = this.f95613b;
        int i10 = this.f95615d;
        int i11 = this.f95616e + i10;
        while (i10 < i11) {
            if (k10.equals(kArr[i10])) {
                return true;
            }
            i10++;
        }
        return false;
    }

    private V s(K k10) {
        K[] kArr = this.f95613b;
        int i10 = this.f95615d;
        int i11 = this.f95616e + i10;
        while (i10 < i11) {
            if (k10.equals(kArr[i10])) {
                return this.f95614c[i10];
            }
            i10++;
        }
        return null;
    }

    private V t(K k10, V v10) {
        K[] kArr = this.f95613b;
        int i10 = this.f95615d;
        int i11 = this.f95616e + i10;
        while (i10 < i11) {
            if (k10.equals(kArr[i10])) {
                return this.f95614c[i10];
            }
            i10++;
        }
        return v10;
    }

    private int u(int i10) {
        int i11 = i10 * f95611w;
        return this.f95619h & (i11 ^ (i11 >>> this.f95618g));
    }

    private int v(int i10) {
        int i11 = i10 * X;
        return this.f95619h & (i11 ^ (i11 >>> this.f95618g));
    }

    public c<K> A() {
        if (this.f95627s == null) {
            this.f95627s = new c(this);
            this.f95628t = new c(this);
        }
        c cVar = this.f95627s;
        if (cVar.f95636e) {
            this.f95628t.reset();
            c<K> cVar2 = this.f95628t;
            cVar2.f95636e = true;
            this.f95627s.f95636e = false;
            return cVar2;
        }
        cVar.reset();
        c<K> cVar3 = this.f95627s;
        cVar3.f95636e = true;
        this.f95628t.f95636e = false;
        return cVar3;
    }

    public V C(K k10, V v10) {
        if (k10 != null) {
            return J(k10, v10);
        }
        throw new IllegalArgumentException("key cannot be null.");
    }

    public void D(k0<K, V> k0Var) {
        l(k0Var.f95612a);
        a<K, V> it = k0Var.iterator();
        while (it.hasNext()) {
            b<K, V> next = it.next();
            C(next.f95630a, next.f95631b);
        }
    }

    public V K(K k10) {
        int iHashCode = k10.hashCode();
        int i10 = this.f95619h & iHashCode;
        if (k10.equals(this.f95613b[i10])) {
            this.f95613b[i10] = null;
            V[] vArr = this.f95614c;
            V v10 = vArr[i10];
            vArr[i10] = null;
            this.f95612a--;
            return v10;
        }
        int iU = u(iHashCode);
        if (k10.equals(this.f95613b[iU])) {
            this.f95613b[iU] = null;
            V[] vArr2 = this.f95614c;
            V v11 = vArr2[iU];
            vArr2[iU] = null;
            this.f95612a--;
            return v11;
        }
        int iV = v(iHashCode);
        if (!k10.equals(this.f95613b[iV])) {
            return L(k10);
        }
        this.f95613b[iV] = null;
        V[] vArr3 = this.f95614c;
        V v12 = vArr3[iV];
        vArr3[iV] = null;
        this.f95612a--;
        return v12;
    }

    V L(K k10) {
        K[] kArr = this.f95613b;
        int i10 = this.f95615d;
        int i11 = this.f95616e + i10;
        while (i10 < i11) {
            if (k10.equals(kArr[i10])) {
                V v10 = this.f95614c[i10];
                M(i10);
                this.f95612a--;
                return v10;
            }
            i10++;
        }
        return null;
    }

    void M(int i10) {
        int i11 = this.f95616e - 1;
        this.f95616e = i11;
        int i12 = this.f95615d + i11;
        if (i10 >= i12) {
            this.f95614c[i10] = null;
            return;
        }
        K[] kArr = this.f95613b;
        kArr[i10] = kArr[i12];
        V[] vArr = this.f95614c;
        vArr[i10] = vArr[i12];
        vArr[i12] = null;
    }

    public void O(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("maximumCapacity must be >= 0: " + i10);
        }
        int i11 = this.f95612a;
        if (i11 > i10) {
            i10 = i11;
        }
        if (this.f95615d <= i10) {
            return;
        }
        N(com.badlogic.gdx.math.s.u(i10));
    }

    public String P(String str) {
        return Q(str, false);
    }

    public e<V> R() {
        if (this.f95625n == null) {
            this.f95625n = new e(this);
            this.f95626o = new e(this);
        }
        e eVar = this.f95625n;
        if (eVar.f95636e) {
            this.f95626o.reset();
            e<V> eVar2 = this.f95626o;
            eVar2.f95636e = true;
            this.f95625n.f95636e = false;
            return eVar2;
        }
        eVar.reset();
        e<V> eVar3 = this.f95625n;
        eVar3.f95636e = true;
        this.f95626o.f95636e = false;
        return eVar3;
    }

    public void c(int i10) {
        if (this.f95615d <= i10) {
            clear();
        } else {
            this.f95612a = 0;
            N(i10);
        }
    }

    public void clear() {
        if (this.f95612a == 0) {
            return;
        }
        K[] kArr = this.f95613b;
        V[] vArr = this.f95614c;
        int i10 = this.f95615d + this.f95616e;
        while (true) {
            int i11 = i10 - 1;
            if (i10 <= 0) {
                this.f95612a = 0;
                this.f95616e = 0;
                return;
            } else {
                kArr[i11] = null;
                vArr[i11] = null;
                i10 = i11;
            }
        }
    }

    public boolean d(K k10) {
        int iHashCode = k10.hashCode();
        if (k10.equals(this.f95613b[this.f95619h & iHashCode])) {
            return true;
        }
        if (k10.equals(this.f95613b[u(iHashCode)])) {
            return true;
        }
        if (k10.equals(this.f95613b[v(iHashCode)])) {
            return true;
        }
        return i(k10);
    }

    public boolean k(Object obj, boolean z10) {
        V[] vArr = this.f95614c;
        if (obj != null) {
            if (!z10) {
                int i10 = this.f95615d + this.f95616e;
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
                int i12 = this.f95615d + this.f95616e;
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
            K[] kArr = this.f95613b;
            int i14 = this.f95615d + this.f95616e;
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
        int i11 = this.f95612a + i10;
        if (i11 >= this.f95620i) {
            N(com.badlogic.gdx.math.s.u((int) (i11 / this.f95617f)));
        }
    }

    public a<K, V> m() {
        if (this.f95623l == null) {
            this.f95623l = new a(this);
            this.f95624m = new a(this);
        }
        a aVar = this.f95623l;
        if (aVar.f95636e) {
            this.f95624m.reset();
            a<K, V> aVar2 = this.f95624m;
            aVar2.f95636e = true;
            this.f95623l.f95636e = false;
            return aVar2;
        }
        aVar.reset();
        a<K, V> aVar3 = this.f95623l;
        aVar3.f95636e = true;
        this.f95624m.f95636e = false;
        return aVar3;
    }

    public K n(Object obj, boolean z10) {
        V[] vArr = this.f95614c;
        if (obj == null) {
            K[] kArr = this.f95613b;
            int i10 = this.f95615d + this.f95616e;
            while (true) {
                int i11 = i10 - 1;
                if (i10 <= 0) {
                    return null;
                }
                K k10 = kArr[i11];
                if (k10 != null && vArr[i11] == null) {
                    return k10;
                }
                i10 = i11;
            }
        } else if (z10) {
            int i12 = this.f95615d + this.f95616e;
            while (true) {
                int i13 = i12 - 1;
                if (i12 <= 0) {
                    return null;
                }
                if (vArr[i13] == obj) {
                    return this.f95613b[i13];
                }
                i12 = i13;
            }
        } else {
            int i14 = this.f95615d + this.f95616e;
            while (true) {
                int i15 = i14 - 1;
                if (i14 <= 0) {
                    return null;
                }
                if (obj.equals(vArr[i15])) {
                    return this.f95613b[i15];
                }
                i14 = i15;
            }
        }
    }

    public V p(K k10) {
        int iHashCode = k10.hashCode();
        int iU = this.f95619h & iHashCode;
        if (!k10.equals(this.f95613b[iU])) {
            iU = u(iHashCode);
            if (!k10.equals(this.f95613b[iU])) {
                iU = v(iHashCode);
                if (!k10.equals(this.f95613b[iU])) {
                    return s(k10);
                }
            }
        }
        return this.f95614c[iU];
    }

    public V r(K k10, V v10) {
        int iHashCode = k10.hashCode();
        int iU = this.f95619h & iHashCode;
        if (!k10.equals(this.f95613b[iU])) {
            iU = u(iHashCode);
            if (!k10.equals(this.f95613b[iU])) {
                iU = v(iHashCode);
                if (!k10.equals(this.f95613b[iU])) {
                    return t(k10, v10);
                }
            }
        }
        return this.f95614c[iU];
    }

    public String toString() {
        return Q(", ", true);
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public a<K, V> iterator() {
        return m();
    }

    public k0(int i10) {
        this(i10, 0.8f);
    }

    public k0(int i10, float f10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("initialCapacity must be >= 0: " + i10);
        }
        if (i10 <= 1073741824) {
            int iU = com.badlogic.gdx.math.s.u(i10);
            this.f95615d = iU;
            int i11 = 7 >> 0;
            if (f10 <= 0.0f) {
                throw new IllegalArgumentException("loadFactor must be > 0: " + f10);
            }
            this.f95617f = f10;
            this.f95620i = (int) (iU * f10);
            this.f95619h = iU - 1;
            this.f95618g = 31 - Integer.numberOfTrailingZeros(iU);
            int i12 = 4 << 3;
            this.f95621j = Math.max(3, ((int) Math.ceil(Math.log(this.f95615d))) * 2);
            this.f95622k = Math.max(Math.min(this.f95615d, 8), ((int) Math.sqrt(this.f95615d)) / 8);
            K[] kArr = (K[]) new Object[this.f95615d + this.f95621j];
            this.f95613b = kArr;
            this.f95614c = (V[]) new Object[kArr.length];
            return;
        }
        throw new IllegalArgumentException("initialCapacity is too large: " + i10);
    }

    public k0(k0<? extends K, ? extends V> k0Var) {
        this(k0Var.f95615d, k0Var.f95617f);
        this.f95616e = k0Var.f95616e;
        Object[] objArr = k0Var.f95613b;
        System.arraycopy(objArr, 0, this.f95613b, 0, objArr.length);
        Object[] objArr2 = k0Var.f95614c;
        System.arraycopy(objArr2, 0, this.f95614c, 0, objArr2.length);
        this.f95612a = k0Var.f95612a;
    }
}
