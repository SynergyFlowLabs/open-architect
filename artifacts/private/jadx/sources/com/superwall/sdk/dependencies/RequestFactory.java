package com.superwall.sdk.dependencies;

import android.app.Activity;
import com.superwall.sdk.models.entitlements.SubscriptionStatus;
import com.superwall.sdk.models.events.EventData;
import com.superwall.sdk.paywall.presentation.internal.PresentationRequest;
import com.superwall.sdk.paywall.presentation.internal.PresentationRequestType;
import com.superwall.sdk.paywall.presentation.internal.request.PaywallOverrides;
import com.superwall.sdk.paywall.presentation.internal.request.PresentationInfo;
import com.superwall.sdk.paywall.request.PaywallRequest;
import com.superwall.sdk.paywall.request.ResponseIdentifiers;
import kotlinx.coroutines.flow.z0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface RequestFactory {

    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PresentationRequest makePresentationRequest$default(RequestFactory requestFactory, PresentationInfo presentationInfo, PaywallOverrides paywallOverrides, Activity activity, Boolean bool, z0 z0Var, boolean z10, PresentationRequestType presentationRequestType, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: makePresentationRequest");
            }
            if ((i10 & 2) != 0) {
                paywallOverrides = null;
            }
            if ((i10 & 4) != 0) {
                activity = null;
            }
            if ((i10 & 8) != 0) {
                bool = null;
            }
            if ((i10 & 16) != 0) {
                z0Var = null;
            }
            return requestFactory.makePresentationRequest(presentationInfo, paywallOverrides, activity, bool, z0Var, z10, presentationRequestType);
        }
    }

    @NotNull
    PaywallRequest makePaywallRequest(@Nullable EventData eventData, @NotNull ResponseIdentifiers responseIdentifiers, @Nullable PaywallRequest.Overrides overrides, boolean z10, @Nullable String str);

    @NotNull
    PresentationRequest makePresentationRequest(@NotNull PresentationInfo presentationInfo, @Nullable PaywallOverrides paywallOverrides, @Nullable Activity activity, @Nullable Boolean bool, @Nullable z0<? extends SubscriptionStatus> z0Var, boolean z10, @NotNull PresentationRequestType presentationRequestType);
}
