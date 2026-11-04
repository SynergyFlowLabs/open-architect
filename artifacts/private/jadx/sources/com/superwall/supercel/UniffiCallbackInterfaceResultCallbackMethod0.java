package com.superwall.supercel;

import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface UniffiCallbackInterfaceResultCallbackMethod0 extends Callback {
    void callback(long j10, @NotNull RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus);
}
