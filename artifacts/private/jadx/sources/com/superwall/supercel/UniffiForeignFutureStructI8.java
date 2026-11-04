package com.superwall.supercel;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"returnValue", "callStatus"})
public class UniffiForeignFutureStructI8 extends Structure {

    @f
    @NotNull
    public UniffiRustCallStatus.ByValue callStatus;

    @f
    public byte returnValue;

    public static final class UniffiByValue extends UniffiForeignFutureStructI8 implements Structure.ByValue {
        /* JADX WARN: Multi-variable type inference failed */
        public UniffiByValue() {
            this((byte) 0, null, 3, 0 == true ? 1 : 0);
        }

        public /* synthetic */ UniffiByValue(byte b10, UniffiRustCallStatus.ByValue byValue, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? (byte) 0 : b10, (i10 & 2) != 0 ? new UniffiRustCallStatus.ByValue() : byValue);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UniffiByValue(byte b10, @NotNull UniffiRustCallStatus.ByValue callStatus) {
            super(b10, callStatus);
            Intrinsics.checkNotNullParameter(callStatus, "callStatus");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UniffiForeignFutureStructI8() {
        this((byte) 0, null, 3, 0 == true ? 1 : 0);
    }

    public final void uniffiSetValue$supercel_release(@NotNull UniffiForeignFutureStructI8 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.returnValue = other.returnValue;
        this.callStatus = other.callStatus;
    }

    public /* synthetic */ UniffiForeignFutureStructI8(byte b10, UniffiRustCallStatus.ByValue byValue, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? (byte) 0 : b10, (i10 & 2) != 0 ? new UniffiRustCallStatus.ByValue() : byValue);
    }

    public UniffiForeignFutureStructI8(byte b10, @NotNull UniffiRustCallStatus.ByValue callStatus) {
        Intrinsics.checkNotNullParameter(callStatus, "callStatus");
        this.returnValue = b10;
        this.callStatus = callStatus;
    }
}
