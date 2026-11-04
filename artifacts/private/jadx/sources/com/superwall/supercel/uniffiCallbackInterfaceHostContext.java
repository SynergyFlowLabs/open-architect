package com.superwall.supercel;

import com.sun.jna.Pointer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceHostContext {

    @NotNull
    public static final uniffiCallbackInterfaceHostContext INSTANCE = new uniffiCallbackInterfaceHostContext();

    @NotNull
    private static UniffiVTableCallbackInterfaceHostContext.UniffiByValue vtable = new UniffiVTableCallbackInterfaceHostContext.UniffiByValue(computedProperty.INSTANCE, deviceProperty.INSTANCE, uniffiFree.INSTANCE);

    @SourceDebugExtension({"SMAP\nCEL.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CEL.kt\ncom/superwall/supercel/uniffiCallbackInterfaceHostContext$computedProperty\n+ 2 CEL.kt\ncom/superwall/supercel/CELKt\n*L\n1#1,1829:1\n317#2,7:1830\n*S KotlinDebug\n*F\n+ 1 CEL.kt\ncom/superwall/supercel/uniffiCallbackInterfaceHostContext$computedProperty\n*L\n1492#1:1830,7\n*E\n"})
    public static final class computedProperty implements UniffiCallbackInterfaceHostContextMethod0 {

        @NotNull
        public static final computedProperty INSTANCE = new computedProperty();

        private computedProperty() {
        }

        @Override // com.superwall.supercel.UniffiCallbackInterfaceHostContextMethod0
        public void callback(long j10, @NotNull RustBuffer.ByValue name, @NotNull RustBuffer.ByValue args, @NotNull Pointer callback, @NotNull Pointer uniffiOutReturn, @NotNull UniffiRustCallStatus uniffiCallStatus) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(args, "args");
            Intrinsics.checkNotNullParameter(callback, "callback");
            Intrinsics.checkNotNullParameter(uniffiOutReturn, "uniffiOutReturn");
            Intrinsics.checkNotNullParameter(uniffiCallStatus, "uniffiCallStatus");
            uniffiCallbackInterfaceHostContext$computedProperty$callback$makeCall$1 unifficallbackinterfacehostcontext_computedproperty_callback_makecall_1 = new uniffiCallbackInterfaceHostContext$computedProperty$callback$makeCall$1(FfiConverterTypeHostContext.INSTANCE.getHandleMap$supercel_release().get(j10), name, args, callback);
            try {
                uniffiCallbackInterfaceHostContext$computedProperty$callback$writeReturn$1.INSTANCE.invoke(unifficallbackinterfacehostcontext_computedproperty_callback_makecall_1.invoke());
            } catch (Exception e10) {
                uniffiCallStatus.code = (byte) 2;
                uniffiCallStatus.error_buf = FfiConverterString.INSTANCE.lower(e10.toString());
            }
        }
    }

    @SourceDebugExtension({"SMAP\nCEL.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CEL.kt\ncom/superwall/supercel/uniffiCallbackInterfaceHostContext$deviceProperty\n+ 2 CEL.kt\ncom/superwall/supercel/CELKt\n*L\n1#1,1829:1\n317#2,7:1830\n*S KotlinDebug\n*F\n+ 1 CEL.kt\ncom/superwall/supercel/uniffiCallbackInterfaceHostContext$deviceProperty\n*L\n1506#1:1830,7\n*E\n"})
    public static final class deviceProperty implements UniffiCallbackInterfaceHostContextMethod1 {

        @NotNull
        public static final deviceProperty INSTANCE = new deviceProperty();

        private deviceProperty() {
        }

        @Override // com.superwall.supercel.UniffiCallbackInterfaceHostContextMethod1
        public void callback(long j10, @NotNull RustBuffer.ByValue name, @NotNull RustBuffer.ByValue args, @NotNull Pointer callback, @NotNull Pointer uniffiOutReturn, @NotNull UniffiRustCallStatus uniffiCallStatus) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(args, "args");
            Intrinsics.checkNotNullParameter(callback, "callback");
            Intrinsics.checkNotNullParameter(uniffiOutReturn, "uniffiOutReturn");
            Intrinsics.checkNotNullParameter(uniffiCallStatus, "uniffiCallStatus");
            uniffiCallbackInterfaceHostContext$deviceProperty$callback$makeCall$1 unifficallbackinterfacehostcontext_deviceproperty_callback_makecall_1 = new uniffiCallbackInterfaceHostContext$deviceProperty$callback$makeCall$1(FfiConverterTypeHostContext.INSTANCE.getHandleMap$supercel_release().get(j10), name, args, callback);
            try {
                uniffiCallbackInterfaceHostContext$deviceProperty$callback$writeReturn$1.INSTANCE.invoke(unifficallbackinterfacehostcontext_deviceproperty_callback_makecall_1.invoke());
            } catch (Exception e10) {
                uniffiCallStatus.code = (byte) 2;
                uniffiCallStatus.error_buf = FfiConverterString.INSTANCE.lower(e10.toString());
            }
        }
    }

    public static final class uniffiFree implements UniffiCallbackInterfaceFree {

        @NotNull
        public static final uniffiFree INSTANCE = new uniffiFree();

        private uniffiFree() {
        }

        @Override // com.superwall.supercel.UniffiCallbackInterfaceFree
        public void callback(long j10) throws InternalException {
            FfiConverterTypeHostContext.INSTANCE.getHandleMap$supercel_release().remove(j10);
        }
    }

    private uniffiCallbackInterfaceHostContext() {
    }

    @NotNull
    public final UniffiVTableCallbackInterfaceHostContext.UniffiByValue getVtable$supercel_release() {
        return vtable;
    }

    public final void register$supercel_release(@NotNull UniffiLib lib) {
        Intrinsics.checkNotNullParameter(lib, "lib");
        lib.uniffi_cel_eval_fn_init_callback_vtable_hostcontext(vtable);
    }

    public final void setVtable$supercel_release(@NotNull UniffiVTableCallbackInterfaceHostContext.UniffiByValue uniffiByValue) {
        Intrinsics.checkNotNullParameter(uniffiByValue, "<set-?>");
        vtable = uniffiByValue;
    }
}
