package com.google.zxing.qrcode.decoder;

import com.google.zxing.common.l;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f130893a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f130894b = 1;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f130895a;

        static {
            int[] iArr = new int[h.values().length];
            f130895a = iArr;
            try {
                iArr[h.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f130895a[h.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f130895a[h.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f130895a[h.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f130895a[h.TERMINATOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f130895a[h.FNC1_FIRST_POSITION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f130895a[h.FNC1_SECOND_POSITION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f130895a[h.STRUCTURED_APPEND.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f130895a[h.ECI.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f130895a[h.HANZI.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    private d() {
    }

    static com.google.zxing.common.e a(byte[] bArr, j jVar, f fVar, Map<com.google.zxing.e, ?> map) throws com.google.zxing.h {
        byte[] bArr2 = bArr;
        com.google.zxing.common.c cVar = new com.google.zxing.common.c(bArr2);
        StringBuilder sb2 = new StringBuilder(50);
        ArrayList arrayList = new ArrayList(1);
        int iD = -1;
        int iD2 = -1;
        boolean z10 = false;
        com.google.zxing.common.d dVarC = null;
        while (true) {
            try {
                h hVarB = cVar.a() < 4 ? h.TERMINATOR : h.b(cVar.d(4));
                int[] iArr = a.f130895a;
                switch (iArr[hVarB.ordinal()]) {
                    case 5:
                        break;
                    case 6:
                    case 7:
                        z10 = true;
                        break;
                    case 8:
                        if (cVar.a() < 16) {
                            throw com.google.zxing.h.a();
                        }
                        iD = cVar.d(8);
                        iD2 = cVar.d(8);
                        break;
                        break;
                    case 9:
                        dVarC = com.google.zxing.common.d.c(g(cVar));
                        if (dVarC == null) {
                            throw com.google.zxing.h.a();
                        }
                        break;
                        break;
                    case 10:
                        int iD3 = cVar.d(4);
                        int iD4 = cVar.d(hVarB.l(jVar));
                        if (iD3 == 1) {
                            d(cVar, sb2, iD4);
                        }
                        break;
                    default:
                        int iD5 = cVar.d(hVarB.l(jVar));
                        int i10 = iArr[hVarB.ordinal()];
                        if (i10 == 1) {
                            f(cVar, sb2, iD5);
                        } else if (i10 == 2) {
                            b(cVar, sb2, iD5, z10);
                        } else if (i10 == 3) {
                            c(cVar, sb2, iD5, dVarC, arrayList, map);
                        } else {
                            if (i10 != 4) {
                                throw com.google.zxing.h.a();
                            }
                            e(cVar, sb2, iD5);
                        }
                        break;
                }
                if (hVarB == h.TERMINATOR) {
                    String string = sb2.toString();
                    if (arrayList.isEmpty()) {
                        arrayList = null;
                    }
                    return new com.google.zxing.common.e(bArr2, string, arrayList, fVar != null ? fVar.toString() : null, iD, iD2);
                }
                bArr2 = bArr;
            } catch (IllegalArgumentException unused) {
                throw com.google.zxing.h.a();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0079  */
    private static void b(com.google.zxing.common.c cVar, StringBuilder sb2, int i10, boolean z10) throws com.google.zxing.h {
        while (i10 > 1) {
            if (cVar.a() < 11) {
                throw com.google.zxing.h.a();
            }
            int iD = cVar.d(11);
            sb2.append(h(iD / 45));
            sb2.append(h(iD % 45));
            i10 -= 2;
        }
        if (i10 == 1) {
            if (cVar.a() < 6) {
                throw com.google.zxing.h.a();
            }
            sb2.append(h(cVar.d(6)));
        }
        if (z10) {
            for (int length = sb2.length(); length < sb2.length(); length++) {
                if (sb2.charAt(length) == '%') {
                    if (length < sb2.length() - 1) {
                        int i11 = length + 1;
                        if (sb2.charAt(i11) == '%') {
                            sb2.deleteCharAt(i11);
                        } else {
                            sb2.setCharAt(length, (char) 29);
                        }
                    } else {
                        sb2.setCharAt(length, (char) 29);
                    }
                }
            }
        }
    }

    private static void c(com.google.zxing.common.c cVar, StringBuilder sb2, int i10, com.google.zxing.common.d dVar, Collection<byte[]> collection, Map<com.google.zxing.e, ?> map) throws com.google.zxing.h {
        if ((i10 << 3) > cVar.a()) {
            throw com.google.zxing.h.a();
        }
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) cVar.d(8);
        }
        try {
            sb2.append(new String(bArr, dVar == null ? l.a(bArr, map) : dVar.name()));
            collection.add(bArr);
        } catch (UnsupportedEncodingException unused) {
            throw com.google.zxing.h.a();
        }
    }

    private static void d(com.google.zxing.common.c cVar, StringBuilder sb2, int i10) throws com.google.zxing.h {
        if (i10 * 13 > cVar.a()) {
            throw com.google.zxing.h.a();
        }
        byte[] bArr = new byte[i10 * 2];
        int i11 = 0;
        while (i10 > 0) {
            int iD = cVar.d(13);
            int i12 = (iD % 96) | ((iD / 96) << 8);
            int i13 = i12 + (i12 < 959 ? 41377 : 42657);
            bArr[i11] = (byte) (i13 >> 8);
            bArr[i11 + 1] = (byte) i13;
            i11 += 2;
            i10--;
        }
        try {
            sb2.append(new String(bArr, l.f130348c));
        } catch (UnsupportedEncodingException unused) {
            throw com.google.zxing.h.a();
        }
    }

    private static void e(com.google.zxing.common.c cVar, StringBuilder sb2, int i10) throws com.google.zxing.h {
        if (i10 * 13 > cVar.a()) {
            throw com.google.zxing.h.a();
        }
        byte[] bArr = new byte[i10 * 2];
        int i11 = 0;
        while (i10 > 0) {
            int iD = cVar.d(13);
            int i12 = (iD % 192) | ((iD / 192) << 8);
            int i13 = i12 + (i12 < 7936 ? 33088 : 49472);
            bArr[i11] = (byte) (i13 >> 8);
            bArr[i11 + 1] = (byte) i13;
            i11 += 2;
            i10--;
        }
        try {
            sb2.append(new String(bArr, l.f130347b));
        } catch (UnsupportedEncodingException unused) {
            throw com.google.zxing.h.a();
        }
    }

    private static void f(com.google.zxing.common.c cVar, StringBuilder sb2, int i10) throws com.google.zxing.h {
        while (i10 >= 3) {
            if (cVar.a() < 10) {
                throw com.google.zxing.h.a();
            }
            int iD = cVar.d(10);
            if (iD >= 1000) {
                throw com.google.zxing.h.a();
            }
            sb2.append(h(iD / 100));
            sb2.append(h((iD / 10) % 10));
            sb2.append(h(iD % 10));
            i10 -= 3;
        }
        if (i10 == 2) {
            if (cVar.a() < 7) {
                throw com.google.zxing.h.a();
            }
            int iD2 = cVar.d(7);
            if (iD2 >= 100) {
                throw com.google.zxing.h.a();
            }
            sb2.append(h(iD2 / 10));
            sb2.append(h(iD2 % 10));
            return;
        }
        if (i10 == 1) {
            if (cVar.a() < 4) {
                throw com.google.zxing.h.a();
            }
            int iD3 = cVar.d(4);
            if (iD3 >= 10) {
                throw com.google.zxing.h.a();
            }
            sb2.append(h(iD3));
        }
    }

    private static int g(com.google.zxing.common.c cVar) throws com.google.zxing.h {
        int iD = cVar.d(8);
        if ((iD & 128) == 0) {
            return iD & 127;
        }
        if ((iD & 192) == 128) {
            return cVar.d(8) | ((iD & 63) << 8);
        }
        if ((iD & 224) == 192) {
            return cVar.d(16) | ((iD & 31) << 16);
        }
        throw com.google.zxing.h.a();
    }

    private static char h(int i10) throws com.google.zxing.h {
        char[] cArr = f130893a;
        if (i10 < cArr.length) {
            return cArr[i10];
        }
        throw com.google.zxing.h.a();
    }
}
