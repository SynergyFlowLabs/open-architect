package io.intercom.android.sdk.m5.conversation.states;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class PushNotificationsBannerState {
    public static final int $stable = 0;
    private final boolean askUsersToAllowNotifications;

    public PushNotificationsBannerState() {
        this(false, 1, null);
    }

    public static /* synthetic */ PushNotificationsBannerState copy$default(PushNotificationsBannerState pushNotificationsBannerState, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = pushNotificationsBannerState.askUsersToAllowNotifications;
        }
        return pushNotificationsBannerState.copy(z10);
    }

    public final boolean component1() {
        return this.askUsersToAllowNotifications;
    }

    @NotNull
    public final PushNotificationsBannerState copy(boolean z10) {
        return new PushNotificationsBannerState(z10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PushNotificationsBannerState) && this.askUsersToAllowNotifications == ((PushNotificationsBannerState) obj).askUsersToAllowNotifications;
    }

    public final boolean getAskUsersToAllowNotifications() {
        return this.askUsersToAllowNotifications;
    }

    public int hashCode() {
        return Boolean.hashCode(this.askUsersToAllowNotifications);
    }

    @NotNull
    public String toString() {
        return "PushNotificationsBannerState(askUsersToAllowNotifications=" + this.askUsersToAllowNotifications + ')';
    }

    public PushNotificationsBannerState(boolean z10) {
        this.askUsersToAllowNotifications = z10;
    }

    public /* synthetic */ PushNotificationsBannerState(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10);
    }
}
