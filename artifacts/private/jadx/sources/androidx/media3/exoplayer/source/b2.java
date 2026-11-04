package androidx.media3.exoplayer.source;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes3.dex */
final class b2<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f64835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray<V> f64836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.media3.common.util.o<V> f64837c;

    public b2() {
        this(new androidx.media3.common.util.o() { // from class: androidx.media3.exoplayer.source.a2
            @Override // androidx.media3.common.util.o
            public final void accept(Object obj) {
                b2.a(obj);
            }
        });
    }

    public static /* synthetic */ void a(Object obj) {
    }

    public void b(int i10, V v10) {
        if (this.f64835a == -1) {
            androidx.media3.common.util.a.i(this.f64836b.size() == 0);
            this.f64835a = 0;
        }
        if (this.f64836b.size() > 0) {
            SparseArray<V> sparseArray = this.f64836b;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            androidx.media3.common.util.a.a(i10 >= iKeyAt);
            if (iKeyAt == i10) {
                androidx.media3.common.util.o<V> oVar = this.f64837c;
                SparseArray<V> sparseArray2 = this.f64836b;
                oVar.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f64836b.append(i10, v10);
    }

    public void c() {
        for (int i10 = 0; i10 < this.f64836b.size(); i10++) {
            this.f64837c.accept(this.f64836b.valueAt(i10));
        }
        this.f64835a = -1;
        this.f64836b.clear();
    }

    public void d(int i10) {
        for (int size = this.f64836b.size() - 1; size >= 0 && i10 < this.f64836b.keyAt(size); size--) {
            this.f64837c.accept(this.f64836b.valueAt(size));
            this.f64836b.removeAt(size);
        }
        this.f64835a = this.f64836b.size() > 0 ? Math.min(this.f64835a, this.f64836b.size() - 1) : -1;
    }

    public void e(int i10) {
        int i11 = 0;
        while (i11 < this.f64836b.size() - 1) {
            int i12 = i11 + 1;
            if (i10 < this.f64836b.keyAt(i12)) {
                break;
            }
            this.f64837c.accept(this.f64836b.valueAt(i11));
            this.f64836b.removeAt(i11);
            int i13 = this.f64835a;
            if (i13 > 0) {
                this.f64835a = i13 - 1;
            }
            i11 = i12;
        }
    }

    public V f(int i10) {
        if (this.f64835a == -1) {
            this.f64835a = 0;
        }
        while (true) {
            int i11 = this.f64835a;
            if (i11 <= 0 || i10 >= this.f64836b.keyAt(i11)) {
                break;
            }
            this.f64835a--;
        }
        while (this.f64835a < this.f64836b.size() - 1 && i10 >= this.f64836b.keyAt(this.f64835a + 1)) {
            this.f64835a++;
        }
        return this.f64836b.valueAt(this.f64835a);
    }

    public V g() {
        SparseArray<V> sparseArray = this.f64836b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public boolean h() {
        return this.f64836b.size() == 0;
    }

    public b2(androidx.media3.common.util.o<V> oVar) {
        this.f64836b = new SparseArray<>();
        this.f64837c = oVar;
        this.f64835a = -1;
    }
}
