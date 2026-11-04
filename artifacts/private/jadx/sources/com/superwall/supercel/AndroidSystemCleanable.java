package com.superwall.supercel;

import java.lang.ref.Cleaner;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
final class AndroidSystemCleanable implements UniffiCleaner.Cleanable {

    @NotNull
    private final Cleaner.Cleanable cleanable;

    public AndroidSystemCleanable(@NotNull Cleaner.Cleanable cleanable) {
        Intrinsics.checkNotNullParameter(cleanable, "cleanable");
        this.cleanable = cleanable;
    }

    @Override // com.superwall.supercel.UniffiCleaner.Cleanable
    public void clean() {
        this.cleanable.clean();
    }
}
