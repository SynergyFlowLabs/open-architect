package org.threeten.bp.chrono;

import androidx.compose.runtime.m0;
import java.io.BufferedReader;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.text.ParseException;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes14.dex */
public final class m extends b<m> implements Serializable {
    private static final String H1;
    private static final int[] X;
    private static final int Y = 5;
    private static final int Z = 6;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private static final String f339897g3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private static final HashMap<Integer, Integer[]> f339898h3;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private static final HashMap<Integer, Integer[]> f339899i3;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private static final HashMap<Integer, Integer[]> f339900j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f339901k = -5207853542612002020L;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private static final Long[] f339902k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f339903l = 1;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private static final Integer[] f339904l3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f339905m = 9999;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private static final Integer[] f339906m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int[] f339907n;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private static final Integer[] f339908n3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int[] f339909o;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private static final Integer[] f339910o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final int[] f339911p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final char f339912p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final String f339913p2 = "hijrah_deviation.cfg";

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private static final Integer[] f339914p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private static final Integer[] f339915q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private static final Integer[] f339916r3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int[] f339917s;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private static final Integer[] f339918s3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int[] f339919t;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private static final int f339920t3 = 334;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private static final int f339921u3 = -492148;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int[] f339922v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int[] f339923w;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient n f339924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int f339925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f339926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient int f339927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient int f339928g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final transient org.threeten.bp.d f339929h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f339930i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final transient boolean f339931j;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f339932a;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.a.values().length];
            f339932a = iArr;
            try {
                iArr[org.threeten.bp.temporal.a.f340349p0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f339932a[org.threeten.bp.temporal.a.f340350p1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f339932a[org.threeten.bp.temporal.a.f340351p2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f339932a[org.threeten.bp.temporal.a.f340338j3.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                int i10 = 6 << 5;
                f339932a[org.threeten.bp.temporal.a.X.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f339932a[org.threeten.bp.temporal.a.Y.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f339932a[org.threeten.bp.temporal.a.Z.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f339932a[org.threeten.bp.temporal.a.H1.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f339932a[org.threeten.bp.temporal.a.f340332g3.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f339932a[org.threeten.bp.temporal.a.f340334h3.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f339932a[org.threeten.bp.temporal.a.f340340k3.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f339932a[org.threeten.bp.temporal.a.f340342l3.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        int[] iArr = {0, 30, 59, 89, 118, com.planner5d.library.engine.input.f.b.G1, 177, m0.f36245r, 236, 266, 295, 325};
        f339907n = iArr;
        f339909o = new int[]{0, 30, 59, 89, 118, com.planner5d.library.engine.input.f.b.G1, 177, m0.f36245r, 236, 266, 295, 325};
        f339917s = new int[]{30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 29};
        f339919t = new int[]{30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 30};
        f339922v = new int[]{0, 1, 0, 1, 0, 1, 1};
        f339923w = new int[]{1, f339905m, 11, 51, 5, 29, 354};
        X = new int[]{1, f339905m, 11, 52, 6, 30, 355};
        f339911p0 = new int[]{0, 354, 709, 1063, 1417, 1772, 2126, 2481, 2835, 3189, 3544, 3898, 4252, 4607, 4961, 5315, 5670, 6024, 6379, 6733, 7087, 7442, 7796, 8150, 8505, 8859, 9214, 9568, 9922, 10277};
        char c10 = File.separatorChar;
        f339912p1 = c10;
        H1 = File.pathSeparator;
        f339897g3 = "org" + c10 + "threeten" + c10 + "bp" + c10 + "chrono";
        f339898h3 = new HashMap<>();
        f339899i3 = new HashMap<>();
        f339900j3 = new HashMap<>();
        f339910o3 = new Integer[iArr.length];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr2 = f339907n;
            if (i11 >= iArr2.length) {
                break;
            }
            f339910o3[i11] = Integer.valueOf(iArr2[i11]);
            i11++;
        }
        f339914p3 = new Integer[f339909o.length];
        int i12 = 0;
        while (true) {
            int[] iArr3 = f339909o;
            if (i12 >= iArr3.length) {
                break;
            }
            f339914p3[i12] = Integer.valueOf(iArr3[i12]);
            i12++;
        }
        f339915q3 = new Integer[f339917s.length];
        int i13 = 0;
        while (true) {
            int[] iArr4 = f339917s;
            if (i13 >= iArr4.length) {
                break;
            }
            f339915q3[i13] = Integer.valueOf(iArr4[i13]);
            i13++;
        }
        f339916r3 = new Integer[f339919t.length];
        int i14 = 0;
        while (true) {
            int[] iArr5 = f339919t;
            if (i14 >= iArr5.length) {
                break;
            }
            f339916r3[i14] = Integer.valueOf(iArr5[i14]);
            i14++;
        }
        f339918s3 = new Integer[f339911p0.length];
        int i15 = 0;
        while (true) {
            int[] iArr6 = f339911p0;
            if (i15 >= iArr6.length) {
                break;
            }
            f339918s3[i15] = Integer.valueOf(iArr6[i15]);
            i15++;
        }
        f339902k3 = new Long[f339920t3];
        int i16 = 0;
        while (true) {
            Long[] lArr = f339902k3;
            if (i16 >= lArr.length) {
                break;
            }
            lArr[i16] = Long.valueOf(i16 * 10631);
            i16++;
        }
        f339904l3 = new Integer[f339922v.length];
        int i17 = 0;
        while (true) {
            int[] iArr7 = f339922v;
            if (i17 >= iArr7.length) {
                break;
            }
            f339904l3[i17] = Integer.valueOf(iArr7[i17]);
            i17++;
        }
        f339906m3 = new Integer[f339923w.length];
        int i18 = 0;
        while (true) {
            int[] iArr8 = f339923w;
            if (i18 >= iArr8.length) {
                break;
            }
            f339906m3[i18] = Integer.valueOf(iArr8[i18]);
            i18++;
        }
        f339908n3 = new Integer[X.length];
        while (true) {
            int[] iArr9 = X;
            if (i10 >= iArr9.length) {
                try {
                    X0();
                    return;
                } catch (IOException | ParseException unused) {
                    return;
                }
            } else {
                f339908n3[i10] = Integer.valueOf(iArr9[i10]);
                i10++;
            }
        }
    }

    private m(long j10) {
        int[] iArrY0 = y0(j10);
        l0(iArrY0[1]);
        k0(iArrY0[2]);
        i0(iArrY0[3]);
        j0(iArrY0[4]);
        this.f339924c = n.w(iArrY0[0]);
        int i10 = iArrY0[1];
        this.f339925d = i10;
        this.f339926e = iArrY0[2];
        this.f339927f = iArrY0[3];
        this.f339928g = iArrY0[4];
        this.f339929h = org.threeten.bp.d.z(iArrY0[5]);
        this.f339930i = j10;
        this.f339931j = isLeapYear(i10);
    }

    static int A0() {
        return f339908n3[6].intValue();
    }

    private static int B0(int i10, int i11) {
        return o0(i11)[i10].intValue();
    }

    static int C0(int i10, int i11) {
        return p0(i11)[i10].intValue();
    }

    private static int D0(int i10, int i11) {
        Integer[] numArrO0 = o0(i11);
        int i12 = 0;
        if (i10 >= 0) {
            while (i12 < numArrO0.length) {
                if (i10 < numArrO0[i12].intValue()) {
                    return i12 - 1;
                }
                i12++;
            }
            return 11;
        }
        int i13 = isLeapYear((long) i11) ? i10 + 355 : i10 + 354;
        while (i12 < numArrO0.length) {
            if (i13 < numArrO0[i12].intValue()) {
                return i12 - 1;
            }
            i12++;
        }
        return 11;
    }

    static int E0() {
        return f339906m3[5].intValue();
    }

    static int F0() {
        return f339906m3[6].intValue();
    }

    private static int G0(int i10, long j10) {
        Integer[] numArrN0 = n0(i10);
        int i11 = 0;
        if (j10 == 0) {
            return 0;
        }
        if (j10 > 0) {
            while (i11 < numArrN0.length) {
                if (j10 < numArrN0[i11].intValue()) {
                    return i11 - 1;
                }
                i11++;
            }
            return 29;
        }
        long j11 = -j10;
        while (i11 < numArrN0.length) {
            if (j11 <= numArrN0[i11].intValue()) {
                return i11 - 1;
            }
            i11++;
        }
        return 29;
    }

    static int H0(int i10) {
        Integer[] numArr;
        int i11 = i10 - 1;
        int i12 = i11 / 30;
        try {
            numArr = f339900j3.get(Integer.valueOf(i12));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        if (numArr == null) {
            return isLeapYear((long) i10) ? 355 : 354;
        }
        int i13 = i11 % 30;
        if (i13 != 29) {
            return numArr[i13 + 1].intValue() - numArr[i13].intValue();
        }
        Long[] lArr = f339902k3;
        return (lArr[i12 + 1].intValue() - lArr[i12].intValue()) - numArr[i13].intValue();
    }

    public static m K0() {
        return L0(org.threeten.bp.a.g());
    }

    public static m L0(org.threeten.bp.a aVar) {
        return l.f339891e.l(aVar);
    }

    public static m M0(org.threeten.bp.r rVar) {
        return L0(org.threeten.bp.a.f(rVar));
    }

    public static m N0(int i10, int i11, int i12) {
        return i10 >= 1 ? P0(n.AH, i10, i11, i12) : P0(n.BEFORE_AH, 1 - i10, i11, i12);
    }

    static m O0(org.threeten.bp.g gVar) {
        return new m(gVar.toEpochDay());
    }

    static m P0(n nVar, int i10, int i11, int i12) {
        cn.d.j(nVar, "era");
        l0(i10);
        k0(i11);
        i0(i12);
        return new m(x0(nVar.x(i10), i11, i12));
    }

    static m Q0(long j10) {
        return new m(j10);
    }

    private static void R0(String str, int i10) throws ParseException {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ";");
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            int iIndexOf = strNextToken.indexOf(58);
            if (iIndexOf == -1) {
                throw new ParseException("Offset has incorrect format at line " + i10 + ".", i10);
            }
            try {
                int i11 = Integer.parseInt(strNextToken.substring(iIndexOf + 1, strNextToken.length()));
                int iIndexOf2 = strNextToken.indexOf(45);
                if (iIndexOf2 == -1) {
                    throw new ParseException("Start and end year/month has incorrect format at line " + i10 + ".", i10);
                }
                String strSubstring = strNextToken.substring(0, iIndexOf2);
                String strSubstring2 = strNextToken.substring(iIndexOf2 + 1, iIndexOf);
                int iIndexOf3 = strSubstring.indexOf(47);
                int iIndexOf4 = strSubstring2.indexOf(47);
                if (iIndexOf3 == -1) {
                    throw new ParseException("Start year/month has incorrect format at line " + i10 + ".", i10);
                }
                String strSubstring3 = strSubstring.substring(0, iIndexOf3);
                String strSubstring4 = strSubstring.substring(iIndexOf3 + 1, strSubstring.length());
                try {
                    int i12 = Integer.parseInt(strSubstring3);
                    try {
                        int i13 = Integer.parseInt(strSubstring4);
                        if (iIndexOf4 == -1) {
                            throw new ParseException("End year/month has incorrect format at line " + i10 + ".", i10);
                        }
                        String strSubstring5 = strSubstring2.substring(0, iIndexOf4);
                        String strSubstring6 = strSubstring2.substring(iIndexOf4 + 1, strSubstring2.length());
                        try {
                            int i14 = Integer.parseInt(strSubstring5);
                            try {
                                int i15 = Integer.parseInt(strSubstring6);
                                if (i12 == -1 || i13 == -1 || i14 == -1 || i15 == -1) {
                                    throw new ParseException("Unknown error at line " + i10 + ".", i10);
                                }
                                h0(i12, i13, i14, i15, i11);
                            } catch (NumberFormatException unused) {
                                throw new ParseException("End month is not properly set at line " + i10 + ".", i10);
                            }
                        } catch (NumberFormatException unused2) {
                            throw new ParseException("End year is not properly set at line " + i10 + ".", i10);
                        }
                    } catch (NumberFormatException unused3) {
                        throw new ParseException("Start month is not properly set at line " + i10 + ".", i10);
                    }
                } catch (NumberFormatException unused4) {
                    throw new ParseException("Start year is not properly set at line " + i10 + ".", i10);
                }
            } catch (NumberFormatException unused5) {
                throw new ParseException("Offset is not properly set at line " + i10 + ".", i10);
            }
        }
    }

    private static void X0() throws Throwable {
        InputStream inputStreamR0 = r0();
        if (inputStreamR0 == null) {
            return;
        }
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStreamR0));
            int i10 = 0;
            while (true) {
                try {
                    String line = bufferedReader2.readLine();
                    if (line == null) {
                        bufferedReader2.close();
                        return;
                    } else {
                        i10++;
                        R0(line.trim(), i10);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    static c Y0(DataInput dataInput) throws IOException {
        return l.f339891e.c(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
    }

    private static m Z0(int i10, int i11, int i12) {
        int iB0 = B0(i11 - 1, i10);
        if (i12 > iB0) {
            i12 = iB0;
        }
        return N0(i10, i11, i12);
    }

    private static long d1(int i10) {
        Long lValueOf;
        int i11 = i10 - 1;
        int i12 = i11 / 30;
        int i13 = i11 % 30;
        int iIntValue = n0(i12)[Math.abs(i13)].intValue();
        if (i13 < 0) {
            iIntValue = -iIntValue;
        }
        try {
            lValueOf = f339902k3[i12];
        } catch (ArrayIndexOutOfBoundsException unused) {
            lValueOf = null;
        }
        if (lValueOf == null) {
            lValueOf = Long.valueOf(i12 * 10631);
        }
        return (lValueOf.longValue() + ((long) iIntValue)) - 492149;
    }

    private static void h0(int i10, int i11, int i12, int i13, int i14) {
        char c10;
        int i15;
        int i16 = 1;
        if (i10 < 1) {
            throw new IllegalArgumentException("startYear < 1");
        }
        if (i12 < 1) {
            throw new IllegalArgumentException("endYear < 1");
        }
        if (i11 >= 0) {
            char c11 = 11;
            if (i11 <= 11) {
                if (i13 < 0 || i13 > 11) {
                    throw new IllegalArgumentException("endMonth < 0 || endMonth > 11");
                }
                if (i12 > 9999) {
                    throw new IllegalArgumentException("endYear > 9999");
                }
                if (i12 < i10) {
                    throw new IllegalArgumentException("startYear > endYear");
                }
                if (i12 == i10 && i13 < i11) {
                    throw new IllegalArgumentException("startYear == endYear && endMonth < startMonth");
                }
                boolean zIsLeapYear = isLeapYear(i10);
                Integer[] numArr = f339898h3.get(Integer.valueOf(i10));
                if (numArr == null) {
                    if (!zIsLeapYear) {
                        numArr = new Integer[f339907n.length];
                        int i17 = 0;
                        while (true) {
                            int[] iArr = f339907n;
                            if (i17 >= iArr.length) {
                                break;
                            }
                            numArr[i17] = Integer.valueOf(iArr[i17]);
                            i17++;
                        }
                    } else {
                        numArr = new Integer[f339909o.length];
                        int i18 = 0;
                        while (true) {
                            int[] iArr2 = f339909o;
                            if (i18 >= iArr2.length) {
                                break;
                            }
                            numArr[i18] = Integer.valueOf(iArr2[i18]);
                            i18++;
                        }
                    }
                }
                Integer[] numArr2 = new Integer[numArr.length];
                for (int i19 = 0; i19 < 12; i19++) {
                    if (i19 > i11) {
                        numArr2[i19] = Integer.valueOf(numArr[i19].intValue() - i14);
                    } else {
                        Integer num = numArr[i19];
                        num.intValue();
                        numArr2[i19] = num;
                    }
                }
                f339898h3.put(Integer.valueOf(i10), numArr2);
                Integer[] numArr3 = f339899i3.get(Integer.valueOf(i10));
                if (numArr3 == null) {
                    if (!zIsLeapYear) {
                        numArr3 = new Integer[f339917s.length];
                        int i20 = 0;
                        while (true) {
                            int[] iArr3 = f339917s;
                            if (i20 >= iArr3.length) {
                                break;
                            }
                            numArr3[i20] = Integer.valueOf(iArr3[i20]);
                            i20++;
                        }
                    } else {
                        numArr3 = new Integer[f339919t.length];
                        int i21 = 0;
                        while (true) {
                            int[] iArr4 = f339919t;
                            if (i21 >= iArr4.length) {
                                break;
                            }
                            numArr3[i21] = Integer.valueOf(iArr4[i21]);
                            i21++;
                        }
                    }
                }
                Integer[] numArr4 = new Integer[numArr3.length];
                for (int i22 = 0; i22 < 12; i22++) {
                    if (i22 == i11) {
                        numArr4[i22] = Integer.valueOf(numArr3[i22].intValue() - i14);
                    } else {
                        Integer num2 = numArr3[i22];
                        num2.intValue();
                        numArr4[i22] = num2;
                    }
                }
                f339899i3.put(Integer.valueOf(i10), numArr4);
                if (i10 != i12) {
                    int i23 = i10 - 1;
                    int i24 = i23 / 30;
                    int i25 = i23 % 30;
                    Integer[] numArr5 = f339900j3.get(Integer.valueOf(i24));
                    if (numArr5 == null) {
                        int length = f339911p0.length;
                        Integer[] numArr6 = new Integer[length];
                        for (int i26 = 0; i26 < length; i26++) {
                            numArr6[i26] = Integer.valueOf(f339911p0[i26]);
                        }
                        numArr5 = numArr6;
                    }
                    for (int i27 = i25 + 1; i27 < f339911p0.length; i27++) {
                        numArr5[i27] = Integer.valueOf(numArr5[i27].intValue() - i14);
                    }
                    f339900j3.put(Integer.valueOf(i24), numArr5);
                    int i28 = i12 - 1;
                    int i29 = i28 / 30;
                    if (i24 != i29) {
                        int i30 = i24 + 1;
                        while (true) {
                            Long[] lArr = f339902k3;
                            if (i30 >= lArr.length) {
                                break;
                            }
                            lArr[i30] = Long.valueOf(lArr[i30].longValue() - ((long) i14));
                            i30++;
                            i16 = i16;
                            c11 = c11;
                        }
                        i15 = i16;
                        c10 = c11;
                        int i31 = i29 + 1;
                        while (true) {
                            Long[] lArr2 = f339902k3;
                            if (i31 >= lArr2.length) {
                                break;
                            }
                            lArr2[i31] = Long.valueOf(lArr2[i31].longValue() + ((long) i14));
                            i31++;
                            i29 = i29;
                        }
                    } else {
                        i15 = 1;
                        c10 = 11;
                    }
                    int i32 = i29;
                    int i33 = i28 % 30;
                    Integer[] numArr7 = f339900j3.get(Integer.valueOf(i32));
                    if (numArr7 == null) {
                        int length2 = f339911p0.length;
                        Integer[] numArr8 = new Integer[length2];
                        for (int i34 = 0; i34 < length2; i34++) {
                            numArr8[i34] = Integer.valueOf(f339911p0[i34]);
                        }
                        numArr7 = numArr8;
                    }
                    for (int i35 = i33 + i15; i35 < f339911p0.length; i35++) {
                        numArr7[i35] = Integer.valueOf(numArr7[i35].intValue() + i14);
                    }
                    f339900j3.put(Integer.valueOf(i32), numArr7);
                } else {
                    c10 = 11;
                }
                boolean zIsLeapYear2 = isLeapYear(i12);
                Integer[] numArr9 = f339898h3.get(Integer.valueOf(i12));
                if (numArr9 == null) {
                    if (!zIsLeapYear2) {
                        numArr9 = new Integer[f339907n.length];
                        int i36 = 0;
                        while (true) {
                            int[] iArr5 = f339907n;
                            if (i36 >= iArr5.length) {
                                break;
                            }
                            numArr9[i36] = Integer.valueOf(iArr5[i36]);
                            i36++;
                        }
                    } else {
                        numArr9 = new Integer[f339909o.length];
                        int i37 = 0;
                        while (true) {
                            int[] iArr6 = f339909o;
                            if (i37 >= iArr6.length) {
                                break;
                            }
                            numArr9[i37] = Integer.valueOf(iArr6[i37]);
                            i37++;
                        }
                    }
                }
                Integer[] numArr10 = new Integer[numArr9.length];
                for (int i38 = 0; i38 < 12; i38++) {
                    if (i38 > i13) {
                        numArr10[i38] = Integer.valueOf(numArr9[i38].intValue() + i14);
                    } else {
                        Integer num3 = numArr9[i38];
                        num3.intValue();
                        numArr10[i38] = num3;
                    }
                }
                f339898h3.put(Integer.valueOf(i12), numArr10);
                Integer[] numArr11 = f339899i3.get(Integer.valueOf(i12));
                if (numArr11 == null) {
                    if (!zIsLeapYear2) {
                        numArr11 = new Integer[f339917s.length];
                        int i39 = 0;
                        while (true) {
                            int[] iArr7 = f339917s;
                            if (i39 >= iArr7.length) {
                                break;
                            }
                            numArr11[i39] = Integer.valueOf(iArr7[i39]);
                            i39++;
                        }
                    } else {
                        numArr11 = new Integer[f339919t.length];
                        int i40 = 0;
                        while (true) {
                            int[] iArr8 = f339919t;
                            if (i40 >= iArr8.length) {
                                break;
                            }
                            numArr11[i40] = Integer.valueOf(iArr8[i40]);
                            i40++;
                        }
                    }
                }
                Integer[] numArr12 = new Integer[numArr11.length];
                for (int i41 = 0; i41 < 12; i41++) {
                    if (i41 == i13) {
                        numArr12[i41] = Integer.valueOf(numArr11[i41].intValue() + i14);
                    } else {
                        Integer num4 = numArr11[i41];
                        num4.intValue();
                        numArr12[i41] = num4;
                    }
                }
                HashMap<Integer, Integer[]> map = f339899i3;
                map.put(Integer.valueOf(i12), numArr12);
                Integer[] numArr13 = map.get(Integer.valueOf(i10));
                Integer[] numArr14 = map.get(Integer.valueOf(i12));
                HashMap<Integer, Integer[]> map2 = f339898h3;
                Integer[] numArr15 = map2.get(Integer.valueOf(i10));
                Integer[] numArr16 = map2.get(Integer.valueOf(i12));
                int iIntValue = numArr13[i11].intValue();
                int iIntValue2 = numArr14[i13].intValue();
                int iIntValue3 = numArr15[c10].intValue() + numArr13[c10].intValue();
                int iIntValue4 = numArr16[c10].intValue() + numArr14[c10].intValue();
                Integer[] numArr17 = f339908n3;
                int iIntValue5 = numArr17[5].intValue();
                Integer[] numArr18 = f339906m3;
                int iIntValue6 = numArr18[5].intValue();
                if (iIntValue5 < iIntValue) {
                    iIntValue5 = iIntValue;
                }
                if (iIntValue5 < iIntValue2) {
                    iIntValue5 = iIntValue2;
                }
                numArr17[5] = Integer.valueOf(iIntValue5);
                if (iIntValue6 <= iIntValue) {
                    iIntValue = iIntValue6;
                }
                if (iIntValue <= iIntValue2) {
                    iIntValue2 = iIntValue;
                }
                numArr18[5] = Integer.valueOf(iIntValue2);
                int iIntValue7 = numArr17[6].intValue();
                int iIntValue8 = numArr18[6].intValue();
                if (iIntValue7 < iIntValue3) {
                    iIntValue7 = iIntValue3;
                }
                if (iIntValue7 < iIntValue4) {
                    iIntValue7 = iIntValue4;
                }
                numArr17[6] = Integer.valueOf(iIntValue7);
                if (iIntValue8 <= iIntValue3) {
                    iIntValue3 = iIntValue8;
                }
                if (iIntValue3 <= iIntValue4) {
                    iIntValue4 = iIntValue3;
                }
                numArr18[6] = Integer.valueOf(iIntValue4);
                return;
            }
        }
        throw new IllegalArgumentException("startMonth < 0 || startMonth > 11");
    }

    private static void i0(int i10) {
        if (i10 < 1 || i10 > z0()) {
            throw new org.threeten.bp.b("Invalid day of month of Hijrah date, day " + i10 + " greater than " + z0() + " or less than 1");
        }
    }

    private static void j0(int i10) {
        if (i10 < 1 || i10 > A0()) {
            throw new org.threeten.bp.b("Invalid day of year of Hijrah date");
        }
    }

    private static void k0(int i10) {
        if (i10 < 1 || i10 > 12) {
            throw new org.threeten.bp.b("Invalid month of Hijrah date");
        }
    }

    private static void l0(int i10) {
        if (i10 < 1 || i10 > 9999) {
            throw new org.threeten.bp.b("Invalid year of Hijrah Era");
        }
    }

    public static m m0(org.threeten.bp.temporal.f fVar) {
        return l.f339891e.e(fVar);
    }

    private static Integer[] n0(int i10) {
        Integer[] numArr;
        try {
            numArr = f339900j3.get(Integer.valueOf(i10));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        return numArr == null ? f339918s3 : numArr;
    }

    private static Integer[] o0(int i10) {
        Integer[] numArr;
        try {
            numArr = f339898h3.get(Integer.valueOf(i10));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        if (numArr == null) {
            return isLeapYear((long) i10) ? f339914p3 : f339910o3;
        }
        return numArr;
    }

    private static Integer[] p0(int i10) {
        Integer[] numArr;
        try {
            numArr = f339899i3.get(Integer.valueOf(i10));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        if (numArr == null) {
            numArr = isLeapYear((long) i10) ? f339916r3 : f339915q3;
        }
        return numArr;
    }

    private static InputStream r0() throws IOException {
        ZipFile zipFile;
        String property = System.getProperty("org.threeten.bp.i18n.HijrahDate.deviationConfigFile");
        if (property == null) {
            property = f339913p2;
        }
        String property2 = System.getProperty("org.threeten.bp.i18n.HijrahDate.deviationConfigDir");
        if (property2 != null) {
            if (property2.length() != 0 || !property2.endsWith(System.getProperty("file.separator"))) {
                property2 = property2 + System.getProperty("file.separator");
            }
            File file = new File(property2 + f339912p1 + property);
            if (file.exists()) {
                return new FileInputStream(file);
            }
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(System.getProperty("java.class.path"), H1);
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            File file2 = new File(strNextToken);
            if (file2.exists()) {
                if (file2.isDirectory()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(strNextToken);
                    char c10 = f339912p1;
                    sb2.append(c10);
                    String str = f339897g3;
                    sb2.append(str);
                    if (new File(sb2.toString(), property).exists()) {
                        return new FileInputStream(strNextToken + c10 + str + c10 + property);
                    }
                } else {
                    try {
                        zipFile = new ZipFile(file2);
                    } catch (IOException unused) {
                        zipFile = null;
                    }
                    if (zipFile != null) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(f339897g3);
                        char c11 = f339912p1;
                        sb3.append(c11);
                        sb3.append(property);
                        String string = sb3.toString();
                        ZipEntry entry = zipFile.getEntry(string);
                        if (entry == null) {
                            if (c11 == '/') {
                                string = string.replace('/', '\\');
                            } else if (c11 == '\\') {
                                string = string.replace('\\', '/');
                            }
                            entry = zipFile.getEntry(string);
                        }
                        if (entry != null) {
                            return zipFile.getInputStream(entry);
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    private Object readResolve() {
        return new m(this.f339930i);
    }

    private static int s0(long j10) {
        Long[] lArr = f339902k3;
        for (int i10 = 0; i10 < lArr.length; i10++) {
            try {
                if (j10 < lArr[i10].longValue()) {
                    return i10 - 1;
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
                return ((int) j10) / 10631;
            }
        }
        return ((int) j10) / 10631;
    }

    private static int t0(long j10, int i10) {
        Long lValueOf;
        try {
            lValueOf = f339902k3[i10];
        } catch (ArrayIndexOutOfBoundsException unused) {
            lValueOf = null;
        }
        if (lValueOf == null) {
            lValueOf = Long.valueOf(i10 * 10631);
        }
        return (int) (j10 - lValueOf.longValue());
    }

    private static int u0(int i10, int i11, int i12) {
        int iIntValue;
        Integer[] numArrO0 = o0(i12);
        if (i10 < 0) {
            i10 = isLeapYear((long) i12) ? i10 + 355 : i10 + 354;
            if (i11 <= 0) {
                return i10;
            }
            iIntValue = numArrO0[i11].intValue();
        } else {
            if (i11 <= 0) {
                return i10;
            }
            iIntValue = numArrO0[i11].intValue();
        }
        return i10 - iIntValue;
    }

    private static int v0(int i10, int i11, int i12) {
        Integer[] numArrN0 = n0(i10);
        return i11 > 0 ? i11 - numArrN0[i12].intValue() : numArrN0[i12].intValue() + i11;
    }

    private Object writeReplace() {
        return new w((byte) 3, this);
    }

    private static long x0(int i10, int i11, int i12) {
        return d1(i10) + ((long) B0(i11 - 1, i10)) + ((long) i12);
    }

    private static int[] y0(long j10) {
        int i10;
        int iV0;
        int iD0;
        int iU0;
        int value;
        long j11 = j10 - (-492148);
        if (j11 >= 0) {
            int iS0 = s0(j11);
            int iT0 = t0(j11, iS0);
            int iG0 = G0(iS0, iT0);
            iV0 = v0(iS0, iT0, iG0);
            i10 = (iS0 * 30) + iG0 + 1;
            iD0 = D0(iV0, i10);
            iU0 = u0(iV0, iD0, i10) + 1;
            value = n.AH.getValue();
        } else {
            int i11 = (int) j11;
            int i12 = i11 / 10631;
            int i13 = i11 % 10631;
            if (i13 == 0) {
                i12++;
                i13 = -10631;
            }
            int iG1 = G0(i12, i13);
            int iV1 = v0(i12, i13, iG1);
            i10 = 1 - ((i12 * 30) - iG1);
            iV0 = isLeapYear((long) i10) ? iV1 + 355 : iV1 + 354;
            iD0 = D0(iV0, i10);
            iU0 = u0(iV0, iD0, i10) + 1;
            value = n.BEFORE_AH.getValue();
        }
        int i14 = (int) ((j10 - (-492153)) % 7);
        return new int[]{value, i10, iD0 + 1, iU0, iV0 + 1, i14 + (i14 <= 0 ? 7 : 0)};
    }

    static int z0() {
        return f339908n3[5].intValue();
    }

    @Override // org.threeten.bp.chrono.c, cn.b, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: I0, reason: merged with bridge method [inline-methods] */
    public m f(long j10, org.threeten.bp.temporal.m mVar) {
        return (m) super.f(j10, mVar);
    }

    @Override // org.threeten.bp.chrono.c, cn.b, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public m p(org.threeten.bp.temporal.i iVar) {
        return (m) super.p(iVar);
    }

    @Override // org.threeten.bp.chrono.b, org.threeten.bp.chrono.c, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public m v(long j10, org.threeten.bp.temporal.m mVar) {
        return (m) super.v(j10, mVar);
    }

    @Override // org.threeten.bp.chrono.c, cn.b, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public m n(org.threeten.bp.temporal.i iVar) {
        return (m) super.n(iVar);
    }

    @Override // org.threeten.bp.chrono.b, org.threeten.bp.chrono.c
    public /* bridge */ /* synthetic */ f U(c cVar) {
        return super.U(cVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.threeten.bp.chrono.b
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public m d0(long j10) {
        return new m(this.f339930i + j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.threeten.bp.chrono.b
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public m e0(long j10) {
        if (j10 == 0) {
            return this;
        }
        int i10 = (this.f339926e - 1) + ((int) j10);
        int iP = i10 / 12;
        int i11 = i10 % 12;
        while (i11 < 0) {
            i11 += 12;
            iP = cn.d.p(iP, 1);
        }
        return P0(this.f339924c, cn.d.k(this.f339925d, iP), i11 + 1, this.f339927f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.threeten.bp.chrono.b
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public m g0(long j10) {
        if (j10 == 0) {
            return this;
        }
        return P0(this.f339924c, cn.d.k(this.f339925d, (int) j10), this.f339926e, this.f339927f);
    }

    @Override // org.threeten.bp.chrono.c, cn.b, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public m s(org.threeten.bp.temporal.g gVar) {
        return (m) super.s(gVar);
    }

    @Override // org.threeten.bp.chrono.c, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: b1, reason: merged with bridge method [inline-methods] */
    public m o(org.threeten.bp.temporal.j jVar, long j10) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return (m) jVar.b(this, j10);
        }
        org.threeten.bp.temporal.a aVar = (org.threeten.bp.temporal.a) jVar;
        aVar.l(j10);
        int i10 = (int) j10;
        switch (a.f339932a[aVar.ordinal()]) {
            case 1:
                return Z0(this.f339925d, this.f339926e, i10);
            case 2:
                int i11 = i10 - 1;
                return Z0(this.f339925d, (i11 / 30) + 1, (i11 % 30) + 1);
            case 3:
                return d0((j10 - t(org.threeten.bp.temporal.a.f340351p2)) * 7);
            case 4:
                if (this.f339925d < 1) {
                    i10 = 1 - i10;
                }
                return Z0(i10, this.f339926e, this.f339927f);
            case 5:
                return d0(j10 - ((long) this.f339929h.getValue()));
            case 6:
                return d0(j10 - t(org.threeten.bp.temporal.a.Y));
            case 7:
                return d0(j10 - t(org.threeten.bp.temporal.a.Z));
            case 8:
                return new m(i10);
            case 9:
                return d0((j10 - t(org.threeten.bp.temporal.a.f340332g3)) * 7);
            case 10:
                return Z0(this.f339925d, i10, this.f339927f);
            case 11:
                return Z0(i10, this.f339926e, this.f339927f);
            case 12:
                return Z0(1 - this.f339925d, this.f339926e, this.f339927f);
            default:
                throw new org.threeten.bp.temporal.n("Unsupported field: " + jVar);
        }
    }

    @Override // cn.c, org.threeten.bp.temporal.f
    public org.threeten.bp.temporal.o c(org.threeten.bp.temporal.j jVar) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return jVar.d(this);
        }
        if (!q(jVar)) {
            throw new org.threeten.bp.temporal.n("Unsupported field: " + jVar);
        }
        org.threeten.bp.temporal.a aVar = (org.threeten.bp.temporal.a) jVar;
        int i10 = a.f339932a[aVar.ordinal()];
        if (i10 == 1) {
            return org.threeten.bp.temporal.o.k(1L, lengthOfMonth());
        }
        if (i10 == 2) {
            return org.threeten.bp.temporal.o.k(1L, lengthOfYear());
        }
        if (i10 != 3) {
            return i10 != 4 ? E().L(aVar) : org.threeten.bp.temporal.o.k(1L, 1000L);
        }
        return org.threeten.bp.temporal.o.k(1L, 5L);
    }

    void c1(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(l(org.threeten.bp.temporal.a.f340340k3));
        dataOutput.writeByte(l(org.threeten.bp.temporal.a.f340334h3));
        dataOutput.writeByte(l(org.threeten.bp.temporal.a.f340349p0));
    }

    @Override // org.threeten.bp.chrono.c
    public boolean isLeapYear() {
        return this.f339931j;
    }

    @Override // org.threeten.bp.chrono.b, org.threeten.bp.temporal.e
    public /* bridge */ /* synthetic */ long k(org.threeten.bp.temporal.e eVar, org.threeten.bp.temporal.m mVar) {
        return super.k(eVar, mVar);
    }

    @Override // org.threeten.bp.chrono.c
    public int lengthOfMonth() {
        return C0(this.f339926e - 1, this.f339925d);
    }

    @Override // org.threeten.bp.chrono.c
    public int lengthOfYear() {
        return H0(this.f339925d);
    }

    @Override // org.threeten.bp.chrono.c
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public l E() {
        return l.f339891e;
    }

    @Override // org.threeten.bp.temporal.f
    public long t(org.threeten.bp.temporal.j jVar) {
        int value;
        int i10;
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return jVar.e(this);
        }
        switch (a.f339932a[((org.threeten.bp.temporal.a) jVar).ordinal()]) {
            case 1:
                value = this.f339927f;
                return value;
            case 2:
                value = this.f339928g;
                return value;
            case 3:
                i10 = (this.f339927f - 1) / 7;
                value = i10 + 1;
                return value;
            case 4:
                value = this.f339925d;
                return value;
            case 5:
                value = this.f339929h.getValue();
                return value;
            case 6:
                i10 = (this.f339927f - 1) % 7;
                value = i10 + 1;
                return value;
            case 7:
                i10 = (this.f339928g - 1) % 7;
                value = i10 + 1;
                return value;
            case 8:
                return toEpochDay();
            case 9:
                i10 = (this.f339928g - 1) / 7;
                value = i10 + 1;
                return value;
            case 10:
                value = this.f339926e;
                return value;
            case 11:
                value = this.f339925d;
                return value;
            case 12:
                value = this.f339924c.getValue();
                return value;
            default:
                throw new org.threeten.bp.temporal.n("Unsupported field: " + jVar);
        }
    }

    @Override // org.threeten.bp.chrono.c
    public long toEpochDay() {
        return x0(this.f339925d, this.f339926e, this.f339927f);
    }

    @Override // org.threeten.bp.chrono.b, org.threeten.bp.chrono.c
    public final d<m> w(org.threeten.bp.i iVar) {
        return super.w(iVar);
    }

    @Override // org.threeten.bp.chrono.c
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public n H() {
        return this.f339924c;
    }

    static boolean isLeapYear(long j10) {
        if (j10 <= 0) {
            j10 = -j10;
        }
        return ((j10 * 11) + 14) % 30 < 11;
    }
}
