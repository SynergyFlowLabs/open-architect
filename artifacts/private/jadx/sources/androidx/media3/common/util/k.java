package androidx.media3.common.util;

import android.util.Pair;
import com.google.common.collect.l6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
@b1
@e.a({"InlinedApi"})
public final class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f61526c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f61527d = 32;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f61528e = 15;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f61529f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f61530g = "s263";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f61531h = "avc1";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f61532i = "avc2";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f61533j = "vp09";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f61534k = "hev1";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f61535l = "hvc1";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f61536m = "av01";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f61537n = "mp4a";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f61539p = "CodecSpecificDataUtil";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f61524a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f61525b = {"", androidx.exifinterface.media.a.X4, "B", "C"};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Pattern f61538o = Pattern.compile("^\\D?(\\d+)$");

    private k() {
    }

    @androidx.annotation.p0
    public static byte[][] A(byte[] bArr) {
        if (!w(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iL = 0;
        do {
            arrayList.add(Integer.valueOf(iL));
            iL = l(bArr, iL + f61524a.length);
        } while (iL != -1);
        byte[][] bArr2 = new byte[arrayList.size()][];
        int i10 = 0;
        while (i10 < arrayList.size()) {
            int iIntValue = ((Integer) arrayList.get(i10)).intValue();
            int iIntValue2 = (i10 < arrayList.size() + (-1) ? ((Integer) arrayList.get(i10 + 1)).intValue() : bArr.length) - iIntValue;
            byte[] bArr3 = new byte[iIntValue2];
            System.arraycopy(bArr, iIntValue, bArr3, 0, iIntValue2);
            bArr2[i10] = bArr3;
            i10++;
        }
        return bArr2;
    }

    private static int B(int i10) {
        if (i10 == 10) {
            return 1;
        }
        if (i10 == 11) {
            return 2;
        }
        if (i10 == 20) {
            return 4;
        }
        if (i10 == 21) {
            return 8;
        }
        if (i10 == 30) {
            return 16;
        }
        if (i10 == 31) {
            return 32;
        }
        if (i10 == 40) {
            return 64;
        }
        if (i10 == 41) {
            return 128;
        }
        if (i10 == 50) {
            return 256;
        }
        if (i10 == 51) {
            return 512;
        }
        switch (i10) {
            case 60:
                return 2048;
            case 61:
                return 4096;
            case com.planner5d.library.engine.input.f.b.I0 /* 62 */:
                return 8192;
            default:
                return -1;
        }
    }

    private static int C(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? -1 : 8;
        }
        return 4;
    }

    private static int a(int i10) {
        switch (i10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return 8192;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return 524288;
            case 20:
                return 1048576;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    private static int b(int i10) {
        switch (i10) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i10) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i10) {
                            case 30:
                                return 256;
                            case 31:
                                return 512;
                            case 32:
                                return 1024;
                            default:
                                switch (i10) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (i10) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    private static int c(int i10) {
        if (i10 == 66) {
            return 1;
        }
        if (i10 == 77) {
            return 2;
        }
        if (i10 == 88) {
            return 4;
        }
        if (i10 == 100) {
            return 8;
        }
        if (i10 == 110) {
            return 16;
        }
        if (i10 == 122) {
            return 32;
        }
        if (i10 == 244) {
            return 64;
        }
        int i11 = 7 & (-1);
        return -1;
    }

    public static String d(int i10, int i11, int i12) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static List<byte[]> e(boolean z10) {
        return Collections.singletonList(z10 ? new byte[]{1} : new byte[]{0});
    }

    public static String f(int i10, int i11) {
        return k1.S("s263.%d.%d", Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public static String g(int i10, boolean z10, int i11, int i12, int[] iArr, int i13) {
        StringBuilder sb2 = new StringBuilder(k1.S("hvc1.%s%d.%X.%c%d", f61525b[i10], Integer.valueOf(i11), Integer.valueOf(i12), Character.valueOf(z10 ? 'H' : 'L'), Integer.valueOf(i13)));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i14 = 0; i14 < length; i14++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i14])));
        }
        return sb2.toString();
    }

    public static byte[] h(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = f61524a;
        byte[] bArr3 = new byte[bArr2.length + i11];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i10, bArr3, bArr2.length, i11);
        return bArr3;
    }

    public static l6<byte[]> i(byte b10, byte b11, byte b12, byte b13) {
        int i10 = 7 & 3;
        return l6.G(new byte[]{1, 1, b10, 2, 1, b11, 3, 1, b12, 4, 1, b13});
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @androidx.annotation.p0
    private static Integer j(@androidx.annotation.p0 String str) {
        if (str == null) {
            return null;
        }
        byte b10 = -1;
        switch (str.hashCode()) {
            case 1537:
                if (str.equals("01")) {
                    b10 = 0;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    b10 = 1;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    b10 = 2;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    b10 = 3;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    b10 = 4;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    b10 = 5;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    b10 = 6;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    b10 = 7;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    b10 = 8;
                }
                break;
            case 1567:
                if (str.equals("10")) {
                    b10 = 9;
                }
                break;
            case 1568:
                if (str.equals("11")) {
                    b10 = 10;
                }
                break;
            case 1569:
                if (str.equals("12")) {
                    b10 = 11;
                }
                break;
            case 1570:
                if (str.equals("13")) {
                    b10 = com.google.common.base.c.f116461n;
                }
                break;
        }
        switch (b10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            default:
                return null;
        }
    }

    @androidx.annotation.p0
    private static Integer k(@androidx.annotation.p0 String str) {
        if (str == null) {
            return null;
        }
        int i10 = 0 | (-1);
        switch (str) {
            case "00":
                return 1;
            case "01":
                return 2;
            case "02":
                return 4;
            case "03":
                return 8;
            case "04":
                return 16;
            case "05":
                return 32;
            case "06":
                return 64;
            case "07":
                return 128;
            case "08":
                return 256;
            case "09":
                return 512;
            case "10":
                return 1024;
            default:
                return null;
        }
    }

    private static int l(byte[] bArr, int i10) {
        int length = bArr.length - f61524a.length;
        while (i10 <= length) {
            if (w(bArr, i10)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @androidx.annotation.p0
    private static Pair<Integer, Integer> m(String str, String[] strArr) {
        if (strArr.length != 3) {
            z.n(f61539p, "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(androidx.media3.common.s0.h(Integer.parseInt(strArr[1], 16)))) {
                int i10 = 3 >> 2;
                int iX = x(Integer.parseInt(strArr[2]));
                if (iX != -1) {
                    return new Pair<>(Integer.valueOf(iX), 0);
                }
            }
        } catch (NumberFormatException unused) {
            z.n(f61539p, "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    @androidx.annotation.p0
    private static Pair<Integer, Integer> n(String str, String[] strArr, @androidx.annotation.p0 androidx.media3.common.k kVar) {
        int i10;
        if (strArr.length < 4) {
            z.n(f61539p, "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
        int i11 = 1;
        try {
            int i12 = Integer.parseInt(strArr[1]);
            int i13 = Integer.parseInt(strArr[2].substring(0, 2));
            int i14 = Integer.parseInt(strArr[3]);
            if (i12 != 0) {
                z.n(f61539p, "Unknown AV1 profile: " + i12);
                return null;
            }
            if (i14 != 8 && i14 != 10) {
                z.n(f61539p, "Unknown AV1 bit depth: " + i14);
                return null;
            }
            if (i14 != 8) {
                i11 = (kVar == null || !(kVar.f60803d != null || (i10 = kVar.f60802c) == 7 || i10 == 6)) ? 2 : 4096;
            }
            int iA = a(i13);
            if (iA != -1) {
                return new Pair<>(Integer.valueOf(i11), Integer.valueOf(iA));
            }
            z.n(f61539p, "Unknown AV1 level: " + i13);
            return null;
        } catch (NumberFormatException unused) {
            z.n(f61539p, "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
    }

    @androidx.annotation.p0
    private static Pair<Integer, Integer> o(String str, String[] strArr) {
        int i10;
        int i11;
        if (strArr.length < 2) {
            z.n(f61539p, "Ignoring malformed AVC codec string: " + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                boolean z10 = true & false;
                i11 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                i10 = Integer.parseInt(strArr[1].substring(4), 16);
            } else {
                if (strArr.length < 3) {
                    z.n(f61539p, "Ignoring malformed AVC codec string: " + str);
                    return null;
                }
                int i12 = Integer.parseInt(strArr[1]);
                i10 = Integer.parseInt(strArr[2]);
                i11 = i12;
            }
            int iC = c(i11);
            if (iC == -1) {
                z.n(f61539p, "Unknown AVC profile: " + i11);
                return null;
            }
            int iB = b(i10);
            if (iB != -1) {
                return new Pair<>(Integer.valueOf(iC), Integer.valueOf(iB));
            }
            z.n(f61539p, "Unknown AVC level: " + i10);
            return null;
        } catch (NumberFormatException unused) {
            z.n(f61539p, "Ignoring malformed AVC codec string: " + str);
            return null;
        }
    }

    @androidx.annotation.p0
    public static Pair<Integer, Integer> p(androidx.media3.common.w wVar) {
        String str = wVar.f61757k;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        if ("video/dolby-vision".equals(wVar.f61761o)) {
            return q(wVar.f61757k, strArrSplit);
        }
        byte b10 = 0;
        String str2 = strArrSplit[0];
        str2.getClass();
        switch (str2.hashCode()) {
            case 3004662:
                if (!str2.equals(f61536m)) {
                    b10 = -1;
                }
                break;
            case 3006243:
                b10 = !str2.equals(f61531h) ? (byte) -1 : (byte) 1;
                break;
            case 3006244:
                b10 = !str2.equals(f61532i) ? (byte) -1 : (byte) 2;
                break;
            case 3199032:
                b10 = !str2.equals(f61534k) ? (byte) -1 : (byte) 3;
                break;
            case 3214780:
                b10 = !str2.equals(f61535l) ? (byte) -1 : (byte) 4;
                break;
            case 3356560:
                b10 = !str2.equals(f61537n) ? (byte) -1 : (byte) 5;
                break;
            case 3475740:
                b10 = !str2.equals(f61530g) ? (byte) -1 : (byte) 6;
                break;
            case 3624515:
                b10 = !str2.equals(f61533j) ? (byte) -1 : (byte) 7;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return n(wVar.f61757k, strArrSplit, wVar.C);
            case 1:
            case 2:
                return o(wVar.f61757k, strArrSplit);
            case 3:
            case 4:
                return s(wVar.f61757k, strArrSplit, wVar.C);
            case 5:
                return m(wVar.f61757k, strArrSplit);
            case 6:
                return r(wVar.f61757k, strArrSplit);
            case 7:
                return u(wVar.f61757k, strArrSplit);
            default:
                return null;
        }
    }

    @androidx.annotation.p0
    private static Pair<Integer, Integer> q(String str, String[] strArr) {
        int i10 = 5 | 0;
        if (strArr.length < 3) {
            z.n(f61539p, "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        Matcher matcher = f61538o.matcher(strArr[1]);
        if (!matcher.matches()) {
            z.n(f61539p, "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        String strGroup = matcher.group(1);
        Integer numK = k(strGroup);
        if (numK == null) {
            z.n(f61539p, "Unknown Dolby Vision profile string: " + strGroup);
            return null;
        }
        String str2 = strArr[2];
        Integer numJ = j(str2);
        if (numJ != null) {
            return new Pair<>(numK, numJ);
        }
        z.n(f61539p, "Unknown Dolby Vision level string: " + str2);
        return null;
    }

    private static Pair<Integer, Integer> r(String str, String[] strArr) {
        Pair<Integer, Integer> pair = new Pair<>(1, 1);
        if (strArr.length < 3) {
            z.n(f61539p, "Ignoring malformed H263 codec string: " + str);
            return pair;
        }
        try {
            return new Pair<>(Integer.valueOf(Integer.parseInt(strArr[1])), Integer.valueOf(Integer.parseInt(strArr[2])));
        } catch (NumberFormatException unused) {
            z.n(f61539p, "Ignoring malformed H263 codec string: " + str);
            return pair;
        }
    }

    @androidx.annotation.p0
    public static Pair<Integer, Integer> s(String str, String[] strArr, @androidx.annotation.p0 androidx.media3.common.k kVar) {
        if (strArr.length < 4) {
            z.n(f61539p, "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        int i10 = 1;
        Matcher matcher = f61538o.matcher(strArr[1]);
        if (!matcher.matches()) {
            z.n(f61539p, "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        String strGroup = matcher.group(1);
        if (!"1".equals(strGroup)) {
            i10 = 6;
            if ("2".equals(strGroup)) {
                i10 = (kVar == null || kVar.f60802c != 6) ? 2 : 4096;
            } else if (!"6".equals(strGroup)) {
                z.n(f61539p, "Unknown HEVC profile string: " + strGroup);
                return null;
            }
        }
        String str2 = strArr[3];
        Integer numV = v(str2);
        if (numV != null) {
            return new Pair<>(Integer.valueOf(i10), numV);
        }
        z.n(f61539p, "Unknown HEVC level string: " + str2);
        return null;
    }

    public static Pair<Integer, Integer> t(byte[] bArr) {
        boolean z10;
        o0 o0Var = new o0(bArr);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = i11 + 3;
            if (i12 >= bArr.length) {
                z10 = false;
                break;
            }
            if (o0Var.O() == 1 && (bArr[i12] & 240) == 32) {
                z10 = true;
                break;
            }
            o0Var.a0(o0Var.f() - 2);
            i11++;
        }
        a.b(z10, "Invalid input: VOL not found.");
        n0 n0Var = new n0(bArr);
        int i13 = 2 << 4;
        n0Var.s((i11 + 4) * 8);
        n0Var.s(1);
        n0Var.s(8);
        if (n0Var.g()) {
            n0Var.s(4);
            n0Var.s(3);
        }
        if (n0Var.h(4) == 15) {
            n0Var.s(8);
            n0Var.s(8);
        }
        if (n0Var.g()) {
            n0Var.s(2);
            n0Var.s(1);
            if (n0Var.g()) {
                n0Var.s(79);
            }
        }
        a.b(n0Var.h(2) == 0, "Only supports rectangular video object layer shape.");
        a.a(n0Var.g());
        int iH = n0Var.h(16);
        a.a(n0Var.g());
        if (n0Var.g()) {
            a.a(iH > 0);
            for (int i14 = iH - 1; i14 > 0; i14 >>= 1) {
                i10++;
            }
            n0Var.s(i10);
        }
        a.a(n0Var.g());
        int iH2 = n0Var.h(13);
        a.a(n0Var.g());
        int iH3 = n0Var.h(13);
        a.a(n0Var.g());
        n0Var.s(1);
        return Pair.create(Integer.valueOf(iH2), Integer.valueOf(iH3));
    }

    @androidx.annotation.p0
    private static Pair<Integer, Integer> u(String str, String[] strArr) {
        if (strArr.length < 3) {
            z.n(f61539p, "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
        try {
            int i10 = Integer.parseInt(strArr[1]);
            int i11 = Integer.parseInt(strArr[2]);
            int iC = C(i10);
            if (iC == -1) {
                z.n(f61539p, "Unknown VP9 profile: " + i10);
                return null;
            }
            int iB = B(i11);
            if (iB != -1) {
                return new Pair<>(Integer.valueOf(iC), Integer.valueOf(iB));
            }
            z.n(f61539p, "Unknown VP9 level: " + i11);
            return null;
        } catch (NumberFormatException unused) {
            z.n(f61539p, "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @androidx.annotation.p0
    private static Integer v(@androidx.annotation.p0 String str) {
        if (str == null) {
            return null;
        }
        byte b10 = -1;
        switch (str.hashCode()) {
            case 70821:
                if (str.equals("H30")) {
                    b10 = 0;
                }
                break;
            case 70914:
                if (str.equals("H60")) {
                    b10 = 1;
                }
                break;
            case 70917:
                if (str.equals("H63")) {
                    b10 = 2;
                }
                break;
            case 71007:
                if (str.equals("H90")) {
                    b10 = 3;
                }
                break;
            case 71010:
                if (str.equals("H93")) {
                    b10 = 4;
                }
                break;
            case 74665:
                if (str.equals("L30")) {
                    b10 = 5;
                }
                break;
            case 74758:
                if (str.equals("L60")) {
                    b10 = 6;
                }
                break;
            case 74761:
                if (str.equals("L63")) {
                    b10 = 7;
                }
                break;
            case 74851:
                if (str.equals("L90")) {
                    b10 = 8;
                }
                break;
            case 74854:
                if (str.equals("L93")) {
                    b10 = 9;
                }
                break;
            case 2193639:
                if (str.equals("H120")) {
                    b10 = 10;
                }
                break;
            case 2193642:
                if (str.equals("H123")) {
                    b10 = 11;
                }
                break;
            case 2193732:
                if (str.equals("H150")) {
                    b10 = com.google.common.base.c.f116461n;
                }
                break;
            case 2193735:
                if (str.equals("H153")) {
                    b10 = com.google.common.base.c.f116462o;
                }
                break;
            case 2193738:
                if (str.equals("H156")) {
                    b10 = com.google.common.base.c.f116463p;
                }
                break;
            case 2193825:
                if (str.equals("H180")) {
                    b10 = com.google.common.base.c.f116464q;
                }
                break;
            case 2193828:
                if (str.equals("H183")) {
                    b10 = 16;
                }
                break;
            case 2193831:
                if (str.equals("H186")) {
                    b10 = 17;
                }
                break;
            case 2312803:
                if (str.equals("L120")) {
                    b10 = com.google.common.base.c.f116468u;
                }
                break;
            case 2312806:
                if (str.equals("L123")) {
                    b10 = 19;
                }
                break;
            case 2312896:
                if (str.equals("L150")) {
                    b10 = com.google.common.base.c.f116471x;
                }
                break;
            case 2312899:
                if (str.equals("L153")) {
                    b10 = com.google.common.base.c.f116472y;
                }
                break;
            case 2312902:
                if (str.equals("L156")) {
                    b10 = com.google.common.base.c.f116473z;
                }
                break;
            case 2312989:
                if (str.equals("L180")) {
                    b10 = com.google.common.base.c.A;
                }
                break;
            case 2312992:
                if (str.equals("L183")) {
                    b10 = com.google.common.base.c.B;
                }
                break;
            case 2312995:
                if (str.equals("L186")) {
                    b10 = com.google.common.base.c.C;
                }
                break;
        }
        switch (b10) {
            case 0:
                return 2;
            case 1:
                return 8;
            case 2:
                return 32;
            case 3:
                return 128;
            case 4:
                return 512;
            case 5:
                return 1;
            case 6:
                return 4;
            case 7:
                return 16;
            case 8:
                return 64;
            case 9:
                return 256;
            case 10:
                return 2048;
            case 11:
                return 8192;
            case 12:
                return 32768;
            case 13:
                return 131072;
            case 14:
                return 524288;
            case 15:
                return 2097152;
            case 16:
                return 8388608;
            case 17:
                return Integer.valueOf(com.google.api.client.googleapis.media.a.f115410j);
            case 18:
                return 1024;
            case 19:
                return 4096;
            case 20:
                return 16384;
            case 21:
                return 65536;
            case 22:
                return 262144;
            case 23:
                return 1048576;
            case 24:
                return 4194304;
            case 25:
                return 16777216;
            default:
                return null;
        }
    }

    private static boolean w(byte[] bArr, int i10) {
        if (bArr.length - i10 <= f61524a.length) {
            return false;
        }
        int i11 = 0;
        while (true) {
            byte[] bArr2 = f61524a;
            if (i11 >= bArr2.length) {
                return true;
            }
            if (bArr[i10 + i11] != bArr2[i11]) {
                return false;
            }
            i11++;
        }
    }

    private static int x(int i10) {
        int i11 = 17;
        if (i10 != 17) {
            i11 = 20;
            if (i10 != 20) {
                i11 = 23;
                if (i10 != 23) {
                    i11 = 29;
                    if (i10 != 29) {
                        i11 = 39;
                        if (i10 != 39) {
                            i11 = 42;
                            if (i10 != 42) {
                                switch (i10) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i11;
    }

    public static Pair<Integer, Integer> y(byte[] bArr) {
        o0 o0Var = new o0(bArr);
        o0Var.a0(9);
        int iL = o0Var.L();
        o0Var.a0(20);
        return Pair.create(Integer.valueOf(o0Var.P()), Integer.valueOf(iL));
    }

    public static boolean z(List<byte[]> list) {
        return list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1;
    }
}
