package org.locationtech.jts.geom.impl;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.ref.SoftReference;
import java.util.Arrays;
import org.locationtech.jts.geom.e;
import org.locationtech.jts.geom.i;
import org.locationtech.jts.geom.m;

/* JADX INFO: loaded from: classes14.dex */
public abstract class c implements e, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f338132c = -3151899011275603L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f338133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected transient SoftReference f338134b;

    private org.locationtech.jts.geom.a[] b() {
        SoftReference softReference = this.f338134b;
        if (softReference != null) {
            org.locationtech.jts.geom.a[] aVarArr = (org.locationtech.jts.geom.a[]) softReference.get();
            if (aVarArr != null) {
                return aVarArr;
            }
            this.f338134b = null;
        }
        return null;
    }

    @Override // org.locationtech.jts.geom.e
    public double I3(int i10) {
        return ij(i10, 1);
    }

    @Override // org.locationtech.jts.geom.e
    public abstract void Ld(int i10, int i11, double d10);

    @Override // org.locationtech.jts.geom.e
    public double N5(int i10) {
        return ij(i10, 0);
    }

    @Override // org.locationtech.jts.geom.e
    public void Ob(int i10, org.locationtech.jts.geom.a aVar) {
        aVar.f338092a = ij(i10, 0);
        aVar.f338093b = ij(i10, 1);
        int i11 = 6 & 2;
        if (this.f338133a > 2) {
            aVar.f338094c = ij(i10, 2);
        }
    }

    @Override // org.locationtech.jts.geom.e
    public int Rg() {
        return this.f338133a;
    }

    @Override // org.locationtech.jts.geom.e
    public org.locationtech.jts.geom.a[] Uf() {
        org.locationtech.jts.geom.a[] aVarArrB = b();
        if (aVarArrB != null) {
            return aVarArrB;
        }
        int size = size();
        org.locationtech.jts.geom.a[] aVarArr = new org.locationtech.jts.geom.a[size];
        for (int i10 = 0; i10 < size; i10++) {
            aVarArr[i10] = c(i10);
        }
        this.f338134b = new SoftReference(aVarArr);
        return aVarArr;
    }

    @Override // org.locationtech.jts.geom.e
    /* JADX INFO: renamed from: a */
    public abstract c copy();

    protected abstract org.locationtech.jts.geom.a c(int i10);

    @Override // org.locationtech.jts.geom.e
    public abstract Object clone();

    public void d(int i10, double d10) {
        this.f338134b = null;
        Ld(i10, 0, d10);
    }

    public void e(int i10, double d10) {
        this.f338134b = null;
        Ld(i10, 1, d10);
    }

    @Override // org.locationtech.jts.geom.e
    public org.locationtech.jts.geom.a gj(int i10) {
        return c(i10);
    }

    @Override // org.locationtech.jts.geom.e
    public abstract double ij(int i10, int i11);

    protected Object readResolve() throws ObjectStreamException {
        this.f338134b = null;
        return this;
    }

    public String toString() {
        return i.j(this);
    }

    @Override // org.locationtech.jts.geom.e
    public org.locationtech.jts.geom.a w4(int i10) {
        org.locationtech.jts.geom.a[] aVarArrB = b();
        return aVarArrB != null ? aVarArrB[i10] : c(i10);
    }

    public static class a extends c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        double[] f338135d;

        public a(double[] dArr, int i10) {
            if (i10 < 2) {
                throw new IllegalArgumentException("Must have at least 2 dimensions");
            }
            if (dArr.length % i10 != 0) {
                throw new IllegalArgumentException("Packed array does not contain an integral number of coordinates");
            }
            this.f338133a = i10;
            this.f338135d = dArr;
        }

        @Override // org.locationtech.jts.geom.e
        public m Ij(m mVar) {
            int i10 = 0;
            while (true) {
                double[] dArr = this.f338135d;
                if (i10 >= dArr.length) {
                    return mVar;
                }
                mVar.w(dArr[i10], dArr[i10 + 1]);
                i10 += this.f338133a;
            }
        }

        @Override // org.locationtech.jts.geom.impl.c, org.locationtech.jts.geom.e
        public void Ld(int i10, int i11, double d10) {
            this.f338134b = null;
            this.f338135d[(i10 * this.f338133a) + i11] = d10;
        }

        @Override // org.locationtech.jts.geom.impl.c
        public org.locationtech.jts.geom.a c(int i10) {
            double[] dArr = this.f338135d;
            int i11 = this.f338133a;
            return new org.locationtech.jts.geom.a(dArr[i10 * i11], dArr[(i10 * i11) + 1], i11 == 2 ? Double.NaN : dArr[(i10 * i11) + 2]);
        }

        @Override // org.locationtech.jts.geom.impl.c, org.locationtech.jts.geom.e
        public Object clone() {
            return a();
        }

        @Override // org.locationtech.jts.geom.impl.c, org.locationtech.jts.geom.e
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public a copy() {
            double[] dArr = this.f338135d;
            return new a(Arrays.copyOf(dArr, dArr.length), this.f338133a);
        }

        public double[] g() {
            return this.f338135d;
        }

        @Override // org.locationtech.jts.geom.impl.c, org.locationtech.jts.geom.e
        public double ij(int i10, int i11) {
            return this.f338135d[(i10 * this.f338133a) + i11];
        }

        @Override // org.locationtech.jts.geom.e
        public int size() {
            return this.f338135d.length / this.f338133a;
        }

        public a(float[] fArr, int i10) {
            this.f338135d = new double[fArr.length];
            this.f338133a = i10;
            for (int i11 = 0; i11 < fArr.length; i11++) {
                this.f338135d[i11] = fArr[i11];
            }
        }

        public a(org.locationtech.jts.geom.a[] aVarArr, int i10) {
            aVarArr = aVarArr == null ? new org.locationtech.jts.geom.a[0] : aVarArr;
            this.f338133a = i10;
            this.f338135d = new double[aVarArr.length * i10];
            for (int i11 = 0; i11 < aVarArr.length; i11++) {
                double[] dArr = this.f338135d;
                int i12 = this.f338133a;
                org.locationtech.jts.geom.a aVar = aVarArr[i11];
                dArr[i11 * i12] = aVar.f338092a;
                if (i12 >= 2) {
                    dArr[(i11 * i12) + 1] = aVar.f338093b;
                }
                if (i12 >= 3) {
                    dArr[(i12 * i11) + 2] = aVar.f338094c;
                }
            }
        }

        public a(org.locationtech.jts.geom.a[] aVarArr) {
            this(aVarArr, 3);
        }

        public a(int i10, int i11) {
            this.f338133a = i11;
            this.f338135d = new double[i10 * i11];
        }
    }

    public static class b extends c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float[] f338136d;

        public b(float[] fArr, int i10) {
            if (i10 < 2) {
                throw new IllegalArgumentException("Must have at least 2 dimensions");
            }
            if (fArr.length % i10 != 0) {
                throw new IllegalArgumentException("Packed array does not contain an integral number of coordinates");
            }
            this.f338133a = i10;
            this.f338136d = fArr;
        }

        @Override // org.locationtech.jts.geom.e
        public m Ij(m mVar) {
            int i10 = 0;
            while (true) {
                float[] fArr = this.f338136d;
                if (i10 >= fArr.length) {
                    return mVar;
                }
                mVar.w(fArr[i10], fArr[i10 + 1]);
                i10 += this.f338133a;
            }
        }

        @Override // org.locationtech.jts.geom.impl.c, org.locationtech.jts.geom.e
        public void Ld(int i10, int i11, double d10) {
            this.f338134b = null;
            this.f338136d[(i10 * this.f338133a) + i11] = (float) d10;
        }

        @Override // org.locationtech.jts.geom.impl.c
        public org.locationtech.jts.geom.a c(int i10) {
            float[] fArr = this.f338136d;
            int i11 = this.f338133a;
            int i12 = 2 >> 2;
            return new org.locationtech.jts.geom.a(fArr[i10 * i11], fArr[(i10 * i11) + 1], i11 == 2 ? Double.NaN : fArr[(i10 * i11) + 2]);
        }

        @Override // org.locationtech.jts.geom.impl.c, org.locationtech.jts.geom.e
        public Object clone() {
            return copy();
        }

        @Override // org.locationtech.jts.geom.impl.c, org.locationtech.jts.geom.e
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public b copy() {
            float[] fArr = this.f338136d;
            return new b(Arrays.copyOf(fArr, fArr.length), this.f338133a);
        }

        public float[] g() {
            return this.f338136d;
        }

        @Override // org.locationtech.jts.geom.impl.c, org.locationtech.jts.geom.e
        public double ij(int i10, int i11) {
            return this.f338136d[(i10 * this.f338133a) + i11];
        }

        @Override // org.locationtech.jts.geom.e
        public int size() {
            return this.f338136d.length / this.f338133a;
        }

        public b(double[] dArr, int i10) {
            this.f338136d = new float[dArr.length];
            this.f338133a = i10;
            for (int i11 = 0; i11 < dArr.length; i11++) {
                this.f338136d[i11] = (float) dArr[i11];
            }
        }

        public b(org.locationtech.jts.geom.a[] aVarArr, int i10) {
            aVarArr = aVarArr == null ? new org.locationtech.jts.geom.a[0] : aVarArr;
            this.f338133a = i10;
            this.f338136d = new float[aVarArr.length * i10];
            for (int i11 = 0; i11 < aVarArr.length; i11++) {
                float[] fArr = this.f338136d;
                int i12 = this.f338133a;
                org.locationtech.jts.geom.a aVar = aVarArr[i11];
                fArr[i11 * i12] = (float) aVar.f338092a;
                if (i12 >= 2) {
                    fArr[(i11 * i12) + 1] = (float) aVar.f338093b;
                }
                if (i12 >= 3) {
                    fArr[(i12 * i11) + 2] = (float) aVar.f338094c;
                }
            }
        }

        public b(int i10, int i11) {
            this.f338133a = i11;
            this.f338136d = new float[i10 * i11];
        }
    }
}
