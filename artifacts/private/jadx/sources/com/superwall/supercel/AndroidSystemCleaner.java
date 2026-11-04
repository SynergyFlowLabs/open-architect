package com.superwall.supercel;

import android.system.SystemCleaner;
import java.lang.ref.Cleaner;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
final class AndroidSystemCleaner implements UniffiCleaner {

    @NotNull
    private final Cleaner cleaner;

    public AndroidSystemCleaner() {
        Cleaner cleaner = SystemCleaner.cleaner();
        Intrinsics.checkNotNullExpressionValue(cleaner, "cleaner(...)");
        this.cleaner = cleaner;
    }

    @NotNull
    public final Cleaner getCleaner() {
        return this.cleaner;
    }

    @Override // com.superwall.supercel.UniffiCleaner
    @NotNull
    public UniffiCleaner.Cleanable register(@NotNull Object value, @NotNull Runnable cleanUpTask) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(cleanUpTask, "cleanUpTask");
        Cleaner.Cleanable cleanableRegister = this.cleaner.register(value, cleanUpTask);
        Intrinsics.checkNotNullExpressionValue(cleanableRegister, "register(...)");
        return new AndroidSystemCleanable(cleanableRegister);
    }
}
