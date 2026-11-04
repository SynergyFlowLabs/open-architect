package com.superwall.sdk.paywall.presentation.get_presentation_result;

import com.superwall.sdk.Superwall;
import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import com.superwall.sdk.paywall.presentation.get_paywall.PaywallComponents;
import com.superwall.sdk.paywall.presentation.internal.GetPaywallComponentsKt;
import com.superwall.sdk.paywall.presentation.internal.PaywallPresentationRequestStatusReason;
import com.superwall.sdk.paywall.presentation.internal.PresentationRequest;
import com.superwall.sdk.paywall.presentation.internal.PresentationRequestType;
import com.superwall.sdk.paywall.presentation.result.PresentationResult;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class InternalGetPresentationResultKt {

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.get_presentation_result.InternalGetPresentationResultKt$getPresentationResult$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.presentation.get_presentation_result.InternalGetPresentationResultKt", f = "InternalGetPresentationResult.kt", i = {0}, l = {15}, m = "getPresentationResult", n = {"request"}, s = {"L$0"})
    static final class AnonymousClass1 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InternalGetPresentationResultKt.getPresentationResult(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    @Nullable
    public static final Object getPresentationResult(@NotNull Superwall superwall, @NotNull PresentationRequest presentationRequest, @NotNull kotlin.coroutines.d<? super PresentationResult> dVar) {
        AnonymousClass1 anonymousClass1;
        Object paywallComponents$default;
        PresentationRequest presentationRequest2;
        if (dVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) dVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(dVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(dVar);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object obj = anonymousClass2.result;
        Object objL = b.l();
        int i11 = anonymousClass2.label;
        int i12 = 2 ^ 1;
        if (i11 == 0) {
            ResultKt.m(obj);
            anonymousClass2.L$0 = presentationRequest;
            anonymousClass2.label = 1;
            paywallComponents$default = GetPaywallComponentsKt.getPaywallComponents$default(superwall, presentationRequest, null, anonymousClass2, 2, null);
            if (paywallComponents$default == objL) {
                return objL;
            }
            presentationRequest2 = presentationRequest;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            presentationRequest2 = (PresentationRequest) anonymousClass2.L$0;
            ResultKt.m(obj);
            paywallComponents$default = ((Result) obj).j();
        }
        if (Result.h(paywallComponents$default)) {
            Result.a aVar = Result.Companion;
            paywallComponents$default = GetPresentationResultLogic.INSTANCE.convertTriggerResult(((PaywallComponents) paywallComponents$default).getRulesOutcome().getTriggerResult());
        }
        Object objM785constructorimpl = Result.m785constructorimpl(paywallComponents$default);
        Throwable thD = Result.d(objM785constructorimpl);
        if (thD == null) {
            return (PresentationResult) objM785constructorimpl;
        }
        if (thD instanceof PaywallPresentationRequestStatusReason) {
            return handle((PaywallPresentationRequestStatusReason) thD, presentationRequest2.getFlags().getType());
        }
        throw thD;
    }

    private static final PresentationResult handle(PaywallPresentationRequestStatusReason paywallPresentationRequestStatusReason, PresentationRequestType presentationRequestType) {
        if (!Intrinsics.areEqual(presentationRequestType, PresentationRequestType.GetImplicitPresentationResult.INSTANCE)) {
            Logger.debug$default(Logger.INSTANCE, LogLevel.info, LogScope.paywallPresentation, "Paywall presentation error: " + paywallPresentationRequestStatusReason, null, null, 24, null);
        }
        if (paywallPresentationRequestStatusReason instanceof PaywallPresentationRequestStatusReason.NoPaywallView) {
            return new PresentationResult.PaywallNotAvailable();
        }
        if (paywallPresentationRequestStatusReason instanceof PaywallPresentationRequestStatusReason.NoAudienceMatch) {
            return new PresentationResult.NoAudienceMatch();
        }
        if (paywallPresentationRequestStatusReason instanceof PaywallPresentationRequestStatusReason.Holdout) {
            return new PresentationResult.Holdout(((PaywallPresentationRequestStatusReason.Holdout) paywallPresentationRequestStatusReason).getExperiment());
        }
        if (paywallPresentationRequestStatusReason instanceof PaywallPresentationRequestStatusReason.PlacementNotFound) {
            return new PresentationResult.PlacementNotFound();
        }
        if (!(paywallPresentationRequestStatusReason instanceof PaywallPresentationRequestStatusReason.DebuggerPresented) && !(paywallPresentationRequestStatusReason instanceof PaywallPresentationRequestStatusReason.NoPresenter) && !(paywallPresentationRequestStatusReason instanceof PaywallPresentationRequestStatusReason.PaywallAlreadyPresented) && !(paywallPresentationRequestStatusReason instanceof PaywallPresentationRequestStatusReason.NoConfig) && !(paywallPresentationRequestStatusReason instanceof PaywallPresentationRequestStatusReason.SubscriptionStatusTimeout)) {
            throw new k0();
        }
        return new PresentationResult.PaywallNotAvailable();
    }
}
