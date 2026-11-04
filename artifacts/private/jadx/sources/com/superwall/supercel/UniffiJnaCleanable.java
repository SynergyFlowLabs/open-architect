package com.superwall.supercel;

import com.sun.jna.internal.Cleaner;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
final class UniffiJnaCleanable implements UniffiCleaner.Cleanable {

    @NotNull
    private final Cleaner.Cleanable cleanable;

    public UniffiJnaCleanable(@NotNull Cleaner.Cleanable cleanable) {
        Intrinsics.checkNotNullParameter(cleanable, "cleanable");
        this.cleanable = cleanable;
    }

    @Override // com.superwall.supercel.UniffiCleaner.Cleanable
    public void clean() {
        this.cleanable.clean();
    }
}
