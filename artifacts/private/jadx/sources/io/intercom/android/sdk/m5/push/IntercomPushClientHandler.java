package io.intercom.android.sdk.m5.push;

import android.app.TaskStackBuilder;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.internal.w0;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.user.DeviceData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class IntercomPushClientHandler {
    private final Twig twig = LumberMill.getLogger();

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void clear(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            IntercomNotificationHandler.INSTANCE.clear(context);
        }

        public final void setUpNotificationChannels(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            IntercomNotificationHandler.INSTANCE.setUpNotificationChannels$intercom_sdk_base_release(context);
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void handlePush$default(IntercomPushClientHandler intercomPushClientHandler, Bundle bundle, Context context, UserIdentity userIdentity, TaskStackBuilder taskStackBuilder, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            taskStackBuilder = null;
        }
        intercomPushClientHandler.handlePush(bundle, context, userIdentity, taskStackBuilder);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (kotlin.text.StringsKt.w3(r1) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean hasUserHashIfNeeded(io.intercom.android.sdk.identity.UserIdentity r2, io.intercom.android.sdk.identity.AppConfig r3) {
        /*
            r1 = this;
            boolean r1 = r3.isReceivedFromServer()
            r0 = 0
            if (r1 == 0) goto L2c
            boolean r1 = r3.isIdentityVerificationEnabled()
            r0 = 4
            if (r1 == 0) goto L29
            boolean r1 = r3.isIdentityVerificationEnabled()
            if (r1 == 0) goto L2c
            java.lang.String r1 = r2.getHmac()
            r0 = 3
            java.lang.String r2 = "gas)Hc...(tm"
            java.lang.String r2 = "getHmac(...)"
            r0 = 4
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r0 = 4
            boolean r1 = kotlin.text.StringsKt.w3(r1)
            r0 = 2
            if (r1 != 0) goto L2c
        L29:
            r1 = 1
            r0 = 6
            return r1
        L2c:
            r0 = 5
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.push.IntercomPushClientHandler.hasUserHashIfNeeded(io.intercom.android.sdk.identity.UserIdentity, io.intercom.android.sdk.identity.AppConfig):boolean");
    }

    public final void handlePush(@NotNull Bundle message, @NotNull Context localisedContext, @NotNull UserIdentity userIdentity, @Nullable TaskStackBuilder taskStackBuilder) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(localisedContext, "localisedContext");
        Intrinsics.checkNotNullParameter(userIdentity, "userIdentity");
        IntercomPushData intercomPushDataCreateFrom = IntercomPushData.Companion.createFrom(localisedContext, message);
        if (intercomPushDataCreateFrom == null) {
            this.twig.i("This is not an Intercom push message", new Object[0]);
        } else if (userIdentity.identityExists()) {
            IntercomNotificationHandler.processIntercomPushNotification$intercom_sdk_base_release$default(IntercomNotificationHandler.INSTANCE, localisedContext, intercomPushDataCreateFrom, taskStackBuilder, null, 8, null);
        } else {
            this.twig.i("Can't create push message as we have no user identity. This can be caused by messages being sent to a logged out user.", new Object[0]);
            IntercomNotificationHandler.INSTANCE.clear(localisedContext);
        }
    }

    public final boolean isIntercomPush(@NotNull Bundle message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return IntercomPushData.Companion.isIntercomPush(message);
    }

    public final void sendTokenToIntercom(@NotNull Context context, @NotNull String token, @NotNull Api api, @NotNull UserIdentity userIdentity, @NotNull Provider<AppConfig> appConfigProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(userIdentity, "userIdentity");
        Intrinsics.checkNotNullParameter(appConfigProvider, "appConfigProvider");
        if (userIdentity.identityExists()) {
            AppConfig appConfig = appConfigProvider.get();
            Intrinsics.checkNotNullExpressionValue(appConfig, "get(...)");
            if (hasUserHashIfNeeded(userIdentity, appConfig)) {
                api.setDeviceToken(token);
            }
        }
        DeviceData.cacheDeviceToken(context, token);
    }

    public final boolean shouldSendDeviceToken(@NotNull Context context, @NotNull String token) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(token, "token");
        return !DeviceData.hasCachedDeviceToken(context, token);
    }
}
