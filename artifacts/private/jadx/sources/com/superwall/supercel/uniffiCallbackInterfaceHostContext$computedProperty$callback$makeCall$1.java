package com.superwall.supercel;

import com.sun.jna.Pointer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.l0;

/* JADX INFO: loaded from: classes13.dex */
final class uniffiCallbackInterfaceHostContext$computedProperty$callback$makeCall$1 extends l0 implements Function0<Unit> {
    final /* synthetic */ RustBuffer.ByValue $args;
    final /* synthetic */ Pointer $callback;
    final /* synthetic */ RustBuffer.ByValue $name;
    final /* synthetic */ HostContext $uniffiObj;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    uniffiCallbackInterfaceHostContext$computedProperty$callback$makeCall$1(HostContext hostContext, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2, Pointer pointer) {
        super(0);
        this.$uniffiObj = hostContext;
        this.$name = byValue;
        this.$args = byValue2;
        this.$callback = pointer;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f312394a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HostContext hostContext = this.$uniffiObj;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        hostContext.computedProperty(ffiConverterString.lift(this.$name), ffiConverterString.lift(this.$args), FfiConverterTypeResultCallback.INSTANCE.lift(this.$callback));
    }
}
