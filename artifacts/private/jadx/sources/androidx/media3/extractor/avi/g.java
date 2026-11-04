package androidx.media3.extractor.avi;

import androidx.annotation.p0;
import androidx.media3.common.s0;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.o0;
import androidx.media3.common.util.z;
import androidx.media3.common.w;
import com.google.common.collect.l6;

/* JADX INFO: loaded from: classes3.dex */
final class g implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f67110b = "StreamFormatChunk";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f67111a;

    public g(w wVar) {
        this.f67111a = wVar;
    }

    @p0
    private static String a(int i10) {
        switch (i10) {
            case 808802372:
            case 877677894:
            case 1145656883:
            case 1145656920:
            case 1482049860:
            case 1684633208:
            case 2021026148:
                return "video/mp4v-es";
            case 826496577:
            case 828601953:
            case 875967048:
                return "video/avc";
            case 842289229:
                return s0.B;
            case 859066445:
                return s0.C;
            case 1196444237:
            case 1735420525:
                return s0.A;
            default:
                return null;
        }
    }

    @p0
    private static String b(int i10) {
        if (i10 == 1) {
            return "audio/raw";
        }
        if (i10 == 85) {
            return "audio/mpeg";
        }
        if (i10 == 255) {
            return "audio/mp4a-latm";
        }
        if (i10 == 8192) {
            return "audio/ac3";
        }
        if (i10 != 8193) {
            return null;
        }
        return "audio/vnd.dts";
    }

    @p0
    private static a d(o0 o0Var) {
        o0Var.b0(4);
        int iW = o0Var.w();
        int iW2 = o0Var.w();
        o0Var.b0(4);
        int iW3 = o0Var.w();
        String strA = a(iW3);
        if (strA != null) {
            w.b bVar = new w.b();
            bVar.B0(iW).d0(iW2).u0(strA);
            return new g(bVar.N());
        }
        z.n(f67110b, "Ignoring track with unsupported compression " + iW3);
        return null;
    }

    @p0
    public static a e(int i10, o0 o0Var) {
        if (i10 == 2) {
            return d(o0Var);
        }
        if (i10 == 1) {
            return f(o0Var);
        }
        z.n(f67110b, "Ignoring strf box for unsupported track type: " + k1.O0(i10));
        return null;
    }

    @p0
    private static a f(o0 o0Var) {
        int iD = o0Var.D();
        String strB = b(iD);
        if (strB == null) {
            z.n(f67110b, "Ignoring track with unsupported format tag " + iD);
            return null;
        }
        int iD2 = o0Var.D();
        int iW = o0Var.w();
        o0Var.b0(6);
        int iB0 = k1.B0(o0Var.D());
        int i10 = 5 | 0;
        int iD3 = o0Var.a() > 0 ? o0Var.D() : 0;
        w.b bVar = new w.b();
        bVar.u0(strB).R(iD2).v0(iW);
        if (strB.equals("audio/raw") && iB0 != 0) {
            bVar.o0(iB0);
        }
        if (strB.equals("audio/mp4a-latm") && iD3 > 0) {
            byte[] bArr = new byte[iD3];
            o0Var.n(bArr, 0, iD3);
            bVar.g0(l6.G(bArr));
        }
        return new g(bVar.N());
    }

    @Override // androidx.media3.extractor.avi.a
    public int c() {
        return b.D;
    }
}
