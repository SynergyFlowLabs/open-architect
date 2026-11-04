package com.superwall.sdk.paywall.presentation;

import com.superwall.sdk.paywall.presentation.internal.PresentationRequest;
import com.superwall.sdk.paywall.presentation.internal.state.PaywallState;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.j0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class LastPresentationItems {

    @NotNull
    private final PresentationRequest request;

    @NotNull
    private final j0<PaywallState> statePublisher;

    public LastPresentationItems(@NotNull PresentationRequest request, @NotNull j0<PaywallState> statePublisher) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(statePublisher, "statePublisher");
        this.request = request;
        this.statePublisher = statePublisher;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LastPresentationItems copy$default(LastPresentationItems lastPresentationItems, PresentationRequest presentationRequest, j0 j0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            presentationRequest = lastPresentationItems.request;
        }
        if ((i10 & 2) != 0) {
            j0Var = lastPresentationItems.statePublisher;
        }
        return lastPresentationItems.copy(presentationRequest, j0Var);
    }

    @NotNull
    public final PresentationRequest component1() {
        return this.request;
    }

    @NotNull
    public final j0<PaywallState> component2() {
        return this.statePublisher;
    }

    @NotNull
    public final LastPresentationItems copy(@NotNull PresentationRequest request, @NotNull j0<PaywallState> statePublisher) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(statePublisher, "statePublisher");
        return new LastPresentationItems(request, statePublisher);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LastPresentationItems)) {
            return false;
        }
        LastPresentationItems lastPresentationItems = (LastPresentationItems) obj;
        return Intrinsics.areEqual(this.request, lastPresentationItems.request) && Intrinsics.areEqual(this.statePublisher, lastPresentationItems.statePublisher);
    }

    @NotNull
    public final PresentationRequest getRequest() {
        return this.request;
    }

    @NotNull
    public final j0<PaywallState> getStatePublisher() {
        return this.statePublisher;
    }

    public int hashCode() {
        return (this.request.hashCode() * 31) + this.statePublisher.hashCode();
    }

    @NotNull
    public String toString() {
        return "LastPresentationItems(request=" + this.request + ", statePublisher=" + this.statePublisher + ")";
    }
}
