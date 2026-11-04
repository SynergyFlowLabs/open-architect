package androidx.compose.ui.node;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nMyersDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyersDiff.kt\nandroidx/compose/ui/node/IntStack\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,488:1\n57#2,4:489\n*S KotlinDebug\n*F\n+ 1 MyersDiff.kt\nandroidx/compose/ui/node/IntStack\n*L\n440#1:489,4\n*E\n"})
final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private int[] f40115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f40116b;

    public z(int i10) {
        this.f40115a = new int[i10];
    }

    private final boolean a(int i10, int i11) {
        int[] iArr = this.f40115a;
        int i12 = iArr[i10];
        int i13 = iArr[i11];
        return i12 < i13 || (i12 == i13 && iArr[i10 + 1] <= iArr[i11 + 1]);
    }

    private final int e(int i10, int i11, int i12) {
        int i13 = i10 - i12;
        while (i10 < i11) {
            if (a(i10, i11)) {
                i13 += i12;
                l(i13, i10);
            }
            i10 += i12;
        }
        int i14 = i13 + i12;
        l(i14, i11);
        return i14;
    }

    private final void i(int i10, int i11, int i12) {
        if (i10 < i11) {
            int iE = e(i10, i11, i12);
            i(i10, iE - i12, i12);
            i(iE + i12, i11, i12);
        }
    }

    private final int[] j(int[] iArr) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        this.f40115a = iArrCopyOf;
        return iArrCopyOf;
    }

    private final void l(int i10, int i11) {
        int[] iArr = this.f40115a;
        h1.i(iArr, i10, i11);
        h1.i(iArr, i10 + 1, i11 + 1);
        h1.i(iArr, i10 + 2, i11 + 2);
    }

    public final int b(int i10) {
        return this.f40115a[i10];
    }

    public final int c() {
        return this.f40116b;
    }

    public final boolean d() {
        return this.f40116b != 0;
    }

    public final int f() {
        int[] iArr = this.f40115a;
        int i10 = this.f40116b - 1;
        this.f40116b = i10;
        return iArr[i10];
    }

    public final void g(int i10, int i11, int i12) {
        int i13 = this.f40116b;
        int[] iArrJ = this.f40115a;
        int i14 = i13 + 3;
        if (i14 >= iArrJ.length) {
            iArrJ = j(iArrJ);
        }
        iArrJ[i13] = i10 + i12;
        iArrJ[i13 + 1] = i11 + i12;
        iArrJ[i13 + 2] = i12;
        this.f40116b = i14;
    }

    public final void h(int i10, int i11, int i12, int i13) {
        int i14 = this.f40116b;
        int[] iArrJ = this.f40115a;
        int i15 = i14 + 4;
        if (i15 >= iArrJ.length) {
            iArrJ = j(iArrJ);
        }
        iArrJ[i14] = i10;
        iArrJ[i14 + 1] = i11;
        iArrJ[i14 + 2] = i12;
        iArrJ[i14 + 3] = i13;
        this.f40116b = i15;
    }

    public final void k() {
        int i10 = this.f40116b;
        if (!(i10 % 3 == 0)) {
            s0.a.i("Array size not a multiple of 3");
        }
        if (i10 > 3) {
            i(0, i10 - 3, 3);
        }
    }
}
