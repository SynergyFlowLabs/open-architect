package com.superwall.sdk.paywall.presentation.rule_logic.cel;

import com.facebook.internal.z0;
import com.superwall.sdk.dependencies.RuleAttributesFactory;
import com.superwall.sdk.models.config.ComputedPropertyRequest;
import com.superwall.sdk.models.events.EventData;
import com.superwall.sdk.models.triggers.TriggerRule;
import com.superwall.sdk.models.triggers.TriggerRuleOutcome;
import com.superwall.sdk.models.triggers.UnmatchedRule;
import com.superwall.sdk.paywall.presentation.rule_logic.UtilsKt;
import com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.CELAtom;
import com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.CELExpression;
import com.superwall.sdk.paywall.presentation.rule_logic.expression_evaluator.ExpressionEvaluating;
import com.superwall.sdk.storage.core_data.CoreDataManager;
import com.superwall.supercel.CELKt;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nASTEvaluator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ASTEvaluator.kt\ncom/superwall/sdk/paywall/presentation/rule_logic/cel/ASTEvaluator\n+ 2 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n*L\n1#1,100:1\n113#2:101\n*S KotlinDebug\n*F\n+ 1 ASTEvaluator.kt\ncom/superwall/sdk/paywall/presentation/rule_logic/cel/ASTEvaluator\n*L\n51#1:101\n*E\n"})
public final class ASTEvaluator implements ExpressionEvaluating {

    @NotNull
    private final RuleAttributesFactory factory;

    @NotNull
    private final Json json;

    @NotNull
    private final CoreDataManager storage;

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.rule_logic.cel.ASTEvaluator$evaluateExpression$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.presentation.rule_logic.cel.ASTEvaluator", f = "ASTEvaluator.kt", i = {0, 0}, l = {38, 53}, m = "evaluateExpression", n = {"this", "rule"}, s = {"L$0", "L$1"})
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
            return ASTEvaluator.this.evaluateExpression(null, null, this);
        }
    }

    public ASTEvaluator(@NotNull Json json, @NotNull CoreDataManager storage, @NotNull RuleAttributesFactory factory) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.json = json;
        this.storage = storage;
        this.factory = factory;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    @Override // com.superwall.sdk.paywall.presentation.rule_logic.expression_evaluator.ExpressionEvaluating
    @Nullable
    public Object evaluateExpression(@NotNull TriggerRule triggerRule, @Nullable EventData eventData, @NotNull kotlin.coroutines.d<? super TriggerRuleOutcome> dVar) {
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
        Object objMakeRuleAttributes = anonymousClass1.result;
        Object objL = b.l();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            ResultKt.m(objMakeRuleAttributes);
            TriggerRuleOutcome.Companion.noMatch(UnmatchedRule.Source.EXPRESSION, triggerRule.getExperiment().getId());
            RuleAttributesFactory ruleAttributesFactory = this.factory;
            List<ComputedPropertyRequest> computedPropertyRequests = triggerRule.getComputedPropertyRequests();
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = triggerRule;
            anonymousClass1.label = 1;
            objMakeRuleAttributes = ruleAttributesFactory.makeRuleAttributes(eventData, computedPropertyRequests, anonymousClass1);
            if (objMakeRuleAttributes != objL) {
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objMakeRuleAttributes);
            return objMakeRuleAttributes;
        }
        triggerRule = (TriggerRule) anonymousClass1.L$1;
        this = (ASTEvaluator) anonymousClass1.L$0;
        ResultKt.m(objMakeRuleAttributes);
        SuperscriptEvaluatorKt.toPassableValue((Map) objMakeRuleAttributes);
        CELExpression.And and = new CELExpression.And(new CELExpression.Atom(new CELAtom.Bool(true)), new CELExpression.Atom(new CELAtom.Bool(true)));
        Json json = this.json;
        json.getSerializersModule();
        if (!Intrinsics.areEqual(CELKt.evaluateAst(json.encodeToString(CELExpression.Companion.serializer(), and)), z0.P)) {
            return TriggerRuleOutcome.Companion.noMatch(UnmatchedRule.Source.EXPRESSION, triggerRule.getExperiment().getId());
        }
        CoreDataManager coreDataManager = this.storage;
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.label = 2;
        Object objTryToMatchOccurrence = UtilsKt.tryToMatchOccurrence(triggerRule, coreDataManager, true, anonymousClass1);
        return objTryToMatchOccurrence == objL ? objL : objTryToMatchOccurrence;
    }
}
