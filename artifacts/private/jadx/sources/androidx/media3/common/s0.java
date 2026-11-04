package androidx.media3.common;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 {
    public static final String A = "video/mjpeg";
    public static final String A0 = "application/cea-708";
    public static final String B = "video/mp42";
    public static final String B0 = "application/x-subrip";
    public static final String C = "video/mp43";
    public static final String C0 = "application/ttml+xml";

    @androidx.media3.common.util.b1
    public static final String D = "video/mv-hevc";
    public static final String D0 = "application/x-quicktime-tx3g";

    @androidx.media3.common.util.b1
    public static final String E = "video/raw";
    public static final String E0 = "application/x-mp4-vtt";

    @androidx.media3.common.util.b1
    public static final String F = "video/x-unknown";
    public static final String F0 = "application/x-mp4-cea-608";
    public static final String G = "audio/mp4";

    @Deprecated
    public static final String G0 = "application/x-rawcc";
    public static final String H = "audio/mp4a-latm";
    public static final String H0 = "application/vobsub";

    @androidx.media3.common.util.b1
    public static final String I = "audio/x-matroska";
    public static final String I0 = "application/pgs";
    public static final String J = "audio/webm";

    @androidx.media3.common.util.b1
    public static final String J0 = "application/x-scte35";
    public static final String K = "audio/mpeg";
    public static final String K0 = "application/sdp";
    public static final String L = "audio/mpeg-L1";

    @androidx.media3.common.util.b1
    public static final String L0 = "application/x-camera-motion";
    public static final String M = "audio/mpeg-L2";

    @androidx.media3.common.util.b1
    public static final String M0 = "application/x-depth-metadata";
    public static final String N = "audio/mha1";

    @androidx.media3.common.util.b1
    public static final String N0 = "application/x-emsg";
    public static final String O = "audio/mhm1";
    public static final String O0 = "application/dvbsubs";
    public static final String P = "audio/raw";

    @androidx.media3.common.util.b1
    public static final String P0 = "application/x-exif";
    public static final String Q = "audio/g711-alaw";

    @androidx.media3.common.util.b1
    public static final String Q0 = "application/x-icy";
    public static final String R = "audio/g711-mlaw";
    public static final String R0 = "application/vnd.dvb.ait";
    public static final String S = "audio/ac3";
    public static final String S0 = "application/x-rtsp";
    public static final String T = "audio/eac3";

    @androidx.media3.common.util.b1
    public static final String T0 = "application/x-media3-cues";
    public static final String U = "audio/eac3-joc";

    @androidx.media3.common.util.b1
    public static final String U0 = "application/x-image-uri";
    public static final String V = "audio/ac4";
    public static final String V0 = "image/jpeg";
    public static final String W = "audio/true-hd";

    @androidx.media3.common.util.b1
    public static final String W0 = "image/jpeg_r";
    public static final String X = "audio/vnd.dts";

    @androidx.media3.common.util.b1
    public static final String X0 = "image/png";
    public static final String Y = "audio/vnd.dts.hd";

    @androidx.media3.common.util.b1
    public static final String Y0 = "image/heif";
    public static final String Z = "audio/vnd.dts.hd;profile=lbr";

    @androidx.media3.common.util.b1
    public static final String Z0 = "image/heic";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final String f61292a = "video";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final String f61293a0 = "audio/vnd.dts.uhd;profile=p2";

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final String f61294a1 = "image/avif";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final String f61295b = "audio";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String f61296b0 = "audio/vorbis";

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final String f61297b1 = "image/bmp";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final String f61298c = "text";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f61299c0 = "audio/opus";

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final String f61300c1 = "image/webp";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final String f61301d = "image";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final String f61302d0 = "audio/amr";

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final String f61303d1 = "image/raw";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final String f61304e = "application";

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final String f61305e0 = "audio/3gpp";

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final String f61306e1 = "ec+3";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f61307f = "video/mp4";

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final String f61308f0 = "audio/amr-wb";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final String f61310g = "video/x-matroska";

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final String f61311g0 = "audio/flac";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f61313h = "video/webm";

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final String f61314h0 = "audio/alac";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f61315i = "video/3gpp";

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final String f61316i0 = "audio/gsm";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f61317j = "video/avc";

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final String f61318j0 = "audio/ogg";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final String f61319k = "video/apv";

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final String f61320k0 = "audio/wav";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f61321l = "video/hevc";

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final String f61322l0 = "audio/midi";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final String f61323m = "video/x-vnd.on2.vp8";

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final String f61324m0 = "audio/iamf";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final String f61325n = "video/x-vnd.on2.vp9";

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final String f61326n0 = "audio/x-exoplayer-midi";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f61327o = "video/av01";

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final String f61328o0 = "audio/x-unknown";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f61329p = "video/mp2t";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final String f61330p0 = "text/vtt";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f61331q = "video/mp4v-es";

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final String f61332q0 = "text/x-ssa";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f61333r = "video/mpeg";

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final String f61334r0 = "text/x-unknown";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f61335s = "video/mp2p";

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final String f61336s0 = "application/mp4";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f61337t = "video/mpeg2";

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final String f61338t0 = "application/webm";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f61339u = "video/wvc1";

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final String f61340u0 = "application/x-matroska";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f61341v = "video/divx";

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final String f61342v0 = "application/dash+xml";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final String f61343w = "video/x-flv";

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final String f61344w0 = "application/x-mpegURL";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f61345x = "video/dolby-vision";

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final String f61346x0 = "application/vnd.ms-sstr+xml";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f61347y = "video/ogg";

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final String f61348y0 = "application/id3";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f61349z = "video/x-msvideo";

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final String f61350z0 = "application/cea-608";

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private static final ArrayList<a> f61309f1 = new ArrayList<>();

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private static final Pattern f61312g1 = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f61351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f61352b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f61353c;

        public a(String str, String str2, int i10) {
            this.f61351a = str;
            this.f61352b = str2;
            this.f61353c = i10;
        }
    }

    @androidx.annotation.l1
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f61354a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f61355b;

        public b(int i10, int i11) {
            this.f61354a = i10;
            this.f61355b = i11;
        }

        public int a() {
            int i10 = this.f61355b;
            if (i10 == 2) {
                return 10;
            }
            if (i10 == 5) {
                return 11;
            }
            if (i10 == 29) {
                return 12;
            }
            if (i10 == 42) {
                return 16;
            }
            if (i10 != 22) {
                return i10 != 23 ? 0 : 15;
            }
            return 1073741824;
        }
    }

    private s0() {
    }

    @androidx.media3.common.util.b1
    public static boolean a(@androidx.annotation.p0 String str, @androidx.annotation.p0 String str2) {
        b bVarJ;
        int iA;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/eac3-joc":
            case "audio/mpeg-L1":
            case "audio/mpeg-L2":
            case "audio/ac3":
            case "audio/raw":
            case "audio/eac3":
            case "audio/flac":
            case "audio/mpeg":
            case "audio/g711-alaw":
            case "audio/g711-mlaw":
                return true;
            case "audio/mp4a-latm":
                return (str2 == null || (bVarJ = j(str2)) == null || (iA = bVarJ.a()) == 0 || iA == 16) ? false : true;
            default:
                return false;
        }
    }

    @androidx.media3.common.util.b1
    public static boolean b(@androidx.annotation.p0 String str, String str2) {
        return d(str, str2) != null;
    }

    @androidx.media3.common.util.b1
    @androidx.annotation.p0
    public static String c(@androidx.annotation.p0 String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : androidx.media3.common.util.k1.n2(str)) {
            String strG = g(str2);
            if (strG != null && q(strG)) {
                return strG;
            }
        }
        return null;
    }

    @androidx.media3.common.util.b1
    @androidx.annotation.p0
    public static String d(@androidx.annotation.p0 String str, @androidx.annotation.p0 String str2) {
        if (str != null && str2 != null) {
            String[] strArrN2 = androidx.media3.common.util.k1.n2(str);
            StringBuilder sb2 = new StringBuilder();
            for (String str3 : strArrN2) {
                if (str2.equals(g(str3))) {
                    if (sb2.length() > 0) {
                        sb2.append(",");
                    }
                    sb2.append(str3);
                }
            }
            if (sb2.length() > 0) {
                return sb2.toString();
            }
        }
        return null;
    }

    @androidx.annotation.p0
    private static String e(String str) {
        int size = f61309f1.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = f61309f1.get(i10);
            if (str.startsWith(aVar.f61352b)) {
                return aVar.f61351a;
            }
        }
        return null;
    }

    @androidx.media3.common.util.b1
    public static int f(String str, @androidx.annotation.p0 String str2) {
        b bVarJ;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (bVarJ = j(str2)) == null) {
                    return 0;
                }
                return bVarJ.a();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    @androidx.media3.common.util.b1
    @androidx.annotation.p0
    public static String g(@androidx.annotation.p0 String str) {
        b bVarJ;
        String strH = null;
        if (str == null) {
            return null;
        }
        String strG = com.google.common.base.c.g(str.trim());
        if (strG.startsWith("avc1") || strG.startsWith("avc3")) {
            return "video/avc";
        }
        if (strG.startsWith("hev1") || strG.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (strG.startsWith("dvav") || strG.startsWith("dva1") || strG.startsWith("dvhe") || strG.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (strG.startsWith("av01")) {
            return "video/av01";
        }
        if (strG.startsWith("vp9") || strG.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (strG.startsWith("vp8") || strG.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (strG.startsWith("mp4a")) {
            if (strG.startsWith("mp4a.") && (bVarJ = j(strG)) != null) {
                strH = h(bVarJ.f61354a);
            }
            return strH == null ? "audio/mp4a-latm" : strH;
        }
        if (strG.startsWith("mha1")) {
            return N;
        }
        if (strG.startsWith("mhm1")) {
            return O;
        }
        if (strG.startsWith("ac-3") || strG.startsWith("dac3")) {
            return "audio/ac3";
        }
        if (strG.startsWith("ec-3") || strG.startsWith("dec3")) {
            return "audio/eac3";
        }
        if (strG.startsWith(f61306e1)) {
            return "audio/eac3-joc";
        }
        if (strG.startsWith("ac-4") || strG.startsWith("dac4")) {
            return "audio/ac4";
        }
        if (strG.startsWith("dtsc")) {
            return "audio/vnd.dts";
        }
        if (strG.startsWith("dtse")) {
            return "audio/vnd.dts.hd;profile=lbr";
        }
        if (strG.startsWith("dtsh") || strG.startsWith("dtsl")) {
            return "audio/vnd.dts.hd";
        }
        if (strG.startsWith("dtsx")) {
            return f61293a0;
        }
        if (strG.startsWith("opus")) {
            return "audio/opus";
        }
        if (strG.startsWith("vorbis")) {
            return "audio/vorbis";
        }
        if (strG.startsWith("flac")) {
            return "audio/flac";
        }
        if (strG.startsWith("stpp")) {
            return "application/ttml+xml";
        }
        if (strG.startsWith("wvtt")) {
            return "text/vtt";
        }
        if (strG.contains("cea708")) {
            return "application/cea-708";
        }
        if (!strG.contains("eia608") && !strG.contains("cea608")) {
            return e(strG);
        }
        return "application/cea-608";
    }

    @androidx.media3.common.util.b1
    @androidx.annotation.p0
    public static String h(int i10) {
        if (i10 == 32) {
            return "video/mp4v-es";
        }
        if (i10 == 33) {
            return "video/avc";
        }
        if (i10 == 35) {
            return "video/hevc";
        }
        if (i10 == 64) {
            return "audio/mp4a-latm";
        }
        if (i10 == 163) {
            return "video/wvc1";
        }
        if (i10 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i10 == 221) {
            return "audio/vorbis";
        }
        if (i10 == 165) {
            return "audio/ac3";
        }
        if (i10 == 166) {
            return "audio/eac3";
        }
        switch (i10) {
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
            case 108:
                return "image/jpeg";
            default:
                switch (i10) {
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
                        return null;
                }
        }
    }

    @androidx.media3.common.util.b1
    @androidx.annotation.p0
    public static Byte i(String str) {
        str.getClass();
        switch (str) {
            case "audio/vorbis":
                return Byte.valueOf(org.msgpack.core.h.a.H);
            case "audio/mp4a-latm":
                return Byte.valueOf(com.google.common.primitives.t.f119782a);
            case "video/mp4v-es":
                return (byte) 32;
            default:
                return null;
        }
    }

    @androidx.annotation.l1
    @androidx.annotation.p0
    static b j(String str) {
        Matcher matcher = f61312g1.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) androidx.media3.common.util.a.g(matcher.group(1));
        String strGroup = matcher.group(2);
        try {
            return new b(Integer.parseInt(str2, 16), strGroup != null ? Integer.parseInt(strGroup) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @androidx.media3.common.util.b1
    @androidx.annotation.p0
    public static String k(@androidx.annotation.p0 String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : androidx.media3.common.util.k1.n2(str)) {
            String strG = g(str2);
            if (strG != null && u(strG)) {
                return strG;
            }
        }
        return null;
    }

    @androidx.media3.common.util.b1
    @androidx.annotation.p0
    private static String l(@androidx.annotation.p0 String str) {
        int iIndexOf;
        if (str != null && (iIndexOf = str.indexOf(47)) != -1) {
            return str.substring(0, iIndexOf);
        }
        return null;
    }

    @androidx.media3.common.util.b1
    public static int m(@androidx.annotation.p0 String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (q(str)) {
            return 1;
        }
        if (v(str)) {
            return 2;
        }
        if (u(str)) {
            return 3;
        }
        if (s(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || R0.equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        return n(str);
    }

    private static int n(String str) {
        int size = f61309f1.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = f61309f1.get(i10);
            if (str.equals(aVar.f61351a)) {
                return aVar.f61353c;
            }
        }
        return -1;
    }

    @androidx.media3.common.util.b1
    public static int o(String str) {
        return m(g(str));
    }

    @androidx.media3.common.util.b1
    @androidx.annotation.p0
    public static String p(@androidx.annotation.p0 String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : androidx.media3.common.util.k1.n2(str)) {
            String strG = g(str2);
            if (strG != null && v(strG)) {
                return strG;
            }
        }
        return null;
    }

    @androidx.media3.common.util.b1
    public static boolean q(@androidx.annotation.p0 String str) {
        return "audio".equals(l(str));
    }

    @androidx.media3.common.util.b1
    public static boolean r(@androidx.annotation.p0 String str, @androidx.annotation.p0 String str2) {
        if (str == null) {
            return false;
        }
        if (!str.startsWith("dvhe") && !str.startsWith("dvh1")) {
            if (str2 == null) {
                return false;
            }
            return (str2.startsWith("dvhe") && str.startsWith("hev1")) || (str2.startsWith("dvh1") && str.startsWith("hvc1")) || ((str2.startsWith("dvav") && str.startsWith("avc3")) || ((str2.startsWith("dva1") && str.startsWith("avc1")) || (str2.startsWith("dav1") && str.startsWith("av01"))));
        }
        return true;
    }

    @androidx.media3.common.util.b1
    public static boolean s(@androidx.annotation.p0 String str) {
        return "image".equals(l(str)) || U0.equals(str);
    }

    @androidx.media3.common.util.b1
    public static boolean t(@androidx.annotation.p0 String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith(f61310g) || str.startsWith(I) || str.startsWith(f61340u0);
    }

    @androidx.media3.common.util.b1
    @xl.d
    public static boolean u(@androidx.annotation.p0 String str) {
        return "text".equals(l(str)) || T0.equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    @androidx.media3.common.util.b1
    public static boolean v(@androidx.annotation.p0 String str) {
        return "video".equals(l(str));
    }

    @androidx.media3.common.util.b1
    public static String w(String str) {
        if (str == null) {
            return null;
        }
        String strG = com.google.common.base.c.g(str);
        strG.getClass();
        switch (strG) {
            case "video/x-mvhevc":
                return D;
            case "audio/x-flac":
                return "audio/flac";
            case "application/x-mpegurl":
                return "application/x-mpegURL";
            case "audio/x-wav":
                return f61320k0;
            case "audio/mpeg-l1":
                return "audio/mpeg-L1";
            case "audio/mpeg-l2":
                return "audio/mpeg-L2";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return strG;
        }
    }

    @androidx.media3.common.util.b1
    public static void x(String str, String str2, int i10) {
        a aVar = new a(str, str2, i10);
        int size = f61309f1.size();
        for (int i11 = 0; i11 < size; i11++) {
            ArrayList<a> arrayList = f61309f1;
            if (str.equals(arrayList.get(i11).f61351a)) {
                arrayList.remove(i11);
                break;
            }
        }
        f61309f1.add(aVar);
    }
}
