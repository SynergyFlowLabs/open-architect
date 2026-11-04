package com.superwall.supercel;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"returnValue", "callStatus"})
public class UniffiForeignFutureStructU16 extends Structure {

    @f
    @NotNull
    public UniffiRustCallStatus.ByValue callStatus;

    @f
    public short returnValue;

    public static final class UniffiByValue extends UniffiForeignFutureStructU16 implements Structure.ByValue {
        /* JADX WARN: Multi-variable type inference failed */
        public UniffiByValue() {
            this((short) 0, null, 3, 0 == true ? 1 : 0);
        }

        public /* synthetic */ UniffiByValue(short s10, UniffiRustCallStatus.ByValue byValue, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? (short) 0 : s10, (i10 & 2) != 0 ? new UniffiRustCallStatus.ByValue() : byValue);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UniffiByValue(short s10, @NotNull UniffiRustCallStatus.ByValue callStatus) {
            super(s10, callStatus);
            Intrinsics.checkNotNullParameter(callStatus, "callStatus");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UniffiForeignFutureStructU16() {
        this((short) 0, null, 3, 0 == true ? 1 : 0);
    }

    public final void uniffiSetValue$supercel_release(@NotNull UniffiForeignFutureStructU16 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.returnValue = other.returnValue;
        this.callStatus = other.callStatus;
    }

    public /* synthetic */ UniffiForeignFutureStructU16(short s10, UniffiRustCallStatus.ByValue byValue, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? (short) 0 : s10, (i10 & 2) != 0 ? new UniffiRustCallStatus.ByValue() : byValue);
    }

    public UniffiForeignFutureStructU16(short s10, @NotNull UniffiRustCallStatus.ByValue callStatus) {
        Intrinsics.checkNotNullParameter(callStatus, "callStatus");
        this.returnValue = s10;
        this.callStatus = callStatus;
    }
}
