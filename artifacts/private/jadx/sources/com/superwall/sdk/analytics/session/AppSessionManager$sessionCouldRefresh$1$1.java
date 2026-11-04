package com.superwall.sdk.analytics.session;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.analytics.session.AppSessionManager$sessionCouldRefresh$1$1", f = "AppSessionManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class AppSessionManager$sessionCouldRefresh$1$1 extends o implements Function2<s0, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ AppSessionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppSessionManager$sessionCouldRefresh$1$1(AppSessionManager appSessionManager, d<? super AppSessionManager$sessionCouldRefresh$1$1> dVar) {
        super(2, dVar);
        this.this$0 = appSessionManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AppSessionManager$sessionCouldRefresh$1$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(obj);
        this.this$0.storage.recordFirstSeenTracked();
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
        return ((AppSessionManager$sessionCouldRefresh$1$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
