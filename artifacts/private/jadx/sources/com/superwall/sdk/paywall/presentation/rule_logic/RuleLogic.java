package com.superwall.sdk.paywall.presentation.rule_logic;

import androidx.core.app.w;
import com.superwall.sdk.Superwall;
import com.superwall.sdk.config.Assignments;
import com.superwall.sdk.dependencies.RuleAttributesFactory;
import com.superwall.sdk.misc.Either;
import com.superwall.sdk.models.assignment.ConfirmableAssignment;
import com.superwall.sdk.models.events.EventData;
import com.superwall.sdk.models.triggers.Experiment;
import com.superwall.sdk.models.triggers.InternalTriggerResult;
import com.superwall.sdk.models.triggers.MatchedItem;
import com.superwall.sdk.models.triggers.Trigger;
import com.superwall.sdk.models.triggers.TriggerRule;
import com.superwall.sdk.paywall.presentation.rule_logic.expression_evaluator.ExpressionEvaluating;
import com.superwall.sdk.storage.LocalStorage;
import com.superwall.sdk.utilities.ErrorTrackingKt;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nRuleLogic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RuleLogic.kt\ncom/superwall/sdk/paywall/presentation/rule_logic/RuleLogic\n+ 2 ErrorTracking.kt\ncom/superwall/sdk/utilities/ErrorTrackingKt\n*L\n1#1,134:1\n136#2,10:135\n*S KotlinDebug\n*F\n+ 1 RuleLogic.kt\ncom/superwall/sdk/paywall/presentation/rule_logic/RuleLogic\n*L\n45#1:135,10\n*E\n"})
public final class RuleLogic {

    @NotNull
    private final Assignments assignments;

    @NotNull
    private final RuleAttributesFactory factory;

    @NotNull
    private final ExpressionEvaluating ruleEvaluator;

    @NotNull
    private final LocalStorage storage;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Experiment.Variant.VariantType.values().length];
            try {
                iArr[Experiment.Variant.VariantType.HOLDOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Experiment.Variant.VariantType.TREATMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.rule_logic.RuleLogic$evaluateRules$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.presentation.rule_logic.RuleLogic", f = "RuleLogic.kt", i = {0}, l = {50}, m = "evaluateRules", n = {"this"}, s = {"L$0"})
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
            return RuleLogic.this.evaluateRules(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.rule_logic.RuleLogic$findMatchingRule$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.paywall.presentation.rule_logic.RuleLogic", f = "RuleLogic.kt", i = {0, 0, 0}, l = {121}, m = "findMatchingRule", n = {w.I0, "expressionEvaluator", "unmatchedRules"}, s = {"L$0", "L$1", "L$2"})
    static final class C26911 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C26911(kotlin.coroutines.d<? super C26911> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RuleLogic.this.findMatchingRule(null, null, this);
        }
    }

    public RuleLogic(@NotNull Assignments assignments, @NotNull LocalStorage storage, @NotNull RuleAttributesFactory factory, @NotNull ExpressionEvaluating ruleEvaluator) {
        Intrinsics.checkNotNullParameter(assignments, "assignments");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(ruleEvaluator, "ruleEvaluator");
        this.assignments = assignments;
        this.storage = storage;
        this.factory = factory;
        this.ruleEvaluator = ruleEvaluator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:18:0x0074  */
    /* JADX WARN: Code duplicated, block: B:20:0x008e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x008f  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x008f -> B:12:0x0048). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object findMatchingRule(com.superwall.sdk.models.events.EventData r8, com.superwall.sdk.models.triggers.Trigger r9, kotlin.coroutines.d<? super com.superwall.sdk.paywall.presentation.rule_logic.RuleMatchOutcome> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.superwall.sdk.paywall.presentation.rule_logic.RuleLogic.C26911
            if (r0 == 0) goto L18
            r0 = r10
            r0 = r10
            r6 = 3
            com.superwall.sdk.paywall.presentation.rule_logic.RuleLogic$findMatchingRule$1 r0 = (com.superwall.sdk.paywall.presentation.rule_logic.RuleLogic.C26911) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 3
            r3 = r1 & r2
            if (r3 == 0) goto L18
            r6 = 4
            int r1 = r1 - r2
            r6 = 6
            r0.label = r1
            goto L1d
        L18:
            com.superwall.sdk.paywall.presentation.rule_logic.RuleLogic$findMatchingRule$1 r0 = new com.superwall.sdk.paywall.presentation.rule_logic.RuleLogic$findMatchingRule$1
            r0.<init>(r10)
        L1d:
            java.lang.Object r10 = r0.result
            r6 = 5
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r6 = 5
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L55
            if (r2 != r3) goto L4b
            r6 = 1
            java.lang.Object r7 = r0.L$3
            r6 = 3
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r8 = r0.L$2
            r6 = 2
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r0.L$1
            com.superwall.sdk.paywall.presentation.rule_logic.expression_evaluator.ExpressionEvaluating r9 = (com.superwall.sdk.paywall.presentation.rule_logic.expression_evaluator.ExpressionEvaluating) r9
            java.lang.Object r2 = r0.L$0
            r6 = 5
            com.superwall.sdk.models.events.EventData r2 = (com.superwall.sdk.models.events.EventData) r2
            r6 = 5
            kotlin.ResultKt.m(r10)
            r5 = r0
            r0 = r9
            r0 = r9
            r9 = r2
        L48:
            r2 = r5
            r2 = r5
            goto L95
        L4b:
            r6 = 7
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r6 = 5
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L55:
            kotlin.ResultKt.m(r10)
            com.superwall.sdk.paywall.presentation.rule_logic.expression_evaluator.ExpressionEvaluating r7 = r7.ruleEvaluator
            java.util.ArrayList r10 = new java.util.ArrayList
            r6 = 1
            r10.<init>()
            java.util.List r9 = r9.getRules()
            r6 = 5
            java.util.Iterator r9 = r9.iterator()
            r5 = r10
            r10 = r7
            r7 = r9
            r9 = r8
            r8 = r5
        L6e:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto Lc1
            java.lang.Object r2 = r7.next()
            r6 = 3
            com.superwall.sdk.models.triggers.TriggerRule r2 = (com.superwall.sdk.models.triggers.TriggerRule) r2
            r6 = 3
            r0.L$0 = r9
            r0.L$1 = r10
            r0.L$2 = r8
            r0.L$3 = r7
            r6 = 4
            r0.label = r3
            java.lang.Object r2 = r10.evaluateExpression(r2, r9, r0)
            r6 = 0
            if (r2 != r1) goto L8f
            return r1
        L8f:
            r5 = r0
            r0 = r10
            r10 = r2
            r10 = r2
            r6 = 6
            goto L48
        L95:
            com.superwall.sdk.models.triggers.TriggerRuleOutcome r10 = (com.superwall.sdk.models.triggers.TriggerRuleOutcome) r10
            r6 = 0
            boolean r4 = r10 instanceof com.superwall.sdk.models.triggers.TriggerRuleOutcome.Match
            if (r4 == 0) goto La9
            com.superwall.sdk.paywall.presentation.rule_logic.RuleMatchOutcome$Matched r7 = new com.superwall.sdk.paywall.presentation.rule_logic.RuleMatchOutcome$Matched
            com.superwall.sdk.models.triggers.TriggerRuleOutcome$Match r10 = (com.superwall.sdk.models.triggers.TriggerRuleOutcome.Match) r10
            com.superwall.sdk.models.triggers.MatchedItem r8 = r10.getMatchedItem()
            r7.<init>(r8)
            r6 = 1
            return r7
        La9:
            r6 = 7
            boolean r4 = r10 instanceof com.superwall.sdk.models.triggers.TriggerRuleOutcome.NoMatch
            if (r4 == 0) goto Lbb
            r6 = 7
            com.superwall.sdk.models.triggers.TriggerRuleOutcome$NoMatch r10 = (com.superwall.sdk.models.triggers.TriggerRuleOutcome.NoMatch) r10
            com.superwall.sdk.models.triggers.UnmatchedRule r10 = r10.getUnmatchedRule()
            r8.add(r10)
            r10 = r0
            r0 = r2
            goto L6e
        Lbb:
            kotlin.k0 r7 = new kotlin.k0
            r7.<init>()
            throw r7
        Lc1:
            com.superwall.sdk.paywall.presentation.rule_logic.RuleMatchOutcome$NoMatchingRules r7 = new com.superwall.sdk.paywall.presentation.rule_logic.RuleMatchOutcome$NoMatchingRules
            r7.<init>(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.paywall.presentation.rule_logic.RuleLogic.findMatchingRule(com.superwall.sdk.models.events.EventData, com.superwall.sdk.models.triggers.Trigger, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Nullable
    public final Object evaluateRules(@NotNull EventData eventData, @NotNull Map<String, Trigger> map, @NotNull kotlin.coroutines.d<? super Either<RuleEvaluationOutcome, Throwable>> dVar) {
        AnonymousClass1 anonymousClass1;
        RuleEvaluationOutcome ruleEvaluationOutcome;
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
        Object objFindMatchingRule = anonymousClass1.result;
        Object objL = b.l();
        int i11 = anonymousClass1.label;
        try {
            if (i11 == 0) {
                ResultKt.m(objFindMatchingRule);
                Trigger trigger = map.get(eventData.getName());
                if (trigger == null) {
                    ruleEvaluationOutcome = new RuleEvaluationOutcome(null, null, InternalTriggerResult.PlacementNotFound.INSTANCE, 3, null);
                } else {
                    anonymousClass1.L$0 = this;
                    anonymousClass1.label = 1;
                    objFindMatchingRule = findMatchingRule(eventData, trigger, anonymousClass1);
                    if (objFindMatchingRule == objL) {
                        return objL;
                    }
                }
                return new Either.Success(ruleEvaluationOutcome);
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (RuleLogic) anonymousClass1.L$0;
            ResultKt.m(objFindMatchingRule);
            RuleMatchOutcome ruleMatchOutcome = (RuleMatchOutcome) objFindMatchingRule;
            if (ruleMatchOutcome instanceof RuleMatchOutcome.Matched) {
                MatchedItem item = ((RuleMatchOutcome.Matched) ruleMatchOutcome).getItem();
                TriggerRule rule = item.getRule();
                Map<String, Experiment.Variant> confirmedAssignments = this.storage.getConfirmedAssignments();
                Experiment.Variant variant = confirmedAssignments.get(rule.getExperiment().getId());
                if (variant == null && (variant = this.assignments.getUnconfirmedAssignments().get(rule.getExperiment().getId())) == null) {
                    ruleEvaluationOutcome = new RuleEvaluationOutcome(null, null, new InternalTriggerResult.Error(new PaywallNotFoundException()), 3, null);
                } else {
                    ConfirmableAssignment confirmableAssignment = !confirmedAssignments.values().contains(variant) ? new ConfirmableAssignment(rule.getExperiment().getId(), variant) : null;
                    int i12 = WhenMappings.$EnumSwitchMapping$0[variant.getType().ordinal()];
                    if (i12 == 1) {
                        ruleEvaluationOutcome = new RuleEvaluationOutcome(confirmableAssignment, item.getUnsavedOccurrence(), new InternalTriggerResult.Holdout(new Experiment(rule.getExperiment().getId(), rule.getExperiment().getGroupId(), variant)));
                    } else {
                        if (i12 != 2) {
                            throw new k0();
                        }
                        ruleEvaluationOutcome = new RuleEvaluationOutcome(confirmableAssignment, item.getUnsavedOccurrence(), new InternalTriggerResult.Paywall(new Experiment(rule.getExperiment().getId(), rule.getExperiment().getGroupId(), variant)));
                    }
                }
            } else {
                if (!(ruleMatchOutcome instanceof RuleMatchOutcome.NoMatchingRules)) {
                    throw new k0();
                }
                ruleEvaluationOutcome = new RuleEvaluationOutcome(null, null, new InternalTriggerResult.NoAudienceMatch(((RuleMatchOutcome.NoMatchingRules) ruleMatchOutcome).getUnmatchedRules()), 3, null);
            }
            return new Either.Success(ruleEvaluationOutcome);
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
}
