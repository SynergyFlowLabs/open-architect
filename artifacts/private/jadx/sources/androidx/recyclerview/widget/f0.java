package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public class f0<T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f74218j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f74219k = 10;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f74220l = 10;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f74221m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f74222n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f74223o = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    T[] f74224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private T[] f74225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f74226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f74227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f74228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f74229f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f74230g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f74231h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Class<T> f74232i;

    public static class a<T2> extends b<T2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final b<T2> f74233a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final f f74234b;

        @e.a({"UnknownNullness"})
        public a(b<T2> bVar) {
            this.f74233a = bVar;
            this.f74234b = new f(bVar);
        }

        @Override // androidx.recyclerview.widget.f0.b, androidx.recyclerview.widget.v
        @e.a({"UnknownNullness"})
        public void a(int i10, int i11, Object obj) {
            this.f74234b.a(i10, i11, obj);
        }

        @Override // androidx.recyclerview.widget.v
        public void b(int i10, int i11) {
            this.f74234b.b(i10, i11);
        }

        @Override // androidx.recyclerview.widget.v
        public void c(int i10, int i11) {
            this.f74234b.c(i10, i11);
        }

        @Override // androidx.recyclerview.widget.f0.b, java.util.Comparator
        public int compare(T2 t10, T2 t11) {
            return this.f74233a.compare(t10, t11);
        }

        @Override // androidx.recyclerview.widget.v
        public void d(int i10, int i11) {
            this.f74234b.d(i10, i11);
        }

        @Override // androidx.recyclerview.widget.f0.b
        public boolean e(T2 t10, T2 t11) {
            return this.f74233a.e(t10, t11);
        }

        @Override // androidx.recyclerview.widget.f0.b
        public boolean f(T2 t10, T2 t11) {
            return this.f74233a.f(t10, t11);
        }

        @Override // androidx.recyclerview.widget.f0.b
        @p0
        public Object g(T2 t10, T2 t11) {
            return this.f74233a.g(t10, t11);
        }

        @Override // androidx.recyclerview.widget.f0.b
        public void h(int i10, int i11) {
            this.f74234b.a(i10, i11, null);
        }

        public void i() {
            this.f74234b.e();
        }
    }

    public static abstract class b<T2> implements Comparator<T2>, v {
        @e.a({"UnknownNullness"})
        public void a(int i10, int i11, Object obj) {
            h(i10, i11);
        }

        @Override // java.util.Comparator
        public abstract int compare(T2 t10, T2 t11);

        public abstract boolean e(T2 t10, T2 t11);

        public abstract boolean f(T2 t10, T2 t11);

        @p0
        public Object g(T2 t10, T2 t11) {
            return null;
        }

        public abstract void h(int i10, int i11);
    }

    public f0(@NonNull Class<T> cls, @NonNull b<T> bVar) {
        this(cls, bVar, 10);
    }

    private void A(@NonNull T[] tArr) {
        boolean z10 = this.f74229f instanceof a;
        if (!z10) {
            h();
        }
        this.f74226c = 0;
        this.f74227d = this.f74231h;
        this.f74225b = this.f74224a;
        this.f74228e = 0;
        int iD = D(tArr);
        this.f74224a = (T[]) ((Object[]) Array.newInstance((Class<?>) this.f74232i, iD));
        while (true) {
            int i10 = this.f74228e;
            if (i10 >= iD && this.f74226c >= this.f74227d) {
                break;
            }
            int i11 = this.f74226c;
            int i12 = this.f74227d;
            if (i11 >= i12) {
                int i13 = iD - i10;
                System.arraycopy(tArr, i10, this.f74224a, i10, i13);
                this.f74228e += i13;
                this.f74231h += i13;
                this.f74229f.b(i10, i13);
                break;
            }
            if (i10 >= iD) {
                int i14 = i12 - i11;
                this.f74231h -= i14;
                this.f74229f.c(i10, i14);
                break;
            }
            T t10 = this.f74225b[i11];
            T t11 = tArr[i10];
            int iCompare = this.f74229f.compare(t10, t11);
            if (iCompare < 0) {
                B();
            } else if (iCompare > 0) {
                z(t11);
            } else if (this.f74229f.f(t10, t11)) {
                T[] tArr2 = this.f74224a;
                int i15 = this.f74228e;
                tArr2[i15] = t11;
                this.f74226c++;
                this.f74228e = i15 + 1;
                if (!this.f74229f.e(t10, t11)) {
                    b bVar = this.f74229f;
                    bVar.a(this.f74228e - 1, 1, bVar.g(t10, t11));
                }
            } else {
                B();
                z(t11);
            }
        }
        this.f74225b = null;
        if (z10) {
            return;
        }
        k();
    }

    private void B() {
        this.f74231h--;
        this.f74226c++;
        this.f74229f.c(this.f74228e, 1);
    }

    private int D(@NonNull T[] tArr) {
        if (tArr.length == 0) {
            return 0;
        }
        Arrays.sort(tArr, this.f74229f);
        int i10 = 0;
        int i11 = 1;
        for (int i12 = 1; i12 < tArr.length; i12++) {
            T t10 = tArr[i12];
            if (this.f74229f.compare(tArr[i10], t10) == 0) {
                int iM = m(t10, tArr, i10, i11);
                if (iM != -1) {
                    tArr[iM] = t10;
                } else {
                    if (i11 != i12) {
                        tArr[i11] = t10;
                    }
                    i11++;
                }
            } else {
                if (i11 != i12) {
                    tArr[i11] = t10;
                }
                i10 = i11;
                i11++;
            }
        }
        return i11;
    }

    private void E() {
        if (this.f74225b != null) {
            throw new IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
        }
    }

    private int b(T t10, boolean z10) {
        int iL = l(t10, this.f74224a, 0, this.f74231h, 1);
        if (iL == -1) {
            iL = 0;
        } else if (iL < this.f74231h) {
            T t11 = this.f74224a[iL];
            if (this.f74229f.f(t11, t10)) {
                if (this.f74229f.e(t11, t10)) {
                    this.f74224a[iL] = t10;
                    return iL;
                }
                this.f74224a[iL] = t10;
                b bVar = this.f74229f;
                bVar.a(iL, 1, bVar.g(t11, t10));
                return iL;
            }
        }
        g(iL, t10);
        if (z10) {
            this.f74229f.b(iL, 1);
        }
        return iL;
    }

    private void f(T[] tArr) {
        if (tArr.length < 1) {
            return;
        }
        int iD = D(tArr);
        if (this.f74231h != 0) {
            q(tArr, iD);
            return;
        }
        this.f74224a = tArr;
        this.f74231h = iD;
        int i10 = 7 ^ 0;
        this.f74229f.b(0, iD);
    }

    private void g(int i10, T t10) {
        int i11 = this.f74231h;
        if (i10 > i11) {
            throw new IndexOutOfBoundsException("cannot add item to " + i10 + " because size is " + this.f74231h);
        }
        T[] tArr = this.f74224a;
        if (i11 == tArr.length) {
            T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.f74232i, tArr.length + 10));
            System.arraycopy(this.f74224a, 0, tArr2, 0, i10);
            tArr2[i10] = t10;
            System.arraycopy(this.f74224a, i10, tArr2, i10 + 1, this.f74231h - i10);
            this.f74224a = tArr2;
        } else {
            System.arraycopy(tArr, i10, tArr, i10 + 1, i11 - i10);
            this.f74224a[i10] = t10;
        }
        this.f74231h++;
    }

    private T[] j(T[] tArr) {
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.f74232i, tArr.length));
        System.arraycopy(tArr, 0, tArr2, 0, tArr.length);
        return tArr2;
    }

    private int l(T t10, T[] tArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            int i13 = (i10 + i11) / 2;
            T t11 = tArr[i13];
            int iCompare = this.f74229f.compare(t11, t10);
            if (iCompare < 0) {
                i10 = i13 + 1;
            } else {
                if (iCompare == 0) {
                    if (!this.f74229f.f(t11, t10)) {
                        int iP = p(t10, i13, i10, i11);
                        if (i12 != 1 || iP != -1) {
                            return iP;
                        }
                    }
                    return i13;
                }
                i11 = i13;
            }
        }
        if (i12 == 1) {
            return i10;
        }
        return -1;
    }

    private int m(T t10, T[] tArr, int i10, int i11) {
        while (i10 < i11) {
            if (this.f74229f.f(tArr[i10], t10)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    private int p(T t10, int i10, int i11, int i12) {
        T t11;
        for (int i13 = i10 - 1; i13 >= i11; i13--) {
            T t12 = this.f74224a[i13];
            if (this.f74229f.compare(t12, t10) != 0) {
                break;
            }
            if (this.f74229f.f(t12, t10)) {
                return i13;
            }
        }
        do {
            i10++;
            if (i10 < i12) {
                t11 = this.f74224a[i10];
                if (this.f74229f.compare(t11, t10) != 0) {
                }
            }
            return -1;
        } while (!this.f74229f.f(t11, t10));
        return i10;
    }

    private void q(T[] tArr, int i10) {
        boolean z10 = this.f74229f instanceof a;
        if (!z10) {
            h();
        }
        this.f74225b = this.f74224a;
        int i11 = 0;
        this.f74226c = 0;
        int i12 = this.f74231h;
        this.f74227d = i12;
        this.f74224a = (T[]) ((Object[]) Array.newInstance((Class<?>) this.f74232i, i12 + i10 + 10));
        this.f74228e = 0;
        while (true) {
            int i13 = this.f74226c;
            int i14 = this.f74227d;
            if (i13 >= i14 && i11 >= i10) {
                break;
            }
            if (i13 == i14) {
                int i15 = i10 - i11;
                System.arraycopy(tArr, i11, this.f74224a, this.f74228e, i15);
                int i16 = this.f74228e + i15;
                this.f74228e = i16;
                this.f74231h += i15;
                this.f74229f.b(i16 - i15, i15);
                break;
            }
            if (i11 == i10) {
                int i17 = i14 - i13;
                System.arraycopy(this.f74225b, i13, this.f74224a, this.f74228e, i17);
                this.f74228e += i17;
                break;
            }
            T t10 = this.f74225b[i13];
            T t11 = tArr[i11];
            int iCompare = this.f74229f.compare(t10, t11);
            if (iCompare > 0) {
                T[] tArr2 = this.f74224a;
                int i18 = this.f74228e;
                this.f74228e = i18 + 1;
                tArr2[i18] = t11;
                this.f74231h++;
                i11++;
                this.f74229f.b(i18, 1);
            } else if (iCompare == 0 && this.f74229f.f(t10, t11)) {
                T[] tArr3 = this.f74224a;
                int i19 = this.f74228e;
                this.f74228e = i19 + 1;
                tArr3[i19] = t11;
                i11++;
                this.f74226c++;
                if (!this.f74229f.e(t10, t11)) {
                    b bVar = this.f74229f;
                    bVar.a(this.f74228e - 1, 1, bVar.g(t10, t11));
                }
            } else {
                T[] tArr4 = this.f74224a;
                int i20 = this.f74228e;
                this.f74228e = i20 + 1;
                tArr4[i20] = t10;
                this.f74226c++;
            }
        }
        this.f74225b = null;
        if (z10) {
            return;
        }
        k();
    }

    private boolean t(T t10, boolean z10) {
        int iL = l(t10, this.f74224a, 0, this.f74231h, 2);
        if (iL == -1) {
            return false;
        }
        v(iL, z10);
        return true;
    }

    private void v(int i10, boolean z10) {
        T[] tArr = this.f74224a;
        System.arraycopy(tArr, i10 + 1, tArr, i10, (this.f74231h - i10) - 1);
        int i11 = this.f74231h - 1;
        this.f74231h = i11;
        int i12 = 3 >> 0;
        this.f74224a[i11] = null;
        if (z10) {
            this.f74229f.c(i10, 1);
        }
    }

    private void z(T t10) {
        T[] tArr = this.f74224a;
        int i10 = this.f74228e;
        tArr[i10] = t10;
        this.f74228e = i10 + 1;
        this.f74231h++;
        this.f74229f.b(i10, 1);
    }

    public int C() {
        return this.f74231h;
    }

    public void F(int i10, T t10) {
        E();
        T tN = n(i10);
        boolean z10 = tN == t10 || !this.f74229f.e(tN, t10);
        if (tN == t10 || this.f74229f.compare(tN, t10) != 0) {
            if (z10) {
                b bVar = this.f74229f;
                bVar.a(i10, 1, bVar.g(tN, t10));
            }
            v(i10, false);
            int iB = b(t10, false);
            if (i10 != iB) {
                this.f74229f.d(i10, iB);
            }
        } else {
            this.f74224a[i10] = t10;
            if (z10) {
                b bVar2 = this.f74229f;
                bVar2.a(i10, 1, bVar2.g(tN, t10));
            }
        }
    }

    public int a(T t10) {
        E();
        return b(t10, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void c(@NonNull Collection<T> collection) {
        e(collection.toArray((Object[]) Array.newInstance((Class<?>) this.f74232i, collection.size())), true);
    }

    public void d(@NonNull T... tArr) {
        e(tArr, false);
    }

    public void e(@NonNull T[] tArr, boolean z10) {
        E();
        if (tArr.length == 0) {
            return;
        }
        if (z10) {
            f(tArr);
        } else {
            f(j(tArr));
        }
    }

    public void h() {
        E();
        b bVar = this.f74229f;
        if (bVar instanceof a) {
            return;
        }
        if (this.f74230g == null) {
            this.f74230g = new a(bVar);
        }
        this.f74229f = this.f74230g;
    }

    public void i() {
        E();
        int i10 = this.f74231h;
        if (i10 == 0) {
            return;
        }
        Arrays.fill(this.f74224a, 0, i10, (Object) null);
        this.f74231h = 0;
        this.f74229f.c(0, i10);
    }

    public void k() {
        E();
        b bVar = this.f74229f;
        if (bVar instanceof a) {
            ((a) bVar).i();
        }
        b bVar2 = this.f74229f;
        a aVar = this.f74230g;
        if (bVar2 == aVar) {
            this.f74229f = aVar.f74233a;
        }
    }

    public T n(int i10) throws IndexOutOfBoundsException {
        int i11;
        if (i10 < this.f74231h && i10 >= 0) {
            T[] tArr = this.f74225b;
            return (tArr == null || i10 < (i11 = this.f74228e)) ? this.f74224a[i10] : tArr[(i10 - i11) + this.f74226c];
        }
        throw new IndexOutOfBoundsException("Asked to get item at " + i10 + " but size is " + this.f74231h);
    }

    public int o(T t10) {
        if (this.f74225b == null) {
            int i10 = 1 >> 0;
            return l(t10, this.f74224a, 0, this.f74231h, 4);
        }
        int iL = l(t10, this.f74224a, 0, this.f74228e, 4);
        if (iL != -1) {
            return iL;
        }
        int iL2 = l(t10, this.f74225b, this.f74226c, this.f74227d, 4);
        if (iL2 != -1) {
            return (iL2 - this.f74226c) + this.f74228e;
        }
        return -1;
    }

    public void r(int i10) {
        E();
        T tN = n(i10);
        v(i10, false);
        int iB = b(tN, false);
        if (i10 != iB) {
            this.f74229f.d(i10, iB);
        }
    }

    public boolean s(T t10) {
        E();
        return t(t10, true);
    }

    public T u(int i10) {
        E();
        T tN = n(i10);
        v(i10, true);
        return tN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void w(@NonNull Collection<T> collection) {
        y(collection.toArray((Object[]) Array.newInstance((Class<?>) this.f74232i, collection.size())), true);
    }

    public void x(@NonNull T... tArr) {
        y(tArr, false);
    }

    public void y(@NonNull T[] tArr, boolean z10) {
        E();
        if (z10) {
            A(tArr);
        } else {
            A(j(tArr));
        }
    }

    public f0(@NonNull Class<T> cls, @NonNull b<T> bVar, int i10) {
        this.f74232i = cls;
        this.f74224a = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i10));
        this.f74229f = bVar;
        this.f74231h = 0;
    }
}
