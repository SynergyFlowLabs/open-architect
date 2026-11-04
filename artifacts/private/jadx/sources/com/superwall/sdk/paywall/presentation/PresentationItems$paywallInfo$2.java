package com.superwall.sdk.paywall.presentation;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.paywall.presentation.PresentationItems$paywallInfo$2", f = "PresentationItems.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class PresentationItems$paywallInfo$2 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ PaywallInfo $newValue;
    int label;
    final /* synthetic */ PresentationItems this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PresentationItems$paywallInfo$2(PresentationItems presentationItems, PaywallInfo paywallInfo, kotlin.coroutines.d<? super PresentationItems$paywallInfo$2> dVar) {
        super(2, dVar);
        this.this$0 = presentationItems;
        this.$newValue = paywallInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new PresentationItems$paywallInfo$2(this.this$0, this.$newValue, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(obj);
        this.this$0._paywallInfo = this.$newValue;
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
        return ((PresentationItems$paywallInfo$2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
