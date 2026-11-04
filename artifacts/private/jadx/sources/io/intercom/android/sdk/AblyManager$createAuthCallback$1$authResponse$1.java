package io.intercom.android.sdk;

import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.models.AblyAuthResponse;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.AblyManager$createAuthCallback$1$authResponse$1", f = "AblyManager.kt", i = {}, l = {212}, m = "invokeSuspend", n = {}, s = {})
final class AblyManager$createAuthCallback$1$authResponse$1 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super NetworkResponse<? extends AblyAuthResponse>>, Object> {
    int label;
    final /* synthetic */ AblyManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AblyManager$createAuthCallback$1$authResponse$1(AblyManager ablyManager, kotlin.coroutines.d<? super AblyManager$createAuthCallback$1$authResponse$1> dVar) {
        super(2, dVar);
        this.this$0 = ablyManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new AblyManager$createAuthCallback$1$authResponse$1(this.this$0, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(s0 s0Var, kotlin.coroutines.d<? super NetworkResponse<? extends AblyAuthResponse>> dVar) {
        return invoke2(s0Var, (kotlin.coroutines.d<? super NetworkResponse<AblyAuthResponse>>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return obj;
        }
        ResultKt.m(obj);
        MessengerApi messengerApi = this.this$0.messengerApi;
        this.label = 1;
        Object ablyAuthTokenSuspend$default = MessengerApi.DefaultImpls.getAblyAuthTokenSuspend$default(messengerApi, null, this, 1, null);
        return ablyAuthTokenSuspend$default == objL ? objL : ablyAuthTokenSuspend$default;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(s0 s0Var, kotlin.coroutines.d<? super NetworkResponse<AblyAuthResponse>> dVar) {
        return ((AblyManager$createAuthCallback$1$authResponse$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
