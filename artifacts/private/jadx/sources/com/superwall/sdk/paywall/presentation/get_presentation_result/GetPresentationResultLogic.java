package com.superwall.sdk.paywall.presentation.get_presentation_result;

import com.superwall.sdk.models.triggers.InternalTriggerResult;
import com.superwall.sdk.paywall.presentation.result.PresentationResult;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class GetPresentationResultLogic {

    @NotNull
    public static final GetPresentationResultLogic INSTANCE = new GetPresentationResultLogic();

    private GetPresentationResultLogic() {
    }

    @NotNull
    public final PresentationResult convertTriggerResult(@NotNull InternalTriggerResult triggerResult) {
        Intrinsics.checkNotNullParameter(triggerResult, "triggerResult");
        if (triggerResult instanceof InternalTriggerResult.PlacementNotFound) {
            return new PresentationResult.PlacementNotFound();
        }
        if (triggerResult instanceof InternalTriggerResult.Holdout) {
            return new PresentationResult.Holdout(((InternalTriggerResult.Holdout) triggerResult).getExperiment());
        }
        if (triggerResult instanceof InternalTriggerResult.Error) {
            return new PresentationResult.PaywallNotAvailable();
        }
        if (triggerResult instanceof InternalTriggerResult.NoAudienceMatch) {
            return new PresentationResult.NoAudienceMatch();
        }
        if (triggerResult instanceof InternalTriggerResult.Paywall) {
            return new PresentationResult.Paywall(((InternalTriggerResult.Paywall) triggerResult).getExperiment());
        }
        throw new k0();
    }
}
