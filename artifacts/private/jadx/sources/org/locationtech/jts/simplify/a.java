package org.locationtech.jts.simplify;

import org.locationtech.jts.geom.u;

/* JADX INFO: loaded from: classes14.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.locationtech.jts.geom.a[] f339001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean[] f339002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f339003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private u f339004d = new u();

    public a(org.locationtech.jts.geom.a[] aVarArr) {
        this.f339001a = aVarArr;
    }

    public static org.locationtech.jts.geom.a[] c(org.locationtech.jts.geom.a[] aVarArr, double d10) {
        a aVar = new a(aVarArr);
        aVar.a(d10);
        return aVar.b();
    }

    private void d(int i10, int i11) {
        int i12 = i10 + 1;
        if (i12 == i11) {
            return;
        }
        u uVar = this.f339004d;
        org.locationtech.jts.geom.a[] aVarArr = this.f339001a;
        uVar.f338211a = aVarArr[i10];
        uVar.f338212b = aVarArr[i11];
        double d10 = -1.0d;
        int i13 = i10;
        for (int i14 = i12; i14 < i11; i14++) {
            double dO = this.f339004d.o(this.f339001a[i14]);
            if (dO > d10) {
                i13 = i14;
                d10 = dO;
            }
        }
        if (d10 > this.f339003c) {
            d(i10, i13);
            d(i13, i11);
        } else {
            while (i12 < i11) {
                this.f339002b[i12] = false;
                i12++;
            }
        }
    }

    public void a(double d10) {
        this.f339003c = d10;
    }

    public org.locationtech.jts.geom.a[] b() {
        org.locationtech.jts.geom.a[] aVarArr;
        this.f339002b = new boolean[this.f339001a.length];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            aVarArr = this.f339001a;
            if (i11 >= aVarArr.length) {
                break;
            }
            this.f339002b[i11] = true;
            i11++;
        }
        d(0, aVarArr.length - 1);
        org.locationtech.jts.geom.d dVar = new org.locationtech.jts.geom.d();
        while (true) {
            org.locationtech.jts.geom.a[] aVarArr2 = this.f339001a;
            if (i10 >= aVarArr2.length) {
                return dVar.Uf();
            }
            if (this.f339002b[i10]) {
                dVar.d(new org.locationtech.jts.geom.a(aVarArr2[i10]));
            }
            i10++;
        }
    }
}
