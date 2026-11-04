package io.ktor.util;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class u0 {
    @NotNull
    public static final byte[] b(@NotNull t0 t0Var, @NotNull byte[] input, int i10, int i11) {
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        t0Var.update(input, i10, i11);
        return t0Var.a();
    }

    public static /* synthetic */ byte[] c(t0 t0Var, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        return b(t0Var, bArr, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(int i10, int i11) {
        return (i10 >>> (32 - i11)) | (i10 << i11);
    }
}
