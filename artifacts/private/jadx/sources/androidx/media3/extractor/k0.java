package androidx.media3.extractor;

import androidx.media3.common.util.b1;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f67423a = 4096;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f67424b = 40000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f67425c = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f67426d = {AudioConstants.AUDIO_SAMPLE_RATE, m0.f67467a, 32000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f67427e = {32000, 64000, 96000, AudioConstants.AUDIO_BIT_RATE, 160000, o.f68165f, 224000, androidx.media3.extractor.a.f66993i, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f67428f = {32000, m0.f67467a, 56000, 64000, b.f67118a, 96000, 112000, AudioConstants.AUDIO_BIT_RATE, 144000, 160000, 176000, o.f68165f, 224000, androidx.media3.extractor.a.f66993i};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f67429g = {32000, m0.f67467a, 56000, 64000, b.f67118a, 96000, 112000, AudioConstants.AUDIO_BIT_RATE, 160000, o.f68165f, 224000, androidx.media3.extractor.a.f66993i, 320000, 384000};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f67430h = {32000, 40000, m0.f67467a, 56000, 64000, b.f67118a, 96000, 112000, AudioConstants.AUDIO_BIT_RATE, 160000, o.f68165f, 224000, androidx.media3.extractor.a.f66993i, 320000};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f67431i = {8000, androidx.media3.extractor.a.f66991g, 24000, 32000, 40000, m0.f67467a, 56000, 64000, b.f67118a, 96000, 112000, AudioConstants.AUDIO_BIT_RATE, 144000, 160000};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f67432j = 384;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f67433k = 1152;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f67434l = 1152;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f67435m = 576;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f67436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        public String f67437b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f67438c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f67439d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f67440e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f67441f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f67442g;

        public a() {
        }

        public boolean a(int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            if (!k0.l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
                return false;
            }
            this.f67436a = i11;
            this.f67437b = k0.f67425c[3 - i12];
            int i15 = k0.f67426d[i14];
            this.f67439d = i15;
            if (i11 == 2) {
                this.f67439d = i15 / 2;
            } else if (i11 == 0) {
                this.f67439d = i15 / 4;
            }
            int i16 = (i10 >>> 9) & 1;
            this.f67442g = k0.k(i11, i12);
            if (i12 == 3) {
                int i17 = i11 == 3 ? k0.f67427e[i13 - 1] : k0.f67428f[i13 - 1];
                this.f67441f = i17;
                this.f67438c = (((i17 * 12) / this.f67439d) + i16) * 4;
            } else {
                if (i11 == 3) {
                    int i18 = i12 == 2 ? k0.f67429g[i13 - 1] : k0.f67430h[i13 - 1];
                    this.f67441f = i18;
                    this.f67438c = ((i18 * 144) / this.f67439d) + i16;
                } else {
                    int i19 = k0.f67431i[i13 - 1];
                    this.f67441f = i19;
                    this.f67438c = (((i12 == 1 ? 72 : 144) * i19) / this.f67439d) + i16;
                }
            }
            this.f67440e = ((i10 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }

        public a(a aVar) {
            this.f67436a = aVar.f67436a;
            this.f67437b = aVar.f67437b;
            this.f67438c = aVar.f67438c;
            this.f67439d = aVar.f67439d;
            this.f67440e = aVar.f67440e;
            this.f67441f = aVar.f67441f;
            this.f67442g = aVar.f67442g;
        }
    }

    private k0() {
    }

    public static int j(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if (!l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i16 = f67426d[i14];
        if (i11 == 2) {
            i16 /= 2;
        } else if (i11 == 0) {
            i16 /= 4;
        }
        int i17 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? f67427e[i13 - 1] : f67428f[i13 - 1]) * 12) / i16) + i17) * 4;
        }
        if (i11 == 3) {
            i15 = i12 == 2 ? f67429g[i13 - 1] : f67430h[i13 - 1];
        } else {
            i15 = f67431i[i13 - 1];
        }
        if (i11 == 3) {
            return ((i15 * 144) / i16) + i17;
        }
        return (((i12 == 1 ? 72 : 144) * i15) / i16) + i17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(int i10, int i11) {
        if (i11 == 1) {
            if (i10 == 3) {
                return 1152;
            }
            return f67435m;
        }
        if (i11 == 2) {
            return 1152;
        }
        if (i11 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean l(int i10) {
        return (i10 & (-2097152)) == -2097152;
    }

    public static int m(int i10) {
        int i11;
        int i12;
        if (!l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0) {
            return -1;
        }
        int i13 = (i10 >>> 12) & 15;
        int i14 = (i10 >>> 10) & 3;
        if (i13 == 0 || i13 == 15 || i14 == 3) {
            return -1;
        }
        return k(i11, i12);
    }
}
