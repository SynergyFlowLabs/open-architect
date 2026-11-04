package androidx.media3.extractor;

import androidx.media3.common.DrmInitData;
import androidx.media3.common.util.b1;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f67146a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f67147b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f67148c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f67149d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f67150e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f67151f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f67152g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f67153h = 6;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f67154i = 7;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f67155j = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f67156k = 9;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f67157l = 10;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f67158m = 11;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f67159n = 12;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f67160o = 13;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f67161p = 14;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f67162q = 15;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f67163r = 44096;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f67164s = 44097;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f67165t = 336000;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f67166u = 2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f67167v = 7;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f67168w = 16;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int[] f67169x = {androidx.media3.common.x0.H1, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f67170a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f67171b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f67172c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f67173d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f67174e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f67175f;

        private b() {
            this.f67170a = true;
            this.f67171b = -1;
            this.f67172c = -1;
            this.f67173d = true;
            this.f67174e = 2;
            this.f67175f = 0;
        }
    }

    /* JADX INFO: renamed from: androidx.media3.extractor.c$c, reason: collision with other inner class name */
    public static final class C0603c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f67176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f67177b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f67178c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f67179d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f67180e;

        private C0603c(int i10, int i11, int i12, int i13, int i14) {
            this.f67176a = i10;
            this.f67178c = i11;
            this.f67177b = i12;
            this.f67179d = i13;
            this.f67180e = i14;
        }
    }

    private c() {
    }

    public static void a(int i10, androidx.media3.common.util.o0 o0Var) {
        o0Var.W(7);
        byte[] bArrE = o0Var.e();
        bArrE[0] = -84;
        bArrE[1] = com.google.common.primitives.t.f119782a;
        bArrE[2] = -1;
        bArrE[3] = -1;
        bArrE[4] = (byte) ((i10 >> 16) & 255);
        bArrE[5] = (byte) ((i10 >> 8) & 255);
        bArrE[6] = (byte) (i10 & 255);
    }

    private static int b(int i10, boolean z10, int i11) {
        int iC = c(i10);
        if (i10 != 11 && i10 != 12 && i10 != 13 && i10 != 14) {
            return iC;
        }
        if (!z10) {
            iC -= 2;
        }
        if (i11 != 0) {
            return i11 != 1 ? iC : iC - 2;
        }
        return iC - 4;
    }

    private static int c(int i10) {
        switch (i10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
            case 7:
            case 9:
                return 7;
            case 6:
            case 8:
            case 10:
                return 8;
            case 11:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 24;
            default:
                return -1;
        }
    }

    public static androidx.media3.common.w d(androidx.media3.common.util.o0 o0Var, String str, String str2, @androidx.annotation.p0 DrmInitData drmInitData) throws androidx.media3.common.v0 {
        int iB;
        boolean zG;
        int iH;
        int iH2;
        int iH3;
        int iB2;
        boolean z10;
        boolean zG2;
        androidx.media3.common.util.n0 n0Var = new androidx.media3.common.util.n0();
        n0Var.n(o0Var);
        int iB3 = n0Var.b();
        int iH4 = n0Var.h(3);
        if (iH4 > 1) {
            throw androidx.media3.common.v0.e("Unsupported AC-4 DSI version: " + iH4);
        }
        int iH5 = n0Var.h(7);
        int i10 = n0Var.g() ? m0.f67467a : AudioConstants.AUDIO_SAMPLE_RATE;
        n0Var.s(4);
        int iH6 = n0Var.h(9);
        if (iH5 > 1) {
            if (iH4 == 0) {
                throw androidx.media3.common.v0.e("Invalid AC-4 DSI version: " + iH4);
            }
            if (n0Var.g()) {
                n0Var.s(16);
                if (n0Var.g()) {
                    n0Var.s(128);
                }
            }
        }
        if (iH4 == 1) {
            if (!k(n0Var)) {
                throw androidx.media3.common.v0.e("Invalid AC-4 DSI bitrate.");
            }
            n0Var.c();
        }
        b bVar = new b();
        int i11 = 0;
        while (true) {
            if (i11 < iH6) {
                if (iH4 == 0) {
                    zG = n0Var.g();
                    iH = n0Var.h(5);
                    iH2 = n0Var.h(5);
                    iH3 = 0;
                    iB2 = 0;
                    z10 = false;
                } else {
                    int iH7 = n0Var.h(8);
                    iH3 = n0Var.h(8);
                    if (iH3 == 255) {
                        iH3 += n0Var.h(16);
                    }
                    if (iH7 > 2) {
                        n0Var.s(iH3 * 8);
                        i11++;
                    } else {
                        iB2 = (iB3 - n0Var.b()) / 8;
                        int iH8 = n0Var.h(5);
                        z10 = iH8 == 31;
                        iH2 = iH7;
                        iH = iH8;
                        zG = false;
                    }
                }
                if (zG || z10 || iH != 6) {
                    bVar.f67175f = n0Var.h(3);
                    if (n0Var.g()) {
                        n0Var.s(5);
                    }
                    n0Var.s(2);
                    int i12 = 1;
                    if (iH4 == 1 && (iH2 == 1 || iH2 == 2)) {
                        n0Var.s(2);
                    }
                    n0Var.s(5);
                    n0Var.s(10);
                    if (iH4 == 1) {
                        if (iH2 > 0) {
                            bVar.f67170a = n0Var.g();
                        }
                        if (bVar.f67170a) {
                            if (iH2 == 1 || iH2 == 2) {
                                int iH9 = n0Var.h(5);
                                if (iH9 >= 0 && iH9 <= 15) {
                                    bVar.f67171b = iH9;
                                }
                                if (iH9 >= 11 && iH9 <= 14) {
                                    bVar.f67173d = n0Var.g();
                                    bVar.f67174e = n0Var.h(2);
                                }
                            }
                            n0Var.s(24);
                            i12 = 1;
                        }
                        if (iH2 == i12 || iH2 == 2) {
                            if (n0Var.g() && n0Var.g()) {
                                n0Var.s(2);
                            }
                            if (n0Var.g()) {
                                n0Var.r();
                                int i13 = 8;
                                int iH10 = n0Var.h(8);
                                int i14 = 0;
                                while (i14 < iH10) {
                                    n0Var.s(i13);
                                    i14++;
                                    i13 = 8;
                                }
                            }
                        }
                    }
                    if (!zG && !z10) {
                        n0Var.r();
                        if (iH == 0 || iH == 1 || iH == 2) {
                            if (iH2 == 0) {
                                for (int i15 = 0; i15 < 2; i15++) {
                                    h(n0Var, bVar);
                                }
                            } else {
                                for (int i16 = 0; i16 < 2; i16++) {
                                    i(n0Var, bVar);
                                }
                            }
                        } else if (iH == 3 || iH == 4) {
                            if (iH2 == 0) {
                                for (int i17 = 0; i17 < 3; i17++) {
                                    h(n0Var, bVar);
                                }
                            } else {
                                for (int i18 = 0; i18 < 3; i18++) {
                                    i(n0Var, bVar);
                                }
                            }
                        } else if (iH != 5) {
                            int iH11 = n0Var.h(7);
                            for (int i19 = 0; i19 < iH11; i19++) {
                                n0Var.s(8);
                            }
                        } else if (iH2 == 0) {
                            h(n0Var, bVar);
                        } else {
                            int iH12 = n0Var.h(3);
                            for (int i20 = 0; i20 < iH12 + 2; i20++) {
                                i(n0Var, bVar);
                            }
                        }
                    } else if (iH2 == 0) {
                        h(n0Var, bVar);
                    } else {
                        i(n0Var, bVar);
                    }
                    n0Var.r();
                    zG2 = n0Var.g();
                } else {
                    zG2 = true;
                }
                if (zG2) {
                    int iH13 = n0Var.h(7);
                    for (int i21 = 0; i21 < iH13; i21++) {
                        n0Var.s(15);
                    }
                }
                if (iH2 > 0) {
                    if (n0Var.g() && !k(n0Var)) {
                        throw androidx.media3.common.v0.e("Can't parse bitrate DSI.");
                    }
                    if (n0Var.g()) {
                        n0Var.c();
                        n0Var.t(n0Var.h(16));
                        int iH14 = n0Var.h(5);
                        for (int i22 = 0; i22 < iH14; i22++) {
                            n0Var.s(3);
                            n0Var.s(8);
                        }
                    }
                }
                n0Var.c();
                if (iH4 == 1) {
                    int iB4 = ((iB3 - n0Var.b()) / 8) - iB2;
                    if (iH3 < iB4) {
                        throw androidx.media3.common.v0.e("pres_bytes is smaller than presentation bytes read.");
                    }
                    n0Var.t(iH3 - iB4);
                }
                if (bVar.f67170a && bVar.f67171b == -1) {
                    throw androidx.media3.common.v0.e("Can't determine channel mode of presentation " + i11);
                }
            }
            if (bVar.f67170a) {
                iB = b(bVar.f67171b, bVar.f67173d, bVar.f67174e);
            } else {
                iB = bVar.f67172c + 1;
                if (bVar.f67175f == 4 && iB == 17) {
                    iB = 21;
                }
            }
            if (iB > 0) {
                return new androidx.media3.common.w.b().f0(str).u0("audio/ac4").R(iB).v0(i10).Y(drmInitData).j0(str2).N();
            }
            throw androidx.media3.common.v0.e("Can't determine channel count of presentation.");
        }
    }

    public static int e(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int iPosition = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(iPosition);
        return f(new androidx.media3.common.util.n0(bArr)).f67180e;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x009b  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ab  */
    public static C0603c f(androidx.media3.common.util.n0 n0Var) {
        int i10;
        int i11;
        int i12;
        int iH = n0Var.h(16);
        int iH2 = n0Var.h(16);
        if (iH2 == 65535) {
            iH2 = n0Var.h(24);
            i10 = 7;
        } else {
            i10 = 4;
        }
        int i13 = iH2 + i10;
        if (iH == 44097) {
            i13 += 2;
        }
        int i14 = i13;
        int iH3 = n0Var.h(2);
        if (iH3 == 3) {
            iH3 += j(n0Var, 2);
        }
        int i15 = iH3;
        int iH4 = n0Var.h(10);
        if (n0Var.g() && n0Var.h(3) > 0) {
            n0Var.s(2);
        }
        boolean zG = n0Var.g();
        int i16 = m0.f67467a;
        if (!zG) {
            i16 = 44100;
        }
        int iH5 = n0Var.h(4);
        if (i16 != 44100 || iH5 != 13) {
            if (i16 == 48000) {
                int[] iArr = f67169x;
                if (iH5 < iArr.length) {
                    int i17 = iArr[iH5];
                    int i18 = iH4 % 5;
                    if (i18 == 1) {
                        if (iH5 != 3 || iH5 == 8) {
                            i11 = i17 + 1;
                        } else {
                            i12 = i17;
                        }
                    } else if (i18 != 2) {
                        if (i18 == 3) {
                            if (iH5 != 3) {
                            }
                            i11 = i17 + 1;
                        } else if (i18 == 4 && (iH5 == 3 || iH5 == 8 || iH5 == 11)) {
                            i11 = i17 + 1;
                        } else {
                            i12 = i17;
                        }
                    } else if (iH5 == 8 || iH5 == 11) {
                        i11 = i17 + 1;
                    } else {
                        i12 = i17;
                    }
                } else {
                    i11 = 0;
                }
            } else {
                i11 = 0;
            }
            return new C0603c(i15, 2, i16, i14, i12);
        }
        i11 = f67169x[iH5];
        i12 = i11;
        return new C0603c(i15, 2, i16, i14, i12);
    }

    public static int g(byte[] bArr, int i10) {
        int i11 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i12 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i12 == 65535) {
            i12 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i11 = 4;
        }
        if (i10 == 44097) {
            i11 += 2;
        }
        return i12 + i11;
    }

    private static void h(androidx.media3.common.util.n0 n0Var, b bVar) throws androidx.media3.common.v0 {
        int iH = n0Var.h(5);
        n0Var.s(2);
        if (n0Var.g()) {
            n0Var.s(5);
        }
        if (iH >= 7 && iH <= 10) {
            n0Var.r();
        }
        if (n0Var.g()) {
            int iH2 = n0Var.h(3);
            if (bVar.f67171b == -1 && iH >= 0 && iH <= 15 && (iH2 == 0 || iH2 == 1)) {
                bVar.f67171b = iH;
            }
            if (n0Var.g()) {
                l(n0Var);
            }
        }
    }

    private static void i(androidx.media3.common.util.n0 n0Var, b bVar) throws androidx.media3.common.v0 {
        n0Var.s(2);
        boolean zG = n0Var.g();
        int iH = n0Var.h(8);
        for (int i10 = 0; i10 < iH; i10++) {
            n0Var.s(2);
            if (n0Var.g()) {
                n0Var.s(5);
            }
            if (zG) {
                n0Var.s(24);
            } else {
                if (n0Var.g()) {
                    if (!n0Var.g()) {
                        n0Var.s(4);
                    }
                    bVar.f67172c = n0Var.h(6) + 1;
                }
                n0Var.s(4);
            }
        }
        if (n0Var.g()) {
            n0Var.s(3);
            if (n0Var.g()) {
                l(n0Var);
            }
        }
    }

    private static int j(androidx.media3.common.util.n0 n0Var, int i10) {
        int i11 = 0;
        while (true) {
            int iH = i11 + n0Var.h(i10);
            if (!n0Var.g()) {
                return iH;
            }
            i11 = (iH + 1) << i10;
        }
    }

    private static boolean k(androidx.media3.common.util.n0 n0Var) {
        if (n0Var.b() < 66) {
            return false;
        }
        n0Var.s(66);
        return true;
    }

    private static void l(androidx.media3.common.util.n0 n0Var) throws androidx.media3.common.v0 {
        int iH = n0Var.h(6);
        if (iH < 2 || iH > 42) {
            throw androidx.media3.common.v0.e(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iH)));
        }
        n0Var.s(iH * 8);
    }
}
