package com.superwall.sdk.paywall.presentation.internal.operators;

import com.superwall.sdk.Superwall;
import com.superwall.sdk.analytics.internal.TrackingKt;
import com.superwall.sdk.analytics.internal.trackable.InternalSuperwallEvent;
import com.superwall.sdk.models.triggers.InternalTriggerResult;
import com.superwall.sdk.paywall.presentation.internal.PresentationRequest;
import com.superwall.sdk.paywall.presentation.internal.request.PresentationInfo;
import com.superwall.sdk.paywall.presentation.rule_logic.RuleEvaluationOutcome;
import com.superwall.sdk.paywall.view.PaywallView;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.k0;
import kotlinx.coroutines.flow.j0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class GetPresenterKt {

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.internal.operators.GetPresenterKt$attemptTriggerFire$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.presentation.internal.operators.GetPresenterKt", f = "GetPresenter.kt", i = {}, l = {109}, m = "attemptTriggerFire", n = {}, s = {})
    static final class AnonymousClass1 extends d {
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
            return GetPresenterKt.attemptTriggerFire(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.internal.operators.GetPresenterKt$getPresenterIfNecessary$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.paywall.presentation.internal.operators.GetPresenterKt", f = "GetPresenter.kt", i = {1, 1}, l = {41, com.planner5d.library.engine.input.f.b.f160710n, com.planner5d.library.engine.input.f.b.X}, m = "getPresenterIfNecessary", n = {"$this$getPresenterIfNecessary", "paywallStatePublisher"}, s = {"L$0", "L$1"})
    static final class C26901 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C26901(kotlin.coroutines.d<? super C26901> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GetPresenterKt.getPresenterIfNecessary(null, null, null, null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public static final Object attemptTriggerFire(@NotNull Superwall superwall, @NotNull PresentationRequest presentationRequest, @NotNull InternalTriggerResult internalTriggerResult, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        AnonymousClass1 anonymousClass1;
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
        Object obj = anonymousClass1.result;
        Object objL = b.l();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            ResultKt.m(obj);
            String eventName = presentationRequest.getPresentationInfo().getEventName();
            if (eventName == null) {
                return Unit.f312394a;
            }
            PresentationInfo presentationInfo = presentationRequest.getPresentationInfo();
            if ((presentationInfo instanceof PresentationInfo.ExplicitTrigger) || (presentationInfo instanceof PresentationInfo.ImplicitTrigger)) {
                if ((internalTriggerResult instanceof InternalTriggerResult.Error) || (internalTriggerResult instanceof InternalTriggerResult.PlacementNotFound)) {
                    return Unit.f312394a;
                }
            } else if (!(presentationInfo instanceof PresentationInfo.FromIdentifier)) {
                throw new k0();
            }
            InternalSuperwallEvent.TriggerFire triggerFire = new InternalSuperwallEvent.TriggerFire(internalTriggerResult, eventName, null, 4, null);
            anonymousClass1.label = 1;
            if (TrackingKt.track(superwall, triggerFire, anonymousClass1) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            ((Result) obj).j();
        }
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009b  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00df A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d6, code lost:
    
        if (r5.emit(r1, r3) == r4) goto L43;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object getPresenterIfNecessary(@org.jetbrains.annotations.NotNull com.superwall.sdk.Superwall r18, @org.jetbrains.annotations.NotNull com.superwall.sdk.paywall.view.PaywallView r19, @org.jetbrains.annotations.NotNull com.superwall.sdk.paywall.presentation.rule_logic.RuleEvaluationOutcome r20, @org.jetbrains.annotations.NotNull com.superwall.sdk.paywall.presentation.internal.PresentationRequest r21, @org.jetbrains.annotations.Nullable kotlinx.coroutines.flow.j0<com.superwall.sdk.paywall.presentation.internal.state.PaywallState> r22, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super android.app.Activity> r23) throws com.superwall.sdk.paywall.presentation.internal.PaywallPresentationRequestStatusReason.NoPresenter {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.paywall.presentation.internal.operators.GetPresenterKt.getPresenterIfNecessary(com.superwall.sdk.Superwall, com.superwall.sdk.paywall.view.PaywallView, com.superwall.sdk.paywall.presentation.rule_logic.RuleEvaluationOutcome, com.superwall.sdk.paywall.presentation.internal.PresentationRequest, kotlinx.coroutines.flow.j0, kotlin.coroutines.d):java.lang.Object");
    }

    public static /* synthetic */ Object getPresenterIfNecessary$default(Superwall superwall, PaywallView paywallView, RuleEvaluationOutcome ruleEvaluationOutcome, PresentationRequest presentationRequest, j0 j0Var, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            j0Var = null;
        }
        return getPresenterIfNecessary(superwall, paywallView, ruleEvaluationOutcome, presentationRequest, j0Var, dVar);
    }
}
