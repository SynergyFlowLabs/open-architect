package com.superwall.sdk.paywall.presentation.internal.operators;

import com.superwall.sdk.Superwall;
import com.superwall.sdk.dependencies.DependencyContainer;
import com.superwall.sdk.models.assignment.ConfirmableAssignment;
import com.superwall.sdk.paywall.presentation.internal.PresentationRequest;
import com.superwall.sdk.paywall.presentation.internal.PresentationRequestType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class ConfirmPaywallAssignmentKt {
    public static final void confirmPaywallAssignment(@NotNull Superwall superwall, @Nullable ConfirmableAssignment confirmableAssignment, @NotNull PresentationRequest request, boolean z10, @Nullable DependencyContainer dependencyContainer) {
        Intrinsics.checkNotNullParameter(superwall, "<this>");
        Intrinsics.checkNotNullParameter(request, "request");
        if (Intrinsics.areEqual(request.getFlags().getType(), PresentationRequestType.GetImplicitPresentationResult.INSTANCE)) {
            return;
        }
        if (dependencyContainer == null) {
            dependencyContainer = superwall.getDependencyContainer$superwall_release();
        }
        if (z10 || confirmableAssignment == null) {
            return;
        }
        dependencyContainer.getAssignments$superwall_release().confirmAssignment(confirmableAssignment);
    }

    public static /* synthetic */ void confirmPaywallAssignment$default(Superwall superwall, ConfirmableAssignment confirmableAssignment, PresentationRequest presentationRequest, boolean z10, DependencyContainer dependencyContainer, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            dependencyContainer = null;
        }
        confirmPaywallAssignment(superwall, confirmableAssignment, presentationRequest, z10, dependencyContainer);
    }
}
