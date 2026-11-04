package org.apache.commons.lang3;

import com.rabbitmq.client.k0;
import java.util.UUID;
import kotlin.e2;

/* JADX INFO: loaded from: classes14.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean[] f337210a = {true, true, true, true};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean[] f337211b = {false, true, true, true};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean[] f337212c = {true, false, true, true};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean[] f337213d = {false, false, true, true};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean[] f337214e = {true, true, false, true};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean[] f337215f = {false, true, false, true};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean[] f337216g = {true, false, false, true};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final boolean[] f337217h = {false, false, false, true};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final boolean[] f337218i = {true, true, true, false};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final boolean[] f337219j = {false, true, true, false};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final boolean[] f337220k = {true, false, true, false};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final boolean[] f337221l = {false, false, true, false};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final boolean[] f337222m = {true, true, false, false};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final boolean[] f337223n = {false, true, false, false};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final boolean[] f337224o = {true, false, false, false};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final boolean[] f337225p = {false, false, false, false};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final /* synthetic */ boolean f337226q = false;

    public static byte[] A(int i10, int i11, byte[] bArr, int i12, int i13) {
        if (i13 != 0) {
            if (((i13 - 1) * 8) + i11 >= 32) {
                throw new IllegalArgumentException("(nBytes-1)*8+srcPos is greater or equal to than 32");
            }
            for (int i14 = 0; i14 < i13; i14++) {
                bArr[i12 + i14] = (byte) ((i10 >> ((i14 * 8) + i11)) & 255);
            }
        }
        return bArr;
    }

    public static String B(int i10, int i11, String str, int i12, int i13) {
        if (i13 == 0) {
            return str;
        }
        if (((i13 - 1) * 4) + i11 >= 32) {
            throw new IllegalArgumentException("(nHexs-1)*4+srcPos is greater or equal to than 32");
        }
        StringBuilder sb2 = new StringBuilder(str);
        int length = sb2.length();
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = (i10 >> ((i14 * 4) + i11)) & 15;
            int i16 = i12 + i14;
            if (i16 == length) {
                length++;
                sb2.append(C(i15));
            } else {
                sb2.setCharAt(i16, C(i15));
            }
        }
        return sb2.toString();
    }

    public static char C(int i10) {
        char cForDigit = Character.forDigit(i10, 16);
        if (cForDigit != 0) {
            return cForDigit;
        }
        throw new IllegalArgumentException("nibble value not between 0 and 15: " + i10);
    }

    public static char D(int i10) {
        switch (i10) {
            case 0:
                return org.locationtech.jts.geom.l.f338160j;
            case 1:
                return '8';
            case 2:
                return '4';
            case 3:
                return 'c';
            case 4:
                return org.locationtech.jts.geom.l.f338162l;
            case 5:
                return 'a';
            case 6:
                return '6';
            case 7:
                return 'e';
            case 8:
                return org.locationtech.jts.geom.l.f338161k;
            case 9:
                return '9';
            case 10:
                return '5';
            case 11:
                return ni.f.f333369f;
            case 12:
                return '3';
            case 13:
                return 'b';
            case 14:
                return '7';
            case 15:
                return 'f';
            default:
                throw new IllegalArgumentException("nibble value not between 0 and 15: " + i10);
        }
    }

    public static short[] E(int i10, int i11, short[] sArr, int i12, int i13) {
        if (i13 != 0) {
            if (((i13 - 1) * 16) + i11 >= 32) {
                throw new IllegalArgumentException("(nShorts-1)*16+srcPos is greater or equal to than 32");
            }
            for (int i14 = 0; i14 < i13; i14++) {
                sArr[i12 + i14] = (short) ((i10 >> ((i14 * 16) + i11)) & 65535);
            }
        }
        return sArr;
    }

    public static boolean[] F(long j10, int i10, boolean[] zArr, int i11, int i12) {
        if (i12 != 0) {
            if ((i12 - 1) + i10 >= 64) {
                throw new IllegalArgumentException("nBools-1+srcPos is greater or equal to than 64");
            }
            for (int i13 = 0; i13 < i12; i13++) {
                zArr[i11 + i13] = (1 & (j10 >> (i13 + i10))) != 0;
            }
        }
        return zArr;
    }

    public static byte[] G(long j10, int i10, byte[] bArr, int i11, int i12) {
        if (i12 != 0) {
            if (((i12 - 1) * 8) + i10 >= 64) {
                throw new IllegalArgumentException("(nBytes-1)*8+srcPos is greater or equal to than 64");
            }
            for (int i13 = 0; i13 < i12; i13++) {
                bArr[i11 + i13] = (byte) (255 & (j10 >> ((i13 * 8) + i10)));
            }
        }
        return bArr;
    }

    public static String H(long j10, int i10, String str, int i11, int i12) {
        if (i12 == 0) {
            return str;
        }
        if (((i12 - 1) * 4) + i10 >= 64) {
            throw new IllegalArgumentException("(nHexs-1)*4+srcPos is greater or equal to than 64");
        }
        StringBuilder sb2 = new StringBuilder(str);
        int length = sb2.length();
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = (int) ((j10 >> ((i13 * 4) + i10)) & 15);
            int i15 = i11 + i13;
            if (i15 == length) {
                length++;
                sb2.append(C(i14));
            } else {
                sb2.setCharAt(i15, C(i14));
            }
        }
        return sb2.toString();
    }

    public static int[] I(long j10, int i10, int[] iArr, int i11, int i12) {
        if (i12 != 0) {
            if (((i12 - 1) * 32) + i10 >= 64) {
                throw new IllegalArgumentException("(nInts-1)*32+srcPos is greater or equal to than 64");
            }
            for (int i13 = 0; i13 < i12; i13++) {
                iArr[i11 + i13] = (int) (j10 >> ((i13 * 32) + i10));
            }
        }
        return iArr;
    }

    public static short[] J(long j10, int i10, short[] sArr, int i11, int i12) {
        if (i12 != 0) {
            if (((i12 - 1) * 16) + i10 >= 64) {
                throw new IllegalArgumentException("(nShorts-1)*16+srcPos is greater or equal to than 64");
            }
            for (int i13 = 0; i13 < i12; i13++) {
                sArr[i11 + i13] = (short) (okhttp3.internal.ws.g.f334653t & (j10 >> ((i13 * 16) + i10)));
            }
        }
        return sArr;
    }

    public static int K(short[] sArr, int i10, int i11, int i12, int i13) {
        if ((sArr.length == 0 && i10 == 0) || i13 == 0) {
            return i11;
        }
        if (((i13 - 1) * 16) + i12 >= 32) {
            throw new IllegalArgumentException("(nShorts-1)*16+dstPos is greater or equal to than 32");
        }
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = (i14 * 16) + i12;
            i11 = (i11 & (~(65535 << i15))) | ((sArr[i14 + i10] & e2.f312492d) << i15);
        }
        return i11;
    }

    public static long L(short[] sArr, int i10, long j10, int i11, int i12) {
        if ((sArr.length == 0 && i10 == 0) || i12 == 0) {
            return j10;
        }
        if (((i12 - 1) * 16) + i11 >= 64) {
            throw new IllegalArgumentException("(nShorts-1)*16+dstPos is greater or equal to than 64");
        }
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = (i13 * 16) + i11;
            j10 = (j10 & (~(okhttp3.internal.ws.g.f334653t << i14))) | ((((long) sArr[i13 + i10]) & okhttp3.internal.ws.g.f334653t) << i14);
        }
        return j10;
    }

    public static boolean[] M(short s10, int i10, boolean[] zArr, int i11, int i12) {
        if (i12 != 0) {
            if ((i12 - 1) + i10 >= 16) {
                throw new IllegalArgumentException("nBools-1+srcPos is greater or equal to than 16");
            }
            for (int i13 = 0; i13 < i12; i13++) {
                int i14 = i11 + i13;
                boolean z10 = true;
                if (((s10 >> (i13 + i10)) & 1) == 0) {
                    z10 = false;
                }
                zArr[i14] = z10;
            }
        }
        return zArr;
    }

    public static byte[] N(short s10, int i10, byte[] bArr, int i11, int i12) {
        if (i12 != 0) {
            if (((i12 - 1) * 8) + i10 >= 16) {
                throw new IllegalArgumentException("(nBytes-1)*8+srcPos is greater or equal to than 16");
            }
            for (int i13 = 0; i13 < i12; i13++) {
                bArr[i11 + i13] = (byte) ((s10 >> ((i13 * 8) + i10)) & 255);
            }
        }
        return bArr;
    }

    public static String O(short s10, int i10, String str, int i11, int i12) {
        if (i12 == 0) {
            return str;
        }
        if (((i12 - 1) * 4) + i10 >= 16) {
            throw new IllegalArgumentException("(nHexs-1)*4+srcPos is greater or equal to than 16");
        }
        StringBuilder sb2 = new StringBuilder(str);
        int length = sb2.length();
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = (s10 >> ((i13 * 4) + i10)) & 15;
            int i15 = i11 + i13;
            if (i15 == length) {
                length++;
                sb2.append(C(i14));
            } else {
                sb2.setCharAt(i15, C(i14));
            }
        }
        return sb2.toString();
    }

    public static byte[] P(UUID uuid, byte[] bArr, int i10, int i11) {
        if (i11 != 0) {
            if (i11 > 16) {
                throw new IllegalArgumentException("nBytes is greater than 16");
            }
            G(uuid.getMostSignificantBits(), 0, bArr, i10, i11 > 8 ? 8 : i11);
            if (i11 >= 8) {
                G(uuid.getLeastSignificantBits(), 0, bArr, i10 + 8, i11 - 8);
            }
        }
        return bArr;
    }

    public static char a(boolean[] zArr) {
        return b(zArr, 0);
    }

    public static char b(boolean[] zArr, int i10) {
        if (zArr.length == 0) {
            throw new IllegalArgumentException("Cannot convert an empty array.");
        }
        int length = ((zArr.length - 1) - i10) + 1;
        int iMin = Math.min(4, length);
        boolean[] zArr2 = new boolean[4];
        System.arraycopy(zArr, length - iMin, zArr2, 4 - iMin, iMin);
        if (zArr2[0]) {
            if (!zArr2[1]) {
                if (zArr2[2]) {
                    return zArr2[3] ? 'b' : 'a';
                }
                return zArr2[3] ? '9' : '8';
            }
            if (zArr2[2]) {
                return zArr2[3] ? 'f' : 'e';
            }
            if (zArr2[3]) {
                return ni.f.f333369f;
            }
            return 'c';
        }
        if (zArr2[1]) {
            if (zArr2[2]) {
                return zArr2[3] ? '7' : '6';
            }
            return zArr2[3] ? '5' : '4';
        }
        if (!zArr2[2]) {
            return zArr2[3] ? org.locationtech.jts.geom.l.f338161k : org.locationtech.jts.geom.l.f338160j;
        }
        if (zArr2[3]) {
            return '3';
        }
        return org.locationtech.jts.geom.l.f338162l;
    }

    public static byte c(boolean[] zArr, int i10, byte b10, int i11, int i12) {
        if ((zArr.length == 0 && i10 == 0) || i12 == 0) {
            return b10;
        }
        if ((i12 - 1) + i11 >= 8) {
            throw new IllegalArgumentException("nBools-1+dstPos is greater or equal to than 8");
        }
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i13 + i11;
            b10 = (byte) ((b10 & (~(1 << i14))) | ((zArr[i13 + i10] ? 1 : 0) << i14));
        }
        return b10;
    }

    public static char d(boolean[] zArr) {
        return e(zArr, 0);
    }

    public static char e(boolean[] zArr, int i10) {
        if (zArr.length == 0) {
            throw new IllegalArgumentException("Cannot convert an empty array.");
        }
        int i11 = i10 + 3;
        if (zArr.length <= i11 || !zArr[i11]) {
            int i12 = i10 + 2;
            if (zArr.length > i12 && zArr[i12]) {
                int i13 = i10 + 1;
                if (zArr.length <= i13 || !zArr[i13]) {
                    return zArr[i10] ? '5' : '4';
                }
                return zArr[i10] ? '7' : '6';
            }
            int i14 = i10 + 1;
            if (zArr.length <= i14 || !zArr[i14]) {
                return zArr[i10] ? org.locationtech.jts.geom.l.f338161k : org.locationtech.jts.geom.l.f338160j;
            }
            if (zArr[i10]) {
                return '3';
            }
            return org.locationtech.jts.geom.l.f338162l;
        }
        int i15 = i10 + 2;
        if (zArr.length <= i15 || !zArr[i15]) {
            int i16 = i10 + 1;
            if (zArr.length <= i16 || !zArr[i16]) {
                return zArr[i10] ? '9' : '8';
            }
            return zArr[i10] ? 'b' : 'a';
        }
        int i17 = i10 + 1;
        if (zArr.length > i17 && zArr[i17]) {
            return zArr[i10] ? 'f' : 'e';
        }
        if (zArr[i10]) {
            return ni.f.f333369f;
        }
        return 'c';
    }

    public static char f(boolean[] zArr) {
        return g(zArr, 0);
    }

    public static char g(boolean[] zArr, int i10) {
        if (zArr.length > 8) {
            throw new IllegalArgumentException("src.length>8: src.length=" + zArr.length);
        }
        if (zArr.length - i10 < 4) {
            throw new IllegalArgumentException("src.length-srcPos<4: src.length=" + zArr.length + ", srcPos=" + i10);
        }
        if (zArr[i10 + 3]) {
            if (zArr[i10 + 2]) {
                if (zArr[i10 + 1]) {
                    return zArr[i10] ? 'f' : '7';
                }
                return zArr[i10] ? 'b' : '3';
            }
            if (zArr[i10 + 1]) {
                if (zArr[i10]) {
                    return ni.f.f333369f;
                }
                return '5';
            }
            if (zArr[i10]) {
                return '9';
            }
            return org.locationtech.jts.geom.l.f338161k;
        }
        if (zArr[i10 + 2]) {
            if (zArr[i10 + 1]) {
                return zArr[i10] ? 'e' : '6';
            }
            if (zArr[i10]) {
                return 'a';
            }
            return org.locationtech.jts.geom.l.f338162l;
        }
        if (zArr[i10 + 1]) {
            return zArr[i10] ? 'c' : '4';
        }
        if (zArr[i10]) {
            return '8';
        }
        return org.locationtech.jts.geom.l.f338160j;
    }

    public static int h(boolean[] zArr, int i10, int i11, int i12, int i13) {
        if ((zArr.length == 0 && i10 == 0) || i13 == 0) {
            return i11;
        }
        if ((i13 - 1) + i12 >= 32) {
            throw new IllegalArgumentException("nBools-1+dstPos is greater or equal to than 32");
        }
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = i14 + i12;
            i11 = (i11 & (~(1 << i15))) | ((zArr[i14 + i10] ? 1 : 0) << i15);
        }
        return i11;
    }

    public static long i(boolean[] zArr, int i10, long j10, int i11, int i12) {
        if ((zArr.length == 0 && i10 == 0) || i12 == 0) {
            return j10;
        }
        if ((i12 - 1) + i11 >= 64) {
            throw new IllegalArgumentException("nBools-1+dstPos is greater or equal to than 64");
        }
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i13 + i11;
            j10 = (j10 & (~(1 << i14))) | ((zArr[i13 + i10] ? 1L : 0L) << i14);
        }
        return j10;
    }

    public static short j(boolean[] zArr, int i10, short s10, int i11, int i12) {
        if ((zArr.length == 0 && i10 == 0) || i12 == 0) {
            return s10;
        }
        if ((i12 - 1) + i11 >= 16) {
            throw new IllegalArgumentException("nBools-1+dstPos is greater or equal to than 16");
        }
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i13 + i11;
            s10 = (short) ((s10 & (~(1 << i14))) | ((zArr[i13 + i10] ? 1 : 0) << i14));
        }
        return s10;
    }

    public static int k(byte[] bArr, int i10, int i11, int i12, int i13) {
        if ((bArr.length == 0 && i10 == 0) || i13 == 0) {
            return i11;
        }
        if (((i13 - 1) * 8) + i12 >= 32) {
            throw new IllegalArgumentException("(nBytes-1)*8+dstPos is greater or equal to than 32");
        }
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = (i14 * 8) + i12;
            i11 = (i11 & (~(255 << i15))) | ((bArr[i14 + i10] & 255) << i15);
        }
        return i11;
    }

    public static long l(byte[] bArr, int i10, long j10, int i11, int i12) {
        if ((bArr.length == 0 && i10 == 0) || i12 == 0) {
            return j10;
        }
        if (((i12 - 1) * 8) + i11 >= 64) {
            throw new IllegalArgumentException("(nBytes-1)*8+dstPos is greater or equal to than 64");
        }
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = (i13 * 8) + i11;
            j10 = (j10 & (~(255 << i14))) | ((((long) bArr[i13 + i10]) & 255) << i14);
        }
        return j10;
    }

    public static short m(byte[] bArr, int i10, short s10, int i11, int i12) {
        if ((bArr.length == 0 && i10 == 0) || i12 == 0) {
            return s10;
        }
        if (((i12 - 1) * 8) + i11 >= 16) {
            throw new IllegalArgumentException("(nBytes-1)*8+dstPos is greater or equal to than 16");
        }
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = (i13 * 8) + i11;
            s10 = (short) ((s10 & (~(255 << i14))) | ((bArr[i13 + i10] & 255) << i14));
        }
        return s10;
    }

    public static UUID n(byte[] bArr, int i10) {
        if (bArr.length - i10 >= 16) {
            return new UUID(l(bArr, i10, 0L, 0, 8), l(bArr, i10 + 8, 0L, 0, 8));
        }
        throw new IllegalArgumentException("Need at least 16 bytes for UUID");
    }

    public static boolean[] o(byte b10, int i10, boolean[] zArr, int i11, int i12) {
        if (i12 != 0) {
            if ((i12 - 1) + i10 >= 8) {
                throw new IllegalArgumentException("nBools-1+srcPos is greater or equal to than 8");
            }
            for (int i13 = 0; i13 < i12; i13++) {
                int i14 = i11 + i13;
                boolean z10 = true;
                if (((b10 >> (i13 + i10)) & 1) == 0) {
                    z10 = false;
                }
                zArr[i14] = z10;
            }
        }
        return zArr;
    }

    public static String p(byte b10, int i10, String str, int i11, int i12) {
        if (i12 == 0) {
            return str;
        }
        if (((i12 - 1) * 4) + i10 >= 8) {
            throw new IllegalArgumentException("(nHexs-1)*4+srcPos is greater or equal to than 8");
        }
        StringBuilder sb2 = new StringBuilder(str);
        int length = sb2.length();
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = (b10 >> ((i13 * 4) + i10)) & 15;
            int i15 = i11 + i13;
            if (i15 == length) {
                length++;
                sb2.append(C(i14));
            } else {
                sb2.setCharAt(i15, C(i14));
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003e  */
    /* JADX WARN: Code duplicated, block: B:13:0x004b  */
    /* JADX WARN: Code duplicated, block: B:15:0x0057  */
    /* JADX WARN: Code duplicated, block: B:17:0x0060  */
    /* JADX WARN: Code duplicated, block: B:7:0x002b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0034  */
    public static boolean[] q(char c10) {
        switch (c10) {
            case '0':
                return (boolean[]) f337225p.clone();
            case '1':
                return (boolean[]) f337217h.clone();
            case '2':
                return (boolean[]) f337221l.clone();
            case '3':
                return (boolean[]) f337213d.clone();
            case '4':
                return (boolean[]) f337223n.clone();
            case '5':
                return (boolean[]) f337215f.clone();
            case '6':
                return (boolean[]) f337219j.clone();
            case '7':
                return (boolean[]) f337211b.clone();
            case com.planner5d.library.engine.input.f.b.f160729t0 /* 56 */:
                return (boolean[]) f337224o.clone();
            case com.planner5d.library.engine.input.f.b.f160707m /* 57 */:
                return (boolean[]) f337216g.clone();
            default:
                switch (c10) {
                    case 'A':
                        return (boolean[]) f337220k.clone();
                    case 'B':
                        return (boolean[]) f337212c.clone();
                    case 'C':
                        return (boolean[]) f337222m.clone();
                    case com.planner5d.library.engine.input.f.b.V /* 68 */:
                        return (boolean[]) f337214e.clone();
                    case com.planner5d.library.engine.input.f.b.f160708m0 /* 69 */:
                        return (boolean[]) f337218i.clone();
                    case 'F':
                        return (boolean[]) f337210a.clone();
                    default:
                        switch (c10) {
                            case com.planner5d.library.engine.input.f.b.f160715o1 /* 97 */:
                                return (boolean[]) f337220k.clone();
                            case com.planner5d.library.engine.input.f.b.f160718p1 /* 98 */:
                                return (boolean[]) f337212c.clone();
                            case 'c':
                                return (boolean[]) f337222m.clone();
                            case 'd':
                                return (boolean[]) f337214e.clone();
                            case 'e':
                                return (boolean[]) f337218i.clone();
                            case 'f':
                                return (boolean[]) f337210a.clone();
                            default:
                                throw new IllegalArgumentException("Cannot interpret '" + c10 + "' as a hexadecimal digit");
                        }
                }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0034  */
    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    public static int r(char c10) {
        switch (c10) {
            case '0':
                return 0;
            case '1':
                return 8;
            case '2':
                return 4;
            case '3':
                return 12;
            case '4':
                return 2;
            case '5':
                return 10;
            case '6':
                return 6;
            case '7':
                return 14;
            case com.planner5d.library.engine.input.f.b.f160729t0 /* 56 */:
                return 1;
            case com.planner5d.library.engine.input.f.b.f160707m /* 57 */:
                return 9;
            default:
                switch (c10) {
                    case 'A':
                        return 5;
                    case 'B':
                        return 13;
                    case 'C':
                        return 3;
                    case com.planner5d.library.engine.input.f.b.V /* 68 */:
                        return 11;
                    case com.planner5d.library.engine.input.f.b.f160708m0 /* 69 */:
                        return 7;
                    case 'F':
                        return 15;
                    default:
                        switch (c10) {
                            case com.planner5d.library.engine.input.f.b.f160715o1 /* 97 */:
                                return 5;
                            case com.planner5d.library.engine.input.f.b.f160718p1 /* 98 */:
                                return 13;
                            case 'c':
                                return 3;
                            case 'd':
                                return 11;
                            case 'e':
                                return 7;
                            case 'f':
                                return 15;
                            default:
                                throw new IllegalArgumentException("Cannot interpret '" + c10 + "' as a hexadecimal digit");
                        }
                }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0034  */
    /* JADX WARN: Code duplicated, block: B:12:0x003e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0048  */
    /* JADX WARN: Code duplicated, block: B:16:0x0052  */
    /* JADX WARN: Code duplicated, block: B:18:0x005d  */
    /* JADX WARN: Code duplicated, block: B:8:0x0029  */
    public static boolean[] s(char c10) {
        switch (c10) {
            case '0':
                return (boolean[]) f337225p.clone();
            case '1':
                return (boolean[]) f337224o.clone();
            case '2':
                return (boolean[]) f337223n.clone();
            case '3':
                return (boolean[]) f337222m.clone();
            case '4':
                return (boolean[]) f337221l.clone();
            case '5':
                return (boolean[]) f337220k.clone();
            case '6':
                return (boolean[]) f337219j.clone();
            case '7':
                return (boolean[]) f337218i.clone();
            case com.planner5d.library.engine.input.f.b.f160729t0 /* 56 */:
                return (boolean[]) f337217h.clone();
            case com.planner5d.library.engine.input.f.b.f160707m /* 57 */:
                return (boolean[]) f337216g.clone();
            default:
                switch (c10) {
                    case 'A':
                        return (boolean[]) f337215f.clone();
                    case 'B':
                        return (boolean[]) f337214e.clone();
                    case 'C':
                        return (boolean[]) f337213d.clone();
                    case com.planner5d.library.engine.input.f.b.V /* 68 */:
                        return (boolean[]) f337212c.clone();
                    case com.planner5d.library.engine.input.f.b.f160708m0 /* 69 */:
                        return (boolean[]) f337211b.clone();
                    case 'F':
                        return (boolean[]) f337210a.clone();
                    default:
                        switch (c10) {
                            case com.planner5d.library.engine.input.f.b.f160715o1 /* 97 */:
                                return (boolean[]) f337215f.clone();
                            case com.planner5d.library.engine.input.f.b.f160718p1 /* 98 */:
                                return (boolean[]) f337214e.clone();
                            case 'c':
                                return (boolean[]) f337213d.clone();
                            case 'd':
                                return (boolean[]) f337212c.clone();
                            case 'e':
                                return (boolean[]) f337211b.clone();
                            case 'f':
                                return (boolean[]) f337210a.clone();
                            default:
                                throw new IllegalArgumentException("Cannot interpret '" + c10 + "' as a hexadecimal digit");
                        }
                }
        }
    }

    public static int t(char c10) {
        int iDigit = Character.digit(c10, 16);
        if (iDigit >= 0) {
            return iDigit;
        }
        throw new IllegalArgumentException("Cannot interpret '" + c10 + "' as a hexadecimal digit");
    }

    public static byte u(String str, int i10, byte b10, int i11, int i12) {
        if (i12 == 0) {
            return b10;
        }
        if (((i12 - 1) * 4) + i11 >= 8) {
            throw new IllegalArgumentException("(nHexs-1)*4+dstPos is greater or equal to than 8");
        }
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = (i13 * 4) + i11;
            b10 = (byte) ((b10 & (~(15 << i14))) | ((t(str.charAt(i13 + i10)) & 15) << i14));
        }
        return b10;
    }

    public static int v(String str, int i10, int i11, int i12, int i13) {
        if (i13 == 0) {
            return i11;
        }
        if (((i13 - 1) * 4) + i12 >= 32) {
            throw new IllegalArgumentException("(nHexs-1)*4+dstPos is greater or equal to than 32");
        }
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = (i14 * 4) + i12;
            i11 = (i11 & (~(15 << i15))) | ((t(str.charAt(i14 + i10)) & 15) << i15);
        }
        return i11;
    }

    public static long w(String str, int i10, long j10, int i11, int i12) {
        if (i12 == 0) {
            return j10;
        }
        if (((i12 - 1) * 4) + i11 >= 64) {
            throw new IllegalArgumentException("(nHexs-1)*4+dstPos is greater or equal to than 64");
        }
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = (i13 * 4) + i11;
            j10 = (j10 & (~(15 << i14))) | ((((long) t(str.charAt(i13 + i10))) & 15) << i14);
        }
        return j10;
    }

    public static short x(String str, int i10, short s10, int i11, int i12) {
        if (i12 == 0) {
            return s10;
        }
        if (((i12 - 1) * 4) + i11 >= 16) {
            throw new IllegalArgumentException("(nHexs-1)*4+dstPos is greater or equal to than 16");
        }
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = (i13 * 4) + i11;
            s10 = (short) ((s10 & (~(15 << i14))) | ((t(str.charAt(i13 + i10)) & 15) << i14));
        }
        return s10;
    }

    public static long y(int[] iArr, int i10, long j10, int i11, int i12) {
        if ((iArr.length == 0 && i10 == 0) || i12 == 0) {
            return j10;
        }
        if (((i12 - 1) * 32) + i11 >= 64) {
            throw new IllegalArgumentException("(nInts-1)*32+dstPos is greater or equal to than 64");
        }
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = (i13 * 32) + i11;
            j10 = (j10 & (~(k0.f265952a << i14))) | ((((long) iArr[i13 + i10]) & k0.f265952a) << i14);
        }
        return j10;
    }

    public static boolean[] z(int i10, int i11, boolean[] zArr, int i12, int i13) {
        if (i13 != 0) {
            if ((i13 - 1) + i11 >= 32) {
                throw new IllegalArgumentException("nBools-1+srcPos is greater or equal to than 32");
            }
            for (int i14 = 0; i14 < i13; i14++) {
                int i15 = i12 + i14;
                boolean z10 = true;
                if (((i10 >> (i14 + i11)) & 1) == 0) {
                    z10 = false;
                }
                zArr[i15] = z10;
            }
        }
        return zArr;
    }
}
