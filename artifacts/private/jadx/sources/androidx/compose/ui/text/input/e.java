package androidx.compose.ui.text.input;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.text.p3;
import androidx.compose.ui.text.w3;
import androidx.compose.ui.text.x3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nCursorAnchorInfoBuilder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CursorAnchorInfoBuilder.android.kt\nandroidx/compose/ui/text/input/CursorAnchorInfoBuilder_androidKt\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,237:1\n54#2:238\n85#3:239\n*S KotlinDebug\n*F\n+ 1 CursorAnchorInfoBuilder.android.kt\nandroidx/compose/ui/text/input/CursorAnchorInfoBuilder_androidKt\n*L\n119#1:238\n119#1:239\n*E\n"})
public final class e {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    private static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, int i10, int i11, m0 m0Var, p3 p3Var, n0.j jVar) {
        ?? r10;
        int iB = m0Var.b(i10);
        int iB2 = m0Var.b(i11);
        float[] fArr = new float[(iB2 - iB) * 4];
        p3Var.x().c(x3.b(iB, iB2), fArr, 0);
        for (int i12 = i10; i12 < i11; i12++) {
            int iB3 = m0Var.b(i12);
            int i13 = (iB3 - iB) * 4;
            n0.j jVar2 = new n0.j(fArr[i13], fArr[i13 + 1], fArr[i13 + 2], fArr[i13 + 3]);
            boolean zR = jVar.R(jVar2);
            if (!d(jVar, jVar2.t(), jVar2.B()) || !d(jVar, jVar2.x(), jVar2.j())) {
                r10 = zR;
                r10 = (zR ? 1 : 0) | 2;
            }
            r10 = zR;
            if (p3Var.c(iB3) == androidx.compose.ui.text.style.i.Rtl) {
                r10 = (r10 == true ? 1 : 0) | 4;
            }
            builder.addCharacterBounds(i12, jVar2.t(), jVar2.B(), jVar2.x(), jVar2.j(), r10 == true ? 1 : 0);
        }
        return builder;
    }

    @kotlin.l(message = "Only exists to support the legacy TextInputService APIs. It is not used by any Compose code. A copy of this function in foundation is used by the legacy BasicTextField.")
    @NotNull
    public static final CursorAnchorInfo b(@NotNull CursorAnchorInfo.Builder builder, @NotNull y0 y0Var, @NotNull m0 m0Var, @NotNull p3 p3Var, @NotNull Matrix matrix, @NotNull n0.j jVar, @NotNull n0.j jVar2, boolean z10, boolean z11, boolean z12, boolean z13) {
        builder.reset();
        builder.setMatrix(matrix);
        int iL = w3.l(y0Var.l());
        builder.setSelectionRange(iL, w3.k(y0Var.l()));
        if (z10) {
            e(builder, iL, m0Var, p3Var, jVar);
        }
        if (z11) {
            w3 w3VarK = y0Var.k();
            int iL2 = w3VarK != null ? w3.l(w3VarK.r()) : -1;
            w3 w3VarK2 = y0Var.k();
            int iK = w3VarK2 != null ? w3.k(w3VarK2.r()) : -1;
            if (iL2 >= 0 && iL2 < iK) {
                builder.setComposingText(iL2, y0Var.m().subSequence(iL2, iK));
                a(builder, iL2, iK, m0Var, p3Var, jVar);
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33 && z12) {
            c.a(builder, jVar2);
        }
        if (i10 >= 34 && z13) {
            d.a(builder, p3Var, jVar);
        }
        return builder.build();
    }

    public static /* synthetic */ CursorAnchorInfo c(CursorAnchorInfo.Builder builder, y0 y0Var, m0 m0Var, p3 p3Var, Matrix matrix, n0.j jVar, n0.j jVar2, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Object obj) {
        if ((i10 & 64) != 0) {
            z10 = true;
        }
        if ((i10 & 128) != 0) {
            z11 = true;
        }
        if ((i10 & 256) != 0) {
            z12 = true;
        }
        if ((i10 & 512) != 0) {
            z13 = true;
        }
        return b(builder, y0Var, m0Var, p3Var, matrix, jVar, jVar2, z10, z11, z12, z13);
    }

    private static final boolean d(n0.j jVar, float f10, float f11) {
        float fT = jVar.t();
        if (f10 > jVar.x() || fT > f10) {
            return false;
        }
        return f11 <= jVar.j() && jVar.B() <= f11;
    }

    private static final CursorAnchorInfo.Builder e(CursorAnchorInfo.Builder builder, int i10, m0 m0Var, p3 p3Var, n0.j jVar) {
        if (i10 < 0) {
            return builder;
        }
        int iB = m0Var.b(i10);
        n0.j jVarE = p3Var.e(iB);
        float fH = kotlin.ranges.r.H(jVarE.t(), 0.0f, (int) (p3Var.C() >> 32));
        boolean zD = d(jVar, fH, jVarE.B());
        boolean zD2 = d(jVar, fH, jVarE.j());
        boolean z10 = p3Var.c(iB) == androidx.compose.ui.text.style.i.Rtl;
        int i11 = (zD || zD2) ? 1 : 0;
        if (!zD || !zD2) {
            i11 |= 2;
        }
        if (z10) {
            i11 |= 4;
        }
        builder.setInsertionMarkerLocation(fH, jVarE.B(), jVarE.j(), jVarE.j(), i11);
        return builder;
    }
}
