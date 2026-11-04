package androidx.compose.ui.graphics;

import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nBezier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Bezier.kt\nandroidx/compose/ui/graphics/BezierKt\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,1001:1\n151#1:1002\n469#1:1003\n470#1:1014\n469#1:1015\n470#1:1026\n469#1:1027\n470#1:1038\n469#1:1039\n470#1:1050\n469#1:1051\n470#1:1062\n451#1:1063\n451#1:1064\n451#1:1065\n469#1:1066\n470#1:1077\n469#1:1078\n470#1:1089\n469#1:1090\n470#1:1101\n469#1:1112\n470#1:1123\n469#1:1124\n470#1:1135\n469#1:1136\n470#1:1147\n469#1:1148\n470#1:1159\n469#1:1160\n470#1:1171\n469#1:1172\n470#1:1183\n270#1:1184\n270#1:1185\n975#1:1186\n975#1:1187\n989#1:1188\n989#1:1189\n270#1:1190\n469#1:1201\n470#1:1212\n453#1:1213\n453#1:1216\n65#2,10:1004\n65#2,10:1016\n65#2,10:1028\n65#2,10:1040\n65#2,10:1052\n65#2,10:1067\n65#2,10:1079\n65#2,10:1091\n83#2,10:1102\n65#2,10:1113\n65#2,10:1125\n65#2,10:1137\n65#2,10:1149\n65#2,10:1161\n65#2,10:1173\n65#2,10:1191\n65#2,10:1202\n46#2:1214\n56#2:1215\n65#2,10:1217\n*S KotlinDebug\n*F\n+ 1 Bezier.kt\nandroidx/compose/ui/graphics/BezierKt\n*L\n131#1:1002\n131#1:1003\n131#1:1014\n151#1:1015\n151#1:1026\n171#1:1027\n171#1:1038\n174#1:1039\n174#1:1050\n176#1:1051\n176#1:1062\n205#1:1063\n207#1:1064\n209#1:1065\n212#1:1066\n212#1:1077\n217#1:1078\n217#1:1089\n220#1:1090\n220#1:1101\n241#1:1112\n241#1:1123\n244#1:1124\n244#1:1135\n247#1:1136\n247#1:1147\n251#1:1148\n251#1:1159\n254#1:1160\n254#1:1171\n261#1:1172\n261#1:1183\n344#1:1184\n359#1:1185\n378#1:1186\n379#1:1187\n403#1:1188\n404#1:1189\n436#1:1190\n480#1:1201\n480#1:1212\n615#1:1213\n796#1:1216\n131#1:1004,10\n151#1:1016,10\n171#1:1028,10\n174#1:1040,10\n176#1:1052,10\n212#1:1067,10\n217#1:1079,10\n220#1:1091,10\n237#1:1102,10\n241#1:1113,10\n244#1:1125,10\n247#1:1137,10\n251#1:1149,10\n254#1:1161,10\n261#1:1173,10\n469#1:1191,10\n480#1:1202,10\n780#1:1214\n783#1:1215\n836#1:1217,10\n*E\n"})
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final double f37543a = 6.283185307179586d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final double f37544b = 1.0E-7d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f37545c = 1.05E-6f;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37546a;

        static {
            int[] iArr = new int[v2.a.values().length];
            try {
                iArr[v2.a.Move.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v2.a.Line.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v2.a.Quadratic.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[v2.a.Cubic.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[v2.a.Conic.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[v2.a.Close.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[v2.a.Done.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f37546a = iArr;
        }
    }

    static /* synthetic */ int A(float f10, float f11, float[] fArr, int i10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            i10 = 0;
        }
        return Q((-f10) / (f11 - f10), fArr, i10);
    }

    private static final int B(float f10, float f11, float f12, float[] fArr, int i10) {
        double d10 = f10;
        double d11 = f11;
        double d12 = f12;
        double d13 = d11 * 2.0d;
        double d14 = (d10 - d13) + d12;
        if (d14 == 0.0d) {
            if (d11 == d12) {
                return 0;
            }
            return Q((float) ((d13 - d12) / (d13 - (d12 * 2.0d))), fArr, i10);
        }
        double d15 = -Math.sqrt((d11 * d11) - (d12 * d10));
        double d16 = (-d10) + d11;
        int iQ = Q((float) ((-(d15 + d16)) / d14), fArr, i10);
        int iQ2 = iQ + Q((float) ((d15 - d16) / d14), fArr, i10 + iQ);
        if (iQ2 <= 1) {
            return iQ2;
        }
        float f13 = fArr[i10];
        int i11 = i10 + 1;
        float f14 = fArr[i11];
        if (f13 <= f14) {
            return f13 == f14 ? iQ2 - 1 : iQ2;
        }
        fArr[i10] = f14;
        fArr[i11] = f13;
        return iQ2;
    }

    static /* synthetic */ int C(float f10, float f11, float f12, float[] fArr, int i10, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            i10 = 0;
        }
        return B(f10, f11, f12, fArr, i10);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    private static final float D(v2 v2Var) {
        float[] fArrA = v2Var.a();
        int i10 = a.f37546a[v2Var.b().ordinal()];
        char c10 = 2;
        if (i10 != 2) {
            if (i10 == 3) {
                c10 = 4;
            } else if (i10 == 4) {
                c10 = 6;
            } else if (i10 != 5) {
                c10 = 0;
            } else {
                c10 = 4;
            }
        }
        return fArrA[c10];
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    private static final float E(v2 v2Var) {
        float[] fArrA = v2Var.a();
        int i10 = a.f37546a[v2Var.b().ordinal()];
        char c10 = 3;
        if (i10 != 2) {
            if (i10 == 3) {
                c10 = 5;
            } else if (i10 == 4) {
                c10 = 7;
            } else if (i10 != 5) {
                c10 = 0;
            } else {
                c10 = 5;
            }
        }
        return fArrA[c10];
    }

    private static final float F(v2 v2Var) {
        return v2Var.a()[0];
    }

    private static final float G(v2 v2Var) {
        return v2Var.a()[1];
    }

    private static final boolean H(float f10, float f11, float f12) {
        return !(Math.signum(f10 - f11) + Math.signum(f11 - f12) == 0.0f);
    }

    public static final int I(@NotNull float[] fArr, float f10, float f11) {
        int i10;
        float f12;
        if (fArr.length < 4) {
            return 0;
        }
        float f13 = fArr[0];
        float f14 = fArr[1];
        float f15 = fArr[2];
        float f16 = fArr[3];
        float f17 = f16 - f14;
        if (f14 > f16) {
            int i11 = 2 ^ (-1);
            i10 = -1;
            f12 = f14;
        } else {
            i10 = 1;
            f12 = f16;
            f16 = f14;
        }
        if (f11 < f16 || f11 >= f12) {
            return 0;
        }
        float f18 = ((f15 - f13) * (f11 - f14)) - (f17 * (f10 - f13));
        if (f18 == 0.0f || ((int) Math.signum(f18)) == i10) {
            return 0;
        }
        return i10;
    }

    private static final int J(float[] fArr, int i10, float f10, float f11) {
        int i11;
        int i12 = i10 + 1;
        float f12 = fArr[i12];
        int i13 = i10 + 7;
        float f13 = fArr[i13];
        if (f12 > f13) {
            i11 = -1;
            f13 = f12;
            f12 = f13;
        } else {
            i11 = 1;
        }
        if (f11 >= f12 && f11 < f13) {
            float f14 = fArr[i10];
            float f15 = fArr[i10 + 2];
            float f16 = fArr[i10 + 4];
            float f17 = fArr[i10 + 6];
            if (f10 < Math.min(f14, Math.min(f15, Math.min(f16, f17)))) {
                return 0;
            }
            if (f10 <= Math.max(f14, Math.max(f15, Math.max(f16, f17)))) {
                float f18 = fArr[i12];
                float f19 = fArr[i10 + 3];
                float f20 = fArr[i10 + 5];
                float f21 = fArr[i13];
                float fV = v(f18 - f11, f19 - f11, f20 - f11, f21 - f11);
                if (Float.isNaN(fV)) {
                    return 0;
                }
                float fO = o(f14, f15, f16, f17, fV);
                if (Math.abs(fO - f10) < f37545c && (f10 != f17 || f11 != f21)) {
                    return 0;
                }
                if (fO < f10) {
                }
            }
            return i11;
        }
        return 0;
    }

    private static final int K(float[] fArr, int i10, float f10, float f11, float[] fArr2) {
        int i11;
        float f12;
        float f13;
        float f14 = fArr[i10 + 1];
        float f15 = fArr[i10 + 5];
        if (f14 > f15) {
            i11 = -1;
            f13 = f14;
            f12 = f15;
        } else {
            i11 = 1;
            f12 = f14;
            f13 = f15;
        }
        if (f11 >= f12 && f11 < f13) {
            float f16 = fArr[i10 + 3];
            float fQ = C((f14 - (f16 * 2.0f)) + f15, (f16 - f14) * 2.0f, f14 - f11, fArr2, 0, 16, null) == 0 ? fArr[(1 - i11) * 2] : q(fArr[0], fArr[2], fArr[4], fArr2[0]);
            if ((Math.abs(fQ - f10) >= f37545c || (f10 == fArr[4] && f11 == f15)) && fQ < f10) {
                return i11;
            }
        }
        return 0;
    }

    private static final int L(float[] fArr, float[] fArr2) {
        if (fArr.length < 6 || fArr2.length < 6) {
            return 0;
        }
        float f10 = fArr[1];
        float f11 = fArr[3];
        float f12 = fArr[5];
        if (!H(f10, f11, f12)) {
            float f13 = f10 - f11;
            float fP = P(f13, (f13 - f11) + f12);
            if (!Float.isNaN(fP)) {
                O(fArr, fArr2, fP);
                return 1;
            }
            if (Math.abs(f13) >= Math.abs(f11 - f12)) {
                f10 = f12;
            }
            f11 = f10;
        }
        ArraysKt.copyInto(fArr, fArr2, 0, 0, 6);
        fArr2[3] = f11;
        return 0;
    }

    public static final int M(@NotNull float[] fArr, float f10, float f11, @NotNull float[] fArr2, @NotNull float[] fArr3) {
        if (H(fArr[1], fArr[3], fArr[5])) {
            return K(fArr, 0, f10, f11, fArr3);
        }
        int iL = L(fArr, fArr2);
        int iK = K(fArr2, 0, f10, f11, fArr3);
        if (iL > 0) {
            iK += K(fArr2, 4, f10, f11, fArr3);
        }
        return iK;
    }

    private static final void N(float[] fArr, int i10, float[] fArr2, int i11, float f10) {
        if (fArr.length >= i10 + 8 && fArr2.length >= i11 + 14) {
            if (f10 >= 1.0f) {
                ArraysKt.copyInto(fArr, fArr2, i11, i10, 8);
                float f11 = fArr[i10 + 6];
                float f12 = fArr[i10 + 7];
                fArr2[i11 + 8] = f11;
                fArr2[i11 + 9] = f12;
                fArr2[i11 + 10] = f11;
                fArr2[i11 + 11] = f12;
                fArr2[i11 + 12] = f11;
                fArr2[i11 + 13] = f12;
                return;
            }
            float f13 = fArr[i10];
            float f14 = fArr[i10 + 1];
            fArr2[i11] = f13;
            fArr2[i11 + 1] = f14;
            float f15 = fArr[i10 + 2];
            float f16 = fArr[i10 + 3];
            float fR = androidx.compose.ui.util.e.r(f13, f15, f10);
            float fR2 = androidx.compose.ui.util.e.r(f14, f16, f10);
            fArr2[i11 + 2] = fR;
            fArr2[i11 + 3] = fR2;
            float f17 = fArr[i10 + 4];
            float f18 = fArr[i10 + 5];
            float fR3 = androidx.compose.ui.util.e.r(f15, f17, f10);
            float fR4 = androidx.compose.ui.util.e.r(f16, f18, f10);
            float fR5 = androidx.compose.ui.util.e.r(fR, fR3, f10);
            float fR6 = androidx.compose.ui.util.e.r(fR2, fR4, f10);
            fArr2[i11 + 4] = fR5;
            fArr2[i11 + 5] = fR6;
            float f19 = fArr[i10 + 6];
            float f20 = fArr[i10 + 7];
            float fR7 = androidx.compose.ui.util.e.r(f17, f19, f10);
            float fR8 = androidx.compose.ui.util.e.r(f18, f20, f10);
            float fR9 = androidx.compose.ui.util.e.r(fR3, fR7, f10);
            float fR10 = androidx.compose.ui.util.e.r(fR4, fR8, f10);
            float fR11 = androidx.compose.ui.util.e.r(fR5, fR9, f10);
            float fR12 = androidx.compose.ui.util.e.r(fR6, fR10, f10);
            fArr2[i11 + 6] = fR11;
            fArr2[i11 + 7] = fR12;
            fArr2[i11 + 8] = fR9;
            fArr2[i11 + 9] = fR10;
            fArr2[i11 + 10] = fR7;
            fArr2[i11 + 11] = fR8;
            fArr2[i11 + 12] = f19;
            fArr2[i11 + 13] = f20;
        }
    }

    private static final void O(float[] fArr, float[] fArr2, float f10) {
        if (fArr.length >= 6 && fArr2.length >= 10) {
            float f11 = fArr[0];
            float f12 = fArr[1];
            float f13 = fArr[2];
            float f14 = fArr[3];
            float f15 = fArr[4];
            float f16 = fArr[5];
            float fR = androidx.compose.ui.util.e.r(f11, f13, f10);
            float fR2 = androidx.compose.ui.util.e.r(f12, f14, f10);
            fArr2[0] = f11;
            fArr2[1] = f12;
            fArr2[2] = fR;
            fArr2[3] = fR2;
            float fR3 = androidx.compose.ui.util.e.r(f13, f15, f10);
            float fR4 = androidx.compose.ui.util.e.r(f14, f16, f10);
            float fR5 = androidx.compose.ui.util.e.r(fR, fR3, f10);
            float fR6 = androidx.compose.ui.util.e.r(fR2, fR4, f10);
            fArr2[4] = fR5;
            fArr2[5] = fR6;
            fArr2[6] = fR3;
            fArr2[7] = fR4;
            fArr2[8] = f15;
            fArr2[9] = f16;
        }
    }

    private static final float P(float f10, float f11) {
        if (f10 < 0.0f) {
            f10 = -f10;
            f11 = -f11;
        }
        if (f11 == 0.0f || f10 == 0.0f || f10 >= f11) {
            return Float.NaN;
        }
        float f12 = f10 / f11;
        if (f12 == 0.0f) {
            return Float.NaN;
        }
        return f12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Q(float f10, float[] fArr, int i10) {
        float f11 = f10 >= 0.0f ? f10 : 0.0f;
        if (f11 > 1.0f) {
            f11 = 1.0f;
        }
        if (Math.abs(f11 - f10) > f37545c) {
            f11 = Float.NaN;
        }
        fArr[i10] = f11;
        return !Float.isNaN(f11) ? 1 : 0;
    }

    private static final float b(float f10) {
        float f11 = f10 >= 0.0f ? f10 : 0.0f;
        if (f11 > 1.0f) {
            f11 = 1.0f;
        }
        if (Math.abs(f11 - f10) > f37545c) {
            return Float.NaN;
        }
        return f11;
    }

    public static final boolean c(double d10, double d11) {
        return Math.abs(d10 - d11) < f37544b;
    }

    public static final boolean d(float f10, float f11) {
        return Math.abs(f10 - f11) < f37545c;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public static final long e(float f10, float f11, float f12, float f13, @NotNull float[] fArr, int i10) {
        float f14 = (f11 - f10) * 3.0f;
        float f15 = (f12 - f11) * 3.0f;
        float f16 = (f13 - f12) * 3.0f;
        int iB = B(f14, f15, f16, fArr, i10);
        float f17 = (f15 - f14) * 2.0f;
        int iQ = iB + Q((-f17) / (((f16 - f15) * 2.0f) - f17), fArr, i10 + iB);
        float fMin = Math.min(f10, f13);
        float fMax = Math.max(f10, f13);
        for (int i11 = 0; i11 < iQ; i11++) {
            float fO = o(f10, f11, f12, f13, fArr[i11]);
            fMin = Math.min(fMin, fO);
            fMax = Math.max(fMax, fO);
        }
        return androidx.collection.o.d(fMin, fMax);
    }

    public static /* synthetic */ long f(float f10, float f11, float f12, float f13, float[] fArr, int i10, int i11, Object obj) {
        if ((i11 & 32) != 0) {
            i10 = 0;
        }
        return e(f10, f11, f12, f13, fArr, i10);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public static final long g(@NotNull v2 v2Var, @NotNull float[] fArr, int i10) {
        int iU = u(v2Var, true, fArr, i10);
        float fMin = Math.min(v2Var.a()[0], D(v2Var));
        float fMax = Math.max(v2Var.a()[0], D(v2Var));
        for (int i11 = 0; i11 < iU; i11++) {
            float fR = r(v2Var, fArr[i11]);
            fMin = Math.min(fMin, fR);
            fMax = Math.max(fMax, fR);
        }
        return androidx.collection.o.d(fMin, fMax);
    }

    public static /* synthetic */ long h(v2 v2Var, float[] fArr, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return g(v2Var, fArr, i10);
    }

    public static final long i(@NotNull v2 v2Var, @NotNull float[] fArr, int i10) {
        int iU = u(v2Var, false, fArr, i10);
        float fMin = Math.min(v2Var.a()[1], E(v2Var));
        float fMax = Math.max(v2Var.a()[1], E(v2Var));
        for (int i11 = 0; i11 < iU; i11++) {
            float fS = s(v2Var, fArr[i11]);
            fMin = Math.min(fMin, fS);
            fMax = Math.max(fMax, fS);
        }
        return androidx.collection.o.d(fMin, fMax);
    }

    public static /* synthetic */ long j(v2 v2Var, float[] fArr, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return i(v2Var, fArr, i10);
    }

    public static final float k(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        return ((((((((f17 - f11) * (f12 + f14)) - ((f16 - f10) * (f13 + f15))) + (f13 * (f10 - f14))) - (f12 * (f11 - f15))) + (f17 * (f14 + (f10 / 3.0f)))) - (f16 * (f15 + (f11 / 3.0f)))) * 3.0f) / 20.0f;
    }

    private static final int l(float[] fArr, float[] fArr2, float[] fArr3) {
        int iT = t(fArr, fArr3);
        int i10 = 0;
        if (iT == 0) {
            if (fArr2.length < 8) {
                return 0;
            }
            ArraysKt.copyInto(fArr, fArr2, 0, 0, 8);
            return iT;
        }
        int i11 = 0;
        float f10 = 0.0f;
        while (i10 < iT) {
            float f11 = (fArr3[i10] - f10) / (1.0f - f10);
            if (f11 < 0.0f) {
                f11 = 0.0f;
            }
            f10 = f11 > 1.0f ? 1.0f : f11;
            N(fArr, i11, fArr2, i11, f10);
            i11 += 6;
            i10++;
            fArr = fArr2;
        }
        return iT;
    }

    public static final int m(@NotNull float[] fArr, float f10, float f11, @NotNull float[] fArr2, @NotNull float[] fArr3) {
        int iL = l(fArr, fArr2, fArr3);
        int iJ = 0;
        if (iL >= 0) {
            int i10 = 0;
            while (true) {
                iJ += J(fArr2, i10 * 6, f10, f11);
                if (i10 == iL) {
                    break;
                }
                i10++;
            }
        }
        return iJ;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public static final float n(float f10, float f11, float f12) {
        return ((((((f10 - f11) + 0.33333334f) * f12) + (f11 - (2.0f * f10))) * f12) + f10) * 3.0f * f12;
    }

    private static final float o(float f10, float f11, float f12, float f13, float f14) {
        float f15 = (f13 + ((f11 - f12) * 3.0f)) - f10;
        return (((((f15 * f14) + (((f12 - (2.0f * f11)) + f10) * 3.0f)) * f14) + ((f11 - f10) * 3.0f)) * f14) + f10;
    }

    private static final float p(float f10, float f11, float f12) {
        return ((f11 - f10) * f12) + f10;
    }

    private static final float q(float f10, float f11, float f12, float f13) {
        return (((((f12 - (f11 * 2.0f)) + f10) * f13) + ((f11 - f10) * 2.0f)) * f13) + f10;
    }

    private static final float r(v2 v2Var, float f10) {
        float[] fArrA = v2Var.a();
        int i10 = a.f37546a[v2Var.b().ordinal()];
        if (i10 == 1) {
            return fArrA[0];
        }
        if (i10 == 2) {
            return p(fArrA[0], fArrA[2], f10);
        }
        if (i10 == 3) {
            return q(fArrA[0], fArrA[2], fArrA[4], f10);
        }
        if (i10 != 4) {
            return Float.NaN;
        }
        return o(fArrA[0], fArrA[2], fArrA[4], fArrA[6], f10);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public static final float s(@NotNull v2 v2Var, float f10) {
        float[] fArrA = v2Var.a();
        int i10 = a.f37546a[v2Var.b().ordinal()];
        if (i10 == 1) {
            return fArrA[1];
        }
        if (i10 == 2) {
            return p(fArrA[1], fArrA[3], f10);
        }
        if (i10 == 3) {
            return q(fArrA[1], fArrA[3], fArrA[5], f10);
        }
        if (i10 != 4) {
            return Float.NaN;
        }
        return o(fArrA[1], fArrA[3], fArrA[5], fArrA[7], f10);
    }

    private static final int t(float[] fArr, float[] fArr2) {
        float f10 = fArr[1];
        float f11 = fArr[3];
        float f12 = fArr[5];
        return B((fArr[7] - f10) + ((f11 - f12) * 3.0f), (((f10 - f11) - f11) - f12) * 2.0f, f11 - f10, fArr2, 0);
    }

    private static final int u(v2 v2Var, boolean z10, float[] fArr, int i10) {
        int i11 = !z10 ? 1 : 0;
        float[] fArrA = v2Var.a();
        int i12 = a.f37546a[v2Var.b().ordinal()];
        if (i12 == 3) {
            float f10 = 2;
            float f11 = fArrA[i11 + 2];
            float f12 = (f11 - fArrA[i11]) * f10;
            return Q((-f12) / ((f10 * (fArrA[i11 + 4] - f11)) - f12), fArr, i10);
        }
        if (i12 != 4) {
            return 0;
        }
        float f13 = fArrA[i11 + 2];
        float f14 = (f13 - fArrA[i11]) * 3.0f;
        float f15 = fArrA[i11 + 4];
        float f16 = (f15 - f13) * 3.0f;
        float f17 = (fArrA[i11 + 6] - f15) * 3.0f;
        int iB = B(f14, f16, f17, fArr, i10);
        float f18 = (f16 - f14) * 2.0f;
        return iB + Q((-f18) / (((f17 - f16) * 2.0f) - f18), fArr, i10 + iB);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public static final float v(float f10, float f11, float f12, float f13) {
        float f14;
        float f15;
        double d10 = f10;
        double d11 = ((d10 - (((double) f11) * 2.0d)) + ((double) f12)) * 3.0d;
        double d12 = ((double) (f11 - f10)) * 3.0d;
        double d13 = ((double) (-f10)) + (((double) (f11 - f12)) * 3.0d) + ((double) f13);
        if (Math.abs(d13 - 0.0d) < f37544b) {
            if (Math.abs(d11 - 0.0d) < f37544b) {
                if (Math.abs(d12 - 0.0d) < f37544b) {
                    return Float.NaN;
                }
                float f16 = (float) ((-d10) / d12);
                f14 = f16 >= 0.0f ? f16 : 0.0f;
                f15 = f14 <= 1.0f ? f14 : 1.0f;
                if (Math.abs(f15 - f16) > f37545c) {
                    return Float.NaN;
                }
                return f15;
            }
            double dSqrt = Math.sqrt((d12 * d12) - ((4.0d * d11) * d10));
            double d14 = d11 * 2.0d;
            float f17 = (float) ((dSqrt - d12) / d14);
            float f18 = f17 < 0.0f ? 0.0f : f17;
            if (f18 > 1.0f) {
                f18 = 1.0f;
            }
            if (Math.abs(f18 - f17) > f37545c) {
                f18 = Float.NaN;
            }
            if (!Float.isNaN(f18)) {
                return f18;
            }
            float f19 = (float) (((-d12) - dSqrt) / d14);
            f14 = f19 >= 0.0f ? f19 : 0.0f;
            f15 = f14 <= 1.0f ? f14 : 1.0f;
            if (Math.abs(f15 - f19) > f37545c) {
                return Float.NaN;
            }
            return f15;
        }
        double d15 = d11 / d13;
        double d16 = d12 / d13;
        double d17 = d10 / d13;
        double d18 = ((d16 * 3.0d) - (d15 * d15)) / 9.0d;
        double d19 = (((((2.0d * d15) * d15) * d15) - ((9.0d * d15) * d16)) + (d17 * 27.0d)) / 54.0d;
        double d20 = d18 * d18 * d18;
        double d21 = (d19 * d19) + d20;
        double d22 = d15 / 3.0d;
        if (d21 >= 0.0d) {
            if (d21 != 0.0d) {
                double dSqrt2 = Math.sqrt(d21);
                float fA = (float) (((double) (androidx.compose.ui.util.e.a((float) ((-d19) + dSqrt2)) - androidx.compose.ui.util.e.a((float) (d19 + dSqrt2)))) - d22);
                f14 = fA >= 0.0f ? fA : 0.0f;
                f15 = f14 <= 1.0f ? f14 : 1.0f;
                if (Math.abs(f15 - fA) > f37545c) {
                    return Float.NaN;
                }
                return f15;
            }
            float f20 = -androidx.compose.ui.util.e.a((float) d19);
            float f21 = (float) d22;
            float f22 = (2.0f * f20) - f21;
            float f23 = f22 < 0.0f ? 0.0f : f22;
            if (f23 > 1.0f) {
                f23 = 1.0f;
            }
            if (Math.abs(f23 - f22) > f37545c) {
                f23 = Float.NaN;
            }
            if (!Float.isNaN(f23)) {
                return f23;
            }
            float f24 = (-f20) - f21;
            f14 = f24 >= 0.0f ? f24 : 0.0f;
            f15 = f14 <= 1.0f ? f14 : 1.0f;
            if (Math.abs(f15 - f24) > f37545c) {
                return Float.NaN;
            }
            return f15;
        }
        double dSqrt3 = Math.sqrt(-d20);
        double d23 = (-d19) / dSqrt3;
        if (d23 < -1.0d) {
            d23 = -1.0d;
        }
        if (d23 > 1.0d) {
            d23 = 1.0d;
        }
        double dAcos = Math.acos(d23);
        double dA = androidx.compose.ui.util.e.a((float) dSqrt3) * 2.0f;
        float fCos = (float) ((Math.cos(dAcos / 3.0d) * dA) - d22);
        float f25 = fCos < 0.0f ? 0.0f : fCos;
        if (f25 > 1.0f) {
            f25 = 1.0f;
        }
        if (Math.abs(f25 - fCos) > f37545c) {
            f25 = Float.NaN;
        }
        if (!Float.isNaN(f25)) {
            return f25;
        }
        float fCos2 = (float) ((Math.cos((6.283185307179586d + dAcos) / 3.0d) * dA) - d22);
        float f26 = fCos2 < 0.0f ? 0.0f : fCos2;
        if (f26 > 1.0f) {
            f26 = 1.0f;
        }
        if (Math.abs(f26 - fCos2) > f37545c) {
            f26 = Float.NaN;
        }
        if (!Float.isNaN(f26)) {
            return f26;
        }
        float fCos3 = (float) ((dA * Math.cos((dAcos + 12.566370614359172d) / 3.0d)) - d22);
        f14 = fCos3 >= 0.0f ? fCos3 : 0.0f;
        f15 = f14 <= 1.0f ? f14 : 1.0f;
        if (Math.abs(f15 - fCos3) > f37545c) {
            return Float.NaN;
        }
        return f15;
    }

    private static final float w(float f10, float f11) {
        float f12 = (-f10) / (f11 - f10);
        float f13 = f12 >= 0.0f ? f12 : 0.0f;
        if (f13 > 1.0f) {
            f13 = 1.0f;
        }
        if (Math.abs(f13 - f12) > f37545c) {
            return Float.NaN;
        }
        return f13;
    }

    private static final float x(float f10, float f11, float f12) {
        float f13;
        float f14;
        double d10 = f10;
        double d11 = f11;
        double d12 = f12;
        double d13 = d11 * 2.0d;
        double d14 = (d10 - d13) + d12;
        if (d14 == 0.0d) {
            if (d11 == d12) {
                return Float.NaN;
            }
            float f15 = (float) ((d13 - d12) / (d13 - (d12 * 2.0d)));
            f13 = f15 >= 0.0f ? f15 : 0.0f;
            f14 = f13 <= 1.0f ? f13 : 1.0f;
            if (Math.abs(f14 - f15) > f37545c) {
                return Float.NaN;
            }
            return f14;
        }
        double d15 = -Math.sqrt((d11 * d11) - (d12 * d10));
        double d16 = (-d10) + d11;
        float f16 = (float) ((-(d15 + d16)) / d14);
        float f17 = f16 < 0.0f ? 0.0f : f16;
        if (f17 > 1.0f) {
            f17 = 1.0f;
        }
        if (Math.abs(f17 - f16) > f37545c) {
            f17 = Float.NaN;
        }
        if (!Float.isNaN(f17)) {
            return f17;
        }
        float f18 = (float) ((d15 - d16) / d14);
        f13 = f18 >= 0.0f ? f18 : 0.0f;
        f14 = f13 <= 1.0f ? f13 : 1.0f;
        if (Math.abs(f14 - f18) > f37545c) {
            return Float.NaN;
        }
        return f14;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public static final float y(@NotNull v2 v2Var, float f10) {
        float[] fArrA = v2Var.a();
        switch (a.f37546a[v2Var.b().ordinal()]) {
            case 1:
                return Float.NaN;
            case 2:
                float f11 = fArrA[0] - f10;
                float f12 = (-f11) / ((fArrA[2] - f10) - f11);
                float f13 = 0.0f;
                if (f12 >= 0.0f) {
                    f13 = f12;
                }
                if (f13 > 1.0f) {
                    f13 = 1.0f;
                }
                if (Math.abs(f13 - f12) > f37545c) {
                    return Float.NaN;
                }
                return f13;
            case 3:
                return x(fArrA[0] - f10, fArrA[2] - f10, fArrA[4] - f10);
            case 4:
                return v(fArrA[0] - f10, fArrA[2] - f10, fArrA[4] - f10, fArrA[6] - f10);
            case 5:
            case 6:
            case 7:
                return Float.NaN;
            default:
                throw new kotlin.k0();
        }
    }

    private static final int z(float f10, float f11, float[] fArr, int i10) {
        return Q((-f10) / (f11 - f10), fArr, i10);
    }
}
