package com.superwall.supercel;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"returnValue", "callStatus"})
public class UniffiForeignFutureStructPointer extends Structure {

    @f
    @NotNull
    public UniffiRustCallStatus.ByValue callStatus;

    @f
    @NotNull
    public Pointer returnValue;

    public static final class UniffiByValue extends UniffiForeignFutureStructPointer implements Structure.ByValue {
        /* JADX WARN: Multi-variable type inference failed */
        public UniffiByValue() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ UniffiByValue(Pointer NULL, UniffiRustCallStatus.ByValue byValue, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i10 & 1) != 0) {
                NULL = Pointer.NULL;
                Intrinsics.checkNotNullExpressionValue(NULL, "NULL");
            }
            this(NULL, (i10 & 2) != 0 ? new UniffiRustCallStatus.ByValue() : byValue);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UniffiByValue(@NotNull Pointer returnValue, @NotNull UniffiRustCallStatus.ByValue callStatus) {
            super(returnValue, callStatus);
            Intrinsics.checkNotNullParameter(returnValue, "returnValue");
            Intrinsics.checkNotNullParameter(callStatus, "callStatus");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UniffiForeignFutureStructPointer() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final void uniffiSetValue$supercel_release(@NotNull UniffiForeignFutureStructPointer other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.returnValue = other.returnValue;
        this.callStatus = other.callStatus;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ UniffiForeignFutureStructPointer(Pointer NULL, UniffiRustCallStatus.ByValue byValue, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            NULL = Pointer.NULL;
            Intrinsics.checkNotNullExpressionValue(NULL, "NULL");
        }
        this(NULL, (i10 & 2) != 0 ? new UniffiRustCallStatus.ByValue() : byValue);
    }

    public UniffiForeignFutureStructPointer(@NotNull Pointer returnValue, @NotNull UniffiRustCallStatus.ByValue callStatus) {
        Intrinsics.checkNotNullParameter(returnValue, "returnValue");
        Intrinsics.checkNotNullParameter(callStatus, "callStatus");
        this.returnValue = returnValue;
        this.callStatus = callStatus;
    }
}
