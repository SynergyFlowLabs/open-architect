package androidx.media2.exoplayer.external.util;

import android.text.TextUtils;
import androidx.annotation.b1;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class s {
    public static final String A = "audio/g711-alaw";
    public static final String B = "audio/g711-mlaw";
    public static final String C = "audio/ac3";
    public static final String D = "audio/eac3";
    public static final String E = "audio/eac3-joc";
    public static final String F = "audio/ac4";
    public static final String G = "audio/true-hd";
    public static final String H = "audio/vnd.dts";
    public static final String I = "audio/vnd.dts.hd";
    public static final String J = "audio/vnd.dts.hd;profile=lbr";
    public static final String K = "audio/vorbis";
    public static final String L = "audio/opus";
    public static final String M = "audio/3gpp";
    public static final String N = "audio/amr-wb";
    public static final String O = "audio/flac";
    public static final String P = "audio/alac";
    public static final String Q = "audio/gsm";
    public static final String R = "audio/x-unknown";
    public static final String S = "text/vtt";
    public static final String T = "text/x-ssa";
    public static final String U = "application/mp4";
    public static final String V = "application/webm";
    public static final String W = "application/dash+xml";
    public static final String X = "application/x-mpegURL";
    public static final String Y = "application/vnd.ms-sstr+xml";
    public static final String Z = "application/id3";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f57639a = "video";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f57640a0 = "application/cea-608";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f57641b = "audio";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String f57642b0 = "application/cea-708";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f57643c = "text";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f57644c0 = "application/x-subrip";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f57645d = "application";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final String f57646d0 = "application/ttml+xml";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f57647e = "video/mp4";

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final String f57648e0 = "application/x-quicktime-tx3g";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f57649f = "video/webm";

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final String f57650f0 = "application/x-mp4-vtt";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f57651g = "video/3gpp";

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final String f57652g0 = "application/x-mp4-cea-608";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f57653h = "video/avc";

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final String f57654h0 = "application/x-rawcc";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f57655i = "video/hevc";

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final String f57656i0 = "application/vobsub";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f57657j = "video/x-vnd.on2.vp8";

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final String f57658j0 = "application/pgs";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f57659k = "video/x-vnd.on2.vp9";

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final String f57660k0 = "application/x-scte35";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f57661l = "video/av01";

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final String f57662l0 = "application/x-camera-motion";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f57663m = "video/mp4v-es";

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final String f57664m0 = "application/x-emsg";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f57665n = "video/mpeg";

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final String f57666n0 = "application/dvbsubs";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f57667o = "video/mpeg2";

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final String f57668o0 = "application/x-exif";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f57669p = "video/wvc1";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final String f57670p0 = "application/x-icy";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f57671q = "video/divx";

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final ArrayList<a> f57672q0 = new ArrayList<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f57673r = "video/dolby-vision";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f57674s = "video/x-unknown";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f57675t = "audio/mp4";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f57676u = "audio/mp4a-latm";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f57677v = "audio/webm";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f57678w = "audio/mpeg";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f57679x = "audio/mpeg-L1";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f57680y = "audio/mpeg-L2";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f57681z = "audio/raw";

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f57682a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f57683b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f57684c;

        public a(String mimeType, String codecPrefix, int trackType) {
            this.f57682a = mimeType;
            this.f57683b = codecPrefix;
            this.f57684c = trackType;
        }
    }

    private s() {
    }

    @androidx.annotation.p0
    public static String a(@androidx.annotation.p0 String codecs) {
        if (codecs == null) {
            return null;
        }
        for (String str : q0.Q0(codecs)) {
            String strD = d(str);
            if (strD != null && l(strD)) {
                return strD;
            }
        }
        return null;
    }

    @androidx.annotation.p0
    private static String b(String codec) {
        int size = f57672q0.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = f57672q0.get(i10);
            if (codec.startsWith(aVar.f57683b)) {
                return aVar.f57682a;
            }
        }
        return null;
    }

    public static int c(String mimeType) {
        mimeType.getClass();
        switch (mimeType) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts":
                return 7;
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/eac3":
                return 6;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    @androidx.annotation.p0
    public static String d(@androidx.annotation.p0 String codec) {
        String strE = null;
        if (codec == null) {
            return null;
        }
        String strV0 = q0.V0(codec.trim());
        if (strV0.startsWith("avc1") || strV0.startsWith("avc3")) {
            return "video/avc";
        }
        if (strV0.startsWith("hev1") || strV0.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (strV0.startsWith("dvav") || strV0.startsWith("dva1") || strV0.startsWith("dvhe") || strV0.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (strV0.startsWith("av01")) {
            return "video/av01";
        }
        if (strV0.startsWith("vp9") || strV0.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (strV0.startsWith("vp8") || strV0.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (strV0.startsWith("mp4a")) {
            if (strV0.startsWith("mp4a.")) {
                String strSubstring = strV0.substring(5);
                if (strSubstring.length() >= 2) {
                    try {
                        strE = e(Integer.parseInt(q0.W0(strSubstring.substring(0, 2)), 16));
                    } catch (NumberFormatException unused) {
                    }
                }
            }
            return strE == null ? "audio/mp4a-latm" : strE;
        }
        if (strV0.startsWith("ac-3") || strV0.startsWith("dac3")) {
            return "audio/ac3";
        }
        if (strV0.startsWith("ec-3") || strV0.startsWith("dec3")) {
            return "audio/eac3";
        }
        if (strV0.startsWith(androidx.media3.common.s0.f61306e1)) {
            return "audio/eac3-joc";
        }
        if (strV0.startsWith("ac-4") || strV0.startsWith("dac4")) {
            return "audio/ac4";
        }
        if (strV0.startsWith("dtsc") || strV0.startsWith("dtse")) {
            return "audio/vnd.dts";
        }
        if (strV0.startsWith("dtsh") || strV0.startsWith("dtsl")) {
            return "audio/vnd.dts.hd";
        }
        if (strV0.startsWith("opus")) {
            return "audio/opus";
        }
        if (strV0.startsWith("vorbis")) {
            return "audio/vorbis";
        }
        return strV0.startsWith("flac") ? "audio/flac" : b(strV0);
    }

    @androidx.annotation.p0
    public static String e(int objectType) {
        if (objectType == 32) {
            return "video/mp4v-es";
        }
        if (objectType == 33) {
            return "video/avc";
        }
        if (objectType == 35) {
            return "video/hevc";
        }
        if (objectType == 64) {
            return "audio/mp4a-latm";
        }
        if (objectType == 163) {
            return "video/wvc1";
        }
        if (objectType == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (objectType == 165) {
            return "audio/ac3";
        }
        if (objectType == 166) {
            return "audio/eac3";
        }
        switch (objectType) {
            case 96:
            case com.planner5d.library.engine.input.f.b.f160715o1 /* 97 */:
            case com.planner5d.library.engine.input.f.b.f160718p1 /* 98 */:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case com.planner5d.library.engine.input.f.b.f160733u1 /* 103 */:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case com.planner5d.library.engine.input.f.b.f160745y1 /* 107 */:
                return "audio/mpeg";
            case com.planner5d.library.engine.input.f.b.f160742x1 /* 106 */:
                return "video/mpeg";
            default:
                switch (objectType) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        int i10 = 6 & 0;
                        return null;
                }
        }
    }

    @androidx.annotation.p0
    private static String f(@androidx.annotation.p0 String mimeType) {
        int iIndexOf;
        if (mimeType == null || (iIndexOf = mimeType.indexOf(47)) == -1) {
            return null;
        }
        return mimeType.substring(0, iIndexOf);
    }

    public static int g(@androidx.annotation.p0 String mimeType) {
        if (TextUtils.isEmpty(mimeType)) {
            return -1;
        }
        if (l(mimeType)) {
            return 1;
        }
        if (n(mimeType)) {
            return 2;
        }
        if (!m(mimeType) && !"application/cea-608".equals(mimeType) && !"application/cea-708".equals(mimeType) && !"application/x-mp4-cea-608".equals(mimeType) && !"application/x-subrip".equals(mimeType) && !"application/ttml+xml".equals(mimeType) && !"application/x-quicktime-tx3g".equals(mimeType) && !"application/x-mp4-vtt".equals(mimeType) && !"application/x-rawcc".equals(mimeType) && !"application/vobsub".equals(mimeType) && !"application/pgs".equals(mimeType) && !"application/dvbsubs".equals(mimeType)) {
            if (!"application/id3".equals(mimeType) && !"application/x-emsg".equals(mimeType) && !"application/x-scte35".equals(mimeType)) {
                if ("application/x-camera-motion".equals(mimeType)) {
                    return 5;
                }
                return h(mimeType);
            }
            return 4;
        }
        return 3;
    }

    private static int h(String mimeType) {
        int size = f57672q0.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = f57672q0.get(i10);
            if (mimeType.equals(aVar.f57682a)) {
                return aVar.f57684c;
            }
        }
        return -1;
    }

    public static int i(String codec) {
        return g(d(codec));
    }

    @androidx.annotation.p0
    public static String j(@androidx.annotation.p0 String codecs) {
        if (codecs == null) {
            return null;
        }
        for (String str : q0.Q0(codecs)) {
            String strD = d(str);
            if (strD != null && n(strD)) {
                return strD;
            }
        }
        return null;
    }

    public static boolean k(@androidx.annotation.p0 String mimeType) {
        return "application".equals(f(mimeType));
    }

    public static boolean l(@androidx.annotation.p0 String mimeType) {
        return "audio".equals(f(mimeType));
    }

    public static boolean m(@androidx.annotation.p0 String mimeType) {
        return "text".equals(f(mimeType));
    }

    public static boolean n(@androidx.annotation.p0 String mimeType) {
        return "video".equals(f(mimeType));
    }

    public static void o(String mimeType, String codecPrefix, int trackType) {
        a aVar = new a(mimeType, codecPrefix, trackType);
        int size = f57672q0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList<a> arrayList = f57672q0;
            if (mimeType.equals(arrayList.get(i10).f57682a)) {
                arrayList.remove(i10);
                break;
            }
        }
        f57672q0.add(aVar);
    }
}
