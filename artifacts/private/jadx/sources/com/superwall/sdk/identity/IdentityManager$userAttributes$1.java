package com.superwall.sdk.identity;

import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.identity.IdentityManager$userAttributes$1", f = "IdentityManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class IdentityManager$userAttributes$1 extends o implements Function2<s0, d<? super Map<String, ? extends Object>>, Object> {
    int label;
    final /* synthetic */ IdentityManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IdentityManager$userAttributes$1(IdentityManager identityManager, d<? super IdentityManager$userAttributes$1> dVar) {
        super(2, dVar);
        this.this$0 = identityManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new IdentityManager$userAttributes$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(obj);
        return this.this$0._userAttributes;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, d<? super Map<String, ? extends Object>> dVar) {
        return ((IdentityManager$userAttributes$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
