package com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast;

import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface CELNode {
    @NotNull
    CELExpression mapAll(@NotNull Function1<? super CELExpression, ? extends CELExpression> function1);
}
