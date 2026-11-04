package com.superwall.supercel;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
final class uniffiCallbackInterfaceHostContext$computedProperty$callback$writeReturn$1 extends l0 implements Function1<Unit, Unit> {
    public static final uniffiCallbackInterfaceHostContext$computedProperty$callback$writeReturn$1 INSTANCE = new uniffiCallbackInterfaceHostContext$computedProperty$callback$writeReturn$1();

    uniffiCallbackInterfaceHostContext$computedProperty$callback$writeReturn$1() {
        super(1);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "<anonymous parameter 0>");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
        invoke2(unit);
        return Unit.f312394a;
    }
}
