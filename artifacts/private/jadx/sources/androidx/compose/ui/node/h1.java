package androidx.compose.ui.node;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nMyersDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyersDiff.kt\nandroidx/compose/ui/node/MyersDiffKt\n+ 2 MyersDiff.kt\nandroidx/compose/ui/node/Snake\n*L\n1#1,488:1\n354#1:498\n354#1:499\n308#2:489\n297#2:490\n289#2:491\n301#2:492\n293#2:493\n289#2:494\n293#2:495\n297#2:496\n301#2:497\n*S KotlinDebug\n*F\n+ 1 MyersDiff.kt\nandroidx/compose/ui/node/MyersDiffKt\n*L\n196#1:498\n256#1:499\n71#1:489\n71#1:490\n71#1:491\n71#1:492\n71#1:493\n78#1:494\n80#1:495\n85#1:496\n87#1:497\n*E\n"})
public final class h1 {
    private static final void b(z zVar, q qVar) {
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < zVar.c()) {
            int i13 = i10 + 2;
            int iB = zVar.b(i10) - zVar.b(i13);
            int iB2 = zVar.b(i10 + 1) - zVar.b(i13);
            int iB3 = zVar.b(i13);
            i10 += 3;
            while (i11 < iB) {
                qVar.b(i12, i11);
                i11++;
            }
            while (i12 < iB2) {
                qVar.c(i12);
                i12++;
            }
            while (true) {
                int i14 = iB3 - 1;
                if (iB3 > 0) {
                    qVar.d(i11, i12);
                    i11++;
                    i12++;
                    iB3 = i14;
                }
            }
        }
    }

    private static final boolean c(int i10, int i11, int i12, int i13, q qVar, int[] iArr, int[] iArr2, int i14, int[] iArr3) {
        int iE;
        int i15;
        int i16;
        int i17 = (i11 - i10) - (i13 - i12);
        boolean z10 = (i17 & 1) == 0;
        int i18 = -i14;
        for (int i19 = i18; i19 <= i14; i19 += 2) {
            if (i19 == i18 || (i19 != i14 && f.e(iArr2, i19 + 1) < f.e(iArr2, i19 - 1))) {
                iE = f.e(iArr2, i19 + 1);
                i15 = iE;
            } else {
                iE = f.e(iArr2, i19 - 1);
                i15 = iE - 1;
            }
            int i20 = i13 - ((i11 - i15) - i19);
            int i21 = ((i14 != 0 ? 1 : 0) & (i15 == iE ? 1 : 0)) + i20;
            while (true) {
                if (i15 <= i10 || i20 <= i12) {
                    break;
                }
                if (!qVar.a(i15 - 1, i20 - 1)) {
                    break;
                }
                i15--;
                i20--;
            }
            f.h(iArr2, i19, i15);
            if (z10 && (i16 = i17 - i19) >= i18 && i16 <= i14) {
                if (f.e(iArr, i16) >= i15) {
                    f(i15, i20, iE, i21, true, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    private static final z d(int i10, int i11, q qVar) {
        char c10 = 1;
        int i12 = ((i10 + i11) + 1) / 2;
        z zVar = new z(i12 * 3);
        z zVar2 = new z(i12 * 4);
        zVar2.h(0, i10, 0, i11);
        int i13 = (i12 * 2) + 1;
        int[] iArrB = f.b(new int[i13]);
        int[] iArrB2 = f.b(new int[i13]);
        int[] iArrC = k2.c(new int[5]);
        while (zVar2.d()) {
            int iF = zVar2.f();
            int iF2 = zVar2.f();
            int iF3 = zVar2.f();
            int iF4 = zVar2.f();
            iArrC = iArrC;
            if (h(iF4, iF3, iF2, iF, qVar, iArrB, iArrB2, iArrC)) {
                char c11 = c10;
                if (Math.min(iArrC[2] - iArrC[0], iArrC[3] - iArrC[c10]) > 0) {
                    k2.a(iArrC, zVar);
                }
                zVar2.h(iF4, iArrC[0], iF2, iArrC[c11]);
                zVar2.h(iArrC[2], iF3, iArrC[3], iF);
                c10 = c11;
            }
        }
        zVar.k();
        zVar.g(i10, i11, 0);
        return zVar;
    }

    public static final void e(int i10, int i11, @NotNull q qVar) {
        b(d(i10, i11, qVar), qVar);
    }

    public static final void f(int i10, int i11, int i12, int i13, boolean z10, @NotNull int[] iArr) {
        if (iArr.length < 5) {
            return;
        }
        iArr[0] = i10;
        iArr[1] = i11;
        iArr[2] = i12;
        iArr[3] = i13;
        iArr[4] = z10 ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean g(int i10, int i11, int i12, int i13, q qVar, int[] iArr, int[] iArr2, int i14, int[] iArr3) {
        int iE;
        int i15;
        boolean z10;
        int i16 = (i11 - i10) - (i13 - i12);
        boolean z11 = true;
        boolean z12 = (Math.abs(i16) & 1) == 1;
        int i17 = -i14;
        int i18 = i17;
        while (i18 <= i14) {
            if (i18 == i17 || (i18 != i14 && f.e(iArr, i18 + 1) > f.e(iArr, i18 - 1))) {
                iE = f.e(iArr, i18 + 1);
                i15 = iE;
            } else {
                iE = f.e(iArr, i18 - 1);
                i15 = iE + 1;
            }
            int i19 = (i12 + (i15 - i10)) - i18;
            int i20 = i19 - ((i14 != 0 ? z11 : 0) & (i15 == iE ? z11 : 0));
            while (true) {
                if (i15 < i11 && i19 < i13) {
                    if (!qVar.a(i15, i19)) {
                        break;
                    }
                    i15++;
                    i19++;
                } else {
                    break;
                }
            }
            f.h(iArr, i18, i15);
            if (z12) {
                int i21 = i16 - i18;
                z10 = z11;
                if (i21 >= i17 + 1 && i21 <= i14 - 1) {
                    if (f.e(iArr2, i21) <= i15) {
                        f(iE, i20, i15, i19, false, iArr3);
                        return z10;
                    }
                }
                i18 += 2;
                z11 = z10;
            } else {
                z10 = z11;
            }
            i18 += 2;
            z11 = z10;
        }
        return false;
    }

    private static final boolean h(int i10, int i11, int i12, int i13, q qVar, int[] iArr, int[] iArr2, int[] iArr3) {
        int i14 = i11 - i10;
        int i15 = i13 - i12;
        if (i14 >= 1 && i15 >= 1) {
            int i16 = ((i14 + i15) + 1) / 2;
            int[] iArr4 = iArr;
            f.h(iArr4, 1, i10);
            int[] iArr5 = iArr2;
            f.h(iArr5, 1, i11);
            int i17 = 0;
            while (i17 < i16) {
                if (g(i10, i11, i12, i13, qVar, iArr4, iArr5, i17, iArr3) || c(i10, i11, i12, i13, qVar, iArr, iArr2, i17, iArr3)) {
                    return true;
                }
                i17++;
                iArr4 = iArr;
                iArr5 = iArr2;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(int[] iArr, int i10, int i11) {
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
    }

    private static final int j(boolean z10) {
        return z10 ? 1 : 0;
    }
}
