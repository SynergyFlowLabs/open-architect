package com.superwall.sdk.identity;

import com.superwall.sdk.Superwall;
import com.superwall.sdk.analytics.internal.TrackingKt;
import com.superwall.sdk.analytics.internal.trackable.InternalSuperwallEvent;
import java.util.HashMap;
import java.util.Map;
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
@f(c = "com.superwall.sdk.identity.IdentityManager$_mergeUserAttributes$1$1", f = "IdentityManager.kt", i = {}, l = {295}, m = "invokeSuspend", n = {}, s = {})
final class IdentityManager$_mergeUserAttributes$1$1 extends o implements Function2<s0, d<? super Unit>, Object> {
    final /* synthetic */ Map<String, Object> $mergedAttributes;
    int label;
    final /* synthetic */ IdentityManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IdentityManager$_mergeUserAttributes$1$1(IdentityManager identityManager, Map<String, Object> map, d<? super IdentityManager$_mergeUserAttributes$1$1> dVar) {
        super(2, dVar);
        this.this$0 = identityManager;
        this.$mergedAttributes = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new IdentityManager$_mergeUserAttributes$1$1(this.this$0, this.$mergedAttributes, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = b.l();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.m(obj);
            InternalSuperwallEvent.Attributes attributes = new InternalSuperwallEvent.Attributes(this.this$0.deviceHelper.getAppInstalledAtString(), new HashMap(this.$mergedAttributes));
            Superwall companion = Superwall.Companion.getInstance();
            this.label = 1;
            if (TrackingKt.track(companion, attributes, this) == objL) {
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
        return ((IdentityManager$_mergeUserAttributes$1$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
