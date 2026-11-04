package com.google.common.collect;

import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true, serializable = true)
class y8<K> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f118388i = 1073741824;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final float f118389j = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f118390k = 4294967295L;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f118391l = -4294967296L;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final int f118392m = 3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final int f118393n = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    transient Object[] f118394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    transient int[] f118395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    transient int f118396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    transient int f118397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient int[] f118398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @com.google.common.annotations.e
    transient long[] f118399f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient float f118400g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private transient int f118401h;

    class a extends r8.f<K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @b9
        final K f118402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f118403b;

        a(int i10) {
            this.f118402a = (K) y8.this.f118394a[i10];
            this.f118403b = i10;
        }

        @Override // com.google.common.collect.q8.a
        @b9
        public K X0() {
            return this.f118402a;
        }

        @z7.a
        public int a(int count) {
            b();
            int i10 = this.f118403b;
            if (i10 == -1) {
                y8.this.v(this.f118402a, count);
                return 0;
            }
            int[] iArr = y8.this.f118395b;
            int i11 = iArr[i10];
            iArr[i10] = count;
            return i11;
        }

        void b() {
            int i10 = this.f118403b;
            if (i10 == -1 || i10 >= y8.this.D() || !com.google.common.base.d0.a(this.f118402a, y8.this.f118394a[this.f118403b])) {
                this.f118403b = y8.this.n(this.f118402a);
            }
        }

        @Override // com.google.common.collect.q8.a
        public int getCount() {
            b();
            int i10 = this.f118403b;
            if (i10 == -1) {
                return 0;
            }
            return y8.this.f118395b[i10];
        }
    }

    y8() {
        o(3, 1.0f);
    }

    private void A(int newSize) {
        int length = this.f118399f.length;
        if (newSize > length) {
            int iMax = Math.max(1, length >>> 1) + length;
            if (iMax < 0) {
                iMax = Integer.MAX_VALUE;
            }
            if (iMax != length) {
                z(iMax);
            }
        }
    }

    private void B(int newCapacity) {
        if (this.f118398e.length >= 1073741824) {
            this.f118401h = Integer.MAX_VALUE;
            return;
        }
        int i10 = ((int) (newCapacity * this.f118400g)) + 1;
        int[] iArrS = s(newCapacity);
        long[] jArr = this.f118399f;
        int length = iArrS.length - 1;
        for (int i11 = 0; i11 < this.f118396c; i11++) {
            int i12 = i(jArr[i11]);
            int i13 = i12 & length;
            int i14 = iArrS[i13];
            iArrS[i13] = i11;
            jArr[i11] = (((long) i12) << 32) | (((long) i14) & 4294967295L);
        }
        this.f118401h = i10;
        this.f118398e = iArrS;
    }

    private static long E(long entry, int newNext) {
        return (entry & f118391l) | (4294967295L & ((long) newNext));
    }

    static <K> y8<K> c() {
        return new y8<>();
    }

    static <K> y8<K> d(int expectedSize) {
        return new y8<>(expectedSize);
    }

    private static int i(long entry) {
        return (int) (entry >>> 32);
    }

    private static int k(long entry) {
        return (int) entry;
    }

    private int m() {
        return this.f118398e.length - 1;
    }

    private static long[] r(int size) {
        long[] jArr = new long[size];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    private static int[] s(int size) {
        int[] iArr = new int[size];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private int x(@fj.a Object key, int hash) {
        int iM = m() & hash;
        int i10 = this.f118398e[iM];
        int i11 = 5 & (-1);
        if (i10 == -1) {
            return 0;
        }
        int i12 = -1;
        while (true) {
            if (i(this.f118399f[i10]) == hash && com.google.common.base.d0.a(key, this.f118394a[i10])) {
                int i13 = this.f118395b[i10];
                if (i12 == -1) {
                    this.f118398e[iM] = k(this.f118399f[i10]);
                } else {
                    long[] jArr = this.f118399f;
                    jArr[i12] = E(jArr[i12], k(jArr[i10]));
                }
                q(i10);
                this.f118396c--;
                this.f118397d++;
                return i13;
            }
            int iK = k(this.f118399f[i10]);
            if (iK == -1) {
                return 0;
            }
            i12 = i10;
            i10 = iK;
        }
    }

    void C(int index, int newValue) {
        com.google.common.base.j0.C(index, this.f118396c);
        this.f118395b[index] = newValue;
    }

    int D() {
        return this.f118396c;
    }

    public void a() {
        this.f118397d++;
        Arrays.fill(this.f118394a, 0, this.f118396c, (Object) null);
        Arrays.fill(this.f118395b, 0, this.f118396c, 0);
        Arrays.fill(this.f118398e, -1);
        Arrays.fill(this.f118399f, -1L);
        this.f118396c = 0;
    }

    public boolean b(@fj.a Object key) {
        return n(key) != -1;
    }

    void e(int minCapacity) {
        if (minCapacity > this.f118399f.length) {
            z(minCapacity);
        }
        if (minCapacity >= this.f118401h) {
            B(Math.max(2, Integer.highestOneBit(minCapacity - 1) << 1));
        }
    }

    int f() {
        return this.f118396c == 0 ? -1 : 0;
    }

    public int g(@fj.a Object key) {
        int iN = n(key);
        if (iN == -1) {
            return 0;
        }
        return this.f118395b[iN];
    }

    q8.a<K> h(int index) {
        com.google.common.base.j0.C(index, this.f118396c);
        return new a(index);
    }

    @b9
    K j(int i10) {
        com.google.common.base.j0.C(i10, this.f118396c);
        return (K) this.f118394a[i10];
    }

    int l(int index) {
        com.google.common.base.j0.C(index, this.f118396c);
        return this.f118395b[index];
    }

    int n(@fj.a Object key) {
        int iD = c6.d(key);
        int iK = this.f118398e[m() & iD];
        while (iK != -1) {
            long j10 = this.f118399f[iK];
            if (i(j10) == iD && com.google.common.base.d0.a(key, this.f118394a[iK])) {
                return iK;
            }
            iK = k(j10);
        }
        return -1;
    }

    void o(int expectedSize, float loadFactor) {
        com.google.common.base.j0.e(expectedSize >= 0, "Initial capacity must be non-negative");
        com.google.common.base.j0.e(loadFactor > 0.0f, "Illegal load factor");
        int iA = c6.a(expectedSize, loadFactor);
        this.f118398e = s(iA);
        this.f118400g = loadFactor;
        this.f118394a = new Object[expectedSize];
        this.f118395b = new int[expectedSize];
        this.f118399f = r(expectedSize);
        this.f118401h = Math.max(1, (int) (iA * loadFactor));
    }

    void p(int entryIndex, @b9 K key, int value, int hash) {
        this.f118399f[entryIndex] = (((long) hash) << 32) | 4294967295L;
        this.f118394a[entryIndex] = key;
        this.f118395b[entryIndex] = value;
    }

    void q(int dstIndex) {
        int iD = D() - 1;
        if (dstIndex >= iD) {
            this.f118394a[dstIndex] = null;
            this.f118395b[dstIndex] = 0;
            this.f118399f[dstIndex] = -1;
            return;
        }
        Object[] objArr = this.f118394a;
        objArr[dstIndex] = objArr[iD];
        int[] iArr = this.f118395b;
        iArr[dstIndex] = iArr[iD];
        objArr[iD] = null;
        iArr[iD] = 0;
        long[] jArr = this.f118399f;
        long j10 = jArr[iD];
        jArr[dstIndex] = j10;
        jArr[iD] = -1;
        int i10 = i(j10) & m();
        int[] iArr2 = this.f118398e;
        int i11 = iArr2[i10];
        if (i11 == iD) {
            iArr2[i10] = dstIndex;
            return;
        }
        while (true) {
            long j11 = this.f118399f[i11];
            int iK = k(j11);
            if (iK == iD) {
                this.f118399f[i11] = E(j11, dstIndex);
                return;
            }
            i11 = iK;
        }
    }

    int t(int index) {
        int i10 = index + 1;
        if (i10 < this.f118396c) {
            return i10;
        }
        return -1;
    }

    int u(int oldNextIndex, int removedIndex) {
        return oldNextIndex - 1;
    }

    @z7.a
    public int v(@b9 K key, int value) {
        a3.d(value, "count");
        long[] jArr = this.f118399f;
        Object[] objArr = this.f118394a;
        int[] iArr = this.f118395b;
        int iD = c6.d(key);
        int iM = m() & iD;
        int i10 = this.f118396c;
        int[] iArr2 = this.f118398e;
        int i11 = iArr2[iM];
        if (i11 == -1) {
            iArr2[iM] = i10;
        } else {
            while (true) {
                long j10 = jArr[i11];
                if (i(j10) == iD && com.google.common.base.d0.a(key, objArr[i11])) {
                    int i12 = iArr[i11];
                    iArr[i11] = value;
                    return i12;
                }
                int iK = k(j10);
                if (iK == -1) {
                    jArr[i11] = E(j10, i10);
                    break;
                }
                i11 = iK;
            }
        }
        if (i10 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i13 = i10 + 1;
        A(i13);
        p(i10, key, value, iD);
        this.f118396c = i13;
        if (i10 >= this.f118401h) {
            B(this.f118398e.length * 2);
        }
        this.f118397d++;
        return 0;
    }

    @z7.a
    public int w(@fj.a Object key) {
        return x(key, c6.d(key));
    }

    @z7.a
    int y(int entryIndex) {
        return x(this.f118394a[entryIndex], i(this.f118399f[entryIndex]));
    }

    void z(int newCapacity) {
        this.f118394a = Arrays.copyOf(this.f118394a, newCapacity);
        this.f118395b = Arrays.copyOf(this.f118395b, newCapacity);
        long[] jArr = this.f118399f;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, newCapacity);
        if (newCapacity > length) {
            Arrays.fill(jArrCopyOf, length, newCapacity, -1L);
        }
        this.f118399f = jArrCopyOf;
    }

    y8(y8<? extends K> map) {
        o(map.D(), 1.0f);
        int iF = map.f();
        while (iF != -1) {
            v(map.j(iF), map.l(iF));
            iF = map.t(iF);
        }
    }

    y8(int capacity) {
        this(capacity, 1.0f);
    }

    y8(int expectedSize, float loadFactor) {
        o(expectedSize, loadFactor);
    }
}
