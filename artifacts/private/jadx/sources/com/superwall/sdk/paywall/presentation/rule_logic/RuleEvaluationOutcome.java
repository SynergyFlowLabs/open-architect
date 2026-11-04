package com.superwall.sdk.paywall.presentation.rule_logic;

import com.superwall.sdk.models.assignment.ConfirmableAssignment;
import com.superwall.sdk.models.triggers.InternalTriggerResult;
import com.superwall.sdk.models.triggers.TriggerRuleOccurrence;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class RuleEvaluationOutcome {

    @Nullable
    private final ConfirmableAssignment confirmableAssignment;

    @NotNull
    private final InternalTriggerResult triggerResult;

    @Nullable
    private final TriggerRuleOccurrence unsavedOccurrence;

    public RuleEvaluationOutcome(@Nullable ConfirmableAssignment confirmableAssignment, @Nullable TriggerRuleOccurrence triggerRuleOccurrence, @NotNull InternalTriggerResult triggerResult) {
        Intrinsics.checkNotNullParameter(triggerResult, "triggerResult");
        this.confirmableAssignment = confirmableAssignment;
        this.unsavedOccurrence = triggerRuleOccurrence;
        this.triggerResult = triggerResult;
    }

    public static /* synthetic */ RuleEvaluationOutcome copy$default(RuleEvaluationOutcome ruleEvaluationOutcome, ConfirmableAssignment confirmableAssignment, TriggerRuleOccurrence triggerRuleOccurrence, InternalTriggerResult internalTriggerResult, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            confirmableAssignment = ruleEvaluationOutcome.confirmableAssignment;
        }
        if ((i10 & 2) != 0) {
            triggerRuleOccurrence = ruleEvaluationOutcome.unsavedOccurrence;
        }
        if ((i10 & 4) != 0) {
            internalTriggerResult = ruleEvaluationOutcome.triggerResult;
        }
        return ruleEvaluationOutcome.copy(confirmableAssignment, triggerRuleOccurrence, internalTriggerResult);
    }

    @Nullable
    public final ConfirmableAssignment component1() {
        return this.confirmableAssignment;
    }

    @Nullable
    public final TriggerRuleOccurrence component2() {
        return this.unsavedOccurrence;
    }

    @NotNull
    public final InternalTriggerResult component3() {
        return this.triggerResult;
    }

    @NotNull
    public final RuleEvaluationOutcome copy(@Nullable ConfirmableAssignment confirmableAssignment, @Nullable TriggerRuleOccurrence triggerRuleOccurrence, @NotNull InternalTriggerResult triggerResult) {
        Intrinsics.checkNotNullParameter(triggerResult, "triggerResult");
        return new RuleEvaluationOutcome(confirmableAssignment, triggerRuleOccurrence, triggerResult);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RuleEvaluationOutcome)) {
            return false;
        }
        RuleEvaluationOutcome ruleEvaluationOutcome = (RuleEvaluationOutcome) obj;
        return Intrinsics.areEqual(this.confirmableAssignment, ruleEvaluationOutcome.confirmableAssignment) && Intrinsics.areEqual(this.unsavedOccurrence, ruleEvaluationOutcome.unsavedOccurrence) && Intrinsics.areEqual(this.triggerResult, ruleEvaluationOutcome.triggerResult);
    }

    @Nullable
    public final ConfirmableAssignment getConfirmableAssignment() {
        return this.confirmableAssignment;
    }

    @NotNull
    public final InternalTriggerResult getTriggerResult() {
        return this.triggerResult;
    }

    @Nullable
    public final TriggerRuleOccurrence getUnsavedOccurrence() {
        return this.unsavedOccurrence;
    }

    public int hashCode() {
        ConfirmableAssignment confirmableAssignment = this.confirmableAssignment;
        int iHashCode = 0;
        int iHashCode2 = (confirmableAssignment == null ? 0 : confirmableAssignment.hashCode()) * 31;
        TriggerRuleOccurrence triggerRuleOccurrence = this.unsavedOccurrence;
        if (triggerRuleOccurrence != null) {
            iHashCode = triggerRuleOccurrence.hashCode();
        }
        return ((iHashCode2 + iHashCode) * 31) + this.triggerResult.hashCode();
    }

    @NotNull
    public String toString() {
        return "RuleEvaluationOutcome(confirmableAssignment=" + this.confirmableAssignment + ", unsavedOccurrence=" + this.unsavedOccurrence + ", triggerResult=" + this.triggerResult + ")";
    }

    public /* synthetic */ RuleEvaluationOutcome(ConfirmableAssignment confirmableAssignment, TriggerRuleOccurrence triggerRuleOccurrence, InternalTriggerResult internalTriggerResult, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : confirmableAssignment, (i10 & 2) != 0 ? null : triggerRuleOccurrence, internalTriggerResult);
    }
}
