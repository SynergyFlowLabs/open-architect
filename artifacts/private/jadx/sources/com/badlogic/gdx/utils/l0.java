package com.badlogic.gdx.utils;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class l0<T> implements Iterable<T> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f95653m = -1105259343;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f95654n = -1262997959;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f95655o = -825114047;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f95656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    T[] f95657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f95658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f95659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f95660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f95661f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f95662g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f95663h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f95664i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f95665j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private a f95666k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private a f95667l;

    public static class a<K> implements Iterable<K>, Iterator<K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f95668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final l0<K> f95669b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f95670c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f95671d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f95672e = true;

        public a(l0<K> l0Var) {
            this.f95669b = l0Var;
            reset();
        }

        void c() {
            int i10;
            this.f95668a = false;
            l0<K> l0Var = this.f95669b;
            K[] kArr = l0Var.f95657b;
            int i11 = l0Var.f95658c + l0Var.f95659d;
            do {
                i10 = this.f95670c + 1;
                this.f95670c = i10;
                if (i10 >= i11) {
                    return;
                }
            } while (kArr[i10] == null);
            this.f95668a = true;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f95672e) {
                return this.f95668a;
            }
            throw new t("#iterator() cannot be used nested.");
        }

        @Override // java.lang.Iterable
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public a<K> iterator() {
            return this;
        }

        public b<K> k() {
            return l(new b<>(true, this.f95669b.f95656a));
        }

        public b<K> l(b<K> bVar) {
            while (this.f95668a) {
                bVar.c(next());
            }
            return bVar;
        }

        @Override // java.util.Iterator
        public K next() {
            if (!this.f95668a) {
                throw new NoSuchElementException();
            }
            if (!this.f95672e) {
                throw new t("#iterator() cannot be used nested.");
            }
            K[] kArr = this.f95669b.f95657b;
            int i10 = this.f95670c;
            K k10 = kArr[i10];
            this.f95671d = i10;
            c();
            return k10;
        }

        @Override // java.util.Iterator
        public void remove() {
            int i10 = this.f95671d;
            if (i10 < 0) {
                throw new IllegalStateException("next must be called before remove.");
            }
            l0<K> l0Var = this.f95669b;
            if (i10 >= l0Var.f95658c) {
                l0Var.B(i10);
                this.f95670c = this.f95671d - 1;
                c();
            } else {
                l0Var.f95657b[i10] = null;
            }
            this.f95671d = -1;
            this.f95669b.f95656a--;
        }

        public void reset() {
            this.f95671d = -1;
            this.f95670c = -1;
            c();
        }
    }

    public l0() {
        this(32, 0.8f);
    }

    private void C(int i10) {
        int i11 = this.f95658c + this.f95659d;
        this.f95658c = i10;
        this.f95663h = (int) (i10 * this.f95660e);
        this.f95662g = i10 - 1;
        this.f95661f = 31 - Integer.numberOfTrailingZeros(i10);
        double d10 = i10;
        this.f95664i = Math.max(3, ((int) Math.ceil(Math.log(d10))) * 2);
        this.f95665j = Math.max(Math.min(i10, 8), ((int) Math.sqrt(d10)) / 8);
        T[] tArr = this.f95657b;
        this.f95657b = (T[]) new Object[i10 + this.f95664i];
        int i12 = this.f95656a;
        this.f95656a = 0;
        this.f95659d = 0;
        if (i12 > 0) {
            for (int i13 = 0; i13 < i11; i13++) {
                T t10 = tArr[i13];
                if (t10 != null) {
                    m(t10);
                }
            }
        }
    }

    public static <T> l0<T> G(T... tArr) {
        l0<T> l0Var = new l0<>();
        l0Var.k(tArr);
        return l0Var;
    }

    private void m(T t10) {
        int iHashCode = t10.hashCode();
        int i10 = iHashCode & this.f95662g;
        T[] tArr = this.f95657b;
        T t11 = tArr[i10];
        if (t11 == null) {
            tArr[i10] = t10;
            int i11 = this.f95656a;
            this.f95656a = i11 + 1;
            if (i11 >= this.f95663h) {
                C(this.f95658c << 1);
                return;
            }
            return;
        }
        int iT = t(iHashCode);
        T[] tArr2 = this.f95657b;
        T t12 = tArr2[iT];
        if (t12 == null) {
            tArr2[iT] = t10;
            int i12 = this.f95656a;
            this.f95656a = i12 + 1;
            if (i12 >= this.f95663h) {
                C(this.f95658c << 1);
                return;
            }
            return;
        }
        int iU = u(iHashCode);
        T[] tArr3 = this.f95657b;
        T t13 = tArr3[iU];
        if (t13 != null) {
            w(t10, i10, t11, iT, t12, iU, t13);
            return;
        }
        tArr3[iU] = t10;
        int i13 = this.f95656a;
        this.f95656a = i13 + 1;
        if (i13 >= this.f95663h) {
            C(this.f95658c << 1);
        }
    }

    private void n(T t10) {
        int i10 = this.f95659d;
        if (i10 == this.f95664i) {
            C(this.f95658c << 1);
            add(t10);
        } else {
            this.f95657b[this.f95658c + i10] = t10;
            this.f95659d = i10 + 1;
            this.f95656a++;
        }
    }

    private boolean r(T t10) {
        T[] tArr = this.f95657b;
        int i10 = this.f95658c;
        int i11 = this.f95659d + i10;
        while (i10 < i11) {
            if (t10.equals(tArr[i10])) {
                return true;
            }
            i10++;
        }
        return false;
    }

    private int t(int i10) {
        int i11 = i10 * f95654n;
        return this.f95662g & (i11 ^ (i11 >>> this.f95661f));
    }

    private int u(int i10) {
        int i11 = i10 * f95655o;
        return this.f95662g & (i11 ^ (i11 >>> this.f95661f));
    }

    private void w(T t10, int i10, T t11, int i11, T t12, int i12, T t13) {
        T[] tArr = this.f95657b;
        int i13 = this.f95662g;
        int i14 = this.f95665j;
        int i15 = 0;
        while (true) {
            int iY = com.badlogic.gdx.math.s.y(2);
            if (iY == 0) {
                tArr[i10] = t10;
                t10 = t11;
            } else if (iY != 1) {
                tArr[i12] = t10;
                t10 = t13;
            } else {
                tArr[i11] = t10;
                t10 = t12;
            }
            int iHashCode = t10.hashCode();
            int i16 = iHashCode & i13;
            T t14 = tArr[i16];
            if (t14 == null) {
                tArr[i16] = t10;
                int i17 = this.f95656a;
                this.f95656a = i17 + 1;
                if (i17 < this.f95663h) {
                    break;
                }
                C(this.f95658c << 1);
                return;
            }
            int iT = t(iHashCode);
            T t15 = tArr[iT];
            if (t15 == null) {
                tArr[iT] = t10;
                int i18 = this.f95656a;
                this.f95656a = i18 + 1;
                if (i18 < this.f95663h) {
                    break;
                }
                C(this.f95658c << 1);
                return;
            }
            int iU = u(iHashCode);
            t13 = tArr[iU];
            if (t13 == null) {
                tArr[iU] = t10;
                int i19 = this.f95656a;
                this.f95656a = i19 + 1;
                if (i19 < this.f95663h) {
                    break;
                }
                C(this.f95658c << 1);
                break;
            }
            i15++;
            if (i15 == i14) {
                n(t10);
                return;
            }
            i12 = iU;
            i10 = i16;
            t11 = t14;
            i11 = iT;
            t12 = t15;
        }
    }

    boolean A(T t10) {
        T[] tArr = this.f95657b;
        int i10 = this.f95658c;
        int i11 = this.f95659d + i10;
        while (i10 < i11) {
            if (t10.equals(tArr[i10])) {
                B(i10);
                this.f95656a--;
                return true;
            }
            i10++;
        }
        return false;
    }

    void B(int i10) {
        int i11 = this.f95659d - 1;
        this.f95659d = i11;
        int i12 = this.f95658c + i11;
        if (i10 < i12) {
            T[] tArr = this.f95657b;
            tArr[i10] = tArr[i12];
        }
    }

    public void D(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("maximumCapacity must be >= 0: " + i10);
        }
        int i11 = this.f95656a;
        if (i11 > i10) {
            i10 = i11;
        }
        if (this.f95658c <= i10) {
            return;
        }
        C(com.badlogic.gdx.math.s.u(i10));
    }

    public String F(String str) {
        int i10;
        if (this.f95656a == 0) {
            return "";
        }
        f1 f1Var = new f1(32);
        T[] tArr = this.f95657b;
        int length = tArr.length;
        while (true) {
            i10 = length - 1;
            if (length > 0) {
                T t10 = tArr[i10];
                if (t10 != null) {
                    f1Var.n(t10);
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
                return f1Var.toString();
            }
            T t11 = tArr[i11];
            if (t11 != null) {
                f1Var.o(str);
                f1Var.n(t11);
            }
            i10 = i11;
        }
    }

    public boolean add(T t10) {
        if (t10 == null) {
            throw new IllegalArgumentException("key cannot be null.");
        }
        Object[] objArr = this.f95657b;
        int iHashCode = t10.hashCode();
        int i10 = iHashCode & this.f95662g;
        T t11 = objArr[i10];
        if (t10.equals(t11)) {
            return false;
        }
        int iT = t(iHashCode);
        T t12 = objArr[iT];
        if (t10.equals(t12)) {
            return false;
        }
        int iU = u(iHashCode);
        T t13 = objArr[iU];
        if (t10.equals(t13)) {
            return false;
        }
        int i11 = this.f95658c;
        int i12 = this.f95659d + i11;
        while (i11 < i12) {
            if (t10.equals(objArr[i11])) {
                return false;
            }
            i11++;
        }
        if (t11 == null) {
            objArr[i10] = t10;
            int i13 = this.f95656a;
            this.f95656a = i13 + 1;
            if (i13 >= this.f95663h) {
                C(this.f95658c << 1);
            }
            return true;
        }
        if (t12 == null) {
            objArr[iT] = t10;
            int i14 = this.f95656a;
            this.f95656a = i14 + 1;
            if (i14 >= this.f95663h) {
                C(this.f95658c << 1);
            }
            return true;
        }
        if (t13 != null) {
            w(t10, i10, t11, iT, t12, iU, t13);
            return true;
        }
        objArr[iU] = t10;
        int i15 = this.f95656a;
        this.f95656a = i15 + 1;
        if (i15 >= this.f95663h) {
            C(this.f95658c << 1);
        }
        return true;
    }

    public void c(b<? extends T> bVar) {
        d(bVar, 0, bVar.f95174b);
    }

    public void clear() {
        if (this.f95656a == 0) {
            return;
        }
        T[] tArr = this.f95657b;
        int i10 = this.f95658c + this.f95659d;
        while (true) {
            int i11 = i10 - 1;
            if (i10 <= 0) {
                this.f95656a = 0;
                this.f95659d = 0;
                return;
            } else {
                tArr[i11] = null;
                i10 = i11;
            }
        }
    }

    public boolean contains(T t10) {
        int iHashCode = t10.hashCode();
        if (!t10.equals(this.f95657b[this.f95662g & iHashCode])) {
            if (!t10.equals(this.f95657b[t(iHashCode)])) {
                if (!t10.equals(this.f95657b[u(iHashCode)])) {
                    return r(t10);
                }
            }
        }
        return true;
    }

    public void d(b<? extends T> bVar, int i10, int i11) {
        if (i10 + i11 <= bVar.f95174b) {
            l(bVar.f95173a, i10, i11);
            return;
        }
        throw new IllegalArgumentException("offset + length must be <= size: " + i10 + " + " + i11 + " <= " + bVar.f95174b);
    }

    public T first() {
        T[] tArr = this.f95657b;
        int i10 = this.f95658c + this.f95659d;
        for (int i11 = 0; i11 < i10; i11++) {
            T t10 = tArr[i11];
            if (t10 != null) {
                return t10;
            }
        }
        throw new IllegalStateException("ObjectSet is empty.");
    }

    public void i(l0<T> l0Var) {
        s(l0Var.f95656a);
        a<T> it = l0Var.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    public void k(T... tArr) {
        l(tArr, 0, tArr.length);
    }

    public void l(T[] tArr, int i10, int i11) {
        s(i11);
        int i12 = i11 + i10;
        while (i10 < i12) {
            add(tArr[i10]);
            i10++;
        }
    }

    public void p(int i10) {
        if (this.f95658c <= i10) {
            clear();
        } else {
            this.f95656a = 0;
            C(i10);
        }
    }

    public boolean remove(T t10) {
        int iHashCode = t10.hashCode();
        int i10 = this.f95662g & iHashCode;
        if (t10.equals(this.f95657b[i10])) {
            this.f95657b[i10] = null;
            this.f95656a--;
            return true;
        }
        int iT = t(iHashCode);
        if (t10.equals(this.f95657b[iT])) {
            this.f95657b[iT] = null;
            this.f95656a--;
            return true;
        }
        int iU = u(iHashCode);
        if (!t10.equals(this.f95657b[iU])) {
            return A(t10);
        }
        this.f95657b[iU] = null;
        this.f95656a--;
        return true;
    }

    public void s(int i10) {
        int i11 = this.f95656a + i10;
        if (i11 >= this.f95663h) {
            C(com.badlogic.gdx.math.s.u((int) (i11 / this.f95660e)));
        }
    }

    public String toString() {
        return AbstractJsonLexerKt.BEGIN_OBJ + F(", ") + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public a<T> iterator() {
        if (this.f95666k == null) {
            this.f95666k = new a(this);
            this.f95667l = new a(this);
        }
        a aVar = this.f95666k;
        if (aVar.f95672e) {
            this.f95667l.reset();
            a<T> aVar2 = this.f95667l;
            aVar2.f95672e = true;
            this.f95666k.f95672e = false;
            return aVar2;
        }
        aVar.reset();
        a<T> aVar3 = this.f95666k;
        aVar3.f95672e = true;
        this.f95667l.f95672e = false;
        return aVar3;
    }

    public l0(int i10) {
        this(i10, 0.8f);
    }

    public l0(int i10, float f10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("initialCapacity must be >= 0: " + i10);
        }
        if (i10 <= 1073741824) {
            int iU = com.badlogic.gdx.math.s.u(i10);
            this.f95658c = iU;
            if (f10 <= 0.0f) {
                throw new IllegalArgumentException("loadFactor must be > 0: " + f10);
            }
            this.f95660e = f10;
            this.f95663h = (int) (iU * f10);
            this.f95662g = iU - 1;
            this.f95661f = 31 - Integer.numberOfTrailingZeros(iU);
            this.f95664i = Math.max(3, ((int) Math.ceil(Math.log(this.f95658c))) * 2);
            this.f95665j = Math.max(Math.min(this.f95658c, 8), ((int) Math.sqrt(this.f95658c)) / 8);
            this.f95657b = (T[]) new Object[this.f95658c + this.f95664i];
            return;
        }
        throw new IllegalArgumentException("initialCapacity is too large: " + i10);
    }

    public l0(l0 l0Var) {
        this(l0Var.f95658c, l0Var.f95660e);
        this.f95659d = l0Var.f95659d;
        T[] tArr = l0Var.f95657b;
        System.arraycopy(tArr, 0, this.f95657b, 0, tArr.length);
        this.f95656a = l0Var.f95656a;
    }
}
