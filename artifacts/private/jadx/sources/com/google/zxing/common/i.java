package com.google.zxing.common;

import com.google.zxing.m;

/* JADX INFO: loaded from: classes5.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static i f130330a = new f();

    /* JADX WARN: Code duplicated, block: B:21:0x0042  */
    /* JADX WARN: Code duplicated, block: B:23:0x0047 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0049  */
    /* JADX WARN: Code duplicated, block: B:45:0x008a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0090  */
    /* JADX WARN: Code duplicated, block: B:49:0x0093  */
    /* JADX WARN: Code duplicated, block: B:62:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0099 A[SYNTHETIC] */
    protected static void a(b bVar, float[] fArr) throws m {
        int iL = bVar.l();
        int iH = bVar.h();
        boolean z10 = true;
        for (int i10 = 0; i10 < fArr.length && z10; i10 += 2) {
            int i11 = (int) fArr[i10];
            int i12 = i10 + 1;
            int i13 = (int) fArr[i12];
            if (i11 < -1 || i11 > iL || i13 < -1 || i13 > iH) {
                throw m.a();
            }
            if (i11 == -1) {
                fArr[i10] = 0.0f;
            } else {
                if (i11 == iL) {
                    fArr[i10] = iL - 1;
                } else {
                    z10 = false;
                }
                if (i13 == -1) {
                    fArr[i12] = 0.0f;
                } else {
                    if (i13 == iH) {
                        fArr[i12] = iH - 1;
                    }
                }
                z10 = true;
            }
            z10 = true;
            if (i13 == -1) {
                fArr[i12] = 0.0f;
            } else {
                if (i13 == iH) {
                    fArr[i12] = iH - 1;
                }
            }
            z10 = true;
        }
        boolean z11 = true;
        for (int length = fArr.length - 2; length >= 0 && z11; length -= 2) {
            int i14 = (int) fArr[length];
            int i15 = length + 1;
            int i16 = (int) fArr[i15];
            if (i14 < -1 || i14 > iL || i16 < -1 || i16 > iH) {
                throw m.a();
            }
            if (i14 == -1) {
                fArr[length] = 0.0f;
            } else {
                if (i14 == iL) {
                    fArr[length] = iL - 1;
                } else {
                    z11 = false;
                }
                if (i16 == -1) {
                    fArr[i15] = 0.0f;
                } else {
                    if (i16 == iH) {
                        fArr[i15] = iH - 1;
                    }
                }
                z11 = true;
            }
            z11 = true;
            if (i16 == -1) {
                fArr[i15] = 0.0f;
            } else {
                if (i16 == iH) {
                    fArr[i15] = iH - 1;
                }
            }
            z11 = true;
        }
    }

    public static i b() {
        return f130330a;
    }

    public static void e(i iVar) {
        f130330a = iVar;
    }

    public abstract b c(b bVar, int i10, int i11, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24, float f25) throws m;

    public abstract b d(b bVar, int i10, int i11, k kVar) throws m;
}
