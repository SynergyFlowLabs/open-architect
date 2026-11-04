package io.intercom.android.sdk.m5.conversation.states;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.ui.common.StringProvider;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class CurrentlyTypingState {
    public static final int $stable = 8;

    @NotNull
    private final AvatarWrapper avatarWrapper;

    @NotNull
    private final StringProvider description;
    private final boolean showAvatar;

    @NotNull
    private final TypingIndicatorType userType;

    public CurrentlyTypingState(@NotNull AvatarWrapper avatarWrapper, boolean z10, @NotNull StringProvider description, @NotNull TypingIndicatorType userType) {
        Intrinsics.checkNotNullParameter(avatarWrapper, "avatarWrapper");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(userType, "userType");
        this.avatarWrapper = avatarWrapper;
        this.showAvatar = z10;
        this.description = description;
        this.userType = userType;
    }

    public static /* synthetic */ CurrentlyTypingState copy$default(CurrentlyTypingState currentlyTypingState, AvatarWrapper avatarWrapper, boolean z10, StringProvider stringProvider, TypingIndicatorType typingIndicatorType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            avatarWrapper = currentlyTypingState.avatarWrapper;
        }
        if ((i10 & 2) != 0) {
            z10 = currentlyTypingState.showAvatar;
        }
        if ((i10 & 4) != 0) {
            stringProvider = currentlyTypingState.description;
        }
        if ((i10 & 8) != 0) {
            typingIndicatorType = currentlyTypingState.userType;
        }
        return currentlyTypingState.copy(avatarWrapper, z10, stringProvider, typingIndicatorType);
    }

    @NotNull
    public final AvatarWrapper component1() {
        return this.avatarWrapper;
    }

    public final boolean component2() {
        return this.showAvatar;
    }

    @NotNull
    public final StringProvider component3() {
        return this.description;
    }

    @NotNull
    public final TypingIndicatorType component4() {
        return this.userType;
    }

    @NotNull
    public final CurrentlyTypingState copy(@NotNull AvatarWrapper avatarWrapper, boolean z10, @NotNull StringProvider description, @NotNull TypingIndicatorType userType) {
        Intrinsics.checkNotNullParameter(avatarWrapper, "avatarWrapper");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(userType, "userType");
        return new CurrentlyTypingState(avatarWrapper, z10, description, userType);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurrentlyTypingState)) {
            return false;
        }
        CurrentlyTypingState currentlyTypingState = (CurrentlyTypingState) obj;
        return Intrinsics.areEqual(this.avatarWrapper, currentlyTypingState.avatarWrapper) && this.showAvatar == currentlyTypingState.showAvatar && Intrinsics.areEqual(this.description, currentlyTypingState.description) && this.userType == currentlyTypingState.userType;
    }

    @NotNull
    public final AvatarWrapper getAvatarWrapper() {
        return this.avatarWrapper;
    }

    @NotNull
    public final StringProvider getDescription() {
        return this.description;
    }

    public final boolean getShowAvatar() {
        return this.showAvatar;
    }

    @NotNull
    public final TypingIndicatorType getUserType() {
        return this.userType;
    }

    public int hashCode() {
        return (((((this.avatarWrapper.hashCode() * 31) + Boolean.hashCode(this.showAvatar)) * 31) + this.description.hashCode()) * 31) + this.userType.hashCode();
    }

    @NotNull
    public String toString() {
        return "CurrentlyTypingState(avatarWrapper=" + this.avatarWrapper + ", showAvatar=" + this.showAvatar + ", description=" + this.description + ", userType=" + this.userType + ')';
    }

    public /* synthetic */ CurrentlyTypingState(AvatarWrapper avatarWrapper, boolean z10, StringProvider stringProvider, TypingIndicatorType typingIndicatorType, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? AvatarWrapper.Companion.getNULL() : avatarWrapper, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? new StringProvider.StringRes(R.string.intercom_thinking, null, 2, null) : stringProvider, typingIndicatorType);
    }
}
