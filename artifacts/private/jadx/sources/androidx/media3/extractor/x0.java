package androidx.media3.extractor;

import android.util.Base64;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import com.google.common.collect.l6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f69632a = "VorbisUtil";

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f69633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String[] f69634b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f69635c;

        public a(String str, String[] strArr, int i10) {
            this.f69633a = str;
            this.f69634b = strArr;
            this.f69635c = i10;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f69636a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f69637b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f69638c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f69639d;

        public b(boolean z10, int i10, int i11, int i12) {
            this.f69636a = z10;
            this.f69637b = i10;
            this.f69638c = i11;
            this.f69639d = i12;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f69640a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f69641b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f69642c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f69643d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f69644e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f69645f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f69646g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f69647h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f69648i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final byte[] f69649j;

        public c(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10, byte[] bArr) {
            this.f69640a = i10;
            this.f69641b = i11;
            this.f69642c = i12;
            this.f69643d = i13;
            this.f69644e = i14;
            this.f69645f = i15;
            this.f69646g = i16;
            this.f69647h = i17;
            this.f69648i = z10;
            this.f69649j = bArr;
        }
    }

    private x0() {
    }

    @androidx.annotation.p0
    public static int[] a(int i10) {
        if (i10 == 3) {
            return new int[]{0, 2, 1};
        }
        if (i10 == 5) {
            return new int[]{0, 2, 1, 3, 4};
        }
        if (i10 == 6) {
            return new int[]{0, 2, 1, 5, 3, 4};
        }
        if (i10 == 7) {
            return new int[]{0, 2, 1, 6, 5, 3, 4};
        }
        if (i10 != 8) {
            return null;
        }
        return new int[]{0, 2, 1, 7, 5, 6, 3, 4};
    }

    public static int b(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i11++;
            i10 >>>= 1;
        }
        return i11;
    }

    private static long c(long j10, long j11) {
        return (long) Math.floor(Math.pow(j10, 1.0d / j11));
    }

    @androidx.annotation.p0
    public static androidx.media3.common.r0 d(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            String[] strArrM2 = k1.m2(str, "=");
            if (strArrM2.length != 2) {
                androidx.media3.common.util.z.n(f69632a, "Failed to parse Vorbis comment: " + str);
            } else if (strArrM2[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(androidx.media3.extractor.metadata.flac.a.b(new androidx.media3.common.util.o0(Base64.decode(strArrM2[1], 0))));
                } catch (RuntimeException e10) {
                    androidx.media3.common.util.z.o(f69632a, "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new androidx.media3.extractor.metadata.vorbis.a(strArrM2[0], strArrM2[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new androidx.media3.common.r0(arrayList);
    }

    public static l6<byte[]> e(byte[] bArr) {
        androidx.media3.common.util.o0 o0Var = new androidx.media3.common.util.o0(bArr);
        o0Var.b0(1);
        int i10 = 0;
        while (o0Var.a() > 0 && o0Var.k() == 255) {
            i10 += 255;
            o0Var.b0(1);
        }
        int iL = i10 + o0Var.L();
        int i11 = 0;
        while (o0Var.a() > 0 && o0Var.k() == 255) {
            i11 += 255;
            o0Var.b0(1);
        }
        int iL2 = i11 + o0Var.L();
        byte[] bArr2 = new byte[iL];
        int iF = o0Var.f();
        System.arraycopy(bArr, iF, bArr2, 0, iL);
        int i12 = iF + iL + iL2;
        int length = bArr.length - i12;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, i12, bArr3, 0, length);
        return l6.J(bArr2, bArr3);
    }

    private static void f(w0 w0Var) throws androidx.media3.common.v0 {
        int iE = w0Var.e(6) + 1;
        for (int i10 = 0; i10 < iE; i10++) {
            int iE2 = w0Var.e(16);
            if (iE2 == 0) {
                w0Var.h(8);
                w0Var.h(16);
                w0Var.h(16);
                w0Var.h(6);
                w0Var.h(8);
                int iE3 = w0Var.e(4) + 1;
                for (int i11 = 0; i11 < iE3; i11++) {
                    w0Var.h(8);
                }
            } else {
                if (iE2 != 1) {
                    throw androidx.media3.common.v0.a("floor type greater than 1 not decodable: " + iE2, null);
                }
                int iE4 = w0Var.e(5);
                int[] iArr = new int[iE4];
                int i12 = -1;
                for (int i13 = 0; i13 < iE4; i13++) {
                    int iE5 = w0Var.e(4);
                    iArr[i13] = iE5;
                    if (iE5 > i12) {
                        i12 = iE5;
                    }
                }
                int i14 = i12 + 1;
                int[] iArr2 = new int[i14];
                for (int i15 = 0; i15 < i14; i15++) {
                    iArr2[i15] = w0Var.e(3) + 1;
                    int iE6 = w0Var.e(2);
                    if (iE6 > 0) {
                        w0Var.h(8);
                    }
                    for (int i16 = 0; i16 < (1 << iE6); i16++) {
                        w0Var.h(8);
                    }
                }
                w0Var.h(2);
                int iE7 = w0Var.e(4);
                int i17 = 0;
                int i18 = 0;
                for (int i19 = 0; i19 < iE4; i19++) {
                    i17 += iArr2[iArr[i19]];
                    while (i18 < i17) {
                        w0Var.h(iE7);
                        i18++;
                    }
                }
            }
        }
    }

    private static void g(int i10, w0 w0Var) throws androidx.media3.common.v0 {
        int iE = w0Var.e(6) + 1;
        for (int i11 = 0; i11 < iE; i11++) {
            int iE2 = w0Var.e(16);
            if (iE2 != 0) {
                androidx.media3.common.util.z.d(f69632a, "mapping type other than 0 not supported: " + iE2);
            } else {
                int iE3 = w0Var.d() ? w0Var.e(4) + 1 : 1;
                if (w0Var.d()) {
                    int iE4 = w0Var.e(8) + 1;
                    for (int i12 = 0; i12 < iE4; i12++) {
                        int i13 = i10 - 1;
                        w0Var.h(b(i13));
                        w0Var.h(b(i13));
                    }
                }
                if (w0Var.e(2) != 0) {
                    throw androidx.media3.common.v0.a("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (iE3 > 1) {
                    for (int i14 = 0; i14 < i10; i14++) {
                        w0Var.h(4);
                    }
                }
                for (int i15 = 0; i15 < iE3; i15++) {
                    w0Var.h(8);
                    w0Var.h(8);
                    w0Var.h(8);
                }
            }
        }
    }

    private static b[] h(w0 w0Var) {
        int iE = w0Var.e(6) + 1;
        b[] bVarArr = new b[iE];
        for (int i10 = 0; i10 < iE; i10++) {
            bVarArr[i10] = new b(w0Var.d(), w0Var.e(16), w0Var.e(16), w0Var.e(8));
        }
        return bVarArr;
    }

    private static void i(w0 w0Var) throws androidx.media3.common.v0 {
        int iE = w0Var.e(6) + 1;
        for (int i10 = 0; i10 < iE; i10++) {
            if (w0Var.e(16) > 2) {
                throw androidx.media3.common.v0.a("residueType greater than 2 is not decodable", null);
            }
            w0Var.h(24);
            w0Var.h(24);
            w0Var.h(24);
            int iE2 = w0Var.e(6) + 1;
            w0Var.h(8);
            int[] iArr = new int[iE2];
            for (int i11 = 0; i11 < iE2; i11++) {
                iArr[i11] = ((w0Var.d() ? w0Var.e(5) : 0) * 8) + w0Var.e(3);
            }
            for (int i12 = 0; i12 < iE2; i12++) {
                for (int i13 = 0; i13 < 8; i13++) {
                    if ((iArr[i12] & (1 << i13)) != 0) {
                        w0Var.h(8);
                    }
                }
            }
        }
    }

    public static a j(androidx.media3.common.util.o0 o0Var) throws androidx.media3.common.v0 {
        return k(o0Var, true, true);
    }

    public static a k(androidx.media3.common.util.o0 o0Var, boolean z10, boolean z11) throws androidx.media3.common.v0 {
        if (z10) {
            o(3, o0Var, false);
        }
        String strI = o0Var.I((int) o0Var.A());
        int length = strI.length();
        long jA = o0Var.A();
        String[] strArr = new String[(int) jA];
        int length2 = length + 15;
        for (int i10 = 0; i10 < jA; i10++) {
            String strI2 = o0Var.I((int) o0Var.A());
            strArr[i10] = strI2;
            length2 = length2 + 4 + strI2.length();
        }
        if (z11 && (o0Var.L() & 1) == 0) {
            throw androidx.media3.common.v0.a("framing bit expected to be set", null);
        }
        return new a(strI, strArr, length2 + 1);
    }

    public static c l(androidx.media3.common.util.o0 o0Var) throws androidx.media3.common.v0 {
        o(1, o0Var, false);
        int iC = o0Var.C();
        int iL = o0Var.L();
        int iC2 = o0Var.C();
        int iW = o0Var.w();
        if (iW <= 0) {
            iW = -1;
        }
        int iW2 = o0Var.w();
        if (iW2 <= 0) {
            iW2 = -1;
        }
        int iW3 = o0Var.w();
        if (iW3 <= 0) {
            iW3 = -1;
        }
        int iL2 = o0Var.L();
        return new c(iC, iL, iC2, iW, iW2, iW3, (int) Math.pow(2.0d, iL2 & 15), (int) Math.pow(2.0d, (iL2 & 240) >> 4), (o0Var.L() & 1) > 0, Arrays.copyOf(o0Var.e(), o0Var.g()));
    }

    public static b[] m(androidx.media3.common.util.o0 o0Var, int i10) throws androidx.media3.common.v0 {
        o(5, o0Var, false);
        int iL = o0Var.L() + 1;
        w0 w0Var = new w0(o0Var.e());
        w0Var.h(o0Var.f() * 8);
        for (int i11 = 0; i11 < iL; i11++) {
            n(w0Var);
        }
        int iE = w0Var.e(6) + 1;
        for (int i12 = 0; i12 < iE; i12++) {
            if (w0Var.e(16) != 0) {
                throw androidx.media3.common.v0.a("placeholder of time domain transforms not zeroed out", null);
            }
        }
        f(w0Var);
        i(w0Var);
        g(i10, w0Var);
        b[] bVarArrH = h(w0Var);
        if (w0Var.d()) {
            return bVarArrH;
        }
        throw androidx.media3.common.v0.a("framing bit after modes not set as expected", null);
    }

    private static void n(w0 w0Var) throws androidx.media3.common.v0 {
        long jC;
        if (w0Var.e(24) != 5653314) {
            throw androidx.media3.common.v0.a("expected code book to start with [0x56, 0x43, 0x42] at " + w0Var.c(), null);
        }
        int iE = w0Var.e(16);
        int iE2 = w0Var.e(24);
        int iE3 = 0;
        if (w0Var.d()) {
            w0Var.h(5);
            while (iE3 < iE2) {
                iE3 += w0Var.e(b(iE2 - iE3));
            }
        } else {
            boolean zD = w0Var.d();
            while (iE3 < iE2) {
                if (!zD) {
                    w0Var.h(5);
                } else if (w0Var.d()) {
                    w0Var.h(5);
                }
                iE3++;
            }
        }
        int iE4 = w0Var.e(4);
        if (iE4 > 2) {
            throw androidx.media3.common.v0.a("lookup type greater than 2 not decodable: " + iE4, null);
        }
        if (iE4 != 1 && iE4 != 2) {
            return;
        }
        w0Var.h(32);
        w0Var.h(32);
        int iE5 = w0Var.e(4) + 1;
        w0Var.h(1);
        if (iE4 == 1) {
            jC = iE != 0 ? c(iE2, iE) : 0L;
        } else {
            jC = ((long) iE) * ((long) iE2);
        }
        w0Var.h((int) (jC * ((long) iE5)));
    }

    public static boolean o(int i10, androidx.media3.common.util.o0 o0Var, boolean z10) throws androidx.media3.common.v0 {
        if (o0Var.a() < 7) {
            if (z10) {
                return false;
            }
            throw androidx.media3.common.v0.a("too short header: " + o0Var.a(), null);
        }
        if (o0Var.L() != i10) {
            if (z10) {
                return false;
            }
            throw androidx.media3.common.v0.a("expected header type " + Integer.toHexString(i10), null);
        }
        if (o0Var.L() == 118 && o0Var.L() == 111 && o0Var.L() == 114 && o0Var.L() == 98 && o0Var.L() == 105 && o0Var.L() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw androidx.media3.common.v0.a("expected characters 'vorbis'", null);
    }
}
