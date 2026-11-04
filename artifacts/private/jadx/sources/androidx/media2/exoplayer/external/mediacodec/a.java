package androidx.media2.exoplayer.external.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.util.p;
import androidx.media2.exoplayer.external.util.q0;
import androidx.media2.exoplayer.external.util.s;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f55317m = "MediaCodecInfo";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f55318n = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    public final String f55320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    public final String f55321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    public final MediaCodecInfo.CodecCapabilities f55322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f55323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f55324f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f55325g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f55326h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f55327i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f55328j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f55329k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f55330l;

    private a(String name, @p0 String mimeType, @p0 String codecMimeType, @p0 MediaCodecInfo.CodecCapabilities capabilities, boolean passthrough, boolean hardwareAccelerated, boolean softwareOnly, boolean vendor, boolean forceDisableAdaptive, boolean forceSecure) {
        this.f55319a = (String) androidx.media2.exoplayer.external.util.a.g(name);
        this.f55320b = mimeType;
        this.f55321c = codecMimeType;
        this.f55322d = capabilities;
        this.f55326h = passthrough;
        this.f55327i = hardwareAccelerated;
        this.f55328j = softwareOnly;
        this.f55329k = vendor;
        boolean z10 = false;
        this.f55323e = (forceDisableAdaptive || capabilities == null || !g(capabilities)) ? false : true;
        this.f55324f = capabilities != null && r(capabilities);
        if (forceSecure || (capabilities != null && p(capabilities))) {
            z10 = true;
        }
        this.f55325g = z10;
        this.f55330l = s.n(mimeType);
    }

    private static int a(String name, String mimeType, int maxChannelCount) {
        int i10;
        if (maxChannelCount <= 1 && ((q0.f57626a < 26 || maxChannelCount <= 0) && !"audio/mpeg".equals(mimeType) && !"audio/3gpp".equals(mimeType) && !"audio/amr-wb".equals(mimeType) && !"audio/mp4a-latm".equals(mimeType) && !"audio/vorbis".equals(mimeType) && !"audio/opus".equals(mimeType) && !"audio/raw".equals(mimeType) && !"audio/flac".equals(mimeType) && !"audio/g711-alaw".equals(mimeType) && !"audio/g711-mlaw".equals(mimeType) && !"audio/gsm".equals(mimeType))) {
            if ("audio/ac3".equals(mimeType)) {
                i10 = 6;
            } else {
                i10 = "audio/eac3".equals(mimeType) ? 16 : 30;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 59);
            sb2.append("AssumedMaxChannelAdjustment: ");
            sb2.append(name);
            sb2.append(", [");
            sb2.append(maxChannelCount);
            sb2.append(" to ");
            sb2.append(i10);
            sb2.append("]");
            p.l("MediaCodecInfo", sb2.toString());
            return i10;
        }
        return maxChannelCount;
    }

    @e.b(21)
    private static boolean c(MediaCodecInfo.VideoCapabilities capabilities, int width, int height, double frameRate) {
        return (frameRate == -1.0d || frameRate <= 0.0d) ? capabilities.isSizeSupported(width, height) : capabilities.areSizeAndRateSupported(width, height, Math.floor(frameRate));
    }

    @e.b(23)
    private static int e(MediaCodecInfo.CodecCapabilities capabilities) {
        return capabilities.getMaxSupportedInstances();
    }

    private static boolean g(MediaCodecInfo.CodecCapabilities capabilities) {
        return q0.f57626a >= 19 && h(capabilities);
    }

    @e.b(19)
    private static boolean h(MediaCodecInfo.CodecCapabilities capabilities) {
        return capabilities.isFeatureSupported("adaptive-playback");
    }

    private static boolean p(MediaCodecInfo.CodecCapabilities capabilities) {
        return q0.f57626a >= 21 && q(capabilities);
    }

    @e.b(21)
    private static boolean q(MediaCodecInfo.CodecCapabilities capabilities) {
        return capabilities.isFeatureSupported("secure-playback");
    }

    private static boolean r(MediaCodecInfo.CodecCapabilities capabilities) {
        return q0.f57626a >= 21 && s(capabilities);
    }

    @e.b(21)
    private static boolean s(MediaCodecInfo.CodecCapabilities capabilities) {
        return capabilities.isFeatureSupported("tunneled-playback");
    }

    private void u(String message) {
        String str = this.f55319a;
        String str2 = this.f55320b;
        String str3 = q0.f57630e;
        StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 25 + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append("AssumedSupport [");
        sb2.append(message);
        sb2.append("] [");
        sb2.append(str);
        sb2.append(", ");
        sb2.append(str2);
        sb2.append("] [");
        sb2.append(str3);
        sb2.append("]");
        p.b("MediaCodecInfo", sb2.toString());
    }

    private void v(String message) {
        String str = this.f55319a;
        String str2 = this.f55320b;
        String str3 = q0.f57630e;
        StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 20 + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append("NoSupport [");
        sb2.append(message);
        sb2.append("] [");
        sb2.append(str);
        sb2.append(", ");
        sb2.append(str2);
        sb2.append("] [");
        sb2.append(str3);
        sb2.append("]");
        p.b("MediaCodecInfo", sb2.toString());
    }

    public static a w(String name, String mimeType, String codecMimeType, @p0 MediaCodecInfo.CodecCapabilities capabilities, boolean hardwareAccelerated, boolean softwareOnly, boolean vendor, boolean forceDisableAdaptive, boolean forceSecure) {
        return new a(name, mimeType, codecMimeType, capabilities, false, hardwareAccelerated, softwareOnly, vendor, forceDisableAdaptive, forceSecure);
    }

    public static a x(String name) {
        int i10 = 3 & 0;
        return new a(name, null, null, null, true, false, true, false, false, false);
    }

    @e.b(21)
    public Point b(int width, int height) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f55322d;
        if (codecCapabilities == null) {
            v("align.caps");
            return null;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            v("align.vCaps");
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(q0.k(width, widthAlignment) * widthAlignment, q0.k(height, heightAlignment) * heightAlignment);
    }

    public int d() {
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        if (q0.f57626a < 23 || (codecCapabilities = this.f55322d) == null) {
            return -1;
        }
        return e(codecCapabilities);
    }

    public MediaCodecInfo.CodecProfileLevel[] f() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f55322d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    @e.b(21)
    public boolean i(int channelCount) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f55322d;
        if (codecCapabilities == null) {
            v("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            v("channelCount.aCaps");
            return false;
        }
        if (a(this.f55319a, this.f55320b, audioCapabilities.getMaxInputChannelCount()) >= channelCount) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("channelCount.support, ");
        sb2.append(channelCount);
        v(sb2.toString());
        return false;
    }

    @e.b(21)
    public boolean j(int sampleRate) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f55322d;
        if (codecCapabilities == null) {
            v("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            v("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(sampleRate)) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder(31);
        sb2.append("sampleRate.support, ");
        sb2.append(sampleRate);
        v(sb2.toString());
        return false;
    }

    public boolean k(Format format) {
        String strD;
        String str = format.f53098f;
        if (str == null || this.f55320b == null || (strD = s.d(str)) == null) {
            return true;
        }
        if (!this.f55320b.equals(strD)) {
            String str2 = format.f53098f;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 13 + strD.length());
            sb2.append("codec.mime ");
            sb2.append(str2);
            sb2.append(", ");
            sb2.append(strD);
            v(sb2.toString());
            return false;
        }
        Pair<Integer, Integer> pairH = h.h(format);
        if (pairH == null) {
            return true;
        }
        int iIntValue = ((Integer) pairH.first).intValue();
        int iIntValue2 = ((Integer) pairH.second).intValue();
        if (!this.f55330l && iIntValue != 42) {
            return true;
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : f()) {
            if (codecProfileLevel.profile == iIntValue && codecProfileLevel.level >= iIntValue2) {
                return true;
            }
        }
        String str3 = format.f53098f;
        StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 22 + strD.length());
        sb3.append("codec.profileLevel, ");
        sb3.append(str3);
        sb3.append(", ");
        sb3.append(strD);
        v(sb3.toString());
        return false;
    }

    public boolean l(Format format) throws h.c {
        int i10;
        int i11;
        int i12;
        if (!k(format)) {
            return false;
        }
        if (!this.f55330l) {
            return q0.f57626a < 21 || (((i10 = format.f53112p0) == -1 || j(i10)) && ((i11 = format.Z) == -1 || i(i11)));
        }
        int i13 = format.f53110n;
        if (i13 > 0 && (i12 = format.f53111o) > 0) {
            if (q0.f57626a >= 21) {
                return t(i13, i12, format.f53115s);
            }
            boolean z10 = i13 * i12 <= h.B();
            if (!z10) {
                int i14 = format.f53110n;
                int i15 = format.f53111o;
                StringBuilder sb2 = new StringBuilder(40);
                sb2.append("legacyFrameSize, ");
                sb2.append(i14);
                sb2.append("x");
                sb2.append(i15);
                v(sb2.toString());
            }
            return z10;
        }
        return true;
    }

    public boolean m() {
        if (q0.f57626a >= 29 && "video/x-vnd.on2.vp9".equals(this.f55320b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : f()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean n(Format format) {
        if (this.f55330l) {
            return this.f55323e;
        }
        Pair<Integer, Integer> pairH = h.h(format);
        return pairH != null && ((Integer) pairH.first).intValue() == 42;
    }

    public boolean o(Format oldFormat, Format newFormat, boolean isNewFormatComplete) {
        if (this.f55330l) {
            return oldFormat.f53103i.equals(newFormat.f53103i) && oldFormat.f53116t == newFormat.f53116t && (this.f55323e || (oldFormat.f53110n == newFormat.f53110n && oldFormat.f53111o == newFormat.f53111o)) && ((!isNewFormatComplete && newFormat.Y == null) || q0.b(oldFormat.Y, newFormat.Y));
        }
        if ("audio/mp4a-latm".equals(this.f55320b) && oldFormat.f53103i.equals(newFormat.f53103i) && oldFormat.Z == newFormat.Z && oldFormat.f53112p0 == newFormat.f53112p0) {
            Pair<Integer, Integer> pairH = h.h(oldFormat);
            Pair<Integer, Integer> pairH2 = h.h(newFormat);
            if (pairH != null && pairH2 != null) {
                int iIntValue = ((Integer) pairH.first).intValue();
                int iIntValue2 = ((Integer) pairH2.first).intValue();
                if (iIntValue == 42 && iIntValue2 == 42) {
                    return true;
                }
            }
        }
        return false;
    }

    @e.b(21)
    public boolean t(int width, int height, double frameRate) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f55322d;
        if (codecCapabilities == null) {
            v("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            v("sizeAndRate.vCaps");
            return false;
        }
        if (!c(videoCapabilities, width, height, frameRate)) {
            if (width >= height || !c(videoCapabilities, height, width, frameRate)) {
                StringBuilder sb2 = new StringBuilder(69);
                sb2.append("sizeAndRate.support, ");
                sb2.append(width);
                sb2.append("x");
                sb2.append(height);
                sb2.append("x");
                sb2.append(frameRate);
                v(sb2.toString());
                return false;
            }
            StringBuilder sb3 = new StringBuilder(69);
            sb3.append("sizeAndRate.rotated, ");
            sb3.append(width);
            sb3.append("x");
            sb3.append(height);
            sb3.append("x");
            sb3.append(frameRate);
            u(sb3.toString());
        }
        return true;
    }

    public String toString() {
        return this.f55319a;
    }
}
