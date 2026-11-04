package com.superwall.supercel;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"returnValue", "callStatus"})
public class UniffiForeignFutureStructF64 extends Structure {

    @f
    @NotNull
    public UniffiRustCallStatus.ByValue callStatus;

    @f
    public double returnValue;

    public static final class UniffiByValue extends UniffiForeignFutureStructF64 implements Structure.ByValue {
        public UniffiByValue() {
            this(0.0d, null, 3, null);
        }

        public /* synthetic */ UniffiByValue(double d10, UniffiRustCallStatus.ByValue byValue, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? 0.0d : d10, (i10 & 2) != 0 ? new UniffiRustCallStatus.ByValue() : byValue);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UniffiByValue(double d10, @NotNull UniffiRustCallStatus.ByValue callStatus) {
            super(d10, callStatus);
            Intrinsics.checkNotNullParameter(callStatus, "callStatus");
        }
    }

    public UniffiForeignFutureStructF64() {
        this(0.0d, null, 3, null);
    }

    public final void uniffiSetValue$supercel_release(@NotNull UniffiForeignFutureStructF64 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.returnValue = other.returnValue;
        this.callStatus = other.callStatus;
    }

    public /* synthetic */ UniffiForeignFutureStructF64(double d10, UniffiRustCallStatus.ByValue byValue, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0.0d : d10, (i10 & 2) != 0 ? new UniffiRustCallStatus.ByValue() : byValue);
    }

    public UniffiForeignFutureStructF64(double d10, @NotNull UniffiRustCallStatus.ByValue callStatus) {
        Intrinsics.checkNotNullParameter(callStatus, "callStatus");
        this.returnValue = d10;
        this.callStatus = callStatus;
    }
}
