package androidx.media2.exoplayer.external.mediacodec;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.util.p;
import androidx.media2.exoplayer.external.util.q0;
import androidx.media2.exoplayer.external.util.s;
import androidx.media2.exoplayer.external.video.ColorInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
@e.a({"InlinedApi"})
@b1({b1.a.LIBRARY_GROUP})
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f55395a = "MediaCodecUtil";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final SparseIntArray f55398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final SparseIntArray f55399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f55400f = "avc1";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f55401g = "avc2";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final SparseIntArray f55402h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final SparseIntArray f55403i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f55404j = "vp09";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Map<String, Integer> f55405k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f55406l = "hev1";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f55407m = "hvc1";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Map<String, Integer> f55408n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Map<String, Integer> f55409o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f55410p = "dvhe";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f55411q = "dvh1";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final SparseIntArray f55412r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f55413s = "av01";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final SparseIntArray f55414t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f55415u = "mp4a";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f55396b = Pattern.compile("^\\D?(\\d+)$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final HashMap<b, List<androidx.media2.exoplayer.external.mediacodec.a>> f55397c = new HashMap<>();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static int f55416v = -1;

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f55417a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f55418b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f55419c;

        public b(String mimeType, boolean secure, boolean tunneling) {
            this.f55417a = mimeType;
            this.f55418b = secure;
            this.f55419c = tunneling;
        }

        public boolean equals(@p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == b.class) {
                b bVar = (b) obj;
                if (TextUtils.equals(this.f55417a, bVar.f55417a) && this.f55418b == bVar.f55418b && this.f55419c == bVar.f55419c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            String str = this.f55417a;
            return (((((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.f55418b ? 1231 : 1237)) * 31) + (this.f55419c ? 1231 : 1237);
        }
    }

    public static class c extends Exception {
        private c(Throwable cause) {
            super("Failed to query underlying media codecs", cause);
        }
    }

    private interface d {
        boolean a(String feature, String mimeType, MediaCodecInfo.CodecCapabilities capabilities);

        MediaCodecInfo b(int index);

        boolean c(String feature, String mimeType, MediaCodecInfo.CodecCapabilities capabilities);

        int d();

        boolean e();
    }

    private static final class e implements d {
        private e() {
        }

        @Override // androidx.media2.exoplayer.external.mediacodec.h.d
        public boolean a(String feature, String mimeType, MediaCodecInfo.CodecCapabilities capabilities) {
            return false;
        }

        @Override // androidx.media2.exoplayer.external.mediacodec.h.d
        public MediaCodecInfo b(int index) {
            return MediaCodecList.getCodecInfoAt(index);
        }

        @Override // androidx.media2.exoplayer.external.mediacodec.h.d
        public boolean c(String feature, String mimeType, MediaCodecInfo.CodecCapabilities capabilities) {
            return "secure-playback".equals(feature) && "video/avc".equals(mimeType);
        }

        @Override // androidx.media2.exoplayer.external.mediacodec.h.d
        public int d() {
            return MediaCodecList.getCodecCount();
        }

        @Override // androidx.media2.exoplayer.external.mediacodec.h.d
        public boolean e() {
            return false;
        }
    }

    @e.b(21)
    private static final class f implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f55420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private MediaCodecInfo[] f55421b;

        public f(boolean includeSecure, boolean includeTunneling) {
            this.f55420a = (includeSecure || includeTunneling) ? 1 : 0;
        }

        private void f() {
            if (this.f55421b == null) {
                this.f55421b = new MediaCodecList(this.f55420a).getCodecInfos();
            }
        }

        @Override // androidx.media2.exoplayer.external.mediacodec.h.d
        public boolean a(String feature, String mimeType, MediaCodecInfo.CodecCapabilities capabilities) {
            return capabilities.isFeatureRequired(feature);
        }

        @Override // androidx.media2.exoplayer.external.mediacodec.h.d
        public MediaCodecInfo b(int index) {
            f();
            return this.f55421b[index];
        }

        @Override // androidx.media2.exoplayer.external.mediacodec.h.d
        public boolean c(String feature, String mimeType, MediaCodecInfo.CodecCapabilities capabilities) {
            return capabilities.isFeatureSupported(feature);
        }

        @Override // androidx.media2.exoplayer.external.mediacodec.h.d
        public int d() {
            f();
            return this.f55421b.length;
        }

        @Override // androidx.media2.exoplayer.external.mediacodec.h.d
        public boolean e() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface g<T> {
        int a(T t10);
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f55398d = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        sparseIntArray.put(110, 16);
        sparseIntArray.put(122, 32);
        sparseIntArray.put(244, 64);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f55399e = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, 256);
        sparseIntArray2.put(31, 512);
        sparseIntArray2.put(32, 1024);
        sparseIntArray2.put(40, 2048);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, 8192);
        sparseIntArray2.put(50, 16384);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, 65536);
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        f55402h = sparseIntArray3;
        sparseIntArray3.put(0, 1);
        sparseIntArray3.put(1, 2);
        sparseIntArray3.put(2, 4);
        sparseIntArray3.put(3, 8);
        SparseIntArray sparseIntArray4 = new SparseIntArray();
        f55403i = sparseIntArray4;
        sparseIntArray4.put(10, 1);
        sparseIntArray4.put(11, 2);
        sparseIntArray4.put(20, 4);
        sparseIntArray4.put(21, 8);
        sparseIntArray4.put(30, 16);
        sparseIntArray4.put(31, 32);
        sparseIntArray4.put(40, 64);
        sparseIntArray4.put(41, 128);
        sparseIntArray4.put(50, 256);
        sparseIntArray4.put(51, 512);
        sparseIntArray4.put(60, 2048);
        sparseIntArray4.put(61, 4096);
        sparseIntArray4.put(62, 8192);
        HashMap map = new HashMap();
        f55405k = map;
        map.put("L30", 1);
        map.put("L60", 4);
        map.put("L63", 16);
        map.put("L90", 64);
        map.put("L93", 256);
        map.put("L120", 1024);
        map.put("L123", 4096);
        map.put("L150", 16384);
        map.put("L153", 65536);
        map.put("L156", 262144);
        map.put("L180", 1048576);
        map.put("L183", 4194304);
        map.put("L186", 16777216);
        map.put("H30", 2);
        map.put("H60", 8);
        map.put("H63", 32);
        map.put("H90", 128);
        map.put("H93", 512);
        map.put("H120", 2048);
        map.put("H123", 8192);
        map.put("H150", 32768);
        map.put("H153", 131072);
        map.put("H156", 524288);
        map.put("H180", 2097152);
        map.put("H183", 8388608);
        map.put("H186", Integer.valueOf(com.google.api.client.googleapis.media.a.f115410j));
        HashMap map2 = new HashMap();
        f55408n = map2;
        map2.put("00", 1);
        map2.put("01", 2);
        map2.put("02", 4);
        map2.put("03", 8);
        map2.put("04", 16);
        map2.put("05", 32);
        map2.put("06", 64);
        map2.put("07", 128);
        map2.put("08", 256);
        map2.put("09", 512);
        HashMap map3 = new HashMap();
        f55409o = map3;
        map3.put("01", 1);
        map3.put("02", 2);
        map3.put("03", 4);
        map3.put("04", 8);
        map3.put("05", 16);
        map3.put("06", 32);
        map3.put("07", 64);
        map3.put("08", 128);
        map3.put("09", 256);
        SparseIntArray sparseIntArray5 = new SparseIntArray();
        f55412r = sparseIntArray5;
        sparseIntArray5.put(0, 1);
        sparseIntArray5.put(1, 2);
        sparseIntArray5.put(2, 4);
        sparseIntArray5.put(3, 8);
        sparseIntArray5.put(4, 16);
        sparseIntArray5.put(5, 32);
        sparseIntArray5.put(6, 64);
        sparseIntArray5.put(7, 128);
        sparseIntArray5.put(8, 256);
        sparseIntArray5.put(9, 512);
        sparseIntArray5.put(10, 1024);
        sparseIntArray5.put(11, 2048);
        sparseIntArray5.put(12, 4096);
        sparseIntArray5.put(13, 8192);
        sparseIntArray5.put(14, 16384);
        sparseIntArray5.put(15, 32768);
        sparseIntArray5.put(16, 65536);
        sparseIntArray5.put(17, 131072);
        sparseIntArray5.put(18, 262144);
        sparseIntArray5.put(19, 524288);
        sparseIntArray5.put(20, 1048576);
        sparseIntArray5.put(21, 2097152);
        sparseIntArray5.put(22, 4194304);
        sparseIntArray5.put(23, 8388608);
        SparseIntArray sparseIntArray6 = new SparseIntArray();
        f55414t = sparseIntArray6;
        sparseIntArray6.put(1, 1);
        sparseIntArray6.put(2, 2);
        sparseIntArray6.put(3, 3);
        sparseIntArray6.put(4, 4);
        sparseIntArray6.put(5, 5);
        sparseIntArray6.put(6, 6);
        sparseIntArray6.put(17, 17);
        sparseIntArray6.put(20, 20);
        sparseIntArray6.put(23, 23);
        sparseIntArray6.put(29, 29);
        sparseIntArray6.put(39, 39);
        sparseIntArray6.put(42, 42);
    }

    private h() {
    }

    static final /* synthetic */ int A(g gVar, Object obj, Object obj2) {
        return gVar.a(obj2) - gVar.a(obj);
    }

    public static int B() throws c {
        if (f55416v == -1) {
            int iMax = 0;
            androidx.media2.exoplayer.external.mediacodec.a aVarI = i("video/avc", false, false);
            if (aVarI != null) {
                MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrF = aVarI.f();
                int length = codecProfileLevelArrF.length;
                int iMax2 = 0;
                while (iMax < length) {
                    iMax2 = Math.max(b(codecProfileLevelArrF[iMax].level), iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, q0.f57626a >= 21 ? 345600 : 172800);
            }
            f55416v = iMax;
        }
        return f55416v;
    }

    private static <T> void C(List<T> list, final g<T> scoreProvider) {
        Collections.sort(list, new Comparator(scoreProvider) { // from class: androidx.media2.exoplayer.external.mediacodec.g

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final h.g f55394a;

            {
                this.f55394a = scoreProvider;
            }

            @Override // java.util.Comparator
            public int compare(Object obj, Object obj2) {
                return h.A(this.f55394a, obj, obj2);
            }
        });
    }

    public static void D(String mimeType, boolean secure, boolean tunneling) {
        try {
            j(mimeType, secure, tunneling);
        } catch (c e10) {
            p.e(f55395a, "Codec warming failed", e10);
        }
    }

    private static void a(String mimeType, List<androidx.media2.exoplayer.external.mediacodec.a> decoderInfos) {
        if ("audio/raw".equals(mimeType)) {
            if (q0.f57626a < 26 && q0.f57627b.equals("R9") && decoderInfos.size() == 1 && decoderInfos.get(0).f55319a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                decoderInfos.add(androidx.media2.exoplayer.external.mediacodec.a.w("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            C(decoderInfos, androidx.media2.exoplayer.external.mediacodec.e.f55392a);
            return;
        }
        if (q0.f57626a >= 21 || decoderInfos.size() <= 1) {
            return;
        }
        String str = decoderInfos.get(0).f55319a;
        if ("OMX.SEC.mp3.dec".equals(str) || "OMX.SEC.MP3.Decoder".equals(str) || "OMX.brcm.audio.mp3.decoder".equals(str)) {
            C(decoderInfos, androidx.media2.exoplayer.external.mediacodec.f.f55393a);
        }
    }

    private static int b(int avcLevel) {
        if (avcLevel == 1 || avcLevel == 2) {
            return 25344;
        }
        switch (avcLevel) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            default:
                return -1;
        }
    }

    private static boolean c(String name) {
        if (q0.f57626a <= 22) {
            String str = q0.f57629d;
            if (("ODROID-XU3".equals(str) || "Nexus 10".equals(str)) && ("OMX.Exynos.AVC.Decoder".equals(name) || "OMX.Exynos.AVC.Decoder.secure".equals(name))) {
                return true;
            }
        }
        return false;
    }

    @p0
    private static Pair<Integer, Integer> d(String codec, String[] parts) {
        if (parts.length != 3) {
            String strValueOf = String.valueOf(codec);
            p.l(f55395a, strValueOf.length() != 0 ? "Ignoring malformed MP4A codec string: ".concat(strValueOf) : new String("Ignoring malformed MP4A codec string: "));
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(s.e(Integer.parseInt(parts[1], 16)))) {
                int i10 = 1 << 2;
                int i11 = f55414t.get(Integer.parseInt(parts[2]), -1);
                if (i11 != -1) {
                    return new Pair<>(Integer.valueOf(i11), 0);
                }
            }
        } catch (NumberFormatException unused) {
            String strValueOf2 = String.valueOf(codec);
            p.l(f55395a, strValueOf2.length() != 0 ? "Ignoring malformed MP4A codec string: ".concat(strValueOf2) : new String("Ignoring malformed MP4A codec string: "));
        }
        return null;
    }

    private static Pair<Integer, Integer> e(String codec, String[] parts, @p0 ColorInfo colorInfo) {
        int i10;
        if (parts.length < 4) {
            String strValueOf = String.valueOf(codec);
            p.l(f55395a, strValueOf.length() != 0 ? "Ignoring malformed AV1 codec string: ".concat(strValueOf) : new String("Ignoring malformed AV1 codec string: "));
            return null;
        }
        int i11 = 1;
        try {
            int i12 = Integer.parseInt(parts[1]);
            int i13 = Integer.parseInt(parts[2].substring(0, 2));
            int i14 = Integer.parseInt(parts[3]);
            if (i12 != 0) {
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Unknown AV1 profile: ");
                sb2.append(i12);
                p.l(f55395a, sb2.toString());
                return null;
            }
            if (i14 != 8 && i14 != 10) {
                StringBuilder sb3 = new StringBuilder(34);
                sb3.append("Unknown AV1 bit depth: ");
                sb3.append(i14);
                p.l(f55395a, sb3.toString());
                return null;
            }
            if (i14 != 8) {
                i11 = (colorInfo == null || !(colorInfo.f57733d != null || (i10 = colorInfo.f57732c) == 7 || i10 == 6)) ? 2 : 4096;
            }
            int i15 = f55412r.get(i13, -1);
            if (i15 != -1) {
                return new Pair<>(Integer.valueOf(i11), Integer.valueOf(i15));
            }
            StringBuilder sb4 = new StringBuilder(30);
            sb4.append("Unknown AV1 level: ");
            sb4.append(i13);
            p.l(f55395a, sb4.toString());
            return null;
        } catch (NumberFormatException unused) {
            String strValueOf2 = String.valueOf(codec);
            p.l(f55395a, strValueOf2.length() != 0 ? "Ignoring malformed AV1 codec string: ".concat(strValueOf2) : new String("Ignoring malformed AV1 codec string: "));
            return null;
        }
    }

    private static Pair<Integer, Integer> f(String codec, String[] parts) {
        int i10;
        int i11;
        if (parts.length < 2) {
            String strValueOf = String.valueOf(codec);
            p.l(f55395a, strValueOf.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(strValueOf) : new String("Ignoring malformed AVC codec string: "));
            return null;
        }
        try {
            if (parts[1].length() == 6) {
                i11 = Integer.parseInt(parts[1].substring(0, 2), 16);
                i10 = Integer.parseInt(parts[1].substring(4), 16);
            } else {
                if (parts.length < 3) {
                    String strValueOf2 = String.valueOf(codec);
                    p.l(f55395a, strValueOf2.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(strValueOf2) : new String("Ignoring malformed AVC codec string: "));
                    return null;
                }
                int i12 = Integer.parseInt(parts[1]);
                i10 = Integer.parseInt(parts[2]);
                i11 = i12;
            }
            int i13 = f55398d.get(i11, -1);
            if (i13 == -1) {
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Unknown AVC profile: ");
                sb2.append(i11);
                p.l(f55395a, sb2.toString());
                return null;
            }
            int i14 = f55399e.get(i10, -1);
            if (i14 != -1) {
                return new Pair<>(Integer.valueOf(i13), Integer.valueOf(i14));
            }
            StringBuilder sb3 = new StringBuilder(30);
            sb3.append("Unknown AVC level: ");
            sb3.append(i10);
            p.l(f55395a, sb3.toString());
            return null;
        } catch (NumberFormatException unused) {
            String strValueOf3 = String.valueOf(codec);
            p.l(f55395a, strValueOf3.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(strValueOf3) : new String("Ignoring malformed AVC codec string: "));
            return null;
        }
    }

    @p0
    private static String g(MediaCodecInfo info, String name, boolean secureDecodersExplicit, String mimeType) {
        if (!q(info, name, secureDecodersExplicit, mimeType)) {
            return null;
        }
        for (String str : info.getSupportedTypes()) {
            if (str.equalsIgnoreCase(mimeType)) {
                return str;
            }
        }
        if (mimeType.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(name)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(name) || "OMX.realtek.video.decoder.tunneled".equals(name)) {
                return "video/dv_hevc";
            }
        } else {
            if (mimeType.equals("audio/alac") && "OMX.lge.alac.decoder".equals(name)) {
                return "audio/x-lg-alac";
            }
            if (mimeType.equals("audio/flac") && "OMX.lge.flac.decoder".equals(name)) {
                return "audio/x-lg-flac";
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    @p0
    public static Pair<Integer, Integer> h(Format format) {
        String str = format.f53098f;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        byte b10 = 0;
        String str2 = strArrSplit[0];
        str2.getClass();
        switch (str2.hashCode()) {
            case 3004662:
                if (!str2.equals(f55413s)) {
                    b10 = -1;
                }
                break;
            case 3006243:
                if (!str2.equals(f55400f)) {
                    b10 = -1;
                } else {
                    b10 = 1;
                }
                break;
            case 3006244:
                if (!str2.equals(f55401g)) {
                    b10 = -1;
                } else {
                    b10 = 2;
                }
                break;
            case 3095771:
                if (!str2.equals(f55411q)) {
                    b10 = -1;
                } else {
                    b10 = 3;
                }
                break;
            case 3095823:
                if (!str2.equals(f55410p)) {
                    b10 = -1;
                } else {
                    b10 = 4;
                }
                break;
            case 3199032:
                if (!str2.equals(f55406l)) {
                    b10 = -1;
                } else {
                    b10 = 5;
                }
                break;
            case 3214780:
                if (!str2.equals(f55407m)) {
                    b10 = -1;
                } else {
                    b10 = 6;
                }
                break;
            case 3356560:
                if (!str2.equals(f55415u)) {
                    b10 = -1;
                } else {
                    b10 = 7;
                }
                break;
            case 3624515:
                if (!str2.equals(f55404j)) {
                    b10 = -1;
                } else {
                    b10 = 8;
                }
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return e(format.f53098f, strArrSplit, format.Y);
            case 1:
            case 2:
                return f(format.f53098f, strArrSplit);
            case 3:
            case 4:
                return m(format.f53098f, strArrSplit);
            case 5:
            case 6:
                return n(format.f53098f, strArrSplit);
            case 7:
                return d(format.f53098f, strArrSplit);
            case 8:
                return p(format.f53098f, strArrSplit);
            default:
                return null;
        }
    }

    @p0
    public static androidx.media2.exoplayer.external.mediacodec.a i(String mimeType, boolean secure, boolean tunneling) throws c {
        List<androidx.media2.exoplayer.external.mediacodec.a> listJ = j(mimeType, secure, tunneling);
        if (!listJ.isEmpty()) {
            return listJ.get(0);
        }
        int i10 = 4 & 0;
        return null;
    }

    public static synchronized List<androidx.media2.exoplayer.external.mediacodec.a> j(String mimeType, boolean secure, boolean tunneling) throws c {
        try {
            b bVar = new b(mimeType, secure, tunneling);
            HashMap<b, List<androidx.media2.exoplayer.external.mediacodec.a>> map = f55397c;
            List<androidx.media2.exoplayer.external.mediacodec.a> list = map.get(bVar);
            if (list != null) {
                return list;
            }
            int i10 = q0.f57626a;
            ArrayList<androidx.media2.exoplayer.external.mediacodec.a> arrayListK = k(bVar, i10 >= 21 ? new f(secure, tunneling) : new e());
            if (secure && arrayListK.isEmpty() && 21 <= i10 && i10 <= 23) {
                arrayListK = k(bVar, new e());
                if (!arrayListK.isEmpty()) {
                    String str = arrayListK.get(0).f55319a;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(mimeType).length() + 63 + String.valueOf(str).length());
                    sb2.append("MediaCodecList API didn't list secure decoder for: ");
                    sb2.append(mimeType);
                    sb2.append(". Assuming: ");
                    sb2.append(str);
                    p.l(f55395a, sb2.toString());
                }
            }
            a(mimeType, arrayListK);
            List<androidx.media2.exoplayer.external.mediacodec.a> listUnmodifiableList = Collections.unmodifiableList(arrayListK);
            map.put(bVar, listUnmodifiableList);
            return listUnmodifiableList;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0085 A[PHI: r17
      0x0085: PHI (r17v13 boolean) = (r17v8 boolean), (r17v15 boolean) binds: [B:38:0x0096, B:29:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0103 A[Catch: Exception -> 0x016e, TRY_ENTER, TryCatch #2 {Exception -> 0x016e, blocks: (B:3:0x000a, B:5:0x001e, B:67:0x012e, B:61:0x00fb, B:64:0x0103, B:66:0x0109, B:68:0x0134, B:69:0x016c), top: B:78:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0134 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    private static ArrayList<androidx.media2.exoplayer.external.mediacodec.a> k(b key, d mediaCodecList) throws c {
        int i10;
        boolean z10;
        boolean z11;
        try {
            ArrayList<androidx.media2.exoplayer.external.mediacodec.a> arrayList = new ArrayList<>();
            String str = key.f55417a;
            int iD = mediaCodecList.d();
            boolean zE = mediaCodecList.e();
            int i11 = 0;
            while (i11 < iD) {
                MediaCodecInfo mediaCodecInfoB = mediaCodecList.b(i11);
                String name = mediaCodecInfoB.getName();
                int i12 = i11;
                String strG = g(mediaCodecInfoB, name, zE, str);
                if (strG == null) {
                    z10 = zE;
                    i10 = i12;
                } else {
                    boolean z12 = zE;
                    String str2 = name;
                    try {
                        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoB.getCapabilitiesForType(strG);
                        boolean zC = mediaCodecList.c("tunneled-playback", strG, capabilitiesForType);
                        boolean zA = mediaCodecList.a("tunneled-playback", strG, capabilitiesForType);
                        boolean z13 = key.f55419c;
                        if ((z13 || !zA) && (!z13 || zC)) {
                            boolean zC2 = mediaCodecList.c("secure-playback", strG, capabilitiesForType);
                            boolean zA2 = mediaCodecList.a("secure-playback", strG, capabilitiesForType);
                            boolean z14 = key.f55418b;
                            if ((z14 || !zA2) && (!z14 || zC2)) {
                                try {
                                    boolean zR = r(mediaCodecInfoB);
                                    try {
                                        boolean zT = t(mediaCodecInfoB);
                                        boolean zV = v(mediaCodecInfoB);
                                        try {
                                            boolean zC3 = c(str2);
                                            if (z12) {
                                                z11 = zV;
                                                if (key.f55418b == zC2) {
                                                    z10 = z12;
                                                    boolean z15 = z11;
                                                    i10 = i12;
                                                    try {
                                                        arrayList.add(androidx.media2.exoplayer.external.mediacodec.a.w(str2, str, strG, capabilitiesForType, zR, zT, z15, zC3, false));
                                                    } catch (Exception e10) {
                                                        e = e10;
                                                        str2 = str2;
                                                        if (q0.f57626a <= 23) {
                                                        }
                                                        String str3 = str2;
                                                        StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 25 + strG.length());
                                                        sb2.append("Failed to query codec ");
                                                        sb2.append(str3);
                                                        sb2.append(" (");
                                                        sb2.append(strG);
                                                        sb2.append(")");
                                                        p.d(f55395a, sb2.toString());
                                                        throw e;
                                                    }
                                                }
                                            } else {
                                                z11 = zV;
                                            }
                                            if (!z12) {
                                                try {
                                                    if (!key.f55418b) {
                                                        z10 = z12;
                                                        boolean z16 = z11;
                                                        i10 = i12;
                                                        arrayList.add(androidx.media2.exoplayer.external.mediacodec.a.w(str2, str, strG, capabilitiesForType, zR, zT, z16, zC3, false));
                                                    }
                                                } catch (Exception e11) {
                                                    e = e11;
                                                    i10 = i12;
                                                    z10 = z12;
                                                    str2 = str2;
                                                    if (q0.f57626a <= 23) {
                                                    }
                                                    String str4 = str2;
                                                    StringBuilder sb3 = new StringBuilder(String.valueOf(str4).length() + 25 + strG.length());
                                                    sb3.append("Failed to query codec ");
                                                    sb3.append(str4);
                                                    sb3.append(" (");
                                                    sb3.append(strG);
                                                    sb3.append(")");
                                                    p.d(f55395a, sb3.toString());
                                                    throw e;
                                                }
                                            }
                                            boolean z17 = z11;
                                            i10 = i12;
                                            z10 = z12;
                                            if (!z10 && zC2) {
                                                str2 = str2;
                                                try {
                                                    arrayList.add(androidx.media2.exoplayer.external.mediacodec.a.w(String.valueOf(str2).concat(".secure"), str, strG, capabilitiesForType, zR, zT, z17, zC3, true));
                                                    break;
                                                } catch (Exception e12) {
                                                    e = e12;
                                                    if (q0.f57626a <= 23 || arrayList.isEmpty()) {
                                                        String str5 = str2;
                                                        StringBuilder sb4 = new StringBuilder(String.valueOf(str5).length() + 25 + strG.length());
                                                        sb4.append("Failed to query codec ");
                                                        sb4.append(str5);
                                                        sb4.append(" (");
                                                        sb4.append(strG);
                                                        sb4.append(")");
                                                        p.d(f55395a, sb4.toString());
                                                        throw e;
                                                    }
                                                    StringBuilder sb5 = new StringBuilder(String.valueOf(str2).length() + 46);
                                                    sb5.append("Skipping codec ");
                                                    sb5.append(str2);
                                                    sb5.append(" (failed to query capabilities)");
                                                    p.d(f55395a, sb5.toString());
                                                    i11 = i10 + 1;
                                                    zE = z10;
                                                }
                                            }
                                        } catch (Exception e13) {
                                            e = e13;
                                            i10 = i12;
                                            z10 = z12;
                                            if (q0.f57626a <= 23) {
                                            }
                                            String str6 = str2;
                                            StringBuilder sb6 = new StringBuilder(String.valueOf(str6).length() + 25 + strG.length());
                                            sb6.append("Failed to query codec ");
                                            sb6.append(str6);
                                            sb6.append(" (");
                                            sb6.append(strG);
                                            sb6.append(")");
                                            p.d(f55395a, sb6.toString());
                                            throw e;
                                        }
                                    } catch (Exception e14) {
                                        e = e14;
                                        i10 = i12;
                                    }
                                } catch (Exception e15) {
                                    e = e15;
                                    str2 = str2;
                                    z10 = z12;
                                    i10 = i12;
                                }
                            } else {
                                i10 = i12;
                                z10 = z12;
                            }
                        } else {
                            i10 = i12;
                            z10 = z12;
                        }
                    } catch (Exception e16) {
                        e = e16;
                        str2 = str2;
                        i10 = i12;
                        z10 = z12;
                    }
                }
                i11 = i10 + 1;
                zE = z10;
            }
            return arrayList;
        } catch (Exception e17) {
            throw new c(e17);
        }
    }

    @androidx.annotation.j
    public static List<androidx.media2.exoplayer.external.mediacodec.a> l(List<androidx.media2.exoplayer.external.mediacodec.a> decoderInfos, final Format format) {
        ArrayList arrayList = new ArrayList(decoderInfos);
        C(arrayList, new g(format) { // from class: androidx.media2.exoplayer.external.mediacodec.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Format f55391a;

            {
                this.f55391a = format;
            }

            @Override // androidx.media2.exoplayer.external.mediacodec.h.g
            public int a(Object obj) {
                return h.z(this.f55391a, (a) obj);
            }
        });
        return arrayList;
    }

    private static Pair<Integer, Integer> m(String codec, String[] parts) {
        if (parts.length < 3) {
            String strValueOf = String.valueOf(codec);
            p.l(f55395a, strValueOf.length() != 0 ? "Ignoring malformed Dolby Vision codec string: ".concat(strValueOf) : new String("Ignoring malformed Dolby Vision codec string: "));
            return null;
        }
        Matcher matcher = f55396b.matcher(parts[1]);
        if (!matcher.matches()) {
            String strValueOf2 = String.valueOf(codec);
            p.l(f55395a, strValueOf2.length() != 0 ? "Ignoring malformed Dolby Vision codec string: ".concat(strValueOf2) : new String("Ignoring malformed Dolby Vision codec string: "));
            return null;
        }
        String strGroup = matcher.group(1);
        Integer num = f55408n.get(strGroup);
        if (num == null) {
            String strValueOf3 = String.valueOf(strGroup);
            p.l(f55395a, strValueOf3.length() != 0 ? "Unknown Dolby Vision profile string: ".concat(strValueOf3) : new String("Unknown Dolby Vision profile string: "));
            return null;
        }
        String str = parts[2];
        Integer num2 = f55409o.get(str);
        if (num2 != null) {
            return new Pair<>(num, num2);
        }
        String strValueOf4 = String.valueOf(str);
        p.l(f55395a, strValueOf4.length() != 0 ? "Unknown Dolby Vision level string: ".concat(strValueOf4) : new String("Unknown Dolby Vision level string: "));
        return null;
    }

    private static Pair<Integer, Integer> n(String codec, String[] parts) {
        if (parts.length < 4) {
            String strValueOf = String.valueOf(codec);
            p.l(f55395a, strValueOf.length() != 0 ? "Ignoring malformed HEVC codec string: ".concat(strValueOf) : new String("Ignoring malformed HEVC codec string: "));
            return null;
        }
        int i10 = 1;
        Matcher matcher = f55396b.matcher(parts[1]);
        if (!matcher.matches()) {
            String strValueOf2 = String.valueOf(codec);
            p.l(f55395a, strValueOf2.length() != 0 ? "Ignoring malformed HEVC codec string: ".concat(strValueOf2) : new String("Ignoring malformed HEVC codec string: "));
            return null;
        }
        String strGroup = matcher.group(1);
        if (!"1".equals(strGroup)) {
            if (!"2".equals(strGroup)) {
                String strValueOf3 = String.valueOf(strGroup);
                p.l(f55395a, strValueOf3.length() != 0 ? "Unknown HEVC profile string: ".concat(strValueOf3) : new String("Unknown HEVC profile string: "));
                return null;
            }
            i10 = 2;
        }
        String str = parts[3];
        Integer num = f55405k.get(str);
        if (num != null) {
            return new Pair<>(Integer.valueOf(i10), num);
        }
        String strValueOf4 = String.valueOf(str);
        p.l(f55395a, strValueOf4.length() != 0 ? "Unknown HEVC level string: ".concat(strValueOf4) : new String("Unknown HEVC level string: "));
        return null;
    }

    @p0
    public static androidx.media2.exoplayer.external.mediacodec.a o() throws c {
        androidx.media2.exoplayer.external.mediacodec.a aVarI = i("audio/raw", false, false);
        if (aVarI == null) {
            return null;
        }
        return androidx.media2.exoplayer.external.mediacodec.a.x(aVarI.f55319a);
    }

    private static Pair<Integer, Integer> p(String codec, String[] parts) {
        if (parts.length < 3) {
            String strValueOf = String.valueOf(codec);
            p.l(f55395a, strValueOf.length() != 0 ? "Ignoring malformed VP9 codec string: ".concat(strValueOf) : new String("Ignoring malformed VP9 codec string: "));
            return null;
        }
        try {
            int i10 = Integer.parseInt(parts[1]);
            int i11 = Integer.parseInt(parts[2]);
            int i12 = f55402h.get(i10, -1);
            if (i12 == -1) {
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Unknown VP9 profile: ");
                sb2.append(i10);
                p.l(f55395a, sb2.toString());
                return null;
            }
            int i13 = f55403i.get(i11, -1);
            if (i13 != -1) {
                return new Pair<>(Integer.valueOf(i12), Integer.valueOf(i13));
            }
            StringBuilder sb3 = new StringBuilder(30);
            sb3.append("Unknown VP9 level: ");
            sb3.append(i11);
            p.l(f55395a, sb3.toString());
            return null;
        } catch (NumberFormatException unused) {
            String strValueOf2 = String.valueOf(codec);
            p.l(f55395a, strValueOf2.length() != 0 ? "Ignoring malformed VP9 codec string: ".concat(strValueOf2) : new String("Ignoring malformed VP9 codec string: "));
            return null;
        }
    }

    private static boolean q(MediaCodecInfo info, String name, boolean secureDecodersExplicit, String mimeType) {
        if (!info.isEncoder() && (secureDecodersExplicit || !name.endsWith(".secure"))) {
            int i10 = q0.f57626a;
            if (i10 < 21 && ("CIPAACDecoder".equals(name) || "CIPMP3Decoder".equals(name) || "CIPVorbisDecoder".equals(name) || "CIPAMRNBDecoder".equals(name) || "AACDecoder".equals(name) || "MP3Decoder".equals(name))) {
                return false;
            }
            if (i10 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(name)) {
                String str = q0.f57627b;
                if ("a70".equals(str) || ("Xiaomi".equals(q0.f57628c) && str.startsWith("HM"))) {
                    return false;
                }
            }
            if (i10 == 16 && "OMX.qcom.audio.decoder.mp3".equals(name)) {
                String str2 = q0.f57627b;
                if ("dlxu".equals(str2) || "protou".equals(str2) || "ville".equals(str2) || "villeplus".equals(str2) || "villec2".equals(str2) || str2.startsWith("gee") || "C6602".equals(str2) || "C6603".equals(str2) || "C6606".equals(str2) || "C6616".equals(str2) || "L36h".equals(str2) || "SO-02E".equals(str2)) {
                    return false;
                }
            }
            if (i10 == 16 && "OMX.qcom.audio.decoder.aac".equals(name)) {
                String str3 = q0.f57627b;
                if ("C1504".equals(str3) || "C1505".equals(str3) || "C1604".equals(str3) || "C1605".equals(str3)) {
                    return false;
                }
            }
            if (i10 < 24 && (("OMX.SEC.aac.dec".equals(name) || "OMX.Exynos.AAC.Decoder".equals(name)) && "samsung".equals(q0.f57628c))) {
                String str4 = q0.f57627b;
                if (str4.startsWith("zeroflte") || str4.startsWith("zerolte") || str4.startsWith("zenlte") || "SC-05G".equals(str4) || "marinelteatt".equals(str4) || "404SC".equals(str4) || "SC-04G".equals(str4) || "SCV31".equals(str4)) {
                    return false;
                }
            }
            if (i10 <= 19 && "OMX.SEC.vp8.dec".equals(name) && "samsung".equals(q0.f57628c)) {
                String str5 = q0.f57627b;
                if (str5.startsWith("d2") || str5.startsWith("serrano") || str5.startsWith("jflte") || str5.startsWith("santos") || str5.startsWith("t0")) {
                    return false;
                }
            }
            if (i10 <= 19 && q0.f57627b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(name)) {
                return false;
            }
            return ("audio/eac3-joc".equals(mimeType) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(name)) ? false : true;
        }
        return false;
    }

    private static boolean r(MediaCodecInfo codecInfo) {
        return q0.f57626a >= 29 ? s(codecInfo) : !t(codecInfo);
    }

    @e.b(29)
    private static boolean s(MediaCodecInfo codecInfo) {
        return codecInfo.isHardwareAccelerated();
    }

    private static boolean t(MediaCodecInfo codecInfo) {
        if (q0.f57626a >= 29) {
            return u(codecInfo);
        }
        String lowerCase = codecInfo.getName().toLowerCase();
        if (lowerCase.startsWith("arc.")) {
            return false;
        }
        if (lowerCase.startsWith("omx.google.") || lowerCase.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((lowerCase.startsWith("omx.sec.") && lowerCase.contains(".sw.")) || lowerCase.equals("omx.qcom.video.decoder.hevcswvdec") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.")) {
            return true;
        }
        return (lowerCase.startsWith("omx.") || lowerCase.startsWith("c2.")) ? false : true;
    }

    @e.b(29)
    private static boolean u(MediaCodecInfo codecInfo) {
        return codecInfo.isSoftwareOnly();
    }

    private static boolean v(MediaCodecInfo codecInfo) {
        if (q0.f57626a >= 29) {
            return w(codecInfo);
        }
        String lowerCase = codecInfo.getName().toLowerCase();
        return (lowerCase.startsWith("omx.google.") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.")) ? false : true;
    }

    @e.b(29)
    private static boolean w(MediaCodecInfo codecInfo) {
        return codecInfo.isVendor();
    }

    static final /* synthetic */ int x(androidx.media2.exoplayer.external.mediacodec.a aVar) {
        String str = aVar.f55319a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (q0.f57626a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    static final /* synthetic */ int y(androidx.media2.exoplayer.external.mediacodec.a aVar) {
        return aVar.f55319a.startsWith("OMX.google") ? 1 : 0;
    }

    static final /* synthetic */ int z(Format format, androidx.media2.exoplayer.external.mediacodec.a aVar) {
        try {
            return aVar.l(format) ? 1 : 0;
        } catch (c unused) {
            return -1;
        }
    }
}
