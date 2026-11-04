package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.media3.common.s0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import com.google.common.collect.l6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@b1
@e.a({"InlinedApi"})
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f64079a = "MediaCodecUtil";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.b0("MediaCodecUtil.class")
    private static final HashMap<b, List<t>> f64080b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f64081c = -1;

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f64083b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f64084c;

        public b(String str, boolean z10, boolean z11) {
            this.f64082a = str;
            this.f64083b = z10;
            this.f64084c = z11;
        }

        public boolean equals(@p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == b.class) {
                b bVar = (b) obj;
                if (TextUtils.equals(this.f64082a, bVar.f64082a) && this.f64083b == bVar.f64083b && this.f64084c == bVar.f64084c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((this.f64082a.hashCode() + 31) * 31) + (this.f64083b ? 1231 : 1237)) * 31) + (this.f64084c ? 1231 : 1237);
        }
    }

    public static class c extends Exception {
        private c(Throwable th2) {
            super("Failed to query underlying media codecs", th2);
        }
    }

    private interface d {
        boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        MediaCodecInfo b(int i10);

        boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        int d();

        boolean e();
    }

    private static final class e implements d {
        private e() {
        }

        @Override // androidx.media3.exoplayer.mediacodec.f0.d
        public boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // androidx.media3.exoplayer.mediacodec.f0.d
        public MediaCodecInfo b(int i10) {
            return MediaCodecList.getCodecInfoAt(i10);
        }

        @Override // androidx.media3.exoplayer.mediacodec.f0.d
        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override // androidx.media3.exoplayer.mediacodec.f0.d
        public int d() {
            return MediaCodecList.getCodecCount();
        }

        @Override // androidx.media3.exoplayer.mediacodec.f0.d
        public boolean e() {
            return false;
        }
    }

    private static final class f implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f64085a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        private MediaCodecInfo[] f64086b;

        public f(boolean z10, boolean z11, boolean z12) {
            this.f64085a = (z10 || z11 || z12) ? 1 : 0;
        }

        @il.d({"mediaCodecInfos"})
        private void f() {
            if (this.f64086b == null) {
                this.f64086b = new MediaCodecList(this.f64085a).getCodecInfos();
            }
        }

        @Override // androidx.media3.exoplayer.mediacodec.f0.d
        public boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // androidx.media3.exoplayer.mediacodec.f0.d
        public MediaCodecInfo b(int i10) {
            f();
            return this.f64086b[i10];
        }

        @Override // androidx.media3.exoplayer.mediacodec.f0.d
        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // androidx.media3.exoplayer.mediacodec.f0.d
        public int d() {
            f();
            return this.f64086b.length;
        }

        @Override // androidx.media3.exoplayer.mediacodec.f0.d
        public boolean e() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface g<T> {
        int a(T t10);
    }

    private f0() {
    }

    private static boolean A(MediaCodecInfo mediaCodecInfo, String str) {
        if (k1.f61540a >= 29) {
            return B(mediaCodecInfo);
        }
        if (s0.q(str)) {
            return true;
        }
        String strG = com.google.common.base.c.g(mediaCodecInfo.getName());
        if (strG.startsWith("arc.")) {
            return false;
        }
        if (!strG.startsWith("omx.google.") && !strG.startsWith("omx.ffmpeg.") && ((!strG.startsWith("omx.sec.") || !strG.contains(".sw.")) && !strG.equals("omx.qcom.video.decoder.hevcswvdec") && !strG.startsWith("c2.android.") && !strG.startsWith("c2.google.") && (strG.startsWith("omx.") || strG.startsWith("c2.")))) {
            return false;
        }
        return true;
    }

    @w0(29)
    private static boolean B(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    private static boolean C(MediaCodecInfo mediaCodecInfo) {
        if (k1.f61540a >= 29) {
            return D(mediaCodecInfo);
        }
        String strG = com.google.common.base.c.g(mediaCodecInfo.getName());
        return (strG.startsWith("omx.google.") || strG.startsWith("c2.android.") || strG.startsWith("c2.google.")) ? false : true;
    }

    @w0(29)
    private static boolean D(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    public static int E() throws c {
        if (f64081c == -1) {
            int iMax = 0;
            t tVarM = m("video/avc", false, false);
            if (tVarM != null) {
                MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrI = tVarM.i();
                int length = codecProfileLevelArrI.length;
                int iMax2 = 0;
                while (iMax < length) {
                    iMax2 = Math.max(g(codecProfileLevelArrI[iMax].level), iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, 345600);
            }
            f64081c = iMax;
        }
        return f64081c;
    }

    private static <T> void F(List<T> list, final g<T> gVar) {
        Collections.sort(list, new Comparator() { // from class: androidx.media3.exoplayer.mediacodec.c0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return f0.a(gVar, obj, obj2);
            }
        });
    }

    public static void G(String str, boolean z10, boolean z11) {
        try {
            n(str, z10, z11);
        } catch (c e10) {
            androidx.media3.common.util.z.e(f64079a, "Codec warming failed", e10);
        }
    }

    public static /* synthetic */ int a(g gVar, Object obj, Object obj2) {
        return gVar.a(obj2) - gVar.a(obj);
    }

    public static /* synthetic */ int b(t tVar) {
        return (tVar.f64147i ? 2 : 0) + (!tVar.f64148j ? 1 : 0);
    }

    public static /* synthetic */ int c(androidx.media3.common.w wVar, t tVar) {
        return tVar.p(wVar) ? 1 : 0;
    }

    public static /* synthetic */ int d(t tVar) {
        String str = tVar.f64139a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (k1.f61540a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    public static /* synthetic */ int e(androidx.media3.common.w wVar, t tVar) {
        try {
            return tVar.q(wVar) ? 1 : 0;
        } catch (c unused) {
            return -1;
        }
    }

    private static void f(String str, List<t> list) {
        if ("audio/raw".equals(str)) {
            if (k1.f61540a < 26 && Build.DEVICE.equals("R9") && list.size() == 1 && list.get(0).f64139a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                int i10 = 3 ^ 0;
                list.add(t.F("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            F(list, new g() { // from class: androidx.media3.exoplayer.mediacodec.d0
                @Override // androidx.media3.exoplayer.mediacodec.f0.g
                public final int a(Object obj) {
                    return f0.d((t) obj);
                }
            });
        }
        if (k1.f61540a >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(list.get(0).f64139a)) {
            return;
        }
        list.add(list.remove(0));
    }

    private static int g(int i10) {
        if (i10 == 1 || i10 == 2) {
            return 25344;
        }
        switch (i10) {
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
            case 131072:
            case 262144:
            case 524288:
                return 35651584;
            default:
                return -1;
        }
    }

    @l1
    public static synchronized void h() {
        f64080b.clear();
    }

    @p0
    public static String i(androidx.media3.common.w wVar) {
        Pair<Integer, Integer> pairL;
        if ("audio/eac3-joc".equals(wVar.f61761o)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(wVar.f61761o) && (pairL = l(wVar)) != null) {
            int iIntValue = ((Integer) pairL.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if (s0.D.equals(wVar.f61761o)) {
            return "video/hevc";
        }
        return null;
    }

    public static List<t> j(z zVar, androidx.media3.common.w wVar, boolean z10, boolean z11) throws c {
        String strI = i(wVar);
        return strI == null ? l6.F() : zVar.a(strI, z10, z11);
    }

    @p0
    private static String k(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
        } else if (!str2.equals(s0.D)) {
            if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
                return "audio/x-lg-alac";
            }
            if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
                return "audio/x-lg-flac";
            }
            if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
                return "audio/lg-ac3";
            }
        } else if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
            return "video/x-mvhevc";
        }
        return null;
    }

    @z7.m(imports = {"androidx.media3.common.util.CodecSpecificDataUtil"}, replacement = "CodecSpecificDataUtil.getCodecProfileAndLevel(format)")
    @p0
    @Deprecated
    public static Pair<Integer, Integer> l(androidx.media3.common.w wVar) {
        return androidx.media3.common.util.k.p(wVar);
    }

    @p0
    public static t m(String str, boolean z10, boolean z11) throws c {
        List<t> listN = n(str, z10, z11);
        if (listN.isEmpty()) {
            return null;
        }
        return listN.get(0);
    }

    public static synchronized List<t> n(String str, boolean z10, boolean z11) throws c {
        try {
            b bVar = new b(str, z10, z11);
            HashMap<b, List<t>> map = f64080b;
            List<t> list = map.get(bVar);
            if (list != null) {
                return list;
            }
            ArrayList<t> arrayListO = o(bVar, new f(z10, z11, str.equals(s0.D)));
            if (z10 && arrayListO.isEmpty() && k1.f61540a <= 23) {
                arrayListO = o(bVar, new e());
                if (!arrayListO.isEmpty()) {
                    androidx.media3.common.util.z.n(f64079a, "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + arrayListO.get(0).f64139a);
                }
            }
            f(str, arrayListO);
            l6 l6VarW = l6.w(arrayListO);
            map.put(bVar, l6VarW);
            return l6VarW;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0092 A[PHI: r16
      0x0092: PHI (r16v13 boolean) = (r16v7 boolean), (r16v16 boolean) binds: [B:41:0x00a6, B:33:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0117 A[Catch: Exception -> 0x0161, TRY_ENTER, TryCatch #6 {Exception -> 0x0161, blocks: (B:3:0x000c, B:5:0x001f, B:68:0x0136, B:8:0x0031, B:11:0x003c, B:62:0x010d, B:65:0x0117, B:67:0x011d, B:69:0x013e, B:70:0x015f), top: B:87:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:91:0x013e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    private static ArrayList<t> o(b bVar, d dVar) throws c {
        int i10;
        boolean z10;
        boolean z11;
        b bVar2 = bVar;
        try {
            ArrayList<t> arrayList = new ArrayList<>();
            String str = bVar2.f64082a;
            int iD = dVar.d();
            boolean zE = dVar.e();
            int i11 = 0;
            while (i11 < iD) {
                MediaCodecInfo mediaCodecInfoB = dVar.b(i11);
                if (v(mediaCodecInfoB)) {
                    z10 = zE;
                    i10 = i11;
                } else {
                    String name = mediaCodecInfoB.getName();
                    if (x(mediaCodecInfoB, name, zE, str)) {
                        int i12 = i11;
                        String strK = k(mediaCodecInfoB, name, str);
                        if (strK == null) {
                            z10 = zE;
                            i10 = i12;
                        } else {
                            boolean z12 = zE;
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoB.getCapabilitiesForType(strK);
                                boolean zC = dVar.c("tunneled-playback", strK, capabilitiesForType);
                                boolean zA = dVar.a("tunneled-playback", strK, capabilitiesForType);
                                boolean z13 = bVar2.f64084c;
                                if ((z13 || !zA) && (!z13 || zC)) {
                                    boolean zC2 = dVar.c("secure-playback", strK, capabilitiesForType);
                                    boolean zA2 = dVar.a("secure-playback", strK, capabilitiesForType);
                                    boolean z14 = bVar2.f64083b;
                                    if ((z14 || !zA2) && (!z14 || zC2)) {
                                        try {
                                            boolean zY = y(mediaCodecInfoB, str);
                                            try {
                                                boolean zA3 = A(mediaCodecInfoB, str);
                                                boolean zC3 = C(mediaCodecInfoB);
                                                if (z12) {
                                                    z11 = zC3;
                                                    if (bVar2.f64083b == zC2) {
                                                        z10 = z12;
                                                        boolean z15 = z11;
                                                        i10 = i12;
                                                        try {
                                                            arrayList.add(t.F(name, str, strK, capabilitiesForType, zY, zA3, z15, false, false));
                                                        } catch (Exception e10) {
                                                            e = e10;
                                                            if (k1.f61540a <= 23) {
                                                            }
                                                            androidx.media3.common.util.z.d(f64079a, "Failed to query codec " + r6 + " (" + strK + ")");
                                                            throw e;
                                                        }
                                                    }
                                                } else {
                                                    z11 = zC3;
                                                }
                                                if (!z12) {
                                                    try {
                                                        if (!bVar2.f64083b) {
                                                            z10 = z12;
                                                            boolean z16 = z11;
                                                            i10 = i12;
                                                            arrayList.add(t.F(name, str, strK, capabilitiesForType, zY, zA3, z16, false, false));
                                                        }
                                                    } catch (Exception e11) {
                                                        e = e11;
                                                        i10 = i12;
                                                        z10 = z12;
                                                        if (k1.f61540a <= 23 || arrayList.isEmpty()) {
                                                            androidx.media3.common.util.z.d(f64079a, "Failed to query codec " + r6 + " (" + strK + ")");
                                                            throw e;
                                                        }
                                                        androidx.media3.common.util.z.d(f64079a, "Skipping codec " + name + " (failed to query capabilities)");
                                                        i11 = i10 + 1;
                                                        bVar2 = bVar;
                                                        zE = z10;
                                                    }
                                                }
                                                z10 = z12;
                                                boolean z17 = z11;
                                                i10 = i12;
                                                if (!z10 && zC2) {
                                                    try {
                                                        arrayList.add(t.F(name + ".secure", str, strK, capabilitiesForType, zY, zA3, z17, false, true));
                                                        break;
                                                    } catch (Exception e12) {
                                                        e = e12;
                                                        if (k1.f61540a <= 23) {
                                                        }
                                                        androidx.media3.common.util.z.d(f64079a, "Failed to query codec " + r6 + " (" + strK + ")");
                                                        throw e;
                                                    }
                                                }
                                            } catch (Exception e13) {
                                                e = e13;
                                                i10 = i12;
                                                z10 = z12;
                                            }
                                        } catch (Exception e14) {
                                            e = e14;
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
                            } catch (Exception e15) {
                                e = e15;
                                i10 = i12;
                                z10 = z12;
                            }
                        }
                    } else {
                        z10 = zE;
                        i10 = i11;
                    }
                }
                i11 = i10 + 1;
                bVar2 = bVar;
                zE = z10;
            }
            return arrayList;
        } catch (Exception e16) {
            throw new c(e16);
        }
    }

    @il.m({"#2.sampleMimeType"})
    public static List<t> p(z zVar, androidx.media3.common.w wVar, boolean z10, boolean z11) throws c {
        List<t> listA = zVar.a(wVar.f61761o, z10, z11);
        return l6.s().c(listA).c(j(zVar, wVar, z10, z11)).e();
    }

    @androidx.annotation.j
    public static List<t> q(List<t> list, final androidx.media3.common.w wVar) {
        ArrayList arrayList = new ArrayList(list);
        F(arrayList, new g() { // from class: androidx.media3.exoplayer.mediacodec.e0
            @Override // androidx.media3.exoplayer.mediacodec.f0.g
            public final int a(Object obj) {
                return f0.c(wVar, (t) obj);
            }
        });
        return arrayList;
    }

    @androidx.annotation.j
    public static List<t> r(List<t> list, final androidx.media3.common.w wVar) {
        ArrayList arrayList = new ArrayList(list);
        F(arrayList, new g() { // from class: androidx.media3.exoplayer.mediacodec.b0
            @Override // androidx.media3.exoplayer.mediacodec.f0.g
            public final int a(Object obj) {
                return f0.e(wVar, (t) obj);
            }
        });
        return arrayList;
    }

    @androidx.annotation.j
    public static List<t> s(List<t> list) {
        ArrayList arrayList = new ArrayList(list);
        F(arrayList, new g() { // from class: androidx.media3.exoplayer.mediacodec.a0
            @Override // androidx.media3.exoplayer.mediacodec.f0.g
            public final int a(Object obj) {
                return f0.b((t) obj);
            }
        });
        return l6.w(arrayList);
    }

    @p0
    public static t t() throws c {
        return m("audio/raw", false, false);
    }

    @p0
    public static Pair<Integer, Integer> u(androidx.media3.common.w wVar) {
        String strI = androidx.media3.container.f.i(wVar.f61764r);
        if (strI == null) {
            return null;
        }
        return androidx.media3.common.util.k.s(strI, k1.l2(strI.trim(), "\\."), wVar.C);
    }

    private static boolean v(MediaCodecInfo mediaCodecInfo) {
        return k1.f61540a >= 29 && w(mediaCodecInfo);
    }

    @w0(29)
    private static boolean w(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    private static boolean x(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z10 && str.endsWith(".secure"))) {
            return false;
        }
        int i10 = k1.f61540a;
        if (i10 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(Build.MANUFACTURER))) {
            String str3 = Build.DEVICE;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        return (i10 <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    private static boolean y(MediaCodecInfo mediaCodecInfo, String str) {
        return k1.f61540a >= 29 ? z(mediaCodecInfo) : !A(mediaCodecInfo, str);
    }

    @w0(29)
    private static boolean z(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }
}
