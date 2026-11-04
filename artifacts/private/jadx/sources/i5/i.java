package i5;

import kotlin.jvm.internal.Intrinsics;
import oj.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final i f287036a = new i();

    private i() {
    }

    @n
    public static final void a(@NotNull a x10, @NotNull a b10) {
        if (com.facebook.internal.instrument.crashshield.b.e(i.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(x10, "x");
            Intrinsics.checkNotNullParameter(b10, "b");
            int iB = x10.b(0);
            int iB2 = x10.b(1);
            int iB3 = x10.b(2);
            float[] fArrA = x10.a();
            float[] fArrA2 = b10.a();
            if (iB <= 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (iB2 > 0) {
                    int i12 = 0;
                    while (true) {
                        int i13 = i12 + 1;
                        if (iB3 > 0) {
                            int i14 = 0;
                            while (true) {
                                int i15 = i14 + 1;
                                int i16 = (i10 * iB2 * iB3) + (i12 * iB3) + i14;
                                fArrA[i16] = fArrA[i16] + fArrA2[i14];
                                if (i15 >= iB3) {
                                    break;
                                } else {
                                    i14 = i15;
                                }
                            }
                        }
                        if (i13 >= iB2) {
                            break;
                        } else {
                            i12 = i13;
                        }
                    }
                }
                if (i11 >= iB) {
                    return;
                } else {
                    i10 = i11;
                }
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, i.class);
        }
    }

    @n
    @NotNull
    public static final a b(@NotNull a[] tensors) {
        int iB;
        if (com.facebook.internal.instrument.crashshield.b.e(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(tensors, "tensors");
            int i10 = 0;
            int iB2 = tensors[0].b(0);
            int length = tensors.length - 1;
            if (length >= 0) {
                int i11 = 0;
                iB = 0;
                while (true) {
                    int i12 = i11 + 1;
                    iB += tensors[i11].b(1);
                    if (i12 > length) {
                        break;
                    }
                    i11 = i12;
                }
            } else {
                iB = 0;
            }
            a aVar = new a(new int[]{iB2, iB});
            float[] fArrA = aVar.a();
            if (iB2 > 0) {
                int i13 = 0;
                while (true) {
                    int i14 = i13 + 1;
                    int i15 = i13 * iB;
                    int length2 = tensors.length - 1;
                    if (length2 >= 0) {
                        int i16 = i10;
                        while (true) {
                            int i17 = i16 + 1;
                            float[] fArrA2 = tensors[i16].a();
                            int iB3 = tensors[i16].b(1);
                            System.arraycopy(fArrA2, i13 * iB3, fArrA, i15, iB3);
                            i15 += iB3;
                            if (i17 > length2) {
                                break;
                            }
                            i16 = i17;
                        }
                    }
                    if (i14 >= iB2) {
                        break;
                    }
                    i13 = i14;
                    i10 = 0;
                }
            }
            return aVar;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, i.class);
            return null;
        }
    }

    @n
    @NotNull
    public static final a c(@NotNull a x10, @NotNull a w10) {
        a aVar;
        float[] fArr;
        float[] fArr2;
        a aVar2 = null;
        if (com.facebook.internal.instrument.crashshield.b.e(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x10, "x");
            Intrinsics.checkNotNullParameter(w10, "w");
            int i10 = 0;
            int iB = x10.b(0);
            int iB2 = x10.b(1);
            int iB3 = x10.b(2);
            int iB4 = w10.b(0);
            int i11 = (iB2 - iB4) + 1;
            int iB5 = w10.b(2);
            a aVar3 = new a(new int[]{iB, i11, iB5});
            float[] fArrA = x10.a();
            float[] fArrA2 = aVar3.a();
            float[] fArrA3 = w10.a();
            if (iB > 0) {
                int i12 = 0;
                while (true) {
                    int i13 = i12 + 1;
                    if (iB5 > 0) {
                        int i14 = i10;
                        while (true) {
                            int i15 = i14 + 1;
                            if (i11 > 0) {
                                int i16 = 0;
                                while (true) {
                                    aVar = aVar2;
                                    int i17 = i16 + 1;
                                    float f10 = 0.0f;
                                    if (iB4 > 0) {
                                        int i18 = 0;
                                        while (true) {
                                            fArr = fArrA;
                                            int i19 = i18 + 1;
                                            if (iB3 > 0) {
                                                int i20 = 0;
                                                while (true) {
                                                    fArr2 = fArrA3;
                                                    int i21 = i20 + 1;
                                                    try {
                                                        f10 += fArr[(iB2 * iB3 * i12) + ((i18 + i16) * iB3) + i20] * fArr2[(((i18 * iB3) + i20) * iB5) + i14];
                                                        if (i21 >= iB3) {
                                                            break;
                                                        }
                                                        i20 = i21;
                                                        fArrA3 = fArr2;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        com.facebook.internal.instrument.crashshield.b.c(th, i.class);
                                                        return aVar;
                                                    }
                                                }
                                            } else {
                                                fArr2 = fArrA3;
                                            }
                                            if (i19 >= iB4) {
                                                break;
                                            }
                                            fArrA3 = fArr2;
                                            i18 = i19;
                                            fArrA = fArr;
                                        }
                                    } else {
                                        fArr = fArrA;
                                        fArr2 = fArrA3;
                                    }
                                    fArrA2[(i11 * iB5 * i12) + (i16 * iB5) + i14] = f10;
                                    if (i17 >= i11) {
                                        break;
                                    }
                                    fArrA = fArr;
                                    fArrA3 = fArr2;
                                    i16 = i17;
                                    aVar2 = aVar;
                                }
                            } else {
                                fArr = fArrA;
                                fArr2 = fArrA3;
                                aVar = aVar2;
                            }
                            if (i15 >= iB5) {
                                break;
                            }
                            fArrA = fArr;
                            fArrA3 = fArr2;
                            i14 = i15;
                            aVar2 = aVar;
                        }
                    } else {
                        fArr = fArrA;
                        fArr2 = fArrA3;
                        aVar = aVar2;
                    }
                    if (i13 >= iB) {
                        break;
                    }
                    fArrA = fArr;
                    fArrA3 = fArr2;
                    i12 = i13;
                    aVar2 = aVar;
                    i10 = 0;
                }
            }
            return aVar3;
        } catch (Throwable th3) {
            th = th3;
            aVar = null;
        }
    }

    @n
    @NotNull
    public static final a d(@NotNull a x10, @NotNull a w10, @NotNull a b10) {
        if (com.facebook.internal.instrument.crashshield.b.e(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x10, "x");
            Intrinsics.checkNotNullParameter(w10, "w");
            Intrinsics.checkNotNullParameter(b10, "b");
            int iB = x10.b(0);
            int iB2 = b10.b(0);
            a aVarH = h(x10, w10);
            float[] fArrA = b10.a();
            float[] fArrA2 = aVarH.a();
            if (iB > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    if (iB2 > 0) {
                        int i12 = 0;
                        while (true) {
                            int i13 = i12 + 1;
                            int i14 = (i10 * iB2) + i12;
                            fArrA2[i14] = fArrA2[i14] + fArrA[i12];
                            if (i13 >= iB2) {
                                break;
                            }
                            i12 = i13;
                        }
                    }
                    if (i11 >= iB) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return aVarH;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, i.class);
            return null;
        }
    }

    @n
    @NotNull
    public static final a e(@NotNull String[] texts, int i10, @NotNull a w10) {
        if (com.facebook.internal.instrument.crashshield.b.e(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(texts, "texts");
            Intrinsics.checkNotNullParameter(w10, "w");
            int length = texts.length;
            int iB = w10.b(1);
            a aVar = new a(new int[]{length, i10, iB});
            float[] fArrA = aVar.a();
            float[] fArrA2 = w10.a();
            if (length > 0) {
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    int[] iArrD = j.f287037a.d(texts[i11], i10);
                    if (i10 > 0) {
                        int i13 = 0;
                        while (true) {
                            int i14 = i13 + 1;
                            System.arraycopy(fArrA2, iArrD[i13] * iB, fArrA, (iB * i10 * i11) + (i13 * iB), iB);
                            if (i14 >= i10) {
                                break;
                            }
                            i13 = i14;
                        }
                    }
                    if (i12 >= length) {
                        break;
                    }
                    i11 = i12;
                }
            }
            return aVar;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, i.class);
            return null;
        }
    }

    @n
    public static final void f(@NotNull a x10, int i10) {
        if (!com.facebook.internal.instrument.crashshield.b.e(i.class)) {
            try {
                Intrinsics.checkNotNullParameter(x10, "x");
                if (i10 < x10.c()) {
                    int iC = x10.c();
                    int iB = 1;
                    if (i10 < iC) {
                        int i11 = i10;
                        while (true) {
                            int i12 = i11 + 1;
                            iB *= x10.b(i11);
                            if (i12 >= iC) {
                                break;
                            } else {
                                i11 = i12;
                            }
                        }
                    }
                    int[] iArr = new int[i10 + 1];
                    if (i10 > 0) {
                        int i13 = 0;
                        while (true) {
                            int i14 = i13 + 1;
                            iArr[i13] = x10.b(i13);
                            if (i14 >= i10) {
                                break;
                            } else {
                                i13 = i14;
                            }
                        }
                    }
                    iArr[i10] = iB;
                    x10.d(iArr);
                }
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, i.class);
            }
        }
    }

    @n
    @NotNull
    public static final a g(@NotNull a x10, int i10) {
        a aVar;
        float[] fArr;
        a aVar2 = null;
        if (com.facebook.internal.instrument.crashshield.b.e(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x10, "x");
            int i11 = 0;
            int iB = x10.b(0);
            int iB2 = x10.b(1);
            int iB3 = x10.b(2);
            int i12 = (iB2 - i10) + 1;
            a aVar3 = new a(new int[]{iB, i12, iB3});
            float[] fArrA = x10.a();
            float[] fArrA2 = aVar3.a();
            if (iB > 0) {
                int i13 = 0;
                while (true) {
                    int i14 = i13 + 1;
                    if (iB3 > 0) {
                        int i15 = i11;
                        while (true) {
                            int i16 = i15 + 1;
                            if (i12 > 0) {
                                int i17 = i11;
                                while (true) {
                                    int i18 = i17 + 1;
                                    int i19 = i17 * iB3;
                                    int i20 = (i13 * i12 * iB3) + i19 + i15;
                                    int i21 = (i13 * iB2 * iB3) + i19 + i15;
                                    fArrA2[i20] = Float.MIN_VALUE;
                                    if (i10 > 0) {
                                        int i22 = 0;
                                        while (true) {
                                            aVar = aVar2;
                                            int i23 = i22 + 1;
                                            fArr = fArrA;
                                            try {
                                                fArrA2[i20] = Math.max(fArrA2[i20], fArr[i21 + (i22 * iB3)]);
                                                if (i23 >= i10) {
                                                    break;
                                                }
                                                fArrA = fArr;
                                                i22 = i23;
                                                aVar2 = aVar;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                com.facebook.internal.instrument.crashshield.b.c(th, i.class);
                                                return aVar;
                                            }
                                        }
                                    } else {
                                        fArr = fArrA;
                                        aVar = aVar2;
                                    }
                                    if (i18 >= i12) {
                                        break;
                                    }
                                    fArrA = fArr;
                                    i17 = i18;
                                    aVar2 = aVar;
                                }
                            } else {
                                fArr = fArrA;
                                aVar = aVar2;
                            }
                            if (i16 >= iB3) {
                                break;
                            }
                            fArrA = fArr;
                            i15 = i16;
                            aVar2 = aVar;
                            i11 = 0;
                        }
                    } else {
                        fArr = fArrA;
                        aVar = aVar2;
                    }
                    if (i14 >= iB) {
                        break;
                    }
                    fArrA = fArr;
                    i13 = i14;
                    aVar2 = aVar;
                    i11 = 0;
                }
            }
            return aVar3;
        } catch (Throwable th3) {
            th = th3;
            aVar = aVar2;
        }
    }

    @n
    @NotNull
    public static final a h(@NotNull a x10, @NotNull a w10) {
        if (com.facebook.internal.instrument.crashshield.b.e(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x10, "x");
            Intrinsics.checkNotNullParameter(w10, "w");
            int i10 = 0;
            int iB = x10.b(0);
            int iB2 = w10.b(0);
            int iB3 = w10.b(1);
            a aVar = new a(new int[]{iB, iB3});
            float[] fArrA = x10.a();
            float[] fArrA2 = w10.a();
            float[] fArrA3 = aVar.a();
            if (iB > 0) {
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    if (iB3 > 0) {
                        int i13 = i10;
                        while (true) {
                            int i14 = i13 + 1;
                            int i15 = (i11 * iB3) + i13;
                            fArrA3[i15] = 0.0f;
                            if (iB2 > 0) {
                                int i16 = i10;
                                while (true) {
                                    int i17 = i16 + 1;
                                    fArrA3[i15] = fArrA3[i15] + (fArrA[(i11 * iB2) + i16] * fArrA2[(i16 * iB3) + i13]);
                                    if (i17 >= iB2) {
                                        break;
                                    }
                                    i16 = i17;
                                }
                            }
                            if (i14 >= iB3) {
                                break;
                            }
                            i13 = i14;
                            i10 = 0;
                        }
                    }
                    if (i12 >= iB) {
                        break;
                    }
                    i11 = i12;
                    i10 = 0;
                }
            }
            return aVar;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, i.class);
            return null;
        }
    }

    @n
    public static final void i(@NotNull a x10) {
        if (com.facebook.internal.instrument.crashshield.b.e(i.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(x10, "x");
            float[] fArrA = x10.a();
            int length = fArrA.length - 1;
            if (length < 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (fArrA[i10] < 0.0f) {
                    fArrA[i10] = 0.0f;
                }
                if (i11 > length) {
                    return;
                } else {
                    i10 = i11;
                }
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, i.class);
        }
    }

    @n
    public static final void j(@NotNull a x10) {
        if (com.facebook.internal.instrument.crashshield.b.e(i.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(x10, "x");
            int i10 = 0;
            int iB = x10.b(0);
            int iB2 = x10.b(1);
            float[] fArrA = x10.a();
            if (iB <= 0) {
                return;
            }
            while (true) {
                int i11 = i10 + 1;
                int i12 = i10 * iB2;
                int i13 = i12 + iB2;
                float f10 = Float.MIN_VALUE;
                if (i12 < i13) {
                    int i14 = i12;
                    while (true) {
                        int i15 = i14 + 1;
                        float f11 = fArrA[i14];
                        if (f11 > f10) {
                            f10 = f11;
                        }
                        if (i15 >= i13) {
                            break;
                        } else {
                            i14 = i15;
                        }
                    }
                }
                float f12 = 0.0f;
                if (i12 < i13) {
                    int i16 = i12;
                    while (true) {
                        int i17 = i16 + 1;
                        float fExp = (float) Math.exp(fArrA[i16] - f10);
                        fArrA[i16] = fExp;
                        f12 += fExp;
                        if (i17 >= i13) {
                            break;
                        } else {
                            i16 = i17;
                        }
                    }
                }
                if (i12 < i13) {
                    while (true) {
                        int i18 = i12 + 1;
                        fArrA[i12] = fArrA[i12] / f12;
                        if (i18 >= i13) {
                            break;
                        } else {
                            i12 = i18;
                        }
                    }
                }
                if (i11 >= iB) {
                    return;
                } else {
                    i10 = i11;
                }
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, i.class);
        }
    }

    @n
    @NotNull
    public static final a k(@NotNull a x10) {
        if (com.facebook.internal.instrument.crashshield.b.e(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x10, "x");
            int iB = x10.b(0);
            int iB2 = x10.b(1);
            a aVar = new a(new int[]{iB2, iB});
            float[] fArrA = x10.a();
            float[] fArrA2 = aVar.a();
            if (iB > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    if (iB2 > 0) {
                        int i12 = 0;
                        while (true) {
                            int i13 = i12 + 1;
                            fArrA2[(i12 * iB) + i10] = fArrA[(i10 * iB2) + i12];
                            if (i13 >= iB2) {
                                break;
                            }
                            i12 = i13;
                        }
                    }
                    if (i11 >= iB) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return aVar;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, i.class);
            return null;
        }
    }

    @n
    @NotNull
    public static final a l(@NotNull a x10) {
        if (com.facebook.internal.instrument.crashshield.b.e(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x10, "x");
            int iB = x10.b(0);
            int iB2 = x10.b(1);
            int iB3 = x10.b(2);
            a aVar = new a(new int[]{iB3, iB2, iB});
            float[] fArrA = x10.a();
            float[] fArrA2 = aVar.a();
            if (iB > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    if (iB2 > 0) {
                        int i12 = 0;
                        while (true) {
                            int i13 = i12 + 1;
                            if (iB3 > 0) {
                                int i14 = 0;
                                while (true) {
                                    int i15 = i14 + 1;
                                    fArrA2[(i14 * iB * iB2) + (i12 * iB) + i10] = fArrA[(i10 * iB2 * iB3) + (i12 * iB3) + i14];
                                    if (i15 >= iB3) {
                                        break;
                                    }
                                    i14 = i15;
                                }
                            }
                            if (i13 >= iB2) {
                                break;
                            }
                            i12 = i13;
                        }
                    }
                    if (i11 >= iB) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return aVar;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, i.class);
            return null;
        }
    }
}
