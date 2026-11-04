package com.superwall.sdk.paywall.presentation.rule_logic.expression_evaluator;

import com.superwall.sdk.paywall.presentation.rule_logic.cel.SuperscriptEvaluator;
import com.superwall.sdk.storage.LocalStorage;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class CombinedExpressionEvaluator implements ExpressionEvaluating {

    @NotNull
    private final LocalStorage storage;

    @NotNull
    private final SuperscriptEvaluator superscriptEvaluator;

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.rule_logic.expression_evaluator.CombinedExpressionEvaluator$evaluateExpression$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.presentation.rule_logic.expression_evaluator.CombinedExpressionEvaluator", f = "CombinedExpressionEvaluator.kt", i = {1}, l = {28, 35}, m = "evaluateExpression", n = {"rule"}, s = {"L$0"})
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
            return CombinedExpressionEvaluator.this.evaluateExpression(null, null, this);
        }
    }

    public CombinedExpressionEvaluator(@NotNull LocalStorage storage, @NotNull SuperscriptEvaluator superscriptEvaluator) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(superscriptEvaluator, "superscriptEvaluator");
        this.storage = storage;
        this.superscriptEvaluator = superscriptEvaluator;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
    
        if (r9 == r1) goto L32;
     */
    @Override // com.superwall.sdk.paywall.presentation.rule_logic.expression_evaluator.ExpressionEvaluating
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object evaluateExpression(@org.jetbrains.annotations.NotNull com.superwall.sdk.models.triggers.TriggerRule r7, @org.jetbrains.annotations.Nullable com.superwall.sdk.models.events.EventData r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super com.superwall.sdk.models.triggers.TriggerRuleOutcome> r9) {
        /*
            r6 = this;
            java.lang.String r5 = "Androeed.ru"
            boolean r0 = r9 instanceof com.superwall.sdk.paywall.presentation.rule_logic.expression_evaluator.CombinedExpressionEvaluator.AnonymousClass1
            if (r0 == 0) goto L17
            r0 = r9
            com.superwall.sdk.paywall.presentation.rule_logic.expression_evaluator.CombinedExpressionEvaluator$evaluateExpression$1 r0 = (com.superwall.sdk.paywall.presentation.rule_logic.expression_evaluator.CombinedExpressionEvaluator.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            r5 = 1
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r5 = 5
            r0.label = r1
            goto L1e
        L17:
            r5 = 2
            com.superwall.sdk.paywall.presentation.rule_logic.expression_evaluator.CombinedExpressionEvaluator$evaluateExpression$1 r0 = new com.superwall.sdk.paywall.presentation.rule_logic.expression_evaluator.CombinedExpressionEvaluator$evaluateExpression$1
            r5 = 7
            r0.<init>(r9)
        L1e:
            java.lang.Object r9 = r0.result
            r5 = 5
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r5 = 2
            r3 = 2
            r5 = 6
            r4 = 1
            if (r2 == 0) goto L49
            r5 = 3
            if (r2 == r4) goto L45
            if (r2 != r3) goto L3c
            r5 = 5
            java.lang.Object r6 = r0.L$0
            r7 = r6
            com.superwall.sdk.models.triggers.TriggerRule r7 = (com.superwall.sdk.models.triggers.TriggerRule) r7
            kotlin.ResultKt.m(r9)     // Catch: java.lang.Exception -> L84
            goto L80
        L3c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r5 = 1
            r6.<init>(r7)
            throw r6
        L45:
            kotlin.ResultKt.m(r9)
            return r9
        L49:
            r5 = 6
            kotlin.ResultKt.m(r9)
            r5 = 2
            java.lang.String r9 = r7.getExpressionJs()
            if (r9 != 0) goto L72
            java.lang.String r9 = r7.getExpression()
            if (r9 != 0) goto L72
            java.lang.String r9 = r7.getExpressionCEL()
            r5 = 4
            if (r9 != 0) goto L72
            com.superwall.sdk.storage.LocalStorage r6 = r6.storage
            com.superwall.sdk.storage.core_data.CoreDataManager r6 = r6.getCoreDataManager()
            r0.label = r4
            java.lang.Object r6 = com.superwall.sdk.paywall.presentation.rule_logic.UtilsKt.tryToMatchOccurrence(r7, r6, r4, r0)
            r5 = 3
            if (r6 != r1) goto L71
            goto L7f
        L71:
            return r6
        L72:
            com.superwall.sdk.paywall.presentation.rule_logic.cel.SuperscriptEvaluator r6 = r6.superscriptEvaluator     // Catch: java.lang.Exception -> L84
            r0.L$0 = r7     // Catch: java.lang.Exception -> L84
            r0.label = r3     // Catch: java.lang.Exception -> L84
            r5 = 6
            java.lang.Object r9 = r6.evaluateExpression(r7, r8, r0)     // Catch: java.lang.Exception -> L84
            if (r9 != r1) goto L80
        L7f:
            return r1
        L80:
            com.superwall.sdk.models.triggers.TriggerRuleOutcome r9 = (com.superwall.sdk.models.triggers.TriggerRuleOutcome) r9     // Catch: java.lang.Exception -> L84
            r5 = 6
            return r9
        L84:
            r5 = 6
            com.superwall.sdk.models.triggers.TriggerRuleOutcome$Companion r6 = com.superwall.sdk.models.triggers.TriggerRuleOutcome.Companion
            com.superwall.sdk.models.triggers.UnmatchedRule$Source r8 = com.superwall.sdk.models.triggers.UnmatchedRule.Source.EXPRESSION
            com.superwall.sdk.models.triggers.RawExperiment r7 = r7.getExperiment()
            r5 = 3
            java.lang.String r7 = r7.getId()
            com.superwall.sdk.models.triggers.TriggerRuleOutcome r6 = r6.noMatch(r8, r7)
            r5 = 7
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.paywall.presentation.rule_logic.expression_evaluator.CombinedExpressionEvaluator.evaluateExpression(com.superwall.sdk.models.triggers.TriggerRule, com.superwall.sdk.models.events.EventData, kotlin.coroutines.d):java.lang.Object");
    }
}
