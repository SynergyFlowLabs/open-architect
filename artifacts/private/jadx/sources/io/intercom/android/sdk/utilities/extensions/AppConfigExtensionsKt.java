package io.intercom.android.sdk.utilities.extensions;

import io.intercom.android.sdk.identity.AppConfig;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class AppConfigExtensionsKt {
    public static final boolean canStartNewConversation(@NotNull AppConfig appConfig) {
        Intrinsics.checkNotNullParameter(appConfig, "<this>");
        boolean zIsInboundMessages = appConfig.isInboundMessages();
        if (appConfig.isPreventMultipleInboundConversationsEnabled()) {
            return zIsInboundMessages && !appConfig.getHasOpenConversations();
        }
        return zIsInboundMessages;
    }
}
