package com.google.android.material.color.utilities;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public final class c6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f112105a = 10;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final double f112106b = 3.0d;

    private static final class a implements Comparable<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f112107a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        double f112108b = -1.0d;

        a() {
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return Double.valueOf(this.f112108b).compareTo(Double.valueOf(aVar.f112108b));
        }
    }

    private c6() {
    }

    public static Map<Integer, Integer> a(int[] iArr, int[] iArr2, int i10) {
        char c10;
        double[] dArr;
        Random random = new Random(272008L);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        double[][] dArr2 = new double[iArr.length][];
        int[] iArr3 = new int[iArr.length];
        x5 x5Var = new x5();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            c10 = 1;
            if (i11 >= iArr.length) {
                break;
            }
            int i13 = iArr[i11];
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(i13));
            if (num == null) {
                dArr2[i12] = x5Var.b(i13);
                iArr3[i12] = i13;
                i12++;
                linkedHashMap.put(Integer.valueOf(i13), 1);
            } else {
                linkedHashMap.put(Integer.valueOf(i13), Integer.valueOf(num.intValue() + 1));
            }
            i11++;
        }
        int[] iArr4 = new int[i12];
        for (int i14 = 0; i14 < i12; i14++) {
            iArr4[i14] = ((Integer) linkedHashMap.get(Integer.valueOf(iArr3[i14]))).intValue();
        }
        int iMin = Math.min(i10, i12);
        if (iArr2.length != 0) {
            iMin = Math.min(iMin, iArr2.length);
        }
        double[][] dArr3 = new double[iMin][];
        int i15 = 0;
        for (int i16 = 0; i16 < iArr2.length; i16++) {
            dArr3[i16] = x5Var.b(iArr2[i16]);
            i15++;
        }
        int i17 = iMin - i15;
        if (i17 > 0) {
            for (int i18 = 0; i18 < i17; i18++) {
            }
        }
        int[] iArr5 = new int[i12];
        for (int i19 = 0; i19 < i12; i19++) {
            iArr5[i19] = random.nextInt(iMin);
        }
        int[][] iArr6 = new int[iMin][];
        for (int i20 = 0; i20 < iMin; i20++) {
            iArr6[i20] = new int[iMin];
        }
        a[][] aVarArr = new a[iMin][];
        for (int i21 = 0; i21 < iMin; i21++) {
            aVarArr[i21] = new a[iMin];
            for (int i22 = 0; i22 < iMin; i22++) {
                aVarArr[i21][i22] = new a();
            }
        }
        int[] iArr7 = new int[iMin];
        int i23 = 0;
        while (i23 < 10) {
            int i24 = 0;
            while (i24 < iMin) {
                int i25 = i24 + 1;
                int i26 = i25;
                while (i26 < iMin) {
                    int[] iArr8 = iArr4;
                    double dC = x5Var.c(dArr3[i24], dArr3[i26]);
                    a aVar = aVarArr[i26][i24];
                    aVar.f112108b = dC;
                    aVar.f112107a = i24;
                    a aVar2 = aVarArr[i24][i26];
                    aVar2.f112108b = dC;
                    aVar2.f112107a = i26;
                    i26++;
                    iArr4 = iArr8;
                    iArr5 = iArr5;
                    c10 = c10;
                }
                int[] iArr9 = iArr4;
                int[] iArr10 = iArr5;
                char c11 = c10;
                Arrays.sort(aVarArr[i24]);
                for (int i27 = 0; i27 < iMin; i27++) {
                    iArr6[i24][i27] = aVarArr[i24][i27].f112107a;
                }
                iArr4 = iArr9;
                iArr5 = iArr10;
                i24 = i25;
                c10 = c11;
            }
            int[] iArr11 = iArr4;
            int[] iArr12 = iArr5;
            char c12 = c10;
            int i28 = 0;
            int i29 = 0;
            while (i28 < i12) {
                double[] dArr4 = dArr2[i28];
                int i30 = iArr12[i28];
                double dC2 = x5Var.c(dArr4, dArr3[i30]);
                int i31 = i28;
                double d10 = dC2;
                int i32 = -1;
                int i33 = 0;
                while (i33 < iMin) {
                    int i34 = i29;
                    int[][] iArr13 = iArr6;
                    if (aVarArr[i30][i33].f112108b < 4.0d * dC2) {
                        double dC3 = x5Var.c(dArr4, dArr3[i33]);
                        if (dC3 < d10) {
                            d10 = dC3;
                            i32 = i33;
                        }
                    }
                    i33++;
                    iArr6 = iArr13;
                    i29 = i34;
                }
                int i35 = i29;
                int[][] iArr14 = iArr6;
                if (i32 == -1 || Math.abs(Math.sqrt(d10) - Math.sqrt(dC2)) <= 3.0d) {
                    i29 = i35;
                } else {
                    i29 = i35 + 1;
                    iArr12[i31] = i32;
                }
                i28 = i31 + 1;
                iArr6 = iArr14;
            }
            int[][] iArr15 = iArr6;
            if (i29 == 0 && i23 != 0) {
                break;
            }
            double[] dArr5 = new double[iMin];
            double[] dArr6 = new double[iMin];
            double[] dArr7 = new double[iMin];
            boolean z10 = false;
            Arrays.fill(iArr7, 0);
            int i36 = 0;
            while (i36 < i12) {
                int i37 = iArr12[i36];
                double[] dArr8 = dArr2[i36];
                boolean z11 = z10;
                int i38 = iArr11[i36];
                iArr7[i37] = iArr7[i37] + i38;
                double d11 = i38;
                dArr5[i37] = dArr5[i37] + (dArr8[z11 ? 1 : 0] * d11);
                dArr6[i37] = dArr6[i37] + (dArr8[c12] * d11);
                dArr7[i37] = dArr7[i37] + (dArr8[2] * d11);
                i36++;
                z10 = false;
            }
            int i39 = 0;
            while (i39 < iMin) {
                int i40 = iArr7[i39];
                if (i40 == 0) {
                    dArr3[i39] = new double[]{0.0d, 0.0d, 0.0d};
                    dArr = dArr6;
                } else {
                    double d12 = dArr5[i39];
                    dArr = dArr6;
                    double d13 = i40;
                    double d14 = d12 / d13;
                    double d15 = dArr[i39] / d13;
                    double d16 = dArr7[i39] / d13;
                    double[] dArr9 = dArr3[i39];
                    dArr9[0] = d14;
                    dArr9[c12] = d15;
                    dArr9[2] = d16;
                }
                i39++;
                dArr5 = dArr5;
                dArr6 = dArr;
            }
            i23++;
            iArr4 = iArr11;
            iArr5 = iArr12;
            c10 = c12;
            iArr6 = iArr15;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (int i41 = 0; i41 < iMin; i41++) {
            int i42 = iArr7[i41];
            if (i42 != 0) {
                int iA = x5Var.a(dArr3[i41]);
                if (!linkedHashMap2.containsKey(Integer.valueOf(iA))) {
                    linkedHashMap2.put(Integer.valueOf(iA), Integer.valueOf(i42));
                }
            }
        }
        return linkedHashMap2;
    }
}
