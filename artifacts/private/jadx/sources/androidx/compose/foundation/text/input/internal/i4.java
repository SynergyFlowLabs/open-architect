package androidx.compose.foundation.text.input.internal;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@oj.g
final class i4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final int[] f19630a;

    private /* synthetic */ i4(int[] iArr) {
        this.f19630a = iArr;
    }

    public static final /* synthetic */ i4 a(int[] iArr) {
        return new i4(iArr);
    }

    @NotNull
    public static int[] b(int i10) {
        return c(new int[i10 * 3]);
    }

    private static int[] c(int[] iArr) {
        return iArr;
    }

    @NotNull
    public static final int[] d(int[] iArr, int i10) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, i10 * 3);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        return c(iArrCopyOf);
    }

    public static boolean e(int[] iArr, Object obj) {
        return (obj instanceof i4) && Intrinsics.areEqual(iArr, ((i4) obj).m());
    }

    public static final boolean f(int[] iArr, int[] iArr2) {
        return Intrinsics.areEqual(iArr, iArr2);
    }

    public static final void g(int[] iArr, int i10, boolean z10, @NotNull pj.n<? super Integer, ? super Integer, ? super Integer, Unit> nVar) {
        if (i10 < 0) {
            return;
        }
        if (!z10) {
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = i11 * 3;
                nVar.invoke(Integer.valueOf(iArr[i12]), Integer.valueOf(iArr[i12 + 1]), Integer.valueOf(iArr[i12 + 2]));
            }
            return;
        }
        while (true) {
            i10--;
            if (-1 >= i10) {
                return;
            }
            int i13 = i10 * 3;
            nVar.invoke(Integer.valueOf(iArr[i13]), Integer.valueOf(iArr[i13 + 1]), Integer.valueOf(iArr[i13 + 2]));
        }
    }

    public static /* synthetic */ void h(int[] iArr, int i10, boolean z10, pj.n nVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if (i10 < 0) {
            return;
        }
        if (!z10) {
            for (int i12 = 0; i12 < i10; i12++) {
                int i13 = i12 * 3;
                nVar.invoke(Integer.valueOf(iArr[i13]), Integer.valueOf(iArr[i13 + 1]), Integer.valueOf(iArr[i13 + 2]));
            }
            return;
        }
        for (int i14 = i10 - 1; -1 < i14; i14--) {
            int i15 = i14 * 3;
            nVar.invoke(Integer.valueOf(iArr[i15]), Integer.valueOf(iArr[i15 + 1]), Integer.valueOf(iArr[i15 + 2]));
        }
    }

    public static final int i(int[] iArr) {
        return iArr.length / 3;
    }

    public static int j(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public static final void k(int[] iArr, int i10, int i11, int i12, int i13) {
        int i14 = i10 * 3;
        iArr[i14] = i11;
        iArr[i14 + 1] = i12;
        iArr[i14 + 2] = i13;
    }

    public static String l(int[] iArr) {
        return "OpArray(values=" + Arrays.toString(iArr) + ')';
    }

    public boolean equals(Object obj) {
        return e(this.f19630a, obj);
    }

    public int hashCode() {
        return j(this.f19630a);
    }

    public final /* synthetic */ int[] m() {
        return this.f19630a;
    }

    public String toString() {
        return l(this.f19630a);
    }
}
