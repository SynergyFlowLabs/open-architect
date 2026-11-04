package com.superwall.sdk.web;

import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.ReferrerDetails;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.web.DeepLinkReferrer$checkForReferral$2", f = "DeepLinkReferrer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class DeepLinkReferrer$checkForReferral$2 extends o implements Function2<s0, kotlin.coroutines.d<? super String>, Object> {
    int label;
    final /* synthetic */ DeepLinkReferrer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeepLinkReferrer$checkForReferral$2(DeepLinkReferrer deepLinkReferrer, kotlin.coroutines.d<? super DeepLinkReferrer$checkForReferral$2> dVar) {
        super(2, dVar);
        this.this$0 = deepLinkReferrer;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new DeepLinkReferrer$checkForReferral$2(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ReferrerDetails installReferrer;
        String installReferrer2;
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(obj);
        while (true) {
            InstallReferrerClient referrerClient = this.this$0.getReferrerClient();
            if (referrerClient != null) {
                int i10 = 7 & 1;
                if (referrerClient.isReady()) {
                    break;
                }
            }
        }
        InstallReferrerClient referrerClient2 = this.this$0.getReferrerClient();
        if (referrerClient2 == null || (installReferrer = referrerClient2.getInstallReferrer()) == null || (installReferrer2 = installReferrer.getInstallReferrer()) == null) {
            return null;
        }
        return installReferrer2.toString();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super String> dVar) {
        return ((DeepLinkReferrer$checkForReferral$2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
