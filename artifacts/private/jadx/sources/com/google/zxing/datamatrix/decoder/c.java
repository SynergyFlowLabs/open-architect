package com.google.zxing.datamatrix.decoder;

import com.google.zxing.h;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.text.b0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import ni.f;
import org.apache.commons.lang3.k;
import org.locationtech.jts.geom.l;

/* JADX INFO: loaded from: classes5.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f130379a = {'*', '*', '*', ' ', l.f338160j, l.f338161k, l.f338162l, '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', l.f338157g, 'G', 'H', 'I', 'J', 'K', 'L', f.f333370g, 'N', 'O', 'P', 'Q', 'R', 'S', l.f338158h, 'U', 'V', 'W', 'X', f.f333371h, 'Z'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char[] f130380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final char[] f130381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final char[] f130382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final char[] f130383e;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f130384a;

        static {
            int[] iArr = new int[b.values().length];
            f130384a = iArr;
            try {
                iArr[b.C40_ENCODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f130384a[b.TEXT_ENCODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f130384a[b.ANSIX12_ENCODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f130384a[b.EDIFACT_ENCODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f130384a[b.BASE256_ENCODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private enum b {
        PAD_ENCODE,
        ASCII_ENCODE,
        C40_ENCODE,
        TEXT_ENCODE,
        ANSIX12_ENCODE,
        EDIFACT_ENCODE,
        BASE256_ENCODE
    }

    static {
        char[] cArr = {'!', '\"', '#', '$', '%', b0.f313279d, '\'', '(', ')', '*', '+', AbstractJsonLexerKt.COMMA, org.apache.commons.codec.language.l.f335457d, '.', '/', AbstractJsonLexerKt.COLON, ';', b0.f313280e, '=', b0.f313281f, '?', '@', AbstractJsonLexerKt.BEGIN_LIST, '\\', AbstractJsonLexerKt.END_LIST, '^', '_'};
        f130380b = cArr;
        f130381c = new char[]{'*', '*', '*', ' ', l.f338160j, l.f338161k, l.f338162l, '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', f.f333369f, 'e', 'f', 'g', f.f333368e, 'i', 'j', 'k', 'l', f.f333367d, 'n', 'o', 'p', 'q', 'r', f.f333366c, 't', AbstractJsonLexerKt.UNICODE_ESC, 'v', 'w', 'x', 'y', f.f333372i};
        f130382d = cArr;
        f130383e = new char[]{'`', 'A', 'B', 'C', 'D', 'E', l.f338157g, 'G', 'H', 'I', 'J', 'K', 'L', f.f333370g, 'N', 'O', 'P', 'Q', 'R', 'S', l.f338158h, 'U', 'V', 'W', 'X', f.f333371h, 'Z', AbstractJsonLexerKt.BEGIN_OBJ, '|', AbstractJsonLexerKt.END_OBJ, '~', com.google.common.base.c.N};
    }

    private c() {
    }

    static com.google.zxing.common.e a(byte[] bArr) throws h {
        com.google.zxing.common.c cVar = new com.google.zxing.common.c(bArr);
        StringBuilder sb2 = new StringBuilder(100);
        StringBuilder sb3 = new StringBuilder(0);
        ArrayList arrayList = new ArrayList(1);
        b bVarC = b.ASCII_ENCODE;
        do {
            b bVar = b.ASCII_ENCODE;
            if (bVarC == bVar) {
                bVarC = c(cVar, sb2, sb3);
            } else {
                int i10 = a.f130384a[bVarC.ordinal()];
                if (i10 == 1) {
                    e(cVar, sb2);
                } else if (i10 == 2) {
                    g(cVar, sb2);
                } else if (i10 != 3) {
                    int i11 = 1 & 4;
                    if (i10 == 4) {
                        f(cVar, sb2);
                    } else {
                        if (i10 != 5) {
                            throw h.a();
                        }
                        d(cVar, sb2, arrayList);
                    }
                } else {
                    b(cVar, sb2);
                }
                bVarC = bVar;
            }
            if (bVarC == b.PAD_ENCODE) {
                break;
            }
        } while (cVar.a() > 0);
        if (sb3.length() > 0) {
            sb2.append((CharSequence) sb3);
        }
        String string = sb2.toString();
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        return new com.google.zxing.common.e(bArr, string, arrayList, null);
    }

    private static void b(com.google.zxing.common.c cVar, StringBuilder sb2) throws h {
        int iD;
        int[] iArr = new int[3];
        while (cVar.a() != 8 && (iD = cVar.d(8)) != 254) {
            h(iD, cVar.d(8), iArr);
            for (int i10 = 0; i10 < 3; i10++) {
                int i11 = iArr[i10];
                if (i11 == 0) {
                    sb2.append(k.f337188d);
                } else if (i11 == 1) {
                    sb2.append('*');
                } else if (i11 == 2) {
                    sb2.append(b0.f313281f);
                } else if (i11 == 3) {
                    sb2.append(' ');
                } else if (i11 < 14) {
                    sb2.append((char) (i11 + 44));
                } else {
                    if (i11 >= 40) {
                        throw h.a();
                    }
                    sb2.append((char) (i11 + 51));
                }
            }
            if (cVar.a() <= 0) {
                break;
            }
        }
    }

    private static b c(com.google.zxing.common.c cVar, StringBuilder sb2, StringBuilder sb3) throws h {
        boolean z10 = false;
        do {
            int iD = cVar.d(8);
            if (iD == 0) {
                throw h.a();
            }
            if (iD > 128) {
                if (iD != 129) {
                    if (iD > 229) {
                        switch (iD) {
                            case 230:
                                return b.C40_ENCODE;
                            case 231:
                                return b.BASE256_ENCODE;
                            case 232:
                                sb2.append((char) 29);
                                break;
                            case 233:
                            case 234:
                            case 241:
                                break;
                            case 235:
                                z10 = true;
                                break;
                            case 236:
                                sb2.append("[)>\u001e05\u001d");
                                sb3.insert(0, "\u001e\u0004");
                                break;
                            case 237:
                                sb2.append("[)>\u001e06\u001d");
                                sb3.insert(0, "\u001e\u0004");
                                break;
                            case 238:
                                return b.ANSIX12_ENCODE;
                            case 239:
                                return b.TEXT_ENCODE;
                            case 240:
                                return b.EDIFACT_ENCODE;
                            default:
                                if (iD != 254 || cVar.a() != 0) {
                                    throw h.a();
                                }
                                break;
                        }
                    } else {
                        int i10 = iD - 130;
                        if (i10 < 10) {
                            sb2.append(l.f338160j);
                        }
                        sb2.append(i10);
                    }
                } else {
                    return b.PAD_ENCODE;
                }
            } else {
                if (z10) {
                    iD += 128;
                }
                sb2.append((char) (iD - 1));
                return b.ASCII_ENCODE;
            }
        } while (cVar.a() > 0);
        return b.ASCII_ENCODE;
    }

    private static void d(com.google.zxing.common.c cVar, StringBuilder sb2, Collection<byte[]> collection) throws h {
        int iC = cVar.c();
        int i10 = iC + 2;
        int i11 = i(cVar.d(8), iC + 1);
        if (i11 == 0) {
            i11 = cVar.a() / 8;
        } else if (i11 >= 250) {
            i11 = ((i11 - 249) * 250) + i(cVar.d(8), i10);
            i10 = iC + 3;
        }
        if (i11 < 0) {
            throw h.a();
        }
        byte[] bArr = new byte[i11];
        int i12 = 0;
        while (i12 < i11) {
            if (cVar.a() < 8) {
                throw h.a();
            }
            bArr[i12] = (byte) i(cVar.d(8), i10);
            i12++;
            i10++;
        }
        collection.add(bArr);
        try {
            sb2.append(new String(bArr, "ISO8859_1"));
        } catch (UnsupportedEncodingException e10) {
            throw new IllegalStateException("Platform does not support required encoding: ".concat(String.valueOf(e10)));
        }
    }

    private static void e(com.google.zxing.common.c cVar, StringBuilder sb2) throws h {
        int iD;
        int[] iArr = new int[3];
        boolean z10 = false;
        int i10 = 0;
        while (cVar.a() != 8 && (iD = cVar.d(8)) != 254) {
            h(iD, cVar.d(8), iArr);
            for (int i11 = 0; i11 < 3; i11++) {
                int i12 = iArr[i11];
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            char[] cArr = f130380b;
                            if (i12 < cArr.length) {
                                char c10 = cArr[i12];
                                if (z10) {
                                    sb2.append((char) (c10 + 128));
                                    z10 = false;
                                } else {
                                    sb2.append(c10);
                                }
                            } else if (i12 == 27) {
                                sb2.append((char) 29);
                            } else {
                                if (i12 != 30) {
                                    throw h.a();
                                }
                                z10 = true;
                            }
                        } else {
                            if (i10 != 3) {
                                throw h.a();
                            }
                            if (z10) {
                                sb2.append((char) (i12 + 224));
                                z10 = false;
                            } else {
                                sb2.append((char) (i12 + 96));
                            }
                        }
                    } else if (z10) {
                        sb2.append((char) (i12 + 128));
                        z10 = false;
                    } else {
                        sb2.append((char) i12);
                    }
                    i10 = 0;
                } else if (i12 < 3) {
                    i10 = i12 + 1;
                } else {
                    char[] cArr2 = f130379a;
                    if (i12 >= cArr2.length) {
                        throw h.a();
                    }
                    char c11 = cArr2[i12];
                    if (z10) {
                        sb2.append((char) (c11 + 128));
                        z10 = false;
                    } else {
                        sb2.append(c11);
                    }
                }
            }
            if (cVar.a() <= 0) {
                break;
            }
        }
    }

    private static void f(com.google.zxing.common.c cVar, StringBuilder sb2) {
        loop0: while (cVar.a() > 16) {
            for (int i10 = 0; i10 < 4; i10++) {
                int iD = cVar.d(6);
                if (iD == 31) {
                    int iB = 8 - cVar.b();
                    if (iB == 8) {
                        break loop0;
                    }
                    cVar.d(iB);
                    return;
                }
                if ((iD & 32) == 0) {
                    iD |= 64;
                }
                sb2.append((char) iD);
            }
            if (cVar.a() <= 0) {
                break;
            }
        }
    }

    private static void g(com.google.zxing.common.c cVar, StringBuilder sb2) throws h {
        int iD;
        int[] iArr = new int[3];
        boolean z10 = false;
        int i10 = 0;
        while (cVar.a() != 8 && (iD = cVar.d(8)) != 254) {
            h(iD, cVar.d(8), iArr);
            for (int i11 = 0; i11 < 3; i11++) {
                int i12 = iArr[i11];
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            char[] cArr = f130382d;
                            if (i12 < cArr.length) {
                                char c10 = cArr[i12];
                                if (z10) {
                                    sb2.append((char) (c10 + 128));
                                    z10 = false;
                                } else {
                                    sb2.append(c10);
                                }
                            } else if (i12 == 27) {
                                sb2.append((char) 29);
                            } else {
                                if (i12 != 30) {
                                    throw h.a();
                                }
                                z10 = true;
                            }
                        } else {
                            if (i10 != 3) {
                                throw h.a();
                            }
                            char[] cArr2 = f130383e;
                            if (i12 >= cArr2.length) {
                                throw h.a();
                            }
                            char c11 = cArr2[i12];
                            if (z10) {
                                sb2.append((char) (c11 + 128));
                                z10 = false;
                            } else {
                                sb2.append(c11);
                            }
                        }
                    } else if (z10) {
                        sb2.append((char) (i12 + 128));
                        z10 = false;
                    } else {
                        sb2.append((char) i12);
                    }
                    i10 = 0;
                } else if (i12 < 3) {
                    i10 = i12 + 1;
                } else {
                    char[] cArr3 = f130381c;
                    if (i12 >= cArr3.length) {
                        throw h.a();
                    }
                    char c12 = cArr3[i12];
                    if (z10) {
                        sb2.append((char) (c12 + 128));
                        z10 = false;
                    } else {
                        sb2.append(c12);
                    }
                }
            }
            if (cVar.a() <= 0) {
                break;
            }
        }
    }

    private static void h(int i10, int i11, int[] iArr) {
        int i12 = ((i10 << 8) + i11) - 1;
        int i13 = i12 / 1600;
        int i14 = 2 << 0;
        iArr[0] = i13;
        int i15 = i12 - (i13 * 1600);
        int i16 = i15 / 40;
        iArr[1] = i16;
        iArr[2] = i15 - (i16 * 40);
    }

    private static int i(int i10, int i11) {
        int i12 = i10 - (((i11 * com.planner5d.library.engine.input.f.b.H1) % 255) + 1);
        return i12 >= 0 ? i12 : i12 + 256;
    }
}
