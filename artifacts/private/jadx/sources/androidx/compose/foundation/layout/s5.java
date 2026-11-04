package androidx.compose.foundation.layout;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nRowColumnMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnMeasurePolicy.kt\nandroidx/compose/foundation/layout/RowColumnMeasurePolicyKt\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 3 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/foundation/layout/internal/InlineClassHelperKt\n*L\n1#1,280:1\n26#2:281\n26#2:285\n26#2:286\n26#2:291\n105#3:282\n105#3:283\n123#3:284\n101#3,10:292\n105#3:302\n47#4,4:287\n*S KotlinDebug\n*F\n+ 1 RowColumnMeasurePolicy.kt\nandroidx/compose/foundation/layout/RowColumnMeasurePolicyKt\n*L\n121#1:281\n173#1:285\n185#1:286\n194#1:291\n135#1:282\n144#1:283\n165#1:284\n220#1:292,10\n252#1:302\n187#1:287,4\n*E\n"})
public final class s5 {
    /* JADX WARN: Code duplicated, block: B:78:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:82:0x01bb  */
    @NotNull
    public static final androidx.compose.ui.layout.b1 a(@NotNull r5 r5Var, int i10, int i11, int i12, int i13, int i14, @NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull List<? extends androidx.compose.ui.layout.z0> list, @NotNull androidx.compose.ui.layout.i2[] i2VarArr, int i15, int i16, @Nullable int[] iArr, int i17) {
        int i18;
        int i19;
        int i20;
        int i21;
        l2 l2VarI;
        int iIntValue;
        int iIntValue2;
        int i22;
        int i23;
        l2 l2VarI2;
        r5 r5Var2;
        int i24;
        long j10 = i14;
        int i25 = i16 - i15;
        int[] iArr2 = new int[i25];
        int i26 = i15;
        float f10 = 0.0f;
        int i27 = 0;
        int i28 = 0;
        boolean z10 = false;
        int i29 = 0;
        int i30 = 0;
        while (true) {
            i18 = Integer.MAX_VALUE;
            boolean z11 = true;
            if (i26 >= i16) {
                break;
            }
            androidx.compose.ui.layout.z0 z0Var = list.get(i26);
            t5 t5VarC = q5.c(z0Var);
            float fE = q5.e(t5VarC);
            if (!z10 && !q5.h(t5VarC)) {
                z11 = false;
            }
            if (fE > 0.0f) {
                f10 += fE;
                i29++;
                iArr2 = iArr2;
                i26 = i26;
                j10 = j10;
            } else {
                Integer numValueOf = (i13 == Integer.MAX_VALUE || t5VarC == null || (l2VarI2 = t5VarC.i()) == null) ? null : Integer.valueOf(Math.round(l2VarI2.d() * i13));
                int i31 = i12 - i30;
                androidx.compose.ui.layout.i2 i2VarP0 = i2VarArr[i26];
                if (i2VarP0 == null) {
                    i24 = i28;
                    r5Var2 = r5Var;
                    i2VarP0 = z0Var.P0(r5.t(r5Var2, 0, numValueOf != null ? numValueOf.intValue() : 0, i12 != Integer.MAX_VALUE ? i31 < 0 ? 0 : i31 : Integer.MAX_VALUE, numValueOf != null ? numValueOf.intValue() : i13, false, 16, null));
                } else {
                    r5Var2 = r5Var;
                    i24 = i28;
                }
                int iK = r5Var2.k(i2VarP0);
                int iH = r5Var2.h(i2VarP0);
                iArr2[i26 - i15] = iK;
                int i32 = i31 - iK;
                if (i32 < 0) {
                    i32 = 0;
                }
                int iMin = Math.min(i14, i32);
                i30 += iK + iMin;
                int iMax = Math.max(i24, iH);
                i2VarArr[i26] = i2VarP0;
                i27 = iMin;
                i28 = iMax;
            }
            i26++;
            z10 = z11;
            iArr2 = iArr2;
            j10 = j10;
        }
        int[] iArr3 = iArr2;
        long j11 = j10;
        r5 r5Var3 = r5Var;
        int i33 = i28;
        if (i29 == 0) {
            i30 -= i27;
            i20 = 0;
            i19 = 0;
        } else {
            long j12 = j11 * ((long) (i29 - 1));
            long jRound = ((long) ((i12 != Integer.MAX_VALUE ? i12 : i10) - i30)) - j12;
            if (jRound < 0) {
                jRound = 0;
            }
            float f11 = jRound / f10;
            for (int i34 = i15; i34 < i16; i34++) {
                jRound -= (long) Math.round(q5.e(q5.c(list.get(i34))) * f11);
            }
            int i35 = i15;
            int i36 = 0;
            while (i35 < i16) {
                if (i2VarArr[i35] == null) {
                    androidx.compose.ui.layout.z0 z0Var2 = list.get(i35);
                    t5 t5VarC2 = q5.c(z0Var2);
                    float fE2 = q5.e(t5VarC2);
                    Integer numValueOf2 = (i13 == i18 || t5VarC2 == null || (l2VarI = t5VarC2.i()) == null) ? null : Integer.valueOf(Math.round(l2VarI.d() * i13));
                    if (!(fE2 > 0.0f)) {
                        x.a.g("All weights <= 0 should have placeables");
                    }
                    int iV = kotlin.math.b.V(jRound);
                    long j13 = jRound - ((long) iV);
                    int iMax2 = Math.max(0, Math.round(fE2 * f11) + iV);
                    if (q5.b(t5VarC2)) {
                        i21 = Integer.MAX_VALUE;
                        int i37 = iMax2 != Integer.MAX_VALUE ? iMax2 : 0;
                        if (numValueOf2 != null) {
                            iIntValue = numValueOf2.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        if (numValueOf2 != null) {
                            iIntValue2 = numValueOf2.intValue();
                        } else {
                            iIntValue2 = i13;
                        }
                        r5Var3 = r5Var;
                        androidx.compose.ui.layout.i2 i2VarP1 = z0Var2.P0(r5Var3.f(i37, iIntValue, iMax2, iIntValue2, true));
                        int iK2 = r5Var3.k(i2VarP1);
                        int iH2 = r5Var3.h(i2VarP1);
                        iArr3[i35 - i15] = iK2;
                        i36 += iK2;
                        int iMax3 = Math.max(i33, iH2);
                        i2VarArr[i35] = i2VarP1;
                        i33 = iMax3;
                        jRound = j13;
                    } else {
                        i21 = Integer.MAX_VALUE;
                    }
                    if (numValueOf2 != null) {
                        iIntValue = numValueOf2.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    if (numValueOf2 != null) {
                        iIntValue2 = numValueOf2.intValue();
                    } else {
                        iIntValue2 = i13;
                    }
                    r5Var3 = r5Var;
                    androidx.compose.ui.layout.i2 i2VarP2 = z0Var2.P0(r5Var3.f(i37, iIntValue, iMax2, iIntValue2, true));
                    int iK3 = r5Var3.k(i2VarP2);
                    int iH3 = r5Var3.h(i2VarP2);
                    iArr3[i35 - i15] = iK3;
                    i36 += iK3;
                    int iMax4 = Math.max(i33, iH3);
                    i2VarArr[i35] = i2VarP2;
                    i33 = iMax4;
                    jRound = j13;
                } else {
                    i21 = i18;
                }
                i35++;
                i18 = i21;
            }
            i19 = 0;
            i20 = (int) (((long) i36) + j12);
            int i38 = i12 - i30;
            if (i20 < 0) {
                i20 = 0;
            }
            if (i20 > i38) {
                i20 = i38;
            }
        }
        int i39 = i33;
        if (z10) {
            int iMax5 = i19;
            int iMax6 = iMax5;
            for (int i40 = i15; i40 < i16; i40++) {
                androidx.compose.ui.layout.i2 i2Var = i2VarArr[i40];
                Intrinsics.checkNotNull(i2Var);
                k1 k1VarA = q5.a(q5.d(i2Var));
                Integer numE = k1VarA != null ? k1VarA.e(i2Var) : null;
                if (numE != null) {
                    int iIntValue3 = numE.intValue();
                    int iH4 = r5Var3.h(i2Var);
                    iMax5 = Math.max(iMax5, iIntValue3 != Integer.MIN_VALUE ? numE.intValue() : i19);
                    if (iIntValue3 == Integer.MIN_VALUE) {
                        iIntValue3 = iH4;
                    }
                    iMax6 = Math.max(iMax6, iH4 - iIntValue3);
                }
            }
            int i41 = iMax6;
            i23 = iMax5;
            i22 = i41;
        } else {
            i22 = i19;
            i23 = i22;
        }
        int i42 = i30 + i20;
        if (i42 < 0) {
            i42 = i19;
        }
        int iMax7 = Math.max(i42, i10);
        int iMax8 = Math.max(i39, Math.max(i11, i22 + i23));
        int[] iArr4 = new int[i25];
        r5Var3.g(iMax7, iArr3, iArr4, c1Var);
        return r5Var3.j(i2VarArr, c1Var, i23, iArr4, iMax7, iMax8, iArr, i17, i15, i16);
    }
}
