package com.superwall.sdk.analytics.superwall;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.enums.a;
import kotlin.enums.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public enum SuperwallEvents {
    FirstSeen("first_seen"),
    AppOpen(FirebaseAnalytics.c.f120619e),
    AppLaunch("app_launch"),
    AppInstall("app_install"),
    SessionStart("session_start"),
    AppClose("app_close"),
    DeepLink("deepLink_open"),
    TriggerFire("trigger_fire"),
    PaywallOpen("paywall_open"),
    PaywallClose("paywall_close"),
    PaywallDecline("paywall_decline"),
    TransactionStart("transaction_start"),
    TransactionFail("transaction_fail"),
    TransactionAbandon("transaction_abandon"),
    TransactionComplete("transaction_complete"),
    TransactionRestore("transaction_restore"),
    TransactionTimeout("transaction_timeout"),
    SubscriptionStart("subscription_start"),
    SurveyResponse("survey_response"),
    SurveyClose("survey_close"),
    SubscriptionStatusDidChange("subscriptionStatus_didChange"),
    FreeTrialStart("freeTrial_start"),
    UserAttributes("user_attributes"),
    NonRecurringProductPurchase("nonRecurringProduct_purchase"),
    PaywallResponseLoadStart("paywallResponseLoad_start"),
    PaywallResponseLoadNotFound("paywallResponseLoad_notFound"),
    PaywallResponseLoadFail("paywallResponseLoad_fail"),
    PaywallResponseLoadComplete("paywallResponseLoad_complete"),
    PaywallWebviewLoadStart("paywallWebviewLoad_start"),
    PaywallWebviewLoadFail("paywallWebviewLoad_fail"),
    PaywallWebviewLoadComplete("paywallWebviewLoad_complete"),
    PaywallWebviewLoadTimeout("paywallWebviewLoad_timeout"),
    PaywallWebviewLoadFallback("paywallWebviewLoad_fallback"),
    PaywallResourceLoadFail("paywallResourceLoad_fail"),
    PaywallProductsLoadStart("paywallProductsLoad_start"),
    PaywallProductsLoadFail("paywallProductsLoad_fail"),
    PaywallProductsLoadComplete("paywallProductsLoad_complete"),
    PaywallPresentationRequest("paywallPresentationRequest"),
    RestoreStart("restore_start"),
    RestoreFail("restore_fail"),
    RestoreComplete("restore_complete"),
    CustomPlacement("custom_placement"),
    ShimmerViewStart("shimmerView_start"),
    ShimmerViewComplete("shimmerView_complete"),
    ConfigAttributes("config_attributes"),
    ConfirmAllAssignments("confirm_all_assignments"),
    ConfigFail("config_fail"),
    RedemptionStart("redemption_start"),
    RedemptionComplete("redemption_complete"),
    RedemptionFail("redemption_fail");

    private static final /* synthetic */ a $ENTRIES = c.c(values());

    @NotNull
    private final String rawName;

    SuperwallEvents(String str) {
        this.rawName = str;
    }

    @NotNull
    public static a<SuperwallEvents> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getRawName() {
        return this.rawName;
    }
}
