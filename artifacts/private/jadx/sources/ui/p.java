package ui;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.c0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class p {
    public static final boolean a(@NotNull c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        return c0Var.y1();
    }

    public static final int b(@NotNull c0 c0Var, @NotNull byte[] buffer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int iRc = c0Var.Rc(buffer, i10, i11 + i10);
        if (iRc == -1) {
            return 0;
        }
        return iRc;
    }

    public static /* synthetic */ int c(c0 c0Var, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length - i10;
        }
        return b(c0Var, bArr, i10, i11);
    }
}
