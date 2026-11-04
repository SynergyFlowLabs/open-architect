package io.ktor.util;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class m {
    @io.ktor.utils.io.o0
    public static final short a(@NotNull byte[] bArr, int i10) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return (short) ((bArr[i10 + 1] & 255) | ((bArr[i10] & 255) << 8));
    }
}
