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
public final class SuperwallDelegateAdapter {

    @Nullable
    private SuperwallDelegateJava javaDelegate;

    @Nullable
    private SuperwallDelegate kotlinDelegate;

    public final void didDismissPaywall(@NotNull PaywallInfo paywallInfo) {
        Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
        SuperwallDelegate superwallDelegate = this.kotlinDelegate;
        if (superwallDelegate != null) {
            superwallDelegate.didDismissPaywall(paywallInfo);
            return;
        }
        SuperwallDelegateJava superwallDelegateJava = this.javaDelegate;
        if (superwallDelegateJava != null) {
            superwallDelegateJava.didDismissPaywall(paywallInfo);
        }
    }

    public final void didPresentPaywall(@NotNull PaywallInfo paywallInfo) {
        Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
        SuperwallDelegate superwallDelegate = this.kotlinDelegate;
        if (superwallDelegate != null) {
            superwallDelegate.didPresentPaywall(paywallInfo);
            return;
        }
        SuperwallDelegateJava superwallDelegateJava = this.javaDelegate;
        if (superwallDelegateJava != null) {
            superwallDelegateJava.didPresentPaywall(paywallInfo);
        }
    }

    public final void didRedeemLink(@NotNull RedemptionResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        SuperwallDelegate superwallDelegate = this.kotlinDelegate;
        if (superwallDelegate != null) {
            superwallDelegate.didRedeemLink(result);
            return;
        }
        SuperwallDelegateJava superwallDelegateJava = this.javaDelegate;
        if (superwallDelegateJava != null) {
            superwallDelegateJava.didRedeemLink(result);
        }
    }

    @Nullable
    public final SuperwallDelegateJava getJavaDelegate() {
        return this.javaDelegate;
    }

    @Nullable
    public final SuperwallDelegate getKotlinDelegate() {
        return this.kotlinDelegate;
    }

    public final void handleCustomPaywallAction(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        SuperwallDelegate superwallDelegate = this.kotlinDelegate;
        if (superwallDelegate != null) {
            superwallDelegate.handleCustomPaywallAction(name);
            return;
        }
        SuperwallDelegateJava superwallDelegateJava = this.javaDelegate;
        if (superwallDelegateJava != null) {
            superwallDelegateJava.handleCustomPaywallAction(name);
        }
    }

    public final void handleLog(@NotNull String level, @NotNull String scope, @Nullable String str, @Nullable Map<String, ? extends Object> map, @Nullable Throwable th2) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(scope, "scope");
        SuperwallDelegate superwallDelegate = this.kotlinDelegate;
        if (superwallDelegate != null) {
            superwallDelegate.handleLog(level, scope, str, map, th2);
            return;
        }
        SuperwallDelegateJava superwallDelegateJava = this.javaDelegate;
        if (superwallDelegateJava != null) {
            superwallDelegateJava.handleLog(level, scope, str, map, th2);
        }
    }

    public final void handleSuperwallEvent(@NotNull SuperwallEventInfo eventInfo) {
        Intrinsics.checkNotNullParameter(eventInfo, "eventInfo");
        SuperwallDelegate superwallDelegate = this.kotlinDelegate;
        if (superwallDelegate != null) {
            superwallDelegate.handleSuperwallEvent(eventInfo);
            return;
        }
        SuperwallDelegateJava superwallDelegateJava = this.javaDelegate;
        if (superwallDelegateJava != null) {
            superwallDelegateJava.handleSuperwallEvent(eventInfo);
        }
    }

    public final void paywallWillOpenDeepLink(@NotNull Uri url) {
        Intrinsics.checkNotNullParameter(url, "url");
        SuperwallDelegate superwallDelegate = this.kotlinDelegate;
        if (superwallDelegate != null) {
            superwallDelegate.paywallWillOpenDeepLink(url);
            return;
        }
        SuperwallDelegateJava superwallDelegateJava = this.javaDelegate;
        if (superwallDelegateJava != null) {
            superwallDelegateJava.paywallWillOpenDeepLink(url);
        }
    }

    public final void paywallWillOpenURL(@NotNull URI url) {
        Intrinsics.checkNotNullParameter(url, "url");
        SuperwallDelegate superwallDelegate = this.kotlinDelegate;
        if (superwallDelegate != null) {
            superwallDelegate.paywallWillOpenURL(url);
            return;
        }
        SuperwallDelegateJava superwallDelegateJava = this.javaDelegate;
        if (superwallDelegateJava != null) {
            superwallDelegateJava.paywallWillOpenURL(url);
        }
    }

    public final void setJavaDelegate(@Nullable SuperwallDelegateJava superwallDelegateJava) {
        this.javaDelegate = superwallDelegateJava;
    }

    public final void setKotlinDelegate(@Nullable SuperwallDelegate superwallDelegate) {
        this.kotlinDelegate = superwallDelegate;
    }

    public final void subscriptionStatusDidChange(@NotNull com.superwall.sdk.models.entitlements.SubscriptionStatus from, @NotNull com.superwall.sdk.models.entitlements.SubscriptionStatus to) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        SuperwallDelegate superwallDelegate = this.kotlinDelegate;
        if (superwallDelegate != null) {
            superwallDelegate.subscriptionStatusDidChange(from, to);
            return;
        }
        SuperwallDelegateJava superwallDelegateJava = this.javaDelegate;
        if (superwallDelegateJava != null) {
            superwallDelegateJava.subscriptionStatusDidChange(from, to);
        }
    }

    public final void willDismissPaywall(@NotNull PaywallInfo paywallInfo) {
        Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
        SuperwallDelegate superwallDelegate = this.kotlinDelegate;
        if (superwallDelegate != null) {
            superwallDelegate.willDismissPaywall(paywallInfo);
            return;
        }
        SuperwallDelegateJava superwallDelegateJava = this.javaDelegate;
        if (superwallDelegateJava != null) {
            superwallDelegateJava.willDismissPaywall(paywallInfo);
        }
    }

    public final void willPresentPaywall(@NotNull PaywallInfo paywallInfo) {
        Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
        SuperwallDelegate superwallDelegate = this.kotlinDelegate;
        if (superwallDelegate != null) {
            superwallDelegate.willPresentPaywall(paywallInfo);
            return;
        }
        SuperwallDelegateJava superwallDelegateJava = this.javaDelegate;
        if (superwallDelegateJava != null) {
            superwallDelegateJava.willPresentPaywall(paywallInfo);
        }
    }

    public final void willRedeemLink() {
        SuperwallDelegate superwallDelegate = this.kotlinDelegate;
        if (superwallDelegate != null) {
            superwallDelegate.willRedeemLink();
            return;
        }
        SuperwallDelegateJava superwallDelegateJava = this.javaDelegate;
        if (superwallDelegateJava != null) {
            superwallDelegateJava.willRedeemLink();
        }
    }
}
