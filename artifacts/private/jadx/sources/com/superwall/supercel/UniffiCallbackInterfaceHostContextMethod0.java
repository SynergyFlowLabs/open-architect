package com.superwall.supercel;

import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface UniffiCallbackInterfaceHostContextMethod0 extends Callback {
    void callback(long j10, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull Pointer pointer, @NotNull Pointer pointer2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);
}
