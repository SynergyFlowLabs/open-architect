package org.locationtech.jts.geom.util;

import org.locationtech.jts.geom.r;

/* JADX INFO: loaded from: classes14.dex */
public class q extends org.locationtech.jts.util.g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f338252f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected double f338253g;

    public q() {
        this.f338252f = 8;
        this.f338253g = 0.5d;
    }

    public org.locationtech.jts.geom.n s() {
        org.locationtech.jts.geom.m mVarC = this.f339140c.c();
        double d10 = 2.0d;
        double dN = mVarC.N() / 2.0d;
        double d11 = this.f338253g;
        if (d11 < 0.0d) {
            d11 = 0.0d;
        }
        double d12 = 1.0d;
        if (d11 > 1.0d) {
            d11 = 1.0d;
        }
        double d13 = d11 * dN;
        double d14 = (1.0d - d11) * dN;
        double dL = mVarC.L() + dN;
        double dM = mVarC.M() + dN;
        org.locationtech.jts.geom.a[] aVarArr = new org.locationtech.jts.geom.a[this.f339141d + 1];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = this.f339141d;
            if (i10 >= i12) {
                aVarArr[i11] = new org.locationtech.jts.geom.a(aVarArr[0]);
                return this.f339138a.A(this.f339138a.k(aVarArr));
            }
            double d15 = d10;
            double d16 = i10;
            double d17 = d12;
            double d18 = (d16 / ((double) i12)) * ((double) this.f338252f);
            double dCos = (((Math.cos((d18 - Math.floor(d18)) * 6.283185307179586d) + d17) / d15) * d13) + d14;
            double d19 = d16 * (6.283185307179586d / ((double) this.f339141d));
            aVarArr[i11] = a((Math.cos(d19) * dCos) + dL, (dCos * Math.sin(d19)) + dM);
            i10++;
            i11++;
            d10 = d15;
            d12 = d17;
        }
    }

    public void t(double d10) {
        this.f338253g = d10;
    }

    public void u(int i10) {
        this.f338252f = i10;
    }

    public q(r rVar) {
        super(rVar);
        this.f338252f = 8;
        this.f338253g = 0.5d;
    }
}
