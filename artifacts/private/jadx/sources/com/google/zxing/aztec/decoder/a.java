package com.google.zxing.aztec.decoder;

import androidx.media3.exoplayer.upstream.h;
import com.devtodev.core.data.consts.RequestParams;
import com.facebook.appevents.p;
import com.google.zxing.common.reedsolomon.c;
import com.google.zxing.common.reedsolomon.e;
import com.planner5d.library.engine.input.f;
import java.util.Arrays;
import org.apache.commons.lang3.z;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f130093b = {"CTRL_PS", " ", androidx.exifinterface.media.a.X4, "B", "C", "D", androidx.exifinterface.media.a.T4, "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", androidx.exifinterface.media.a.S4, androidx.exifinterface.media.a.f51379e5, "U", androidx.exifinterface.media.a.Y4, androidx.exifinterface.media.a.U4, org.locationtech.jts.io.gml2.a.f338503u, org.locationtech.jts.io.gml2.a.f338504v, org.locationtech.jts.io.gml2.a.f338505w, "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f130094c = {"CTRL_PS", " ", h.f65998l, "b", "c", "d", "e", RequestParams.F, "g", h.f65993g, h.f65997k, "j", "k", h.f65996j, h.f66001o, "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f130095d = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", z.f337565d, "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String[] f130096e = {"", z.f337565d, "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", org.slf4j.h.f339615a3, ",", "-", ".", "/", ":", ";", "<", "=", ">", com.planner5d.library.model.payments.a.f222474i, "[", "]", "{", "}", "CTRL_UL"};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String[] f130097f = {"CTRL_PS", " ", p.f99189d0, "1", "2", androidx.exifinterface.media.a.f51345a5, "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private v9.a f130098a;

    /* JADX INFO: renamed from: com.google.zxing.aztec.decoder.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C1430a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f130099a;

        static {
            int[] iArr = new int[b.values().length];
            f130099a = iArr;
            try {
                iArr[b.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f130099a[b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f130099a[b.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f130099a[b.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f130099a[b.DIGIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private enum b {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY;

        static {
            int i10 = 0 & 2;
        }
    }

    static byte[] a(boolean[] zArr) {
        int length = (zArr.length + 7) / 8;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = i(zArr, i10 << 3);
        }
        return bArr;
    }

    private boolean[] b(boolean[] zArr) throws com.google.zxing.h {
        int i10;
        com.google.zxing.common.reedsolomon.a aVar;
        if (this.f130098a.d() <= 2) {
            aVar = com.google.zxing.common.reedsolomon.a.f130355j;
            i10 = 6;
        } else {
            i10 = 8;
            if (this.f130098a.d() <= 8) {
                aVar = com.google.zxing.common.reedsolomon.a.f130359n;
            } else if (this.f130098a.d() <= 22) {
                aVar = com.google.zxing.common.reedsolomon.a.f130354i;
                i10 = 10;
            } else {
                aVar = com.google.zxing.common.reedsolomon.a.f130353h;
                i10 = 12;
            }
        }
        int iC = this.f130098a.c();
        int length = zArr.length / i10;
        if (length < iC) {
            throw com.google.zxing.h.a();
        }
        int length2 = zArr.length % i10;
        int[] iArr = new int[length];
        int i11 = 0;
        while (i11 < length) {
            iArr[i11] = j(zArr, length2, i10);
            i11++;
            length2 += i10;
        }
        try {
            new c(aVar).a(iArr, length - iC);
            int i12 = 1 << i10;
            int i13 = i12 - 1;
            int i14 = 0;
            for (int i15 = 0; i15 < iC; i15++) {
                int i16 = iArr[i15];
                if (i16 == 0 || i16 == i13) {
                    throw com.google.zxing.h.a();
                }
                if (i16 == 1 || i16 == i12 - 2) {
                    i14++;
                }
            }
            boolean[] zArr2 = new boolean[(iC * i10) - i14];
            int i17 = 0;
            for (int i18 = 0; i18 < iC; i18++) {
                int i19 = iArr[i18];
                if (i19 == 1 || i19 == i12 - 2) {
                    Arrays.fill(zArr2, i17, (i17 + i10) - 1, i19 > 1);
                    i17 += i10 - 1;
                } else {
                    int i20 = i10 - 1;
                    while (i20 >= 0) {
                        int i21 = i17 + 1;
                        zArr2[i17] = ((1 << i20) & i19) != 0;
                        i20--;
                        i17 = i21;
                    }
                }
            }
            return zArr2;
        } catch (e e10) {
            throw com.google.zxing.h.b(e10);
        }
    }

    private boolean[] d(com.google.zxing.common.b bVar) {
        boolean zE = this.f130098a.e();
        int iD = this.f130098a.d();
        int i10 = (zE ? 11 : 14) + (iD << 2);
        int[] iArr = new int[i10];
        boolean[] zArr = new boolean[k(iD, zE)];
        int i11 = 2;
        if (zE) {
            for (int i12 = 0; i12 < i10; i12++) {
                iArr[i12] = i12;
            }
        } else {
            int i13 = i10 / 2;
            int i14 = ((i10 + 1) + (((i13 - 1) / 15) * 2)) / 2;
            for (int i15 = 0; i15 < i13; i15++) {
                int i16 = (i15 / 15) + i15;
                iArr[(i13 - i15) - 1] = (i14 - i16) - 1;
                iArr[i13 + i15] = i16 + i14 + 1;
            }
        }
        int i17 = 0;
        int i18 = 0;
        while (i17 < iD) {
            int i19 = ((iD - i17) << i11) + (zE ? 9 : 12);
            int i20 = i17 << 1;
            int i21 = (i10 - 1) - i20;
            int i22 = 0;
            while (i22 < i19) {
                int i23 = i22 << 1;
                int i24 = 0;
                while (i24 < i11) {
                    int i25 = i20 + i24;
                    int i26 = i20 + i22;
                    zArr[i18 + i23 + i24] = bVar.e(iArr[i25], iArr[i26]);
                    int i27 = i21 - i24;
                    zArr[(i19 * 2) + i18 + i23 + i24] = bVar.e(iArr[i26], iArr[i27]);
                    int i28 = i21 - i22;
                    zArr[(i19 * 4) + i18 + i23 + i24] = bVar.e(iArr[i27], iArr[i28]);
                    zArr[(i19 * 6) + i18 + i23 + i24] = bVar.e(iArr[i28], iArr[i25]);
                    i24++;
                    iD = iD;
                    i11 = 2;
                }
                i22++;
                i11 = 2;
            }
            i18 += i19 << 3;
            i17++;
            iD = iD;
            i11 = 2;
        }
        return zArr;
    }

    private static String e(b bVar, int i10) {
        int i11 = C1430a.f130099a[bVar.ordinal()];
        if (i11 == 1) {
            return f130093b[i10];
        }
        if (i11 == 2) {
            return f130094c[i10];
        }
        if (i11 == 3) {
            return f130095d[i10];
        }
        if (i11 == 4) {
            return f130096e[i10];
        }
        if (i11 == 5) {
            return f130097f[i10];
        }
        throw new IllegalStateException("Bad table");
    }

    private static String f(boolean[] zArr) {
        int length = zArr.length;
        b bVar = b.UPPER;
        StringBuilder sb2 = new StringBuilder(20);
        b bVarG = bVar;
        int i10 = 0;
        while (i10 < length) {
            if (bVar != b.BINARY) {
                int i11 = bVar == b.DIGIT ? 4 : 5;
                if (length - i10 < i11) {
                    break;
                }
                int iJ = j(zArr, i10, i11);
                i10 += i11;
                String strE = e(bVar, iJ);
                if (strE.startsWith("CTRL_")) {
                    bVarG = g(strE.charAt(5));
                    if (strE.charAt(6) != 'L') {
                        bVarG = bVar;
                        bVar = bVarG;
                    }
                } else {
                    sb2.append(strE);
                }
                bVar = bVarG;
            } else {
                if (length - i10 < 5) {
                    break;
                }
                int iJ2 = j(zArr, i10, 5);
                int i12 = i10 + 5;
                if (iJ2 == 0) {
                    if (length - i12 < 11) {
                        break;
                    }
                    iJ2 = j(zArr, i12, 11) + 31;
                    i12 = i10 + 16;
                }
                int i13 = 0;
                while (true) {
                    if (i13 >= iJ2) {
                        i10 = i12;
                        break;
                    }
                    if (length - i12 < 8) {
                        i10 = length;
                        break;
                    }
                    sb2.append((char) j(zArr, i12, 8));
                    i12 += 8;
                    i13++;
                }
                bVar = bVarG;
            }
        }
        return sb2.toString();
    }

    private static b g(char c10) {
        if (c10 == 'B') {
            return b.BINARY;
        }
        if (c10 == 'D') {
            return b.DIGIT;
        }
        if (c10 == 'P') {
            return b.PUNCT;
        }
        if (c10 != 'L') {
            return c10 != 'M' ? b.UPPER : b.MIXED;
        }
        return b.LOWER;
    }

    public static String h(boolean[] zArr) {
        return f(zArr);
    }

    private static byte i(boolean[] zArr, int i10) {
        int length = zArr.length - i10;
        return (byte) (length >= 8 ? j(zArr, i10, 8) : j(zArr, i10, length) << (8 - length));
    }

    private static int j(boolean[] zArr, int i10, int i11) {
        int i12 = 0;
        for (int i13 = i10; i13 < i10 + i11; i13++) {
            i12 <<= 1;
            if (zArr[i13]) {
                i12 |= 1;
            }
        }
        return i12;
    }

    private static int k(int i10, boolean z10) {
        return ((z10 ? 88 : f.b.B) + (i10 << 4)) * i10;
    }

    public com.google.zxing.common.e c(v9.a aVar) throws com.google.zxing.h {
        this.f130098a = aVar;
        boolean[] zArrB = b(d(aVar.a()));
        com.google.zxing.common.e eVar = new com.google.zxing.common.e(a(zArrB), f(zArrB), null, null);
        eVar.n(zArrB.length);
        return eVar;
    }
}
