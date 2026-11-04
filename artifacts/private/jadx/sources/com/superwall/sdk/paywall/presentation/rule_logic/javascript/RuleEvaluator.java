package com.superwall.sdk.paywall.presentation.rule_logic.javascript;

import android.content.Context;
import com.superwall.sdk.paywall.presentation.rule_logic.expression_evaluator.ExpressionEvaluating;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface RuleEvaluator {

    public interface Factory {
        @Nullable
        Object provideRuleEvaluator(@NotNull Context context, @NotNull d<? super ExpressionEvaluating> dVar);
    }
}
