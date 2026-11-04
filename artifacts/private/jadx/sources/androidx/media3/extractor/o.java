package androidx.media3.extractor;

import androidx.media3.common.DrmInitData;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class o {
    private static final byte A = 113;
    private static final byte B = -24;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f68160a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f68161b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f68162c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f68163d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f68164e = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f68166g = 2250000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f68167h = 768000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f68168i = 2147385345;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f68169j = 536864768;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f68170k = -25230976;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f68171l = -14745368;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f68172m = 1683496997;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f68173n = 622876772;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f68174o = 1078008818;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f68175p = -233094848;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f68176q = 1908687592;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f68177r = -398277519;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final byte f68178s = 127;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final byte f68179t = 31;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final byte f68180u = -2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final byte f68181v = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final byte f68182w = 100;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final byte f68183x = 37;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final byte f68184y = 64;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final byte f68185z = -14;
    private static final int[] C = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] D = {-1, 8000, androidx.media3.extractor.a.f66991g, 32000, -1, -1, 11025, 22050, AudioConstants.AUDIO_SAMPLE_RATE, -1, -1, 12000, 24000, m0.f67467a, -1, -1};
    private static final int[] E = {64, com.planner5d.library.engine.input.f.b.B, 128, 192, 224, 256, a5.S0, 448, 512, 640, com.google.android.material.internal.p0.f112892a, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f68165f = 192000;
    private static final int[] F = {8000, androidx.media3.extractor.a.f66991g, 32000, 64000, AudioConstants.AUDIO_BIT_RATE, 22050, AudioConstants.AUDIO_SAMPLE_RATE, 88200, 176400, 352800, 12000, 24000, m0.f67467a, 96000, f68165f, 384000};
    private static final int[] G = {5, 8, 10, 12};
    private static final int[] H = {6, 9, 12, 15};
    private static final int[] I = {2, 4, 6, 8};
    private static final int[] J = {9, 11, 13, 16};
    private static final int[] K = {5, 8, 10, 12};

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f68186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f68187b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f68188c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f68189d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f68190e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f68191f;

        private c(String str, int i10, int i11, int i12, long j10, int i13) {
            this.f68186a = str;
            this.f68188c = i10;
            this.f68187b = i11;
            this.f68189d = i12;
            this.f68190e = j10;
            this.f68191f = i13;
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    private o() {
    }

    private static void a(byte[] bArr, int i10) throws androidx.media3.common.v0 {
        int i11 = i10 - 2;
        if (((bArr[i10 - 1] & 255) | ((bArr[i11] << 8) & 65535)) != k1.C(bArr, 0, i11, 65535)) {
            throw androidx.media3.common.v0.a("CRC check failed", null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0072  */
    /* JADX WARN: Code duplicated, block: B:18:? A[RETURN, SYNTHETIC] */
    public static int b(byte[] bArr) {
        int i10;
        byte b10;
        int i11;
        int i12;
        byte b11;
        boolean z10 = false;
        byte b12 = bArr[0];
        if (b12 != -2) {
            if (b12 == -1) {
                i12 = ((bArr[7] & 3) << 12) | ((bArr[6] & 255) << 4);
                b11 = bArr[9];
            } else if (b12 != 31) {
                i10 = ((bArr[5] & 3) << 12) | ((bArr[6] & 255) << 4);
                b10 = bArr[7];
            } else {
                i12 = ((bArr[6] & 3) << 12) | ((bArr[7] & 255) << 4);
                b11 = bArr[8];
            }
            i11 = (((b11 & 60) >> 2) | i12) + 1;
            z10 = true;
            if (z10) {
                return (i11 * 16) / 14;
            }
            return i11;
        }
        i10 = ((bArr[4] & 3) << 12) | ((bArr[7] & 255) << 4);
        b10 = bArr[6];
        i11 = (((b10 & 240) >> 4) | i10) + 1;
        if (z10) {
            return (i11 * 16) / 14;
        }
        return i11;
    }

    public static int c(int i10) {
        if (i10 != f68168i && i10 != f68170k && i10 != f68169j && i10 != f68171l) {
            if (i10 != f68172m && i10 != f68173n) {
                if (i10 == f68174o || i10 == f68175p) {
                    return 3;
                }
                return (i10 == f68176q || i10 == f68177r) ? 4 : 0;
            }
            return 2;
        }
        return 1;
    }

    private static androidx.media3.common.util.n0 d(byte[] bArr) {
        byte b10 = bArr[0];
        if (b10 == 127 || b10 == 100 || b10 == 64 || b10 == 113) {
            return new androidx.media3.common.util.n0(bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        if (e(bArrCopyOf)) {
            for (int i10 = 0; i10 < bArrCopyOf.length - 1; i10 += 2) {
                byte b11 = bArrCopyOf[i10];
                int i11 = i10 + 1;
                bArrCopyOf[i10] = bArrCopyOf[i11];
                bArrCopyOf[i11] = b11;
            }
        }
        androidx.media3.common.util.n0 n0Var = new androidx.media3.common.util.n0(bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            androidx.media3.common.util.n0 n0Var2 = new androidx.media3.common.util.n0(bArrCopyOf);
            while (n0Var2.b() >= 16) {
                n0Var2.s(2);
                n0Var.f(n0Var2.h(14), 14);
            }
        }
        n0Var.o(bArrCopyOf);
        return n0Var;
    }

    private static boolean e(byte[] bArr) {
        byte b10 = bArr[0];
        return b10 == -2 || b10 == -1 || b10 == 37 || b10 == -14 || b10 == -24;
    }

    public static int f(ByteBuffer byteBuffer) {
        int i10;
        byte b10;
        int i11;
        byte b11;
        if (byteBuffer.getInt(0) == f68175p || byteBuffer.getInt(0) == f68177r) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == f68173n) {
            return 4096;
        }
        int iPosition = byteBuffer.position();
        byte b12 = byteBuffer.get(iPosition);
        if (b12 != -2) {
            if (b12 == -1) {
                i10 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                b11 = byteBuffer.get(iPosition + 7);
            } else if (b12 != 31) {
                i10 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                b10 = byteBuffer.get(iPosition + 5);
            } else {
                i10 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                b11 = byteBuffer.get(iPosition + 6);
            }
            i11 = b11 & 60;
            return (((i11 >> 2) | i10) + 1) * 32;
        }
        i10 = (byteBuffer.get(iPosition + 5) & 1) << 6;
        b10 = byteBuffer.get(iPosition + 4);
        i11 = b10 & 252;
        return (((i11 >> 2) | i10) + 1) * 32;
    }

    public static int g(byte[] bArr) {
        int i10;
        byte b10;
        int i11;
        byte b11;
        byte b12 = bArr[0];
        if (b12 != -2) {
            if (b12 == -1) {
                i10 = (bArr[4] & 7) << 4;
                b11 = bArr[7];
            } else if (b12 != 31) {
                i10 = (bArr[4] & 1) << 6;
                b10 = bArr[5];
            } else {
                i10 = (bArr[5] & 7) << 4;
                b11 = bArr[6];
            }
            i11 = b11 & 60;
            return (((i11 >> 2) | i10) + 1) * 32;
        }
        i10 = (bArr[5] & 1) << 6;
        b10 = bArr[4];
        i11 = b10 & 252;
        return (((i11 >> 2) | i10) + 1) * 32;
    }

    public static androidx.media3.common.w h(byte[] bArr, @androidx.annotation.p0 String str, @androidx.annotation.p0 String str2, int i10, String str3, @androidx.annotation.p0 DrmInitData drmInitData) {
        androidx.media3.common.util.n0 n0VarD = d(bArr);
        n0VarD.s(60);
        int i11 = C[n0VarD.h(6)];
        int i12 = D[n0VarD.h(4)];
        int iH = n0VarD.h(5);
        int[] iArr = E;
        int i13 = iH >= iArr.length ? -1 : (iArr[iH] * 1000) / 2;
        n0VarD.s(10);
        return new androidx.media3.common.w.b().f0(str).U(str3).u0("audio/vnd.dts").Q(i13).R(i11 + (n0VarD.h(2) > 0 ? 1 : 0)).v0(i12).Y(drmInitData).j0(str2).s0(i10).N();
    }

    public static c i(byte[] bArr) throws androidx.media3.common.v0 {
        int i10;
        int i11;
        int iH;
        int i12;
        long jX1;
        int i13;
        androidx.media3.common.util.n0 n0VarD = d(bArr);
        n0VarD.s(40);
        int iH2 = n0VarD.h(2);
        if (n0VarD.g()) {
            i10 = 20;
            i11 = 12;
        } else {
            i10 = 16;
            i11 = 8;
        }
        n0VarD.s(i11);
        int iH3 = n0VarD.h(i10) + 1;
        boolean zG = n0VarD.g();
        int iH4 = -1;
        int i14 = 0;
        if (zG) {
            iH = n0VarD.h(2);
            int iH5 = (n0VarD.h(3) + 1) * 512;
            if (n0VarD.g()) {
                n0VarD.s(36);
            }
            int iH6 = n0VarD.h(3) + 1;
            int iH7 = n0VarD.h(3) + 1;
            if (iH6 != 1 || iH7 != 1) {
                throw androidx.media3.common.v0.e("Multiple audio presentations or assets not supported");
            }
            int i15 = iH2 + 1;
            int iH8 = n0VarD.h(i15);
            for (int i16 = 0; i16 < i15; i16++) {
                if (((iH8 >> i16) & 1) == 1) {
                    n0VarD.s(8);
                }
            }
            if (n0VarD.g()) {
                n0VarD.s(2);
                int iH9 = (n0VarD.h(2) + 1) << 2;
                int iH10 = n0VarD.h(2) + 1;
                while (i14 < iH10) {
                    n0VarD.s(iH9);
                    i14++;
                }
            }
            i14 = iH5;
        } else {
            iH = -1;
        }
        n0VarD.s(i10);
        n0VarD.s(12);
        if (zG) {
            if (n0VarD.g()) {
                n0VarD.s(4);
            }
            if (n0VarD.g()) {
                n0VarD.s(24);
            }
            if (n0VarD.g()) {
                n0VarD.t(n0VarD.h(10) + 1);
            }
            n0VarD.s(5);
            i12 = F[n0VarD.h(4)];
            iH4 = n0VarD.h(8) + 1;
        } else {
            i12 = androidx.media3.common.j.f60676f;
        }
        int i17 = i12;
        if (zG) {
            if (iH == 0) {
                i13 = 32000;
            } else if (iH == 1) {
                i13 = AudioConstants.AUDIO_SAMPLE_RATE;
            } else {
                if (iH != 2) {
                    throw androidx.media3.common.v0.a("Unsupported reference clock code in DTS HD header: " + iH, null);
                }
                i13 = m0.f67467a;
            }
            jX1 = k1.X1(i14, 1000000L, i13);
        } else {
            jX1 = -9223372036854775807L;
        }
        return new c("audio/vnd.dts.hd;profile=lbr", iH4, i17, iH3, jX1, 0);
    }

    public static int j(byte[] bArr) {
        androidx.media3.common.util.n0 n0VarD = d(bArr);
        n0VarD.s(42);
        return n0VarD.h(n0VarD.g() ? 12 : 8) + 1;
    }

    public static c k(byte[] bArr, AtomicInteger atomicInteger) throws androidx.media3.common.v0 {
        int iH;
        long jX1;
        AtomicInteger atomicInteger2;
        int i10;
        int i11;
        androidx.media3.common.util.n0 n0VarD = d(bArr);
        int i12 = n0VarD.h(32) == f68174o ? 1 : 0;
        int iM = m(n0VarD, G, true) + 1;
        if (i12 == 0) {
            iH = androidx.media3.common.j.f60676f;
            jX1 = -9223372036854775807L;
        } else {
            if (!n0VarD.g()) {
                throw androidx.media3.common.v0.e("Only supports full channel mask-based audio presentation");
            }
            a(bArr, iM);
            int iH2 = n0VarD.h(2);
            if (iH2 == 0) {
                i10 = 512;
            } else if (iH2 == 1) {
                i10 = 480;
            } else {
                if (iH2 != 2) {
                    throw androidx.media3.common.v0.a("Unsupported base duration index in DTS UHD header: " + iH2, null);
                }
                i10 = a5.S0;
            }
            int iH3 = i10 * (n0VarD.h(3) + 1);
            int iH4 = n0VarD.h(2);
            if (iH4 == 0) {
                i11 = 32000;
            } else if (iH4 == 1) {
                i11 = AudioConstants.AUDIO_SAMPLE_RATE;
            } else {
                if (iH4 != 2) {
                    throw androidx.media3.common.v0.a("Unsupported clock rate index in DTS UHD header: " + iH4, null);
                }
                i11 = m0.f67467a;
            }
            if (n0VarD.g()) {
                n0VarD.s(36);
            }
            iH = (1 << n0VarD.h(2)) * i11;
            jX1 = k1.X1(iH3, 1000000L, i11);
        }
        int i13 = iH;
        long j10 = jX1;
        int iM2 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            iM2 += m(n0VarD, H, true);
        }
        if (i12 != 0) {
            atomicInteger2 = atomicInteger;
            atomicInteger2.set(m(n0VarD, I, true));
        } else {
            atomicInteger2 = atomicInteger;
        }
        return new c(androidx.media3.common.s0.f61293a0, 2, i13, iM + iM2 + (atomicInteger2.get() != 0 ? m(n0VarD, J, true) : 0), j10, 0);
    }

    public static int l(byte[] bArr) {
        androidx.media3.common.util.n0 n0VarD = d(bArr);
        n0VarD.s(32);
        return m(n0VarD, K, true) + 1;
    }

    private static int m(androidx.media3.common.util.n0 n0Var, int[] iArr, boolean z10) {
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < 3 && n0Var.g(); i12++) {
            i11++;
        }
        if (z10) {
            int i13 = 0;
            while (i10 < i11) {
                i13 += 1 << iArr[i10];
                i10++;
            }
            i10 = i13;
        }
        return i10 + n0Var.h(iArr[i11]);
    }
}
