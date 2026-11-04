package com.superwall.supercel;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"returnValue", "callStatus"})
public class UniffiForeignFutureStructRustBuffer extends Structure {

    @f
    @NotNull
    public UniffiRustCallStatus.ByValue callStatus;

    @f
    @NotNull
    public RustBuffer.ByValue returnValue;

    public static final class UniffiByValue extends UniffiForeignFutureStructRustBuffer implements Structure.ByValue {
        /* JADX WARN: Multi-variable type inference failed */
        public UniffiByValue() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public /* synthetic */ UniffiByValue(RustBuffer.ByValue byValue, UniffiRustCallStatus.ByValue byValue2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new RustBuffer.ByValue() : byValue, (i10 & 2) != 0 ? new UniffiRustCallStatus.ByValue() : byValue2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UniffiByValue(@NotNull RustBuffer.ByValue returnValue, @NotNull UniffiRustCallStatus.ByValue callStatus) {
            super(returnValue, callStatus);
            Intrinsics.checkNotNullParameter(returnValue, "returnValue");
            Intrinsics.checkNotNullParameter(callStatus, "callStatus");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UniffiForeignFutureStructRustBuffer() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final void uniffiSetValue$supercel_release(@NotNull UniffiForeignFutureStructRustBuffer other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.returnValue = other.returnValue;
        this.callStatus = other.callStatus;
    }

    public /* synthetic */ UniffiForeignFutureStructRustBuffer(RustBuffer.ByValue byValue, UniffiRustCallStatus.ByValue byValue2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new RustBuffer.ByValue() : byValue, (i10 & 2) != 0 ? new UniffiRustCallStatus.ByValue() : byValue2);
    }

    public UniffiForeignFutureStructRustBuffer(@NotNull RustBuffer.ByValue returnValue, @NotNull UniffiRustCallStatus.ByValue callStatus) {
        Intrinsics.checkNotNullParameter(returnValue, "returnValue");
        Intrinsics.checkNotNullParameter(callStatus, "callStatus");
        this.returnValue = returnValue;
        this.callStatus = callStatus;
    }
}
