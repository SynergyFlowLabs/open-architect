package com.superwall.sdk.identity;

import com.superwall.sdk.config.ConfigManager;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.identity.IdentityManager$identify$1$1$1$4", f = "IdentityManager.kt", i = {}, l = {198}, m = "invokeSuspend", n = {}, s = {})
final class IdentityManager$identify$1$1$1$4 extends o implements Function2<s0, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ IdentityManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IdentityManager$identify$1$1$1$4(IdentityManager identityManager, d<? super IdentityManager$identify$1$1$1$4> dVar) {
        super(2, dVar);
        this.this$0 = identityManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new IdentityManager$identify$1$1$1$4(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = b.l();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.m(obj);
            ConfigManager configManager = this.this$0.configManager;
            this.label = 1;
            if (configManager.getAssignments(this) == objL) {
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
        return ((IdentityManager$identify$1$1$1$4) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
