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
@f(c = "com.superwall.sdk.analytics.session.AppSessionManager$appSession$1", f = "AppSessionManager.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
final class AppSessionManager$appSession$1 extends o implements Function2<s0, d<? super Unit>, Object> {
    final /* synthetic */ AppSession $value;
    int label;
    final /* synthetic */ AppSessionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppSessionManager$appSession$1(AppSessionManager appSessionManager, AppSession appSession, d<? super AppSessionManager$appSession$1> dVar) {
        super(2, dVar);
        this.this$0 = appSessionManager;
        this.$value = appSession;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AppSessionManager$appSession$1(this.this$0, this.$value, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = b.l();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.m(obj);
            AppSessionManager.Factory factory = this.this$0.delegate;
            AppSession appSession = this.$value;
            this.label = 1;
            if (factory.didUpdateAppSession(appSession, this) == objL) {
                return objL;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
        }
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
        return ((AppSessionManager$appSession$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
