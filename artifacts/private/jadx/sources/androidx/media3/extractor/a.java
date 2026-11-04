package androidx.media3.extractor;

import androidx.media3.common.util.b1;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f66985a = "AacUtil";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f66986b = 1024;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f66987c = 1024;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f66988d = 2048;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f66989e = 512;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f66990f = 100000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f66992h = 7000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f66993i = 256000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f66994j = 8000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f66995k = 15;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f66997m = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f66999o = "mp4a.40.";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f67000p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f67001q = 5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f67002r = 22;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f67003s = 23;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f67004t = 29;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f67005u = 31;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f67006v = 42;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f66991g = 16000;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int[] f66996l = {96000, 88200, 64000, m0.f67467a, AudioConstants.AUDIO_SAMPLE_RATE, 32000, 24000, 22050, f66991g, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int[] f66998n = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f67007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f67008b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f67009c;

        private c(int i10, int i11, String str) {
            this.f67007a = i10;
            this.f67008b = i11;
            this.f67009c = str;
        }
    }

    private a() {
    }

    public static byte[] a(int i10, int i11) {
        int i12 = 0;
        int i13 = -1;
        int i14 = 0;
        while (true) {
            int[] iArr = f66996l;
            if (i14 >= iArr.length) {
                break;
            }
            if (i10 == iArr[i14]) {
                i13 = i14;
            }
            i14++;
        }
        int i15 = -1;
        while (true) {
            int[] iArr2 = f66998n;
            if (i12 >= iArr2.length) {
                break;
            }
            if (i11 == iArr2[i12]) {
                i15 = i12;
            }
            i12++;
        }
        if (i10 != -1 && i15 != -1) {
            return b(2, i13, i15);
        }
        throw new IllegalArgumentException("Invalid sample rate or number of channels: " + i10 + ", " + i11);
    }

    public static byte[] b(int i10, int i11, int i12) {
        int i13 = 2 << 0;
        return new byte[]{(byte) (((i10 << 3) & com.planner5d.library.engine.input.f.b.R1) | ((i11 >> 1) & 7)), (byte) (((i11 << 7) & 128) | ((i12 << 3) & 120))};
    }

    private static int c(androidx.media3.common.util.n0 n0Var) {
        int iH = n0Var.h(5);
        return iH == 31 ? n0Var.h(6) + 32 : iH;
    }

    private static int d(androidx.media3.common.util.n0 n0Var) throws androidx.media3.common.v0 {
        int iH = n0Var.h(4);
        if (iH == 15) {
            if (n0Var.b() >= 24) {
                return n0Var.h(24);
            }
            throw androidx.media3.common.v0.a("AAC header insufficient data", null);
        }
        if (iH < 13) {
            return f66996l[iH];
        }
        throw androidx.media3.common.v0.a("AAC header wrong Sampling Frequency Index", null);
    }

    public static c e(androidx.media3.common.util.n0 n0Var, boolean z10) throws androidx.media3.common.v0 {
        int iC = c(n0Var);
        int iD = d(n0Var);
        int iH = n0Var.h(4);
        String str = f66999o + iC;
        if (iC == 5 || iC == 29) {
            iD = d(n0Var);
            iC = c(n0Var);
            if (iC == 22) {
                iH = n0Var.h(4);
            }
        }
        if (z10) {
            if (iC != 1 && iC != 2 && iC != 3 && iC != 4 && iC != 6 && iC != 7 && iC != 17) {
                switch (iC) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw androidx.media3.common.v0.e("Unsupported audio object type: " + iC);
                }
            }
            g(n0Var, iC, iH);
            switch (iC) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iH2 = n0Var.h(2);
                    if (iH2 == 2 || iH2 == 3) {
                        throw androidx.media3.common.v0.e("Unsupported epConfig: " + iH2);
                    }
                    break;
            }
        }
        int i10 = f66998n[iH];
        if (i10 != -1) {
            return new c(iD, i10, str);
        }
        throw androidx.media3.common.v0.a(null, null);
    }

    public static c f(byte[] bArr) throws androidx.media3.common.v0 {
        return e(new androidx.media3.common.util.n0(bArr), false);
    }

    private static void g(androidx.media3.common.util.n0 n0Var, int i10, int i11) {
        if (n0Var.g()) {
            androidx.media3.common.util.z.n(f66985a, "Unexpected frameLengthFlag = 1");
        }
        if (n0Var.g()) {
            n0Var.s(14);
        }
        boolean zG = n0Var.g();
        if (i11 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i10 == 6 || i10 == 20) {
            n0Var.s(3);
        }
        if (zG) {
            if (i10 == 22) {
                n0Var.s(16);
            }
            if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                n0Var.s(3);
            }
            n0Var.s(1);
        }
    }
}
