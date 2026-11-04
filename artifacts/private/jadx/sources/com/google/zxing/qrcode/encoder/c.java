package com.google.zxing.qrcode.encoder;

import com.google.zxing.g;
import com.google.zxing.qrcode.decoder.h;
import com.google.zxing.qrcode.decoder.j;
import com.google.zxing.w;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f130964a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String f130965b = "ISO-8859-1";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f130966a;

        static {
            int[] iArr = new int[h.values().length];
            f130966a = iArr;
            try {
                iArr[h.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int i10 = 7 | 2;
                f130966a[h.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f130966a[h.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f130966a[h.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private c() {
    }

    static void a(String str, com.google.zxing.common.a aVar, String str2) throws w {
        try {
            for (byte b10 : str.getBytes(str2)) {
                aVar.c(b10, 8);
            }
        } catch (UnsupportedEncodingException e10) {
            throw new w(e10);
        }
    }

    static void b(CharSequence charSequence, com.google.zxing.common.a aVar) throws w {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            int iR = r(charSequence.charAt(i10));
            if (iR == -1) {
                throw new w();
            }
            int i11 = i10 + 1;
            if (i11 < length) {
                int iR2 = r(charSequence.charAt(i11));
                if (iR2 == -1) {
                    throw new w();
                }
                aVar.c((iR * 45) + iR2, 11);
                i10 += 2;
            } else {
                aVar.c(iR, 6);
                i10 = i11;
            }
        }
    }

    static void c(String str, h hVar, com.google.zxing.common.a aVar, String str2) throws w {
        int i10 = a.f130966a[hVar.ordinal()];
        if (i10 == 1) {
            h(str, aVar);
            return;
        }
        if (i10 == 2) {
            b(str, aVar);
        } else if (i10 == 3) {
            a(str, aVar, str2);
        } else {
            if (i10 != 4) {
                throw new w("Invalid mode: ".concat(String.valueOf(hVar)));
            }
            e(str, aVar);
        }
    }

    private static void d(com.google.zxing.common.d dVar, com.google.zxing.common.a aVar) {
        aVar.c(h.ECI.k(), 4);
        aVar.c(dVar.k(), 8);
    }

    static void e(String str, com.google.zxing.common.a aVar) throws w {
        int i10;
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            for (int i11 = 0; i11 < length; i11 += 2) {
                int i12 = ((bytes[i11] & 255) << 8) | (bytes[i11 + 1] & 255);
                int i13 = 33088;
                if (i12 >= 33088 && i12 <= 40956) {
                    i10 = i12 - i13;
                } else if (i12 < 57408 || i12 > 60351) {
                    i10 = -1;
                } else {
                    i13 = 49472;
                    i10 = i12 - i13;
                }
                if (i10 == -1) {
                    throw new w("Invalid byte sequence");
                }
                aVar.c(((i10 >> 8) * 192) + (i10 & 255), 13);
            }
        } catch (UnsupportedEncodingException e10) {
            throw new w(e10);
        }
    }

    static void f(int i10, j jVar, h hVar, com.google.zxing.common.a aVar) throws w {
        int iL = hVar.l(jVar);
        int i11 = 1 << iL;
        if (i10 < i11) {
            aVar.c(i10, iL);
            return;
        }
        throw new w(i10 + " is bigger than " + (i11 - 1));
    }

    static void g(h hVar, com.google.zxing.common.a aVar) {
        aVar.c(hVar.k(), 4);
    }

    static void h(CharSequence charSequence, com.google.zxing.common.a aVar) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            int iCharAt = charSequence.charAt(i10) - '0';
            int i11 = i10 + 2;
            if (i11 < length) {
                aVar.c((iCharAt * 100) + ((charSequence.charAt(i10 + 1) - '0') * 10) + (charSequence.charAt(i11) - '0'), 10);
                i10 += 3;
            } else {
                i10++;
                if (i10 < length) {
                    aVar.c((iCharAt * 10) + (charSequence.charAt(i10) - '0'), 7);
                    i10 = i11;
                } else {
                    aVar.c(iCharAt, 4);
                }
            }
        }
    }

    private static int i(h hVar, com.google.zxing.common.a aVar, com.google.zxing.common.a aVar2, j jVar) {
        return aVar.l() + hVar.l(jVar) + aVar2.l();
    }

    private static int j(b bVar) {
        return d.a(bVar) + d.c(bVar) + d.d(bVar) + d.e(bVar);
    }

    private static int k(com.google.zxing.common.a aVar, com.google.zxing.qrcode.decoder.f fVar, j jVar, b bVar) throws w {
        int i10 = Integer.MAX_VALUE;
        int i11 = -1;
        for (int i12 = 0; i12 < 8; i12++) {
            e.a(aVar, fVar, jVar, i12, bVar);
            int iJ = j(bVar);
            if (iJ < i10) {
                i11 = i12;
                i10 = iJ;
            }
        }
        return i11;
    }

    public static h l(String str) {
        return m(str, null);
    }

    private static h m(String str, String str2) {
        if ("Shift_JIS".equals(str2) && u(str)) {
            return h.KANJI;
        }
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt >= '0' && cCharAt <= '9') {
                z11 = true;
            } else {
                if (r(cCharAt) == -1) {
                    return h.BYTE;
                }
                z10 = true;
            }
        }
        if (z10) {
            return h.ALPHANUMERIC;
        }
        return z11 ? h.NUMERIC : h.BYTE;
    }

    private static j n(int i10, com.google.zxing.qrcode.decoder.f fVar) throws w {
        for (int i11 = 1; i11 <= 40; i11++) {
            j jVarI = j.i(i11);
            if (x(i10, jVarI, fVar)) {
                return jVarI;
            }
        }
        throw new w("Data too big");
    }

    public static f o(String str, com.google.zxing.qrcode.decoder.f fVar) throws w {
        return p(str, fVar, null);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a5  */
    public static f p(String str, com.google.zxing.qrcode.decoder.f fVar, Map<g, ?> map) throws w {
        j jVarV;
        com.google.zxing.common.d dVarB;
        boolean z10 = map != null && map.containsKey(g.CHARACTER_SET);
        String string = z10 ? map.get(g.CHARACTER_SET).toString() : "ISO-8859-1";
        h hVarM = m(str, string);
        com.google.zxing.common.a aVar = new com.google.zxing.common.a();
        h hVar = h.BYTE;
        if (hVarM == hVar && z10 && (dVarB = com.google.zxing.common.d.b(string)) != null) {
            d(dVarB, aVar);
        }
        if (map != null) {
            g gVar = g.GS1_FORMAT;
            if (map.containsKey(gVar) && Boolean.valueOf(map.get(gVar).toString()).booleanValue()) {
                g(h.FNC1_FIRST_POSITION, aVar);
            }
        }
        g(hVarM, aVar);
        com.google.zxing.common.a aVar2 = new com.google.zxing.common.a();
        c(str, hVarM, aVar2, string);
        if (map != null) {
            g gVar2 = g.QR_VERSION;
            if (map.containsKey(gVar2)) {
                jVarV = j.i(Integer.parseInt(map.get(gVar2).toString()));
                if (!x(i(hVarM, aVar, aVar2, jVarV), jVarV, fVar)) {
                    throw new w("Data too big for requested version");
                }
            } else {
                jVarV = v(fVar, hVarM, aVar, aVar2);
            }
        } else {
            jVarV = v(fVar, hVarM, aVar, aVar2);
        }
        com.google.zxing.common.a aVar3 = new com.google.zxing.common.a();
        aVar3.b(aVar);
        f(hVarM == hVar ? aVar2.n() : str.length(), jVarV, hVarM, aVar3);
        aVar3.b(aVar2);
        j.b bVarF = jVarV.f(fVar);
        int iH = jVarV.h() - bVarF.d();
        w(iH, aVar3);
        com.google.zxing.common.a aVarT = t(aVar3, jVarV.h(), iH, bVarF.c());
        f fVar2 = new f();
        fVar2.g(fVar);
        fVar2.j(hVarM);
        fVar2.k(jVarV);
        int iE = jVarV.e();
        b bVar = new b(iE, iE);
        int iK = k(aVarT, fVar, jVarV, bVar);
        fVar2.h(iK);
        e.a(aVarT, fVar, jVarV, iK, bVar);
        fVar2.i(bVar);
        return fVar2;
    }

    static byte[] q(byte[] bArr, int i10) {
        int length = bArr.length;
        int[] iArr = new int[length + i10];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = bArr[i11] & 255;
        }
        new com.google.zxing.common.reedsolomon.d(com.google.zxing.common.reedsolomon.a.f130357l).b(iArr, i10);
        byte[] bArr2 = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr2[i12] = (byte) iArr[length + i12];
        }
        return bArr2;
    }

    static int r(int i10) {
        int[] iArr = f130964a;
        if (i10 < iArr.length) {
            return iArr[i10];
        }
        return -1;
    }

    static void s(int i10, int i11, int i12, int i13, int[] iArr, int[] iArr2) throws w {
        if (i13 >= i12) {
            throw new w("Block ID too large");
        }
        int i14 = i10 % i12;
        int i15 = i12 - i14;
        int i16 = i10 / i12;
        int i17 = i16 + 1;
        int i18 = i11 / i12;
        int i19 = i18 + 1;
        int i20 = i16 - i18;
        int i21 = i17 - i19;
        if (i20 != i21) {
            throw new w("EC bytes mismatch");
        }
        if (i12 != i15 + i14) {
            throw new w("RS blocks mismatch");
        }
        if (i10 != ((i18 + i20) * i15) + ((i19 + i21) * i14)) {
            throw new w("Total bytes mismatch");
        }
        if (i13 < i15) {
            iArr[0] = i18;
            iArr2[0] = i20;
        } else {
            iArr[0] = i19;
            iArr2[0] = i21;
        }
    }

    static com.google.zxing.common.a t(com.google.zxing.common.a aVar, int i10, int i11, int i12) throws w {
        if (aVar.n() != i11) {
            throw new w("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(i12);
        int i13 = 0;
        int i14 = 0;
        int iMax = 0;
        int iMax2 = 0;
        while (i13 < i12) {
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            int i15 = i10;
            int i16 = i11;
            int i17 = i12;
            s(i15, i16, i17, i13, iArr, iArr2);
            int i18 = iArr[0];
            byte[] bArr = new byte[i18];
            aVar.u(i14 << 3, bArr, 0, i18);
            byte[] bArrQ = q(bArr, iArr2[0]);
            arrayList.add(new com.google.zxing.qrcode.encoder.a(bArr, bArrQ));
            iMax = Math.max(iMax, i18);
            iMax2 = Math.max(iMax2, bArrQ.length);
            i14 += iArr[0];
            i13++;
            i10 = i15;
            i11 = i16;
            i12 = i17;
        }
        int i19 = i10;
        if (i11 != i14) {
            throw new w("Data bytes does not match offset");
        }
        com.google.zxing.common.a aVar2 = new com.google.zxing.common.a();
        for (int i20 = 0; i20 < iMax; i20++) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] bArrA = ((com.google.zxing.qrcode.encoder.a) it.next()).a();
                if (i20 < bArrA.length) {
                    aVar2.c(bArrA[i20], 8);
                }
            }
        }
        for (int i21 = 0; i21 < iMax2; i21++) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] bArrB = ((com.google.zxing.qrcode.encoder.a) it2.next()).b();
                if (i21 < bArrB.length) {
                    aVar2.c(bArrB[i21], 8);
                }
            }
        }
        if (i19 == aVar2.n()) {
            return aVar2;
        }
        throw new w("Interleaving error: " + i19 + " and " + aVar2.n() + " differ.");
    }

    private static boolean u(String str) {
        int i10;
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (0; i10 < length; i10 + 2) {
                int i11 = bytes[i10] & 255;
                i10 = ((i11 >= 129 && i11 <= 159) || (i11 >= 224 && i11 <= 235)) ? i10 + 2 : 0;
                return false;
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    private static j v(com.google.zxing.qrcode.decoder.f fVar, h hVar, com.google.zxing.common.a aVar, com.google.zxing.common.a aVar2) throws w {
        return n(i(hVar, aVar, aVar2, n(i(hVar, aVar, aVar2, j.i(1)), fVar)), fVar);
    }

    static void w(int i10, com.google.zxing.common.a aVar) throws w {
        int i11 = i10 << 3;
        if (aVar.l() > i11) {
            throw new w("data bits cannot fit in the QR Code" + aVar.l() + " > " + i11);
        }
        for (int i12 = 0; i12 < 4 && aVar.l() < i11; i12++) {
            aVar.a(false);
        }
        int iL = aVar.l() & 7;
        if (iL > 0) {
            while (iL < 8) {
                aVar.a(false);
                iL++;
            }
        }
        int iN = i10 - aVar.n();
        for (int i13 = 0; i13 < iN; i13++) {
            aVar.c((i13 & 1) == 0 ? 236 : 17, 8);
        }
        if (aVar.l() != i11) {
            throw new w("Bits size does not equal capacity");
        }
    }

    private static boolean x(int i10, j jVar, com.google.zxing.qrcode.decoder.f fVar) {
        return jVar.h() - jVar.f(fVar).d() >= (i10 + 7) / 8;
    }
}
