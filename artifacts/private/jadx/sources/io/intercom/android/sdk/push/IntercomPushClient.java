package io.intercom.android.sdk.push;

import android.app.Application;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.internal.w0;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.push.IntercomPushClientHandler;
import io.intercom.android.sdk.utilities.ContextLocaliser;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class IntercomPushClient {
    public static final int $stable = 8;

    @NotNull
    private final IntercomPushClientHandler pushHandler;

    @NotNull
    private final Twig twig;

    public IntercomPushClient(@NotNull Twig twig, @NotNull IntercomPushClientHandler pushHandler) {
        Intrinsics.checkNotNullParameter(twig, "twig");
        Intrinsics.checkNotNullParameter(pushHandler, "pushHandler");
        this.twig = twig;
        this.pushHandler = pushHandler;
    }

    private final Bundle convertMessageMapToBundle(Map<String, String> map) {
        Bundle bundle = new Bundle(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    public final void handlePush(@NotNull Application application, @NotNull Bundle message) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(message, "message");
        if (!isIntercomPush(message)) {
            this.twig.i("The message passed to handlePush() was not an Intercom push message.", new Object[0]);
            return;
        }
        Injector.initIfCachedCredentials(application);
        if (Injector.isNotInitialised()) {
            this.twig.w("Push not handled because Intercom is not initialised", new Object[0]);
            return;
        }
        Injector injector = Injector.get();
        Context contextCreateLocalisedContext = new ContextLocaliser(injector.getAppConfigProvider()).createLocalisedContext(application);
        IntercomPushClientHandler.Companion companion = IntercomPushClientHandler.Companion;
        Intrinsics.checkNotNull(contextCreateLocalisedContext);
        companion.setUpNotificationChannels(contextCreateLocalisedContext);
        IntercomPushClientHandler intercomPushClientHandler = this.pushHandler;
        UserIdentity userIdentity = injector.getUserIdentity();
        Intrinsics.checkNotNullExpressionValue(userIdentity, "getUserIdentity(...)");
        IntercomPushClientHandler.handlePush$default(intercomPushClientHandler, message, contextCreateLocalisedContext, userIdentity, null, 8, null);
    }

    public final void handlePushWithCustomStack(@NotNull Application application, @NotNull Bundle message, @NotNull TaskStackBuilder customStack) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(customStack, "customStack");
        if (!isIntercomPush(message)) {
            this.twig.i("The message passed to handlePush() was not an Intercom push message.", new Object[0]);
            return;
        }
        Injector.initIfCachedCredentials(application);
        if (Injector.isNotInitialised()) {
            this.twig.w("Push not handled because Intercom is not initialised", new Object[0]);
            return;
        }
        Injector injector = Injector.get();
        Context contextCreateLocalisedContext = new ContextLocaliser(injector.getAppConfigProvider()).createLocalisedContext(application);
        IntercomPushClientHandler.Companion companion = IntercomPushClientHandler.Companion;
        Intrinsics.checkNotNull(contextCreateLocalisedContext);
        companion.setUpNotificationChannels(contextCreateLocalisedContext);
        IntercomPushClientHandler intercomPushClientHandler = this.pushHandler;
        UserIdentity userIdentity = injector.getUserIdentity();
        Intrinsics.checkNotNullExpressionValue(userIdentity, "getUserIdentity(...)");
        intercomPushClientHandler.handlePush(message, contextCreateLocalisedContext, userIdentity, customStack);
    }

    public final boolean isIntercomPush(@NotNull Bundle message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return this.pushHandler.isIntercomPush(message);
    }

    public final void sendTokenToIntercom(@NotNull Application application, @NotNull String token) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(token, "token");
        if (StringsKt.w3(token)) {
            this.twig.e("sendTokenToIntercom() was called with a null or empty token. This user will not receive push notifications until a valid device token is sent.", new Object[0]);
            return;
        }
        Injector.initIfCachedCredentials(application);
        if (Injector.isNotInitialised()) {
            this.twig.w("Token not sent because Intercom is not initialised", new Object[0]);
            return;
        }
        Injector injector = Injector.get();
        if (this.pushHandler.shouldSendDeviceToken(application, token)) {
            IntercomPushClientHandler intercomPushClientHandler = this.pushHandler;
            Api api = injector.getApi();
            Intrinsics.checkNotNullExpressionValue(api, "getApi(...)");
            UserIdentity userIdentity = injector.getUserIdentity();
            Intrinsics.checkNotNullExpressionValue(userIdentity, "getUserIdentity(...)");
            Provider<AppConfig> appConfigProvider = injector.getAppConfigProvider();
            Intrinsics.checkNotNullExpressionValue(appConfigProvider, "getAppConfigProvider(...)");
            intercomPushClientHandler.sendTokenToIntercom(application, token, api, userIdentity, appConfigProvider);
        }
    }

    public final boolean isIntercomPush(@NotNull Map<String, String> message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return isIntercomPush(convertMessageMapToBundle(message));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IntercomPushClient() {
        Twig logger = LumberMill.getLogger();
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(...)");
        this(logger, new IntercomPushClientHandler());
    }

    public final void handlePush(@NotNull Application application, @NotNull Map<String, String> message) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(message, "message");
        handlePush(application, convertMessageMapToBundle(message));
    }

    public final void handlePushWithCustomStack(@NotNull Application application, @NotNull Map<String, String> message, @NotNull TaskStackBuilder customStack) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(customStack, "customStack");
        handlePushWithCustomStack(application, convertMessageMapToBundle(message), customStack);
    }
}
