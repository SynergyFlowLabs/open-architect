package com.google.zxing.common;

import com.google.common.primitives.t;
import java.nio.charset.Charset;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f130346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f130347b = "SJIS";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f130348c = "GB2312";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f130349d = "EUC_JP";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f130350e = "UTF8";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f130351f = "ISO8859_1";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f130352g;

    static {
        String strName = Charset.defaultCharset().name();
        f130346a = strName;
        f130352g = f130347b.equalsIgnoreCase(strName) || f130349d.equalsIgnoreCase(strName);
    }

    private l() {
    }

    /* JADX WARN: Code duplicated, block: B:71:0x00c4  */
    public static String a(byte[] bArr, Map<com.google.zxing.e, ?> map) {
        boolean z10;
        byte[] bArr2 = bArr;
        if (map != null) {
            com.google.zxing.e eVar = com.google.zxing.e.CHARACTER_SET;
            if (map.containsKey(eVar)) {
                return map.get(eVar).toString();
            }
        }
        int length = bArr2.length;
        boolean z11 = true;
        int i10 = 0;
        boolean z12 = bArr2.length > 3 && bArr2[0] == -17 && bArr2[1] == -69 && bArr2[2] == -65;
        boolean z13 = true;
        boolean z14 = true;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        while (i12 < length && (z11 || z13 || z14)) {
            byte b10 = bArr2[i12];
            int i22 = b10 & 255;
            if (z14) {
                if (i13 <= 0) {
                    z10 = z12;
                    if ((b10 & 128) != 0) {
                        if ((b10 & t.f119782a) != 0) {
                            int i23 = i13 + 1;
                            if ((b10 & 32) == 0) {
                                i15++;
                            } else {
                                i23 = i13 + 2;
                                if ((b10 & com.google.common.base.c.f116465r) == 0) {
                                    i16++;
                                } else {
                                    i13 += 3;
                                    if ((b10 & 8) == 0) {
                                        i17++;
                                    }
                                }
                            }
                            i13 = i23;
                        }
                    }
                } else if ((b10 & 128) != 0) {
                    i13--;
                    z10 = z12;
                } else {
                    z10 = z12;
                }
                z14 = false;
            } else {
                z10 = z12;
            }
            if (z11) {
                if (i22 > 127 && i22 < 160) {
                    z11 = false;
                } else if (i22 > 159 && (i22 < 192 || i22 == 215 || i22 == 247)) {
                    i19++;
                }
            }
            if (z13) {
                if (i14 > 0) {
                    if (i22 < 64 || i22 == 127 || i22 > 252) {
                        z13 = false;
                    } else {
                        i14--;
                    }
                } else if (i22 == 128 || i22 == 160 || i22 > 239) {
                    z13 = false;
                } else if (i22 <= 160 || i22 >= 224) {
                    if (i22 > 127) {
                        i14++;
                        int i24 = i20 + 1;
                        if (i24 > i10) {
                            i10 = i24;
                            i20 = i10;
                        } else {
                            i20 = i24;
                        }
                    } else {
                        i20 = 0;
                    }
                    i21 = 0;
                } else {
                    i11++;
                    int i25 = i21 + 1;
                    if (i25 > i18) {
                        i18 = i25;
                        i21 = i18;
                    } else {
                        i21 = i25;
                    }
                    i20 = 0;
                }
            }
            i12++;
            bArr2 = bArr;
            z12 = z10;
        }
        boolean z15 = z12;
        if (z14 && i13 > 0) {
            z14 = false;
        }
        if (z13 && i14 > 0) {
            z13 = false;
        }
        if (z14 && (z15 || i15 + i16 + i17 > 0)) {
            return f130350e;
        }
        if (z13 && (f130352g || i18 >= 3 || i10 >= 3)) {
            return f130347b;
        }
        if (z11 && z13) {
            return (!(i18 == 2 && i11 == 2) && i19 * 10 < length) ? f130351f : f130347b;
        }
        if (z11) {
            return f130351f;
        }
        if (z13) {
            return f130347b;
        }
        return z14 ? f130350e : f130346a;
    }
}
