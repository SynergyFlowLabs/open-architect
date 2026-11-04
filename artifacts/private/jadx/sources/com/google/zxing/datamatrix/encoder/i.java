package com.google.zxing.datamatrix.encoder;

import androidx.compose.runtime.m0;
import com.facebook.internal.p;

/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f130426c = 301;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f130424a = {5, 7, 10, 11, 12, 14, 18, 20, 24, 28, 36, 42, 48, 56, 62, 68};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[][] f130425b = {new int[]{228, 48, 15, com.rabbitmq.client.impl.k.b.p.f265340a, 62}, new int[]{23, 68, 144, 134, 240, 92, com.planner5d.library.engine.input.f.b.X1}, new int[]{28, 24, 185, 166, 223, com.planner5d.library.engine.input.f.b.R1, androidx.media3.extractor.metadata.dvbsi.b.f67479d, 255, 110, 61}, new int[]{175, 138, 205, 12, 194, 168, 39, com.planner5d.library.engine.input.f.b.O1, 60, 97, 120}, new int[]{41, 153, androidx.media2.widget.f.i.f59801t0, 91, 61, 42, androidx.media2.widget.f.i.f59777h0, 213, 97, 178, 100, 242}, new int[]{androidx.media2.widget.f.i.f59797r0, 97, 192, com.planner5d.library.engine.input.f.b.V1, 95, 9, androidx.media2.widget.f.i.f59799s0, 119, 138, 45, 18, 186, 83, 185}, new int[]{83, 195, 100, 39, 188, 75, 66, 61, 241, 213, 109, 129, 94, com.planner5d.library.engine.input.f.b.X1, 225, 48, 90, 188}, new int[]{15, 195, 244, 9, 233, 71, 168, 2, 188, 160, 153, 145, com.planner5d.library.engine.input.f.b.W1, 79, 108, 82, 27, 174, 186, 172}, new int[]{52, p.f100029m, 88, 205, 109, 39, 176, 21, 155, 197, com.planner5d.library.engine.input.f.b.U1, 223, 155, 21, 5, 172, com.planner5d.library.engine.input.f.b.X1, 124, 12, 181, 184, 96, 50, 193}, new int[]{211, 231, 43, 97, 71, 96, com.planner5d.library.engine.input.f.b.f160733u1, 174, 37, 151, 170, 53, 75, 34, com.planner5d.library.engine.input.f.b.S1, 121, 17, 138, 110, 213, androidx.media2.widget.f.i.f59775g0, 136, 120, 151, 233, 168, 93, 255}, new int[]{com.planner5d.library.engine.input.f.b.O1, 127, 242, 218, 130, 250, 162, 181, 102, 120, 84, 179, 220, com.planner5d.library.engine.input.f.b.U1, 80, 182, 229, 18, 2, 4, 68, 33, 101, androidx.media2.widget.f.i.f59767c0, 95, 119, 115, 44, 175, 184, 59, 25, 225, 98, 81, com.planner5d.library.engine.input.f.b.B}, new int[]{77, 193, androidx.media2.widget.f.i.f59767c0, 31, 19, 38, 22, 153, com.planner5d.library.engine.input.f.b.Q1, 105, 122, 2, com.planner5d.library.engine.input.f.b.O1, 133, 242, 8, 175, 95, 100, 9, 167, 105, 214, com.rabbitmq.client.impl.k.b.p.f265340a, 57, 121, 21, 1, com.planner5d.library.engine.input.f.b.W1, 57, 54, 101, com.planner5d.library.engine.input.f.b.R1, 202, 69, 50, 150, 177, 226, 5, 9, 5}, new int[]{com.planner5d.library.engine.input.f.b.O1, 132, 172, 223, 96, 32, me.relex.circleindicator.a.f332619e, 22, 238, 133, 238, 231, 205, 188, 237, 87, 191, com.planner5d.library.engine.input.f.b.f160742x1, 16, com.planner5d.library.engine.input.f.b.F1, 118, 23, 37, 90, 170, 205, 131, 88, 120, 100, 66, 138, 186, 240, 82, 44, 176, 87, 187, com.planner5d.library.engine.input.f.b.F1, 160, 175, 69, 213, 92, com.planner5d.library.engine.input.f.b.W1, 225, 19}, new int[]{175, 9, 223, 238, 12, 17, 220, 208, 100, 29, 175, 170, 230, 192, 215, 235, 150, 159, 36, 223, 38, 200, 132, 54, 228, 146, 218, 234, me.relex.circleindicator.a.f332619e, 203, 29, 232, 144, 238, 22, 150, 201, me.relex.circleindicator.a.f332619e, 62, m0.f36245r, 164, 13, androidx.media2.widget.f.i.f59767c0, com.planner5d.library.engine.input.f.b.O1, 127, 67, com.planner5d.library.engine.input.f.b.Q1, 28, 155, 43, 203, com.planner5d.library.engine.input.f.b.f160745y1, 233, 53, 143, 46}, new int[]{242, 93, 169, 50, 144, 210, 39, 118, 202, 188, 201, 189, 143, 108, 196, 37, 185, com.planner5d.library.engine.input.f.b.B, 134, 230, com.planner5d.library.engine.input.f.b.O1, 63, 197, p.f100029m, 250, com.planner5d.library.engine.input.f.b.f160742x1, 185, 221, 175, 64, 114, 71, 161, 44, com.planner5d.library.engine.input.f.b.F1, 6, 27, 218, 51, 63, 87, 10, 40, 130, 188, 17, 163, 31, 176, 170, 4, com.planner5d.library.engine.input.f.b.f160745y1, 232, 7, 94, 166, 224, 124, 86, 47, 11, 204}, new int[]{220, 228, 173, 89, com.planner5d.library.engine.input.f.b.U1, com.planner5d.library.engine.input.f.b.H1, 159, 56, 89, 33, com.planner5d.library.engine.input.f.b.F1, 244, androidx.media2.widget.f.i.f59793p0, 36, 73, 127, 213, 136, com.planner5d.library.engine.input.f.b.R1, 180, 234, 197, androidx.media2.widget.f.i.f59801t0, 177, 68, 122, 93, 213, 15, 160, 227, 236, 66, 139, 153, 185, 202, 167, 179, 25, 220, 232, 96, 210, 231, 136, 223, 239, 181, 241, 59, 52, 172, 25, 49, 232, 211, 189, 64, 54, 108, 153, 132, 63, 96, com.planner5d.library.engine.input.f.b.f160733u1, 82, 186}};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f130427d = new int[256];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f130428e = new int[255];

    static {
        int i10 = 1;
        for (int i11 = 0; i11 < 255; i11++) {
            f130428e[i11] = i10;
            f130427d[i10] = i11;
            i10 <<= 1;
            if (i10 >= 256) {
                i10 ^= 301;
            }
        }
    }

    private i() {
    }

    private static String a(CharSequence charSequence, int i10) {
        return b(charSequence, 0, charSequence.length(), i10);
    }

    private static String b(CharSequence charSequence, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15 = 0;
        while (true) {
            int[] iArr = f130424a;
            if (i15 >= iArr.length) {
                i15 = -1;
                break;
            }
            if (iArr[i15] == i12) {
                break;
            }
            i15++;
        }
        if (i15 < 0) {
            throw new IllegalArgumentException("Illegal number of error correction codewords specified: ".concat(String.valueOf(i12)));
        }
        int[] iArr2 = f130425b[i15];
        char[] cArr = new char[i12];
        for (int i16 = 0; i16 < i12; i16++) {
            cArr[i16] = 0;
        }
        for (int i17 = i10; i17 < i10 + i11; i17++) {
            int i18 = i12 - 1;
            int iCharAt = cArr[i18] ^ charSequence.charAt(i17);
            while (i18 > 0) {
                if (iCharAt == 0 || (i14 = iArr2[i18]) == 0) {
                    cArr[i18] = cArr[i18 - 1];
                } else {
                    char c10 = cArr[i18 - 1];
                    int[] iArr3 = f130428e;
                    int[] iArr4 = f130427d;
                    cArr[i18] = (char) (iArr3[(iArr4[iCharAt] + iArr4[i14]) % 255] ^ c10);
                }
                i18--;
            }
            if (iCharAt == 0 || (i13 = iArr2[0]) == 0) {
                cArr[0] = 0;
            } else {
                int[] iArr5 = f130428e;
                int[] iArr6 = f130427d;
                cArr[0] = (char) iArr5[(iArr6[iCharAt] + iArr6[i13]) % 255];
            }
        }
        char[] cArr2 = new char[i12];
        for (int i19 = 0; i19 < i12; i19++) {
            cArr2[i19] = cArr[(i12 - i19) - 1];
        }
        return String.valueOf(cArr2);
    }

    public static String c(String str, k kVar) {
        if (str.length() != kVar.b()) {
            throw new IllegalArgumentException("The number of codewords does not match the selected symbol");
        }
        StringBuilder sb2 = new StringBuilder(kVar.b() + kVar.d());
        sb2.append(str);
        int iG = kVar.g();
        if (iG == 1) {
            sb2.append(a(str, kVar.d()));
        } else {
            sb2.setLength(sb2.capacity());
            int[] iArr = new int[iG];
            int[] iArr2 = new int[iG];
            int[] iArr3 = new int[iG];
            int i10 = 0;
            while (i10 < iG) {
                int i11 = i10 + 1;
                iArr[i10] = kVar.c(i11);
                iArr2[i10] = kVar.e(i11);
                iArr3[i10] = 0;
                if (i10 > 0) {
                    iArr3[i10] = iArr3[i10 - 1] + iArr[i10];
                }
                i10 = i11;
            }
            for (int i12 = 0; i12 < iG; i12++) {
                StringBuilder sb3 = new StringBuilder(iArr[i12]);
                for (int i13 = i12; i13 < kVar.b(); i13 += iG) {
                    sb3.append(str.charAt(i13));
                }
                String strA = a(sb3.toString(), iArr2[i12]);
                int i14 = i12;
                int i15 = 0;
                while (i14 < iArr2[i12] * iG) {
                    sb2.setCharAt(kVar.b() + i14, strA.charAt(i15));
                    i14 += iG;
                    i15++;
                }
            }
        }
        return sb2.toString();
    }
}
