package androidx.media3.extractor.ts;

import androidx.media3.common.v0;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f69492a = 12583333;

    public static class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f69493d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f69494e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f69495f = 2;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f69496g = 3;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f69497h = 6;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f69498i = 7;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f69499j = 8;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f69500k = 9;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f69501l = 10;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f69502m = 11;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f69503n = 12;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f69504o = 13;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f69505p = 14;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f69506q = 15;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final int f69507r = 16;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final int f69508s = 17;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final int f69509t = 18;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final int f69510u = 19;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final int f69511v = 20;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f69512w = 21;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final int f69513x = 22;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f69514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f69515b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f69516c;

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f69517a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f69518b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f69519c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        public final byte[] f69520d;

        private c(int i10, int i11, int i12, @androidx.annotation.p0 byte[] bArr) {
            this.f69517a = i10;
            this.f69518b = i11;
            this.f69519c = i12;
            this.f69520d = bArr;
        }
    }

    private v() {
    }

    private static int a(int i10) throws v0 {
        if (i10 == 0) {
            return com.google.android.material.internal.p0.f112892a;
        }
        if (i10 == 1) {
            return 1024;
        }
        if (i10 == 2 || i10 == 3) {
            return 2048;
        }
        if (i10 == 4) {
            return 4096;
        }
        throw v0.e("Unsupported coreSbrFrameLengthIndex " + i10);
    }

    private static double b(int i10) throws v0 {
        switch (i10) {
            case 14700:
            case androidx.media3.extractor.a.f66991g /* 16000 */:
                return 3.0d;
            case 22050:
            case 24000:
                return 2.0d;
            case 29400:
            case 32000:
            case 58800:
            case 64000:
                return 1.5d;
            case AudioConstants.AUDIO_SAMPLE_RATE /* 44100 */:
            case androidx.media3.extractor.m0.f67467a /* 48000 */:
            case 88200:
            case 96000:
                return 1.0d;
            default:
                throw v0.e("Unsupported sampling rate " + i10);
        }
    }

    private static int c(int i10) throws v0 {
        switch (i10) {
            case 0:
                return 96000;
            case 1:
                return 88200;
            case 2:
                return 64000;
            case 3:
                return androidx.media3.extractor.m0.f67467a;
            case 4:
                return AudioConstants.AUDIO_SAMPLE_RATE;
            case 5:
                return 32000;
            case 6:
                return 24000;
            case 7:
                return 22050;
            case 8:
                return androidx.media3.extractor.a.f66991g;
            case 9:
                return 12000;
            case 10:
                return 11025;
            case 11:
                return 8000;
            case 12:
                return 7350;
            case 13:
            case 14:
            default:
                throw v0.e("Unsupported sampling rate index " + i10);
            case 15:
                return 57600;
            case 16:
                return 51200;
            case 17:
                return 40000;
            case 18:
                return 38400;
            case 19:
                return 34150;
            case 20:
                return 28800;
            case 21:
                return 25600;
            case 22:
                return androidx.core.view.accessibility.j.f48528u0;
            case 23:
                return 19200;
            case 24:
                return 17075;
            case 25:
                return 14400;
            case 26:
                return 12800;
            case 27:
                return 9600;
        }
    }

    private static int d(int i10) throws v0 {
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        int i11 = 2;
        if (i10 != 2) {
            i11 = 3;
            if (i10 != 3) {
                if (i10 == 4) {
                    return 1;
                }
                throw v0.e("Unsupported coreSbrFrameLengthIndex " + i10);
            }
        }
        return i11;
    }

    public static boolean e(int i10) {
        return (i10 & 16777215) == f69492a;
    }

    public static int f(androidx.media3.common.util.n0 n0Var) {
        if (!n0Var.g()) {
            return 0;
        }
        n0Var.s(2);
        return n0Var.h(13);
    }

    public static boolean g(androidx.media3.common.util.n0 n0Var, b bVar) throws v0 {
        n0Var.d();
        int iK = k(n0Var, 3, 8, 8);
        bVar.f69514a = iK;
        if (iK == -1) {
            return false;
        }
        long jL = l(n0Var, 2, 8, 32);
        bVar.f69515b = jL;
        if (jL == -1) {
            return false;
        }
        if (jL > 16) {
            throw v0.e("Contains sub-stream with an invalid packet label " + bVar.f69515b);
        }
        if (jL == 0) {
            int i10 = bVar.f69514a;
            if (i10 == 1) {
                throw v0.a("Mpegh3daConfig packet with invalid packet label 0", null);
            }
            if (i10 == 2) {
                throw v0.a("Mpegh3daFrame packet with invalid packet label 0", null);
            }
            if (i10 == 17) {
                throw v0.a("AudioTruncation packet with invalid packet label 0", null);
            }
        }
        int iK2 = k(n0Var, 11, 24, 24);
        bVar.f69516c = iK2;
        return iK2 != -1;
    }

    public static c h(androidx.media3.common.util.n0 n0Var) throws v0 {
        int iH = n0Var.h(8);
        int iH2 = n0Var.h(5);
        int iH3 = iH2 == 31 ? n0Var.h(24) : c(iH2);
        int iH4 = n0Var.h(3);
        int iA = a(iH4);
        int iD = d(iH4);
        n0Var.s(2);
        p(n0Var);
        m(n0Var, j(n0Var), iD);
        byte[] bArr = null;
        if (n0Var.g()) {
            int iK = k(n0Var, 2, 4, 8) + 1;
            for (int i10 = 0; i10 < iK; i10++) {
                int iK2 = k(n0Var, 4, 8, 16);
                int iK3 = k(n0Var, 4, 8, 16);
                if (iK2 == 7) {
                    int iH5 = n0Var.h(4) + 1;
                    n0Var.s(4);
                    byte[] bArr2 = new byte[iH5];
                    for (int i11 = 0; i11 < iH5; i11++) {
                        bArr2[i11] = (byte) n0Var.h(8);
                    }
                    bArr = bArr2;
                } else {
                    n0Var.s(iK3 * 8);
                }
            }
        }
        byte[] bArr3 = bArr;
        double dB = b(iH3);
        return new c(iH, (int) (((double) iH3) * dB), (int) (((double) iA) * dB), bArr3);
    }

    private static boolean i(androidx.media3.common.util.n0 n0Var) {
        n0Var.s(3);
        boolean zG = n0Var.g();
        if (zG) {
            n0Var.s(13);
        }
        return zG;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0028  */
    private static int j(androidx.media3.common.util.n0 n0Var) {
        int iH = n0Var.h(5);
        int iK = 0;
        for (int i10 = 0; i10 < iH + 1; i10++) {
            int iH2 = n0Var.h(3);
            iK += k(n0Var, 5, 8, 16) + 1;
            if (iH2 != 0) {
                int i11 = 4 >> 2;
                if (iH2 == 2) {
                    if (n0Var.g()) {
                        p(n0Var);
                    }
                }
            } else if (n0Var.g()) {
                p(n0Var);
            }
        }
        return iK;
    }

    private static int k(androidx.media3.common.util.n0 n0Var, int i10, int i11, int i12) {
        androidx.media3.common.util.a.a(Math.max(Math.max(i10, i11), i12) <= 31);
        int i13 = (1 << i10) - 1;
        int i14 = (1 << i11) - 1;
        com.google.common.math.f.c(com.google.common.math.f.c(i13, i14), 1 << i12);
        if (n0Var.b() < i10) {
            return -1;
        }
        int iH = n0Var.h(i10);
        if (iH == i13) {
            if (n0Var.b() < i11) {
                return -1;
            }
            int iH2 = n0Var.h(i11);
            iH += iH2;
            if (iH2 == i14) {
                if (n0Var.b() < i12) {
                    return -1;
                }
                iH += n0Var.h(i12);
            }
        }
        return iH;
    }

    private static long l(androidx.media3.common.util.n0 n0Var, int i10, int i11, int i12) {
        androidx.media3.common.util.a.a(Math.max(Math.max(i10, i11), i12) <= 63);
        long j10 = (1 << i10) - 1;
        long j11 = (1 << i11) - 1;
        com.google.common.math.h.c(com.google.common.math.h.c(j10, j11), 1 << i12);
        if (n0Var.b() < i10) {
            return -1L;
        }
        long j12 = n0Var.j(i10);
        if (j12 != j10) {
            return j12;
        }
        if (n0Var.b() < i11) {
            return -1L;
        }
        long j13 = n0Var.j(i11);
        long j14 = j12 + j13;
        if (j13 != j11) {
            return j14;
        }
        if (n0Var.b() < i12) {
            return -1L;
        }
        return j14 + n0Var.j(i12);
    }

    private static void m(androidx.media3.common.util.n0 n0Var, int i10, int i11) {
        int iH;
        int iK = k(n0Var, 4, 8, 16) + 1;
        n0Var.r();
        for (int i12 = 0; i12 < iK; i12++) {
            int iH2 = n0Var.h(2);
            if (iH2 == 0) {
                i(n0Var);
                if (i11 > 0) {
                    o(n0Var);
                }
            } else if (iH2 == 1) {
                if (i(n0Var)) {
                    n0Var.r();
                }
                if (i11 > 0) {
                    o(n0Var);
                    iH = n0Var.h(2);
                } else {
                    iH = 0;
                }
                if (iH > 0) {
                    n0Var.s(6);
                    int iH3 = n0Var.h(2);
                    n0Var.s(4);
                    if (n0Var.g()) {
                        n0Var.s(5);
                    }
                    if (iH == 2 || iH == 3) {
                        n0Var.s(6);
                    }
                    if (iH3 == 2) {
                        n0Var.r();
                    }
                }
                int iFloor = ((int) Math.floor(Math.log(i10 - 1) / Math.log(2.0d))) + 1;
                int iH4 = n0Var.h(2);
                if (iH4 > 0 && n0Var.g()) {
                    n0Var.s(iFloor);
                }
                if (n0Var.g()) {
                    n0Var.s(iFloor);
                }
                if (i11 == 0 && iH4 == 0) {
                    n0Var.r();
                }
            } else if (iH2 == 3) {
                k(n0Var, 4, 8, 16);
                int iK2 = k(n0Var, 4, 8, 16);
                if (n0Var.g()) {
                    k(n0Var, 8, 16, 0);
                }
                n0Var.r();
                if (iK2 > 0) {
                    n0Var.s(iK2 * 8);
                }
            }
        }
    }

    private static void n(androidx.media3.common.util.n0 n0Var, int i10) {
        int iH;
        boolean zG = n0Var.g();
        int i11 = zG ? 1 : 5;
        int i12 = zG ? 7 : 5;
        int i13 = zG ? 8 : 6;
        int i14 = 0;
        while (i14 < i10) {
            if (n0Var.g()) {
                n0Var.s(7);
                iH = 0;
            } else {
                if (n0Var.h(2) == 3 && n0Var.h(i12) * i11 != 0) {
                    n0Var.r();
                }
                iH = n0Var.h(i13) * i11;
                if (iH != 0 && iH != 180) {
                    n0Var.r();
                }
                n0Var.r();
            }
            if (iH != 0 && iH != 180 && n0Var.g()) {
                i14++;
            }
            i14++;
        }
    }

    private static void o(androidx.media3.common.util.n0 n0Var) {
        n0Var.s(3);
        n0Var.s(8);
        boolean zG = n0Var.g();
        boolean zG2 = n0Var.g();
        if (zG) {
            n0Var.s(5);
        }
        if (zG2) {
            n0Var.s(6);
        }
    }

    private static void p(androidx.media3.common.util.n0 n0Var) {
        int iH = n0Var.h(2);
        if (iH == 0) {
            n0Var.s(6);
            return;
        }
        int iK = k(n0Var, 5, 8, 16) + 1;
        if (iH == 1) {
            n0Var.s(iK * 7);
        } else {
            if (iH == 2) {
                n(n0Var, iK);
            }
        }
    }
}
