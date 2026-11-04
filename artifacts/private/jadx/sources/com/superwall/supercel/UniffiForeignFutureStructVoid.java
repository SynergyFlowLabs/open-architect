package com.superwall.supercel;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"callStatus"})
public class UniffiForeignFutureStructVoid extends Structure {

    @f
    @NotNull
    public UniffiRustCallStatus.ByValue callStatus;

    public static final class UniffiByValue extends UniffiForeignFutureStructVoid implements Structure.ByValue {
        /* JADX WARN: Multi-variable type inference failed */
        public UniffiByValue() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ UniffiByValue(UniffiRustCallStatus.ByValue byValue, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new UniffiRustCallStatus.ByValue() : byValue);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UniffiByValue(@NotNull UniffiRustCallStatus.ByValue callStatus) {
            super(callStatus);
            Intrinsics.checkNotNullParameter(callStatus, "callStatus");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UniffiForeignFutureStructVoid() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final void uniffiSetValue$supercel_release(@NotNull UniffiForeignFutureStructVoid other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.callStatus = other.callStatus;
    }

    public /* synthetic */ UniffiForeignFutureStructVoid(UniffiRustCallStatus.ByValue byValue, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new UniffiRustCallStatus.ByValue() : byValue);
    }

    public UniffiForeignFutureStructVoid(@NotNull UniffiRustCallStatus.ByValue callStatus) {
        Intrinsics.checkNotNullParameter(callStatus, "callStatus");
        this.callStatus = callStatus;
    }
}
