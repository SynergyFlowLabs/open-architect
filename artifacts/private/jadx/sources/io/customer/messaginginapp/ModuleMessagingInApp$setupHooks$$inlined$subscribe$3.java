package io.customer.messaginginapp;

import io.customer.sdk.communication.a;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g0;

/* JADX INFO: loaded from: classes13.dex */
public /* synthetic */ class ModuleMessagingInApp$setupHooks$$inlined$subscribe$3 extends g0 implements Function2<a.d, d<? super Unit>, Object>, n {
    public ModuleMessagingInApp$setupHooks$$inlined$subscribe$3(Object obj) {
        super(2, obj, Intrinsics.a.class, "suspendConversion0", "subscribe$suspendConversion0(Lkotlin/jvm/functions/Function1;Lio/customer/sdk/communication/Event;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(a.d dVar, d<? super Unit> dVar2) {
        return io.customer.sdk.communication.d.c((Function1) this.receiver, dVar, dVar2);
    }
}
