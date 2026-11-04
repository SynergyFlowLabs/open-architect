package androidx.media3.extractor.text;

import android.util.SparseArray;
import androidx.media3.common.util.b1;
import androidx.media3.extractor.p0;
import androidx.media3.extractor.u0;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class t implements androidx.media3.extractor.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media3.extractor.t f68659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r.a f68660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray<v> f68661c = new SparseArray<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f68662d;

    public t(androidx.media3.extractor.t tVar, r.a aVar) {
        this.f68659a = tVar;
        this.f68660b = aVar;
    }

    @Override // androidx.media3.extractor.t
    public u0 a(int i10, int i11) {
        if (i11 != 3) {
            this.f68662d = true;
            return this.f68659a.a(i10, i11);
        }
        v vVar = this.f68661c.get(i10);
        if (vVar != null) {
            return vVar;
        }
        v vVar2 = new v(this.f68659a.a(i10, i11), this.f68660b);
        this.f68661c.put(i10, vVar2);
        return vVar2;
    }

    public void b() {
        for (int i10 = 0; i10 < this.f68661c.size(); i10++) {
            this.f68661c.valueAt(i10).k();
        }
    }

    @Override // androidx.media3.extractor.t
    public void l() {
        this.f68659a.l();
        if (this.f68662d) {
            for (int i10 = 0; i10 < this.f68661c.size(); i10++) {
                this.f68661c.valueAt(i10).l(true);
            }
        }
    }

    @Override // androidx.media3.extractor.t
    public void u(p0 p0Var) {
        this.f68659a.u(p0Var);
    }
}
