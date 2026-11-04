package com.badlogic.gdx.utils;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class b<T> implements Iterable<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T[] f95173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f95174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f95175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f95176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private r0.a<T> f95177e;

    public static class a<T> implements Iterable<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b<T> f95178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f95179b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private C0846b f95180c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private C0846b f95181d;

        public a(b<T> bVar) {
            this(bVar, true);
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            if (this.f95180c == null) {
                this.f95180c = new C0846b(this.f95178a, this.f95179b);
                this.f95181d = new C0846b(this.f95178a, this.f95179b);
            }
            C0846b c0846b = this.f95180c;
            int i10 = 4 << 1;
            if (!c0846b.f95185d) {
                c0846b.f95184c = 0;
                c0846b.f95185d = true;
                this.f95181d.f95185d = false;
                return c0846b;
            }
            C0846b c0846b2 = this.f95181d;
            c0846b2.f95184c = 0;
            c0846b2.f95185d = true;
            c0846b.f95185d = false;
            return c0846b2;
        }

        public a(b<T> bVar, boolean z10) {
            this.f95178a = bVar;
            this.f95179b = z10;
        }
    }

    /* JADX INFO: renamed from: com.badlogic.gdx.utils.b$b, reason: collision with other inner class name */
    public static class C0846b<T> implements Iterator<T>, Iterable<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b<T> f95182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f95183b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f95184c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f95185d;

        public C0846b(b<T> bVar) {
            this(bVar, true);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f95185d) {
                return this.f95184c < this.f95182a.f95174b;
            }
            throw new t("#iterator() cannot be used nested.");
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this;
        }

        @Override // java.util.Iterator
        public T next() {
            int i10 = this.f95184c;
            b<T> bVar = this.f95182a;
            if (i10 >= bVar.f95174b) {
                throw new NoSuchElementException(String.valueOf(this.f95184c));
            }
            if (!this.f95185d) {
                throw new t("#iterator() cannot be used nested.");
            }
            T[] tArr = bVar.f95173a;
            this.f95184c = i10 + 1;
            return tArr[i10];
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f95183b) {
                throw new t("Remove not allowed.");
            }
            int i10 = this.f95184c - 1;
            this.f95184c = i10;
            this.f95182a.A(i10);
        }

        public void reset() {
            this.f95184c = 0;
        }

        public C0846b(b<T> bVar, boolean z10) {
            this.f95185d = true;
            this.f95182a = bVar;
            this.f95183b = z10;
        }
    }

    public b() {
        this(true, 16);
    }

    public static <T> b<T> T(T... tArr) {
        return new b<>(tArr);
    }

    public static <T> b<T> t(Class<T> cls) {
        return new b<>(cls);
    }

    public static <T> b<T> u(boolean z10, int i10, Class<T> cls) {
        return new b<>(z10, i10, cls);
    }

    public T A(int i10) {
        int i11 = this.f95174b;
        if (i10 >= i11) {
            throw new IndexOutOfBoundsException("index can't be >= size: " + i10 + " >= " + this.f95174b);
        }
        T[] tArr = this.f95173a;
        T t10 = tArr[i10];
        int i12 = i11 - 1;
        this.f95174b = i12;
        if (this.f95175c) {
            System.arraycopy(tArr, i10 + 1, tArr, i10, i12 - i10);
        } else {
            tArr[i10] = tArr[i12];
        }
        tArr[this.f95174b] = null;
        return t10;
    }

    public void B(int i10, int i11) {
        int i12 = this.f95174b;
        if (i11 >= i12) {
            throw new IndexOutOfBoundsException("end can't be >= size: " + i11 + " >= " + this.f95174b);
        }
        if (i10 > i11) {
            throw new IndexOutOfBoundsException("start can't be > end: " + i10 + " > " + i11);
        }
        T[] tArr = this.f95173a;
        int i13 = (i11 - i10) + 1;
        if (this.f95175c) {
            int i14 = i10 + i13;
            System.arraycopy(tArr, i14, tArr, i10, i12 - i14);
        } else {
            int i15 = i12 - 1;
            for (int i16 = 0; i16 < i13; i16++) {
                tArr[i10 + i16] = tArr[i15 - i16];
            }
        }
        this.f95174b -= i13;
    }

    public boolean C(T t10, boolean z10) {
        T[] tArr = this.f95173a;
        if (z10 || t10 == null) {
            int i10 = this.f95174b;
            for (int i11 = 0; i11 < i10; i11++) {
                if (tArr[i11] == t10) {
                    A(i11);
                    return true;
                }
            }
        } else {
            int i12 = this.f95174b;
            for (int i13 = 0; i13 < i12; i13++) {
                if (t10.equals(tArr[i13])) {
                    A(i13);
                    return true;
                }
            }
        }
        return false;
    }

    protected T[] D(int i10) {
        T[] tArr = this.f95173a;
        T[] tArr2 = (T[]) ((Object[]) com.badlogic.gdx.utils.reflect.b.c(tArr.getClass().getComponentType(), i10));
        System.arraycopy(tArr, 0, tArr2, 0, Math.min(this.f95174b, tArr2.length));
        this.f95173a = tArr2;
        return tArr2;
    }

    public void F() {
        T[] tArr = this.f95173a;
        int i10 = this.f95174b;
        int i11 = i10 - 1;
        int i12 = i10 / 2;
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i11 - i13;
            T t10 = tArr[i13];
            tArr[i13] = tArr[i14];
            tArr[i14] = t10;
        }
    }

    public Iterable<T> G(r0<T> r0Var) {
        r0.a<T> aVar = this.f95177e;
        if (aVar == null) {
            this.f95177e = new r0.a<>(this, r0Var);
        } else {
            aVar.c(this, r0Var);
        }
        return this.f95177e;
    }

    public T J(Comparator<T> comparator, int i10) {
        if (i10 >= 1) {
            return (T) x0.c().d(this.f95173a, comparator, i10, this.f95174b);
        }
        throw new t("nth_lowest must be greater than 0, 1 = first, 2 = second...");
    }

    public int K(Comparator<T> comparator, int i10) {
        if (i10 >= 1) {
            return x0.c().e(this.f95173a, comparator, i10, this.f95174b);
        }
        throw new t("nth_lowest must be greater than 0, 1 = first, 2 = second...");
    }

    public void L(int i10, T t10) {
        if (i10 < this.f95174b) {
            this.f95173a[i10] = t10;
            return;
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i10 + " >= " + this.f95174b);
    }

    public T[] M() {
        int length = this.f95173a.length;
        int i10 = this.f95174b;
        if (length != i10) {
            D(i10);
        }
        return this.f95173a;
    }

    public void N() {
        T[] tArr = this.f95173a;
        for (int i10 = this.f95174b - 1; i10 >= 0; i10--) {
            int iY = com.badlogic.gdx.math.s.y(i10);
            T t10 = tArr[i10];
            tArr[i10] = tArr[iY];
            tArr[iY] = t10;
        }
    }

    public void O() {
        c1.a().e(this.f95173a, 0, this.f95174b);
    }

    public void P(int i10, int i11) {
        int i12 = this.f95174b;
        if (i10 >= i12) {
            throw new IndexOutOfBoundsException("first can't be >= size: " + i10 + " >= " + this.f95174b);
        }
        if (i11 < i12) {
            T[] tArr = this.f95173a;
            T t10 = tArr[i10];
            tArr[i10] = tArr[i11];
            tArr[i11] = t10;
            return;
        }
        throw new IndexOutOfBoundsException("second can't be >= size: " + i11 + " >= " + this.f95174b);
    }

    public <V> V[] Q(Class cls) {
        V[] vArr = (V[]) ((Object[]) com.badlogic.gdx.utils.reflect.b.c(cls, this.f95174b));
        System.arraycopy(this.f95173a, 0, vArr, 0, this.f95174b);
        return vArr;
    }

    public String R(String str) {
        if (this.f95174b == 0) {
            return "";
        }
        T[] tArr = this.f95173a;
        f1 f1Var = new f1(32);
        int i10 = 7 ^ 0;
        f1Var.n(tArr[0]);
        for (int i11 = 1; i11 < this.f95174b; i11++) {
            f1Var.o(str);
            f1Var.n(tArr[i11]);
        }
        return f1Var.toString();
    }

    public void S(int i10) {
        if (this.f95174b <= i10) {
            return;
        }
        for (int i11 = i10; i11 < this.f95174b; i11++) {
            this.f95173a[i11] = null;
        }
        this.f95174b = i10;
    }

    public void c(T t10) {
        T[] tArrD = this.f95173a;
        int i10 = this.f95174b;
        if (i10 == tArrD.length) {
            tArrD = D(Math.max(8, (int) (i10 * 1.75f)));
        }
        int i11 = this.f95174b;
        this.f95174b = i11 + 1;
        tArrD[i11] = t10;
    }

    public void clear() {
        T[] tArr = this.f95173a;
        int i10 = this.f95174b;
        for (int i11 = 0; i11 < i10; i11++) {
            tArr[i11] = null;
        }
        this.f95174b = 0;
    }

    public void d(b<? extends T> bVar) {
        i(bVar, 0, bVar.f95174b);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        int i10 = this.f95174b;
        if (i10 != bVar.f95174b) {
            return false;
        }
        T[] tArr = this.f95173a;
        T[] tArr2 = bVar.f95173a;
        for (int i11 = 0; i11 < i10; i11++) {
            T t10 = tArr[i11];
            T t11 = tArr2[i11];
            if (t10 == null) {
                if (t11 != null) {
                    return false;
                }
            } else {
                if (!t10.equals(t11)) {
                    return false;
                }
            }
        }
        return true;
    }

    public T first() {
        if (this.f95174b != 0) {
            return this.f95173a[0];
        }
        throw new IllegalStateException("Array is empty.");
    }

    public T get(int i10) {
        if (i10 < this.f95174b) {
            return this.f95173a[i10];
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i10 + " >= " + this.f95174b);
    }

    public void i(b<? extends T> bVar, int i10, int i11) {
        if (i10 + i11 <= bVar.f95174b) {
            l(bVar.f95173a, i10, i11);
            return;
        }
        throw new IllegalArgumentException("start + count must be <= size: " + i10 + " + " + i11 + " <= " + bVar.f95174b);
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        if (this.f95176d == null) {
            this.f95176d = new a(this);
        }
        return this.f95176d.iterator();
    }

    public void k(T... tArr) {
        l(tArr, 0, tArr.length);
    }

    public void l(T[] tArr, int i10, int i11) {
        T[] tArrD = this.f95173a;
        int i12 = this.f95174b + i11;
        if (i12 > tArrD.length) {
            tArrD = D(Math.max(8, (int) (i12 * 1.75f)));
        }
        System.arraycopy(tArr, i10, tArrD, this.f95174b, i11);
        this.f95174b += i11;
    }

    public boolean m(T t10, boolean z10) {
        T[] tArr = this.f95173a;
        int i10 = this.f95174b - 1;
        if (z10 || t10 == null) {
            while (i10 >= 0) {
                int i11 = i10 - 1;
                if (tArr[i10] == t10) {
                    return true;
                }
                i10 = i11;
            }
        } else {
            while (i10 >= 0) {
                int i12 = i10 - 1;
                if (t10.equals(tArr[i10])) {
                    return true;
                }
                i10 = i12;
            }
        }
        return false;
    }

    public T[] n(int i10) {
        int i11 = this.f95174b + i10;
        if (i11 > this.f95173a.length) {
            D(Math.max(8, i11));
        }
        return this.f95173a;
    }

    public int p(T t10, boolean z10) {
        T[] tArr = this.f95173a;
        int i10 = 0;
        if (z10 || t10 == null) {
            int i11 = this.f95174b;
            while (i10 < i11) {
                if (tArr[i10] == t10) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int i12 = this.f95174b;
        while (i10 < i12) {
            if (t10.equals(tArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public T peek() {
        int i10 = this.f95174b;
        if (i10 != 0) {
            return this.f95173a[i10 - 1];
        }
        throw new IllegalStateException("Array is empty.");
    }

    public T pop() {
        int i10 = this.f95174b;
        if (i10 == 0) {
            throw new IllegalStateException("Array is empty.");
        }
        int i11 = i10 - 1;
        this.f95174b = i11;
        T[] tArr = this.f95173a;
        T t10 = tArr[i11];
        tArr[i11] = null;
        return t10;
    }

    public void r(int i10, T t10) {
        int i11 = this.f95174b;
        if (i10 > i11) {
            throw new IndexOutOfBoundsException("index can't be > size: " + i10 + " > " + this.f95174b);
        }
        T[] tArrD = this.f95173a;
        if (i11 == tArrD.length) {
            tArrD = D(Math.max(8, (int) (i11 * 1.75f)));
        }
        if (this.f95175c) {
            System.arraycopy(tArrD, i10, tArrD, i10 + 1, this.f95174b - i10);
        } else {
            tArrD[this.f95174b] = tArrD[i10];
        }
        this.f95174b++;
        tArrD[i10] = t10;
    }

    public int s(T t10, boolean z10) {
        T[] tArr = this.f95173a;
        if (z10 || t10 == null) {
            for (int i10 = this.f95174b - 1; i10 >= 0; i10--) {
                if (tArr[i10] == t10) {
                    return i10;
                }
            }
            return -1;
        }
        int i11 = this.f95174b;
        do {
            i11--;
            if (i11 < 0) {
                return -1;
            }
        } while (!t10.equals(tArr[i11]));
        return i11;
    }

    public void sort(Comparator<? super T> comparator) {
        c1.a().g(this.f95173a, comparator, 0, this.f95174b);
    }

    public T[] toArray() {
        return (T[]) Q(this.f95173a.getClass().getComponentType());
    }

    public String toString() {
        if (this.f95174b == 0) {
            return okhttp3.v.f334777p;
        }
        T[] tArr = this.f95173a;
        f1 f1Var = new f1(32);
        f1Var.append(AbstractJsonLexerKt.BEGIN_LIST);
        f1Var.n(tArr[0]);
        for (int i10 = 1; i10 < this.f95174b; i10++) {
            f1Var.o(", ");
            f1Var.n(tArr[i10]);
        }
        f1Var.append(AbstractJsonLexerKt.END_LIST);
        return f1Var.toString();
    }

    public T v() {
        int i10 = this.f95174b;
        if (i10 == 0) {
            return null;
        }
        return this.f95173a[com.badlogic.gdx.math.s.z(0, i10 - 1)];
    }

    public boolean w(b<? extends T> bVar, boolean z10) {
        int i10;
        int i11 = this.f95174b;
        T[] tArr = this.f95173a;
        if (z10) {
            int i12 = bVar.f95174b;
            i10 = i11;
            for (int i13 = 0; i13 < i12; i13++) {
                T t10 = bVar.get(i13);
                for (int i14 = 0; i14 < i10; i14++) {
                    if (t10 == tArr[i14]) {
                        A(i14);
                        i10--;
                        break;
                    }
                }
            }
        } else {
            int i15 = bVar.f95174b;
            i10 = i11;
            for (int i16 = 0; i16 < i15; i16++) {
                T t11 = bVar.get(i16);
                for (int i17 = 0; i17 < i10; i17++) {
                    if (t11.equals(tArr[i17])) {
                        A(i17);
                        i10--;
                        break;
                    }
                }
            }
        }
        return i10 != i11;
    }

    public b(int i10) {
        this(true, i10);
    }

    public b(boolean z10, int i10) {
        this.f95175c = z10;
        this.f95173a = (T[]) new Object[i10];
    }

    public b(boolean z10, int i10, Class cls) {
        this.f95175c = z10;
        this.f95173a = (T[]) ((Object[]) com.badlogic.gdx.utils.reflect.b.c(cls, i10));
    }

    public b(Class cls) {
        this(true, 16, cls);
    }

    public b(b<? extends T> bVar) {
        this(bVar.f95175c, bVar.f95174b, bVar.f95173a.getClass().getComponentType());
        int i10 = bVar.f95174b;
        this.f95174b = i10;
        System.arraycopy(bVar.f95173a, 0, this.f95173a, 0, i10);
    }

    public b(T[] tArr) {
        this(true, tArr, 0, tArr.length);
    }

    public b(boolean z10, T[] tArr, int i10, int i11) {
        this(z10, i11, tArr.getClass().getComponentType());
        this.f95174b = i11;
        System.arraycopy(tArr, i10, this.f95173a, 0, i11);
    }
}
