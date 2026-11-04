package io.intercom.android.sdk.user;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.IntercomStatusCallbackKt;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.api.UserUpdateRequest;
import io.intercom.android.sdk.api.UserUpdater;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.models.HostAppState;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class UserUpdaterHelper {
    public static final int $stable = 8;

    @NotNull
    private final IntercomDataLayer dataLayer;

    @NotNull
    private final Provider<UserIdentity> userIdentityProvider;

    @NotNull
    private final Provider<UserUpdater> userUpdaterProvider;

    public UserUpdaterHelper(@NotNull Provider<UserUpdater> userUpdaterProvider, @NotNull IntercomDataLayer dataLayer, @NotNull Provider<UserIdentity> userIdentityProvider) {
        Intrinsics.checkNotNullParameter(userUpdaterProvider, "userUpdaterProvider");
        Intrinsics.checkNotNullParameter(dataLayer, "dataLayer");
        Intrinsics.checkNotNullParameter(userIdentityProvider, "userIdentityProvider");
        this.userUpdaterProvider = userUpdaterProvider;
        this.dataLayer = dataLayer;
        this.userIdentityProvider = userIdentityProvider;
    }

    public final UserIdentity getUserIdentity() {
        return this.userIdentityProvider.get();
    }

    public final UserUpdater getUserUpdater() {
        return this.userUpdaterProvider.get();
    }

    public final void update(long j10) {
        HostAppState value = this.dataLayer.getHostAppState().getValue();
        if (j10 - value.getBackgroundedTimestamp() <= this.dataLayer.getConfig().getValue().getNewSessionThresholdMs() || !getUserIdentity().identityExists() || value.getSessionStartedSinceLastBackgrounded()) {
            return;
        }
        getUserUpdater().updateUser(UserUpdateRequest.create(true, value.isBackgrounded(), true), IntercomStatusCallbackKt.getNoStatusCallback());
    }
}
