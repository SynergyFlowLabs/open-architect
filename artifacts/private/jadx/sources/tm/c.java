package tm;

/* JADX INFO: loaded from: classes14.dex */
public class c {
    public static double[] a(double[][] dArr, double[] dArr2) {
        int length = dArr2.length;
        if (dArr.length == length) {
            int i10 = 0;
            if (dArr[0].length == length) {
                while (i10 < length) {
                    int i11 = i10 + 1;
                    int i12 = i10;
                    for (int i13 = i11; i13 < length; i13++) {
                        if (Math.abs(dArr[i13][i10]) > Math.abs(dArr[i12][i10])) {
                            i12 = i13;
                        }
                    }
                    if (dArr[i12][i10] == 0.0d) {
                        return null;
                    }
                    c(dArr, i10, i12);
                    b(dArr2, i10, i12);
                    for (int i14 = i11; i14 < length; i14++) {
                        double d10 = dArr[i14][i10] / dArr[i10][i10];
                        for (int i15 = length - 1; i15 >= i10; i15--) {
                            double[] dArr3 = dArr[i14];
                            dArr3[i15] = dArr3[i15] - (dArr[i10][i15] * d10);
                        }
                        dArr2[i14] = dArr2[i14] - (dArr2[i10] * d10);
                    }
                    i10 = i11;
                }
                double[] dArr4 = new double[length];
                for (int i16 = length - 1; i16 >= 0; i16--) {
                    double d11 = 0.0d;
                    for (int i17 = i16 + 1; i17 < length; i17++) {
                        d11 += dArr[i16][i17] * dArr4[i17];
                    }
                    dArr4[i16] = (dArr2[i16] - d11) / dArr[i16][i16];
                }
                return dArr4;
            }
        }
        throw new IllegalArgumentException("Matrix A is incorrectly sized");
    }

    private static void b(double[] dArr, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        double d10 = dArr[i10];
        dArr[i10] = dArr[i11];
        dArr[i11] = d10;
    }

    private static void c(double[][] dArr, int i10, int i11) {
        if (i10 != i11) {
            for (int i12 = 0; i12 < dArr[0].length; i12++) {
                double[] dArr2 = dArr[i10];
                double d10 = dArr2[i12];
                double[] dArr3 = dArr[i11];
                dArr2[i12] = dArr3[i12];
                dArr3[i12] = d10;
            }
        }
    }
}
