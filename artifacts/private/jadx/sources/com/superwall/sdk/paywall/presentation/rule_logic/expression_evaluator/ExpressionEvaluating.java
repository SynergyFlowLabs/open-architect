package com.superwall.sdk.paywall.presentation.rule_logic.expression_evaluator;

import com.superwall.sdk.models.events.EventData;
import com.superwall.sdk.models.triggers.TriggerRule;
import com.superwall.sdk.models.triggers.TriggerRuleOutcome;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface ExpressionEvaluating {
    @Nullable
    Object evaluateExpression(@NotNull TriggerRule triggerRule, @Nullable EventData eventData, @NotNull d<? super TriggerRuleOutcome> dVar);
}
