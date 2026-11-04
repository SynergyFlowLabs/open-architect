package androidx.compose.ui.text.android;

import android.graphics.RectF;
import android.text.Layout;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class g1 {
    private static final float a(int i10, int i11, float[] fArr) {
        return fArr[(i10 - i11) * 2];
    }

    private static final float b(int i10, int i11, float[] fArr) {
        return fArr[((i10 - i11) * 2) + 1];
    }

    private static final int c(d0.a aVar, RectF rectF, int i10, int i11, int i12, float f10, float f11, float[] fArr, androidx.compose.ui.text.android.selection.e eVar, Function2<? super RectF, ? super RectF, Boolean> function2) {
        int iG;
        int iD;
        if (!g(rectF, f10, f11)) {
            return -1;
        }
        if ((aVar.h() || rectF.right < f11) && (!aVar.h() || rectF.left > f10)) {
            iG = aVar.g();
            int iF = aVar.f();
            while (iF - iG > 1) {
                int i13 = (iF + iG) / 2;
                float fA = a(i13, i10, fArr);
                if ((aVar.h() || fA <= rectF.right) && (!aVar.h() || fA >= rectF.left)) {
                    iG = i13;
                } else {
                    iF = i13;
                }
            }
            if (aVar.h()) {
                iG = iF;
            }
        } else {
            iG = aVar.f() - 1;
        }
        int iC = eVar.c(iG + 1);
        if (iC == -1 || (iD = eVar.d(iC)) <= aVar.g()) {
            return -1;
        }
        int iU = kotlin.ranges.r.u(iC, aVar.g());
        int iB = kotlin.ranges.r.B(iD, aVar.f());
        RectF rectF2 = new RectF(0.0f, i11, 0.0f, i12);
        while (true) {
            rectF2.left = aVar.h() ? a(iB - 1, i10, fArr) : a(iU, i10, fArr);
            rectF2.right = aVar.h() ? b(iU, i10, fArr) : b(iB - 1, i10, fArr);
            if (function2.invoke(rectF2, rectF).booleanValue()) {
                return iB;
            }
            iB = eVar.a(iB);
            if (iB == -1 || iB <= aVar.g()) {
                return -1;
            }
            iU = kotlin.ranges.r.u(eVar.c(iB), aVar.g());
        }
    }

    @Nullable
    public static final int[] d(@NotNull f1 f1Var, @NotNull Layout layout, @NotNull d0 d0Var, @NotNull RectF rectF, int i10, @NotNull Function2<? super RectF, ? super RectF, Boolean> function2) {
        int i11;
        androidx.compose.ui.text.android.selection.e iVar = i10 == 1 ? new androidx.compose.ui.text.android.selection.i(f1Var.P(), f1Var.T()) : androidx.compose.ui.text.android.selection.f.a(f1Var.P(), f1Var.Q());
        int lineForVertical = layout.getLineForVertical((int) rectF.top);
        if (rectF.top > f1Var.q(lineForVertical) && (lineForVertical = lineForVertical + 1) >= f1Var.r()) {
            return null;
        }
        int i12 = lineForVertical;
        int lineForVertical2 = layout.getLineForVertical((int) rectF.bottom);
        if (lineForVertical2 == 0 && rectF.bottom < f1Var.C(0)) {
            return null;
        }
        int iF = f(f1Var, layout, d0Var, i12, rectF, iVar, function2, true);
        while (true) {
            i11 = i12;
            if (iF != -1 || i11 >= lineForVertical2) {
                break;
            }
            i12 = i11 + 1;
            iF = f(f1Var, layout, d0Var, i12, rectF, iVar, function2, true);
        }
        if (iF == -1) {
            return null;
        }
        int iF2 = f(f1Var, layout, d0Var, lineForVertical2, rectF, iVar, function2, false);
        while (iF2 == -1 && i11 < lineForVertical2) {
            int i13 = lineForVertical2 - 1;
            iF2 = f(f1Var, layout, d0Var, i13, rectF, iVar, function2, false);
            lineForVertical2 = i13;
        }
        if (iF2 == -1) {
            return null;
        }
        return new int[]{iVar.c(iF + 1), iVar.d(iF2 - 1)};
    }

    private static final int e(d0.a aVar, RectF rectF, int i10, int i11, int i12, float f10, float f11, float[] fArr, androidx.compose.ui.text.android.selection.e eVar, Function2<? super RectF, ? super RectF, Boolean> function2) {
        int iG;
        int iC;
        if (!g(rectF, f10, f11)) {
            return -1;
        }
        if ((aVar.h() || rectF.left > f10) && (!aVar.h() || rectF.right < f11)) {
            iG = aVar.g();
            int iF = aVar.f();
            while (iF - iG > 1) {
                int i13 = (iF + iG) / 2;
                float fA = a(i13, i10, fArr);
                if ((aVar.h() || fA <= rectF.left) && (!aVar.h() || fA >= rectF.right)) {
                    iG = i13;
                } else {
                    iF = i13;
                }
            }
            if (aVar.h()) {
                iG = iF;
            }
        } else {
            iG = aVar.g();
        }
        int iD = eVar.d(iG);
        if (iD == -1 || (iC = eVar.c(iD)) >= aVar.f()) {
            return -1;
        }
        int iU = kotlin.ranges.r.u(iC, aVar.g());
        int iB = kotlin.ranges.r.B(iD, aVar.f());
        RectF rectF2 = new RectF(0.0f, i11, 0.0f, i12);
        while (true) {
            rectF2.left = aVar.h() ? a(iB - 1, i10, fArr) : a(iU, i10, fArr);
            rectF2.right = aVar.h() ? b(iU, i10, fArr) : b(iB - 1, i10, fArr);
            if (function2.invoke(rectF2, rectF).booleanValue()) {
                return iU;
            }
            iU = eVar.b(iU);
            if (iU == -1 || iU >= aVar.f()) {
                return -1;
            }
            iB = kotlin.ranges.r.B(eVar.d(iU), aVar.f());
        }
    }

    private static final int f(f1 f1Var, Layout layout, d0 d0Var, int i10, RectF rectF, androidx.compose.ui.text.android.selection.e eVar, Function2<? super RectF, ? super RectF, Boolean> function2, boolean z10) {
        int lineTop = layout.getLineTop(i10);
        int lineBottom = layout.getLineBottom(i10);
        int lineStart = layout.getLineStart(i10);
        int lineEnd = layout.getLineEnd(i10);
        if (lineStart == lineEnd) {
            return -1;
        }
        float[] fArr = new float[(lineEnd - lineStart) * 2];
        f1Var.b(i10, fArr);
        d0.a[] aVarArrE = d0Var.e(i10);
        kotlin.ranges.j indices = z10 ? ArraysKt.getIndices(aVarArrE) : kotlin.ranges.r.k0(ArraysKt.getLastIndex(aVarArrE), 0);
        int iL = indices.l();
        int iM = indices.m();
        int iN = indices.n();
        if ((iN > 0 && iL <= iM) || (iN < 0 && iM <= iL)) {
            int i11 = iL;
            while (true) {
                d0.a aVar = aVarArrE[i11];
                float fA = aVar.h() ? a(aVar.f() - 1, lineStart, fArr) : a(aVar.g(), lineStart, fArr);
                float fB = aVar.h() ? b(aVar.g(), lineStart, fArr) : b(aVar.f() - 1, lineStart, fArr);
                int iE = z10 ? e(aVar, rectF, lineStart, lineTop, lineBottom, fA, fB, fArr, eVar, function2) : c(aVar, rectF, lineStart, lineTop, lineBottom, fA, fB, fArr, eVar, function2);
                if (iE >= 0) {
                    return iE;
                }
                if (i11 != iM) {
                    i11 += iN;
                }
            }
        }
        return -1;
    }

    private static final boolean g(RectF rectF, float f10, float f11) {
        if (f11 < rectF.left || f10 > rectF.right) {
            return false;
        }
        int i10 = 2 >> 1;
        return true;
    }
}
