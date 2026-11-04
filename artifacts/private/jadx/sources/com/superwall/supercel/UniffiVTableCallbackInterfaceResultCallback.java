package com.superwall.supercel;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"onResult", "uniffiFree"})
public class UniffiVTableCallbackInterfaceResultCallback extends Structure {

    @f
    @Nullable
    public UniffiCallbackInterfaceResultCallbackMethod0 onResult;

    @f
    @Nullable
    public UniffiCallbackInterfaceFree uniffiFree;

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceResultCallback implements Structure.ByValue {
        /* JADX WARN: Multi-variable type inference failed */
        public UniffiByValue() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceResultCallbackMethod0 uniffiCallbackInterfaceResultCallbackMethod0, UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : uniffiCallbackInterfaceResultCallbackMethod0, (i10 & 2) != 0 ? null : uniffiCallbackInterfaceFree);
        }

        public UniffiByValue(@Nullable UniffiCallbackInterfaceResultCallbackMethod0 uniffiCallbackInterfaceResultCallbackMethod0, @Nullable UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree) {
            super(uniffiCallbackInterfaceResultCallbackMethod0, uniffiCallbackInterfaceFree);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UniffiVTableCallbackInterfaceResultCallback() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final void uniffiSetValue$supercel_release(@NotNull UniffiVTableCallbackInterfaceResultCallback other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.onResult = other.onResult;
        this.uniffiFree = other.uniffiFree;
    }

    public /* synthetic */ UniffiVTableCallbackInterfaceResultCallback(UniffiCallbackInterfaceResultCallbackMethod0 uniffiCallbackInterfaceResultCallbackMethod0, UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : uniffiCallbackInterfaceResultCallbackMethod0, (i10 & 2) != 0 ? null : uniffiCallbackInterfaceFree);
    }

    public UniffiVTableCallbackInterfaceResultCallback(@Nullable UniffiCallbackInterfaceResultCallbackMethod0 uniffiCallbackInterfaceResultCallbackMethod0, @Nullable UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree) {
        this.onResult = uniffiCallbackInterfaceResultCallbackMethod0;
        this.uniffiFree = uniffiCallbackInterfaceFree;
    }
}
