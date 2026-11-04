package com.superwall.sdk.paywall.presentation.rule_logic.cel;

import com.superwall.sdk.Superwall;
import com.superwall.sdk.dependencies.RuleAttributesFactory;
import com.superwall.sdk.misc.Either;
import com.superwall.sdk.misc.IOScope;
import com.superwall.sdk.misc.ScopesKt;
import com.superwall.sdk.models.events.EventData;
import com.superwall.sdk.models.triggers.TriggerRule;
import com.superwall.sdk.models.triggers.TriggerRuleOutcome;
import com.superwall.sdk.models.triggers.UnmatchedRule;
import com.superwall.sdk.paywall.presentation.rule_logic.UtilsKt;
import com.superwall.sdk.paywall.presentation.rule_logic.expression_evaluator.ExpressionEvaluating;
import com.superwall.sdk.storage.core_data.CoreDataManager;
import com.superwall.sdk.utilities.ErrorTrackingKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.s0;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class SuperscriptEvaluator implements ExpressionEvaluating {

    @NotNull
    private final RuleAttributesFactory factory;

    @NotNull
    private final SuperscriptHostContext hostContext;

    @NotNull
    private final IOScope ioScope;

    @NotNull
    private final Json json;

    @NotNull
    private final CoreDataManager storage;

    public static final class NotError extends Throwable {

        @NotNull
        private final String string;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotError(@NotNull String string) {
            super(string);
            Intrinsics.checkNotNullParameter(string, "string");
            this.string = string;
        }

        @NotNull
        public final String getString() {
            return this.string;
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.rule_logic.cel.SuperscriptEvaluator$evaluateExpression$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.presentation.rule_logic.cel.SuperscriptEvaluator", f = "SuperscriptEvaluator.kt", i = {1, 1, 2, 2}, l = {61, 65, 113}, m = "evaluateExpression", n = {"this", "rule", "this", "rule"}, s = {"L$0", "L$1", "L$0", "L$1"})
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
            return SuperscriptEvaluator.this.evaluateExpression(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.rule_logic.cel.SuperscriptEvaluator$evaluateExpression$2, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.presentation.rule_logic.cel.SuperscriptEvaluator$evaluateExpression$2", f = "SuperscriptEvaluator.kt", i = {}, l = {66, 104}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nSuperscriptEvaluator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuperscriptEvaluator.kt\ncom/superwall/sdk/paywall/presentation/rule_logic/cel/SuperscriptEvaluator$evaluateExpression$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n+ 4 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,233:1\n1187#2,2:234\n1261#2,4:236\n1187#2,2:240\n1261#2,4:242\n113#3:246\n147#4:247\n*S KotlinDebug\n*F\n+ 1 SuperscriptEvaluator.kt\ncom/superwall/sdk/paywall/presentation/rule_logic/cel/SuperscriptEvaluator$evaluateExpression$2\n*L\n75#1:234,2\n75#1:236,4\n79#1:240,2\n79#1:242,4\n84#1:246\n87#1:247\n*E\n"})
    static final class AnonymousClass2 extends o implements Function2<s0, kotlin.coroutines.d<? super TriggerRuleOutcome>, Object> {
        final /* synthetic */ EventData $eventData;
        final /* synthetic */ TriggerRule $rule;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(EventData eventData, TriggerRule triggerRule, kotlin.coroutines.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$eventData = eventData;
            this.$rule = triggerRule;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return SuperscriptEvaluator.this.new AnonymousClass2(this.$eventData, this.$rule, dVar);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: E */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x01b2, code lost:
        
            if (r15 == r0) goto L33;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) throws E, com.superwall.supercel.InternalException {
            /*
                Method dump skipped, instruction units count: 470
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.paywall.presentation.rule_logic.cel.SuperscriptEvaluator.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super TriggerRuleOutcome> dVar) {
            return ((AnonymousClass2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public SuperscriptEvaluator(@NotNull Json json, @NotNull IOScope ioScope, @NotNull CoreDataManager storage, @NotNull RuleAttributesFactory factory, @NotNull SuperscriptHostContext hostContext) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(ioScope, "ioScope");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(hostContext, "hostContext");
        this.json = json;
        this.ioScope = ioScope;
        this.storage = storage;
        this.factory = factory;
        this.hostContext = hostContext;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00af  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Instruction removed from duplicated block: B:37:0x00c1, please report this as an issue */
    @Override // com.superwall.sdk.paywall.presentation.rule_logic.expression_evaluator.ExpressionEvaluating
    @Nullable
    public Object evaluateExpression(@NotNull TriggerRule triggerRule, @Nullable EventData eventData, @NotNull kotlin.coroutines.d<? super TriggerRuleOutcome> dVar) {
        AnonymousClass1 anonymousClass1;
        TriggerRule triggerRule2;
        Either either;
        TriggerRuleOutcome triggerRuleOutcome;
        Throwable notError;
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
        Object objAsyncWithTracking = anonymousClass1.result;
        Object objL = b.l();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            ResultKt.m(objAsyncWithTracking);
            if (triggerRule.getExpressionCEL() == null) {
                CoreDataManager coreDataManager = this.storage;
                anonymousClass1.label = 1;
                Object objTryToMatchOccurrence = UtilsKt.tryToMatchOccurrence(triggerRule, coreDataManager, true, anonymousClass1);
                if (objTryToMatchOccurrence != objL) {
                    return objTryToMatchOccurrence;
                }
            } else {
                IOScope iOScope = this.ioScope;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(eventData, triggerRule, null);
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = triggerRule;
                anonymousClass1.label = 2;
                objAsyncWithTracking = ScopesKt.asyncWithTracking(iOScope, anonymousClass2, anonymousClass1);
                if (objAsyncWithTracking != objL) {
                }
            }
            return objL;
        }
        if (i11 == 1) {
            ResultKt.m(objAsyncWithTracking);
            return objAsyncWithTracking;
        }
        if (i11 == 2) {
            triggerRule = (TriggerRule) anonymousClass1.L$1;
            this = (SuperscriptEvaluator) anonymousClass1.L$0;
            ResultKt.m(objAsyncWithTracking);
        } else {
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            triggerRule2 = (TriggerRule) anonymousClass1.L$1;
            ResultKt.m(objAsyncWithTracking);
        }
        either = (Either) objAsyncWithTracking;
        triggerRuleOutcome = (TriggerRuleOutcome) either.getSuccess();
        if (triggerRuleOutcome == null) {
            return triggerRuleOutcome;
        }
        if (either.getThrowable() != null) {
            notError = either.getThrowable();
            Intrinsics.checkNotNull(notError, "null cannot be cast to non-null type kotlin.Throwable");
        } else {
            notError = new NotError("Unknown error " + either.getThrowable());
        }
        ErrorTrackingKt.trackError(Superwall.Companion.getInstance(), notError);
        return TriggerRuleOutcome.Companion.noMatch(UnmatchedRule.Source.EXPRESSION, triggerRule2.getExperiment().getId());
        anonymousClass1.L$0 = this;
        anonymousClass1.L$1 = triggerRule;
        anonymousClass1.label = 3;
        objAsyncWithTracking = ((a1) objAsyncWithTracking).q(anonymousClass1);
        if (objAsyncWithTracking != objL) {
            triggerRule2 = triggerRule;
            either = (Either) objAsyncWithTracking;
            triggerRuleOutcome = (TriggerRuleOutcome) either.getSuccess();
            if (triggerRuleOutcome == null) {
                return triggerRuleOutcome;
            }
            if (either.getThrowable() != null) {
                notError = either.getThrowable();
                Intrinsics.checkNotNull(notError, "null cannot be cast to non-null type kotlin.Throwable");
            } else {
                notError = new NotError("Unknown error " + either.getThrowable());
            }
            ErrorTrackingKt.trackError(Superwall.Companion.getInstance(), notError);
            return TriggerRuleOutcome.Companion.noMatch(UnmatchedRule.Source.EXPRESSION, triggerRule2.getExperiment().getId());
        }
        return objL;
    }

    public /* synthetic */ SuperscriptEvaluator(Json json, IOScope iOScope, CoreDataManager coreDataManager, RuleAttributesFactory ruleAttributesFactory, SuperscriptHostContext superscriptHostContext, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(json, iOScope, coreDataManager, ruleAttributesFactory, (i10 & 16) != 0 ? new SuperscriptHostContext(json, coreDataManager) : superscriptHostContext);
    }
}
