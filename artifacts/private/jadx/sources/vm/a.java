package vm;

import org.locationtech.jts.geom.e;
import org.locationtech.jts.geom.m;

/* JADX INFO: loaded from: classes14.dex */
public class a implements e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f385769c = {0, 1};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f385770d = {0, 2};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f385771e = {1, 2};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f385772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f385773b;

    private a(e eVar, int[] iArr) {
        this.f385772a = eVar;
        this.f385773b = iArr;
    }

    public static e c(e eVar) {
        return new a(eVar, f385769c);
    }

    public static e d(e eVar) {
        return new a(eVar, f385770d);
    }

    public static e e(e eVar) {
        return new a(eVar, f385771e);
    }

    @Override // org.locationtech.jts.geom.e
    public double I3(int i10) {
        return ij(i10, 1);
    }

    @Override // org.locationtech.jts.geom.e
    public m Ij(m mVar) {
        throw new UnsupportedOperationException();
    }

    @Override // org.locationtech.jts.geom.e
    public void Ld(int i10, int i11, double d10) {
        throw new UnsupportedOperationException();
    }

    @Override // org.locationtech.jts.geom.e
    public double N5(int i10) {
        return ij(i10, 0);
    }

    @Override // org.locationtech.jts.geom.e
    public void Ob(int i10, org.locationtech.jts.geom.a aVar) {
        aVar.f338092a = ij(i10, 0);
        aVar.f338093b = ij(i10, 1);
        aVar.f338094c = ij(i10, 2);
    }

    @Override // org.locationtech.jts.geom.e
    public int Rg() {
        return 2;
    }

    @Override // org.locationtech.jts.geom.e
    public org.locationtech.jts.geom.a[] Uf() {
        throw new UnsupportedOperationException();
    }

    @Override // org.locationtech.jts.geom.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a copy() {
        throw new UnsupportedOperationException();
    }

    public double b(int i10) {
        return ij(i10, 2);
    }

    @Override // org.locationtech.jts.geom.e
    public Object clone() {
        throw new UnsupportedOperationException();
    }

    @Override // org.locationtech.jts.geom.e
    public org.locationtech.jts.geom.a gj(int i10) {
        return new org.locationtech.jts.geom.a(N5(i10), I3(i10), b(i10));
    }

    @Override // org.locationtech.jts.geom.e
    public double ij(int i10, int i11) {
        if (i11 > 1) {
            return 0.0d;
        }
        return this.f385772a.ij(i10, this.f385773b[i11]);
    }

    @Override // org.locationtech.jts.geom.e
    public int size() {
        return this.f385772a.size();
    }

    @Override // org.locationtech.jts.geom.e
    public org.locationtech.jts.geom.a w4(int i10) {
        return gj(i10);
    }
}
