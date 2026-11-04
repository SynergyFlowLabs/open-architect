package com.planner5d.android.libtess2;

/* JADX INFO: loaded from: classes5.dex */
public class Tessellator {
    static {
        System.loadLibrary("tess2");
    }

    private native float[] tessellate(float[] fArr);

    public float[] a(float[][] fArr) {
        int length = 0;
        for (float[] fArr2 : fArr) {
            length += fArr2.length + 1;
        }
        float[] fArr3 = new float[length];
        int length2 = fArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length2) {
            float[] fArr4 = fArr[i10];
            int i12 = i11 + 1;
            fArr3[i11] = fArr4.length;
            int length3 = fArr4.length;
            int i13 = 0;
            while (i13 < length3) {
                fArr3[i12] = fArr4[i13];
                i13++;
                i12++;
            }
            i10++;
            i11 = i12;
        }
        return tessellate(fArr3);
    }
}
