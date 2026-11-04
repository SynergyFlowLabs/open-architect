package androidx.recyclerview.widget;

import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.annotation.k1;
import androidx.annotation.m1;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
public class e<T> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final String f74171s = "AsyncListUtil";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final boolean f74172t = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Class<T> f74173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f74174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final c<T> f74175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final d f74176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final j0<T> f74177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final i0.b<T> f74178f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final i0.a<T> f74179g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean f74183k;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final i0.b<T> f74189q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final i0.a<T> f74190r;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final int[] f74180h = new int[2];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final int[] f74181i = new int[2];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final int[] f74182j = new int[2];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f74184l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f74185m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f74186n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f74187o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final SparseIntArray f74188p = new SparseIntArray();

    class a implements i0.b<T> {
        a() {
        }

        private boolean d(int i10) {
            return i10 == e.this.f74187o;
        }

        private void e() {
            for (int i10 = 0; i10 < e.this.f74177e.f(); i10++) {
                e eVar = e.this;
                eVar.f74179g.d(eVar.f74177e.c(i10));
            }
            e.this.f74177e.b();
        }

        @Override // androidx.recyclerview.widget.i0.b
        public void a(int i10, int i11) {
            if (d(i10)) {
                e eVar = e.this;
                eVar.f74185m = i11;
                eVar.f74176d.c();
                e eVar2 = e.this;
                eVar2.f74186n = eVar2.f74187o;
                e();
                e eVar3 = e.this;
                eVar3.f74183k = false;
                eVar3.g();
            }
        }

        @Override // androidx.recyclerview.widget.i0.b
        public void b(int i10, int i11) {
            j0.a<T> aVarE;
            if (d(i10) && (aVarE = e.this.f74177e.e(i11)) != null) {
                e.this.f74179g.d(aVarE);
            }
        }

        @Override // androidx.recyclerview.widget.i0.b
        public void c(int i10, j0.a<T> aVar) {
            if (!d(i10)) {
                e.this.f74179g.d(aVar);
                return;
            }
            j0.a<T> aVarA = e.this.f74177e.a(aVar);
            if (aVarA != null) {
                e.this.f74179g.d(aVarA);
            }
            int i11 = aVar.f74329b + aVar.f74330c;
            int i12 = 0;
            while (i12 < e.this.f74188p.size()) {
                int iKeyAt = e.this.f74188p.keyAt(i12);
                if (aVar.f74329b > iKeyAt || iKeyAt >= i11) {
                    i12++;
                } else {
                    e.this.f74188p.removeAt(i12);
                    e.this.f74176d.d(iKeyAt);
                }
            }
        }
    }

    class b implements i0.a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private j0.a<T> f74192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final SparseBooleanArray f74193b = new SparseBooleanArray();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f74194c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f74195d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f74196e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f74197f;

        b() {
        }

        private j0.a<T> e() {
            j0.a<T> aVar = this.f74192a;
            if (aVar != null) {
                this.f74192a = aVar.f74331d;
                return aVar;
            }
            e eVar = e.this;
            return new j0.a<>(eVar.f74173a, eVar.f74174b);
        }

        private void f(j0.a<T> aVar) {
            this.f74193b.put(aVar.f74329b, true);
            e.this.f74178f.c(this.f74194c, aVar);
        }

        private void g(int i10) {
            int iB = e.this.f74175c.b();
            while (this.f74193b.size() >= iB) {
                int iKeyAt = this.f74193b.keyAt(0);
                SparseBooleanArray sparseBooleanArray = this.f74193b;
                int iKeyAt2 = sparseBooleanArray.keyAt(sparseBooleanArray.size() - 1);
                int i11 = this.f74196e - iKeyAt;
                int i12 = iKeyAt2 - this.f74197f;
                if (i11 > 0 && (i11 >= i12 || i10 == 2)) {
                    k(iKeyAt);
                } else {
                    if (i12 <= 0) {
                        return;
                    }
                    if (i11 >= i12 && i10 != 1) {
                        return;
                    } else {
                        k(iKeyAt2);
                    }
                }
            }
        }

        private int h(int i10) {
            return i10 - (i10 % e.this.f74174b);
        }

        private boolean i(int i10) {
            return this.f74193b.get(i10);
        }

        private void j(String str, Object... objArr) {
            String.format(str, objArr);
        }

        private void k(int i10) {
            this.f74193b.delete(i10);
            e.this.f74178f.b(this.f74194c, i10);
        }

        private void l(int i10, int i11, int i12, boolean z10) {
            int i13 = i10;
            while (i13 <= i11) {
                e.this.f74179g.b(z10 ? (i11 + i10) - i13 : i13, i12);
                i13 += e.this.f74174b;
            }
        }

        @Override // androidx.recyclerview.widget.i0.a
        public void a(int i10, int i11, int i12, int i13, int i14) {
            if (i10 > i11) {
                return;
            }
            int iH = h(i10);
            int iH2 = h(i11);
            this.f74196e = h(i12);
            int iH3 = h(i13);
            this.f74197f = iH3;
            if (i14 == 1) {
                l(this.f74196e, iH2, i14, true);
                l(iH2 + e.this.f74174b, this.f74197f, i14, false);
            } else {
                l(iH, iH3, i14, false);
                l(this.f74196e, iH - e.this.f74174b, i14, true);
            }
        }

        @Override // androidx.recyclerview.widget.i0.a
        public void b(int i10, int i11) {
            if (i(i10)) {
                return;
            }
            j0.a<T> aVarE = e();
            aVarE.f74329b = i10;
            int iMin = Math.min(e.this.f74174b, this.f74195d - i10);
            aVarE.f74330c = iMin;
            e.this.f74175c.a(aVarE.f74328a, aVarE.f74329b, iMin);
            g(i11);
            f(aVarE);
        }

        @Override // androidx.recyclerview.widget.i0.a
        public void c(int i10) {
            this.f74194c = i10;
            this.f74193b.clear();
            int iD = e.this.f74175c.d();
            this.f74195d = iD;
            e.this.f74178f.a(this.f74194c, iD);
        }

        @Override // androidx.recyclerview.widget.i0.a
        public void d(j0.a<T> aVar) {
            e.this.f74175c.c(aVar.f74328a, aVar.f74330c);
            aVar.f74331d = this.f74192a;
            this.f74192a = aVar;
        }
    }

    public static abstract class c<T> {
        @m1
        public abstract void a(@NonNull T[] tArr, int i10, int i11);

        @m1
        public int b() {
            return 10;
        }

        @m1
        public void c(@NonNull T[] tArr, int i10) {
        }

        @m1
        public abstract int d();
    }

    public static abstract class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f74199a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f74200b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f74201c = 2;

        @k1
        public void a(@NonNull int[] iArr, @NonNull int[] iArr2, int i10) {
            int i11 = iArr[1];
            int i12 = iArr[0];
            int i13 = (i11 - i12) + 1;
            int i14 = i13 / 2;
            iArr2[0] = i12 - (i10 == 1 ? i13 : i14);
            if (i10 != 2) {
                i13 = i14;
            }
            iArr2[1] = i11 + i13;
        }

        @k1
        public abstract void b(@NonNull int[] iArr);

        @k1
        public abstract void c();

        @k1
        public abstract void d(int i10);
    }

    public e(@NonNull Class<T> cls, int i10, @NonNull c<T> cVar, @NonNull d dVar) {
        a aVar = new a();
        this.f74189q = aVar;
        b bVar = new b();
        this.f74190r = bVar;
        this.f74173a = cls;
        this.f74174b = i10;
        this.f74175c = cVar;
        this.f74176d = dVar;
        this.f74177e = new j0<>(i10);
        w wVar = new w();
        this.f74178f = wVar.a(aVar);
        this.f74179g = wVar.b(bVar);
        f();
    }

    private boolean c() {
        return this.f74187o != this.f74186n;
    }

    @p0
    public T a(int i10) {
        if (i10 < 0 || i10 >= this.f74185m) {
            throw new IndexOutOfBoundsException(i10 + " is not within 0 and " + this.f74185m);
        }
        T tD = this.f74177e.d(i10);
        if (tD == null && !c()) {
            this.f74188p.put(i10, 0);
        }
        return tD;
    }

    public int b() {
        return this.f74185m;
    }

    void d(String str, Object... objArr) {
        String.format(str, objArr);
    }

    public void e() {
        if (c()) {
            return;
        }
        g();
        this.f74183k = true;
    }

    public void f() {
        this.f74188p.clear();
        i0.a<T> aVar = this.f74179g;
        int i10 = this.f74187o + 1;
        this.f74187o = i10;
        aVar.c(i10);
    }

    void g() {
        int i10;
        this.f74176d.b(this.f74180h);
        int[] iArr = this.f74180h;
        int i11 = iArr[0];
        int i12 = iArr[1];
        if (i11 <= i12 && i11 >= 0 && i12 < this.f74185m) {
            if (this.f74183k) {
                int[] iArr2 = this.f74181i;
                if (i11 > iArr2[1] || (i10 = iArr2[0]) > i12) {
                    this.f74184l = 0;
                } else if (i11 < i10) {
                    this.f74184l = 1;
                } else if (i11 > i10) {
                    this.f74184l = 2;
                }
            } else {
                this.f74184l = 0;
            }
            int[] iArr3 = this.f74181i;
            iArr3[0] = i11;
            iArr3[1] = i12;
            this.f74176d.a(iArr, this.f74182j, this.f74184l);
            int[] iArr4 = this.f74182j;
            iArr4[0] = Math.min(this.f74180h[0], Math.max(iArr4[0], 0));
            int[] iArr5 = this.f74182j;
            iArr5[1] = Math.max(this.f74180h[1], Math.min(iArr5[1], this.f74185m - 1));
            i0.a<T> aVar = this.f74179g;
            int[] iArr6 = this.f74180h;
            int i13 = iArr6[0];
            int i14 = iArr6[1];
            int[] iArr7 = this.f74182j;
            aVar.a(i13, i14, iArr7[0], iArr7[1], this.f74184l);
        }
    }
}
