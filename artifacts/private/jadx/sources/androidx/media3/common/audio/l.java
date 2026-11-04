package androidx.media3.common.audio;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class l {
    private static final int A = 2;
    private static final float B = 1.00001f;
    private static final float C = 0.99999f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f60352x = 65;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f60353y = 400;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f60354z = 4000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f60355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f60356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f60357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f60358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f60359e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f60360f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f60361g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f60362h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final short[] f60363i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private short[] f60364j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f60365k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private short[] f60366l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f60367m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private short[] f60368n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f60369o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f60370p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f60371q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f60372r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f60373s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f60374t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f60375u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f60376v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private double f60377w;

    public l(int i10, int i11, float f10, float f11, int i12) {
        this.f60355a = i10;
        this.f60356b = i11;
        this.f60357c = f10;
        this.f60358d = f11;
        this.f60359e = i10 / i12;
        this.f60360f = i10 / 400;
        int i13 = i10 / 65;
        this.f60361g = i13;
        int i14 = i13 * 2;
        this.f60362h = i14;
        this.f60363i = new short[i14];
        this.f60364j = new short[i14 * i11];
        this.f60366l = new short[i14 * i11];
        this.f60368n = new short[i14 * i11];
    }

    private int A(short[] sArr, int i10, double d10, int i11) {
        int i12;
        if (d10 >= 2.0d) {
            double d11 = (((double) i11) / (d10 - 1.0d)) + this.f60377w;
            int iRound = (int) Math.round(d11);
            this.f60377w = d11 - ((double) iRound);
            i12 = iRound;
        } else {
            double d12 = ((((double) i11) * (2.0d - d10)) / (d10 - 1.0d)) + this.f60377w;
            int iRound2 = (int) Math.round(d12);
            this.f60372r = iRound2;
            this.f60377w = d12 - ((double) iRound2);
            i12 = i11;
        }
        short[] sArrG = g(this.f60366l, this.f60367m, i12);
        this.f60366l = sArrG;
        t(i12, this.f60356b, sArrG, this.f60367m, sArr, i10, sArr, i10 + i11);
        this.f60367m += i12;
        return i12;
    }

    private void a(float f10, int i10) {
        int i11;
        int i12;
        if (this.f60367m == i10) {
            return;
        }
        int i13 = this.f60355a;
        long j10 = (long) (i13 / f10);
        long j11 = i13;
        while (j10 != 0 && j11 != 0 && j10 % 2 == 0 && j11 % 2 == 0) {
            j10 /= 2;
            j11 /= 2;
        }
        s(i10);
        int i14 = 0;
        while (true) {
            int i15 = this.f60369o;
            if (i14 >= i15 - 1) {
                this.y(i15 - 1);
                return;
            }
            while (true) {
                i11 = this.f60370p;
                long j12 = ((long) (i11 + 1)) * j10;
                i12 = this.f60371q;
                if (j12 <= ((long) i12) * j11) {
                    break;
                }
                this.f60366l = this.g(this.f60366l, this.f60367m, 1);
                int i16 = 0;
                while (true) {
                    int i17 = this.f60356b;
                    if (i16 < i17) {
                        l lVar = this;
                        this.f60366l[(this.f60367m * i17) + i16] = lVar.r(this.f60368n, (i17 * i14) + i16, j11, j10);
                        i16++;
                        this = lVar;
                    }
                }
                l lVar2 = this;
                lVar2.f60371q++;
                lVar2.f60367m++;
                this = lVar2;
            }
            l lVar3 = this;
            int i18 = i11 + 1;
            lVar3.f60370p = i18;
            if (i18 == j11) {
                lVar3.f60370p = 0;
                androidx.media3.common.util.a.i(((long) i12) == j10);
                lVar3.f60371q = 0;
            }
            i14++;
            this = lVar3;
        }
    }

    static long b(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        RoundingMode roundingMode = RoundingMode.HALF_EVEN;
        BigDecimal bigDecimalDivide = bigDecimal.divide(bigDecimal2, 20, roundingMode);
        BigDecimal bigDecimalDivide2 = bigDecimal2.divide(bigDecimal3, 20, roundingMode);
        RoundingMode roundingMode2 = RoundingMode.FLOOR;
        return bigDecimalDivide.multiply(bigDecimalDivide2.subtract(bigDecimalDivide2.setScale(0, roundingMode2))).setScale(0, roundingMode2).longValueExact();
    }

    private void c(double d10) {
        l lVar;
        double d11;
        int i10 = this.f60365k;
        if (i10 < this.f60362h) {
            return;
        }
        int iQ = 0;
        while (true) {
            if (this.f60372r > 0) {
                iQ += this.d(iQ);
                lVar = this;
                d11 = d10;
            } else {
                int iH = this.h(this.f60364j, iQ);
                if (d10 > 1.0d) {
                    lVar = this;
                    d11 = d10;
                    iQ += iH + lVar.A(this.f60364j, iQ, d11, iH);
                } else {
                    lVar = this;
                    d11 = d10;
                    iQ += lVar.q(lVar.f60364j, iQ, d11, iH);
                }
            }
            if (lVar.f60362h + iQ > i10) {
                lVar.z(iQ);
                return;
            } else {
                this = lVar;
                d10 = d11;
            }
        }
    }

    private int d(int i10) {
        int iMin = Math.min(this.f60362h, this.f60372r);
        e(this.f60364j, i10, iMin);
        this.f60372r -= iMin;
        return iMin;
    }

    private void e(short[] sArr, int i10, int i11) {
        short[] sArrG = g(this.f60366l, this.f60367m, i11);
        this.f60366l = sArrG;
        int i12 = this.f60356b;
        System.arraycopy(sArr, i10 * i12, sArrG, this.f60367m * i12, i12 * i11);
        this.f60367m += i11;
    }

    private void f(short[] sArr, int i10, int i11) {
        int i12 = this.f60362h / i11;
        int i13 = this.f60356b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f60363i[i16] = (short) (i17 / i14);
        }
    }

    private short[] g(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f60356b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    private int h(short[] sArr, int i10) {
        int i11;
        int i12 = this.f60355a;
        int i13 = i12 > f60354z ? i12 / f60354z : 1;
        if (this.f60356b == 1 && i13 == 1) {
            i11 = i(sArr, i10, this.f60360f, this.f60361g);
        } else {
            f(sArr, i10, i13);
            int i14 = i(this.f60363i, 0, this.f60360f / i13, this.f60361g / i13);
            if (i13 != 1) {
                int i15 = i14 * i13;
                int i16 = i13 * 4;
                int i17 = i15 - i16;
                int i18 = i15 + i16;
                int i19 = this.f60360f;
                if (i17 < i19) {
                    i17 = i19;
                }
                int i20 = this.f60361g;
                if (i18 > i20) {
                    i18 = i20;
                }
                if (this.f60356b == 1) {
                    i11 = i(sArr, i10, i17, i18);
                } else {
                    f(sArr, i10, 1);
                    i11 = i(this.f60363i, 0, i17, i18);
                }
            } else {
                i11 = i14;
            }
        }
        int i21 = u(this.f60375u, this.f60376v) ? this.f60373s : i11;
        this.f60374t = this.f60375u;
        this.f60373s = i11;
        return i21;
    }

    private int i(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f60356b;
        int i14 = 255;
        int i15 = 1;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int iAbs = 0;
            for (int i18 = 0; i18 < i11; i18++) {
                iAbs += Math.abs(sArr[i13 + i18] - sArr[(i13 + i11) + i18]);
            }
            if (iAbs * i16 < i15 * i11) {
                i16 = i11;
                i15 = iAbs;
            }
            if (iAbs * i14 > i17 * i11) {
                i14 = i11;
                i17 = iAbs;
            }
            i11++;
        }
        this.f60375u = i15 / i16;
        this.f60376v = i17 / i14;
        return i16;
    }

    public static long k(int i10, int i11, float f10, float f11, long j10) {
        float f12 = (i10 / i11) * f11;
        double d10 = f10 / f11;
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(f12));
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(j10);
        if (d10 > 1.0000100135803223d || d10 < 0.9999899864196777d) {
            bigDecimalValueOf = bigDecimalValueOf.divide(BigDecimal.valueOf(d10), RoundingMode.HALF_EVEN);
        }
        return f12 == 1.0f ? bigDecimalValueOf.longValueExact() : bigDecimalValueOf.divide(bigDecimal, RoundingMode.HALF_EVEN).longValueExact() - b(bigDecimalValueOf, BigDecimal.valueOf(i10), bigDecimal);
    }

    static long l(int i10, int i11, float f10, float f11, long j10) {
        long jM = m(BigDecimal.valueOf(i10), new BigDecimal(String.valueOf((i10 / i11) * f11)), BigDecimal.valueOf(j10));
        double d10 = f10 / f11;
        return (d10 > 1.0000100135803223d || d10 < 0.9999899864196777d) ? BigDecimal.valueOf(jM).multiply(BigDecimal.valueOf(d10)).setScale(0, RoundingMode.FLOOR).longValueExact() : jM;
    }

    private static long m(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        RoundingMode roundingMode = RoundingMode.FLOOR;
        return bigDecimal.multiply(bigDecimal3).divide(bigDecimal.divide(bigDecimal2, 0, roundingMode), 0, roundingMode).longValueExact();
    }

    private int q(short[] sArr, int i10, double d10, int i11) {
        int i12;
        if (d10 < 0.5d) {
            double d11 = ((((double) i11) * d10) / (1.0d - d10)) + this.f60377w;
            int iRound = (int) Math.round(d11);
            this.f60377w = d11 - ((double) iRound);
            i12 = iRound;
        } else {
            double d12 = ((((double) i11) * ((2.0d * d10) - 1.0d)) / (1.0d - d10)) + this.f60377w;
            int iRound2 = (int) Math.round(d12);
            this.f60372r = iRound2;
            this.f60377w = d12 - ((double) iRound2);
            i12 = i11;
        }
        int i13 = i11 + i12;
        short[] sArrG = g(this.f60366l, this.f60367m, i13);
        this.f60366l = sArrG;
        int i14 = this.f60356b;
        System.arraycopy(sArr, i10 * i14, sArrG, this.f60367m * i14, i14 * i11);
        t(i12, this.f60356b, this.f60366l, this.f60367m + i11, sArr, i10 + i11, sArr, i10);
        this.f60367m += i13;
        return i12;
    }

    private short r(short[] sArr, int i10, long j10, long j11) {
        short s10 = sArr[i10];
        short s11 = sArr[i10 + this.f60356b];
        long j12 = ((long) this.f60371q) * j10;
        int i11 = this.f60370p;
        long j13 = ((long) (i11 + 1)) * j11;
        long j14 = j13 - j12;
        long j15 = j13 - (((long) i11) * j11);
        return (short) (((((long) s10) * j14) + ((j15 - j14) * ((long) s11))) / j15);
    }

    private void s(int i10) {
        int i11 = this.f60367m - i10;
        short[] sArrG = g(this.f60368n, this.f60369o, i11);
        this.f60368n = sArrG;
        short[] sArr = this.f60366l;
        int i12 = this.f60356b;
        System.arraycopy(sArr, i10 * i12, sArrG, this.f60369o * i12, i12 * i11);
        this.f60367m = i10;
        this.f60369o += i11;
    }

    private static void t(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr2[i18] * (i10 - i19)) + (sArr3[i17] * i19)) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    private boolean u(int i10, int i11) {
        return i10 != 0 && this.f60373s != 0 && i11 <= i10 * 3 && i10 * 2 > this.f60374t * 3;
    }

    private void v() {
        int i10 = this.f60367m;
        float f10 = this.f60357c;
        float f11 = this.f60358d;
        double d10 = f10 / f11;
        float f12 = this.f60359e * f11;
        if (d10 > 1.0000100135803223d || d10 < 0.9999899864196777d) {
            c(d10);
        } else {
            e(this.f60364j, 0, this.f60365k);
            this.f60365k = 0;
        }
        if (f12 != 1.0f) {
            a(f12, i10);
        }
    }

    private void y(int i10) {
        if (i10 == 0) {
            return;
        }
        short[] sArr = this.f60368n;
        int i11 = this.f60356b;
        System.arraycopy(sArr, i10 * i11, sArr, 0, (this.f60369o - i10) * i11);
        this.f60369o -= i10;
    }

    private void z(int i10) {
        int i11 = this.f60365k - i10;
        short[] sArr = this.f60364j;
        int i12 = this.f60356b;
        System.arraycopy(sArr, i10 * i12, sArr, 0, i12 * i11);
        this.f60365k = i11;
    }

    public void j() {
        this.f60365k = 0;
        this.f60367m = 0;
        this.f60369o = 0;
        this.f60370p = 0;
        this.f60371q = 0;
        this.f60372r = 0;
        this.f60373s = 0;
        this.f60374t = 0;
        this.f60375u = 0;
        this.f60376v = 0;
        this.f60377w = 0.0d;
    }

    public void n(ShortBuffer shortBuffer) {
        androidx.media3.common.util.a.i(this.f60367m >= 0);
        int iMin = Math.min(shortBuffer.remaining() / this.f60356b, this.f60367m);
        shortBuffer.put(this.f60366l, 0, this.f60356b * iMin);
        int i10 = this.f60367m - iMin;
        this.f60367m = i10;
        short[] sArr = this.f60366l;
        int i11 = this.f60356b;
        System.arraycopy(sArr, iMin * i11, sArr, 0, i10 * i11);
    }

    public int o() {
        androidx.media3.common.util.a.i(this.f60367m >= 0);
        return this.f60367m * this.f60356b * 2;
    }

    public int p() {
        return this.f60365k * this.f60356b * 2;
    }

    public void w() {
        int i10;
        int i11 = this.f60365k;
        float f10 = this.f60357c;
        float f11 = this.f60358d;
        double d10 = f10 / f11;
        double d11 = this.f60359e * f11;
        int i12 = this.f60372r;
        int i13 = this.f60367m + ((int) ((((((((double) (i11 - i12)) / d10) + ((double) i12)) + this.f60377w) + ((double) this.f60369o)) / d11) + 0.5d));
        this.f60377w = 0.0d;
        this.f60364j = g(this.f60364j, i11, (this.f60362h * 2) + i11);
        int i14 = 0;
        while (true) {
            i10 = this.f60362h;
            int i15 = this.f60356b;
            if (i14 >= i10 * 2 * i15) {
                break;
            }
            this.f60364j[(i15 * i11) + i14] = 0;
            i14++;
        }
        this.f60365k += i10 * 2;
        v();
        if (this.f60367m > i13) {
            this.f60367m = Math.max(i13, 0);
        }
        this.f60365k = 0;
        this.f60372r = 0;
        this.f60369o = 0;
    }

    public void x(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i10 = this.f60356b;
        int i11 = iRemaining / i10;
        short[] sArrG = g(this.f60364j, this.f60365k, i11);
        this.f60364j = sArrG;
        shortBuffer.get(sArrG, this.f60365k * this.f60356b, ((i10 * i11) * 2) / 2);
        this.f60365k += i11;
        v();
    }
}
