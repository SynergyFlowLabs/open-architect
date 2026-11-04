package io.intercom.android.sdk.m5.conversation.reducers;

import io.intercom.android.sdk.m5.conversation.states.ConversationUiState;
import io.intercom.android.sdk.m5.conversation.states.LaunchMode;
import io.intercom.android.sdk.m5.conversation.states.TopAppBarUiState;
import io.intercom.android.sdk.ui.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class InitialStateReducerKt {
    @NotNull
    public static final ConversationUiState.Loading reduceInitialState(@NotNull LaunchMode launchMode) {
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        TopAppBarUiState topAppBarUiState = TopAppBarUiState.Companion.getDefault();
        return new ConversationUiState.Loading(topAppBarUiState.m188copyN4y9b34((32765 & 1) != 0 ? topAppBarUiState.title : null, (32765 & 2) != 0 ? topAppBarUiState.navIcon : Integer.valueOf(launchMode == LaunchMode.PROGRAMMATIC ? R.drawable.intercom_ic_close : R.drawable.intercom_ic_back), (32765 & 4) != 0 ? topAppBarUiState.subTitle : null, (32765 & 8) != 0 ? topAppBarUiState.subTitleLeadingIcon : null, (32765 & 16) != 0 ? topAppBarUiState.avatars : null, (32765 & 32) != 0 ? topAppBarUiState.displayActiveIndicator : false, (32765 & 64) != 0 ? topAppBarUiState.ticketStatusState : null, (32765 & 128) != 0 ? topAppBarUiState.headerMenuItems : null, (32765 & 256) != 0 ? topAppBarUiState.backgroundColor : null, (32765 & 512) != 0 ? topAppBarUiState.backgroundColorDark : null, (32765 & 1024) != 0 ? topAppBarUiState.contentColor : null, (32765 & 2048) != 0 ? topAppBarUiState.contentColorDark : null, (32765 & 4096) != 0 ? topAppBarUiState.subTitleColor : null, (32765 & 8192) != 0 ? topAppBarUiState.subTitleColorDark : null, (32765 & 16384) != 0 ? topAppBarUiState.pushNotificationsBannerState : null));
    }
}
