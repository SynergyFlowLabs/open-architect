package com.badlogic.gdx.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f95747a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f95748b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f95749c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f95750d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f95751e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f95752f = 5;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f95753g = "\n";

    private s0() {
    }

    private static void a(f1 f1Var, String str, boolean z10, boolean z11) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt > '=' && cCharAt < 127) {
                f1Var.n(cCharAt == '\\' ? "\\\\" : Character.valueOf(cCharAt));
            } else if (cCharAt == '\t') {
                f1Var.o("\\t");
            } else if (cCharAt == '\n') {
                f1Var.o("\\n");
            } else if (cCharAt == '\f') {
                f1Var.o("\\f");
            } else if (cCharAt == '\r') {
                f1Var.o("\\r");
            } else if (cCharAt != ' ') {
                if (cCharAt == '!' || cCharAt == '#' || cCharAt == ':' || cCharAt == '=') {
                    f1Var.append('\\').append(cCharAt);
                } else if ((cCharAt < ' ' || cCharAt > '~') && z11) {
                    String hexString = Integer.toHexString(cCharAt);
                    f1Var.o("\\u");
                    for (int i11 = 0; i11 < 4 - hexString.length(); i11++) {
                        f1Var.append(org.locationtech.jts.geom.l.f338160j);
                    }
                    f1Var.o(hexString);
                } else {
                    f1Var.append(cCharAt);
                }
            } else if (i10 == 0 || z10) {
                f1Var.o("\\ ");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0123  */
    /* JADX WARN: Code duplicated, block: B:107:0x0129  */
    /* JADX WARN: Code duplicated, block: B:117:0x0143 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x0145  */
    /* JADX WARN: Code duplicated, block: B:146:0x0109 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00c6 A[PHI: r12
      0x00c6: PHI (r12v8 char) = (r12v2 char), (r12v3 char), (r12v4 char), (r12v5 char), (r12v6 char), (r12v1 char), (r12v1 char), (r12v1 char) binds: [B:60:0x00c4, B:59:0x00c1, B:58:0x00bf, B:57:0x00bd, B:56:0x00ba, B:139:0x00c6, B:102:0x0121, B:104:0x0124] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x0111  */
    /* JADX WARN: Code duplicated, block: B:95:0x0114  */
    /* JADX WARN: Code duplicated, block: B:97:0x0117 A[ADDED_TO_REGION] */
    public static void b(k0<String, String> k0Var, Reader reader) throws IOException {
        char c10;
        if (k0Var == null) {
            throw new NullPointerException("ObjectMap cannot be null");
        }
        if (reader == null) {
            throw new NullPointerException("Reader cannot be null");
        }
        char[] cArr = new char[40];
        BufferedReader bufferedReader = new BufferedReader(reader);
        int i10 = 1;
        int i11 = 0;
        boolean z10 = true;
        int i12 = -1;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            int i17 = bufferedReader.read();
            if (i17 == -1) {
                if (i14 == 2 && i15 <= 4) {
                    throw new IllegalArgumentException("Invalid Unicode sequence: expected format \\uxxxx");
                }
                if (i12 == -1 && i13 > 0) {
                    i12 = i13;
                }
                if (i12 >= 0) {
                    String str = new String(cArr, i11, i13);
                    String strSubstring = str.substring(i11, i12);
                    String strSubstring2 = str.substring(i12);
                    if (i14 == i10) {
                        strSubstring2 = strSubstring2 + com.squareup.moshi.g.Z2;
                    }
                    k0Var.C(strSubstring, strSubstring2);
                    return;
                }
                return;
            }
            char c11 = (char) i17;
            if (i13 == cArr.length) {
                char[] cArr2 = new char[cArr.length * 2];
                System.arraycopy(cArr, i11, cArr2, i11, i13);
                cArr = cArr2;
            }
            if (i14 == 2) {
                int iDigit = Character.digit(c11, 16);
                if (iDigit >= 0) {
                    i16 = (i16 << 4) + iDigit;
                    i15++;
                    if (i15 < 4) {
                    }
                } else if (i15 <= 4) {
                    throw new IllegalArgumentException("Invalid Unicode sequence: illegal character");
                }
                cArr[i13] = (char) i16;
                i13++;
                i14 = i11;
                if (c11 != '\n') {
                }
            }
            if (i14 == i10) {
                if (c11 == '\n') {
                    i14 = 5;
                    i11 = 0;
                } else if (c11 != '\r') {
                    if (c11 == 'b') {
                        c11 = '\b';
                    } else if (c11 == 'f') {
                        c11 = '\f';
                    } else if (c11 == 'n') {
                        c11 = '\n';
                    } else if (c11 == 'r') {
                        c11 = '\r';
                    } else if (c11 == 't') {
                        c11 = '\t';
                    } else if (c11 == 'u') {
                        i11 = 0;
                        i14 = 2;
                        i15 = 0;
                        i16 = 0;
                    }
                    i14 = 0;
                    if (i14 == 4) {
                        i12 = i13;
                        i14 = 0;
                    }
                    cArr[i13] = c11;
                    i13++;
                    i10 = 1;
                    i11 = 0;
                    z10 = false;
                } else {
                    i11 = 0;
                    i14 = 3;
                }
            } else if (c11 != '\n') {
                if (c11 == '\r') {
                    if (i13 <= 0 || (i13 == 0 && i12 == 0)) {
                        if (i12 == -1) {
                            i12 = i13;
                        }
                        i11 = 0;
                        String str2 = new String(cArr, 0, i13);
                        k0Var.C(str2.substring(0, i12), str2.substring(i12));
                    } else {
                        i11 = 0;
                    }
                    i12 = -1;
                    i13 = i11;
                    i14 = i13;
                    i10 = 1;
                    z10 = true;
                } else if (c11 == '!' || c11 == '#') {
                    if (z10) {
                        do {
                            int i18 = bufferedReader.read();
                            if (i18 == -1 || (c10 = (char) i18) == '\r') {
                                break;
                            }
                        } while (c10 != '\n');
                    } else {
                        if (Character.isSpace(c11)) {
                            if (i14 == 3) {
                                i14 = 5;
                            }
                            if (i13 == 0 && i13 != i12 && i14 != 5) {
                                if (i12 == -1) {
                                    i14 = 4;
                                }
                            }
                        }
                        if (i14 != 5 || i14 == 3) {
                            i14 = 0;
                        }
                        if (i14 == 4) {
                            i12 = i13;
                            i14 = 0;
                        }
                        cArr[i13] = c11;
                        i13++;
                        i10 = 1;
                        i11 = 0;
                        z10 = false;
                    }
                    i10 = 1;
                    i11 = 0;
                } else if (c11 == ':' || c11 == '=') {
                    if (i12 == -1) {
                        i12 = i13;
                        i10 = 1;
                        i11 = 0;
                        i14 = 0;
                    } else {
                        if (Character.isSpace(c11)) {
                            if (i14 == 3) {
                                i14 = 5;
                            }
                            if (i13 == 0) {
                            }
                            i10 = 1;
                            i11 = 0;
                        }
                        if (i14 != 5) {
                            i14 = 0;
                        } else {
                            i14 = 0;
                        }
                        if (i14 == 4) {
                            i12 = i13;
                            i14 = 0;
                        }
                        cArr[i13] = c11;
                        i13++;
                        i10 = 1;
                        i11 = 0;
                        z10 = false;
                    }
                } else if (c11 != '\\') {
                    if (Character.isSpace(c11)) {
                        if (i14 == 3) {
                            i14 = 5;
                        }
                        if (i13 == 0) {
                        }
                        i10 = 1;
                        i11 = 0;
                    }
                    if (i14 != 5) {
                        i14 = 0;
                    } else {
                        i14 = 0;
                    }
                    if (i14 == 4) {
                        i12 = i13;
                        i14 = 0;
                    }
                    cArr[i13] = c11;
                    i13++;
                    i10 = 1;
                    i11 = 0;
                    z10 = false;
                } else {
                    if (i14 == 4) {
                        i12 = i13;
                    }
                    i10 = 1;
                    i11 = 0;
                    i14 = 1;
                }
            } else if (i14 == 3) {
                i14 = 5;
                i10 = 1;
                i11 = 0;
            } else {
                if (i13 <= 0) {
                    if (i12 == -1) {
                        i12 = i13;
                    }
                    i11 = 0;
                    String str3 = new String(cArr, 0, i13);
                    k0Var.C(str3.substring(0, i12), str3.substring(i12));
                } else {
                    if (i12 == -1) {
                        i12 = i13;
                    }
                    i11 = 0;
                    String str4 = new String(cArr, 0, i13);
                    k0Var.C(str4.substring(0, i12), str4.substring(i12));
                }
                i12 = -1;
                i13 = i11;
                i14 = i13;
                i10 = 1;
                z10 = true;
            }
        }
    }

    public static void c(k0<String, String> k0Var, Writer writer, String str) throws IOException {
        d(k0Var, writer, str, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void d(k0<String, String> k0Var, Writer writer, String str, boolean z10) throws IOException {
        if (str != null) {
            e(writer, str);
        }
        writer.write("#");
        writer.write(new Date().toString());
        writer.write("\n");
        f1 f1Var = new f1(200);
        k0.a<String, String> it = k0Var.m().iterator();
        while (it.hasNext()) {
            k0.b next = it.next();
            a(f1Var, (String) next.f95630a, true, z10);
            f1Var.append('=');
            a(f1Var, (String) next.f95631b, false, z10);
            writer.write("\n");
            writer.write(f1Var.toString());
            f1Var.o0(0);
        }
        writer.flush();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    private static void e(Writer writer, String str) throws IOException {
        writer.write("#");
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt > 255 || cCharAt == '\n' || cCharAt == '\r') {
                if (i11 != i10) {
                    writer.write(str.substring(i11, i10));
                }
                if (cCharAt > 255) {
                    String hexString = Integer.toHexString(cCharAt);
                    writer.write("\\u");
                    for (int i12 = 0; i12 < 4 - hexString.length(); i12++) {
                        writer.write(48);
                    }
                    writer.write(hexString);
                } else {
                    writer.write("\n");
                    if (cCharAt == '\r' && i10 != length - 1) {
                        int i13 = i10 + 1;
                        if (str.charAt(i13) == '\n') {
                            i10 = i13;
                        }
                    }
                    if (i10 != length - 1) {
                        int i14 = i10 + 1;
                        if (str.charAt(i14) != '#' && str.charAt(i14) != '!') {
                            writer.write("#");
                        }
                    } else {
                        writer.write("#");
                    }
                }
                i11 = i10 + 1;
            }
            i10++;
        }
        if (i11 != i10) {
            writer.write(str.substring(i11, i10));
        }
        writer.write("\n");
    }
}
