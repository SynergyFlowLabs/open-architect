package com.superwall.supercel;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"returnValue", "callStatus"})
public class UniffiForeignFutureStructU64 extends Structure {

    @f
    @NotNull
    public UniffiRustCallStatus.ByValue callStatus;

    @f
    public long returnValue;

    public static final class UniffiByValue extends UniffiForeignFutureStructU64 implements Structure.ByValue {
        public UniffiByValue() {
            this(0L, null, 3, null);
        }

        public /* synthetic */ UniffiByValue(long j10, UniffiRustCallStatus.ByValue byValue, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? new UniffiRustCallStatus.ByValue() : byValue);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UniffiByValue(long j10, @NotNull UniffiRustCallStatus.ByValue callStatus) {
            super(j10, callStatus);
            Intrinsics.checkNotNullParameter(callStatus, "callStatus");
        }
    }

    public UniffiForeignFutureStructU64() {
        this(0L, null, 3, null);
    }

    public final void uniffiSetValue$supercel_release(@NotNull UniffiForeignFutureStructU64 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.returnValue = other.returnValue;
        this.callStatus = other.callStatus;
    }

    public /* synthetic */ UniffiForeignFutureStructU64(long j10, UniffiRustCallStatus.ByValue byValue, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? new UniffiRustCallStatus.ByValue() : byValue);
    }

    public UniffiForeignFutureStructU64(long j10, @NotNull UniffiRustCallStatus.ByValue callStatus) {
        Intrinsics.checkNotNullParameter(callStatus, "callStatus");
        this.returnValue = j10;
        this.callStatus = callStatus;
    }
}
