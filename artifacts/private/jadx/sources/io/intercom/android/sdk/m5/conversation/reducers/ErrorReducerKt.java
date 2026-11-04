package io.intercom.android.sdk.m5.conversation.reducers;

import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiState;
import io.intercom.android.sdk.m5.conversation.states.TopAppBarUiState;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ErrorReducerKt {
    @NotNull
    public static final ConversationUiState reduceError(@NotNull NetworkResponse<? extends Object> networkResponse, @NotNull TopAppBarUiState topAppBarUiState) {
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        Intrinsics.checkNotNullParameter(topAppBarUiState, "topAppBarUiState");
        return ((networkResponse instanceof NetworkResponse.ClientError) || (networkResponse instanceof NetworkResponse.ServerError)) ? new ConversationUiState.Error(false, topAppBarUiState) : new ConversationUiState.Error(true, topAppBarUiState);
    }
}
