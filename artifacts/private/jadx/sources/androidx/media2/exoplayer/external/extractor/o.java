package androidx.media2.exoplayer.external.extractor;

import androidx.annotation.b1;
import androidx.media3.extractor.m0;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class o {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f54559h = 4096;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String[] f54560i = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int[] f54561j = {AudioConstants.AUDIO_SAMPLE_RATE, m0.f67467a, 32000};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int[] f54562k = {32000, 64000, 96000, AudioConstants.AUDIO_BIT_RATE, 160000, androidx.media3.extractor.o.f68165f, 224000, androidx.media3.extractor.a.f66993i, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int[] f54563l = {32000, m0.f67467a, 56000, 64000, androidx.media3.extractor.b.f67118a, 96000, 112000, AudioConstants.AUDIO_BIT_RATE, 144000, 160000, 176000, androidx.media3.extractor.o.f68165f, 224000, androidx.media3.extractor.a.f66993i};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int[] f54564m = {32000, m0.f67467a, 56000, 64000, androidx.media3.extractor.b.f67118a, 96000, 112000, AudioConstants.AUDIO_BIT_RATE, 160000, androidx.media3.extractor.o.f68165f, 224000, androidx.media3.extractor.a.f66993i, 320000, 384000};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int[] f54565n = {32000, 40000, m0.f67467a, 56000, 64000, androidx.media3.extractor.b.f67118a, 96000, 112000, AudioConstants.AUDIO_BIT_RATE, 160000, androidx.media3.extractor.o.f68165f, 224000, androidx.media3.extractor.a.f66993i, 320000};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int[] f54566o = {8000, androidx.media3.extractor.a.f66991g, 24000, 32000, 40000, m0.f67467a, 56000, 64000, androidx.media3.extractor.b.f67118a, 96000, 112000, AudioConstants.AUDIO_BIT_RATE, 144000, 160000};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f54567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f54568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f54569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f54570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f54571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f54572f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f54573g;

    public static int a(int header) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if ((header & (-2097152)) != -2097152 || (i10 = (header >>> 19) & 3) == 1 || (i11 = (header >>> 17) & 3) == 0 || (i12 = (header >>> 12) & 15) == 0 || i12 == 15 || (i13 = (header >>> 10) & 3) == 3) {
            return -1;
        }
        int i15 = f54561j[i13];
        if (i10 == 2) {
            i15 /= 2;
        } else if (i10 == 0) {
            i15 /= 4;
        }
        int i16 = (header >>> 9) & 1;
        if (i11 == 3) {
            return ((((i10 == 3 ? f54562k[i12 - 1] : f54563l[i12 - 1]) * 12) / i15) + i16) * 4;
        }
        if (i10 == 3) {
            i14 = i11 == 2 ? f54564m[i12 - 1] : f54565n[i12 - 1];
        } else {
            i14 = f54566o[i12 - 1];
        }
        if (i10 == 3) {
            return ((i14 * 144) / i15) + i16;
        }
        return (((i11 == 1 ? 72 : 144) * i14) / i15) + i16;
    }

    public static boolean b(int headerData, o header) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        if ((headerData & (-2097152)) == -2097152 && (i10 = (headerData >>> 19) & 3) != 1 && (i11 = (headerData >>> 17) & 3) != 0) {
            int i19 = (headerData >>> 12) & 15;
            if (i19 == 0 || i19 == 15) {
                return false;
            }
            int i20 = (headerData >>> 10) & 3;
            if (i20 == 3) {
                return false;
            }
            int i21 = f54561j[i20];
            if (i10 == 2) {
                i21 /= 2;
            } else if (i10 == 0) {
                i21 /= 4;
            }
            int i22 = i21;
            int i23 = (headerData >>> 9) & 1;
            if (i11 == 3) {
                int i24 = i10 == 3 ? f54562k[i19 - 1] : f54563l[i19 - 1];
                i16 = (((i24 * 12) / i22) + i23) * 4;
                i15 = 384;
                i14 = i24;
            } else {
                int i25 = 1152;
                if (i10 == 3) {
                    i12 = i11 == 2 ? f54564m[i19 - 1] : f54565n[i19 - 1];
                    i13 = (i12 * 144) / i22;
                } else {
                    i12 = f54566o[i19 - 1];
                    i25 = i11 == 1 ? 576 : 1152;
                    i13 = ((i11 == 1 ? 72 : 144) * i12) / i22;
                }
                int i26 = i23 + i13;
                i14 = i12;
                i15 = i25;
                i16 = i26;
            }
            String str = f54560i[3 - i11];
            if (((headerData >> 6) & 3) == 3) {
                i18 = i16;
                i17 = 1;
            } else {
                int i27 = i16;
                i17 = 2;
                i18 = i27;
            }
            header.c(i10, str, i18, i22, i17, i14, i15);
            return true;
        }
        return false;
    }

    private void c(int version, String mimeType, int frameSize, int sampleRate, int channels, int bitrate, int samplesPerFrame) {
        this.f54567a = version;
        this.f54568b = mimeType;
        this.f54569c = frameSize;
        this.f54570d = sampleRate;
        this.f54571e = channels;
        this.f54572f = bitrate;
        this.f54573g = samplesPerFrame;
    }
}
