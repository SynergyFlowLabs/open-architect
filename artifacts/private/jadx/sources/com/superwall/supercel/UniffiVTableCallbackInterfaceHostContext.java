package com.superwall.supercel;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"computedProperty", "deviceProperty", "uniffiFree"})
public class UniffiVTableCallbackInterfaceHostContext extends Structure {

    @f
    @Nullable
    public UniffiCallbackInterfaceHostContextMethod0 computedProperty;

    @f
    @Nullable
    public UniffiCallbackInterfaceHostContextMethod1 deviceProperty;

    @f
    @Nullable
    public UniffiCallbackInterfaceFree uniffiFree;

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceHostContext implements Structure.ByValue {
        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public UniffiByValue() {
            this(null, null, null, 7, null);
            int i10 = 3 >> 0;
        }

        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceHostContextMethod0 uniffiCallbackInterfaceHostContextMethod0, UniffiCallbackInterfaceHostContextMethod1 uniffiCallbackInterfaceHostContextMethod1, UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : uniffiCallbackInterfaceHostContextMethod0, (i10 & 2) != 0 ? null : uniffiCallbackInterfaceHostContextMethod1, (i10 & 4) != 0 ? null : uniffiCallbackInterfaceFree);
        }

        public UniffiByValue(@Nullable UniffiCallbackInterfaceHostContextMethod0 uniffiCallbackInterfaceHostContextMethod0, @Nullable UniffiCallbackInterfaceHostContextMethod1 uniffiCallbackInterfaceHostContextMethod1, @Nullable UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree) {
            super(uniffiCallbackInterfaceHostContextMethod0, uniffiCallbackInterfaceHostContextMethod1, uniffiCallbackInterfaceFree);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UniffiVTableCallbackInterfaceHostContext() {
        this(null, null, null, 7, null);
        int i10 = 4 << 0;
    }

    public final void uniffiSetValue$supercel_release(@NotNull UniffiVTableCallbackInterfaceHostContext other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.computedProperty = other.computedProperty;
        this.deviceProperty = other.deviceProperty;
        this.uniffiFree = other.uniffiFree;
    }

    public /* synthetic */ UniffiVTableCallbackInterfaceHostContext(UniffiCallbackInterfaceHostContextMethod0 uniffiCallbackInterfaceHostContextMethod0, UniffiCallbackInterfaceHostContextMethod1 uniffiCallbackInterfaceHostContextMethod1, UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : uniffiCallbackInterfaceHostContextMethod0, (i10 & 2) != 0 ? null : uniffiCallbackInterfaceHostContextMethod1, (i10 & 4) != 0 ? null : uniffiCallbackInterfaceFree);
    }

    public UniffiVTableCallbackInterfaceHostContext(@Nullable UniffiCallbackInterfaceHostContextMethod0 uniffiCallbackInterfaceHostContextMethod0, @Nullable UniffiCallbackInterfaceHostContextMethod1 uniffiCallbackInterfaceHostContextMethod1, @Nullable UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree) {
        this.computedProperty = uniffiCallbackInterfaceHostContextMethod0;
        this.deviceProperty = uniffiCallbackInterfaceHostContextMethod1;
        this.uniffiFree = uniffiCallbackInterfaceFree;
    }
}
