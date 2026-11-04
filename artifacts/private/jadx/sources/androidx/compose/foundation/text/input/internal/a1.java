package androidx.compose.foundation.text.input.internal;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nCursorAnchorInfoBuilder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CursorAnchorInfoBuilder.android.kt\nandroidx/compose/foundation/text/input/internal/CursorAnchorInfoBuilder_androidKt\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,155:1\n54#2:156\n85#3:157\n*S KotlinDebug\n*F\n+ 1 CursorAnchorInfoBuilder.android.kt\nandroidx/compose/foundation/text/input/internal/CursorAnchorInfoBuilder_androidKt\n*L\n100#1:156\n100#1:157\n*E\n"})
public final class a1 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    private static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, int i10, int i11, androidx.compose.ui.text.p3 p3Var, n0.j jVar) {
        ?? r10;
        float[] fArr = new float[(i11 - i10) * 4];
        p3Var.x().c(androidx.compose.ui.text.x3.b(i10, i11), fArr, 0);
        for (int i12 = i10; i12 < i11; i12++) {
            int i13 = (i12 - i10) * 4;
            n0.j jVar2 = new n0.j(fArr[i13], fArr[i13 + 1], fArr[i13 + 2], fArr[i13 + 3]);
            boolean zR = jVar.R(jVar2);
            if (!v3.d(jVar, jVar2.t(), jVar2.B()) || !v3.d(jVar, jVar2.x(), jVar2.j())) {
                r10 = zR;
                r10 = (zR ? 1 : 0) | 2;
            }
            r10 = zR;
            if (p3Var.c(i12) == androidx.compose.ui.text.style.i.Rtl) {
                r10 = (r10 == true ? 1 : 0) | 4;
            }
            builder.addCharacterBounds(i12, jVar2.t(), jVar2.B(), jVar2.x(), jVar2.j(), r10 == true ? 1 : 0);
        }
        return builder;
    }

    @NotNull
    public static final CursorAnchorInfo b(@NotNull CursorAnchorInfo.Builder builder, @NotNull CharSequence charSequence, long j10, @Nullable androidx.compose.ui.text.w3 w3Var, @NotNull androidx.compose.ui.text.p3 p3Var, @NotNull Matrix matrix, @NotNull n0.j jVar, @NotNull n0.j jVar2, boolean z10, boolean z11, boolean z12, boolean z13) {
        builder.reset();
        builder.setMatrix(matrix);
        int iL = androidx.compose.ui.text.w3.l(j10);
        builder.setSelectionRange(iL, androidx.compose.ui.text.w3.k(j10));
        if (z10) {
            d(builder, iL, p3Var, jVar);
        }
        if (z11) {
            int iL2 = w3Var != null ? androidx.compose.ui.text.w3.l(w3Var.r()) : -1;
            int iK = w3Var != null ? androidx.compose.ui.text.w3.k(w3Var.r()) : -1;
            if (iL2 >= 0 && iL2 < iK) {
                builder.setComposingText(iL2, charSequence.subSequence(iL2, iK));
                a(builder, iL2, iK, p3Var, jVar);
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33 && z12) {
            x0.a(builder, jVar2);
        }
        if (i10 >= 34 && z13) {
            z0.a(builder, p3Var, jVar);
        }
        return builder.build();
    }

    public static /* synthetic */ CursorAnchorInfo c(CursorAnchorInfo.Builder builder, CharSequence charSequence, long j10, androidx.compose.ui.text.w3 w3Var, androidx.compose.ui.text.p3 p3Var, Matrix matrix, n0.j jVar, n0.j jVar2, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Object obj) {
        if ((i10 & 128) != 0) {
            z10 = true;
        }
        if ((i10 & 256) != 0) {
            z11 = true;
        }
        if ((i10 & 512) != 0) {
            z12 = true;
        }
        if ((i10 & 1024) != 0) {
            z13 = true;
        }
        return b(builder, charSequence, j10, w3Var, p3Var, matrix, jVar, jVar2, z10, z11, z12, z13);
    }

    private static final CursorAnchorInfo.Builder d(CursorAnchorInfo.Builder builder, int i10, androidx.compose.ui.text.p3 p3Var, n0.j jVar) {
        if (i10 < 0) {
            return builder;
        }
        n0.j jVarE = p3Var.e(i10);
        float fH = kotlin.ranges.r.H(jVarE.t(), 0.0f, (int) (p3Var.C() >> 32));
        boolean zD = v3.d(jVar, fH, jVarE.B());
        boolean zD2 = v3.d(jVar, fH, jVarE.j());
        boolean z10 = p3Var.c(i10) == androidx.compose.ui.text.style.i.Rtl;
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
