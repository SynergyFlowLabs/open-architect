package com.airbnb.lottie.model.content;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f88391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f88392b;

    public d(float[] fArr, int[] iArr) {
        this.f88391a = fArr;
        this.f88392b = iArr;
    }

    private void a(d dVar) {
        int i10 = 0;
        while (true) {
            int[] iArr = dVar.f88392b;
            if (i10 >= iArr.length) {
                return;
            }
            this.f88391a[i10] = dVar.f88391a[i10];
            this.f88392b[i10] = iArr[i10];
            i10++;
        }
    }

    private int c(float f10) {
        int iBinarySearch = Arrays.binarySearch(this.f88391a, f10);
        if (iBinarySearch >= 0) {
            return this.f88392b[iBinarySearch];
        }
        int i10 = -(iBinarySearch + 1);
        if (i10 == 0) {
            return this.f88392b[0];
        }
        int[] iArr = this.f88392b;
        if (i10 == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.f88391a;
        int i11 = i10 - 1;
        float f11 = fArr[i11];
        return com.airbnb.lottie.utils.b.c((f10 - f11) / (fArr[i10] - f11), iArr[i11], iArr[i10]);
    }

    public d b(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i10 = 0; i10 < fArr.length; i10++) {
            iArr[i10] = c(fArr[i10]);
        }
        return new d(fArr, iArr);
    }

    public int[] d() {
        return this.f88392b;
    }

    public float[] e() {
        return this.f88391a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            d dVar = (d) obj;
            if (Arrays.equals(this.f88391a, dVar.f88391a) && Arrays.equals(this.f88392b, dVar.f88392b)) {
                return true;
            }
        }
        return false;
    }

    public int f() {
        return this.f88392b.length;
    }

    public void g(d dVar, d dVar2, float f10) {
        int[] iArr;
        if (dVar.equals(dVar2)) {
            a(dVar);
            return;
        }
        if (f10 <= 0.0f) {
            a(dVar);
            return;
        }
        if (f10 >= 1.0f) {
            a(dVar2);
            return;
        }
        if (dVar.f88392b.length != dVar2.f88392b.length) {
            throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + dVar.f88392b.length + " vs " + dVar2.f88392b.length + ")");
        }
        int i10 = 0;
        while (true) {
            iArr = dVar.f88392b;
            if (i10 >= iArr.length) {
                break;
            }
            this.f88391a[i10] = com.airbnb.lottie.utils.i.k(dVar.f88391a[i10], dVar2.f88391a[i10], f10);
            this.f88392b[i10] = com.airbnb.lottie.utils.b.c(f10, dVar.f88392b[i10], dVar2.f88392b[i10]);
            i10++;
        }
        int length = iArr.length;
        while (true) {
            float[] fArr = this.f88391a;
            if (length >= fArr.length) {
                return;
            }
            int[] iArr2 = dVar.f88392b;
            fArr[length] = fArr[iArr2.length - 1];
            int[] iArr3 = this.f88392b;
            iArr3[length] = iArr3[iArr2.length - 1];
            length++;
        }
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f88391a) * 31) + Arrays.hashCode(this.f88392b);
    }
}
