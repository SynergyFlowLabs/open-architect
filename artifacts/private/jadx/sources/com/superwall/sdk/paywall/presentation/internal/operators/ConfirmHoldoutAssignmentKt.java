package com.superwall.sdk.paywall.presentation.internal.operators;

import com.superwall.sdk.Superwall;
import com.superwall.sdk.dependencies.DependencyContainer;
import com.superwall.sdk.models.assignment.ConfirmableAssignment;
import com.superwall.sdk.models.triggers.InternalTriggerResult;
import com.superwall.sdk.paywall.presentation.internal.PresentationRequest;
import com.superwall.sdk.paywall.presentation.internal.PresentationRequestType;
import com.superwall.sdk.paywall.presentation.rule_logic.RuleEvaluationOutcome;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class ConfirmHoldoutAssignmentKt {
    public static final void confirmHoldoutAssignment(@NotNull Superwall superwall, @NotNull PresentationRequest request, @NotNull RuleEvaluationOutcome rulesOutcome, @Nullable DependencyContainer dependencyContainer) {
        ConfirmableAssignment confirmableAssignment;
        Intrinsics.checkNotNullParameter(superwall, "<this>");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(rulesOutcome, "rulesOutcome");
        if (dependencyContainer == null) {
            dependencyContainer = superwall.getDependencyContainer$superwall_release();
        }
        if (Intrinsics.areEqual(request.getFlags().getType(), PresentationRequestType.GetImplicitPresentationResult.INSTANCE) || !(rulesOutcome.getTriggerResult() instanceof InternalTriggerResult.Holdout) || (confirmableAssignment = rulesOutcome.getConfirmableAssignment()) == null) {
            return;
        }
        dependencyContainer.getAssignments$superwall_release().confirmAssignment(confirmableAssignment);
    }

    public static /* synthetic */ void confirmHoldoutAssignment$default(Superwall superwall, PresentationRequest presentationRequest, RuleEvaluationOutcome ruleEvaluationOutcome, DependencyContainer dependencyContainer, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            dependencyContainer = null;
        }
        confirmHoldoutAssignment(superwall, presentationRequest, ruleEvaluationOutcome, dependencyContainer);
    }
}
