package com.superwall.sdk.utilities;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class JavaInteropUtilsKt {
    @NotNull
    public static final <T extends Throwable> Object createFailureResult(@NotNull T error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Result.a aVar = Result.Companion;
        return Result.m785constructorimpl(ResultKt.createFailure(error));
    }

    @NotNull
    public static final <T> Object createSuccessResult(T t10) {
        Result.a aVar = Result.Companion;
        return Result.m785constructorimpl(t10);
    }
}
