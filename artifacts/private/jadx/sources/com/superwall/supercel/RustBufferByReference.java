package com.superwall.supercel;

import com.sun.jna.Pointer;
import com.sun.jna.ptr.ByReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class RustBufferByReference extends ByReference {
    public RustBufferByReference() {
        super(16);
    }

    @NotNull
    public final RustBuffer.ByValue getValue() {
        Pointer pointer = getPointer();
        RustBuffer.ByValue byValue = new RustBuffer.ByValue();
        byValue.writeField("capacity", Long.valueOf(pointer.getLong(0L)));
        byValue.writeField("len", Long.valueOf(pointer.getLong(8L)));
        byValue.writeField("data", Long.valueOf(pointer.getLong(16L)));
        return byValue;
    }

    public final void setValue(@NotNull RustBuffer.ByValue value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Pointer pointer = getPointer();
        pointer.setLong(0L, value.capacity);
        pointer.setLong(8L, value.len);
        pointer.setPointer(16L, value.data);
    }
}
