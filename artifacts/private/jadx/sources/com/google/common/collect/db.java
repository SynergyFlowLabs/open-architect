package com.google.common.collect;

import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
final class db<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f117300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Comparator<? super T> f117301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final T[] f117302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f117303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @fj.a
    private T f117304e;

    private db(Comparator<? super T> comparator, int i10) {
        this.f117301b = (Comparator) com.google.common.base.j0.F(comparator, "comparator");
        this.f117300a = i10;
        com.google.common.base.j0.k(i10 >= 0, "k (%s) must be >= 0", i10);
        com.google.common.base.j0.k(i10 <= 1073741823, "k (%s) must be <= Integer.MAX_VALUE / 2", i10);
        this.f117302c = (T[]) new Object[com.google.common.math.f.d(i10, 2)];
        this.f117303d = 0;
        this.f117304e = null;
    }

    public static <T extends Comparable<? super T>> db<T> b(int k10) {
        return c(k10, a9.z());
    }

    public static <T> db<T> c(int k10, Comparator<? super T> comparator) {
        return new db<>(a9.i(comparator).E(), k10);
    }

    public static <T extends Comparable<? super T>> db<T> d(int k10) {
        return e(k10, a9.z());
    }

    public static <T> db<T> e(int k10, Comparator<? super T> comparator) {
        return new db<>(comparator, k10);
    }

    private int i(int i10, int i11, int i12) {
        Object objA = u8.a(this.f117302c[i12]);
        T[] tArr = this.f117302c;
        tArr[i12] = tArr[i11];
        int i13 = i10;
        while (i10 < i11) {
            if (this.f117301b.compare((Object) u8.a(this.f117302c[i10]), objA) < 0) {
                j(i13, i10);
                i13++;
            }
            i10++;
        }
        T[] tArr2 = this.f117302c;
        tArr2[i11] = tArr2[i13];
        tArr2[i13] = objA;
        return i13;
    }

    private void j(int i10, int j10) {
        T[] tArr = this.f117302c;
        T t10 = tArr[i10];
        tArr[i10] = tArr[j10];
        tArr[j10] = t10;
    }

    private void l() {
        int i10 = (this.f117300a * 2) - 1;
        int iP = com.google.common.math.f.p(i10, RoundingMode.CEILING) * 3;
        int iMax = 0;
        int i11 = 7 | 0;
        int i12 = 0;
        int i13 = 0;
        while (iMax < i10) {
            int i14 = i(iMax, i10, ((iMax + i10) + 1) >>> 1);
            int i15 = this.f117300a;
            if (i14 <= i15) {
                if (i14 >= i15) {
                    break;
                }
                iMax = Math.max(i14, iMax + 1);
                i13 = i14;
            } else {
                i10 = i14 - 1;
            }
            i12++;
            if (i12 >= iP) {
                Arrays.sort(this.f117302c, iMax, i10 + 1, this.f117301b);
                break;
            }
        }
        this.f117303d = this.f117300a;
        this.f117304e = (T) u8.a(this.f117302c[i13]);
        while (true) {
            i13++;
            if (i13 >= this.f117300a) {
                return;
            }
            if (this.f117301b.compare((Object) u8.a(this.f117302c[i13]), (Object) u8.a(this.f117304e)) > 0) {
                this.f117304e = this.f117302c[i13];
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    db<T> a(db<T> other) {
        for (int i10 = 0; i10 < other.f117303d; i10++) {
            f(u8.a(other.f117302c[i10]));
        }
        return this;
    }

    public void f(@b9 T t10) {
        int i10 = this.f117300a;
        if (i10 == 0) {
            return;
        }
        int i11 = this.f117303d;
        if (i11 == 0) {
            this.f117302c[0] = t10;
            this.f117304e = t10;
            this.f117303d = 1;
            return;
        }
        if (i11 < i10) {
            T[] tArr = this.f117302c;
            this.f117303d = i11 + 1;
            tArr[i11] = t10;
            if (this.f117301b.compare(t10, (Object) u8.a(this.f117304e)) > 0) {
                this.f117304e = t10;
                return;
            }
            return;
        }
        if (this.f117301b.compare(t10, (Object) u8.a(this.f117304e)) < 0) {
            T[] tArr2 = this.f117302c;
            int i12 = this.f117303d;
            int i13 = i12 + 1;
            this.f117303d = i13;
            tArr2[i12] = t10;
            if (i13 == this.f117300a * 2) {
                l();
            }
        }
    }

    public void g(Iterable<? extends T> elements) {
        h(elements.iterator());
    }

    public void h(Iterator<? extends T> elements) {
        while (elements.hasNext()) {
            f(elements.next());
        }
    }

    public List<T> k() {
        T[] tArr = this.f117302c;
        Arrays.sort(tArr, 0, this.f117303d, this.f117301b);
        int i10 = this.f117303d;
        int i11 = this.f117300a;
        if (i10 > i11) {
            T[] tArr2 = this.f117302c;
            Arrays.fill(tArr2, i11, tArr2.length, (Object) null);
            int i12 = this.f117300a;
            this.f117303d = i12;
            this.f117304e = this.f117302c[i12 - 1];
        }
        return Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(tArr, this.f117303d)));
    }
}
