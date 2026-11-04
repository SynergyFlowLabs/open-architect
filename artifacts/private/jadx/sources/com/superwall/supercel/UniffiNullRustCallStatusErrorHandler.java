package com.superwall.supercel;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class UniffiNullRustCallStatusErrorHandler implements UniffiRustCallStatusErrorHandler<InternalException> {

    @NotNull
    public static final UniffiNullRustCallStatusErrorHandler INSTANCE = new UniffiNullRustCallStatusErrorHandler();

    private UniffiNullRustCallStatusErrorHandler() {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.superwall.supercel.UniffiRustCallStatusErrorHandler
    @NotNull
    public InternalException lift(@NotNull RustBuffer.ByValue error_buf) throws E, InternalException {
        Intrinsics.checkNotNullParameter(error_buf, "error_buf");
        RustBuffer.Companion.free$supercel_release(error_buf);
        return new InternalException("Unexpected CALL_ERROR");
    }
}
