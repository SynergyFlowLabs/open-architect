package com.superwall.sdk.identity;

import com.superwall.sdk.config.models.ConfigState;
import com.superwall.sdk.misc.Config_AwaitFirstValidConfigKt;
import com.superwall.sdk.misc.String_SHA256Kt;
import com.superwall.sdk.models.config.Config;
import com.superwall.sdk.models.config.FeatureFlags;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.identity.IdentityManager$identify$1$1$1$1", f = "IdentityManager.kt", i = {}, l = {171}, m = "invokeSuspend", n = {}, s = {})
final class IdentityManager$identify$1$1$1$1 extends o implements Function2<s0, d<? super Unit>, Object> {
    final /* synthetic */ String $sanitizedUserId;
    int label;
    final /* synthetic */ IdentityManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IdentityManager$identify$1$1$1$1(IdentityManager identityManager, String str, d<? super IdentityManager$identify$1$1$1$1> dVar) {
        super(2, dVar);
        this.this$0 = identityManager;
        this.$sanitizedUserId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new IdentityManager$identify$1$1$1$1(this.this$0, this.$sanitizedUserId, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        FeatureFlags featureFlags;
        Integer numSha256MappedToRange;
        Object objL = b.l();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.m(obj);
            k0<ConfigState> configState$superwall_release = this.this$0.configManager.getConfigState$superwall_release();
            this.label = 1;
            obj = Config_AwaitFirstValidConfigKt.awaitFirstValidConfig(configState$superwall_release, this);
            if (obj == objL) {
                return objL;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
        }
        Config config = (Config) obj;
        if (config != null && (featureFlags = config.getFeatureFlags()) != null && featureFlags.getEnableUserIdSeed() && (numSha256MappedToRange = String_SHA256Kt.sha256MappedToRange(this.$sanitizedUserId)) != null) {
            IdentityManager identityManager = this.this$0;
            identityManager._seed = numSha256MappedToRange.intValue();
            identityManager.saveIds();
        }
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
        return ((IdentityManager$identify$1$1$1$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
