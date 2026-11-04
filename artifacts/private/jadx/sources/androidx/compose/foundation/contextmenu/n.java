package androidx.compose.foundation.contextmenu;

import androidx.annotation.l1;

/* JADX INFO: loaded from: classes.dex */
public final class n {
    private static final int a(int i10, int i11, boolean z10) {
        return f(i10, i11, !z10);
    }

    @l1
    public static final int b(int i10, int i11, int i12, boolean z10) {
        if (i11 >= i12) {
            return f(i11, i12, z10);
        }
        if (g(i10, i11, i12, z10)) {
            return e(i10, i11, z10);
        }
        return h(i10, i11, i12, z10) ? d(i10, i11, z10) : a(i11, i12, z10);
    }

    public static /* synthetic */ int c(int i10, int i11, int i12, boolean z10, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            z10 = true;
        }
        return b(i10, i11, i12, z10);
    }

    private static final int d(int i10, int i11, boolean z10) {
        return e(i10, i11, !z10);
    }

    private static final int e(int i10, int i11, boolean z10) {
        return z10 ? i10 : i10 - i11;
    }

    private static final int f(int i10, int i11, boolean z10) {
        if (z10) {
            return 0;
        }
        return i11 - i10;
    }

    private static final boolean g(int i10, int i11, int i12, boolean z10) {
        return h(i10, i11, i12, !z10);
    }

    private static final boolean h(int i10, int i11, int i12, boolean z10) {
        if (z10) {
            return i11 <= i10;
        }
        return i12 - i11 > i10;
    }
}
