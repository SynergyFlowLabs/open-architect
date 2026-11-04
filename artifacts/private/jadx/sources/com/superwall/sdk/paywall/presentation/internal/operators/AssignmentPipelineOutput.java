package com.superwall.sdk.paywall.presentation.internal.operators;

import com.superwall.sdk.models.assignment.ConfirmableAssignment;
import com.superwall.sdk.models.triggers.TriggerResult;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class AssignmentPipelineOutput {

    @Nullable
    private ConfirmableAssignment confirmableAssignment;

    @NotNull
    private final Map<String, Object> debugInfo;

    @NotNull
    private final TriggerResult triggerResult;

    public AssignmentPipelineOutput(@NotNull TriggerResult triggerResult, @Nullable ConfirmableAssignment confirmableAssignment, @NotNull Map<String, ? extends Object> debugInfo) {
        Intrinsics.checkNotNullParameter(triggerResult, "triggerResult");
        Intrinsics.checkNotNullParameter(debugInfo, "debugInfo");
        this.triggerResult = triggerResult;
        this.confirmableAssignment = confirmableAssignment;
        this.debugInfo = debugInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AssignmentPipelineOutput copy$default(AssignmentPipelineOutput assignmentPipelineOutput, TriggerResult triggerResult, ConfirmableAssignment confirmableAssignment, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            triggerResult = assignmentPipelineOutput.triggerResult;
        }
        if ((i10 & 2) != 0) {
            confirmableAssignment = assignmentPipelineOutput.confirmableAssignment;
        }
        if ((i10 & 4) != 0) {
            map = assignmentPipelineOutput.debugInfo;
        }
        return assignmentPipelineOutput.copy(triggerResult, confirmableAssignment, map);
    }

    @NotNull
    public final TriggerResult component1() {
        return this.triggerResult;
    }

    @Nullable
    public final ConfirmableAssignment component2() {
        return this.confirmableAssignment;
    }

    @NotNull
    public final Map<String, Object> component3() {
        return this.debugInfo;
    }

    @NotNull
    public final AssignmentPipelineOutput copy(@NotNull TriggerResult triggerResult, @Nullable ConfirmableAssignment confirmableAssignment, @NotNull Map<String, ? extends Object> debugInfo) {
        Intrinsics.checkNotNullParameter(triggerResult, "triggerResult");
        Intrinsics.checkNotNullParameter(debugInfo, "debugInfo");
        return new AssignmentPipelineOutput(triggerResult, confirmableAssignment, debugInfo);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssignmentPipelineOutput)) {
            return false;
        }
        AssignmentPipelineOutput assignmentPipelineOutput = (AssignmentPipelineOutput) obj;
        return Intrinsics.areEqual(this.triggerResult, assignmentPipelineOutput.triggerResult) && Intrinsics.areEqual(this.confirmableAssignment, assignmentPipelineOutput.confirmableAssignment) && Intrinsics.areEqual(this.debugInfo, assignmentPipelineOutput.debugInfo);
    }

    @Nullable
    public final ConfirmableAssignment getConfirmableAssignment() {
        return this.confirmableAssignment;
    }

    @NotNull
    public final Map<String, Object> getDebugInfo() {
        return this.debugInfo;
    }

    @NotNull
    public final TriggerResult getTriggerResult() {
        return this.triggerResult;
    }

    public int hashCode() {
        int iHashCode = this.triggerResult.hashCode() * 31;
        ConfirmableAssignment confirmableAssignment = this.confirmableAssignment;
        return ((iHashCode + (confirmableAssignment == null ? 0 : confirmableAssignment.hashCode())) * 31) + this.debugInfo.hashCode();
    }

    public final void setConfirmableAssignment(@Nullable ConfirmableAssignment confirmableAssignment) {
        this.confirmableAssignment = confirmableAssignment;
    }

    @NotNull
    public String toString() {
        return "AssignmentPipelineOutput(triggerResult=" + this.triggerResult + ", confirmableAssignment=" + this.confirmableAssignment + ", debugInfo=" + this.debugInfo + ")";
    }
}
