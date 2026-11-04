package okhttp3.internal.http2;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f334308c = 16384;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f334309d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f334310e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f334311f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f334312g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f334313h = 4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f334314i = 5;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f334315j = 6;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f334316k = 7;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f334317l = 8;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f334318m = 9;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f334319n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f334320o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f334321p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f334322q = 4;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f334323r = 4;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f334324s = 8;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f334325t = 32;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f334326u = 32;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    private static final String[] f334329x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f334306a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final o f334307b = o.f335046d.l("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private static final String[] f334327v = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private static final String[] f334328w = new String[64];

    static {
        String[] strArr = new String[256];
        for (int i10 = 0; i10 < 256; i10++) {
            String binaryString = Integer.toBinaryString(i10);
            Intrinsics.checkNotNullExpressionValue(binaryString, "toBinaryString(it)");
            strArr[i10] = StringsKt.j2(jk.f.y("%8s", binaryString), ' ', org.locationtech.jts.geom.l.f338160j, false, 4, null);
        }
        f334329x = strArr;
        String[] strArr2 = f334328w;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i11 = iArr[0];
        strArr2[i11 | 8] = strArr2[i11] + "|PADDED";
        int i12 = 3 & 4;
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i13 = 0; i13 < 3; i13++) {
            int i14 = iArr2[i13];
            int i15 = iArr[0];
            String[] strArr3 = f334328w;
            int i16 = i15 | i14;
            strArr3[i16] = strArr3[i15] + '|' + strArr3[i14];
            strArr3[i16 | 8] = strArr3[i15] + '|' + strArr3[i14] + "|PADDED";
        }
        int length = f334328w.length;
        for (int i17 = 0; i17 < length; i17++) {
            String[] strArr4 = f334328w;
            if (strArr4[i17] == null) {
                strArr4[i17] = f334329x[i17];
            }
        }
    }

    private e() {
    }

    @NotNull
    public final String a(int i10, int i11) {
        String str;
        if (i11 == 0) {
            return "";
        }
        if (i10 != 2 && i10 != 3) {
            if (i10 == 4 || i10 == 6) {
                return i11 == 1 ? "ACK" : f334329x[i11];
            }
            if (i10 != 7 && i10 != 8) {
                String[] strArr = f334328w;
                if (i11 < strArr.length) {
                    str = strArr[i11];
                    Intrinsics.checkNotNull(str);
                } else {
                    str = f334329x[i11];
                }
                String str2 = str;
                if (i10 != 5 || (i11 & 4) == 0) {
                    return (i10 != 0 || (i11 & 32) == 0) ? str2 : StringsKt.k2(str2, "PRIORITY", "COMPRESSED", false, 4, null);
                }
                return StringsKt.k2(str2, "HEADERS", "PUSH_PROMISE", false, 4, null);
            }
        }
        return f334329x[i11];
    }

    @NotNull
    public final String b(int i10) {
        String[] strArr = f334327v;
        return i10 < strArr.length ? strArr[i10] : jk.f.y("0x%02x", Integer.valueOf(i10));
    }

    @NotNull
    public final String c(boolean z10, int i10, int i11, int i12, int i13) {
        return jk.f.y("%s 0x%08x %5d %-13s %s", z10 ? "<<" : ">>", Integer.valueOf(i10), Integer.valueOf(i11), b(i12), a(i12, i13));
    }
}
