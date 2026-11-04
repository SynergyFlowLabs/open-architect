package androidx.media3.common;

import android.net.Uri;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class r {
    private static final String A = ".ac4";
    private static final String B = ".adts";
    private static final String C = ".aac";
    private static final String D = ".amr";
    private static final String E = ".flac";
    private static final String F = ".flv";
    private static final String G = ".mid";
    private static final String H = ".midi";
    private static final String I = ".smf";
    private static final String J = ".mk";
    private static final String K = ".webm";
    private static final String L = ".og";
    private static final String M = ".opus";
    private static final String N = ".mp3";
    private static final String O = ".mp4";
    private static final String P = ".m4";
    private static final String Q = ".mp4";
    private static final String R = ".cmf";
    private static final String S = ".ps";
    private static final String T = ".mpeg";
    private static final String U = ".mpg";
    private static final String V = ".m2p";
    private static final String W = ".ts";
    private static final String X = ".ts";
    private static final String Y = ".wav";
    private static final String Z = ".wave";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f61138a = -1;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final String f61139a0 = ".vtt";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f61140b = 0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final String f61141b0 = ".webvtt";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f61142c = 1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final String f61143c0 = ".jpg";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f61144d = 2;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final String f61145d0 = ".jpeg";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f61146e = 3;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final String f61147e0 = ".avi";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f61148f = 4;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final String f61149f0 = ".png";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f61150g = 5;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final String f61151g0 = ".webp";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f61152h = 6;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final String f61153h0 = ".bmp";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f61154i = 7;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final String f61155i0 = ".dib";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f61156j = 8;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final String f61157j0 = ".heic";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f61158k = 9;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final String f61159k0 = ".heif";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f61160l = 10;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final String f61161l0 = ".avif";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f61162m = 11;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f61163n = 12;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f61164o = 13;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f61165p = 14;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f61166q = 15;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f61167r = 16;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f61168s = 17;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f61169t = 18;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f61170u = 19;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f61171v = 20;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f61172w = 21;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.l1
    static final String f61173x = "Content-Type";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f61174y = ".ac3";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f61175z = ".ec3";

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    private r() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int a(@androidx.annotation.p0 String str) {
        byte b10;
        if (str == null) {
            return -1;
        }
        String strW = s0.w(str);
        strW.getClass();
        switch (strW.hashCode()) {
            case -2123537834:
                b10 = !strW.equals("audio/eac3-joc") ? (byte) -1 : (byte) 0;
                break;
            case -1662384011:
                b10 = !strW.equals(s0.f61335s) ? (byte) -1 : (byte) 1;
                break;
            case -1662384007:
                b10 = !strW.equals(s0.f61329p) ? (byte) -1 : (byte) 2;
                break;
            case -1662095187:
                b10 = !strW.equals("video/webm") ? (byte) -1 : (byte) 3;
                break;
            case -1606874997:
                b10 = !strW.equals("audio/amr-wb") ? (byte) -1 : (byte) 4;
                break;
            case -1487656890:
                b10 = !strW.equals(s0.f61294a1) ? (byte) -1 : (byte) 5;
                break;
            case -1487464693:
                b10 = !strW.equals("image/heic") ? (byte) -1 : (byte) 6;
                break;
            case -1487464690:
                b10 = !strW.equals("image/heif") ? (byte) -1 : (byte) 7;
                break;
            case -1487394660:
                b10 = !strW.equals("image/jpeg") ? (byte) -1 : (byte) 8;
                break;
            case -1487018032:
                b10 = !strW.equals("image/webp") ? (byte) -1 : (byte) 9;
                break;
            case -1248337486:
                b10 = !strW.equals("application/mp4") ? (byte) -1 : (byte) 10;
                break;
            case -1079884372:
                b10 = !strW.equals(s0.f61349z) ? (byte) -1 : (byte) 11;
                break;
            case -1004728940:
                b10 = !strW.equals("text/vtt") ? (byte) -1 : (byte) 12;
                break;
            case -879272239:
                b10 = !strW.equals(s0.f61297b1) ? (byte) -1 : (byte) 13;
                break;
            case -879258763:
                b10 = !strW.equals(s0.X0) ? (byte) -1 : (byte) 14;
                break;
            case -387023398:
                b10 = !strW.equals(s0.I) ? (byte) -1 : (byte) 15;
                break;
            case -43467528:
                b10 = !strW.equals("application/webm") ? (byte) -1 : (byte) 16;
                break;
            case 13915911:
                b10 = !strW.equals(s0.f61343w) ? (byte) -1 : (byte) 17;
                break;
            case 187078296:
                b10 = !strW.equals("audio/ac3") ? (byte) -1 : (byte) 18;
                break;
            case 187078297:
                b10 = !strW.equals("audio/ac4") ? (byte) -1 : (byte) 19;
                break;
            case 187078669:
                b10 = !strW.equals(s0.f61302d0) ? (byte) -1 : (byte) 20;
                break;
            case 187090232:
                b10 = !strW.equals("audio/mp4") ? (byte) -1 : (byte) 21;
                break;
            case 187091926:
                b10 = !strW.equals(s0.f61318j0) ? (byte) -1 : com.google.common.base.c.f116473z;
                break;
            case 187099443:
                b10 = !strW.equals(s0.f61320k0) ? (byte) -1 : com.google.common.base.c.A;
                break;
            case 1331848029:
                b10 = !strW.equals("video/mp4") ? (byte) -1 : com.google.common.base.c.B;
                break;
            case 1503095341:
                b10 = !strW.equals("audio/3gpp") ? (byte) -1 : com.google.common.base.c.C;
                break;
            case 1504578661:
                b10 = !strW.equals("audio/eac3") ? (byte) -1 : com.google.common.base.c.D;
                break;
            case 1504619009:
                b10 = !strW.equals("audio/flac") ? (byte) -1 : com.google.common.base.c.E;
                break;
            case 1504824762:
                b10 = !strW.equals(s0.f61322l0) ? (byte) -1 : com.google.common.base.c.F;
                break;
            case 1504831518:
                b10 = !strW.equals("audio/mpeg") ? (byte) -1 : com.google.common.base.c.G;
                break;
            case 1505118770:
                b10 = !strW.equals("audio/webm") ? (byte) -1 : com.google.common.base.c.H;
                break;
            case 2039520277:
                b10 = !strW.equals(s0.f61310g) ? (byte) -1 : com.google.common.base.c.I;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
            case 18:
            case 26:
                return 0;
            case 1:
                return 10;
            case 2:
                return 11;
            case 3:
            case 15:
            case 16:
            case 30:
            case 31:
                return 6;
            case 4:
            case 20:
            case 25:
                return 3;
            case 5:
                return 21;
            case 6:
            case 7:
                return 20;
            case 8:
                return 14;
            case 9:
                return 18;
            case 10:
            case 21:
            case 24:
                return 8;
            case 11:
                return 16;
            case 12:
                return 13;
            case 13:
                return 19;
            case 14:
                return 17;
            case 17:
                return 5;
            case 19:
                return 1;
            case 22:
                return 9;
            case 23:
                return 12;
            case 27:
                return 4;
            case 28:
                return 15;
            case 29:
                return 7;
            default:
                return -1;
        }
    }

    public static int b(Map<String, List<String>> map) {
        List<String> list = map.get("Content-Type");
        return a((list == null || list.isEmpty()) ? null : list.get(0));
    }

    public static int c(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(B) || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(D)) {
            return 3;
        }
        if (lastPathSegment.endsWith(E)) {
            return 4;
        }
        if (lastPathSegment.endsWith(F)) {
            return 5;
        }
        if (lastPathSegment.endsWith(G) || lastPathSegment.endsWith(H) || lastPathSegment.endsWith(I)) {
            return 15;
        }
        if (!lastPathSegment.startsWith(J, lastPathSegment.length() - 4) && !lastPathSegment.endsWith(K)) {
            if (lastPathSegment.endsWith(".mp3")) {
                return 7;
            }
            if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                return 8;
            }
            if (lastPathSegment.startsWith(L, lastPathSegment.length() - 4) || lastPathSegment.endsWith(M)) {
                return 9;
            }
            if (!lastPathSegment.endsWith(S) && !lastPathSegment.endsWith(T) && !lastPathSegment.endsWith(U) && !lastPathSegment.endsWith(V)) {
                if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                    return 11;
                }
                if (lastPathSegment.endsWith(Y) || lastPathSegment.endsWith(Z)) {
                    return 12;
                }
                if (!lastPathSegment.endsWith(".vtt") && !lastPathSegment.endsWith(".webvtt")) {
                    if (lastPathSegment.endsWith(f61143c0) || lastPathSegment.endsWith(f61145d0)) {
                        return 14;
                    }
                    if (lastPathSegment.endsWith(f61147e0)) {
                        return 16;
                    }
                    if (lastPathSegment.endsWith(f61149f0)) {
                        return 17;
                    }
                    if (lastPathSegment.endsWith(f61151g0)) {
                        return 18;
                    }
                    if (lastPathSegment.endsWith(f61153h0) || lastPathSegment.endsWith(f61155i0)) {
                        return 19;
                    }
                    if (lastPathSegment.endsWith(f61157j0) || lastPathSegment.endsWith(f61159k0)) {
                        return 20;
                    }
                    return lastPathSegment.endsWith(f61161l0) ? 21 : -1;
                }
                return 13;
            }
            return 10;
        }
        return 6;
    }
}
