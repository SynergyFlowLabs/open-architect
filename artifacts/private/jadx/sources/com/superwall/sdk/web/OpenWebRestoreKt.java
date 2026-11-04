package com.superwall.sdk.web;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.superwall.sdk.Superwall;
import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import com.superwall.sdk.misc.ActivityProvider;
import com.superwall.sdk.models.config.Config;
import com.superwall.sdk.models.config.WebToAppConfig;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class OpenWebRestoreKt {
    public static final void openRestoreOnWeb(@NotNull Superwall superwall) {
        WebToAppConfig webToAppConfig;
        Activity currentActivity;
        Intrinsics.checkNotNullParameter(superwall, "<this>");
        Superwall.Companion companion = Superwall.Companion;
        Config config = companion.getInstance().getDependencyContainer$superwall_release().getConfigManager().getConfig();
        if (config == null || (webToAppConfig = config.getWebToAppConfig()) == null) {
            Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.webEntitlements, "Configuration not available - cannot restore purchases", null, null, 24, null);
            return;
        }
        ActivityProvider activityProvider = companion.getInstance().getDependencyContainer$superwall_release().getActivityProvider();
        if (activityProvider == null || (currentActivity = activityProvider.getCurrentActivity()) == null) {
            return;
        }
        currentActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(webToAppConfig.getRestoreAccesUrl())));
    }
}
