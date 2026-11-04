package com.superwall.sdk.identity;

import com.superwall.sdk.Superwall;
import com.superwall.sdk.analytics.internal.TrackingKt;
import com.superwall.sdk.analytics.internal.trackable.InternalSuperwallEvent;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.identity.IdentityManager$identify$1$1$1$2", f = "IdentityManager.kt", i = {}, l = {185}, m = "invokeSuspend", n = {}, s = {})
final class IdentityManager$identify$1$1$1$2 extends o implements Function2<s0, d<? super Unit>, Object> {
    int label;

    IdentityManager$identify$1$1$1$2(d<? super IdentityManager$identify$1$1$1$2> dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new IdentityManager$identify$1$1$1$2(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = b.l();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.m(obj);
            int i11 = 5 << 0;
            InternalSuperwallEvent.IdentityAlias identityAlias = new InternalSuperwallEvent.IdentityAlias(null, 1, null);
            Superwall companion = Superwall.Companion.getInstance();
            this.label = 1;
            if (TrackingKt.track(companion, identityAlias, this) == objL) {
                return objL;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            ((Result) obj).j();
        }
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
        return ((IdentityManager$identify$1$1$1$2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
