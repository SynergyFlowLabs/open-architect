package org.locationtech.jts.geom.impl;

import java.io.Serializable;
import org.locationtech.jts.geom.e;
import org.locationtech.jts.geom.m;

/* JADX INFO: loaded from: classes14.dex */
public class a implements e, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f338127c = -915438501601840650L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f338128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private org.locationtech.jts.geom.a[] f338129b;

    public a(org.locationtech.jts.geom.a[] aVarArr) {
        this(aVarArr, 3);
    }

    @Override // org.locationtech.jts.geom.e
    public double I3(int i10) {
        return this.f338129b[i10].f338093b;
    }

    @Override // org.locationtech.jts.geom.e
    public m Ij(m mVar) {
        int i10 = 0;
        while (true) {
            org.locationtech.jts.geom.a[] aVarArr = this.f338129b;
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
            this.f338129b[i10].f338092a = d10;
        } else if (i11 == 1) {
            this.f338129b[i10].f338093b = d10;
        } else {
            if (i11 != 2) {
                throw new IllegalArgumentException("invalid ordinateIndex");
            }
            this.f338129b[i10].f338094c = d10;
        }
    }

    @Override // org.locationtech.jts.geom.e
    public double N5(int i10) {
        return this.f338129b[i10].f338092a;
    }

    @Override // org.locationtech.jts.geom.e
    public void Ob(int i10, org.locationtech.jts.geom.a aVar) {
        org.locationtech.jts.geom.a aVar2 = this.f338129b[i10];
        aVar.f338092a = aVar2.f338092a;
        aVar.f338093b = aVar2.f338093b;
        aVar.f338094c = aVar2.f338094c;
    }

    @Override // org.locationtech.jts.geom.e
    public int Rg() {
        return this.f338128a;
    }

    @Override // org.locationtech.jts.geom.e
    public org.locationtech.jts.geom.a[] Uf() {
        return this.f338129b;
    }

    @Override // org.locationtech.jts.geom.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a copy() {
        org.locationtech.jts.geom.a[] aVarArr = new org.locationtech.jts.geom.a[size()];
        int i10 = 0;
        while (true) {
            org.locationtech.jts.geom.a[] aVarArr2 = this.f338129b;
            if (i10 >= aVarArr2.length) {
                return new a(aVarArr, this.f338128a);
            }
            aVarArr[i10] = aVarArr2[i10].k();
            i10++;
        }
    }

    @Override // org.locationtech.jts.geom.e
    public Object clone() {
        return copy();
    }

    @Override // org.locationtech.jts.geom.e
    public org.locationtech.jts.geom.a gj(int i10) {
        return new org.locationtech.jts.geom.a(this.f338129b[i10]);
    }

    @Override // org.locationtech.jts.geom.e
    public double ij(int i10, int i11) {
        if (i11 == 0) {
            return this.f338129b[i10].f338092a;
        }
        if (i11 == 1) {
            return this.f338129b[i10].f338093b;
        }
        if (i11 != 2) {
            return Double.NaN;
        }
        return this.f338129b[i10].f338094c;
    }

    @Override // org.locationtech.jts.geom.e
    public int size() {
        return this.f338129b.length;
    }

    public String toString() {
        org.locationtech.jts.geom.a[] aVarArr = this.f338129b;
        if (aVarArr.length <= 0) {
            return "()";
        }
        StringBuilder sb2 = new StringBuilder(aVarArr.length * 17);
        sb2.append('(');
        sb2.append(this.f338129b[0]);
        for (int i10 = 1; i10 < this.f338129b.length; i10++) {
            sb2.append(", ");
            sb2.append(this.f338129b[i10]);
        }
        sb2.append(')');
        return sb2.toString();
    }

    @Override // org.locationtech.jts.geom.e
    public org.locationtech.jts.geom.a w4(int i10) {
        return this.f338129b[i10];
    }

    public a(org.locationtech.jts.geom.a[] aVarArr, int i10) {
        this.f338129b = aVarArr;
        this.f338128a = i10;
        if (aVarArr == null) {
            this.f338129b = new org.locationtech.jts.geom.a[0];
        }
    }

    public a(int i10) {
        this.f338128a = 3;
        this.f338129b = new org.locationtech.jts.geom.a[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f338129b[i11] = new org.locationtech.jts.geom.a();
        }
    }

    public a(int i10, int i11) {
        this.f338128a = 3;
        this.f338129b = new org.locationtech.jts.geom.a[i10];
        this.f338128a = i11;
        for (int i12 = 0; i12 < i10; i12++) {
            this.f338129b[i12] = new org.locationtech.jts.geom.a();
        }
    }

    public a(e eVar) {
        this.f338128a = 3;
        int i10 = 0;
        if (eVar == null) {
            this.f338129b = new org.locationtech.jts.geom.a[0];
            return;
        }
        this.f338128a = eVar.Rg();
        this.f338129b = new org.locationtech.jts.geom.a[eVar.size()];
        while (true) {
            org.locationtech.jts.geom.a[] aVarArr = this.f338129b;
            if (i10 >= aVarArr.length) {
                return;
            }
            aVarArr[i10] = eVar.gj(i10);
            i10++;
        }
    }
}
