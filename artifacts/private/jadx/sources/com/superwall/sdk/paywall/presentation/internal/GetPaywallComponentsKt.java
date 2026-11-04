package com.superwall.sdk.paywall.presentation.internal;

import android.app.Activity;
import com.superwall.sdk.Superwall;
import com.superwall.sdk.dependencies.DependencyContainer;
import com.superwall.sdk.misc.Either;
import com.superwall.sdk.models.assignment.ConfirmableAssignment;
import com.superwall.sdk.models.assignment.ConfirmedAssignment;
import com.superwall.sdk.paywall.presentation.get_paywall.PaywallComponents;
import com.superwall.sdk.paywall.presentation.internal.operators.CheckDebuggerPresentationKt;
import com.superwall.sdk.paywall.presentation.internal.operators.ConfirmHoldoutAssignmentKt;
import com.superwall.sdk.paywall.presentation.internal.operators.ConfirmPaywallAssignmentKt;
import com.superwall.sdk.paywall.presentation.internal.operators.EvaluateRulesKt;
import com.superwall.sdk.paywall.presentation.internal.operators.GetPaywallVCKt;
import com.superwall.sdk.paywall.presentation.internal.operators.GetPresenterKt;
import com.superwall.sdk.paywall.presentation.internal.operators.WaitForSubsStatusAndConfigKt;
import com.superwall.sdk.paywall.presentation.internal.state.PaywallState;
import com.superwall.sdk.paywall.presentation.rule_logic.RuleEvaluationOutcome;
import com.superwall.sdk.paywall.view.PaywallView;
import com.superwall.sdk.utilities.ErrorTrackingKt;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.j;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nGetPaywallComponents.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetPaywallComponents.kt\ncom/superwall/sdk/paywall/presentation/internal/GetPaywallComponentsKt\n+ 2 ErrorTracking.kt\ncom/superwall/sdk/utilities/ErrorTrackingKt\n+ 3 Either.kt\ncom/superwall/sdk/misc/EitherKt\n*L\n1#1,103:1\n136#2,10:104\n136#2,10:118\n122#3,4:114\n*S KotlinDebug\n*F\n+ 1 GetPaywallComponents.kt\ncom/superwall/sdk/paywall/presentation/internal/GetPaywallComponentsKt\n*L\n34#1:104,10\n67#1:118,10\n64#1:114,4\n*E\n"})
public final class GetPaywallComponentsKt {

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.internal.GetPaywallComponentsKt$confirmAssignment$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.presentation.internal.GetPaywallComponentsKt", f = "GetPaywallComponents.kt", i = {0, 0, 1, 1}, l = {com.planner5d.library.engine.input.f.b.V, com.planner5d.library.engine.input.f.b.f160708m0}, m = "confirmAssignment", n = {"$this$confirmAssignment", "request", "$this$confirmAssignment", "request"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
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
            return GetPaywallComponentsKt.confirmAssignment(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.internal.GetPaywallComponentsKt$getPaywallComponents$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.paywall.presentation.internal.GetPaywallComponentsKt", f = "GetPaywallComponents.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4}, l = {35, 40, 42, 48, 50}, m = "getPaywallComponents", n = {"$this$getPaywallComponents", "request", "publisher", "$this$getPaywallComponents", "request", "publisher", "debugInfo", "$this$getPaywallComponents", "request", "publisher", "debugInfo", "$this$getPaywallComponents", "request", "publisher", "debugInfo", "outcome", "$this$getPaywallComponents", "request", "debugInfo", "paywallView", "outcome"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
    static final class C26871 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        C26871(kotlin.coroutines.d<? super C26871> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object paywallComponents = GetPaywallComponentsKt.getPaywallComponents(null, null, null, this);
            return paywallComponents == b.l() ? paywallComponents : Result.a(paywallComponents);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.internal.GetPaywallComponentsKt$getPaywallComponentsSync$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.paywall.presentation.internal.GetPaywallComponentsKt$getPaywallComponentsSync$1", f = "GetPaywallComponents.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
    static final class C26881 extends o implements Function2<s0, kotlin.coroutines.d<? super Result<? extends PaywallComponents>>, Object> {
        final /* synthetic */ j0<PaywallState> $publisher;
        final /* synthetic */ PresentationRequest $request;
        final /* synthetic */ Superwall $this_getPaywallComponentsSync;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C26881(Superwall superwall, PresentationRequest presentationRequest, j0<PaywallState> j0Var, kotlin.coroutines.d<? super C26881> dVar) {
            super(2, dVar);
            this.$this_getPaywallComponentsSync = superwall;
            this.$request = presentationRequest;
            this.$publisher = j0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C26881(this.$this_getPaywallComponentsSync, this.$request, this.$publisher, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(s0 s0Var, kotlin.coroutines.d<? super Result<? extends PaywallComponents>> dVar) {
            return invoke2(s0Var, (kotlin.coroutines.d<? super Result<PaywallComponents>>) dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object paywallComponents;
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                Superwall superwall = this.$this_getPaywallComponentsSync;
                PresentationRequest presentationRequest = this.$request;
                j0<PaywallState> j0Var = this.$publisher;
                this.label = 1;
                paywallComponents = GetPaywallComponentsKt.getPaywallComponents(superwall, presentationRequest, j0Var, this);
                if (paywallComponents == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                paywallComponents = ((Result) obj).j();
            }
            return Result.a(paywallComponents);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(s0 s0Var, kotlin.coroutines.d<? super Result<PaywallComponents>> dVar) {
            return ((C26881) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009b A[Catch: all -> 0x00ea, TryCatch #0 {all -> 0x00ea, blocks: (B:16:0x003d, B:32:0x0095, B:34:0x009b, B:36:0x00cb, B:38:0x00dc, B:40:0x00e2, B:41:0x00e9, B:21:0x0060, B:28:0x0082, B:24:0x0067), top: B:50:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00cb A[Catch: all -> 0x00ea, TryCatch #0 {all -> 0x00ea, blocks: (B:16:0x003d, B:32:0x0095, B:34:0x009b, B:36:0x00cb, B:38:0x00dc, B:40:0x00e2, B:41:0x00e9, B:21:0x0060, B:28:0x0082, B:24:0x0067), top: B:50:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00da  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e2 A[Catch: all -> 0x00ea, TryCatch #0 {all -> 0x00ea, blocks: (B:16:0x003d, B:32:0x0095, B:34:0x009b, B:36:0x00cb, B:38:0x00dc, B:40:0x00e2, B:41:0x00e9, B:21:0x0060, B:28:0x0082, B:24:0x0067), top: B:50:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Nullable
    public static final Object confirmAssignment(@NotNull Superwall superwall, @NotNull PresentationRequest presentationRequest, @NotNull kotlin.coroutines.d<? super Either<ConfirmedAssignment, Throwable>> dVar) {
        AnonymousClass1 anonymousClass1;
        Superwall superwall2;
        PresentationRequest presentationRequest2;
        Object objEvaluateRules;
        Superwall superwall3;
        PresentationRequest presentationRequest3;
        ConfirmableAssignment confirmableAssignment;
        ConfirmedAssignment confirmedAssignment;
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
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                anonymousClass2.L$0 = superwall;
                anonymousClass2.L$1 = presentationRequest;
                anonymousClass2.label = 1;
                int i12 = 6 << 0;
                if (WaitForSubsStatusAndConfigKt.waitForEntitlementsAndConfig$default(superwall, presentationRequest, null, null, anonymousClass2, 6, null) != objL) {
                    superwall2 = superwall;
                    presentationRequest2 = presentationRequest;
                }
                return objL;
            }
            if (i11 == 1) {
                presentationRequest2 = (PresentationRequest) anonymousClass2.L$1;
                superwall2 = (Superwall) anonymousClass2.L$0;
                ResultKt.m(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                PresentationRequest presentationRequest4 = (PresentationRequest) anonymousClass2.L$1;
                Superwall superwall4 = (Superwall) anonymousClass2.L$0;
                ResultKt.m(obj);
                objEvaluateRules = ((Result) obj).j();
                presentationRequest3 = presentationRequest4;
                superwall3 = superwall4;
            }
            if (!Result.m786isFailureimpl(objEvaluateRules)) {
                Throwable thD = Result.d(objEvaluateRules);
                Intrinsics.checkNotNull(thD);
                throw thD;
            }
            ResultKt.m(objEvaluateRules);
            ConfirmHoldoutAssignmentKt.confirmHoldoutAssignment$default(superwall3, presentationRequest3, (RuleEvaluationOutcome) objEvaluateRules, null, 4, null);
            ResultKt.m(objEvaluateRules);
            confirmableAssignment = ((RuleEvaluationOutcome) objEvaluateRules).getConfirmableAssignment();
            ConfirmPaywallAssignmentKt.confirmPaywallAssignment$default(superwall3, confirmableAssignment, presentationRequest3, presentationRequest3.getFlags().isDebuggerLaunched(), null, 8, null);
            if (confirmableAssignment != null) {
                confirmedAssignment = new ConfirmedAssignment(confirmableAssignment.getExperimentId(), confirmableAssignment.getVariant());
            } else {
                confirmedAssignment = null;
            }
            return new Either.Success(confirmedAssignment);
            anonymousClass2.L$0 = superwall2;
            anonymousClass2.L$1 = presentationRequest2;
            anonymousClass2.label = 2;
            objEvaluateRules = EvaluateRulesKt.evaluateRules(superwall2, presentationRequest2, anonymousClass2);
            if (objEvaluateRules != objL) {
                superwall3 = superwall2;
                presentationRequest3 = presentationRequest2;
                if (!Result.m786isFailureimpl(objEvaluateRules)) {
                    Throwable thD2 = Result.d(objEvaluateRules);
                    Intrinsics.checkNotNull(thD2);
                    throw thD2;
                }
                ResultKt.m(objEvaluateRules);
                ConfirmHoldoutAssignmentKt.confirmHoldoutAssignment$default(superwall3, presentationRequest3, (RuleEvaluationOutcome) objEvaluateRules, null, 4, null);
                ResultKt.m(objEvaluateRules);
                confirmableAssignment = ((RuleEvaluationOutcome) objEvaluateRules).getConfirmableAssignment();
                ConfirmPaywallAssignmentKt.confirmPaywallAssignment$default(superwall3, confirmableAssignment, presentationRequest3, presentationRequest3.getFlags().isDebuggerLaunched(), null, 8, null);
                if (confirmableAssignment != null) {
                    confirmedAssignment = new ConfirmedAssignment(confirmableAssignment.getExperimentId(), confirmableAssignment.getVariant());
                } else {
                    confirmedAssignment = null;
                }
                return new Either.Success(confirmedAssignment);
            }
            return objL;
        } catch (Throwable th2) {
            if (ErrorTrackingKt.shouldLog(th2)) {
                Superwall.Companion companion = Superwall.Companion;
                if (companion.getInitialized()) {
                    ErrorTrackingKt.trackError(companion.getInstance(), th2);
                }
            }
            return new Either.Failure(th2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x009a A[PHI: r0 r2 r3 r4 r5
      0x009a: PHI (r0v17 java.lang.Object) = (r0v16 java.lang.Object), (r0v25 java.lang.Object) binds: [B:43:0x0112, B:25:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x009a: PHI (r2v7 java.util.Map) = (r2v6 java.util.Map), (r2v17 java.util.Map) binds: [B:43:0x0112, B:25:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x009a: PHI (r3v6 kotlinx.coroutines.flow.j0<com.superwall.sdk.paywall.presentation.internal.state.PaywallState>) = 
      (r3v5 kotlinx.coroutines.flow.j0<com.superwall.sdk.paywall.presentation.internal.state.PaywallState>)
      (r3v17 kotlinx.coroutines.flow.j0<com.superwall.sdk.paywall.presentation.internal.state.PaywallState>)
     binds: [B:43:0x0112, B:25:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x009a: PHI (r4v6 com.superwall.sdk.paywall.presentation.internal.PresentationRequest) = 
      (r4v5 com.superwall.sdk.paywall.presentation.internal.PresentationRequest)
      (r4v19 com.superwall.sdk.paywall.presentation.internal.PresentationRequest)
     binds: [B:43:0x0112, B:25:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x009a: PHI (r5v5 com.superwall.sdk.Superwall) = (r5v4 com.superwall.sdk.Superwall), (r5v13 com.superwall.sdk.Superwall) binds: [B:43:0x0112, B:25:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x0114  */
    /* JADX WARN: Code duplicated, block: B:47:0x0142  */
    /* JADX WARN: Code duplicated, block: B:48:0x0143  */
    /* JADX WARN: Code duplicated, block: B:52:0x015f  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Nullable
    public static final Object getPaywallComponents(@NotNull Superwall superwall, @NotNull PresentationRequest presentationRequest, @Nullable j0<PaywallState> j0Var, @NotNull kotlin.coroutines.d<? super Result<PaywallComponents>> dVar) throws Throwable {
        C26871 c26871;
        Either failure;
        Superwall superwall2;
        PresentationRequest presentationRequest2;
        j0<PaywallState> j0Var2;
        Superwall superwall3;
        PresentationRequest presentationRequest3;
        j0<PaywallState> j0Var3;
        Map map;
        Object objEvaluateRules;
        Map map2;
        Superwall superwall4;
        PresentationRequest presentationRequest4;
        RuleEvaluationOutcome ruleEvaluationOutcome;
        j0<PaywallState> j0Var4;
        Object paywallView;
        C26871 c26872;
        Map map3;
        PresentationRequest presentationRequest5;
        RuleEvaluationOutcome ruleEvaluationOutcome2;
        PaywallView paywallView2;
        RuleEvaluationOutcome ruleEvaluationOutcome3;
        PresentationRequest presentationRequest6;
        Superwall superwall5;
        PaywallView paywallView3;
        Map map4;
        if (dVar instanceof C26871) {
            c26871 = (C26871) dVar;
            int i10 = c26871.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c26871.label = i10 - Integer.MIN_VALUE;
            } else {
                c26871 = new C26871(dVar);
            }
        } else {
            c26871 = new C26871(dVar);
        }
        C26871 c26873 = c26871;
        Object presenterIfNecessary = c26873.result;
        Object objL = b.l();
        int i11 = c26873.label;
        try {
            if (i11 == 0) {
                ResultKt.m(presenterIfNecessary);
                c26873.L$0 = superwall;
                c26873.L$1 = presentationRequest;
                c26873.L$2 = j0Var;
                c26873.label = 1;
                if (WaitForSubsStatusAndConfigKt.waitForEntitlementsAndConfig$default(superwall, presentationRequest, j0Var, null, c26873, 4, null) != objL) {
                    superwall2 = superwall;
                    presentationRequest2 = presentationRequest;
                    j0Var2 = j0Var;
                }
                return objL;
            }
            if (i11 == 1) {
                j0Var2 = (j0) c26873.L$2;
                presentationRequest2 = (PresentationRequest) c26873.L$1;
                superwall2 = (Superwall) c26873.L$0;
                ResultKt.m(presenterIfNecessary);
            } else {
                if (i11 == 2) {
                    map = (Map) c26873.L$3;
                    j0Var3 = (j0) c26873.L$2;
                    presentationRequest3 = (PresentationRequest) c26873.L$1;
                    superwall3 = (Superwall) c26873.L$0;
                    ResultKt.m(presenterIfNecessary);
                    c26873.L$0 = superwall3;
                    c26873.L$1 = presentationRequest3;
                    c26873.L$2 = j0Var3;
                    c26873.L$3 = map;
                    c26873.label = 3;
                    objEvaluateRules = EvaluateRulesKt.evaluateRules(superwall3, presentationRequest3, c26873);
                    if (objEvaluateRules == objL) {
                        Superwall superwall6 = superwall3;
                        map2 = map;
                        superwall4 = superwall6;
                        presentationRequest4 = presentationRequest3;
                        ResultKt.m(objEvaluateRules);
                        ruleEvaluationOutcome = (RuleEvaluationOutcome) objEvaluateRules;
                        ConfirmHoldoutAssignmentKt.confirmHoldoutAssignment$default(superwall4, presentationRequest4, ruleEvaluationOutcome, null, 4, null);
                        DependencyContainer dependencyContainer$superwall_release = superwall4.getDependencyContainer$superwall_release();
                        c26873.L$0 = superwall4;
                        c26873.L$1 = presentationRequest4;
                        c26873.L$2 = j0Var3;
                        c26873.L$3 = map2;
                        c26873.L$4 = ruleEvaluationOutcome;
                        c26873.label = 4;
                        j0Var4 = j0Var3;
                        paywallView = GetPaywallVCKt.getPaywallView(superwall4, presentationRequest4, ruleEvaluationOutcome, map2, j0Var4, dependencyContainer$superwall_release, c26873);
                        c26872 = c26873;
                        if (paywallView != objL) {
                            map3 = map2;
                            presentationRequest5 = presentationRequest4;
                            ruleEvaluationOutcome2 = ruleEvaluationOutcome;
                            ResultKt.m(paywallView);
                            paywallView2 = (PaywallView) paywallView;
                            c26872.L$0 = superwall4;
                            c26872.L$1 = presentationRequest5;
                            c26872.L$2 = map3;
                            c26872.L$3 = paywallView2;
                            c26872.L$4 = ruleEvaluationOutcome2;
                            c26872.label = 5;
                            presenterIfNecessary = GetPresenterKt.getPresenterIfNecessary(superwall4, paywallView2, ruleEvaluationOutcome2, presentationRequest5, j0Var4, c26872);
                            if (presenterIfNecessary != objL) {
                                ruleEvaluationOutcome3 = ruleEvaluationOutcome2;
                                presentationRequest6 = presentationRequest5;
                                superwall5 = superwall4;
                                paywallView3 = paywallView2;
                                map4 = map3;
                            }
                        }
                    }
                    return objL;
                }
                if (i11 == 3) {
                    map = (Map) c26873.L$3;
                    j0Var3 = (j0) c26873.L$2;
                    presentationRequest3 = (PresentationRequest) c26873.L$1;
                    superwall3 = (Superwall) c26873.L$0;
                    ResultKt.m(presenterIfNecessary);
                    objEvaluateRules = ((Result) presenterIfNecessary).j();
                    Superwall superwall7 = superwall3;
                    map2 = map;
                    superwall4 = superwall7;
                    presentationRequest4 = presentationRequest3;
                    ResultKt.m(objEvaluateRules);
                    ruleEvaluationOutcome = (RuleEvaluationOutcome) objEvaluateRules;
                    ConfirmHoldoutAssignmentKt.confirmHoldoutAssignment$default(superwall4, presentationRequest4, ruleEvaluationOutcome, null, 4, null);
                    DependencyContainer dependencyContainer$superwall_release2 = superwall4.getDependencyContainer$superwall_release();
                    c26873.L$0 = superwall4;
                    c26873.L$1 = presentationRequest4;
                    c26873.L$2 = j0Var3;
                    c26873.L$3 = map2;
                    c26873.L$4 = ruleEvaluationOutcome;
                    c26873.label = 4;
                    j0Var4 = j0Var3;
                    paywallView = GetPaywallVCKt.getPaywallView(superwall4, presentationRequest4, ruleEvaluationOutcome, map2, j0Var4, dependencyContainer$superwall_release2, c26873);
                    c26872 = c26873;
                    if (paywallView != objL) {
                        map3 = map2;
                        presentationRequest5 = presentationRequest4;
                        ruleEvaluationOutcome2 = ruleEvaluationOutcome;
                        ResultKt.m(paywallView);
                        paywallView2 = (PaywallView) paywallView;
                        c26872.L$0 = superwall4;
                        c26872.L$1 = presentationRequest5;
                        c26872.L$2 = map3;
                        c26872.L$3 = paywallView2;
                        c26872.L$4 = ruleEvaluationOutcome2;
                        c26872.label = 5;
                        presenterIfNecessary = GetPresenterKt.getPresenterIfNecessary(superwall4, paywallView2, ruleEvaluationOutcome2, presentationRequest5, j0Var4, c26872);
                        if (presenterIfNecessary != objL) {
                            ruleEvaluationOutcome3 = ruleEvaluationOutcome2;
                            presentationRequest6 = presentationRequest5;
                            superwall5 = superwall4;
                            paywallView3 = paywallView2;
                            map4 = map3;
                        }
                    }
                    return objL;
                }
                if (i11 == 4) {
                    RuleEvaluationOutcome ruleEvaluationOutcome4 = (RuleEvaluationOutcome) c26873.L$4;
                    Map map5 = (Map) c26873.L$3;
                    j0<PaywallState> j0Var5 = (j0) c26873.L$2;
                    presentationRequest5 = (PresentationRequest) c26873.L$1;
                    Superwall superwall8 = (Superwall) c26873.L$0;
                    ResultKt.m(presenterIfNecessary);
                    paywallView = ((Result) presenterIfNecessary).j();
                    ruleEvaluationOutcome2 = ruleEvaluationOutcome4;
                    superwall4 = superwall8;
                    c26872 = c26873;
                    j0Var4 = j0Var5;
                    map3 = map5;
                    ResultKt.m(paywallView);
                    paywallView2 = (PaywallView) paywallView;
                    c26872.L$0 = superwall4;
                    c26872.L$1 = presentationRequest5;
                    c26872.L$2 = map3;
                    c26872.L$3 = paywallView2;
                    c26872.L$4 = ruleEvaluationOutcome2;
                    c26872.label = 5;
                    presenterIfNecessary = GetPresenterKt.getPresenterIfNecessary(superwall4, paywallView2, ruleEvaluationOutcome2, presentationRequest5, j0Var4, c26872);
                    if (presenterIfNecessary != objL) {
                        ruleEvaluationOutcome3 = ruleEvaluationOutcome2;
                        presentationRequest6 = presentationRequest5;
                        superwall5 = superwall4;
                        paywallView3 = paywallView2;
                        map4 = map3;
                    }
                    return objL;
                }
                if (i11 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ruleEvaluationOutcome3 = (RuleEvaluationOutcome) c26873.L$4;
                paywallView3 = (PaywallView) c26873.L$3;
                map4 = (Map) c26873.L$2;
                PresentationRequest presentationRequest7 = (PresentationRequest) c26873.L$1;
                Superwall superwall9 = (Superwall) c26873.L$0;
                ResultKt.m(presenterIfNecessary);
                presentationRequest6 = presentationRequest7;
                superwall5 = superwall9;
            }
            ConfirmPaywallAssignmentKt.confirmPaywallAssignment$default(superwall5, ruleEvaluationOutcome3.getConfirmableAssignment(), presentationRequest6, presentationRequest6.getFlags().isDebuggerLaunched(), null, 8, null);
            failure = new Either.Success(new PaywallComponents(paywallView3, (Activity) presenterIfNecessary, ruleEvaluationOutcome3, map4));
            if (failure instanceof Either.Success) {
                Result.a aVar = Result.Companion;
                return Result.m785constructorimpl(((Either.Success) failure).getValue());
            }
            if (failure instanceof Either.Failure) {
                throw new k0();
            }
            Result.a aVar2 = Result.Companion;
            return Result.m785constructorimpl(ResultKt.createFailure(((Either.Failure) failure).getError()));
            Map mapEmptyMap = MapsKt.emptyMap();
            c26873.L$0 = superwall2;
            c26873.L$1 = presentationRequest2;
            c26873.L$2 = j0Var2;
            c26873.L$3 = mapEmptyMap;
            c26873.label = 2;
            if (CheckDebuggerPresentationKt.checkDebuggerPresentation(superwall2, presentationRequest2, j0Var2, c26873) != objL) {
                superwall3 = superwall2;
                presentationRequest3 = presentationRequest2;
                j0Var3 = j0Var2;
                map = mapEmptyMap;
                c26873.L$0 = superwall3;
                c26873.L$1 = presentationRequest3;
                c26873.L$2 = j0Var3;
                c26873.L$3 = map;
                c26873.label = 3;
                objEvaluateRules = EvaluateRulesKt.evaluateRules(superwall3, presentationRequest3, c26873);
                if (objEvaluateRules == objL) {
                    Superwall superwall10 = superwall3;
                    map2 = map;
                    superwall4 = superwall10;
                    presentationRequest4 = presentationRequest3;
                    ResultKt.m(objEvaluateRules);
                    ruleEvaluationOutcome = (RuleEvaluationOutcome) objEvaluateRules;
                    ConfirmHoldoutAssignmentKt.confirmHoldoutAssignment$default(superwall4, presentationRequest4, ruleEvaluationOutcome, null, 4, null);
                    DependencyContainer dependencyContainer$superwall_release3 = superwall4.getDependencyContainer$superwall_release();
                    c26873.L$0 = superwall4;
                    c26873.L$1 = presentationRequest4;
                    c26873.L$2 = j0Var3;
                    c26873.L$3 = map2;
                    c26873.L$4 = ruleEvaluationOutcome;
                    c26873.label = 4;
                    j0Var4 = j0Var3;
                    paywallView = GetPaywallVCKt.getPaywallView(superwall4, presentationRequest4, ruleEvaluationOutcome, map2, j0Var4, dependencyContainer$superwall_release3, c26873);
                    c26872 = c26873;
                    if (paywallView != objL) {
                        map3 = map2;
                        presentationRequest5 = presentationRequest4;
                        ruleEvaluationOutcome2 = ruleEvaluationOutcome;
                        ResultKt.m(paywallView);
                        paywallView2 = (PaywallView) paywallView;
                        c26872.L$0 = superwall4;
                        c26872.L$1 = presentationRequest5;
                        c26872.L$2 = map3;
                        c26872.L$3 = paywallView2;
                        c26872.L$4 = ruleEvaluationOutcome2;
                        c26872.label = 5;
                        presenterIfNecessary = GetPresenterKt.getPresenterIfNecessary(superwall4, paywallView2, ruleEvaluationOutcome2, presentationRequest5, j0Var4, c26872);
                        if (presenterIfNecessary != objL) {
                            ruleEvaluationOutcome3 = ruleEvaluationOutcome2;
                            presentationRequest6 = presentationRequest5;
                            superwall5 = superwall4;
                            paywallView3 = paywallView2;
                            map4 = map3;
                            ConfirmPaywallAssignmentKt.confirmPaywallAssignment$default(superwall5, ruleEvaluationOutcome3.getConfirmableAssignment(), presentationRequest6, presentationRequest6.getFlags().isDebuggerLaunched(), null, 8, null);
                            failure = new Either.Success(new PaywallComponents(paywallView3, (Activity) presenterIfNecessary, ruleEvaluationOutcome3, map4));
                            if (failure instanceof Either.Success) {
                                Result.a aVar3 = Result.Companion;
                                return Result.m785constructorimpl(((Either.Success) failure).getValue());
                            }
                            if (failure instanceof Either.Failure) {
                                throw new k0();
                            }
                            Result.a aVar4 = Result.Companion;
                            return Result.m785constructorimpl(ResultKt.createFailure(((Either.Failure) failure).getError()));
                        }
                    }
                }
            }
            return objL;
        } catch (Throwable th2) {
            if (ErrorTrackingKt.shouldLog(th2)) {
                Superwall.Companion companion = Superwall.Companion;
                if (companion.getInitialized()) {
                    ErrorTrackingKt.trackError(companion.getInstance(), th2);
                }
            }
            failure = new Either.Failure(th2);
        }
    }

    public static /* synthetic */ Object getPaywallComponents$default(Superwall superwall, PresentationRequest presentationRequest, j0 j0Var, kotlin.coroutines.d dVar, int i10, Object obj) throws Throwable {
        if ((i10 & 2) != 0) {
            j0Var = null;
        }
        return getPaywallComponents(superwall, presentationRequest, j0Var, dVar);
    }

    @NotNull
    public static final Object getPaywallComponentsSync(@NotNull Superwall superwall, @NotNull PresentationRequest request, @Nullable j0<PaywallState> j0Var) {
        Intrinsics.checkNotNullParameter(superwall, "<this>");
        Intrinsics.checkNotNullParameter(request, "request");
        return ((Result) j.b(null, new C26881(superwall, request, j0Var, null), 1, null)).j();
    }

    public static /* synthetic */ Object getPaywallComponentsSync$default(Superwall superwall, PresentationRequest presentationRequest, j0 j0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j0Var = null;
        }
        return getPaywallComponentsSync(superwall, presentationRequest, j0Var);
    }
}
