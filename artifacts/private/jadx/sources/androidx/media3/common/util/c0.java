package androidx.media3.common.util;

import android.media.MediaFormat;
import com.google.common.collect.l6;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f61476a = "exo-pixel-width-height-ratio-float";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f61477b = "exo-pcm-encoding-int";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f61478c = "max-bitrate";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f61479d = 1073741824;

    private c0() {
    }

    @e.a({"InlinedApi"})
    public static androidx.media3.common.w a(MediaFormat mediaFormat) {
        int i10 = 0;
        androidx.media3.common.w.b bVarO0 = new androidx.media3.common.w.b().u0(mediaFormat.getString("mime")).j0(mediaFormat.getString("language")).p0(h(mediaFormat, f61478c, -1)).Q(h(mediaFormat, "bitrate", -1)).S(d(mediaFormat)).b0(g(mediaFormat, -1.0f)).B0(h(mediaFormat, "width", -1)).d0(h(mediaFormat, "height", -1)).q0(i(mediaFormat, 1.0f)).k0(h(mediaFormat, "max-input-size", -1)).t0(h(mediaFormat, "rotation-degrees", 0)).T(e(mediaFormat)).v0(h(mediaFormat, "sample-rate", -1)).R(h(mediaFormat, "channel-count", -1)).o0(h(mediaFormat, "pcm-encoding", -1));
        l6.a aVar = new l6.a();
        while (true) {
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("csd-" + i10);
            if (byteBuffer == null) {
                bVarO0.g0(aVar.e());
                return bVarO0.N();
            }
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            byteBuffer.rewind();
            aVar.a(bArr);
            i10++;
        }
    }

    @e.a({"InlinedApi"})
    public static MediaFormat b(androidx.media3.common.w wVar) {
        MediaFormat mediaFormat = new MediaFormat();
        t(mediaFormat, "bitrate", wVar.f61756j);
        t(mediaFormat, f61478c, wVar.f61755i);
        t(mediaFormat, "channel-count", wVar.E);
        r(mediaFormat, wVar.C);
        w(mediaFormat, "mime", wVar.f61761o);
        w(mediaFormat, "codecs-string", wVar.f61757k);
        s(mediaFormat, "frame-rate", wVar.f61770x);
        t(mediaFormat, "width", wVar.f61768v);
        t(mediaFormat, "height", wVar.f61769w);
        y(mediaFormat, wVar.f61764r);
        u(mediaFormat, wVar.G);
        w(mediaFormat, "language", wVar.f61750d);
        t(mediaFormat, "max-input-size", wVar.f61762p);
        t(mediaFormat, "sample-rate", wVar.F);
        t(mediaFormat, "caption-service-number", wVar.J);
        mediaFormat.setInteger("rotation-degrees", wVar.f61771y);
        int i10 = wVar.f61751e;
        x(mediaFormat, "is-autoselect", i10 & 4);
        x(mediaFormat, "is-default", i10 & 1);
        x(mediaFormat, "is-forced-subtitle", i10 & 2);
        mediaFormat.setInteger("encoder-delay", wVar.H);
        mediaFormat.setInteger("encoder-padding", wVar.I);
        v(mediaFormat, wVar.f61772z);
        return mediaFormat;
    }

    public static byte[] c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return bArr;
    }

    @e.a({"InlinedApi"})
    @androidx.annotation.p0
    private static String d(MediaFormat mediaFormat) {
        return (Objects.equals(mediaFormat.getString("mime"), "video/3gpp") && mediaFormat.containsKey("profile") && mediaFormat.containsKey("level")) ? k.f(mediaFormat.getInteger("profile"), mediaFormat.getInteger("level")) : j(mediaFormat, "codecs-string", null);
    }

    @androidx.annotation.p0
    public static androidx.media3.common.k e(MediaFormat mediaFormat) {
        if (k1.f61540a < 24) {
            return null;
        }
        int iH = h(mediaFormat, "color-standard", -1);
        int iH2 = h(mediaFormat, "color-range", -1);
        int iH3 = h(mediaFormat, "color-transfer", -1);
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
        byte[] bArrC = byteBuffer != null ? c(byteBuffer) : null;
        if (!n(iH)) {
            iH = -1;
        }
        if (!m(iH2)) {
            iH2 = -1;
        }
        if (!o(iH3)) {
            iH3 = -1;
        }
        if (iH == -1 && iH2 == -1 && iH3 == -1 && bArrC == null) {
            return null;
        }
        return new androidx.media3.common.k.b().d(iH).c(iH2).e(iH3).f(bArrC).a();
    }

    public static float f(MediaFormat mediaFormat, String str, float f10) {
        return mediaFormat.containsKey(str) ? mediaFormat.getFloat(str) : f10;
    }

    private static float g(MediaFormat mediaFormat, float f10) {
        if (!mediaFormat.containsKey("frame-rate")) {
            return f10;
        }
        try {
            return mediaFormat.getFloat("frame-rate");
        } catch (ClassCastException unused) {
            return mediaFormat.getInteger("frame-rate");
        }
    }

    public static int h(MediaFormat mediaFormat, String str, int i10) {
        return mediaFormat.containsKey(str) ? mediaFormat.getInteger(str) : i10;
    }

    @e.a({"InlinedApi"})
    private static float i(MediaFormat mediaFormat, float f10) {
        if (mediaFormat.containsKey("sar-width") && mediaFormat.containsKey("sar-height")) {
            f10 = mediaFormat.getInteger("sar-width") / mediaFormat.getInteger("sar-height");
        }
        return f10;
    }

    @androidx.annotation.p0
    public static String j(MediaFormat mediaFormat, String str, @androidx.annotation.p0 String str2) {
        return mediaFormat.containsKey(str) ? mediaFormat.getString(str) : str2;
    }

    @androidx.annotation.p0
    public static Integer k(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("time-lapse-enable") && mediaFormat.getInteger("time-lapse-enable") > 0 && mediaFormat.containsKey("time-lapse-fps")) {
            return Integer.valueOf(mediaFormat.getInteger("time-lapse-fps"));
        }
        return null;
    }

    public static boolean l(MediaFormat mediaFormat) {
        return androidx.media3.common.s0.q(mediaFormat.getString("mime"));
    }

    private static boolean m(int i10) {
        return i10 == 2 || i10 == 1 || i10 == -1;
    }

    private static boolean n(int i10) {
        return i10 == 2 || i10 == 1 || i10 == 6 || i10 == -1;
    }

    private static boolean o(int i10) {
        if (i10 != 1 && i10 != 3 && i10 != 6 && i10 != 7 && i10 != -1) {
            return false;
        }
        return true;
    }

    public static boolean p(MediaFormat mediaFormat) {
        return androidx.media3.common.s0.v(mediaFormat.getString("mime"));
    }

    public static void q(MediaFormat mediaFormat, String str, @androidx.annotation.p0 byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void r(MediaFormat mediaFormat, @androidx.annotation.p0 androidx.media3.common.k kVar) {
        if (kVar != null) {
            t(mediaFormat, "color-transfer", kVar.f60802c);
            t(mediaFormat, "color-standard", kVar.f60800a);
            t(mediaFormat, "color-range", kVar.f60801b);
            q(mediaFormat, "hdr-static-info", kVar.f60803d);
        }
    }

    public static void s(MediaFormat mediaFormat, String str, float f10) {
        if (f10 != -1.0f) {
            mediaFormat.setFloat(str, f10);
        }
    }

    public static void t(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001e, code lost:
    
        if (r3 != 22) goto L17;
     */
    @e.a({"InlinedApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void u(android.media.MediaFormat r2, int r3) {
        /*
            r0 = -1
            if (r3 != r0) goto L5
            r1 = 6
            goto L20
        L5:
            java.lang.String r0 = "exo-pcm-encoding-int"
            r1 = 0
            t(r2, r0, r3)
            if (r3 == 0) goto L22
            r0 = 2
            r1 = 3
            if (r3 == r0) goto L23
            r0 = 3
            r1 = 1
            if (r3 == r0) goto L23
            r0 = 4
            if (r3 == r0) goto L23
            r0 = 21
            if (r3 == r0) goto L23
            r0 = 22
            if (r3 == r0) goto L23
        L20:
            r1 = 0
            return
        L22:
            r0 = 0
        L23:
            r1 = 6
            java.lang.String r3 = "mcpmno-idgcn"
            java.lang.String r3 = "pcm-encoding"
            r2.setInteger(r3, r0)
            r1 = 4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.util.c0.u(android.media.MediaFormat, int):void");
    }

    @e.a({"InlinedApi"})
    private static void v(MediaFormat mediaFormat, float f10) {
        int i10;
        mediaFormat.setFloat(f61476a, f10);
        int i11 = 1073741824;
        if (f10 < 1.0f) {
            i11 = (int) (f10 * 1073741824);
            i10 = 1073741824;
        } else if (f10 > 1.0f) {
            i10 = (int) (1073741824 / f10);
        } else {
            i11 = 1;
            i10 = 1;
        }
        mediaFormat.setInteger("sar-width", i11);
        mediaFormat.setInteger("sar-height", i10);
    }

    public static void w(MediaFormat mediaFormat, String str, @androidx.annotation.p0 String str2) {
        if (str2 != null) {
            mediaFormat.setString(str, str2);
        }
    }

    private static void x(MediaFormat mediaFormat, String str, int i10) {
        mediaFormat.setInteger(str, i10 != 0 ? 1 : 0);
    }

    public static void y(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            mediaFormat.setByteBuffer("csd-" + i10, ByteBuffer.wrap(list.get(i10)));
        }
    }
}
