package org.locationtech.jts.geom;

import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
class j implements e, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f338144b = -915438501601840650L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a[] f338145a;

    public j(a[] aVarArr) {
        if (n.s0(aVarArr)) {
            throw new IllegalArgumentException("Null coordinate");
        }
        this.f338145a = aVarArr;
    }

    @Override // org.locationtech.jts.geom.e
    public double I3(int i10) {
        return this.f338145a[i10].f338093b;
    }

    @Override // org.locationtech.jts.geom.e
    public m Ij(m mVar) {
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f338145a;
            if (i10 >= aVarArr.length) {
                return mVar;
            }
            mVar.x(aVarArr[i10]);
            i10++;
        }
    }

    @Override // org.locationtech.jts.geom.e
    public void Ld(int i10, int i11, double d10) {
        if (i11 == 0) {
            this.f338145a[i10].f338092a = d10;
        } else if (i11 == 1) {
            this.f338145a[i10].f338093b = d10;
        } else {
            if (i11 != 2) {
                return;
            }
            this.f338145a[i10].f338094c = d10;
        }
    }

    @Override // org.locationtech.jts.geom.e
    public double N5(int i10) {
        return this.f338145a[i10].f338092a;
    }

    @Override // org.locationtech.jts.geom.e
    public void Ob(int i10, a aVar) {
        a aVar2 = this.f338145a[i10];
        aVar.f338092a = aVar2.f338092a;
        aVar.f338093b = aVar2.f338093b;
    }

    @Override // org.locationtech.jts.geom.e
    public int Rg() {
        return 3;
    }

    @Override // org.locationtech.jts.geom.e
    public a[] Uf() {
        return this.f338145a;
    }

    @Override // org.locationtech.jts.geom.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public j copy() {
        a[] aVarArr = new a[size()];
        int i10 = 0;
        while (true) {
            a[] aVarArr2 = this.f338145a;
            if (i10 >= aVarArr2.length) {
                return new j(aVarArr);
            }
            aVarArr[i10] = (a) aVarArr2[i10].clone();
            i10++;
        }
    }

    @Override // org.locationtech.jts.geom.e
    public Object clone() {
        return copy();
    }

    @Override // org.locationtech.jts.geom.e
    public a gj(int i10) {
        return new a(this.f338145a[i10]);
    }

    @Override // org.locationtech.jts.geom.e
    public double ij(int i10, int i11) {
        if (i11 == 0) {
            return this.f338145a[i10].f338092a;
        }
        if (i11 == 1) {
            return this.f338145a[i10].f338093b;
        }
        if (i11 != 2) {
            return Double.NaN;
        }
        return this.f338145a[i10].f338094c;
    }

    @Override // org.locationtech.jts.geom.e
    public int size() {
        return this.f338145a.length;
    }

    public String toString() {
        a[] aVarArr = this.f338145a;
        if (aVarArr.length <= 0) {
            return "()";
        }
        StringBuilder sb2 = new StringBuilder(aVarArr.length * 17);
        sb2.append('(');
        sb2.append(this.f338145a[0]);
        for (int i10 = 1; i10 < this.f338145a.length; i10++) {
            sb2.append(", ");
            sb2.append(this.f338145a[i10]);
        }
        sb2.append(')');
        return sb2.toString();
    }

    @Override // org.locationtech.jts.geom.e
    public a w4(int i10) {
        return this.f338145a[i10];
    }

    public j(e eVar) {
        this.f338145a = new a[eVar.size()];
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f338145a;
            if (i10 >= aVarArr.length) {
                return;
            }
            aVarArr[i10] = eVar.gj(i10);
            i10++;
        }
    }

    public j(int i10) {
        this.f338145a = new a[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f338145a[i11] = new a();
        }
    }
}
