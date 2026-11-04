package androidx.compose.foundation.text.input.internal.selection;

import androidx.annotation.l1;
import androidx.compose.foundation.text.input.internal.o3;
import androidx.compose.foundation.text.input.internal.w6;
import androidx.compose.foundation.text.input.internal.y6;
import androidx.compose.ui.text.w3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/TextPreparedSelectionKt\n+ 2 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldStateKt\n*L\n1#1,587:1\n730#2,23:588\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/TextPreparedSelectionKt\n*L\n492#1:588,23\n*E\n"})
public final class y0 {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20057a;

        static {
            int[] iArr = new int[o3.values().length];
            try {
                iArr[o3.Untransformed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o3.Deletion.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o3.Replacement.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o3.Insertion.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f20057a = iArr;
        }
    }

    @l1
    public static final long a(int i10, int i11, @NotNull w6 w6Var) {
        o3 o3Var;
        if (i10 == -1) {
            return c.d(i11);
        }
        boolean z10 = i10 > i11;
        long jW = w6Var.w(i10);
        long jA = w6Var.A(jW);
        if (w3.h(jW) && w3.h(jA)) {
            o3Var = o3.Untransformed;
        } else if (w3.h(jW) || w3.h(jA)) {
            o3Var = (!w3.h(jW) || w3.h(jA)) ? o3.Deletion : o3.Insertion;
        } else {
            o3Var = o3.Replacement;
        }
        int i12 = a.f20057a[o3Var.ordinal()];
        if (i12 == 1) {
            return c.e(i10, z10 ? y6.Start : y6.End);
        }
        if (i12 == 2) {
            return c.d(i10);
        }
        if (i12 == 3) {
            return z10 ? c.e(w3.i(jA), y6.Start) : c.e(w3.n(jA), y6.End);
        }
        int i13 = 5 >> 4;
        if (i12 != 4) {
            throw new kotlin.k0();
        }
        if (z10) {
            return i10 == w3.n(jA) ? c.e(i10, y6.Start) : c.e(w3.i(jA), y6.End);
        }
        return i10 == w3.i(jA) ? c.e(i10, y6.End) : c.e(w3.n(jA), y6.Start);
    }
}
