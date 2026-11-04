package com.superwall.supercel;

import com.sun.jna.internal.Cleaner;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
final class UniffiJnaCleaner implements UniffiCleaner {
    private final Cleaner cleaner = Cleaner.getCleaner();

    @Override // com.superwall.supercel.UniffiCleaner
    @NotNull
    public UniffiCleaner.Cleanable register(@NotNull Object value, @NotNull Runnable cleanUpTask) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(cleanUpTask, "cleanUpTask");
        Cleaner.Cleanable cleanableRegister = this.cleaner.register(value, cleanUpTask);
        Intrinsics.checkNotNullExpressionValue(cleanableRegister, "register(...)");
        return new UniffiJnaCleanable(cleanableRegister);
    }
}
