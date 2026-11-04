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
public interface SuperwallDelegateJava {

    public static final class DefaultImpls {
        public static void didDismissPaywall(@NotNull SuperwallDelegateJava superwallDelegateJava, @NotNull PaywallInfo paywallInfo) {
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
        }

        public static void didPresentPaywall(@NotNull SuperwallDelegateJava superwallDelegateJava, @NotNull PaywallInfo paywallInfo) {
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
        }

        public static void didRedeemLink(@NotNull SuperwallDelegateJava superwallDelegateJava, @NotNull RedemptionResult result) {
            Intrinsics.checkNotNullParameter(result, "result");
        }

        public static void handleCustomPaywallAction(@NotNull SuperwallDelegateJava superwallDelegateJava, @NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
        }

        public static void handleLog(@NotNull SuperwallDelegateJava superwallDelegateJava, @NotNull String level, @NotNull String scope, @Nullable String str, @Nullable Map<String, ? extends Object> map, @Nullable Throwable th2) {
            Intrinsics.checkNotNullParameter(level, "level");
            Intrinsics.checkNotNullParameter(scope, "scope");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void handleLog$default(SuperwallDelegateJava superwallDelegateJava, String str, String str2, String str3, Map map, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleLog");
            }
            if ((i10 & 4) != 0) {
                str3 = null;
            }
            if ((i10 & 8) != 0) {
                map = null;
            }
            if ((i10 & 16) != 0) {
                th2 = null;
            }
            superwallDelegateJava.handleLog(str, str2, str3, map, th2);
        }

        public static void handleSuperwallEvent(@NotNull SuperwallDelegateJava superwallDelegateJava, @NotNull SuperwallEventInfo eventInfo) {
            Intrinsics.checkNotNullParameter(eventInfo, "eventInfo");
        }

        public static void paywallWillOpenDeepLink(@NotNull SuperwallDelegateJava superwallDelegateJava, @NotNull Uri url) {
            Intrinsics.checkNotNullParameter(url, "url");
        }

        public static void paywallWillOpenURL(@NotNull SuperwallDelegateJava superwallDelegateJava, @NotNull URI url) {
            Intrinsics.checkNotNullParameter(url, "url");
        }

        public static void subscriptionStatusDidChange(@NotNull SuperwallDelegateJava superwallDelegateJava, @NotNull com.superwall.sdk.models.entitlements.SubscriptionStatus from, @NotNull com.superwall.sdk.models.entitlements.SubscriptionStatus to) {
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(to, "to");
        }

        public static void willDismissPaywall(@NotNull SuperwallDelegateJava superwallDelegateJava, @NotNull PaywallInfo paywallInfo) {
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
        }

        public static void willPresentPaywall(@NotNull SuperwallDelegateJava superwallDelegateJava, @NotNull PaywallInfo paywallInfo) {
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
        }

        public static void willRedeemLink(@NotNull SuperwallDelegateJava superwallDelegateJava) {
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
