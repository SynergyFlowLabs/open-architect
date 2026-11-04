package androidx.media3.exoplayer.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.media3.common.s0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class t {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f64137m = "MediaCodecInfo";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f64138n = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f64140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f64141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    public final MediaCodecInfo.CodecCapabilities f64142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f64143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f64144f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f64145g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f64146h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f64147i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f64148j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f64149k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f64150l;

    @l1
    t(String str, String str2, String str3, @p0 MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f64139a = (String) androidx.media3.common.util.a.g(str);
        this.f64140b = str2;
        this.f64141c = str3;
        this.f64142d = codecCapabilities;
        this.f64146h = z10;
        this.f64147i = z11;
        this.f64148j = z12;
        this.f64143e = z13;
        this.f64144f = z14;
        this.f64145g = z15;
        this.f64149k = z16;
        this.f64150l = s0.v(str2);
    }

    private static boolean A(String str) {
        if (!Build.MODEL.startsWith("SM-T230") || !"OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str)) {
            return false;
        }
        int i10 = 2 & 1;
        return true;
    }

    private static boolean B() {
        String str = Build.MANUFACTURER;
        return str.equals("Xiaomi") || str.equals("OPPO");
    }

    private static boolean C(String str) {
        if (k1.f61540a <= 22) {
            String str2 = Build.MODEL;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    private static boolean D(String str, int i10) {
        if ("video/hevc".equals(str) && 2 == i10) {
            String str2 = Build.DEVICE;
            if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean E(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(Build.DEVICE)) ? false : true;
    }

    public static t F(String str, String str2, String str3, @p0 MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return new t(str, str2, str3, codecCapabilities, z10, z11, z12, (z13 || codecCapabilities == null || !j(codecCapabilities) || C(str)) ? false : true, codecCapabilities != null && v(codecCapabilities), z14 || (codecCapabilities != null && u(codecCapabilities)), o(codecCapabilities));
    }

    private static int a(String str, String str2, int i10) {
        int i11;
        if (i10 <= 1 && ((k1.f61540a < 26 || i10 <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
            if ("audio/ac3".equals(str2)) {
                i11 = 6;
            } else {
                i11 = "audio/eac3".equals(str2) ? 16 : 30;
            }
            androidx.media3.common.util.z.n("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i10 + " to " + i11 + "]");
            return i11;
        }
        return i10;
    }

    private static Point b(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(k1.q(i10, widthAlignment) * widthAlignment, k1.q(i11, heightAlignment) * heightAlignment);
    }

    private static boolean d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Point pointB = b(videoCapabilities, i10, i11);
        int i12 = pointB.x;
        int i13 = pointB.y;
        return (d10 == -1.0d || d10 < 1.0d) ? videoCapabilities.isSizeSupported(i12, i13) : videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
    }

    private static MediaCodecInfo.CodecProfileLevel[] f(@p0 MediaCodecInfo.CodecCapabilities codecCapabilities) {
        int i10;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int iIntValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
        if (iIntValue >= 180000000) {
            i10 = 1024;
        } else if (iIntValue >= 120000000) {
            i10 = 512;
        } else if (iIntValue >= 60000000) {
            i10 = 256;
        } else if (iIntValue >= 30000000) {
            i10 = 128;
        } else if (iIntValue >= 18000000) {
            i10 = 64;
        } else if (iIntValue >= 12000000) {
            i10 = 32;
        } else if (iIntValue >= 7200000) {
            i10 = 16;
        } else if (iIntValue >= 3600000) {
            i10 = 8;
        } else if (iIntValue >= 1800000) {
            i10 = 4;
        } else {
            i10 = iIntValue >= 800000 ? 2 : 1;
        }
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i10;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    @w0(23)
    private static int h(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.getMaxSupportedInstances();
    }

    private static boolean j(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private boolean m(androidx.media3.common.w wVar, boolean z10) {
        Pair<Integer, Integer> pairL = f0.l(wVar);
        String str = wVar.f61761o;
        if (str != null && str.equals(s0.D)) {
            String strW = s0.w(this.f64141c);
            if (strW.equals(s0.D)) {
                return true;
            }
            if (strW.equals("video/hevc")) {
                pairL = f0.u(wVar);
            }
        }
        if (pairL == null) {
            return true;
        }
        int iIntValue = ((Integer) pairL.first).intValue();
        int iIntValue2 = ((Integer) pairL.second).intValue();
        if ("video/dolby-vision".equals(wVar.f61761o)) {
            String str2 = this.f64140b;
            str2.getClass();
            switch (str2) {
                case "video/av01":
                case "video/hevc":
                    iIntValue2 = 0;
                    iIntValue = 2;
                    break;
                case "video/avc":
                    iIntValue = 8;
                    iIntValue2 = 0;
                    break;
            }
        }
        if (!this.f64150l && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrI = i();
        if (k1.f61540a <= 23 && "video/x-vnd.on2.vp9".equals(this.f64140b) && codecProfileLevelArrI.length == 0) {
            codecProfileLevelArrI = f(this.f64142d);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArrI) {
            if (codecProfileLevel.profile == iIntValue && ((codecProfileLevel.level >= iIntValue2 || !z10) && !D(this.f64140b, iIntValue))) {
                return true;
            }
        }
        y("codec.profileLevel, " + wVar.f61757k + ", " + this.f64141c);
        return false;
    }

    private boolean n(androidx.media3.common.w wVar) {
        return (Objects.equals(wVar.f61761o, "audio/flac") && wVar.G == 22 && k1.f61540a < 34 && this.f64139a.equals("c2.android.flac.decoder")) ? false : true;
    }

    private static boolean o(@p0 MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return k1.f61540a >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface") && !B();
    }

    private boolean s(androidx.media3.common.w wVar) {
        return this.f64140b.equals(wVar.f61761o) || this.f64140b.equals(f0.i(wVar));
    }

    private static boolean u(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean v(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private void x(String str) {
        androidx.media3.common.util.z.b("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f64139a + ", " + this.f64140b + "] [" + k1.f61544e + "]");
    }

    private void y(String str) {
        androidx.media3.common.util.z.b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f64139a + ", " + this.f64140b + "] [" + k1.f61544e + "]");
    }

    private static boolean z(String str) {
        return "audio/opus".equals(str);
    }

    @p0
    public Point c(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f64142d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return b(videoCapabilities, i10, i11);
    }

    public androidx.media3.exoplayer.k e(androidx.media3.common.w wVar, androidx.media3.common.w wVar2) {
        androidx.media3.common.w wVar3;
        androidx.media3.common.w wVar4;
        int i10 = !Objects.equals(wVar.f61761o, wVar2.f61761o) ? 8 : 0;
        if (this.f64150l) {
            if (wVar.f61771y != wVar2.f61771y) {
                i10 |= 1024;
            }
            if (!this.f64143e && (wVar.f61768v != wVar2.f61768v || wVar.f61769w != wVar2.f61769w)) {
                i10 |= 512;
            }
            if ((!androidx.media3.common.k.l(wVar.C) || !androidx.media3.common.k.l(wVar2.C)) && !Objects.equals(wVar.C, wVar2.C)) {
                i10 |= 2048;
            }
            if (A(this.f64139a) && !wVar.h(wVar2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new androidx.media3.exoplayer.k(this.f64139a, wVar, wVar2, wVar.h(wVar2) ? 3 : 2, 0);
            }
            wVar3 = wVar;
            wVar4 = wVar2;
        } else {
            wVar3 = wVar;
            wVar4 = wVar2;
            if (wVar3.E != wVar4.E) {
                i10 |= 4096;
            }
            if (wVar3.F != wVar4.F) {
                i10 |= 8192;
            }
            if (wVar3.G != wVar4.G) {
                i10 |= 16384;
            }
            if (i10 == 0 && "audio/mp4a-latm".equals(this.f64140b)) {
                Pair<Integer, Integer> pairL = f0.l(wVar3);
                Pair<Integer, Integer> pairL2 = f0.l(wVar4);
                if (pairL != null && pairL2 != null) {
                    int iIntValue = ((Integer) pairL.first).intValue();
                    int iIntValue2 = ((Integer) pairL2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new androidx.media3.exoplayer.k(this.f64139a, wVar3, wVar4, 3, 0);
                    }
                }
            }
            if (!wVar3.h(wVar4)) {
                i10 |= 32;
            }
            if (z(this.f64140b)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new androidx.media3.exoplayer.k(this.f64139a, wVar3, wVar4, 1, 0);
            }
        }
        return new androidx.media3.exoplayer.k(this.f64139a, wVar3, wVar4, 0, i10);
    }

    public int g() {
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        if (k1.f61540a >= 23 && (codecCapabilities = this.f64142d) != null) {
            return h(codecCapabilities);
        }
        return -1;
    }

    public MediaCodecInfo.CodecProfileLevel[] i() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f64142d;
        if (codecCapabilities != null && (codecProfileLevelArr = codecCapabilities.profileLevels) != null) {
            return codecProfileLevelArr;
        }
        return new MediaCodecInfo.CodecProfileLevel[0];
    }

    public boolean k(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f64142d;
        if (codecCapabilities == null) {
            y("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            y("channelCount.aCaps");
            return false;
        }
        if (a(this.f64139a, this.f64140b, audioCapabilities.getMaxInputChannelCount()) >= i10) {
            return true;
        }
        y("channelCount.support, " + i10);
        return false;
    }

    public boolean l(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f64142d;
        if (codecCapabilities == null) {
            y("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            y("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i10)) {
            return true;
        }
        y("sampleRate.support, " + i10);
        return false;
    }

    public boolean p(androidx.media3.common.w wVar) {
        return s(wVar) && m(wVar, false) && n(wVar);
    }

    public boolean q(androidx.media3.common.w wVar) throws f0.c {
        int i10;
        int i11;
        if (!s(wVar) || !m(wVar, true) || !n(wVar)) {
            return false;
        }
        if (!this.f64150l) {
            int i12 = wVar.F;
            return (i12 == -1 || l(i12)) && ((i10 = wVar.E) == -1 || k(i10));
        }
        int i13 = wVar.f61768v;
        if (i13 <= 0 || (i11 = wVar.f61769w) <= 0) {
            return true;
        }
        return w(i13, i11, wVar.f61770x);
    }

    public boolean r() {
        if (k1.f61540a >= 29 && "video/x-vnd.on2.vp9".equals(this.f64140b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : i()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean t(androidx.media3.common.w wVar) {
        if (this.f64150l) {
            return this.f64143e;
        }
        Pair<Integer, Integer> pairL = f0.l(wVar);
        return pairL != null && ((Integer) pairL.first).intValue() == 42;
    }

    public String toString() {
        return this.f64139a;
    }

    public boolean w(int i10, int i11, double d10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f64142d;
        if (codecCapabilities == null) {
            y("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            y("sizeAndRate.vCaps");
            return false;
        }
        if (k1.f61540a >= 29) {
            int iC = u.c(videoCapabilities, i10, i11, d10);
            if (iC == 2) {
                return true;
            }
            if (iC == 1) {
                y("sizeAndRate.cover, " + i10 + "x" + i11 + "@" + d10);
                return false;
            }
        }
        if (!d(videoCapabilities, i10, i11, d10)) {
            if (i10 >= i11 || !E(this.f64139a) || !d(videoCapabilities, i11, i10, d10)) {
                y("sizeAndRate.support, " + i10 + "x" + i11 + "@" + d10);
                return false;
            }
            x("sizeAndRate.rotated, " + i10 + "x" + i11 + "@" + d10);
        }
        return true;
    }
}
