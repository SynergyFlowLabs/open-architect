package com.superwall.sdk.delegate;

import android.net.Uri;
import com.superwall.sdk.analytics.superwall.SuperwallEventInfo;
import com.superwall.sdk.models.internal.RedemptionResult;
import com.superwall.sdk.paywall.presentation.PaywallInfo;
import java.net.URI;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface SuperwallDelegate {

    public static final class DefaultImpls {
        public static void didDismissPaywall(@NotNull SuperwallDelegate superwallDelegate, @NotNull PaywallInfo withInfo) {
            Intrinsics.checkNotNullParameter(withInfo, "withInfo");
        }

        public static void didPresentPaywall(@NotNull SuperwallDelegate superwallDelegate, @NotNull PaywallInfo withInfo) {
            Intrinsics.checkNotNullParameter(withInfo, "withInfo");
        }

        public static void didRedeemLink(@NotNull SuperwallDelegate superwallDelegate, @NotNull RedemptionResult result) {
            Intrinsics.checkNotNullParameter(result, "result");
        }

        public static void handleCustomPaywallAction(@NotNull SuperwallDelegate superwallDelegate, @NotNull String withName) {
            Intrinsics.checkNotNullParameter(withName, "withName");
        }

        public static void handleLog(@NotNull SuperwallDelegate superwallDelegate, @NotNull String level, @NotNull String scope, @Nullable String str, @Nullable Map<String, ? extends Object> map, @Nullable Throwable th2) {
            Intrinsics.checkNotNullParameter(level, "level");
            Intrinsics.checkNotNullParameter(scope, "scope");
        }

        public static void handleSuperwallEvent(@NotNull SuperwallDelegate superwallDelegate, @NotNull SuperwallEventInfo eventInfo) {
            Intrinsics.checkNotNullParameter(eventInfo, "eventInfo");
        }

        public static void paywallWillOpenDeepLink(@NotNull SuperwallDelegate superwallDelegate, @NotNull Uri url) {
            Intrinsics.checkNotNullParameter(url, "url");
        }

        public static void paywallWillOpenURL(@NotNull SuperwallDelegate superwallDelegate, @NotNull URI url) {
            Intrinsics.checkNotNullParameter(url, "url");
        }

        public static void subscriptionStatusDidChange(@NotNull SuperwallDelegate superwallDelegate, @NotNull com.superwall.sdk.models.entitlements.SubscriptionStatus from, @NotNull com.superwall.sdk.models.entitlements.SubscriptionStatus to) {
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(to, "to");
        }

        public static void willDismissPaywall(@NotNull SuperwallDelegate superwallDelegate, @NotNull PaywallInfo withInfo) {
            Intrinsics.checkNotNullParameter(withInfo, "withInfo");
        }

        public static void willPresentPaywall(@NotNull SuperwallDelegate superwallDelegate, @NotNull PaywallInfo withInfo) {
            Intrinsics.checkNotNullParameter(withInfo, "withInfo");
        }

        public static void willRedeemLink(@NotNull SuperwallDelegate superwallDelegate) {
        }
    }

    void didDismissPaywall(@NotNull PaywallInfo paywallInfo);

    void didPresentPaywall(@NotNull PaywallInfo paywallInfo);

    void didRedeemLink(@NotNull RedemptionResult redemptionResult);

    void handleCustomPaywallAction(@NotNull String str);

    void handleLog(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable Map<String, ? extends Object> map, @Nullable Throwable th2);

    void handleSuperwallEvent(@NotNull SuperwallEventInfo superwallEventInfo);

    void paywallWillOpenDeepLink(@NotNull Uri uri);

    void paywallWillOpenURL(@NotNull URI uri);

    void subscriptionStatusDidChange(@NotNull com.superwall.sdk.models.entitlements.SubscriptionStatus subscriptionStatus, @NotNull com.superwall.sdk.models.entitlements.SubscriptionStatus subscriptionStatus2);

    void willDismissPaywall(@NotNull PaywallInfo paywallInfo);

    void willPresentPaywall(@NotNull PaywallInfo paywallInfo);

    void willRedeemLink();
}
