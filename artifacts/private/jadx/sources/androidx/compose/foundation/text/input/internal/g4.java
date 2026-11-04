package androidx.compose.foundation.text.input.internal;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nOffsetMappingCalculator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OffsetMappingCalculator.kt\nandroidx/compose/foundation/text/input/internal/OffsetMappingCalculator\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 OffsetMappingCalculator.kt\nandroidx/compose/foundation/text/input/internal/OpArray\n*L\n1#1,419:1\n97#2,4:420\n395#3,21:424\n*S KotlinDebug\n*F\n+ 1 OffsetMappingCalculator.kt\nandroidx/compose/foundation/text/input/internal/OffsetMappingCalculator\n*L\n266#1:420,4\n302#1:424,21\n*E\n"})
public final class g4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f19608c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private int[] f19609a = i4.b(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f19610b;

    private final long a(int i10, boolean z10) {
        int i11;
        int iMin;
        int[] iArr = this.f19609a;
        int i12 = this.f19610b;
        if (i12 >= 0) {
            if (z10) {
                iMin = i10;
                for (int i13 = 0; i13 < i12; i13++) {
                    int i14 = i13 * 3;
                    int i15 = iArr[i14];
                    int i16 = iArr[i14 + 1];
                    int i17 = iArr[i14 + 2];
                    long jD = d(iMin, i15, i16, i17, z10);
                    long jD2 = d(i10, i15, i16, i17, z10);
                    iMin = Math.min(androidx.compose.ui.text.w3.n(jD), androidx.compose.ui.text.w3.n(jD2));
                    i10 = Math.max(androidx.compose.ui.text.w3.i(jD), androidx.compose.ui.text.w3.i(jD2));
                }
            } else {
                int i18 = i12 - 1;
                iMin = i10;
                while (-1 < i18) {
                    int i19 = i18 * 3;
                    int i20 = iArr[i19];
                    int i21 = iArr[i19 + 1];
                    int i22 = iArr[i19 + 2];
                    g4 g4Var = this;
                    boolean z11 = z10;
                    long jD3 = g4Var.d(iMin, i20, i21, i22, z11);
                    long jD4 = g4Var.d(i10, i20, i21, i22, z11);
                    iMin = Math.min(androidx.compose.ui.text.w3.n(jD3), androidx.compose.ui.text.w3.n(jD4));
                    i10 = Math.max(androidx.compose.ui.text.w3.i(jD3), androidx.compose.ui.text.w3.i(jD4));
                    i18--;
                    this = g4Var;
                    z10 = z11;
                }
            }
            i11 = i10;
            i10 = iMin;
        } else {
            i11 = i10;
        }
        return androidx.compose.ui.text.x3.b(i10, i11);
    }

    private final long d(int i10, int i11, int i12, int i13, boolean z10) {
        int i14 = z10 ? i12 : i13;
        if (z10) {
            i12 = i13;
        }
        if (i10 < i11) {
            return androidx.compose.ui.text.x3.a(i10);
        }
        if (i10 == i11) {
            return i14 == 0 ? androidx.compose.ui.text.x3.b(i11, i12 + i11) : androidx.compose.ui.text.x3.a(i11);
        }
        if (i10 < i11 + i14) {
            return i12 == 0 ? androidx.compose.ui.text.x3.a(i11) : androidx.compose.ui.text.x3.b(i11, i12 + i11);
        }
        return androidx.compose.ui.text.x3.a((i10 - i14) + i12);
    }

    public final long b(int i10) {
        return a(i10, false);
    }

    public final long c(int i10) {
        return a(i10, true);
    }

    public final void e(int i10, int i11, int i12) {
        if (!(i12 >= 0)) {
            androidx.compose.foundation.internal.e.g("Expected newLen to be ≥ 0, was " + i12);
        }
        int iMin = Math.min(i10, i11);
        int iMax = Math.max(iMin, i11) - iMin;
        if (iMax >= 2 || iMax != i12) {
            int i13 = this.f19610b + 1;
            if (i13 > i4.i(this.f19609a)) {
                this.f19609a = i4.d(this.f19609a, Math.max(i13 * 2, i4.i(this.f19609a) * 2));
            }
            i4.k(this.f19609a, this.f19610b, iMin, iMax, i12);
            this.f19610b = i13;
        }
    }
}
