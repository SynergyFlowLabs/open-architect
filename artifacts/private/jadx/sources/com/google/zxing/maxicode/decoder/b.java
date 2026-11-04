package com.google.zxing.maxicode.decoder;

import com.google.zxing.common.e;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes5.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char f130501a = 65520;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char f130502b = 65521;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final char f130503c = 65522;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final char f130504d = 65523;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final char f130505e = 65524;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final char f130506f = 65525;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final char f130507g = 65526;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final char f130508h = 65527;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final char f130509i = 65528;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final char f130510j = 65529;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final char f130511k = 65530;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final char f130512l = 65531;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final char f130513m = 65532;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final char f130514n = 28;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final char f130515o = 29;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final char f130516p = 30;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String[] f130517q = {"\nABCDEFGHIJKLMNOPQRSTUVWXYZ\ufffa\u001c\u001d\u001e\ufffb ￼\"#$%&'()*+,-./0123456789:\ufff1\ufff2\ufff3\ufff4\ufff8", "`abcdefghijklmnopqrstuvwxyz\ufffa\u001c\u001d\u001e\ufffb{￼}~\u007f;<=>?[\\]^_ ,./:@!|￼\ufff5\ufff6￼\ufff0\ufff2\ufff3\ufff4\ufff7", "ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚ\ufffa\u001c\u001d\u001eÛÜÝÞßª¬±²³µ¹º¼½¾\u0080\u0081\u0082\u0083\u0084\u0085\u0086\u0087\u0088\u0089\ufff7 \ufff9\ufff3\ufff4\ufff8", "àáâãäåæçèéêëìíîïðñòóôõö÷øùú\ufffa\u001c\u001d\u001e\ufffbûüýþÿ¡¨«¯°´·¸»¿\u008a\u008b\u008c\u008d\u008e\u008f\u0090\u0091\u0092\u0093\u0094\ufff7 \ufff2\ufff9\ufff4\ufff8", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\ufffa￼￼\u001b\ufffb\u001c\u001d\u001e\u001f\u009f ¢£¤¥¦§©\u00ad®¶\u0095\u0096\u0097\u0098\u0099\u009a\u009b\u009c\u009d\u009e\ufff7 \ufff2\ufff3\ufff9\ufff8", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?"};

    private b() {
    }

    static e a(byte[] bArr, int i10) {
        String strH;
        StringBuilder sb2 = new StringBuilder(144);
        if (i10 == 2 || i10 == 3) {
            if (i10 == 2) {
                strH = new DecimalFormat("0000000000".substring(0, g(bArr))).format(f(bArr));
            } else {
                strH = h(bArr);
            }
            DecimalFormat decimalFormat = new DecimalFormat("000");
            String str = decimalFormat.format(c(bArr));
            String str2 = decimalFormat.format(i(bArr));
            sb2.append(e(bArr, 10, 84));
            if (sb2.toString().startsWith("[)>\u001e01\u001d")) {
                sb2.insert(9, strH + f130515o + str + f130515o + str2 + f130515o);
            } else {
                sb2.insert(0, strH + f130515o + str + f130515o + str2 + f130515o);
            }
        } else {
            int i11 = 4 | 1;
            if (i10 == 4) {
                sb2.append(e(bArr, 1, 93));
            } else if (i10 == 5) {
                sb2.append(e(bArr, 1, 77));
            }
        }
        return new e(bArr, sb2.toString(), null, String.valueOf(i10));
    }

    private static int b(int i10, byte[] bArr) {
        int i11 = i10 - 1;
        return ((1 << (5 - (i11 % 6))) & bArr[i11 / 6]) == 0 ? 0 : 1;
    }

    private static int c(byte[] bArr) {
        return d(bArr, new byte[]{53, 54, 43, 44, 45, 46, 47, 48, 37, 38});
    }

    private static int d(byte[] bArr, byte[] bArr2) {
        if (bArr2.length == 0) {
            throw new IllegalArgumentException();
        }
        int iB = 0;
        for (int i10 = 0; i10 < bArr2.length; i10++) {
            iB += b(bArr2[i10], bArr) << ((bArr2.length - i10) - 1);
        }
        return iB;
    }

    private static String e(byte[] bArr, int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        int i12 = i10;
        int i13 = -1;
        int i14 = 0;
        int i15 = 0;
        while (i12 < i10 + i11) {
            char cCharAt = f130517q[i14].charAt(bArr[i12]);
            switch (cCharAt) {
                case 65520:
                case 65521:
                case 65522:
                case 65523:
                case 65524:
                    i15 = i14;
                    i14 = cCharAt - f130501a;
                    i13 = 1;
                    break;
                case 65525:
                    i13 = 2;
                    i15 = i14;
                    i14 = 0;
                    break;
                case 65526:
                    i13 = 3;
                    i15 = i14;
                    i14 = 0;
                    break;
                case 65527:
                    i13 = -1;
                    i14 = 0;
                    break;
                case 65528:
                    i13 = -1;
                    i14 = 1;
                    break;
                case 65529:
                    i13 = -1;
                    break;
                case 65530:
                default:
                    sb2.append(cCharAt);
                    break;
                case 65531:
                    int i16 = (bArr[i12 + 1] << com.google.common.base.c.B) + (bArr[i12 + 2] << com.google.common.base.c.f116468u) + (bArr[i12 + 3] << com.google.common.base.c.f116461n) + (bArr[i12 + 4] << 6);
                    i12 += 5;
                    sb2.append(new DecimalFormat("000000000").format(i16 + bArr[i12]));
                    break;
            }
            int i17 = i13 - 1;
            if (i13 == 0) {
                i14 = i15;
            }
            i12++;
            i13 = i17;
        }
        while (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == 65532) {
            sb2.setLength(sb2.length() - 1);
        }
        return sb2.toString();
    }

    private static int f(byte[] bArr) {
        return d(bArr, new byte[]{33, 34, 35, 36, com.google.common.base.c.C, com.google.common.base.c.D, com.google.common.base.c.E, com.google.common.base.c.F, com.google.common.base.c.G, com.google.common.base.c.H, 19, com.google.common.base.c.f116471x, com.google.common.base.c.f116472y, com.google.common.base.c.f116473z, com.google.common.base.c.A, com.google.common.base.c.B, com.google.common.base.c.f116462o, com.google.common.base.c.f116463p, com.google.common.base.c.f116464q, com.google.common.base.c.f116465r, 17, com.google.common.base.c.f116468u, 7, 8, 9, 10, 11, com.google.common.base.c.f116461n, 1, 2});
    }

    private static int g(byte[] bArr) {
        return d(bArr, new byte[]{39, 40, 41, 42, com.google.common.base.c.I, 32});
    }

    private static String h(byte[] bArr) {
        String[] strArr = f130517q;
        int i10 = 0 >> 2;
        return String.valueOf(new char[]{strArr[0].charAt(d(bArr, new byte[]{39, 40, 41, 42, com.google.common.base.c.I, 32})), strArr[0].charAt(d(bArr, new byte[]{33, 34, 35, 36, com.google.common.base.c.C, com.google.common.base.c.D})), strArr[0].charAt(d(bArr, new byte[]{com.google.common.base.c.E, com.google.common.base.c.F, com.google.common.base.c.G, com.google.common.base.c.H, 19, com.google.common.base.c.f116471x})), strArr[0].charAt(d(bArr, new byte[]{com.google.common.base.c.f116472y, com.google.common.base.c.f116473z, com.google.common.base.c.A, com.google.common.base.c.B, com.google.common.base.c.f116462o, com.google.common.base.c.f116463p})), strArr[0].charAt(d(bArr, new byte[]{com.google.common.base.c.f116464q, com.google.common.base.c.f116465r, 17, com.google.common.base.c.f116468u, 7, 8})), strArr[0].charAt(d(bArr, new byte[]{9, 10, 11, com.google.common.base.c.f116461n, 1, 2}))});
    }

    private static int i(byte[] bArr) {
        return d(bArr, new byte[]{55, 56, 57, 58, 59, 60, 49, 50, 51, 52});
    }
}
