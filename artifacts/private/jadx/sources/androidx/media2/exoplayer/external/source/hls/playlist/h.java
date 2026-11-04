package androidx.media2.exoplayer.external.source.hls.playlist;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.drm.DrmInitData;
import androidx.media2.exoplayer.external.k0;
import androidx.media2.exoplayer.external.metadata.Metadata;
import androidx.media2.exoplayer.external.source.c1;
import androidx.media2.exoplayer.external.source.hls.HlsTrackMetadataEntry;
import androidx.media2.exoplayer.external.upstream.i0;
import androidx.media2.exoplayer.external.util.m0;
import androidx.media2.exoplayer.external.util.q0;
import androidx.media2.exoplayer.external.util.s;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class h implements i0.a<g> {
    private static final String A = "NONE";
    private static final String B = "AES-128";
    private static final String C = "SAMPLE-AES";
    private static final String D = "SAMPLE-AES-CENC";
    private static final String E = "SAMPLE-AES-CTR";
    private static final String F = "com.microsoft.playready";
    private static final String G = "identity";
    private static final String H = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed";
    private static final String I = "com.widevine";
    private static final String J = "YES";
    private static final String K = "NO";
    private static final String L = "CLOSED-CAPTIONS=NONE";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f56164b = "#EXTM3U";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f56166c = "#EXT";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f56168d = "#EXT-X-VERSION";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f56170e = "#EXT-X-PLAYLIST-TYPE";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f56172f = "#EXT-X-DEFINE";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f56174g = "#EXT-X-STREAM-INF";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f56176h = "#EXT-X-MEDIA";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f56178i = "#EXT-X-TARGETDURATION";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f56180j = "#EXT-X-DISCONTINUITY";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f56182k = "#EXT-X-DISCONTINUITY-SEQUENCE";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f56184l = "#EXT-X-PROGRAM-DATE-TIME";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f56186m = "#EXT-X-MAP";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f56188n = "#EXT-X-INDEPENDENT-SEGMENTS";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f56190o = "#EXTINF";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f56192p = "#EXT-X-MEDIA-SEQUENCE";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f56194q = "#EXT-X-START";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f56196r = "#EXT-X-ENDLIST";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f56198s = "#EXT-X-KEY";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f56200t = "#EXT-X-SESSION-KEY";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f56202u = "#EXT-X-BYTERANGE";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f56204v = "#EXT-X-GAP";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f56206w = "AUDIO";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f56207x = "VIDEO";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f56208y = "SUBTITLES";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f56209z = "CLOSED-CAPTIONS";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f56210a;
    private static final Pattern M = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    private static final Pattern N = Pattern.compile("VIDEO=\"(.+?)\"");
    private static final Pattern O = Pattern.compile("AUDIO=\"(.+?)\"");
    private static final Pattern P = Pattern.compile("SUBTITLES=\"(.+?)\"");
    private static final Pattern Q = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");
    private static final Pattern R = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    private static final Pattern S = Pattern.compile("CHANNELS=\"(.+?)\"");
    private static final Pattern T = Pattern.compile("CODECS=\"(.+?)\"");
    private static final Pattern U = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    private static final Pattern V = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    private static final Pattern W = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    private static final Pattern X = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    private static final Pattern Y = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    private static final Pattern Z = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final Pattern f56163a0 = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final Pattern f56165b0 = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final Pattern f56167c0 = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final Pattern f56169d0 = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final Pattern f56171e0 = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final Pattern f56173f0 = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final Pattern f56175g0 = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final Pattern f56177h0 = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final Pattern f56179i0 = Pattern.compile("URI=\"(.+?)\"");

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final Pattern f56181j0 = Pattern.compile("IV=([^,.*]+)");

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final Pattern f56183k0 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final Pattern f56185l0 = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final Pattern f56187m0 = Pattern.compile("NAME=\"(.+?)\"");

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final Pattern f56189n0 = Pattern.compile("GROUP-ID=\"(.+?)\"");

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final Pattern f56191o0 = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final Pattern f56193p0 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final Pattern f56195q0 = c("AUTOSELECT");

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final Pattern f56197r0 = c("DEFAULT");

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final Pattern f56199s0 = c("FORCED");

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final Pattern f56201t0 = Pattern.compile("VALUE=\"(.+?)\"");

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final Pattern f56203u0 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private static final Pattern f56205v0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final BufferedReader f56211a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Queue<String> f56212b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f56213c;

        public a(Queue<String> extraLines, BufferedReader reader) {
            this.f56212b = extraLines;
            this.f56211a = reader;
        }

        public boolean a() throws IOException {
            String strTrim;
            if (this.f56213c != null) {
                return true;
            }
            if (!this.f56212b.isEmpty()) {
                this.f56213c = this.f56212b.poll();
                return true;
            }
            do {
                String line = this.f56211a.readLine();
                this.f56213c = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.f56213c = strTrim;
            } while (strTrim.isEmpty());
            return true;
        }

        public String b() throws IOException {
            if (!a()) {
                return null;
            }
            String str = this.f56213c;
            this.f56213c = null;
            return str;
        }
    }

    public h() {
        this(e.f56108n);
    }

    private static boolean b(BufferedReader reader) throws IOException {
        int i10 = reader.read();
        if (i10 == 239) {
            if (reader.read() != 187 || reader.read() != 191) {
                return false;
            }
            i10 = reader.read();
        }
        int iV = v(reader, true, i10);
        for (int i11 = 0; i11 < 7; i11++) {
            if (iV != f56164b.charAt(i11)) {
                return false;
            }
            iV = reader.read();
        }
        return q0.p0(v(reader, false, iV));
    }

    private static Pattern c(String attribute) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(attribute).length() + 9);
        sb2.append(attribute);
        sb2.append("=(");
        sb2.append(K);
        sb2.append("|");
        sb2.append(J);
        sb2.append(")");
        return Pattern.compile(sb2.toString());
    }

    private static e.b d(ArrayList<e.b> variants, String groupId) {
        for (int i10 = 0; i10 < variants.size(); i10++) {
            e.b bVar = variants.get(i10);
            if (groupId.equals(bVar.f56129d)) {
                return bVar;
            }
        }
        return null;
    }

    private static e.b e(ArrayList<e.b> variants, String groupId) {
        for (int i10 = 0; i10 < variants.size(); i10++) {
            e.b bVar = variants.get(i10);
            if (groupId.equals(bVar.f56128c)) {
                return bVar;
            }
        }
        return null;
    }

    private static int g(String line, Map<String, String> variableDefinitions) {
        String strQ = q(line, S, variableDefinitions);
        if (strQ != null) {
            return Integer.parseInt(q0.P0(strQ, "/")[0]);
        }
        return -1;
    }

    private static double h(String line, Pattern pattern) throws k0 {
        return Double.parseDouble(t(line, pattern, Collections.EMPTY_MAP));
    }

    @p0
    private static DrmInitData.SchemeData i(String line, String keyFormat, Map<String, String> variableDefinitions) throws k0 {
        String strP = p(line, f56177h0, "1", variableDefinitions);
        if (H.equals(keyFormat)) {
            String strT = t(line, f56179i0, variableDefinitions);
            return new DrmInitData.SchemeData(androidx.media2.exoplayer.external.c.f53750z1, "video/mp4", Base64.decode(strT.substring(strT.indexOf(44)), 0));
        }
        if (I.equals(keyFormat)) {
            return new DrmInitData.SchemeData(androidx.media2.exoplayer.external.c.f53750z1, "hls", q0.i0(line));
        }
        if (!F.equals(keyFormat) || !"1".equals(strP)) {
            return null;
        }
        String strT2 = t(line, f56179i0, variableDefinitions);
        byte[] bArrDecode = Base64.decode(strT2.substring(strT2.indexOf(44)), 0);
        UUID uuid = androidx.media2.exoplayer.external.c.A1;
        return new DrmInitData.SchemeData(uuid, "video/mp4", androidx.media2.exoplayer.external.extractor.mp4.j.a(uuid, bArrDecode));
    }

    private static String j(String method) {
        return (D.equals(method) || E.equals(method)) ? "cenc" : "cbcs";
    }

    private static int k(String line, Pattern pattern) throws k0 {
        return Integer.parseInt(t(line, pattern, Collections.EMPTY_MAP));
    }

    private static long l(String line, Pattern pattern) throws k0 {
        return Long.parseLong(t(line, pattern, Collections.EMPTY_MAP));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static e m(a iterator, String baseUri) throws IOException {
        ArrayList arrayList;
        int i10;
        String str;
        boolean z10;
        String strI;
        int i11;
        int i12;
        String str2;
        float f10;
        int i13;
        int i14;
        String str3 = baseUri;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        boolean zContains = false;
        boolean z11 = false;
        while (true) {
            int i15 = -1;
            if (!iterator.a()) {
                break;
            }
            String strB = iterator.b();
            if (strB.startsWith(f56166c)) {
                arrayList9.add(strB);
            }
            if (strB.startsWith(f56172f)) {
                map2.put(t(strB, f56187m0, map2), t(strB, f56201t0, map2));
            } else if (strB.equals(f56188n)) {
                z11 = true;
            } else if (strB.startsWith(f56176h)) {
                arrayList7.add(strB);
            } else if (strB.startsWith(f56200t)) {
                DrmInitData.SchemeData schemeDataI = i(strB, p(strB, f56175g0, G, map2), map2);
                if (schemeDataI != null) {
                    arrayList8.add(new DrmInitData(j(t(strB, f56173f0, map2)), schemeDataI));
                }
            } else {
                if (strB.startsWith(f56174g)) {
                    zContains |= strB.contains(L);
                    int iK = k(strB, R);
                    String strQ = q(strB, M, map2);
                    if (strQ != null) {
                        iK = Integer.parseInt(strQ);
                    }
                    int i16 = iK;
                    String strQ2 = q(strB, T, map2);
                    String strQ3 = q(strB, U, map2);
                    if (strQ3 != null) {
                        String[] strArrSplit = strQ3.split("x");
                        int i17 = Integer.parseInt(strArrSplit[0]);
                        int i18 = Integer.parseInt(strArrSplit[1]);
                        if (i17 <= 0 || i18 <= 0) {
                            i18 = -1;
                        } else {
                            i15 = i17;
                        }
                        i14 = i18;
                        i13 = i15;
                    } else {
                        i13 = -1;
                        i14 = -1;
                    }
                    String strQ4 = q(strB, V, map2);
                    float f11 = strQ4 != null ? Float.parseFloat(strQ4) : -1.0f;
                    String strQ5 = q(strB, N, map2);
                    String strQ6 = q(strB, O, map2);
                    String strQ7 = q(strB, P, map2);
                    String strQ8 = q(strB, Q, map2);
                    Uri uriE = m0.e(str3, u(iterator.b(), map2));
                    arrayList2.add(new e.b(uriE, Format.G(Integer.toString(arrayList2.size()), null, "application/x-mpegURL", null, strQ2, null, i16, i13, i14, f11, null, 0, 0), strQ5, strQ6, strQ7, strQ8));
                    ArrayList arrayList10 = (ArrayList) map.get(uriE);
                    if (arrayList10 == null) {
                        arrayList10 = new ArrayList();
                        map.put(uriE, arrayList10);
                    }
                    arrayList10.add(new HlsTrackMetadataEntry.VariantInfo(i16, strQ5, strQ6, strQ7, strQ8));
                }
                arrayList6 = arrayList6;
                arrayList9 = arrayList9;
            }
            arrayList6 = arrayList6;
            arrayList9 = arrayList9;
        }
        ArrayList arrayList11 = arrayList6;
        ArrayList arrayList12 = arrayList9;
        int i19 = 1;
        ArrayList arrayList13 = new ArrayList();
        HashSet hashSet = new HashSet();
        int i20 = 0;
        while (true) {
            arrayList = arrayList11;
            if (i20 >= arrayList2.size()) {
                break;
            }
            e.b bVar = (e.b) arrayList2.get(i20);
            if (hashSet.add(bVar.f56126a)) {
                androidx.media2.exoplayer.external.util.a.i(bVar.f56127b.f53099g == null ? i19 : 0);
                HlsTrackMetadataEntry hlsTrackMetadataEntry = new HlsTrackMetadataEntry(null, null, (List) map.get(bVar.f56126a));
                Format format = bVar.f56127b;
                Metadata.Entry[] entryArr = new Metadata.Entry[i19];
                entryArr[0] = hlsTrackMetadataEntry;
                arrayList13.add(bVar.a(format.k(new Metadata(entryArr))));
            }
            i20++;
            arrayList11 = arrayList;
            hashSet = hashSet;
            map = map;
            zContains = zContains;
            i19 = 1;
        }
        boolean z12 = zContains;
        Format format2 = null;
        List arrayList14 = null;
        int i21 = 0;
        while (i21 < arrayList7.size()) {
            String str4 = (String) arrayList7.get(i21);
            String strT = t(str4, f56189n0, map2);
            String strT2 = t(str4, f56187m0, map2);
            ArrayList arrayList15 = arrayList7;
            String strQ9 = q(str4, f56179i0, map2);
            Uri uriE2 = strQ9 == null ? null : m0.e(str3, strQ9);
            String strQ10 = q(str4, f56185l0, map2);
            int iS = s(str4);
            int iR = r(str4, map2);
            ArrayList arrayList16 = arrayList13;
            StringBuilder sb2 = new StringBuilder(String.valueOf(strT).length() + 1 + String.valueOf(strT2).length());
            sb2.append(strT);
            sb2.append(":");
            sb2.append(strT2);
            String string = sb2.toString();
            int i22 = i21;
            Metadata metadata = new Metadata(new HlsTrackMetadataEntry(strT, strT2, Collections.EMPTY_LIST));
            String strT3 = t(str4, f56183k0, map2);
            strT3.getClass();
            switch (strT3) {
                case "SUBTITLES":
                    arrayList5.add(new e.a(uriE2, Format.y(string, strT2, "application/x-mpegURL", "text/vtt", null, -1, iS, iR, strQ10).k(metadata), strT, strT2));
                    continue;
                    i21 = i22 + 1;
                    str3 = baseUri;
                    arrayList7 = arrayList15;
                    arrayList13 = arrayList16;
                    break;
                case "CLOSED-CAPTIONS":
                    String strT4 = t(str4, f56193p0, map2);
                    if (strT4.startsWith("CC")) {
                        i10 = Integer.parseInt(strT4.substring(2));
                        str = "application/cea-608";
                    } else {
                        i10 = Integer.parseInt(strT4.substring(7));
                        str = "application/cea-708";
                    }
                    int i23 = i10;
                    String str5 = str;
                    if (arrayList14 == null) {
                        arrayList14 = new ArrayList();
                    }
                    arrayList14.add(Format.z(string, strT2, null, str5, null, -1, iS, iR, strQ10, i23));
                    continue;
                    i21 = i22 + 1;
                    str3 = baseUri;
                    arrayList7 = arrayList15;
                    arrayList13 = arrayList16;
                    break;
                case "AUDIO":
                    e.b bVarD = d(arrayList2, strT);
                    if (bVarD != null) {
                        z10 = true;
                        strI = q0.I(bVarD.f56127b.f53098f, 1);
                    } else {
                        z10 = true;
                        strI = null;
                    }
                    Format formatP = Format.p(string, strT2, "application/x-mpegURL", strI != null ? s.d(strI) : null, strI, null, -1, g(str4, map2), -1, null, iS, iR, strQ10);
                    if (uriE2 == null) {
                        format2 = formatP;
                    } else {
                        arrayList4.add(new e.a(uriE2, formatP.k(metadata), strT, strT2));
                    }
                    continue;
                    i21 = i22 + 1;
                    str3 = baseUri;
                    arrayList7 = arrayList15;
                    arrayList13 = arrayList16;
                    break;
                case "VIDEO":
                    e.b bVarE = e(arrayList2, strT);
                    if (bVarE != null) {
                        Format format3 = bVarE.f56127b;
                        String strI2 = q0.I(format3.f53098f, 2);
                        i11 = format3.f53110n;
                        int i24 = format3.f53111o;
                        f10 = format3.f53115s;
                        str2 = strI2;
                        i12 = i24;
                    } else {
                        i11 = -1;
                        i12 = -1;
                        str2 = null;
                        f10 = -1.0f;
                    }
                    Format formatK = Format.G(string, strT2, "application/x-mpegURL", str2 != null ? s.d(str2) : null, str2, null, -1, i11, i12, f10, null, iS, iR).k(metadata);
                    if (uriE2 != null) {
                        arrayList3.add(new e.a(uriE2, formatK, strT, strT2));
                        break;
                    }
                    break;
            }
            i21 = i22 + 1;
            str3 = baseUri;
            arrayList7 = arrayList15;
            arrayList13 = arrayList16;
        }
        ArrayList arrayList17 = arrayList13;
        if (z12) {
            arrayList14 = Collections.EMPTY_LIST;
        }
        return new e(baseUri, arrayList12, arrayList17, arrayList3, arrayList4, arrayList5, arrayList, format2, arrayList14, z11, map2, arrayList8);
    }

    private static f n(e masterPlaylist, a iterator, String baseUri) throws IOException {
        String strB;
        int i10;
        ArrayList arrayList;
        String str;
        String hexString;
        e eVar = masterPlaylist;
        boolean z10 = eVar.f56162c;
        HashMap map = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        TreeMap treeMap = new TreeMap();
        long jH = -9223372036854775807L;
        long jB = 0;
        String strP = "";
        boolean z11 = z10;
        long jK = -9223372036854775807L;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long jL = 0;
        long j13 = 0;
        long j14 = -1;
        int i11 = 0;
        String strJ = null;
        boolean z12 = false;
        int iK = 1;
        boolean z13 = false;
        int i12 = 0;
        DrmInitData drmInitData = null;
        f.b bVar = null;
        String strT = null;
        String str2 = null;
        int i13 = 0;
        DrmInitData drmInitData2 = null;
        while (true) {
            boolean z14 = false;
            while (true) {
                if (!iterator.a()) {
                    return new f(i11, baseUri, arrayList3, jH, jB, z13, i12, j10, iK, jK, z11, z12, jB != 0, drmInitData, arrayList2);
                }
                strB = iterator.b();
                if (strB.startsWith(f56166c)) {
                    arrayList3.add(strB);
                }
                if (strB.startsWith(f56170e)) {
                    String strT2 = t(strB, Y, map);
                    if ("VOD".equals(strT2)) {
                        i11 = 1;
                    } else if ("EVENT".equals(strT2)) {
                        i11 = 2;
                    }
                } else if (strB.startsWith(f56194q)) {
                    jH = (long) (h(strB, f56167c0) * 1000000.0d);
                } else {
                    i10 = i11;
                    if (strB.startsWith(f56186m)) {
                        String strT3 = t(strB, f56179i0, map);
                        arrayList = arrayList3;
                        String strQ = q(strB, f56171e0, map);
                        if (strQ != null) {
                            String[] strArrSplit = strQ.split("@");
                            j14 = Long.parseLong(strArrSplit[0]);
                            if (strArrSplit.length > 1) {
                                j11 = Long.parseLong(strArrSplit[1]);
                            }
                        }
                        long j15 = j11;
                        long j16 = j14;
                        if (strT != null && str2 == null) {
                            throw new k0("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.");
                        }
                        bVar = new f.b(strT3, j15, j16, strT, str2);
                        j11 = 0;
                        j14 = -1;
                    } else {
                        arrayList = arrayList3;
                        String str3 = str2;
                        if (strB.startsWith(f56178i)) {
                            str = str3;
                            jK = 1000000 * ((long) k(strB, W));
                        } else {
                            str = str3;
                            if (strB.startsWith(f56192p)) {
                                jL = l(strB, Z);
                                str2 = str;
                                j10 = jL;
                            } else if (strB.startsWith(f56168d)) {
                                iK = k(strB, X);
                            } else {
                                if (strB.startsWith(f56172f)) {
                                    String strQ2 = q(strB, f56203u0, map);
                                    if (strQ2 != null) {
                                        String str4 = eVar.f56120l.get(strQ2);
                                        if (str4 != null) {
                                            map.put(strQ2, str4);
                                        }
                                    } else {
                                        map.put(t(strB, f56187m0, map), t(strB, f56201t0, map));
                                    }
                                } else if (strB.startsWith(f56190o)) {
                                    long jH2 = (long) (h(strB, f56163a0) * 1000000.0d);
                                    strP = p(strB, f56165b0, "", map);
                                    j13 = jH2;
                                    str2 = str;
                                    i11 = i10;
                                    arrayList3 = arrayList;
                                    eVar = masterPlaylist;
                                } else if (strB.startsWith(f56198s)) {
                                    String strT4 = t(strB, f56173f0, map);
                                    String strP2 = p(strB, f56175g0, G, map);
                                    if (A.equals(strT4)) {
                                        treeMap.clear();
                                        strT = null;
                                        str2 = null;
                                    } else {
                                        String strQ3 = q(strB, f56181j0, map);
                                        if (G.equals(strP2)) {
                                            if (B.equals(strT4)) {
                                                strT = t(strB, f56179i0, map);
                                                str2 = strQ3;
                                            }
                                            eVar = masterPlaylist;
                                        } else {
                                            if (strJ == null) {
                                                strJ = j(strT4);
                                            }
                                            DrmInitData.SchemeData schemeDataI = i(strB, strP2, map);
                                            if (schemeDataI != null) {
                                                treeMap.put(strP2, schemeDataI);
                                                str2 = strQ3;
                                                strT = null;
                                            }
                                            eVar = masterPlaylist;
                                        }
                                        str2 = strQ3;
                                        strT = null;
                                        eVar = masterPlaylist;
                                    }
                                    drmInitData2 = null;
                                    eVar = masterPlaylist;
                                } else {
                                    if (!strB.startsWith(f56202u)) {
                                        if (!strB.startsWith(f56182k)) {
                                            if (!strB.equals(f56180j)) {
                                                if (!strB.startsWith(f56184l)) {
                                                    if (!strB.equals(f56204v)) {
                                                        if (!strB.equals(f56188n)) {
                                                            if (!strB.equals(f56196r)) {
                                                                if (!strB.startsWith("#")) {
                                                                    break;
                                                                }
                                                            } else {
                                                                eVar = masterPlaylist;
                                                                str2 = str;
                                                                z12 = true;
                                                            }
                                                        } else {
                                                            eVar = masterPlaylist;
                                                            str2 = str;
                                                            z11 = true;
                                                        }
                                                    } else {
                                                        eVar = masterPlaylist;
                                                        str2 = str;
                                                        z14 = true;
                                                    }
                                                } else if (jB == 0) {
                                                    jB = androidx.media2.exoplayer.external.c.b(q0.C0(strB.substring(strB.indexOf(58) + 1))) - j12;
                                                }
                                            } else {
                                                i13++;
                                            }
                                        } else {
                                            i12 = Integer.parseInt(strB.substring(strB.indexOf(58) + 1));
                                            eVar = masterPlaylist;
                                            str2 = str;
                                            i11 = i10;
                                            arrayList3 = arrayList;
                                            z13 = true;
                                        }
                                    } else {
                                        String[] strArrSplit2 = t(strB, f56169d0, map).split("@");
                                        j14 = Long.parseLong(strArrSplit2[0]);
                                        if (strArrSplit2.length > 1) {
                                            j11 = Long.parseLong(strArrSplit2[1]);
                                        }
                                    }
                                    eVar = masterPlaylist;
                                }
                                eVar = masterPlaylist;
                                str2 = str;
                                j13 = j13;
                                z14 = z14;
                                treeMap = treeMap;
                                i11 = i10;
                                arrayList3 = arrayList;
                                strP = strP;
                            }
                        }
                        str2 = str;
                    }
                    i11 = i10;
                    arrayList3 = arrayList;
                }
            }
            if (strT == null) {
                hexString = null;
            } else {
                hexString = str != null ? str : Long.toHexString(jL);
            }
            long j17 = jL + 1;
            int i14 = (j14 > (-1L) ? 1 : (j14 == (-1L) ? 0 : -1));
            if (i14 == 0) {
                j11 = 0;
            }
            if (drmInitData2 != null || treeMap.isEmpty()) {
                i14 = i14;
            } else {
                DrmInitData.SchemeData[] schemeDataArr = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                DrmInitData drmInitData3 = new DrmInitData(strJ, schemeDataArr);
                if (drmInitData == null) {
                    DrmInitData.SchemeData[] schemeDataArr2 = new DrmInitData.SchemeData[schemeDataArr.length];
                    int i15 = 0;
                    while (i15 < schemeDataArr.length) {
                        schemeDataArr2[i15] = schemeDataArr[i15].c(null);
                        i15++;
                        schemeDataArr = schemeDataArr;
                    }
                    drmInitData = new DrmInitData(strJ, schemeDataArr2);
                }
                drmInitData2 = drmInitData3;
            }
            long j18 = j11;
            long j19 = j12;
            String str5 = strT;
            int i16 = i13;
            DrmInitData drmInitData4 = drmInitData2;
            long j20 = j13;
            f.b bVar2 = new f.b(u(strB, map), bVar, strP, j20, i16, j19, drmInitData4, str5, hexString, j18, j14, z14);
            j11 = j18;
            drmInitData2 = drmInitData4;
            i13 = i16;
            strT = str5;
            arrayList2.add(bVar2);
            j12 = j19 + j20;
            if (i14 != 0) {
                j11 += j14;
            }
            eVar = masterPlaylist;
            str2 = str;
            j13 = 0;
            j14 = -1;
            treeMap = treeMap;
            i11 = i10;
            arrayList3 = arrayList;
            jL = j17;
        }
    }

    private static boolean o(String line, Pattern pattern, boolean defaultValue) {
        Matcher matcher = pattern.matcher(line);
        return matcher.find() ? matcher.group(1).equals(J) : defaultValue;
    }

    private static String p(String line, Pattern pattern, String defaultValue, Map<String, String> variableDefinitions) {
        Matcher matcher = pattern.matcher(line);
        if (matcher.find()) {
            defaultValue = matcher.group(1);
        }
        if (!variableDefinitions.isEmpty() && defaultValue != null) {
            return u(defaultValue, variableDefinitions);
        }
        return defaultValue;
    }

    @p0
    private static String q(String line, Pattern pattern, Map<String, String> variableDefinitions) {
        return p(line, pattern, null, variableDefinitions);
    }

    private static int r(String line, Map<String, String> variableDefinitions) {
        String strQ = q(line, f56191o0, variableDefinitions);
        if (TextUtils.isEmpty(strQ)) {
            return 0;
        }
        String[] strArrO0 = q0.O0(strQ, ",");
        int i10 = q0.t(strArrO0, "public.accessibility.describes-video") ? 512 : 0;
        if (q0.t(strArrO0, "public.accessibility.transcribes-spoken-dialog")) {
            i10 |= 4096;
        }
        if (q0.t(strArrO0, "public.accessibility.describes-music-and-sound")) {
            i10 |= 1024;
        }
        return q0.t(strArrO0, "public.easy-to-read") ? i10 | 8192 : i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    private static int s(String str) {
        boolean zO = o(str, f56197r0, false);
        ?? r10 = zO;
        if (o(str, f56199s0, false)) {
            r10 = (zO ? 1 : 0) | 2;
        }
        return o(str, f56195q0, false) ? r10 | 4 : r10;
    }

    private static String t(String line, Pattern pattern, Map<String, String> variableDefinitions) throws k0 {
        String strQ = q(line, pattern, variableDefinitions);
        if (strQ != null) {
            return strQ;
        }
        String strPattern = pattern.pattern();
        StringBuilder sb2 = new StringBuilder(String.valueOf(strPattern).length() + 19 + String.valueOf(line).length());
        sb2.append("Couldn't match ");
        sb2.append(strPattern);
        sb2.append(" in ");
        sb2.append(line);
        throw new k0(sb2.toString());
    }

    private static String u(String string, Map<String, String> variableDefinitions) {
        Matcher matcher = f56205v0.matcher(string);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (variableDefinitions.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(variableDefinitions.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    private static int v(BufferedReader reader, boolean skipLinebreaks, int c10) throws IOException {
        while (c10 != -1 && Character.isWhitespace(c10) && (skipLinebreaks || !q0.p0(c10))) {
            c10 = reader.read();
        }
        return c10;
    }

    @Override // androidx.media2.exoplayer.external.upstream.i0.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public g a(Uri uri, InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (!b(bufferedReader)) {
                throw new c1("Input does not start with the #EXTM3U header.", uri);
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    q0.o(bufferedReader);
                    throw new k0("Failed to parse the playlist, could not identify any tags.");
                }
                String strTrim = line.trim();
                if (!strTrim.isEmpty()) {
                    if (strTrim.startsWith(f56174g)) {
                        arrayDeque.add(strTrim);
                        e eVarM = m(new a(arrayDeque, bufferedReader), uri.toString());
                        q0.o(bufferedReader);
                        return eVarM;
                    }
                    if (!strTrim.startsWith(f56178i) && !strTrim.startsWith(f56192p) && !strTrim.startsWith(f56190o) && !strTrim.startsWith(f56198s) && !strTrim.startsWith(f56202u) && !strTrim.equals(f56180j) && !strTrim.equals(f56182k) && !strTrim.equals(f56196r)) {
                        arrayDeque.add(strTrim);
                    }
                    arrayDeque.add(strTrim);
                    f fVarN = n(this.f56210a, new a(arrayDeque, bufferedReader), uri.toString());
                    q0.o(bufferedReader);
                    return fVarN;
                }
            }
        } catch (Throwable th2) {
            q0.o(bufferedReader);
            throw th2;
        }
    }

    public h(e masterPlaylist) {
        this.f56210a = masterPlaylist;
    }
}
