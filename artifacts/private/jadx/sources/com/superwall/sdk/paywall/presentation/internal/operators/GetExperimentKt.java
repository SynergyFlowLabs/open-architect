package com.superwall.sdk.paywall.presentation.internal.operators;

import com.superwall.sdk.Superwall;
import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import com.superwall.sdk.models.triggers.Experiment;
import com.superwall.sdk.models.triggers.InternalTriggerResult;
import com.superwall.sdk.models.triggers.TriggerRuleOccurrence;
import com.superwall.sdk.paywall.presentation.internal.PaywallPresentationRequestStatusReason;
import com.superwall.sdk.paywall.presentation.internal.PresentationRequest;
import com.superwall.sdk.paywall.presentation.internal.PresentationRequestType;
import com.superwall.sdk.paywall.presentation.internal.state.PaywallSkippedReason;
import com.superwall.sdk.paywall.presentation.internal.state.PaywallState;
import com.superwall.sdk.paywall.presentation.rule_logic.RuleEvaluationOutcome;
import com.superwall.sdk.storage.LocalStorage;
import com.superwall.sdk.storage.core_data.CoreDataManager;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import kotlinx.coroutines.flow.j0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class GetExperimentKt {

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.internal.operators.GetExperimentKt$getExperiment$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.presentation.internal.operators.GetExperimentKt", f = "GetExperiment.kt", i = {0, 0, 0, 1, 2, 3, 4, 5}, l = {47, 52, 55, com.planner5d.library.engine.input.f.b.f160707m, 61, 76}, m = "getExperiment", n = {"rulesOutcome", "paywallStatePublisher", "storage", "errorType", "paywallStatePublisher", "errorType", "errorType", "errorType"}, s = {"L$0", "L$1", "L$2", "L$0", "L$0", "L$0", "L$0", "L$0"})
    static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
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
            return GetExperimentKt.getExperiment(null, null, null, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object activateSession(Superwall superwall, PresentationRequest presentationRequest, RuleEvaluationOutcome ruleEvaluationOutcome, kotlin.coroutines.d<? super Unit> dVar) {
        if (Intrinsics.areEqual(presentationRequest.getFlags().getType(), PresentationRequestType.GetImplicitPresentationResult.INSTANCE) || Intrinsics.areEqual(presentationRequest.getFlags().getType(), PresentationRequestType.GetPresentationResult.INSTANCE)) {
            return Unit.f312394a;
        }
        Object objAttemptTriggerFire = GetPresenterKt.attemptTriggerFire(superwall, presentationRequest, ruleEvaluationOutcome.getTriggerResult(), dVar);
        return objAttemptTriggerFire == b.l() ? objAttemptTriggerFire : Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0086  */
    /* JADX WARN: Code duplicated, block: B:29:0x009e  */
    /* JADX WARN: Code duplicated, block: B:39:0x00da  */
    /* JADX WARN: Code duplicated, block: B:60:0x016e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Nullable
    public static final Object getExperiment(@NotNull Superwall superwall, @NotNull PresentationRequest presentationRequest, @NotNull RuleEvaluationOutcome ruleEvaluationOutcome, @NotNull Map<String, ? extends Object> map, @Nullable j0<PaywallState> j0Var, @NotNull LocalStorage localStorage, @NotNull kotlin.coroutines.d<? super Experiment> dVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        TriggerRuleOccurrence unsavedOccurrence;
        PaywallPresentationRequestStatusReason.Holdout holdout;
        PaywallState.Skipped skipped;
        PaywallPresentationRequestStatusReason.NoAudienceMatch noAudienceMatch;
        PaywallState.Skipped skipped2;
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
        switch (anonymousClass1.label) {
            case 0:
                ResultKt.m(obj);
                InternalTriggerResult triggerResult = ruleEvaluationOutcome.getTriggerResult();
                if (triggerResult instanceof InternalTriggerResult.Paywall) {
                    return ((InternalTriggerResult.Paywall) ruleEvaluationOutcome.getTriggerResult()).getExperiment();
                }
                if (triggerResult instanceof InternalTriggerResult.Holdout) {
                    anonymousClass1.L$0 = ruleEvaluationOutcome;
                    anonymousClass1.L$1 = j0Var;
                    anonymousClass1.L$2 = localStorage;
                    anonymousClass1.label = 1;
                    if (activateSession(superwall, presentationRequest, ruleEvaluationOutcome, anonymousClass1) != objL) {
                        unsavedOccurrence = ruleEvaluationOutcome.getUnsavedOccurrence();
                        if (unsavedOccurrence != null) {
                            CoreDataManager.save$default(localStorage.getCoreDataManager(), unsavedOccurrence, null, 2, null);
                        }
                        holdout = new PaywallPresentationRequestStatusReason.Holdout(((InternalTriggerResult.Holdout) ruleEvaluationOutcome.getTriggerResult()).getExperiment());
                        if (j0Var != null) {
                            throw holdout;
                        }
                        skipped = new PaywallState.Skipped(new PaywallSkippedReason.Holdout(((InternalTriggerResult.Holdout) ruleEvaluationOutcome.getTriggerResult()).getExperiment()));
                        anonymousClass1.L$0 = holdout;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.label = 2;
                        if (j0Var.emit(skipped, anonymousClass1) != objL) {
                            throw holdout;
                        }
                    }
                } else if (triggerResult instanceof InternalTriggerResult.NoAudienceMatch) {
                    anonymousClass1.L$0 = j0Var;
                    anonymousClass1.label = 3;
                    if (activateSession(superwall, presentationRequest, ruleEvaluationOutcome, anonymousClass1) != objL) {
                        noAudienceMatch = new PaywallPresentationRequestStatusReason.NoAudienceMatch();
                        if (j0Var != null) {
                            throw noAudienceMatch;
                        }
                        skipped2 = new PaywallState.Skipped(new PaywallSkippedReason.NoAudienceMatch());
                        anonymousClass1.L$0 = noAudienceMatch;
                        anonymousClass1.label = 4;
                        if (j0Var.emit(skipped2, anonymousClass1) != objL) {
                            throw noAudienceMatch;
                        }
                    }
                } else if (triggerResult instanceof InternalTriggerResult.PlacementNotFound) {
                    PaywallPresentationRequestStatusReason.PlacementNotFound placementNotFound = new PaywallPresentationRequestStatusReason.PlacementNotFound();
                    if (j0Var == null) {
                        throw placementNotFound;
                    }
                    PaywallState.Skipped skipped3 = new PaywallState.Skipped(new PaywallSkippedReason.PlacementNotFound());
                    anonymousClass1.L$0 = placementNotFound;
                    anonymousClass1.label = 5;
                    if (j0Var.emit(skipped3, anonymousClass1) != objL) {
                        throw placementNotFound;
                    }
                } else {
                    if (!(triggerResult instanceof InternalTriggerResult.Error)) {
                        throw new k0();
                    }
                    if (Intrinsics.areEqual(presentationRequest.getFlags().getType(), PresentationRequestType.GetImplicitPresentationResult.INSTANCE) || Intrinsics.areEqual(presentationRequest.getFlags().getType(), PresentationRequestType.GetPresentationResult.INSTANCE)) {
                        Logger.INSTANCE.debug(LogLevel.error, LogScope.paywallPresentation, "Error Getting Paywall view", map, ((InternalTriggerResult.Error) ruleEvaluationOutcome.getTriggerResult()).getError());
                    }
                    PaywallPresentationRequestStatusReason.NoPaywallView noPaywallView = new PaywallPresentationRequestStatusReason.NoPaywallView();
                    if (j0Var == null) {
                        throw noPaywallView;
                    }
                    PaywallState.PresentationError presentationError = new PaywallState.PresentationError(((InternalTriggerResult.Error) ruleEvaluationOutcome.getTriggerResult()).getError());
                    anonymousClass1.L$0 = noPaywallView;
                    anonymousClass1.label = 6;
                    if (j0Var.emit(presentationError, anonymousClass1) != objL) {
                        throw noPaywallView;
                    }
                }
                return objL;
            case 1:
                localStorage = (LocalStorage) anonymousClass1.L$2;
                j0Var = (j0) anonymousClass1.L$1;
                ruleEvaluationOutcome = (RuleEvaluationOutcome) anonymousClass1.L$0;
                ResultKt.m(obj);
                unsavedOccurrence = ruleEvaluationOutcome.getUnsavedOccurrence();
                if (unsavedOccurrence != null) {
                    CoreDataManager.save$default(localStorage.getCoreDataManager(), unsavedOccurrence, null, 2, null);
                }
                holdout = new PaywallPresentationRequestStatusReason.Holdout(((InternalTriggerResult.Holdout) ruleEvaluationOutcome.getTriggerResult()).getExperiment());
                if (j0Var != null) {
                    throw holdout;
                }
                skipped = new PaywallState.Skipped(new PaywallSkippedReason.Holdout(((InternalTriggerResult.Holdout) ruleEvaluationOutcome.getTriggerResult()).getExperiment()));
                anonymousClass1.L$0 = holdout;
                anonymousClass1.L$1 = null;
                anonymousClass1.L$2 = null;
                anonymousClass1.label = 2;
                if (j0Var.emit(skipped, anonymousClass1) != objL) {
                    return objL;
                }
                throw holdout;
            case 2:
            case 4:
            case 5:
            case 6:
                PaywallPresentationRequestStatusReason paywallPresentationRequestStatusReason = (PaywallPresentationRequestStatusReason) anonymousClass1.L$0;
                ResultKt.m(obj);
                throw paywallPresentationRequestStatusReason;
            case 3:
                j0Var = (j0) anonymousClass1.L$0;
                ResultKt.m(obj);
                noAudienceMatch = new PaywallPresentationRequestStatusReason.NoAudienceMatch();
                if (j0Var != null) {
                    throw noAudienceMatch;
                }
                skipped2 = new PaywallState.Skipped(new PaywallSkippedReason.NoAudienceMatch());
                anonymousClass1.L$0 = noAudienceMatch;
                anonymousClass1.label = 4;
                if (j0Var.emit(skipped2, anonymousClass1) != objL) {
                    return objL;
                }
                throw noAudienceMatch;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static /* synthetic */ Object getExperiment$default(Superwall superwall, PresentationRequest presentationRequest, RuleEvaluationOutcome ruleEvaluationOutcome, Map map, j0 j0Var, LocalStorage localStorage, kotlin.coroutines.d dVar, int i10, Object obj) throws Throwable {
        if ((i10 & 8) != 0) {
            j0Var = null;
        }
        return getExperiment(superwall, presentationRequest, ruleEvaluationOutcome, map, j0Var, localStorage, dVar);
    }
}
